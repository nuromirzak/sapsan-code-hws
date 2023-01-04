package sapsan0401.family_example;

import java.util.List;

public class Family {
    private Father father;
    private Mother mother;
    private List<Child> children;

    public Family() {
    }

    public Family(Father father, Mother mother, List<Child> children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                '}';
    }
}
