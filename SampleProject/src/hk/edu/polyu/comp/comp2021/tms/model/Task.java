package hk.edu.polyu.comp.comp2021.tms.model;

import java.util.LinkedList;

abstract class Task {
    String name;
    String description;
    double duration;
    double completion;
    LinkedList<Task> prerequisite;

    Task(){

    }

}