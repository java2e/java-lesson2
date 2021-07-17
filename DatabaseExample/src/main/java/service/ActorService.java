package service;

import model.Actor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActorService extends DBService implements BaseService<Actor> {
    public Actor getById(Long id) {
        try {
            String sql = "select * from actor where actor_id=" + id;
            ResultSet resultSet = getResult(sql);
            Actor actor = new Actor();
            while (resultSet.next()) {
                actor = mapperActor(resultSet);
            }
            return actor;

        } catch (Exception ex) {

        }
        return null;
    }

    public List<Actor> getList() throws SQLException {
        String sql = "Select * from Actor";
        ResultSet resultSet = getResult(sql);
        List<Actor> liste = new ArrayList<Actor>();
        while (resultSet.next()) {
            Actor actor = mapperActor(resultSet);
            liste.add(actor);
        }
        return liste;
    }

    public Actor save(Actor actor) throws SQLException {

        String sql = "insert into actor(first_name,last_name) values('" + actor.getFirstName() + "','" + actor.getLastName() + "')";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int actorId = preparedStatement.executeUpdate();
        return null;
    }

    public void delete(Long id) throws SQLException {

        String sql = "delete from actor where actor_id=" + id;
        PreparedStatement statement = connection.prepareStatement(sql);
        boolean durum = statement.execute();
        return;

    }

    public void update(Actor actor) throws SQLException {

        String sql = "update actor set first_name='" + actor.getFirstName() + "', last_name='" + actor.getLastName() + "' where actor_id=" + actor.getActorId();
        PreparedStatement statement = connection.prepareStatement(sql);
        int durum = statement.executeUpdate();

    }

    public Actor mapperActor(ResultSet resultSet) throws SQLException {
        Long actorId = resultSet.getLong(1);
        String firstName = resultSet.getString(2);
        String lastName = resultSet.getString(3);
        Date updateDate = resultSet.getDate(4);
        Actor actor = new Actor();
        actor.setActorId(actorId);
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        actor.setUpdateDate(updateDate);

        return actor;
    }
}
