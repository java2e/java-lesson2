import model.Actor;
import service.ActorService;

import java.util.List;

public class Test3 {
    /*

    Film
    CRUD
    Film
    Film Service kaydet sil listele getById

     */

    public static void main(String[] args) {

        try {

            ActorService actorService = new ActorService();
            Actor actor = actorService.getById(1L);

            System.out.println(actor);

            List<Actor> liste = actorService.getList();
            //Java 8 Lambda Expression
            liste.stream().forEach(a -> {
                System.out.println(a);
            });

            Actor actor1 = new Actor();
            actor1.setFirstName("JAVA");
            actor1.setLastName("Developer");

            actorService.save(actor1);

            actorService.delete(201L);

            Actor actor2 = new Actor();

            actor2.setActorId(202L);
            actor2.setFirstName("Test Update");
            actor2.setLastName("Update Last");

            actorService.update(actor2);


        } catch (Exception exx) {

        }

    }
}
