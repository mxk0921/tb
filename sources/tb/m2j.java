package tb;

import android.database.Cursor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m2j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a  reason: collision with root package name */
    public static ip6 f23736a;

    static {
        t2o.a(628097148);
    }

    public static void a(String str, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5eda23", new Object[]{str, objArr});
            return;
        }
        try {
            if (objArr == null) {
                b().getReadableDatabase().execSQL(str);
            } else {
                b().getReadableDatabase().execSQL(str, objArr);
            }
        } catch (Exception e) {
            MsgLog.g("MsgDao_DB", e.getMessage());
            e.printStackTrace();
        }
    }

    public static synchronized ip6 b() {
        synchronized (m2j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ip6) ipChange.ipc$dispatch("fc75d9d5", new Object[0]);
            }
            if (f23736a == null) {
                f23736a = new ip6(p2j.h, "message_kit");
            }
            return f23736a;
        }
    }

    public static Cursor c(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("e1899bf5", new Object[]{str, strArr});
        }
        try {
            return b().getReadableDatabase().rawQuery(str, strArr);
        } catch (Exception e) {
            MsgLog.g("MsgDao_DB", e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
