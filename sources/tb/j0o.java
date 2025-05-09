package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ya6 f21691a;
    public final nwi b;
    public final kgf c;
    public ViewGroup d;

    static {
        t2o.a(573571178);
    }

    public j0o(nwi nwiVar) {
        this.b = nwiVar;
        this.f21691a = new ya6(nwiVar);
        this.c = new kgf(nwiVar);
    }

    public static boolean f(nwi nwiVar) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfd59609", new Object[]{nwiVar})).booleanValue();
        }
        try {
            d = nwiVar.d().d();
        } catch (Throwable th) {
            jgh.b("RenderManager", "isUseDX error ", th);
        }
        if (!(d == null || d.size() == 0 || !d.containsKey("dxTemplateName"))) {
            String string = d.getString("dxTemplateName");
            jgh.a("RenderManager", "isUseDX dxTemplateName = " + string);
            if (!TextUtils.isEmpty(string)) {
                return true;
            }
            return false;
        }
        jgh.a("RenderManager", "isUseDX bizData not valid, splashData=" + nwiVar.d().m());
        return false;
    }

    public final void a(FrameLayout frameLayout) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b48a84", new Object[]{this, frameLayout});
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.ll_close);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = kr7.a(23.0f);
                layoutParams.width = kr7.a(75.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
        } catch (Throwable th) {
            jgh.b("RenderManager", "adapterBootImage error ", th);
        }
    }

    public ya6 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ya6) ipChange.ipc$dispatch("1a12683d", new Object[]{this});
        }
        return this.f21691a;
    }

    public kgf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kgf) ipChange.ipc$dispatch("66d697db", new Object[]{this});
        }
        return this.c;
    }

    public ViewGroup d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.d;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        this.f21691a.j();
        kgf kgfVar = this.c;
        if (kgfVar != null) {
            kgfVar.b();
        }
    }

    public void g(FrameLayout frameLayout) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4151120", new Object[]{this, frameLayout});
            return;
        }
        m0j.j(this.b, "start");
        if (frameLayout == null) {
            jgh.a("RenderManager", "render: container is null.");
            return;
        }
        this.d = frameLayout;
        this.f21691a.k();
        a(frameLayout);
        if (!f(this.b)) {
            JSONObject d = this.b.d().d();
            nwi nwiVar = this.b;
            if (d == null || !d.containsKey("dxTemplateName")) {
                str = "";
            } else {
                str = d.getJSONObject("dxTemplateName").toJSONString();
            }
            m0j.k(nwiVar, "dx_protocol_error", str);
            return;
        }
        View c = this.c.c();
        View d2 = this.f21691a.d(frameLayout.getContext());
        ecj.d(this.b);
        if (d2 != null) {
            z = true;
        }
        i4v.o(z, this.b);
        if (d2 == null) {
            jgh.a("RenderManager", "render: render view null.");
            nwi nwiVar2 = this.b;
            m0j.k(nwiVar2, "dx_create_view_error", nwiVar2.a().a());
            return;
        }
        if (!TextUtils.isEmpty(this.b.d().a().interactImage)) {
            i4v.q(this.b);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        View findViewById = frameLayout.findViewById(R.id.rv_title);
        if (findViewById != null) {
            int indexOfChild = frameLayout.indexOfChild(findViewById);
            if (c != null) {
                frameLayout.addView(c, indexOfChild, new FrameLayout.LayoutParams(layoutParams));
            }
            frameLayout.addView(d2, indexOfChild + 1, layoutParams);
        } else {
            if (c != null) {
                frameLayout.addView(c, new FrameLayout.LayoutParams(layoutParams));
            }
            frameLayout.addView(d2, layoutParams);
        }
        if (!this.f21691a.o(frameLayout.getContext())) {
            nwi nwiVar3 = this.b;
            m0j.k(nwiVar3, "dx_render_view_error", nwiVar3.a().a());
            return;
        }
        m0j.j(this.b, "success");
    }
}
