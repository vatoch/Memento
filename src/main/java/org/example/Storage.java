package org.example;

import java.util.ArrayList;
import java.util.List;

class Storage {
    private List<Memento> mementos = new ArrayList<>();

    public void push(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento() {
        Memento memento = mementos.get(mementos.size() - 1);
        mementos.remove(mementos.size() - 1);
        return memento;
    }

}
