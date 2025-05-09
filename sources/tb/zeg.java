package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zeg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public l5k f32707a;

    static {
        t2o.a(295699235);
    }

    public final void a(LVView lVView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d322b92", new Object[]{this, lVView});
        } else if (lVView != null && iw0.j(lVView.getContext())) {
            TextView textView = new TextView(lVView.getContext());
            textView.setText("L");
            textView.setTextColor(-65536);
            textView.setTextSize(12.0f);
            lVView.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public LVView b(Context context, teg tegVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LVView) ipChange.ipc$dispatch("8017050b", new Object[]{this, context, tegVar, map});
        }
        return g().a(context, tegVar, map);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            g().b();
        }
    }

    public void d(teg tegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e965ea", new Object[]{this, tegVar});
        } else {
            g().c(tegVar);
        }
    }

    public final int e(Context context, LinearLayout linearLayout, peg pegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13d93ed5", new Object[]{this, context, linearLayout, pegVar})).intValue();
        }
        int c = nw0.c(ikr.f().e(), context, pegVar.f.getIntValue("y"));
        hha.b("LVRender", "getBottomMargin | y=" + c + " c=" + pegVar.c);
        return c;
    }

    public final int[] f(Context context, peg pegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("55652478", new Object[]{this, context, pegVar});
        }
        JSONObject jSONObject = pegVar.f;
        DinamicXEngine e = ikr.f().e();
        return new int[]{nw0.c(e, context, jSONObject.getIntValue("h")), nw0.c(e, context, jSONObject.getIntValue("w")), nw0.c(e, context, jSONObject.getIntValue("x")), nw0.c(e, context, jSONObject.getIntValue("y"))};
    }

    public l5k g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5k) ipChange.ipc$dispatch("2e2a3c17", new Object[]{this});
        }
        if (this.f32707a == null) {
            this.f32707a = new l5k();
        }
        return this.f32707a;
    }

    public final boolean h(peg pegVar, JSONObject jSONObject, w0o w0oVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd3379fe", new Object[]{this, pegVar, jSONObject, w0oVar})).booleanValue();
        }
        if (!(pegVar == null || (jSONObject2 = pegVar.f) == null)) {
            String string = jSONObject2.getString("dependency");
            if (!TextUtils.isEmpty(string)) {
                long nanoTime = System.nanoTime();
                Object a2 = qm7.a(string, "", new bn7.b().j(jSONObject).f());
                w0oVar.i += System.nanoTime() - nanoTime;
                hha.a("LVRender", "isComponentNeeded | node=" + pegVar.c + "   dependencyExpression=" + string + " result=" + o66.d(a2));
                return o66.d(a2);
            }
        }
        return true;
    }

    public final void j(LVView lVView, teg tegVar, kfg kfgVar, JSONObject jSONObject, w0o w0oVar) {
        List<peg> list;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123b803b", new Object[]{this, lVView, tegVar, kfgVar, jSONObject, w0oVar});
            return;
        }
        peg c = kfgVar.c();
        if (!c.b() || (list = c.b) == null || ((ArrayList) list).isEmpty()) {
            w0oVar.g = "2";
            return;
        }
        JSONObject jSONObject2 = c.f;
        if (jSONObject2 != null) {
            z = yqq.i(jSONObject2.getString("exclusion"), false);
        } else {
            z = false;
        }
        Iterator it = ((ArrayList) c.b).iterator();
        while (it.hasNext()) {
            peg pegVar = (peg) it.next();
            if (pegVar != null && h(pegVar, jSONObject, w0oVar)) {
                if (pegVar.b()) {
                    j(lVView, tegVar, kfgVar.a(kfgVar, pegVar), jSONObject, w0oVar);
                } else if (pegVar.e()) {
                    l(lVView, kfgVar, jSONObject, tegVar, pegVar, w0oVar);
                } else if (pegVar.f()) {
                    Iterator it2 = ((ArrayList) pegVar.b).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        peg pegVar2 = (peg) it2.next();
                        if (h(pegVar2, jSONObject, w0oVar)) {
                            l(lVView, kfgVar, jSONObject, tegVar, pegVar2, w0oVar);
                            break;
                        }
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    public void k(LVView lVView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e0206e", new Object[]{this, lVView, str, jSONObject});
            return;
        }
        peg d = lVView.getPageInfo().d(str);
        if (d == null) {
            hha.b("LVRender", "renderSubNode | component empty, node=" + str);
            return;
        }
        long nanoTime = System.nanoTime();
        w0o w0oVar = new w0o(lVView.getPageCode(), str, false, nanoTime);
        lVView.resetAndCacheView();
        lVView.createRootRenderNode(d);
        j(lVView, lVView.getPageInfo(), lVView.getRenderNode(), jSONObject, w0oVar);
        lVView.getRenderPipeline().e();
        a(lVView);
        long nanoTime2 = System.nanoTime();
        w0oVar.h = nanoTime2 - nanoTime;
        hha.a("LVRender", "renderPageNode | node=" + str + " renderTime=" + w0oVar.h);
        if (!lVView.isEnableRenderPipeline()) {
            ffg.e(w0oVar);
            ffg.b(w0oVar, false, nanoTime2);
        }
    }

    public void i(LVView lVView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0df618", new Object[]{this, lVView, str, jSONObject});
        } else if (lVView != null && jSONObject != null && !TextUtils.isEmpty(str)) {
            kfg resetLayer = lVView.resetLayer(str);
            if (resetLayer == null) {
                hha.b("LVRender", "refreshNode | node can not find.");
                return;
            }
            long nanoTime = System.nanoTime();
            w0o w0oVar = new w0o(lVView.getPageCode(), str, true, nanoTime);
            j(lVView, lVView.getPageInfo(), resetLayer, jSONObject, w0oVar);
            lVView.getRenderPipeline().e();
            long nanoTime2 = System.nanoTime();
            w0oVar.h = nanoTime2 - nanoTime;
            hha.a("LVRender", "refreshNode | node=" + str + " renderTime=" + w0oVar.h);
            if (!lVView.isEnableRenderPipeline()) {
                ffg.e(w0oVar);
                ffg.b(w0oVar, false, nanoTime2);
            }
        }
    }

    public final void l(LVView lVView, kfg kfgVar, JSONObject jSONObject, teg tegVar, peg pegVar, w0o w0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb53151", new Object[]{this, lVView, kfgVar, jSONObject, tegVar, pegVar, w0oVar});
        } else if (kfgVar != null && tegVar != null && pegVar != null && pegVar.e != null && kfgVar.d() != null && lVView != null) {
            if (!pegVar.e()) {
                hha.b("LVRender", "renderSingleComponent | node is not render, node=" + pegVar);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = pegVar.f;
            if (jSONObject3 != null) {
                jSONObject2.put("fields", (Object) fkx.d(jSONObject3.toString()));
            }
            jSONObject2.put("ultronItemData", (Object) jSONObject);
            View useCacheView = lVView.useCacheView(pegVar);
            hha.e(pegVar.e.b);
            View g = g().g(lVView, pegVar, jSONObject2, useCacheView, w0oVar);
            if (g != null) {
                hha.f();
                hha.e(pegVar.c + "_add_view");
                if (kfgVar.d() instanceof LinearLayout) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g.getLayoutParams().width, g.getLayoutParams().height);
                    layoutParams.bottomMargin = e(lVView.getContext(), (LinearLayout) kfgVar.d(), pegVar.f26043a);
                    g.setLayoutParams(layoutParams);
                    ((LinearLayout) kfgVar.d()).addView(g);
                    g.setTag(R.id.taolive_gl_lv_view_tag, new kfg(pegVar, g));
                } else {
                    long nanoTime = System.nanoTime();
                    int[] f = f(lVView.getContext(), pegVar.f26043a);
                    w0oVar.j += System.nanoTime() - nanoTime;
                    if (!(f[0] == 0 && f[1] == 0 && f[2] == 0 && f[3] == 0)) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(f[1], f[0]);
                        layoutParams2.leftMargin = f[2];
                        layoutParams2.topMargin = f[3];
                        g.setLayoutParams(layoutParams2);
                    }
                    if (kfgVar.d() instanceof ViewGroup) {
                        ((ViewGroup) kfgVar.d()).addView(g);
                        g.setTag(R.id.taolive_gl_lv_view_tag, new kfg(pegVar, g));
                    } else {
                        hha.b("LVRender", "renderSingleComponent | parent is not ViewGroup. node=" + pegVar);
                    }
                    hha.d("LVRender", "renderSingleComponent | addView time=" + (System.nanoTime() - nanoTime));
                }
                hha.f();
            }
        }
    }
}
