package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.w0o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l5k implements iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f23121a;
    public int b = 0;
    public int c = 0;

    static {
        t2o.a(295699236);
        t2o.a(444596939);
    }

    public l5k() {
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b("live_gl").g0(false).F());
        this.f23121a = dinamicXEngine;
        bh5.a(dinamicXEngine);
        dinamicXEngine.W0(1544903441687469454L, new deg());
        dinamicXEngine.a1(this);
    }

    public LVView a(Context context, teg tegVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LVView) ipChange.ipc$dispatch("8017050b", new Object[]{this, context, tegVar, map});
        }
        LVView lVView = new LVView(context, this, tegVar, map);
        lVView.setId(R.id.item_root);
        lVView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return lVView;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        nha.j(this.b, this.c);
        this.b = 0;
        this.c = 0;
        this.f23121a.q0();
        this.f23121a.o1(this);
    }

    public void c(teg tegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e965ea", new Object[]{this, tegVar});
        } else if (tegVar != null && tegVar.c() != null && !tegVar.c().isEmpty()) {
            hha.b("NodeViewManager", "downloadTemplates | start download templates. page=" + tegVar.e() + " version=" + tegVar.b());
            ArrayList arrayList = new ArrayList();
            for (ydg ydgVar : tegVar.c()) {
                if (ydgVar != null) {
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.c = ydgVar.d;
                    dXTemplateItem.f7343a = ydgVar.b;
                    dXTemplateItem.b = ydgVar.c;
                    arrayList.add(dXTemplateItem);
                }
            }
            if (arrayList.isEmpty()) {
                hha.b("NodeViewManager", "downloadTemplates | templateItems is empty.");
            } else {
                this.f23121a.p(arrayList);
            }
        }
    }

    public DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("350fca7f", new Object[]{this});
        }
        return this.f23121a;
    }

    public void e(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efaa0699", new Object[]{this, dXRootView});
        } else {
            this.f23121a.t0(dXRootView);
        }
    }

    public void f(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db36825", new Object[]{this, dXRootView});
        } else {
            this.f23121a.u0(dXRootView);
        }
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
        } else if (k66Var != null) {
            List<DXTemplateItem> list = k66Var.f22428a;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            List<DXTemplateItem> list2 = k66Var.b;
            if (list2 != null) {
                i2 = list2.size();
            }
            this.b += i;
            this.c += i2;
        }
    }

    public View g(LVView lVView, peg pegVar, JSONObject jSONObject, View view, w0o w0oVar) {
        String str;
        DXRootView dXRootView;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("728eea43", new Object[]{this, lVView, pegVar, jSONObject, view, w0oVar});
        }
        DXTemplateItem a2 = pegVar.a();
        if (a2 != null) {
            str = a2.f7343a;
        } else {
            str = "no_name";
        }
        w0o.a aVar = new w0o.a(str);
        aVar.e = a2 != null ? a2.b : -1L;
        if (view instanceof DXRootView) {
            dXRootView = (DXRootView) view;
        } else {
            hha.e("createView-" + str);
            DXResult<DXRootView> o = this.f23121a.o(lVView.getContext(), a2);
            dXRootView = o != null ? o.f7291a : null;
            hha.f();
            z = false;
        }
        if (dXRootView == null) {
            hha.b("NodeViewManager", "renderView | renderView, node=" + pegVar + " useCache=" + z + "   create view error.");
            aVar.a();
            return null;
        }
        lVView.getRenderPipeline().b(lVView, pegVar, dXRootView, jSONObject, w0oVar, aVar);
        return dXRootView;
    }
}
