package hotel;
// options of behaviours in that system for users
abstract class Manage {


    public void addAdm() {

        System.out.println("An administrator's account has been added");
    }

    public void deleteAdm() {

        System.out.println("An administrator's account has been removed");
    }

    public void addGust() {

        System.out.println("An gust's account has been added");
    }

    public void deleteGust() {

        System.out.println("An gust's account has been removed");
    }
}
