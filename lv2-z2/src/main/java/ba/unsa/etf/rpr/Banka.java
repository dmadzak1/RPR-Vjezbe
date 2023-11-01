package ba.unsa.etf.rpr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.random.RandomGenerator;

public class Banka {
    private Long brojRacuna;
    private List<Korisnik> korisnici;
    private List<Uposlenik> uposlenici;
    Banka(){
        brojRacuna = 0L;
        korisnici = new List<Korisnik>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Korisnik> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Korisnik korisnik) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Korisnik> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Korisnik> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Korisnik get(int index) {
                return null;
            }

            @Override
            public Korisnik set(int index, Korisnik element) {
                return null;
            }

            @Override
            public void add(int index, Korisnik element) {

            }

            @Override
            public Korisnik remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Korisnik> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Korisnik> listIterator(int index) {
                return null;
            }

            @Override
            public List<Korisnik> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        uposlenici=new List<Uposlenik>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Uposlenik> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Uposlenik uposlenik) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Uposlenik> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Uposlenik> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Uposlenik get(int index) {
                return null;
            }

            @Override
            public Uposlenik set(int index, Uposlenik element) {
                return null;
            }

            @Override
            public void add(int index, Uposlenik element) {

            }

            @Override
            public Uposlenik remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Uposlenik> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Uposlenik> listIterator(int index) {
                return null;
            }

            @Override
            public List<Uposlenik> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
    public Korisnik kreirajNovogKorisnika(String i,String p){
        Korisnik k=new Korisnik(i,p);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String i,String p){
        Uposlenik u=new Uposlenik(i,p);
        uposlenici.add(u);
        return u;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r=new Racun(1254522L,k);
        return r;
    }
}
