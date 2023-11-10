class Child1 extends AbstractParent {
    private String property1;

    public Child1(String name, int age, String property1) {
        super(name, age);
        this.property1 = property1;
    }

    @Override
    public void uniqueMethod() {
        System.out.println(getName() + " has property1: " + property1);
    }

    private String getName() {
        return null;
    }
}
