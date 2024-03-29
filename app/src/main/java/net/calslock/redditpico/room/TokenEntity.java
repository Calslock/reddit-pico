package net.calslock.redditpico.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tokens")
@SuppressWarnings("unused")
public class TokenEntity {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "login_token")
    public String token;

    public TokenEntity(int id, String token){
        this.id = id;
        this.token = token;
    }

    public TokenEntity(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
