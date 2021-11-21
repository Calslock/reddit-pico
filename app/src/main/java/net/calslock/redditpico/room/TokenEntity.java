package net.calslock.redditpico.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tokens")
public class TokenEntity {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "login_token")
    public String token;
}
