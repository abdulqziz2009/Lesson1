class Child2 extends AbstractParent {
    private String property2;

    public Child2(String name, int age, String property2) {
        super(name, age);
        this.property2 = property2;
    }

    @Override
    public void uniqueMethod() {
        System.out.println(getName() + " has property2: " + property2);
    }

    private String getName() {
        return null;
    }
}
