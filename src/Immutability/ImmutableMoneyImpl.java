    package Immutability;

    public class ImmutableMoneyImpl {




        public static void main(String[] args) {
            System.out.println("===================");
            ImmutableMoney impl=  new ImmutableMoney(100,"INR");
            ImmutableMoney impl2 = impl.addMoney(30);
            ImmutableMoney impl3 = impl.subMoney(30);

            System.out.println("initially money is : "+impl);
            System.out.println("Second money is : "+impl2);
            System.out.println("Third money is : "+impl3);

        }
    }
