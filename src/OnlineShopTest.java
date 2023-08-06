public class OnlineShopTest {


    public static void main(String[] args) {
        Order order = new Order();
        order.userCheck();
        User user = order.getUser();

        System.out.println("환영, " + user.getName());
    }


}
