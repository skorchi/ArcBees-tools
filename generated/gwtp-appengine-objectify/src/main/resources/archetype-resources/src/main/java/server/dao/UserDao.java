#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server.dao;

import ${package}.shared.domain.User;

public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }

    public User findByGoogleId(String googleId) {
        return ofy().query(User.class).filter("googleId =", googleId).first().get();
    }
}
