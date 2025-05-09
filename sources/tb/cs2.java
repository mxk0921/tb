package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cs2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rvk f17281a;
    public yp6 b;
    public final wcc c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.cs2$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0892a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f17283a;
            public final /* synthetic */ imn b;

            public RunnableC0892a(String str, imn imnVar) {
                this.f17283a = str;
                this.b = imnVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                yp6 a2 = cs2.a(cs2.this);
                String str = this.f17283a;
                a2.a(str, this.b.u(str), 0);
            }
        }

        public a() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
            } else if (jSONObject == null || TextUtils.isEmpty(str) || imnVar == null) {
                bqa.d("CacheDataValidator", "containerId or actionParams is null.");
            } else if (cs2.a(cs2.this) == null) {
                bqa.d("CacheDataValidator", "DataComparison is null.");
            } else {
                String string = jSONObject.getString("requestType");
                if (TextUtils.isEmpty(string)) {
                    bqa.d("CacheDataValidator", "requestType is null.");
                    return;
                }
                string.hashCode();
                if (string.equals(s0j.MTS_SUB_STAGE_LOAD_CACHE)) {
                    cs2.a(cs2.this).k(str, imnVar.u(str));
                } else if (string.equals("coldStart")) {
                    m5a.a().e(new RunnableC0892a(str, imnVar));
                }
            }
        }
    }

    static {
        t2o.a(729810094);
    }

    public cs2(wcc wccVar) {
        this.c = wccVar;
    }

    public static /* synthetic */ yp6 a(cs2 cs2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yp6) ipChange.ipc$dispatch("eabd7c2c", new Object[]{cs2Var});
        }
        return cs2Var.b;
    }

    public final rvk b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.b != null && this.f17281a != null) {
            f();
            this.b.b();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.b = new yp6();
        this.f17281a = b();
        e();
    }

    public final void e() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        wcc wccVar = this.c;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null) {
            rvk b = b();
            this.f17281a = b;
            iHomeDataService.addOnUiRefreshListener(b);
        }
    }

    public final void f() {
        IHomeDataService iHomeDataService;
        rvk rvkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        wcc wccVar = this.c;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null && (rvkVar = this.f17281a) != null) {
            iHomeDataService.removeOnUiRefreshListener(rvkVar);
        }
    }
}
