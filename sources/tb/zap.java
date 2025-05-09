package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zap {
    public static final zap m = new zap();

    /* renamed from: a  reason: collision with root package name */
    public Context f32654a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public final bap l = new bap();

    static {
        t2o.a(813694988);
    }

    public static zap b() {
        return m;
    }

    public final Boolean a() {
        if (this.b != null && this.d != null && this.c != null && this.f32654a != null) {
            return Boolean.TRUE;
        }
        lgh.b("have send args is null，you must init first. appId " + this.b + " appVersion " + this.d + " appKey " + this.c);
        return Boolean.FALSE;
    }

    public void c(Context context, String str, String str2, String str3, String str4, String str5) {
        String string;
        this.f32654a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("build_id", "string", context.getPackageName());
        if (identifier > 0) {
            try {
                string = resources.getString(identifier);
            } catch (Exception e) {
                Log.e("SendService", e.getMessage());
            }
            this.g = string;
        }
        string = "unknown";
        this.g = string;
    }

    public Boolean d(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        String str3;
        if (!a().booleanValue()) {
            return Boolean.FALSE;
        }
        if (str == null) {
            str3 = "h-adashx.ut.taobao.com";
        } else {
            str3 = str;
        }
        return Boolean.valueOf(kao.g(this.c, this.f32654a, str3, j, str2, i, obj, obj2, obj3, map));
    }

    public void f(String str) {
        if (str != null) {
            this.d = str;
        }
    }

    public void g(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private String f32655a;
        private Context b;
        private String c;
        private Boolean d;
        private long e;
        private String f;
        private int g;
        private Object h;
        private Object i;
        private Object j;
        private Map<String, String> k;

        static {
            t2o.a(813694989);
        }

        public a() {
            this.d = Boolean.FALSE;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.d.booleanValue()) {
                    kao.h(this.f32655a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                } else {
                    kao.g(this.f32655a, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                }
            } catch (Exception e) {
                lgh.c("send log asyn error ", e);
            }
        }

        public a(String str, String str2, Context context, String str3, long j, String str4, int i, Object obj, Object obj2, Object obj3, Map<String, String> map, Boolean bool) {
            this.b = context;
            this.c = str3;
            this.e = j;
            this.f = str4;
            this.g = i;
            this.h = obj;
            this.i = obj2;
            this.j = obj3;
            this.k = map;
            this.f32655a = str2;
            this.d = bool;
        }
    }

    public void e(String str, long j, String str2, int i, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        if (a().booleanValue()) {
            this.l.c(new a("rest thread", this.c, this.f32654a, str == null ? "h-adashx.ut.taobao.com" : str, j, str2, i, obj, obj2, obj3, map, Boolean.FALSE));
        }
    }
}
