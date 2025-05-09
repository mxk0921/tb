package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.interceptor.RealTimeLogMessageManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class j5s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INIT_END = 2;
    public static final int INIT_ING = 1;
    public static final int INIT_NO = 0;

    /* renamed from: a  reason: collision with root package name */
    public Context f21784a;
    public Application b;
    public volatile int c;
    public String d;
    public final String e;
    public String f;
    public final String g;
    public final Map<String, e5s> h;
    public zfh i;
    public nqi j;
    public s5s k;
    public ewd l;
    public fwd m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final j5s f21785a = new j5s();

        static {
            t2o.a(767557651);
        }

        public static /* synthetic */ j5s a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j5s) ipChange.ipc$dispatch("e4633f86", new Object[0]);
            }
            return f21785a;
        }
    }

    static {
        t2o.a(767557649);
    }

    public static j5s j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("bec93aec", new Object[0]);
        }
        return b.a();
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[0]);
        }
        return q4s.f;
    }

    public j5s A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("762e3745", new Object[]{this, new Boolean(z)});
        }
        q4s.i = z;
        return this;
    }

    public j5s B(zfh zfhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("11d02a03", new Object[]{this, zfhVar});
        }
        this.i = zfhVar;
        return this;
    }

    public j5s C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("bc0fe5be", new Object[]{this, str});
        }
        q4s.d = str;
        return this;
    }

    public j5s D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("5fd01c35", new Object[]{this, str});
        }
        q4s.c = str;
        return this;
    }

    public j5s E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("2d1f9933", new Object[]{this, new Integer(i)});
        }
        if (i <= 2048) {
            q4s.E = i * 1024;
        }
        return this;
    }

    public j5s F(nqi nqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("cc4bf5c2", new Object[]{this, nqiVar});
        }
        RealTimeLogMessageManager.l(nqiVar);
        return this;
    }

    public j5s G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("4f593270", new Object[]{this, str});
        }
        q4s.m = str;
        return this;
    }

    public j5s H(fwd fwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("3d112334", new Object[]{this, fwdVar});
        }
        this.m = fwdVar;
        return this;
    }

    public j5s I(String str, e5s e5sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("b7576002", new Object[]{this, str, e5sVar});
        }
        try {
            ((ConcurrentHashMap) this.h).put(str, e5sVar);
        } catch (Exception e) {
            Log.e("TLOG", "regist tlog user define uploader error", e);
        }
        return this;
    }

    public j5s J(nqi nqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("cc61d685", new Object[]{this, nqiVar});
        }
        this.j = nqiVar;
        if (nqiVar != null) {
            api apiVar = new api();
            apiVar.f15918a = this.f21784a;
            j().f();
            apiVar.c = this.f;
            this.j.b(apiVar);
        }
        return this;
    }

    public j5s K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("702832bd", new Object[]{this, str});
        }
        q4s.h = str;
        return this;
    }

    public j5s L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("20824c8f", new Object[]{this, str});
        }
        q4s.f = str;
        return this;
    }

    public j5s M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("95fbbf0e", new Object[]{this, str});
        }
        q4s.x = str;
        return this;
    }

    public j5s N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("4f607f18", new Object[]{this});
        }
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f21784a == null) {
            return this;
        }
        if (this.j != null) {
            uhq.c();
            h5n.a().c();
        }
        e6s.d().c(new Runnable() { // from class: tb.i5s
            @Override // java.lang.Runnable
            public final void run() {
                j5s.this.w();
            }
        });
        return this;
    }

    public void O(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9621046c", new Object[]{this, num});
        } else {
            uhq.l(num);
        }
    }

    public j5s b(Context context, LogLevel logLevel, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("85a80606", new Object[]{this, context, logLevel, str, str2, str3, str4});
        }
        if (this.c != 0) {
            return this;
        }
        this.f21784a = context;
        q4s.j = n6s.g(context);
        q4s.l = logLevel;
        q4s.f26507a = str3;
        q4s.e = str4;
        if (!TextUtils.isEmpty(str2)) {
            q4s.n = str2.replaceAll("[:*?<>|\"\\\\/]", "-");
        }
        return this;
    }

    public j5s c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("8ba121ad", new Object[]{this, str});
        }
        if (str != null) {
            a6s.a().e(str);
        }
        return this;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94038553", new Object[]{this});
        }
        if (q4s.b == null) {
            q4s.b = q4s.f26507a + "@android";
        }
        return q4s.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return q4s.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return q4s.f26507a;
    }

    public Application g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.b;
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f21784a;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d92c1a5", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public zfh k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfh) ipChange.ipc$dispatch("2b600da5", new Object[]{this});
        }
        return this.i;
    }

    public nqi l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nqi) ipChange.ipc$dispatch("7b93deef", new Object[]{this});
        }
        return this.j;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7d67006", new Object[]{this});
        }
        return q4s.n;
    }

    public ewd n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewd) ipChange.ipc$dispatch("e1d1ee72", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new jkn();
        }
        return this.l;
    }

    public fwd o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwd) ipChange.ipc$dispatch("53c70326", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new k77();
        }
        return this.m;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return q4s.g;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f467ca35", new Object[]{this});
        }
        return q4s.h;
    }

    public s5s s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s5s) ipChange.ipc$dispatch("20f4db00", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new j77();
        }
        return this.k;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8ec72e", new Object[]{this})).booleanValue();
        }
        if (q4s.i || q4s.j) {
            return true;
        }
        return false;
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("813bc656", new Object[]{this})).booleanValue();
        }
        return q4s.A;
    }

    public final /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64833bef", new Object[]{this});
            return;
        }
        try {
            if (q4s.k()) {
                ckn.a(this.f21784a);
                c6s.c(this.f21784a);
                hf9.a();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public j5s x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("d33f0273", new Object[]{this, str});
        }
        q4s.b = str;
        return this;
    }

    public j5s y(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("4ea57994", new Object[]{this, application});
        }
        this.b = application;
        return this;
    }

    public j5s z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("8c690fc5", new Object[]{this, new Integer(i)});
        }
        q4s.o = i;
        q4s.p = true;
        return this;
    }

    public j5s() {
        this.c = 0;
        this.d = "motu-debug-log";
        this.e = "adash.emas-ha.cn";
        this.f = "ha-remote-debug";
        this.g = "real_time_log";
        this.h = new ConcurrentHashMap();
        this.i = null;
        this.j = null;
        this.k = null;
    }

    public j5s t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j5s) ipChange.ipc$dispatch("186efc47", new Object[]{this});
        }
        if (this.c != 0) {
            return this;
        }
        this.c = 1;
        u5s.e(this.f21784a);
        q4s.p(this.f21784a);
        b5s.s(this.f21784a);
        c6s.a(this.f21784a, q4s.y, q4s.z);
        ckn.d(this.f21784a);
        TLogNative.appenderOpen(q4s.l.getIndex(), b5s.i().getAbsolutePath(), b5s.j().getAbsolutePath(), q4s.n, b5s.l(), q4s.f26507a, q4s.u, q4s.o, q4s.v, q4s.w, q4s.q, q4s.r, q4s.s, q4s.t);
        if (TLogNative.isSoOpen()) {
            try {
                TLogNative.setConsoleLogOpen(false);
            } catch (Throwable th) {
                Log.e("TLOG", "TLogNative.isSoOpen: ", th);
            }
        }
        s4s.e().i(q4s.l);
        s4s.e().h();
        b34.c().d();
        q74 q74Var = new q74();
        I(q74Var.getBizCode(), q74Var);
        this.c = 2;
        String str = "tlog init end! Config: " + q4s.a();
        TLog.loge("TLOG", "init", str);
        Log.e("TLOG", str);
        return this;
    }
}
