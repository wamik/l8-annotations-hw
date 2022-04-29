package kz.halyk.enums;

public enum Operation {
    SUM{
        public double action(double x, double y){ return x + y;}
    },
    SUBTRACT{
        public double action(double x, double y){ return x - y;}
    },
    MULTIPLY{
        public double action(double x, double y){ return x * y;}
    };

    public abstract double action(double x, double y);
}
