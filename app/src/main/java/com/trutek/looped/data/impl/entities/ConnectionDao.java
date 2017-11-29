package com.trutek.looped.data.impl.entities;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import com.trutek.looped.data.impl.entities.Connection;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CONNECTION".
*/
public class ConnectionDao extends AbstractDao<Connection, Long> {

    public static final String TABLENAME = "CONNECTION";

    /**
     * Properties of entity Connection.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property DateOfBirth = new Property(2, java.util.Date.class, "dateOfBirth", false, "DATE_OF_BIRTH");
        public final static Property About = new Property(3, String.class, "about", false, "ABOUT");
        public final static Property Interests = new Property(4, String.class, "interests", false, "INTERESTS");
        public final static Property JabberId = new Property(5, Integer.class, "jabberId", false, "JABBER_ID");
        public final static Property IsMine = new Property(6, Boolean.class, "isMine", false, "IS_MINE");
        public final static Property ServerId = new Property(7, String.class, "serverId", false, "SERVER_ID");
        public final static Property TimeStamp = new Property(8, java.util.Date.class, "timeStamp", false, "TIME_STAMP");
        public final static Property SyncStatus = new Property(9, Integer.class, "syncStatus", false, "SYNC_STATUS");
        public final static Property PicUrl = new Property(10, String.class, "picUrl", false, "PIC_URL");
        public final static Property LocationId = new Property(11, Long.class, "locationId", false, "LOCATION_ID");
    };

    private DaoSession daoSession;

    private Query<Connection> location_ConnectionListQuery;

    public ConnectionDao(DaoConfig config) {
        super(config);
    }
    
    public ConnectionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CONNECTION\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"DATE_OF_BIRTH\" INTEGER," + // 2: dateOfBirth
                "\"ABOUT\" TEXT," + // 3: about
                "\"INTERESTS\" TEXT," + // 4: interests
                "\"JABBER_ID\" INTEGER," + // 5: jabberId
                "\"IS_MINE\" INTEGER," + // 6: isMine
                "\"SERVER_ID\" TEXT," + // 7: serverId
                "\"TIME_STAMP\" INTEGER," + // 8: timeStamp
                "\"SYNC_STATUS\" INTEGER," + // 9: syncStatus
                "\"PIC_URL\" TEXT," + // 10: picUrl
                "\"LOCATION_ID\" INTEGER);"); // 11: locationId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CONNECTION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Connection entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        java.util.Date dateOfBirth = entity.getDateOfBirth();
        if (dateOfBirth != null) {
            stmt.bindLong(3, dateOfBirth.getTime());
        }
 
        String about = entity.getAbout();
        if (about != null) {
            stmt.bindString(4, about);
        }
 
        String interests = entity.getInterests();
        if (interests != null) {
            stmt.bindString(5, interests);
        }
 
        Integer jabberId = entity.getJabberId();
        if (jabberId != null) {
            stmt.bindLong(6, jabberId);
        }
 
        Boolean isMine = entity.getIsMine();
        if (isMine != null) {
            stmt.bindLong(7, isMine ? 1L: 0L);
        }
 
        String serverId = entity.getServerId();
        if (serverId != null) {
            stmt.bindString(8, serverId);
        }
 
        java.util.Date timeStamp = entity.getTimeStamp();
        if (timeStamp != null) {
            stmt.bindLong(9, timeStamp.getTime());
        }
 
        Integer syncStatus = entity.getSyncStatus();
        if (syncStatus != null) {
            stmt.bindLong(10, syncStatus);
        }
 
        String picUrl = entity.getPicUrl();
        if (picUrl != null) {
            stmt.bindString(11, picUrl);
        }
 
        Long locationId = entity.getLocationId();
        if (locationId != null) {
            stmt.bindLong(12, locationId);
        }
    }

    @Override
    protected void attachEntity(Connection entity) {
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
    public Connection readEntity(Cursor cursor, int offset) {
        Connection entity = new Connection( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // dateOfBirth
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // about
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // interests
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // jabberId
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // isMine
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // serverId
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // timeStamp
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // syncStatus
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // picUrl
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11) // locationId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Connection entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDateOfBirth(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setAbout(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setInterests(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setJabberId(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setIsMine(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setServerId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTimeStamp(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setSyncStatus(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setPicUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setLocationId(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Connection entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Connection entity) {
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
    
    /** Internal query to resolve the "connectionList" to-many relationship of Location. */
    public List<Connection> _queryLocation_ConnectionList(Long locationId) {
        synchronized (this) {
            if (location_ConnectionListQuery == null) {
                QueryBuilder<Connection> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.LocationId.eq(null));
                location_ConnectionListQuery = queryBuilder.build();
            }
        }
        Query<Connection> query = location_ConnectionListQuery.forCurrentThread();
        query.setParameter(0, locationId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getLocationDao().getAllColumns());
            builder.append(" FROM CONNECTION T");
            builder.append(" LEFT JOIN LOCATION T0 ON T.\"LOCATION_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Connection loadCurrentDeep(Cursor cursor, boolean lock) {
        Connection entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Location location = loadCurrentOther(daoSession.getLocationDao(), cursor, offset);
        entity.setLocation(location);

        return entity;    
    }

    public Connection loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Connection> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Connection> list = new ArrayList<Connection>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Connection> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Connection> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}