package src.by.bsuir.lab1.objects_and_classes.task11;

import src.by.bsuir.lab1.objects_and_classes.task10.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object o){
        return super.equals(o) && this.language == ((ProgrammerBook)o).language;        
    }    

    @Override
    public String toString(){
        return super.toString() + ", язык: " + this.language + ", уровень: " + this.level + ".";
    }

    @Override
    public int hashCode(){
        return super.hashCode() * this.language.hashCode();        
    }
}