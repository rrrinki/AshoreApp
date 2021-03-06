package com.trutek.looped.data.impl.entities;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trutek.looped.data.impl.entities.Message;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MESSAGE".
*/
public class MessageDao extends AbstractDao<Message, Long> {

    public static final String TABLENAME = "MESSAGE";

    /**
     * Properties of entity Message.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property MessageId = new Property(1, String.class, "messageId", false, "MESSAGE_ID");
        public final static Property DialogId = new Property(2, String.class, "dialogId", false, "DIALOG_ID");
        public final static Property Body = new Property(3, String.class, "body", false, "BODY");
        public final static Property DateSent = new Property(4, Long.class, "dateSent", false, "DATE_SENT");
        public final static Property RecipientId = new Property(5, Integer.class, "recipientId", false, "RECIPIENT_ID");
        public final static Property SenderId = new Property(6, Integer.class, "senderId", false, "SENDER_ID");
        public final static Property State = new Property(7, String.class, "state", false, "STATE");
        public final static Property Status = new Property(8, String.class, "status", false, "STATUS");
        public final static Property TimeStamp = new Property(9, java.util.Date.class, "timeStamp", false, "TIME_STAMP");
        public final static Property AttachmentId = new Property(10, String.class, "attachmentId", false, "ATTACHMENT_ID");
    };


    public MessageDao(DaoConfig config) {
        super(config);
    }
    
    public MessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MESSAGE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"MESSAGE_ID\" TEXT UNIQUE ," + // 1: messageId
                "\"DIALOG_ID\" TEXT," + // 2: dialogId
                "\"BODY\" TEXT," + // 3: body
                "\"DATE_SENT\" INTEGER," + // 4: dateSent
                "\"RECIPIENT_ID\" INTEGER," + // 5: recipientId
                "\"SENDER_ID\" INTEGER," + // 6: senderId
                "\"STATE\" TEXT," + // 7: state
                "\"STATUS\" TEXT," + // 8: status
                "\"TIME_STAMP\" INTEGER," + // 9: timeStamp
                "\"ATTACHMENT_ID\" TEXT UNIQUE );"); // 10: attachmentId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MESSAGE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Message entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String messageId = entity.getMessageId();
        if (messageId != null) {
            stmt.bindString(2, messageId);
        }
 
        String dialogId = entity.getDialogId();
        if (dialogId != null) {
            stmt.bindString(3, dialogId);
        }
 
        String body = entity.getBody();
        if (body != null) {
            stmt.bindString(4, body);
        }
 
        Long dateSent = entity.getDateSent();
        if (dateSent != null) {
            stmt.bindLong(5, dateSent);
        }
 
        Integer recipientId = entity.getRecipientId();
        if (recipientId != null) {
            stmt.bindLong(6, recipientId);
        }
 
        Integer senderId = entity.getSenderId();
        if (senderId != null) {
            stmt.bindLong(7, senderId);
        }
 
        String state = entity.getState();
        if (state != null) {
            stmt.bindString(8, state);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(9, status);
        }
 
        java.util.Date timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(10, timeStamp.getTime());
        }
 
        String attachmentId = entity.getAttachmentId();
        if (attachmentId != null) {
            stmt.bindString(11, attachmentId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Message readEntity(Cursor cursor, int offset) {
        Message entity = new Message( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // messageId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // dialogId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // body
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // dateSent
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // recipientId
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // senderId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // state
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // status
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // timeStamp
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // attachmentId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Message entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMessageId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDialogId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBody(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDateSent(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setRecipientId(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSenderId(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setState(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setStatus(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTimeStamp(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setAttachmentId(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Message entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Message entity) {
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
