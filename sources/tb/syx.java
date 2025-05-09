package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import tb.lwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class syx extends t2 {
    public final Context c;
    public final String d;
    public volatile sg4 e;
    public final Object f = new Object();
    public p2 g = p2.UNKNOWN;
    public final Map<String, String> h = new HashMap();
    public volatile w5y i;

    public syx(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    public static String d(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    @Override // tb.r2
    public p2 a() {
        if (this.g == null) {
            this.g = p2.UNKNOWN;
        }
        p2 p2Var = this.g;
        p2 p2Var2 = p2.UNKNOWN;
        if (p2Var == p2Var2 && this.e == null) {
            e();
        }
        p2 p2Var3 = this.g;
        if (p2Var3 == null) {
            return p2Var2;
        }
        return p2Var3;
    }

    public final void e() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new way(this.c, this.d);
                        this.i = new w5y(this.e);
                    }
                    g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String f(String str) {
        lwf.a aVar;
        HashMap hashMap = (HashMap) lwf.a();
        if (hashMap.containsKey(str) && (aVar = (lwf.a) hashMap.get(str)) != null) {
            return aVar.a(this);
        }
        return null;
    }

    public final void g() {
        if (this.g == p2.UNKNOWN && this.e != null) {
            this.g = zyv.f(this.e.getString("/region", null), this.e.getString("/agcgw/url", null));
        }
    }

    @Override // tb.r2
    public Context getContext() {
        return this.c;
    }

    @Override // tb.r2
    public String getIdentifier() {
        return zyv.DEFAULT_NAME;
    }

    @Override // tb.r2
    public String getString(String str) {
        return h(str, null);
    }

    public String h(String str, String str2) {
        if (str != null) {
            if (this.e == null) {
                e();
            }
            String d = d(str);
            String str3 = (String) ((HashMap) this.h).get(d);
            if (str3 != null) {
                return str3;
            }
            String f = f(d);
            if (f != null) {
                return f;
            }
            String string = this.e.getString(d, str2);
            return w5y.b(string) ? this.i.d(string, str2) : string;
        }
        throw new NullPointerException("path must not be null.");
    }
}
