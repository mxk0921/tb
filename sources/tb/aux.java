package tb;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class aux {
    public static volatile aux b;

    /* renamed from: a  reason: collision with root package name */
    public final String f16019a = "https://mobilegw.alipay.com/mgw.htm";

    public static aux b() {
        if (b == null) {
            synchronized (aux.class) {
                try {
                    if (b == null) {
                        b = new aux();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final String a(Context context) {
        boolean c = c(context);
        String str = this.f16019a;
        if (!c) {
            return str;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.alipay.setting/GWFServerUrl"), null, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            String string = query.getString(0);
            query.close();
            StringBuilder sb = new StringBuilder("getValue.  cursor exist.  uri=[content://com.alipay.setting/GWFServerUrl]  ret=[");
            sb.append(string);
            sb.append("]");
            return string;
        } else if (query == null || query.isClosed()) {
            return str;
        } else {
            query.close();
            return str;
        }
    }

    public static boolean c(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0;
        } catch (Exception e) {
            new StringBuilder("isDebug exception.  ").append(e.toString());
            return false;
        }
    }
}
