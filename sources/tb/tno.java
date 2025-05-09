package tb;

import android.content.ContentValues;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.sqlite.DbManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static tno f28829a;

    static {
        t2o.a(1034944639);
    }

    public tno() {
        DAI.loadNativeDBBeforeStart();
    }

    public static synchronized tno b() {
        synchronized (tno.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tno) ipChange.ipc$dispatch("a1ca0792", new Object[0]);
            }
            if (f28829a == null) {
                f28829a = new tno();
            }
            return f28829a;
        }
    }

    public void a(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f843424e", new Object[]{this, str});
        } else {
            DbManager.getInstance().execSQL(str, null, "SQLiteDatabase_execSQL", "SQLiteDatabase_execSQL", null);
        }
    }

    public long c(String str, String str2, ContentValues contentValues, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("971dfc26", new Object[]{this, str, str2, contentValues, new Integer(i)})).longValue();
        }
        return d(str, str2, contentValues, i, "SQLiteDatabase_insertWithOnConflict", "SQLiteDatabase_insertWithOnConflict");
    }

    public long d(String str, String str2, ContentValues contentValues, int i, String str3, String str4) {
        int i2;
        Object[] objArr;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67fa803a", new Object[]{this, str, str2, contentValues, new Integer(i), str3, str4})).longValue();
        }
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(str);
        sb.append('(');
        if (contentValues == null || contentValues.size() <= 0) {
            i2 = 0;
        } else {
            i2 = contentValues.size();
        }
        if (i2 > 0) {
            objArr = new Object[i2];
            int i3 = 0;
            for (String str7 : contentValues.keySet()) {
                if (i3 > 0) {
                    str6 = ",";
                } else {
                    str6 = "";
                }
                sb.append(str6);
                sb.append(str7);
                objArr[i3] = contentValues.get(str7);
                i3++;
            }
            sb.append(") VALUES (");
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 > 0) {
                    str5 = ",?";
                } else {
                    str5 = "?";
                }
                sb.append(str5);
            }
        } else {
            sb.append(str2 + ") VALUES (NULL");
            objArr = null;
        }
        sb.append(')');
        HashMap hashMap = new HashMap();
        hashMap.put("data_names", str);
        return DbManager.getInstance().insert(sb.toString(), DbManager.argsToStringArray(objArr), str3, str4, hashMap);
    }

    public int e(String str, ContentValues contentValues, String str2, String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d4503ec", new Object[]{this, str, contentValues, str2, strArr, new Integer(i)})).intValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("data_names", str);
        return f(str, contentValues, str2, strArr, i, "SQLiteDatabase_updateWithOnConflict", "SQLiteDatabase_updateWithOnConflict", hashMap);
    }

    public int f(String str, ContentValues contentValues, String str2, String[] strArr, int i, String str3, String str4, Map<String, String> map) {
        int i2;
        String str5;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97fb9f4b", new Object[]{this, str, contentValues, str2, strArr, new Integer(i), str3, str4, map})).intValue();
        }
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        if (strArr == null) {
            i2 = size;
        } else {
            i2 = strArr.length + size;
        }
        Object[] objArr = new Object[i2];
        for (String str6 : contentValues.keySet()) {
            if (i3 > 0) {
                str5 = ",";
            } else {
                str5 = "";
            }
            sb.append(str5);
            sb.append(str6);
            objArr[i3] = contentValues.get(str6);
            sb.append("=?");
            i3++;
        }
        if (strArr != null) {
            for (int i4 = size; i4 < i2; i4++) {
                objArr[i4] = strArr[i4 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        return DbManager.getInstance().update(sb.toString(), DbManager.argsToStringArray(objArr), str3, str4, map);
    }
}
