package com.taobao.flowcustoms.afc.xbs;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.xbs.TipsView;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.HashMap;
import tb.ah0;
import tb.fxt;
import tb.hxt;
import tb.k81;
import tb.pg0;
import tb.qg0;
import tb.rg0;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a implements hxt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f10580a = false;
    public Application.ActivityLifecycleCallbacks b = null;
    public qg0 c;

    static {
        t2o.a(467664988);
        t2o.a(467664987);
    }

    @Override // tb.hxt
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6cf52a", new Object[]{this, str});
        }
    }

    @Override // tb.hxt
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6785ff15", new Object[]{this, activity});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b372e5d9", new Object[]{this});
            return;
        }
        this.f10580a = false;
        TipsView.v().u();
    }

    public boolean e(qg0 qg0Var, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3570e456", new Object[]{this, qg0Var, afcXbsData})).booleanValue();
        }
        this.c = qg0Var;
        p(qg0Var, afcXbsData);
        if (this.f10580a) {
            k();
        }
        return false;
    }

    public HashMap<String, String> f() {
        String str;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4aa26f3d", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str4 = AfcCustomSdk.h().b;
        String b = k81.c().b();
        qg0 qg0Var = this.c;
        if (qg0Var != null) {
            str2 = qg0Var.c;
            str = qg0Var.f26733a;
            str3 = qg0Var.g;
        } else {
            str2 = "";
            str3 = str2;
            str = str3;
        }
        hashMap.put("currentVC", b);
        hashMap.put("currentAppkey", str4);
        hashMap.put("backAppkey", str);
        hashMap.put("targetUrl", str3);
        hashMap.put(rg0.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
        hashMap.put(rg0.SOURCE_SDK_VERSION, str2);
        return hashMap;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
            return;
        }
        m();
        q();
        s();
        d();
        this.f10580a = false;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab825b21", new Object[]{this});
        } else {
            TipsView.v().w();
        }
    }

    public Application.ActivityLifecycleCallbacks i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("a5f2ebf1", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new fxt(this);
        }
        return this.b;
    }

    public boolean j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79aced8", new Object[]{this, activity})).booleanValue();
        }
        return true;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcda08f", new Object[]{this});
        } else if (this.b == null) {
            this.b = i();
            AfcCustomSdk.h().f10563a.registerActivityLifecycleCallbacks(this.b);
            vp9.a("linkx", "registerActivityLifecycleCallbacks alc = " + this.b);
        }
    }

    public void l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2108915e", new Object[]{this, activity});
            return;
        }
        String str = this.c.b;
        if (TextUtils.isEmpty(str)) {
            str = activity.getResources().getString(R.string.open_oauth_back);
        }
        TipsView.v().E(str).G(activity);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc84cfd", new Object[]{this});
        } else {
            ah0.c(2101, ah0.ARG1_FLOW_BACK, "", "", f());
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4699072d", new Object[]{this});
        } else {
            ah0.c(2201, ah0.ARG1_FLOW_EXPOSE, "", "", f());
        }
    }

    public void o(AfcXbsData afcXbsData) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872168ec", new Object[]{this, afcXbsData});
            return;
        }
        this.f10580a = true;
        String str = afcXbsData.appName;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = afcXbsData.expireTime;
        if (j2 > 0) {
            j = j2 * 1000;
        } else {
            j = 10;
        }
        TipsView.v().E(str).A(BigDecimal.valueOf(currentTimeMillis + j)).C(TipsView.FloatingType.SHOW_ONCE).D(this).F();
    }

    @Override // tb.hxt
    public void onClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
        } else {
            g();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a421c43", new Object[]{this});
        } else if (AfcCustomSdk.h().f10563a != null) {
            pg0.i().p(AfcCustomSdk.h().f10563a, this.c);
        }
    }

    public void r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54dbabc", new Object[]{this, activity});
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6a9cc8", new Object[]{this});
        }
    }

    @Override // tb.hxt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9255cc7", new Object[]{this});
            return;
        }
        this.f10580a = false;
        s();
        vp9.a("linkx", "showPop  === onTimeOver");
    }

    public final void p(qg0 qg0Var, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7569f1", new Object[]{this, qg0Var, afcXbsData});
        } else if (!TextUtils.equals(qg0Var.e, "sku")) {
            if (!TextUtils.isEmpty(qg0Var.g)) {
                o(afcXbsData);
                this.f10580a = true;
                n();
                return;
            }
            this.f10580a = false;
            s();
            h();
            d();
        }
    }
}
