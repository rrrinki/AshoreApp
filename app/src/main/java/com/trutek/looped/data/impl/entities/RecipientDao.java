package com.trutek.looped.data.impl.entities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trutek.looped.data.impl.entities.Recipient;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECIPIENT".
*/
public class RecipientDao extends AbstractDao<Recipient, Long> {

    public static final String TABLENAME = "RECIPIENT";

    /**
     * Properties of entity Recipient.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Age = new Property(2, Integer.class, "age", false, "AGE");
        public final static Property Gender = new Property(3, String.class, "gender", false, "GENDER");
        public final static Property PicUrl = new Property(4, String.class, "picUrl", false, "PIC_URL");
        public final static Property JabberId = new Property(5, Long.class, "jabberId", false, "JABBER_ID");
        public final static Property ServerId = new Property(6, String.class, "serverId", false, "SERVER_ID");
        public final static Property TimeStamp = new Property(7, java.util.Date.class, "timeStamp", false, "TIME_STAMP");
        public final static Property SyncStatus = new Property(8, String.class, "syncStatus", false, "SYNC_STATUS");
    };

    private DaoSession daoSession;


    public RecipientDao(DaoConfig config) {
        super(config);
    }
    
    public RecipientDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECIPIENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"AGE\" INTEGER," + // 2: age
                "\"GENDER\" TEXT," + // 3: gender
                "\"PIC_URL\" TEXT," + // 4: picUrl
                "\"JABBER_ID\" INTEGER," + // 5: jabberId
                "\"SERVER_ID\" TEXT," + // 6: serverId
                "\"TIME_STAMP\" INTEGER," + // 7: timeStamp
                "\"SYNC_STATUS\" TEXT);"); // 8: syncStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECIPIENT\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Recipient entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        Integer age = entity.getAge();
        if (age != null) {
            stmt.bindLong(3, age);
        }
 
        String gender = entity.getGender();
        if (gender != null) {
            stmt.bindString(4, gender);
        }
 
        String picUrl = entity.getPicUrl();
        if (picUrl != null) {
            stmt.bindString(5, picUrl);
        }
 
        Long jabberId = entity.getJabberId();
        if (jabberId != null) {
            stmt.bindLong(6, jabberId);
        }
 
        String serverId = entity.getServerId();
        if (serverId != null) {
            stmt.bindString(7, serverId);
        }
 
        java.util.Date timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(8, timeStamp.getTime());
        }
 
        String syncStatus = entity.getSyncStatus();
        if (syncStatus != null) {
            stmt.bindString(9, syncStatus);
        }
    }

    @Override
    protected void attachEntity(Recipient entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Recipient readEntity(Cursor cursor, int offset) {
        Recipient entity = new Recipient( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // age
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // gender
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // picUrl
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // jabberId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // serverId
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // timeStamp
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // syncStatus
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Recipient entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAge(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setGender(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPicUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setJabberId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setServerId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTimeStamp(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setSyncStatus(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Recipient entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Recipient entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
