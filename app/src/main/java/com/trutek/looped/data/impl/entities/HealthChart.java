package com.trutek.looped.data.impl.entities;

import com.trutek.looped.data.impl.entities.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "HEALTH_CHART".
 */
public class HealthChart {

    private Long id;
    private String serverId;
    private Long healthParamId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient HealthChartDao myDao;

    private HealthParam healthParam;
    private Long healthParam__resolvedKey;


    public HealthChart() {
    }

    public HealthChart(Long id) {
        this.id = id;
    }

    public HealthChart(Long id, String serverId, Long healthParamId) {
        this.id = id;
        this.serverId = serverId;
        this.healthParamId = healthParamId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getHealthChartDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Long getHealthParamId() {
        return healthParamId;
    }

    public void setHealthParamId(Long healthParamId) {
        this.healthParamId = healthParamId;
    }

    /** To-one relationship, resolved on first access. */
    public HealthParam getHealthParam() {
        Long __key = this.healthParamId;
        if (healthParam__resolvedKey == null || !healthParam__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            HealthParamDao targetDao = daoSession.getHealthParamDao();
            HealthParam healthParamNew = targetDao.load(__key);
            synchronized (this) {
                healthParam = healthParamNew;
            	healthParam__resolvedKey = __key;
            }
        }
        return healthParam;
    }

    public void setHealthParam(HealthParam healthParam) {
        synchronized (this) {
            this.healthParam = healthParam;
            healthParamId = healthParam == null ? null : healthParam.getId();
            healthParam__resolvedKey = healthParamId;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
