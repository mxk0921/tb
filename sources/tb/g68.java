package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g68 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile g68 b;

    /* renamed from: a  reason: collision with root package name */
    public final SQLiteDatabase f19750a;

    static {
        t2o.a(157286492);
    }

    public g68(Context context) {
        this.f19750a = new heq(context, null).getReadableDatabase();
    }

    public static g68 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g68) ipChange.ipc$dispatch("271d9d0", new Object[]{context});
        }
        if (context == null && b == null) {
            throw new IllegalArgumentException("context and evaluator cannot be null.");
        }
        if (b == null) {
            synchronized (g68.class) {
                try {
                    if (b == null) {
                        b = new g68(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f9a778d", new Object[]{this, str})).booleanValue();
        }
        try {
            Cursor rawQuery = this.f19750a.rawQuery("SELECT " + str, null);
            rawQuery.moveToFirst();
            String string = rawQuery.getString(0);
            rawQuery.close();
            return !string.equals("0");
        } catch (Exception unused) {
            return true;
        }
    }
}
