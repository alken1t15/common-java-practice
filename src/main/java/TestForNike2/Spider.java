package TestForNike2;

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Паук ест мух");
    }
}