package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.pub_kit.config.PubContainerConfigClient;
import com.taobao.themis.pub_kit.guide.model.PubUserGuideModule;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class y2n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f31809a;
    public final String b;
    public final String c;
    public PubUserGuideModule d;
    public final CountDownLatch e = new CountDownLatch(1);
    public final CopyOnWriteArrayList<b> f = new CopyOnWriteArrayList<>();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final String h = mcs.d("PubContainerConfigTask");
    public final Runnable i = new d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(845152334);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void onResult(PubUserGuideModule pubUserGuideModule);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements z54<JSONObject, JSONObject> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public void onFailure(String str, String str2, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("476d5dea", new Object[]{this, str, str2, jSONObject});
                return;
            }
            String g = y2n.g(y2n.this);
            String b = y2n.b(y2n.this);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "error", str);
            jSONObject2.put((JSONObject) "errorMessage", str2);
            jSONObject2.put((JSONObject) "data", (String) jSONObject);
            xhv xhvVar = xhv.INSTANCE;
            mcs.c("PubContainerConfigTask", mcs.EVENT_ON_ERROR, g, b, jSONObject2);
            if (y2n.a(y2n.this).get()) {
                TMSLogger.b("PubContainerConfigTask", "mtop请求超时");
                return;
            }
            y2n.a(y2n.this).set(true);
            y2n.e(y2n.this).countDown();
            Iterator it = y2n.c(y2n.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).onResult(null);
            }
            y2n.c(y2n.this).clear();
            TMSLogger.b("PubContainerConfigTask", "errorCode = " + ((Object) str) + ", errorMsg = " + ((Object) str2) + ", response = " + jSONObject);
        }

        /* renamed from: b */
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            mcs.e("PubContainerConfigTask", mcs.EVENT_ON_SUCCESS, y2n.g(y2n.this), y2n.b(y2n.this), jSONObject);
            CommonExtKt.l(y2n.f(y2n.this));
            if (y2n.a(y2n.this).get()) {
                TMSLogger.b("PubContainerConfigTask", "mtop请求超时");
                return;
            }
            y2n.a(y2n.this).set(true);
            y2n.h(y2n.this, jSONObject == null ? null : (PubUserGuideModule) jSONObject.toJavaObject(PubUserGuideModule.class));
            y2n.e(y2n.this).countDown();
            Iterator it = y2n.c(y2n.this).iterator();
            while (it.hasNext()) {
                ((b) it.next()).onResult(y2n.d(y2n.this));
            }
            y2n.c(y2n.this).clear();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!y2n.a(y2n.this).get()) {
                String g = y2n.g(y2n.this);
                String b = y2n.b(y2n.this);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "error", (String) 1000);
                jSONObject.put((JSONObject) "errorMessage", "PubContainerConfigTask is timeout");
                jSONObject.put((JSONObject) "data", (String) null);
                xhv xhvVar = xhv.INSTANCE;
                mcs.c("PubContainerConfigTask", mcs.EVENT_ON_ERROR, g, b, jSONObject);
                y2n.a(y2n.this).set(true);
                y2n.e(y2n.this).countDown();
                Iterator it = y2n.c(y2n.this).iterator();
                while (it.hasNext()) {
                    ((b) it.next()).onResult(null);
                }
                y2n.c(y2n.this).clear();
                TMSLogger.b("PubContainerConfigTask", "mtop超时无回调");
            }
        }
    }

    static {
        t2o.a(845152333);
    }

    public y2n(String str, String str2, String str3) {
        ckf.g(str, "appId");
        ckf.g(str3, "traceId");
        this.f31809a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final /* synthetic */ AtomicBoolean a(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("3817b078", new Object[]{y2nVar});
        }
        return y2nVar.g;
    }

    public static final /* synthetic */ String b(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0ebfe53", new Object[]{y2nVar});
        }
        return y2nVar.h;
    }

    public static final /* synthetic */ CopyOnWriteArrayList c(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("5c968f4f", new Object[]{y2nVar});
        }
        return y2nVar.f;
    }

    public static final /* synthetic */ PubUserGuideModule d(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("815d7508", new Object[]{y2nVar});
        }
        return y2nVar.d;
    }

    public static final /* synthetic */ CountDownLatch e(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("82e8d1b3", new Object[]{y2nVar});
        }
        return y2nVar.e;
    }

    public static final /* synthetic */ Runnable f(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("1aa64732", new Object[]{y2nVar});
        }
        return y2nVar.i;
    }

    public static final /* synthetic */ String g(y2n y2nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5424c600", new Object[]{y2nVar});
        }
        return y2nVar.c;
    }

    public static final /* synthetic */ void h(y2n y2nVar, PubUserGuideModule pubUserGuideModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4c63ac4", new Object[]{y2nVar, pubUserGuideModule});
        } else {
            y2nVar.d = pubUserGuideModule;
        }
    }

    public final void i(boolean z, boolean z2) {
        PubContainerConfigClient.PubContainerConfigRequestParam pubContainerConfigRequestParam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f099a4fc", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!z) {
            this.g.set(true);
            this.e.countDown();
            Iterator<b> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().onResult(null);
            }
            this.f.clear();
        } else {
            mcs.e("PubContainerConfigTask", mcs.EVENT_ON_EXECUTE, this.c, this.h, new JSONObject());
            if (z2) {
                String str = this.f31809a;
                String str2 = this.b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enableAddIconButton", (Object) Boolean.TRUE);
                xhv xhvVar = xhv.INSTANCE;
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(str, str2, jSONObject);
            } else {
                pubContainerConfigRequestParam = new PubContainerConfigClient.PubContainerConfigRequestParam(this.f31809a, this.b, null);
            }
            mcs.e("PubContainerConfigTask", mcs.EVENT_ON_START, this.c, this.h, new JSONObject(pubContainerConfigRequestParam.toMap()));
            new PubContainerConfigClient(pubContainerConfigRequestParam, new c()).a();
            CommonExtKt.p(this.i, 3000L);
        }
    }

    public final PubUserGuideModule j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("88230b1e", new Object[]{this});
        }
        return this.d;
    }

    public final void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628cf71d", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        if (this.g.get()) {
            bVar.onResult(this.d);
        } else {
            this.f.add(bVar);
        }
    }

    public final PubUserGuideModule l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubUserGuideModule) ipChange.ipc$dispatch("190f8143", new Object[]{this});
        }
        if (this.g.get()) {
            return this.d;
        }
        try {
            this.e.await(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TMSLogger.c("PubContainerConfigTask", th.getMessage(), th);
        }
        return this.d;
    }
}
