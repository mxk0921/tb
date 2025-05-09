package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class p32 implements tib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f25848a;
    public String b;
    public long c;
    public volatile i59 d;
    public m59 e;
    public n59 f;
    public s3j g;
    public boolean h;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lgj.d(BasementFeedDataProvider.DB_KEY_FEED_DATA);
            s3j g = p32.g(p32.this);
            if (g == null) {
                return;
            }
            if (p32.this.c(g)) {
                m59 e = p32.e(p32.this);
                if (e != null) {
                    e.f19486a = frm.e;
                }
                TLog.loge("我淘二屏数据层", "feed降级，不请求next");
                return;
            }
            TLog.loge("我淘二屏数据层", "预请求next数据");
            n59 f = p32.f(p32.this);
            if (f != null) {
                f.a();
            }
        }
    }

    static {
        t2o.a(745537913);
        t2o.a(745537924);
    }

    public p32(String str) {
        ckf.h(str, "userId");
    }

    public static final /* synthetic */ m59 e(p32 p32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m59) ipChange.ipc$dispatch("79a6d03b", new Object[]{p32Var});
        }
        return p32Var.e;
    }

    public static final /* synthetic */ n59 f(p32 p32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n59) ipChange.ipc$dispatch("e57571a1", new Object[]{p32Var});
        }
        return p32Var.f;
    }

    public static final /* synthetic */ s3j g(p32 p32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3j) ipChange.ipc$dispatch("a5b42453", new Object[]{p32Var});
        }
        return p32Var.g;
    }

    @Override // tb.tib
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abcc5c1c", new Object[]{this});
        } else {
            h();
        }
    }

    @Override // tb.tib
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c5e979", new Object[]{this});
            return;
        }
        h();
        i();
    }

    @Override // tb.tib
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void i() {
        s3j s3jVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89381936", new Object[]{this});
        } else if (this.d != null || (s3jVar = this.g) == null) {
        } else {
            if (c(s3jVar)) {
                m59 m59Var = this.e;
                if (m59Var != null) {
                    m59Var.f19486a = frm.e;
                }
                TLog.loge("我淘二屏数据层", "feed降级，不预请求");
                return;
            }
            m59 m59Var2 = this.e;
            if (m59Var2 != null) {
                m59Var2.h();
            }
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fa02b7", new Object[]{this});
        } else if (!this.h) {
            this.h = true;
            p3j.a(new a(), 2000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b<T> implements o32<JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o32 f25850a;

        public b(o32 o32Var) {
            this.f25850a = o32Var;
        }

        /* renamed from: b */
        public final void a(boolean z, String str, JSONObject jSONObject) {
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bd050f5", new Object[]{this, new Boolean(z), str, jSONObject});
                return;
            }
            this.f25850a.a(z, str, jSONObject);
            StringBuilder sb = new StringBuilder("feed数据callback返回结果:");
            if (jSONObject == null) {
                z2 = false;
            }
            sb.append(z2);
            TLog.loge("我淘二屏数据层", sb.toString());
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6c497b", new Object[]{this});
        } else if (!this.f25848a) {
            this.f25848a = true;
            s3j h = MtbDataServiceFacade.h();
            if (h != null) {
                this.g = h;
                l(h);
                if (ckf.b(this.b, "delay")) {
                    String c = lgj.c(BasementFeedDataProvider.DB_KEY_FEED_DATA);
                    i59 i59Var = null;
                    if (c != null) {
                        i59Var = BasementFeedDataProvider.INSTANCE.A(c, i59.SOURCE_FROM_DISK, null);
                    }
                    if (i59Var != null && k(i59Var)) {
                        TLog.loge("我淘二屏数据层", "launch,本地有可用数据，则不需要预请求");
                        this.d = i59Var;
                    }
                }
            }
        }
    }

    @Override // tb.tib
    public JSONObject a(o32<JSONObject> o32Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("feb355fc", new Object[]{this, o32Var});
        }
        ckf.h(o32Var, "callback");
        if (this.d != null) {
            TLog.loge("我淘二屏数据层", "前端问客户端要feed数据, 本地数据可用");
            BasementFeedDataProvider basementFeedDataProvider = BasementFeedDataProvider.INSTANCE;
            i59 i59Var = this.d;
            if (i59Var != null) {
                JSONObject H = basementFeedDataProvider.H(i59Var.f21099a);
                o32Var.a(true, null, H);
                j();
                return H;
            }
            ckf.s();
            throw null;
        }
        m59 m59Var = this.e;
        if (m59Var != null) {
            JSONObject f = m59Var.f(new b(o32Var));
            StringBuilder sb = new StringBuilder("feed数据同步返回结果:");
            if (f == null) {
                z = false;
            }
            sb.append(z);
            TLog.loge("我淘二屏数据层", sb.toString());
            j();
            return f;
        }
        TLog.loge("我淘二屏数据层", "前端问客户端要feed数据, 客户端啥都没有");
        o32Var.a(false, null, null);
        return null;
    }

    @Override // tb.tib
    public boolean c(s3j s3jVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e89e731", new Object[]{this, s3jVar})).booleanValue();
        }
        ckf.h(s3jVar, "mtbHomePageVO");
        JSONObject a2 = s3jVar.a();
        if (ckf.b(a2 != null ? a2.getBoolean("disableDowngradePrestrain") : null, Boolean.TRUE)) {
            return false;
        }
        JSONObject a3 = s3jVar.a();
        return ((a3 == null || (jSONObject = a3.getJSONObject("bizParams")) == null) ? false : jSONObject.getBooleanValue("isDowngradePrestrain")) || ckf.b("1", OrangeConfig.getInstance().getConfig("mpm_data_switch", "isDowngradePrestrainTaoFriend", null));
    }

    public final boolean k(i59 i59Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9aa9b03", new Object[]{this, i59Var})).booleanValue();
        }
        if (ckf.b(i59Var.b, i59.SOURCE_FROM_PAGE_PRELOAD) || ckf.b(this.b, BasementFeedDataProvider.PRELOAD_TYPE_INTIME)) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = i59Var.c;
        long j2 = (currentTimeMillis - j) / 1000;
        if (j > 0 && j2 < this.c) {
            return true;
        }
        Log.e("BasementFeedData", "过期过期 delta=" + j2 + " preloadExpireTime=" + this.c);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(tb.s3j r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p32.l(tb.s3j):void");
    }
}
