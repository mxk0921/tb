package tb;

import android.database.Cursor;
import com.alibaba.ut.abtest.internal.database.DataObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class bt1<T extends DataObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544351);
    }

    public int a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27dcd96", new Object[]{this, str, strArr})).intValue();
        }
        return b().b(c(), str, strArr);
    }

    public abstract bu6 b();

    public abstract String c();

    public ArrayList<T> d(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7ac1dd4f", new Object[]{this, cursor});
        }
        ArrayList<T> arrayList = new ArrayList<>();
        while (cursor.moveToNext()) {
            arrayList.add(i(cursor));
        }
        return arrayList;
    }

    public ArrayList<T> e(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("524da038", new Object[]{this, cursor});
        }
        try {
            return d(cursor);
        } finally {
            cursor.close();
        }
    }

    public T f(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((DataObject) ipChange.ipc$dispatch("7d0f5534", new Object[]{this, cursor}));
        }
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return i(cursor);
        }
        throw new RuntimeException("Expected unique result, but count was " + cursor.getCount());
    }

    public T g(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((DataObject) ipChange.ipc$dispatch("35e42c2b", new Object[]{this, cursor}));
        }
        try {
            return f(cursor);
        } finally {
            cursor.close();
        }
    }

    public ArrayList<T> h(String[] strArr, String str, int i, int i2, String str2, String... strArr2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6fbde895", new Object[]{this, strArr, str, new Integer(i), new Integer(i2), str2, strArr2});
        }
        if (i2 > 0) {
            str3 = (i * i2) + "," + i2;
        } else {
            str3 = null;
        }
        return e(b().F(c(), strArr, str, str3, str2, strArr2));
    }

    public abstract T i(Cursor cursor);

    public T j(String[] strArr, String str, String... strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((DataObject) ipChange.ipc$dispatch("b6076c2", new Object[]{this, strArr, str, strArr2}));
        }
        return g(b().F(c(), strArr, null, null, str, strArr2));
    }
}
