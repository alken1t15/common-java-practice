package TestForNike2;

class Cat extends Animal {
    private String name;

    public Cat(int legs) {
        super(legs);
        this.name = "Мурка";
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Кошки любят есть пауков и рыбок");
    }
}