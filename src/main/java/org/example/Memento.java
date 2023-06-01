package org.example;

class Memento {

    private byte[] cut;

    public Memento(byte[] cut) {
        this.cut = cut;
    }

    public byte[] getCut() {
        return cut;
    }
}
