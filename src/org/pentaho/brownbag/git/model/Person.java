package org.pentaho.brownbag.git.model;

public class Person extends Being{
    private boolean javaProgrammer;
    
    public boolean isJavaProgrammer(){
        return javaProgrammer;
    }
    public void setJavaProgrammer(boolean jp){
        this.javaProgrammer = jp;
    }
}
