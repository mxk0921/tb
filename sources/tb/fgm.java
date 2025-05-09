package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.upp.UppProtocolImpl;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import tb.qjd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public z4a f19280a;
    public final boolean b = f4b.b("afterBuyPopShowEnable", true);
    public boolean c;
    public boolean d;
    public boolean e;
    public final lhd f;
    public qjd.b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bqa.d("PopNotify", "pageBack还在置顶态，触发下pop展示");
            fgm.a(fgm.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements qjd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.qjd.b
        public void d(String str, AwesomeGetRequestParams awesomeGetRequestParams, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c78df556", new Object[]{this, str, awesomeGetRequestParams, str2, new Boolean(z)});
            }
        }

        @Override // tb.qjd.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3987b210", new Object[]{this, str, str2, str3});
            } else if ("pageEnter".equals(str)) {
                fgm.b(fgm.this, false);
            }
        }

        @Override // tb.qjd.b
        public void b(String str, String str2, AwesomeGetData awesomeGetData, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d586a494", new Object[]{this, str, str2, awesomeGetData, new Boolean(z)});
            } else if ("pageEnter".equals(str2)) {
                fgm.b(fgm.this, true);
            }
        }
    }

    static {
        t2o.a(729809993);
    }

    public fgm(lhd lhdVar) {
        this.f = lhdVar;
        bqa.d("PopNotify", "当前的orange开关是：" + this.c);
        e();
    }

    public static /* synthetic */ void a(fgm fgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e371e6e7", new Object[]{fgmVar});
        } else {
            fgmVar.m();
        }
    }

    public static /* synthetic */ boolean b(fgm fgmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3085c54", new Object[]{fgmVar, new Boolean(z)})).booleanValue();
        }
        fgmVar.e = z;
        return z;
    }

    public final qjd.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qjd.b) ipChange.ipc$dispatch("dd6fe33e", new Object[]{this});
        }
        return new b();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        bqa.d("PopNotify", "destroy");
        l();
        n(this.f19280a);
        o();
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c696e897", new Object[]{this});
        } else if (this.f != null) {
            qjd.b c = c();
            this.g = c;
            this.f.m(c);
        }
    }

    public void h(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b376db0", new Object[]{this, z4aVar});
        } else if (this.f19280a == null) {
            this.f19280a = z4aVar;
            k(z4aVar);
            bqa.d("PopNotify", "信息流上屏了，初始化pop监听");
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de8e6617", new Object[]{this});
            return;
        }
        bqa.d("PopNotify", "不在屏幕上了");
        l();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131f859d", new Object[]{this});
        } else if (this.d) {
            m5a.a().g(new a(), 0L);
        }
    }

    public final void k(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30251696", new Object[]{this, z4aVar});
        } else if (z4aVar != null) {
            vdm.b(z4aVar.f(), null);
        }
    }

    public final void n(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c9a98f", new Object[]{this, z4aVar});
        } else if (z4aVar != null) {
            vdm.c(z4aVar.f());
        }
    }

    public final void o() {
        qjd.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c3916e", new Object[]{this});
            return;
        }
        lhd lhdVar = this.f;
        if (lhdVar != null && (bVar = this.g) != null) {
            lhdVar.r(bVar);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f422bf5e", new Object[]{this});
            return;
        }
        bqa.d("PopNotify", "信息流不完全可见了，需要触发pop隐藏");
        l();
        this.d = false;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523e6823", new Object[]{this});
            return;
        }
        bqa.d("PopNotify", "信息流完全可见了，需要触发pop展示");
        m();
        this.d = true;
    }

    public final void l() {
        z4a z4aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc313562", new Object[]{this});
        } else if (!this.b || !this.c || (z4aVar = this.f19280a) == null) {
            bqa.d("PopNotify", "当前是否允许触发pop隐藏：" + this.c + "当前是否展示过pop: " + this.c);
        } else {
            String f = z4aVar.f();
            ucm.d("afterBuyFeedsStickEnd").a(f).e();
            this.c = false;
            wrn.b(this.f19280a.b(), wrn.NOT_REACH_TOP);
            bqa.d("PopNotify", "通知pop该隐藏了,当前的页面名称是：" + f);
        }
    }

    public final void m() {
        z4a z4aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51badd9d", new Object[]{this});
        } else if (!this.b || !this.e || (z4aVar = this.f19280a) == null) {
            bqa.d("PopNotify", "当前是否允许触发pop展示：" + this.b + "当前请求是否成功：" + this.e);
        } else {
            String f = z4aVar.f();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerId", (Object) this.f19280a.b());
            UppProtocolImpl.getInstance().sendUCPEventWithScene(f, "afterBuyRecmdSticky", jSONObject);
            this.c = true;
            wrn.b(this.f19280a.b(), wrn.REACH_TOP);
            bqa.d("PopNotify", "通知ucp置顶了,当前的页面名称是：" + f);
        }
    }
}
