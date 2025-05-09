package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a7d;
import tb.gee;
import tb.u8c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n4a implements u8c, ITMSPage.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f24504a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final a7d.b c = new a();
    public final gee.b d = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements a7d.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.a7d.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db0f3109", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            ITMSPage h = n4a.h(n4a.this);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("windowWidth", (Object) Integer.valueOf(i));
            jSONObject.put("windowHeight", (Object) Integer.valueOf(i2));
            xhv xhvVar = xhv.INSTANCE;
            h.y("onWindowResize", jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements gee.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gee.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9419d2a", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (q9s.J1() && n4a.g(n4a.this).compareAndSet(false, true)) {
                n4a.h(n4a.this).getInstance().o0();
            }
        }
    }

    static {
        t2o.a(834666560);
        t2o.a(834666566);
        t2o.a(839909868);
    }

    public n4a(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f24504a = iTMSPage;
    }

    public static final /* synthetic */ AtomicBoolean g(n4a n4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("74940876", new Object[]{n4aVar});
        }
        return n4aVar.b;
    }

    public static final /* synthetic */ ITMSPage h(n4a n4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("e4275173", new Object[]{n4aVar});
        }
        return n4aVar.f24504a;
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        u8c.a.b(this, iTMSPage);
        iTMSPage.v(this);
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage.b
    public void a(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0ee080", new Object[]{this, iTMSPage});
        } else {
            ckf.g(iTMSPage, "page");
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        u8c.a.c(this);
        a7d a7dVar = (a7d) this.f24504a.getExtension(a7d.class);
        if (a7dVar != null) {
            a7dVar.Z0(this.c);
        }
        gee geeVar = (gee) this.f24504a.getInstance().getExtension(gee.class);
        if (geeVar != null) {
            geeVar.i(this.d);
        }
    }

    @Override // com.taobao.themis.kernel.page.ITMSPage.b
    public void f(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e2d820", new Object[]{this, iTMSPage});
            return;
        }
        ckf.g(iTMSPage, "page");
        if (q9s.R0()) {
            a7d a7dVar = (a7d) iTMSPage.getExtension(a7d.class);
            if (a7dVar != null) {
                a7dVar.r0(this.c);
            }
            gee geeVar = (gee) iTMSPage.getInstance().getExtension(gee.class);
            if (geeVar != null) {
                geeVar.J(this.d);
            }
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            u8c.a.a(this);
        }
    }
}
