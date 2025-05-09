package com.taobao.tao.topmultitab.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.HomeControllerServiceImpl;
import tb.ahl;
import tb.bqa;
import tb.e0p;
import tb.fdc;
import tb.kbq;
import tb.m5a;
import tb.n0b;
import tb.n58;
import tb.os6;
import tb.t2o;
import tb.uqa;
import tb.xti;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_TAB_ID_DYNAMIC = "intl_tmg_dynamic";
    public static final String HOME_TAB_ID_LITE_TAO = "intl_taote";

    /* renamed from: a  reason: collision with root package name */
    public n0b f12805a;
    public n58 b;
    public ahl c;
    public Boolean d;
    public final b e;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.topmultitab.service.controller.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0728a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0728a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ChangeContainerProcess.d().e(ChangeContainerProcess.ChangeContainerType.overseaHotRevision);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(729810172);
    }

    public a(b bVar) {
        this.e = bVar;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b708a7c", new Object[0])).booleanValue();
        }
        return kbq.e(Globals.getApplication());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.f12805a != null) {
            l(HOME_TAB_ID_LITE_TAO);
            this.f12805a = null;
        }
        if (this.b != null) {
            l(HOME_TAB_ID_DYNAMIC);
            this.b = null;
        }
        m();
    }

    public void c(fdc fdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fa43b9", new Object[]{this, fdcVar});
        } else if (!e()) {
            bqa.d("OverseaTopMultiTab", "不是海外");
        } else {
            if (this.f12805a == null) {
                n0b n0bVar = new n0b(fdcVar);
                this.f12805a = n0bVar;
                h(HOME_TAB_ID_LITE_TAO, n0bVar);
            }
            if (this.b == null) {
                n58 n58Var = new n58(fdcVar);
                this.b = n58Var;
                h(HOME_TAB_ID_DYNAMIC, n58Var);
            }
            i(fdcVar);
        }
    }

    public final boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82009e2", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null && jSONObject.size() > 1) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b88c192", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            this.d = Boolean.valueOf(Boolean.parseBoolean(os6.b("overseaTopMultiTabSign", Boolean.FALSE.toString())));
        }
        return this.d.booleanValue();
    }

    public final JSONObject g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c9029d74", new Object[]{this, jSONObject});
        }
        JSONObject j = e0p.j(jSONObject);
        if (j == null) {
            return null;
        }
        return j.getJSONObject("item");
    }

    public void h(String str, IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d626b61d", new Object[]{this, str, iHomeSubTabController});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            ((HomeControllerServiceImpl.a) bVar).a(str, iHomeSubTabController);
        }
    }

    public final void i(fdc fdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2c3705", new Object[]{this, fdcVar});
        } else if (this.c == null) {
            ahl ahlVar = new ahl(fdcVar, xti.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES);
            this.c = ahlVar;
            h(xti.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES, ahlVar);
            bqa.d("OverseaTopMultiTab", "注册海外推荐controller");
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77c623e", new Object[]{this, new Boolean(z)});
        } else if (this.d.booleanValue() != z) {
            this.d = Boolean.valueOf(z);
            os6.h("overseaTopMultiTabSign", String.valueOf(z));
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4475bd", new Object[]{this, str});
            return;
        }
        b bVar = this.e;
        if (bVar != null) {
            ((HomeControllerServiceImpl.a) bVar).b(str);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb564f55", new Object[]{this});
        } else if (this.c != null) {
            l(xti.TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES);
            this.c = null;
        }
    }

    public boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42fdf7ad", new Object[]{this, jSONObject})).booleanValue();
        }
        if (e()) {
            return k(g(jSONObject));
        }
        uqa.b("OverseaTopMultiTab", "OverseaTopMultiTab", "不是海外版本，不处理");
        return false;
    }

    public final boolean k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("692bbfa2", new Object[]{this, jSONObject})).booleanValue();
        }
        boolean f = f();
        boolean d = d(jSONObject);
        j(d);
        uqa.b("OverseaTopMultiTab", "OverseaTopMultiTab", "isExistMultiTabBySearchBar ： " + d + ", isCurrentMultiTab: " + f);
        if (d == f) {
            return false;
        }
        uqa.b("OverseaTopMultiTab", "OverseaTopMultiTab", "海外容器热切");
        m5a.a().g(new RunnableC0728a(), 0L);
        return true;
    }
}
