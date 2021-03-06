package com.trutek.looped.data.impl.entities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trutek.looped.data.impl.entities.Notification;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NOTIFICATION".
*/
public class NotificationDao extends AbstractDao<Notification, Long> {

    public static final String TABLENAME = "NOTIFICATION";

    /**
     * Properties of entity Notification.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Subject = new Property(1, String.class, "subject", false, "SUBJECT");
        public final static Property Date = new Property(2, java.util.Date.class, "date", false, "DATE");
        public final static Property Message = new Property(3, String.class, "message", false, "MESSAGE");
        public final static Property Data = new Property(4, String.class, "data", false, "DATA");
        public final static Property ServerId = new Property(5, String.class, "serverId", false, "SERVER_ID");
        public final static Property TimeStamp = new Property(6, java.util.Date.class, "timeStamp", false, "TIME_STAMP");
        public final static Property SyncStatus = new Property(7, String.class, "syncStatus", false, "SYNC_STATUS");
    };


    public NotificationDao(DaoConfig config) {
        super(config);
    }
    
    public NotificationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NOTIFICATION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SUBJECT\" TEXT," + // 1: subject
                "\"DATE\" INTEGER," + // 2: date
                "\"MESSAGE\" TEXT," + // 3: message
                "\"DATA\" TEXT," + // 4: data
                "\"SERVER_ID\" TEXT," + // 5: serverId
                "\"TIME_STAMP\" INTEGER," + // 6: timeStamp
                "\"SYNC_STATUS\" TEXT);"); // 7: syncStatus
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NOTIFICATION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Notification entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String subject = entity.getSubject();
        if (subject != null) {
            stmt.bindString(2, subject);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(3, date.getTime());
        }
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(4, message);
        }
 
        String data = entity.getData();
        if (data != null) {
            stmt.bindString(5, data);
        }
 
        String serverId = entity.getServerId();
        if (serverId != null) {
            stmt.bindString(6, serverId);
        }
 
        java.util.Date timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(7, timeStamp.getTime());
        }
 
        String syncStatus = entity.getSyncStatus();
        if (syncStatus != null) {
            stmt.bindString(8, syncStatus);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Notification readEntity(Cursor cursor, int offset) {
        Notification entity = new Notification( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // subject
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // date
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // message
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // data
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // serverId
            cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)), // timeStamp
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // syncStatus
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Notification entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSubject(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDate(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setMessage(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setData(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setServerId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTimeStamp(cursor.isNull(offset + 6) ? null : new java.util.Date(cursor.getLong(offset + 6)));
        entity.setSyncStatus(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Notification entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Notification entity) {
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
