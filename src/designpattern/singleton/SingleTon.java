package designpattern.singleton;

class SingleTon {
    private static class singleInstanceHolder {
        private static final SingleTon INSTANCE = new SingleTon();
    }
    public static SingleTon getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

