package org.example;

import java.util.ArrayList;
import java.util.List;

public class MovieCut {
    private byte [] cut; // mp4


    public MovieCut(byte [] cut) {
        this.cut = cut;
    }

    public void changeCut(byte[] cut) {
        this.cut = cut;
    }

    public Memento save() {
        return new Memento(cut);
    }

    public byte[] getCut() {
        return cut;
    }

    public void restore(Memento memento) {
        this.cut = memento.getCut();
    }



}

