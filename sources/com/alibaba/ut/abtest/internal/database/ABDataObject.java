package com.alibaba.ut.abtest.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ABDataObject extends DataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLUMN_CREATE_TIME = "create_time";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_MODIFIED_TIME = "modified_time";
    public static final String COLUMN_OWNER_ID = "owner_id";
    private static final long serialVersionUID = -2123949727986811135L;
    private long createTime;
    private long id;
    private long modifiedTime;
    private String ownerId;

    static {
        t2o.a(961544348);
    }

    public ABDataObject() {
    }

    public static /* synthetic */ Object ipc$super(ABDataObject aBDataObject, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/database/ABDataObject");
    }

    public long getCreateTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9b0beda", new Object[]{this})).longValue();
        }
        return this.createTime;
    }

    public long getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue();
        }
        return this.id;
    }

    public long getModifiedTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adb79e27", new Object[]{this})).longValue();
        }
        return this.modifiedTime;
    }

    public String getOwnerId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1fa6301", new Object[]{this});
        }
        return this.ownerId;
    }

    public void setCreateTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e2e12", new Object[]{this, new Long(j)});
        } else {
            this.createTime = j;
        }
    }

    public void setId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf820", new Object[]{this, new Long(j)});
        } else {
            this.id = j;
        }
    }

    public void setModifiedTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d2ab65", new Object[]{this, new Long(j)});
        } else {
            this.modifiedTime = j;
        }
    }

    public void setOwnerId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545585fd", new Object[]{this, str});
        } else {
            this.ownerId = str;
        }
    }

    @Override // com.alibaba.ut.abtest.internal.database.DataObject
    public ContentValues toContentValues() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentValues) ipChange.ipc$dispatch("8dc74b3", new Object[]{this});
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(getId()));
        contentValues.put("create_time", Long.valueOf(getCreateTime()));
        contentValues.put(COLUMN_MODIFIED_TIME, Long.valueOf(getModifiedTime()));
        contentValues.put("owner_id", getOwnerId());
        return contentValues;
    }

    public ABDataObject(Cursor cursor) {
        this.id = getCursorLong(cursor, "id");
        this.createTime = getCursorLong(cursor, "create_time");
        this.modifiedTime = getCursorLong(cursor, COLUMN_MODIFIED_TIME);
        this.ownerId = getCursorString(cursor, "owner_id");
    }
}
