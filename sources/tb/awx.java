package tb;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.core.a.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.lwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class awx extends q2 {
    public static List<ddp> b;
    public static final Map<String, q2> c = new HashMap();
    public static String d;

    /* renamed from: a  reason: collision with root package name */
    public final r2 f16049a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements lwf.a {
        @Override // tb.lwf.a
        public String a(r2 r2Var) {
            String str;
            if (r2Var.a().equals(p2.CHINA)) {
                str = "/agcgw_all/CN";
            } else if (r2Var.a().equals(p2.RUSSIA)) {
                str = "/agcgw_all/RU";
            } else if (r2Var.a().equals(p2.GERMANY)) {
                str = "/agcgw_all/DE";
            } else if (!r2Var.a().equals(p2.SINGAPORE)) {
                return null;
            } else {
                str = "/agcgw_all/SG";
            }
            return r2Var.getString(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements lwf.a {
        @Override // tb.lwf.a
        public String a(r2 r2Var) {
            String str;
            if (r2Var.a().equals(p2.CHINA)) {
                str = "/agcgw_all/CN_back";
            } else if (r2Var.a().equals(p2.RUSSIA)) {
                str = "/agcgw_all/RU_back";
            } else if (r2Var.a().equals(p2.GERMANY)) {
                str = "/agcgw_all/DE_back";
            } else if (!r2Var.a().equals(p2.SINGAPORE)) {
                return null;
            } else {
                str = "/agcgw_all/SG_back";
            }
            return r2Var.getString(str);
        }
    }

    public awx(r2 r2Var) {
        this.f16049a = r2Var;
        if (b == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        new q3y(b, r2Var.getContext());
        q3y q3yVar = new q3y(null, r2Var.getContext());
        if (r2Var instanceof uwx) {
            q3yVar.a(((uwx) r2Var).c(), r2Var.getContext());
        }
    }

    public static q2 f() {
        String str = d;
        if (str == null) {
            str = zyv.DEFAULT_NAME;
        }
        return g(str);
    }

    public static synchronized q2 g(String str) {
        q2 q2Var;
        synchronized (awx.class) {
            q2Var = (q2) ((HashMap) c).get(str);
            if (q2Var == null && !zyv.DEFAULT_NAME.equals(str)) {
                new StringBuilder("not find instance for : ").append(str);
            }
        }
        return q2Var;
    }

    public static q2 h(r2 r2Var) {
        return i(r2Var, false);
    }

    public static synchronized q2 i(r2 r2Var, boolean z) {
        q2 q2Var;
        synchronized (awx.class) {
            Map<String, q2> map = c;
            q2Var = (q2) ((HashMap) map).get(r2Var.getIdentifier());
            if (q2Var == null || z) {
                q2Var = new awx(r2Var);
                ((HashMap) map).put(r2Var.getIdentifier(), q2Var);
            }
        }
        return q2Var;
    }

    public static synchronized void j(Context context) {
        synchronized (awx.class) {
            if (((HashMap) c).size() <= 0) {
                k(context, t2.b(context));
            }
        }
    }

    public static synchronized void k(Context context, r2 r2Var) {
        synchronized (awx.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                l();
                if (b == null) {
                    b = new c(context).a();
                }
                i(r2Var, true);
                d = r2Var.getIdentifier();
                atx.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void l() {
        lwf.b("/agcgw/url", new a());
        lwf.b("/agcgw/backurl", new b());
    }

    @Override // tb.q2
    public Context b() {
        return this.f16049a.getContext();
    }

    @Override // tb.q2
    public r2 d() {
        return this.f16049a;
    }
}
