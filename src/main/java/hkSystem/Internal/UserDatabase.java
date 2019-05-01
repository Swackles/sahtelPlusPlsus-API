package hkSystem.Internal;

import java.sql.ResultSet;
import java.sql.SQLException;

class UserDatabase {
    User getByToken(String token) throws SQLException {
        Database db = new Database();
        db.execute("Select * FROM public.user WHERE token='" +token+ "' LIMIT 1");

        return AppendDataToUser(db.getResultSet());
    }

    User getByGoogleToken(String googleToken) throws SQLException {
        Database db = new Database();
        db.execute("Select * FROM public.user WHERE google_token='" +googleToken+ "' LIMIT 1");

        return AppendDataToUser(db.getResultSet());
    }

    User save(User user) throws SQLException {
        Database db = new Database();
        db.execute("INSERT INTO public.user (google_token, token) VALUES ('" +user.getGoogleToken()+ "', '" +user.getToken()+ "')");

        if (db.getUpdatedRows() < 1) throw new SQLException("Couldn't insert user to the database");

        user.setId(db.getGeneratedId());

        return user;
    }



    private User AppendDataToUser(ResultSet rs) throws SQLException {
        User user = new User();

        if (!rs.next()) {
            user.setAuth(false);
        } else {
            do {
                user.setId(rs.getInt("id"));
                user.setGoogleToken(rs.getString("google_token"));
                user.setToken(rs.getString("token"));
                user.setCreated(rs.getTimestamp("created"));
                user.setAuth(true);
            } while (rs.next());
        }

        return user;
    }
}
