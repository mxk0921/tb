package tb;

import android.app.Application;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.appcompat.taobao.util.Globals;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.SkipStyle;
import com.taobao.mmad.data.BaseMmAdModel;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class owi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cq6 f25712a;
    public final nj8 b;
    public final vu7 c;
    public final j0o d;
    public final ksg e;
    public final nwi f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends nwi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(mh2 mh2Var) {
            super(mh2Var);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/MmAdManager$1");
        }

        @Override // tb.nwi
        public cq6 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cq6) ipChange.ipc$dispatch("289b90a2", new Object[]{this});
            }
            return owi.a(owi.this);
        }

        @Override // tb.nwi
        public vu7 e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vu7) ipChange.ipc$dispatch("910ab568", new Object[]{this});
            }
            return owi.c(owi.this);
        }

        @Override // tb.nwi
        public nj8 f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nj8) ipChange.ipc$dispatch("6efca0c0", new Object[]{this});
            }
            return owi.b(owi.this);
        }

        @Override // tb.nwi
        public j0o g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j0o) ipChange.ipc$dispatch("5d32a06", new Object[]{this});
            }
            return owi.d(owi.this);
        }
    }

    static {
        t2o.a(573571075);
    }

    public owi(mh2 mh2Var) {
        a aVar = new a(mh2Var);
        this.f = aVar;
        lf4.i();
        this.f25712a = new cq6(aVar);
        this.b = new nj8(aVar);
        this.c = new vu7(aVar);
        this.d = new j0o(aVar);
        this.e = new ksg(aVar);
    }

    public static /* synthetic */ cq6 a(owi owiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cq6) ipChange.ipc$dispatch("94c09312", new Object[]{owiVar});
        }
        return owiVar.f25712a;
    }

    public static /* synthetic */ nj8 b(owi owiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nj8) ipChange.ipc$dispatch("79a69338", new Object[]{owiVar});
        }
        return owiVar.b;
    }

    public static /* synthetic */ vu7 c(owi owiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vu7) ipChange.ipc$dispatch("c662509", new Object[]{owiVar});
        }
        return owiVar.c;
    }

    public static /* synthetic */ j0o d(owi owiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0o) ipChange.ipc$dispatch("1129deb8", new Object[]{owiVar});
        }
        return owiVar.d;
    }

    public final void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2471be04", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.e.c(i, i2);
        }
    }

    public final void f(BaseMmAdModel baseMmAdModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260e6c3d", new Object[]{this, baseMmAdModel});
        } else if (baseMmAdModel != null) {
            SkipStyle skipStyle = new SkipStyle();
            if (TextUtils.isEmpty(baseMmAdModel.closeTxt)) {
                str = "跳过广告";
            } else {
                str = baseMmAdModel.closeTxt;
            }
            skipStyle.skipText = str;
            skipStyle.background = R.drawable.bootimage_commercial_skip_bg;
            skipStyle.skipTextSize = 13;
            skipStyle.countTimeTextSize = 13;
            baseMmAdModel.skipStyle = skipStyle;
        }
    }

    public void g(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781b2832", new Object[]{this, list, new Integer(i)});
        } else {
            this.c.d(list, i);
        }
    }

    public nwi h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwi) ipChange.ipc$dispatch("c27496db", new Object[]{this});
        }
        return this.f;
    }

    public final void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a53905c6", new Object[]{this, new Integer(i)});
        } else {
            this.d.e();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cff9c7", new Object[]{this});
            return;
        }
        Application application = Globals.getApplication();
        if (application != null) {
            jgh.a("MmAdManager", " launchCnt instantiate: registerActivityLifecycleCallbacks. ");
            application.registerActivityLifecycleCallbacks(new g61());
        }
    }

    public void l(FrameLayout frameLayout) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd6eb0e5", new Object[]{this, frameLayout});
            return;
        }
        this.f.a().i(System.currentTimeMillis());
        this.d.g(frameLayout);
        this.e.e();
        this.f25712a.r();
        if (this.f.h()) {
            jSONObject = this.f25712a.f();
        } else {
            jSONObject = this.f25712a.h();
        }
        o4v.b(jSONObject);
        dg0.a(jSONObject, this.f.h());
    }

    public void m(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ccfb3b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        nwi nwiVar = this.f;
        if (nwiVar == null || !nwiVar.a().c()) {
            jgh.a("MmAdManager", "terminate: current not in topshow lifecycle, return");
            return;
        }
        if (this.f.a().d()) {
            this.f.a().h(false);
            if (200 == i2) {
                ik8.a(this.f);
            }
            if (201 == i2) {
                i4v.w(this.f);
            }
        }
        if (201 == i2) {
            jgh.a("MmAdManager", "terminate: SKIP");
            o4v.b(this.f25712a.e());
            i4v.x(this.f);
            dg0.a(this.f25712a.e(), this.f.h());
        } else if (200 == i2) {
            jgh.a("MmAdManager", "terminate: COUNT_DOWN_FINISH");
            i4v.n(this.f);
        }
        i(i2);
        if (205 != i) {
            e(i2, i3);
        }
    }

    public void j(List<JSONObject> list, int i) {
        int i2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe9178", new Object[]{this, list, new Integer(i)});
            return;
        }
        this.f.a().e();
        nwi nwiVar = this.f;
        if (1000 != i) {
            z = false;
        }
        nwiVar.j(z);
        if (lf4.e()) {
            this.d.b().p(null);
        }
        this.f25712a.o(list, i);
        if (this.f25712a.a() == null) {
            jgh.a("MmAdManager", "loadAdData: adModel is null");
            i2 = 2002;
        } else {
            f(this.f25712a.a());
            this.f25712a.a().isColdStart = this.f.h();
            i2 = 2001;
        }
        jgh.a("MmAdManager", "loadAdData: resultCode: " + i2);
        this.f.c().d(this.f25712a.a(), i, i2);
    }
}
