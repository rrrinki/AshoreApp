package com.trutek.looped.data.impl.entities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trutek.looped.data.impl.entities.DialogNotification;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DIALOG_NOTIFICATION".
*/
public class DialogNotificationDao extends AbstractDao<DialogNotification, Long> {

    public static final String TABLENAME = "DIALOG_NOTIFICATION";

    /**
     * Properties of entity DialogNotification.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NotificationId = new Property(1, String.class, "notificationId", false, "NOTIFICATION_ID");
        public final static Property DialogId = new Property(2, String.class, "dialogId", false, "DIALOG_ID");
        public final static Property State = new Property(3, String.class, "state", false, "STATE");
        public final static Property Body = new Property(4, String.class, "body", false, "BODY");
        public final static Property CreatedDate = new Property(5, Long.class, "createdDate", false, "CREATED_DATE");
        public final static Property Type = new Property(6, String.class, "type", false, "TYPE");
    };


    public DialogNotificationDao(DaoConfig config) {
        super(config);
    }
    
    public DialogNotificationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DIALOG_NOTIFICATION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NOTIFICATION_ID\" TEXT UNIQUE ," + // 1: notificationId
                "\"DIALOG_ID\" TEXT," + // 2: dialogId
                "\"STATE\" TEXT," + // 3: state
                "\"BODY\" TEXT," + // 4: body
                "\"CREATED_DATE\" INTEGER," + // 5: createdDate
                "\"TYPE\" TEXT);"); // 6: type
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DIALOG_NOTIFICATION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DialogNotification entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String notificationId = entity.getNotificationId();
        if (notificationId != null) {
            stmt.bindString(2, notificationId);
        }
 
        String dialogId = entity.getDialogId();
        if (dialogId != null) {
            stmt.bindString(3, dialogId);
        }
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(4, state);
        }
 
        String body = entity.getBody();
        if (body != null) {
            stmt.bindString(5, body);
        }
 
        Long createdDate = entity.getCreatedDate();
        if (createdDate != null) {
            stmt.bindLong(6, createdDate);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public DialogNotification readEntity(Cursor cursor, int offset) {
        DialogNotification entity = new DialogNotification( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // notificationId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // dialogId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // state
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // body
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // createdDate
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // type
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DialogNotification entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNotificationId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDialogId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setState(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBody(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCreatedDate(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DialogNotification entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(DialogNotification entity) {
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
