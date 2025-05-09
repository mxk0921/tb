package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j39 implements mnd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAV_BIZCODE_PROPERTY_NAME = "appName";

    /* renamed from: a  reason: collision with root package name */
    public hs6 f21734a;
    public mnd b;
    public boolean c = true;
    public int d = 0;
    public Object e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements jzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jzo f21735a;

        public a(jzo jzoVar) {
            this.f21735a = jzoVar;
        }

        @Override // tb.jzo
        public void onError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fed7cd43", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "getRequestOwnBusiness asyncRequest onError " + str + " " + str2);
            this.f21735a.onError(i, str, str2, j39.c(j39.this));
            j39.e(j39.this, str, str2);
        }

        @Override // tb.jzo
        public void onSuccess(int i, tzo tzoVar, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35f22ba", new Object[]{this, new Integer(i), tzoVar, obj});
                return;
            }
            StringBuilder sb = new StringBuilder("getRequestOwnBusiness asyncRequest onSuccess ");
            if (tzoVar != null) {
                str = tzoVar.toString();
            } else {
                str = "";
            }
            sb.append(str);
            TLog.logd("FAVSDK_FavoriteSdkBusiness", sb.toString());
            this.f21735a.onSuccess(i, tzoVar, j39.c(j39.this));
            j39.d(j39.this, tzoVar);
        }

        @Override // tb.jzo
        public void onSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc91052", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "getRequestOwnBusiness asyncRequest onSystemError " + str + " " + str2);
            this.f21735a.onSystemError(i, str, str2, j39.c(j39.this));
            j39.e(j39.this, str, str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements pzo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jzo f21736a;
        public final /* synthetic */ String b;

        public b(jzo jzoVar, String str) {
            this.f21736a = jzoVar;
            this.b = str;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                return;
            }
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doAsyncRequest onError " + str + " " + str2);
            jzo jzoVar = this.f21736a;
            j39 j39Var = j39.this;
            jzoVar.onError(j39Var.d, str, str2, j39.c(j39Var));
            j39.e(j39.this, str, str2);
            AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", this.b, str, str2);
        }

        public void b(tzo tzoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bdee791", new Object[]{this, tzoVar});
                return;
            }
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doAsyncRequest onSuccess");
            st6 b = j39.f(j39.this).b();
            if (b != null) {
                tzoVar.e = b.a(tzoVar.e);
            }
            jzo jzoVar = this.f21736a;
            j39 j39Var = j39.this;
            jzoVar.onSuccess(j39Var.d, tzoVar, j39.c(j39Var));
            j39.d(j39.this, tzoVar);
            AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", this.b);
        }

        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51047dd5", new Object[]{this, str, str2});
                return;
            }
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doAsyncRequest onSystemError " + str + " " + str2);
            jzo jzoVar = this.f21736a;
            j39 j39Var = j39.this;
            jzoVar.onSystemError(j39Var.d, str, str2, j39.c(j39Var));
            j39.e(j39.this, str, str2);
            AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", this.b, str, str2);
        }
    }

    static {
        t2o.a(463470644);
        t2o.a(463470647);
    }

    public static /* synthetic */ Object c(j39 j39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("56b6c5b9", new Object[]{j39Var});
        }
        return j39Var.e;
    }

    public static /* synthetic */ void d(j39 j39Var, tzo tzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a04d9e", new Object[]{j39Var, tzoVar});
        } else {
            j39Var.h(tzoVar);
        }
    }

    public static /* synthetic */ void e(j39 j39Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e926eb", new Object[]{j39Var, str, str2});
        } else {
            j39Var.g(str, str2);
        }
    }

    public static /* synthetic */ hs6 f(j39 j39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("fe4f80cc", new Object[]{j39Var});
        }
        return j39Var.f21734a;
    }

    public static j39 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j39) ipChange.ipc$dispatch("fdb5ef63", new Object[0]);
        }
        return new j39();
    }

    @Override // tb.mnd
    public tzo a(ljd ljdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("1482e794", new Object[]{this, ljdVar, str});
        }
        hs6 a2 = ljdVar.a();
        this.f21734a = a2;
        a2.d().k("appName", str);
        TLog.logd("FAVSDK_FavoriteSdkBusiness", "syncRequest bizCode = " + str);
        if (this.c && o() != null) {
            tzo a3 = o().a(ljdVar, str);
            h(a3);
            return a3;
        } else if (!p(str)) {
            return k();
        } else {
            tzo m = m();
            h(m);
            String str2 = this.f21734a.d().a() + "_" + str;
            if (m == null) {
                AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", str2, "response_null", "response null");
                return m;
            } else if (m.c) {
                AppMonitor.Alarm.commitSuccess("Favorite_SDK", "MtopApiCall", str2);
                return m;
            } else {
                AppMonitor.Alarm.commitFail("Favorite_SDK", "MtopApiCall", str2, m.f29047a, m.b);
                return m;
            }
        }
    }

    @Override // tb.mnd
    public void b(int i, ljd ljdVar, String str, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426a3b2c", new Object[]{this, new Integer(i), ljdVar, str, jzoVar});
            return;
        }
        this.d = i;
        hs6 a2 = ljdVar.a();
        this.f21734a = a2;
        a2.d().k("appName", str);
        TLog.logd("FAVSDK_FavoriteSdkBusiness", "asyncRequest bizCode = " + str);
        if (this.c && o() != null) {
            o().b(i, ljdVar, str, new a(jzoVar));
        } else if (!p(str)) {
            this.f21734a.d().n(j(jzoVar));
        } else {
            this.f21734a.d().n(l(str, jzoVar));
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83dba1c7", new Object[]{this, str, str2});
            return;
        }
        tzo tzoVar = new tzo();
        tzoVar.c = false;
        tzoVar.f29047a = str;
        tzoVar.b = str2;
        h(tzoVar);
    }

    public final void h(tzo tzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2586e419", new Object[]{this, tzoVar});
            return;
        }
        js6 a2 = this.f21734a.a();
        if (a2 != null) {
            a2.a(tzoVar);
        }
    }

    public final szo j(jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szo) ipChange.ipc$dispatch("6fc78174", new Object[]{this, jzoVar});
        }
        jzoVar.onError(this.d, "favorite_sdk_limit", "系统开小差了，请稍后再试", this.e);
        szo szoVar = new szo();
        szoVar.f28378a = "favorite_sdk_limit";
        TLog.logw("FAVSDK_FavoriteSdkBusiness", "directReturnAsyncRequest because of bizCode is limited");
        return szoVar;
    }

    public final szo l(String str, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (szo) ipChange.ipc$dispatch("b975f110", new Object[]{this, str, jzoVar});
        }
        pnd n = n();
        if (n == null) {
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doAsyncRequest sdkNetwork is null");
            return null;
        }
        String str2 = this.f21734a.d().a() + "_" + str;
        szo szoVar = new szo();
        szoVar.b = new Object();
        szo a2 = n.a(this.f21734a.d(), new b(jzoVar, str2));
        if (a2 != null) {
            return a2;
        }
        return szoVar;
    }

    public final tzo m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("a4cc268c", new Object[]{this});
        }
        pnd n = n();
        if (n == null) {
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doSyncRequest sdkNetwork is null");
            return null;
        }
        tzo b2 = n.b(this.f21734a.d());
        if (b2 == null) {
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doSyncRequest sdkResponse is null");
            return null;
        }
        st6 b3 = this.f21734a.b();
        if (!(b3 == null || b2.e == null)) {
            TLog.logd("FAVSDK_FavoriteSdkBusiness", "doSyncRequest dataTransform not null and transfrom");
            b2.e = b3.a(b2.e);
        }
        TLog.logd("FAVSDK_FavoriteSdkBusiness", "doSyncRequest isSuccess = " + b2.c + " code = " + b2.f29047a + " msg = " + b2.b);
        return b2;
    }

    public final pnd n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pnd) ipChange.ipc$dispatch("6a1a91db", new Object[]{this});
        }
        return k39.d();
    }

    public final mnd o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mnd) ipChange.ipc$dispatch("45480eb3", new Object[]{this});
        }
        mnd mndVar = this.b;
        if (mndVar != null) {
            return mndVar;
        }
        if (this.f21734a.c() == null) {
            return null;
        }
        TLog.logd("FAVSDK_FavoriteSdkBusiness", "getRequestOwnBusiness has ownBusiness");
        mnd a2 = this.f21734a.c().a();
        this.b = a2;
        return a2;
    }

    public final boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("210a97f3", new Object[]{this, str})).booleanValue();
        }
        qzo d = this.f21734a.d();
        boolean b2 = mzo.b(d, str);
        if (!b2) {
            AppMonitor.Counter.commit("Favorite_SDK", "FavoriteSdkApiIntercept", d.a() + "_" + str, 1.0d);
        }
        return b2;
    }

    public j39 q(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j39) ipChange.ipc$dispatch("5b654c74", new Object[]{this, obj});
        }
        this.e = obj;
        return this;
    }

    public j39 r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j39) ipChange.ipc$dispatch("1bd74a18", new Object[]{this, new Boolean(z)});
        }
        this.c = !z;
        return this;
    }

    public final tzo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("75004e7a", new Object[]{this});
        }
        tzo tzoVar = new tzo();
        tzoVar.f29047a = "favorite_sdk_limit";
        tzoVar.b = "系统开小差了，请稍后再试";
        tzoVar.c = false;
        TLog.logw("FAVSDK_FavoriteSdkBusiness", "directReturnSyncRequest because of bizCode is limited");
        return tzoVar;
    }
}
