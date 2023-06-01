package org.example;

public class Main {
    public static void main(String[] args) {

        // movie cut
        MovieCut cut = new MovieCut(new byte[5]);
        Storage storage = new Storage();
        // saving the current movie cut  in memento because we are about to change it
        Memento memento = new Memento(cut.getCut());
        storage.push(memento);
        cut.changeCut(new byte[6]);
        // actually we don't like the new movie cut so get back to previous state

        cut.changeCut(storage.getMemento().getCut());







    }
}