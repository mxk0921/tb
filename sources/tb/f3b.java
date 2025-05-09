package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f3b implements cbd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> d;

    /* renamed from: a  reason: collision with root package name */
    public final zbm f18971a;
    public final sfm b;
    public Activity c;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add("popDataDeltaRequest");
        arrayList.add("popDataBaseRequest");
    }

    public f3b(sfm sfmVar, zbm zbmVar) {
        this.b = sfmVar;
        this.f18971a = zbmVar;
    }

    public void A(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c76578c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onSubScrollStateChanged:" + i);
        this.f18971a.u(viewGroup, i);
    }

    @Override // tb.cbd
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c34ab62e", new Object[]{this, str})).booleanValue();
        }
        return this.b.h(str);
    }

    @Override // tb.cbd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b608f3c6", new Object[]{this, str});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onUcpTrigger: " + str);
        this.b.m(str);
    }

    @Override // tb.cbd
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf4c8e9", new Object[]{this, str});
        } else {
            this.b.o(str);
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[]{this})).booleanValue();
        }
        Activity activity = this.c;
        if (activity == null || !TBDeviceUtils.p(activity.getApplication())) {
            return false;
        }
        return true;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onAppToBackground");
        this.b.k();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onAppToFront");
        this.b.l();
    }

    public void h(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
        } else {
            this.f18971a.n(i, view, str);
        }
    }

    public void i(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
        } else {
            this.f18971a.o(i, view, str);
        }
    }

    public void j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dadc094", new Object[]{this, activity});
        } else if (activity != null) {
            vfm.f("HomePopLifecycle ", "++++++ onCreate, activity=".concat(activity.getClass().getName()));
            this.c = activity;
            this.b.g(activity);
        }
    }

    public void k(boolean z, String str, List<JSONObject> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896829f6", new Object[]{this, new Boolean(z), str, list});
            return;
        }
        StringBuilder sb = new StringBuilder("++++++ onDataRefresh:");
        sb.append(z);
        sb.append(", requestType=");
        sb.append(str);
        sb.append(", popDataSize = ");
        if (list != null) {
            i = list.size();
        }
        sb.append(i);
        vfm.f("HomePopLifecycle ", sb.toString());
        this.b.n(z, str, list);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onDestroy");
        this.b.d();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff0a9cc", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onFirstFrameRenderFinish");
        this.b.j();
    }

    public void n(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onIconScroll:" + i);
        this.f18971a.p(i);
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb0d3df", new Object[]{this, new Integer(i)});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onInfoFlowEnter:" + i);
        this.f18971a.q(i);
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaf9f60", new Object[]{this, new Integer(i)});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onInfoFlowLeave:" + i);
        this.f18971a.r(i);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onPause");
        if (!e()) {
            this.f18971a.r(0);
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26527412", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onPopLayerDismiss");
        this.f18971a.s();
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99562ea3", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onPopLayerShow");
        this.f18971a.t();
    }

    public void u(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c82bad", new Object[]{this, str, jSONObject});
            return;
        }
        this.b.p(str, jSONObject);
        if (!((ArrayList) d).contains(str)) {
            String jSONString = JSON.toJSONString(this.f18971a.d());
            vfm.f("HomePopLifecycle ", "++++++ onRequestStart:" + str + ", params=" + jSONString);
            jSONObject.put(PopConst.POP_BIZ_PARAMS_KEY, (Object) jSONString);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onResume");
        if (!e()) {
            this.f18971a.q(0);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onStart");
        if (e()) {
            this.f18971a.q(0);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onStop");
        if (e()) {
            this.f18971a.r(0);
        }
    }

    public void z(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5cbab5", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f18971a.D(i, i2);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ editionChanged");
        this.b.n(true, "onEditionChange", null);
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbcebe0", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onLoginSuccess");
        this.b.n(true, "onEditionChange", null);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f39e510", new Object[]{this});
            return;
        }
        vfm.f("HomePopLifecycle ", "++++++ onScreenChanged");
        this.b.n(true, "onScreenChanged", null);
    }
}
