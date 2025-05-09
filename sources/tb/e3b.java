package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.event.IPopMessageListener;
import com.taobao.homepage.pop.protocol.event.IPopViewEventListener;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.viewmodel.PopDataViewModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean k;

    /* renamed from: a  reason: collision with root package name */
    public final PopDataViewModel f18241a;
    public final pfw b;
    public final zbm c;
    public final f3b d;
    public final h3b e;
    public final tfm f;
    public final had g;
    public final fbd h;
    public final uad i;
    public final bbd j;

    public e3b(had hadVar, fbd fbdVar, uad uadVar, bbd bbdVar) {
        this.g = hadVar;
        this.h = fbdVar;
        this.i = uadVar;
        this.j = bbdVar;
        PopDataViewModel popDataViewModel = new PopDataViewModel();
        this.f18241a = popDataViewModel;
        pfw pfwVar = new pfw();
        this.b = pfwVar;
        tfm tfmVar = new tfm();
        this.f = tfmVar;
        zbm zbmVar = new zbm(this, pfwVar);
        this.c = zbmVar;
        f3b f3bVar = new f3b(new sfm(this, popDataViewModel, tfmVar), zbmVar);
        this.d = f3bVar;
        this.e = new h3b(f3bVar, tfmVar);
        a(new j64(bbdVar));
        b(new k64(bbdVar));
        c(new lim());
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5187655e", new Object[0]);
            return;
        }
        k = true;
        vfm.f("HomePopEngine ", "setFirstRenderFinish=true");
    }

    public boolean A(int i, IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("333074b6", new Object[]{this, new Integer(i), iPopData})).booleanValue();
        }
        return this.c.w(i, iPopData);
    }

    public void B(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d36dd", new Object[]{this, new Integer(i), str});
            return;
        }
        IPopData i2 = i(str);
        if (i2 != null) {
            i2.resetShowCount();
            this.c.v(i, str);
        }
    }

    public void a(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f4f713", new Object[]{this, iPopViewEventListener});
        } else {
            this.f.c(iPopViewEventListener);
        }
    }

    public void b(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6472282e", new Object[]{this, iPopMessageListener});
        } else {
            this.f.d(iPopMessageListener);
        }
    }

    public void c(ebd ebdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5094bde", new Object[]{this, ebdVar});
        } else {
            this.f.e(ebdVar);
        }
    }

    public had d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (had) ipChange.ipc$dispatch("7fccde1d", new Object[]{this});
        }
        return this.g;
    }

    public pad e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pad) ipChange.ipc$dispatch("26b3ad1d", new Object[]{this, new Integer(i)});
        }
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        if (i != 3) {
            return this.j;
        }
        return this.g;
    }

    public zbm f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zbm) ipChange.ipc$dispatch("4050592b", new Object[]{this});
        }
        return this.c;
    }

    public h3b g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3b) ipChange.ipc$dispatch("3eca31fb", new Object[]{this});
        }
        return this.e;
    }

    public uad h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uad) ipChange.ipc$dispatch("25a79469", new Object[]{this});
        }
        return this.i;
    }

    public IPopData i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("4bbd77f8", new Object[]{this, str});
        }
        return this.f18241a.getPopDataByBusinessId(str);
    }

    public f3b j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f3b) ipChange.ipc$dispatch("be07e866", new Object[]{this});
        }
        return this.d;
    }

    public bbd k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbd) ipChange.ipc$dispatch("bb71791d", new Object[]{this});
        }
        return this.j;
    }

    public BasePopContainer l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopContainer) ipChange.ipc$dispatch("3b613526", new Object[]{this, new Integer(i)});
        }
        return this.c.e(i);
    }

    public fbd m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbd) ipChange.ipc$dispatch("8c25157b", new Object[]{this});
        }
        return this.h;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf14e19a", new Object[]{this})).booleanValue();
        }
        return k;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
        } else {
            this.c.l();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3baf87", new Object[]{this});
        } else {
            this.c.m();
        }
    }

    public void q(int i, Class<? extends dbd> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85313e5", new Object[]{this, new Integer(i), cls});
        } else {
            this.b.b(i, cls);
        }
    }

    public void r(IPopViewEventListener iPopViewEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6cc36", new Object[]{this, iPopViewEventListener});
        } else {
            this.f.f(iPopViewEventListener);
        }
    }

    public void s(IPopMessageListener iPopMessageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3853fd51", new Object[]{this, iPopMessageListener});
        } else {
            this.f.g(iPopMessageListener);
        }
    }

    public void t(ebd ebdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f17ac1", new Object[]{this, ebdVar});
        } else {
            this.f.h(ebdVar);
        }
    }

    public void v(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63834865", new Object[]{this, new Integer(i), str});
        } else {
            this.c.F(i, str);
        }
    }

    public void w(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf50ba7", new Object[]{this, str, str2, jSONObject});
        } else {
            this.c.E(str, str2, jSONObject);
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2cf362e", new Object[]{this, str});
        } else {
            this.c.A(str);
        }
    }

    public void y(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a047d50", new Object[]{this, new Integer(i), str});
        } else if (!TextUtils.isEmpty(str)) {
            this.c.v(i, str);
        }
    }

    public void z(IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76499b71", new Object[]{this, iPopData});
        } else if (!this.f18241a.insertCustomPopData(this, iPopData)) {
            vfm.f("HomePopEngine ", "triggerPopShowByCustomData error, data invalid");
        } else {
            this.c.z(this, this.f18241a);
        }
    }
}
