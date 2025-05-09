package org.tensorflow.contrib.tmall.sqlite;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class CursorImpl implements Cursor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int columnCount;
    private int currentRow = -1;
    private ArrayList<ArrayList<String>> rawData;
    private final int rowCount;

    static {
        t2o.a(1034944743);
        t2o.a(1034944742);
    }

    public CursorImpl(ArrayList<ArrayList<String>> arrayList) {
        int i;
        this.rawData = arrayList;
        int i2 = 0;
        if (arrayList == null) {
            i = 0;
        } else {
            i = arrayList.size();
        }
        this.rowCount = i;
        this.columnCount = i != 0 ? this.rawData.get(0).size() : i2;
    }

    private boolean hasData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15e54bef", new Object[]{this})).booleanValue();
        }
        if (this.rowCount <= 0 || this.columnCount <= 0) {
            return false;
        }
        return true;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getColumnCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbbe351d", new Object[]{this})).intValue();
        }
        return this.columnCount;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getColumnIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac47bea", new Object[]{this, str})).intValue();
        }
        return -1;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (hasData()) {
            return this.rawData.size();
        }
        return 0;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public float getFloat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aecf2e66", new Object[]{this, new Integer(i)})).floatValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Float.parseFloat(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1.0f;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public int getInt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{this, new Integer(i)})).intValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Integer.parseInt(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public long getLong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43ad79e", new Object[]{this, new Integer(i)})).longValue();
        }
        if (hasData() && i < this.columnCount) {
            try {
                return Long.parseLong(getString(i));
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public String getString(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        if (!hasData() || i >= this.columnCount) {
            return null;
        }
        return this.rawData.get(this.currentRow).get(i);
    }

    @Override // org.tensorflow.contrib.tmall.sqlite.Cursor
    public boolean moveToNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aacf6c4a", new Object[]{this})).booleanValue();
        }
        if (!hasData()) {
            return false;
        }
        int i = this.currentRow + 1;
        this.currentRow = i;
        if (i < this.rawData.size()) {
            return true;
        }
        return false;
    }
}
