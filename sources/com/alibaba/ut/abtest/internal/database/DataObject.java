package com.alibaba.ut.abtest.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class DataObject implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544352);
    }

    public int getCursorInt(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ac57c4a", new Object[]{this, cursor, str})).intValue() : getCursorInt(cursor, str, 0);
    }

    public long getCursorLong(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de0714c6", new Object[]{this, cursor, str})).longValue() : getCursorLong(cursor, str, 0L);
    }

    public String getCursorString(Cursor cursor, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3f4e4a3", new Object[]{this, cursor, str}) : getCursorString(cursor, str, null);
    }

    public abstract ContentValues toContentValues();

    public int getCursorInt(Cursor cursor, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("edea817f", new Object[]{this, cursor, str, new Integer(i)})).intValue();
        }
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getInt(columnIndex) : i;
    }

    public long getCursorLong(Cursor cursor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2dbfc26", new Object[]{this, cursor, str, new Long(j)})).longValue();
        }
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getLong(columnIndex) : j;
    }

    public String getCursorString(Cursor cursor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6466d59", new Object[]{this, cursor, str, str2});
        }
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getString(columnIndex) : str2;
    }
}
