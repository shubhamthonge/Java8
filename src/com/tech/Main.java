package com.tech;
import java.util.*;

interface IFilm{}

class Film implements IFilm {
    String title, director;
    int year;
    Film(String t, String d, int y){title=t; director=d; year=y;}
}

interface IFilmLibrary {
    void addFilm(IFilm f);
    void removeFilm(String t);
    List<IFilm> searchFilms(String q);
    int getTotalFilmCount();
}

class FilmLibrary implements IFilmLibrary {
    List<IFilm> films=new ArrayList<>();
    public void addFilm(IFilm f) { films.add(f); }
    public void removeFilm(String t) { films.removeIf(f->((Film)f).title.equals(t)); }
    public List<IFilm> searchFilms(String q) {
        List<IFilm> r=new ArrayList<>();
        for(IFilm f:films) if(((Film)f).title.contains(q)||((Film)f).director.contains(q)) r.add(f);
        return r;
    }
    public int getTotalFilmCount() { return films.size(); }
}

public class Main {
    public static void main(String[] args) {
        FilmLibrary l = new FilmLibrary();
        l.addFilm(new Film("HarryPotter", "DavidYates", 2007));
        l.addFilm(new Film("TheLordOfTheRings", "PeterJackson", 2001));
        List<IFilm> s = l.searchFilms("DavidYates");
        for (IFilm f : s) System.out.println(((Film)f).title + " (" + ((Film)f).director + ", " + ((Film)f).year + ")");
        l.removeFilm("TheLordOfTheRings");
        System.out.println("Total Film Count: " + l.getTotalFilmCount());
    }
}
