package com.directi.training.ocp.exercise;

public abstract class Resource {
    public abstract int allocate();
    public abstract void free(int resourceId);
}