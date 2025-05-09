package tb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.bindingx.DXBindingXStateChangeEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kd5 extends ad5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final djj c;
    public final md5 d;

    static {
        t2o.a(444596642);
    }

    public kd5(av5 av5Var) {
        super(av5Var);
        ld5 ld5Var = new ld5();
        pd5 pd5Var = new pd5();
        md5 md5Var = new md5();
        this.d = md5Var;
        this.c = djj.b(ld5Var, null, pd5Var, md5Var);
    }

    public static /* synthetic */ void g(kd5 kd5Var, Map map, nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d111f01a", new Object[]{kd5Var, map, nd5Var});
        } else {
            kd5Var.G(map, nd5Var);
        }
    }

    public static /* synthetic */ void h(kd5 kd5Var, DXWidgetNode dXWidgetNode, nd5 nd5Var, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81042fe2", new Object[]{kd5Var, dXWidgetNode, nd5Var, new Integer(i), new Boolean(z)});
        } else {
            kd5Var.D(dXWidgetNode, nd5Var, i, z);
        }
    }

    public static /* synthetic */ void i(kd5 kd5Var, DXRootView dXRootView, DXWidgetNode dXWidgetNode, nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96254933", new Object[]{kd5Var, dXRootView, dXWidgetNode, nd5Var});
        } else {
            kd5Var.x(dXRootView, dXWidgetNode, nd5Var);
        }
    }

    public static /* synthetic */ Object ipc$super(kd5 kd5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/bindingx/DXBindingXManager");
    }

    public static String z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6553556d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@")) {
            return str;
        }
        return str.substring(1);
    }

    public void B(DXRootView dXRootView, DXWidgetNode dXWidgetNode, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2ea5f6", new Object[]{this, dXRootView, dXWidgetNode, str, map});
        } else if (dXWidgetNode == null) {
            h36.r("启动" + str + "动画失败 原因为animationWidget == null");
        } else {
            DXWidgetNode queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode();
            if (dXRootView == null || this.c == null || TextUtils.isEmpty(queryRootWidgetNode.getAnimation()) || queryRootWidgetNode.getDXRuntimeContext() == null || TextUtils.isEmpty(str)) {
                if (DinamicXEngine.j0()) {
                    h36.r("启动" + str + "动画失败 原因为rootView == null || animationWidget == null || bindingX == null\n                || TextUtils.isEmpty(rootWidget.getAnimation())\n                || rootWidget.getDXRuntimeContext() == null\n                || TextUtils.isEmpty(specName)");
                }
            } else if (!dXWidgetNode.containsExecutingAnimationSpec(str)) {
                Map<String, nd5> bindingXSpecMap = dXWidgetNode.getBindingXSpecMap();
                nd5 nd5Var = null;
                if (bindingXSpecMap == null || (nd5Var = bindingXSpecMap.get(str)) == null || (!nd5Var.h && map != null && !map.isEmpty())) {
                    nd5Var = null;
                }
                if (nd5Var == null) {
                    if (zg5.r3()) {
                        JSONObject animationObj = queryRootWidgetNode.getAnimationObj();
                        if (animationObj != null) {
                            JSONObject jSONObject = new JSONObject();
                            srf.a(animationObj, jSONObject);
                            nd5Var = o(dXWidgetNode.getEngine(), str, jSONObject, map);
                        }
                    } else {
                        nd5Var = o(dXWidgetNode.getEngine(), str, JSON.parseObject(queryRootWidgetNode.getAnimation()), map);
                    }
                }
                if (nd5Var != null) {
                    if (bindingXSpecMap == null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(str, nd5Var);
                        dXWidgetNode.setBindingXSpecMap(hashMap);
                    } else {
                        bindingXSpecMap.put(str, nd5Var);
                    }
                    if (nd5Var.b == null) {
                        j(dXRootView, nd5Var, dXWidgetNode);
                    } else if (DinamicXEngine.j0()) {
                        h36.r("启动" + str + "动画失败  当前动画已经在运行");
                    }
                } else if (DinamicXEngine.j0()) {
                    h36.r("启动" + str + "动画失败 原因为对应的动画描述是空 请检查对应的bindingx.json是否有误");
                }
            } else if (DinamicXEngine.j0()) {
                h36.r("启动" + str + "动画失败 原因为animationWidget.containsExecutingAnimationSpec(specName)");
            }
        }
    }

    public void C(DXRootView dXRootView, DXWidgetNode dXWidgetNode, JSONArray jSONArray) {
        Map<String, nd5> bindingXExecutingMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba247ed", new Object[]{this, dXRootView, dXWidgetNode, jSONArray});
        } else if (this.c != null && dXWidgetNode.getDXRuntimeContext() != null && dXRootView != null && dXRootView._containAnimationWidget(dXWidgetNode) && (bindingXExecutingMap = dXWidgetNode.getBindingXExecutingMap()) != null && !bindingXExecutingMap.isEmpty()) {
            if (jSONArray == null || jSONArray.isEmpty()) {
                for (nd5 nd5Var : bindingXExecutingMap.values()) {
                    if (nd5Var != null) {
                        F(dXRootView, dXWidgetNode, nd5Var, false, nd5Var.e, nd5Var.f);
                    }
                }
                bindingXExecutingMap.clear();
                dXRootView._removeAnimationWidget(dXWidgetNode);
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                nd5 nd5Var2 = bindingXExecutingMap.get(jSONArray.getString(i));
                if (nd5Var2 != null) {
                    F(dXRootView, dXWidgetNode, nd5Var2, true, nd5Var2.e, nd5Var2.f);
                }
            }
        }
    }

    public final void D(DXWidgetNode dXWidgetNode, nd5 nd5Var, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319d94b8", new Object[]{this, dXWidgetNode, nd5Var, new Integer(i), new Boolean(z)});
            return;
        }
        JSONArray jSONArray = nd5Var.j;
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            t(dXWidgetNode, jSONArray.getJSONObject(i2), i, z);
        }
    }

    public final void G(Map<String, Object> map, nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8ecd68", new Object[]{this, map, nd5Var});
        } else {
            nd5Var.b = map;
        }
    }

    public void j(DXRootView dXRootView, nd5 nd5Var, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57d4ae8", new Object[]{this, dXRootView, nd5Var, dXWidgetNode});
            return;
        }
        View D = dXWidgetNode.getDXRuntimeContext().D();
        if (D != null) {
            D.setTag(u86.b, dXWidgetNode);
        }
        if (DinamicXEngine.j0()) {
            h36.p("step2.1 -->  开始进入启动动画 " + nd5Var.f24656a + "的bindAnimation阶段");
        }
        Map<String, Object> a2 = this.c.a(D, nd5Var.k, new a(nd5Var, dXRootView, dXWidgetNode));
        if (a2 != null && !a2.isEmpty()) {
            G(a2, nd5Var);
            w(dXRootView, dXWidgetNode, nd5Var);
        }
    }

    public djj k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djj) ipChange.ipc$dispatch("84a197aa", new Object[]{this});
        }
        return this.c;
    }

    public final svb l(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (svb) ipChange.ipc$dispatch("18a4544a", new Object[]{this, dXWidgetNode});
        }
        if (eb5.w() && zg5.k2()) {
            return dXWidgetNode.getFlattenNode();
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode.isFlatten()) {
            return dXWidgetNode;
        }
        return dXWidgetNode.getReferenceNode();
    }

    public final String m(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc86544e", new Object[]{this, str, jSONArray});
        }
        if (("msg :action: " + str + "  spec: " + jSONArray) == null) {
            return " spec is null";
        }
        return JSON.toJSONString(jSONArray);
    }

    public void p(DXWidgetNode dXWidgetNode, long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88644e0", new Object[]{this, dXWidgetNode, new Long(j), str});
        } else if (dXWidgetNode != null) {
            dXWidgetNode.postEvent(new DXBindingXStateChangeEvent(j, str));
        }
    }

    public void q(DXRootView dXRootView, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8daebc6a", new Object[]{this, dXRootView, jSONObject});
        } else if (this.c != null && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null) {
            String string = jSONObject2.getString("action");
            if (fzo.SCROLLING.equalsIgnoreCase(string) || "scroll_beigin".equalsIgnoreCase(string) || "scroll_end".equalsIgnoreCase(string)) {
                u(jSONObject2, string);
            } else if (dXRootView == null) {
                h36.r("processDXMsg timing动画，必须要有rootview");
            } else {
                JSONArray jSONArray = jSONObject2.getJSONArray("spec");
                if (DinamicXEngine.j0()) {
                    h36.p("step1--> 收到bindingx消息: " + m(string, jSONArray));
                }
                Object obj = jSONObject2.get("widget");
                if (obj instanceof DXWidgetNode) {
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) obj;
                    if (od5.b(dXWidgetNode) == dXRootView.getExpandWidgetNode()) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                        if ("start".equalsIgnoreCase(string)) {
                            A(dXRootView, dXWidgetNode, jSONArray, jSONObject3);
                        } else if ("stop".equalsIgnoreCase(string)) {
                            C(dXRootView, dXWidgetNode, jSONArray);
                        }
                    } else if (DinamicXEngine.j0()) {
                        h36.r("rootView 被复用 动画操作失败" + m(string, jSONArray));
                    }
                }
            }
        }
    }

    public final Object r(Map<String, Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1073dc4b", new Object[]{this, map, str, str2});
        }
        if (str.length() < 2) {
            return str;
        }
        String substring = str.substring(1);
        if (map == null || !map.containsKey(substring)) {
            return "";
        }
        Object obj = map.get(substring);
        if (!"StringLiteral".equals(str2) || str.startsWith("'")) {
            return obj;
        }
        return "'" + obj + "'";
    }

    public final String s(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dce80721", new Object[]{this, map, str});
        }
        if (TextUtils.isEmpty(str) || map == null || (obj = map.get(str.substring(1))) == null) {
            return "";
        }
        return obj.toString();
    }

    public final void w(DXRootView dXRootView, DXWidgetNode dXWidgetNode, nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dce39", new Object[]{this, dXRootView, dXWidgetNode, nd5Var});
        } else if (dXRootView != null && dXWidgetNode != null && nd5Var != null) {
            dXWidgetNode.putBindingXExecutingSpec(nd5Var);
            dXRootView._addAnimationWidget(dXWidgetNode);
        }
    }

    public final void x(DXRootView dXRootView, DXWidgetNode dXWidgetNode, nd5 nd5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce00dee", new Object[]{this, dXRootView, dXWidgetNode, nd5Var});
        } else if (dXRootView != null && dXWidgetNode != null && nd5Var != null) {
            dXWidgetNode.removeBindingXSpec(nd5Var);
            if (!dXWidgetNode.hasExecutingAnimationSpec()) {
                dXRootView._removeAnimationWidget(dXWidgetNode);
            }
        }
    }

    public void y(DXRootView dXRootView) {
        List<DXWidgetNode> _getAnimationWidgets;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c5d0103", new Object[]{this, dXRootView});
        } else if (dXRootView != null && (_getAnimationWidgets = dXRootView._getAnimationWidgets()) != null && !_getAnimationWidgets.isEmpty()) {
            for (DXWidgetNode dXWidgetNode : _getAnimationWidgets) {
                Map<String, nd5> bindingXExecutingMap = dXWidgetNode.getBindingXExecutingMap();
                if (bindingXExecutingMap != null && bindingXExecutingMap.size() > 0) {
                    for (nd5 nd5Var : bindingXExecutingMap.values()) {
                        F(dXRootView, dXWidgetNode, nd5Var, false, true, false);
                    }
                    bindingXExecutingMap.clear();
                }
            }
            dXRootView._clearAnimationWidgets();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements gjj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nd5 f22583a;
        public final /* synthetic */ DXRootView b;
        public final /* synthetic */ DXWidgetNode c;

        public a(nd5 nd5Var, DXRootView dXRootView, DXWidgetNode dXWidgetNode) {
            this.f22583a = nd5Var;
            this.b = dXRootView;
            this.c = dXWidgetNode;
        }

        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("981e7fb9", new Object[]{this, map});
            } else if (map != null) {
                String str = null;
                try {
                    if (DinamicXEngine.j0()) {
                        h36.t(map.toString());
                    }
                    String str2 = (String) map.get("state");
                    String str3 = (String) map.get("token");
                    if ("exit".equals(str2)) {
                        if (DinamicXEngine.j0()) {
                            h36.p("动画 " + this.f22583a.f24656a + "正常退出，收到bindingX  STATE_EXIT回调");
                        }
                        Map<String, Object> map2 = this.f22583a.b;
                        if (map2 != null && ((String) map2.get("token")).equalsIgnoreCase(str3)) {
                            kd5.g(kd5.this, null, this.f22583a);
                            nd5 nd5Var = this.f22583a;
                            if (!nd5Var.i || !nd5Var.c.equalsIgnoreCase("timing")) {
                                nd5 nd5Var2 = this.f22583a;
                                if (nd5Var2.d) {
                                    kd5.h(kd5.this, this.c, nd5Var2, 2, nd5Var2.g);
                                } else {
                                    kd5.h(kd5.this, this.c, nd5Var2, 1, nd5Var2.g);
                                }
                                kd5.i(kd5.this, this.b, this.c, this.f22583a);
                                kd5.this.p(this.c, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXFINISH, this.f22583a.f24656a);
                                return;
                            }
                            kd5.this.j(this.b, this.f22583a, this.c);
                        }
                    } else if ("start".equalsIgnoreCase(str2)) {
                        if (DinamicXEngine.j0()) {
                            h36.p("step3 -->  动画 " + this.f22583a.f24656a + "启动成功，收到bindingX  STATE_START回调");
                        }
                        if (this.f22583a.c.equalsIgnoreCase("timing")) {
                            kd5.this.p(this.c, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTART, this.f22583a.f24656a);
                        }
                    } else if ("end".equalsIgnoreCase(str2)) {
                        if (DinamicXEngine.j0()) {
                            h36.p("动画 " + this.f22583a.f24656a + "手动退出，收到bindingX  STATE_END回调");
                        }
                    } else if ("scrollStart".equalsIgnoreCase(str2)) {
                        kd5.this.p(this.c, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTART, this.f22583a.f24656a);
                    } else if ("scrollEnd".equalsIgnoreCase(str2)) {
                        JSONObject jSONObject = this.f22583a.l;
                        if (jSONObject == null || jSONObject.isEmpty()) {
                            nd5 nd5Var3 = this.f22583a;
                            if (nd5Var3.d) {
                                kd5.h(kd5.this, this.c, nd5Var3, 2, nd5Var3.g);
                            } else {
                                kd5.h(kd5.this, this.c, nd5Var3, 1, nd5Var3.g);
                            }
                        }
                        kd5.this.p(this.c, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTOP, this.f22583a.f24656a);
                    }
                } catch (Throwable th) {
                    xv5.b(th);
                    DXWidgetNode dXWidgetNode = this.c;
                    if (!(dXWidgetNode == null || dXWidgetNode.getDXRuntimeContext() == null)) {
                        str = this.c.getDXRuntimeContext().c();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = "dinamicx";
                    }
                    ic5.s(str, null, "DX_BindingX", "DX_BindingX_Crash", f.BINDINGX_BINDINGX_CALL_BACK_CRASH, xv5.a(th));
                }
            }
        }
    }

    public nd5 o(DinamicXEngine dinamicXEngine, String str, JSONObject jSONObject, Map<String, Object> map) {
        JSONObject jSONObject2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nd5) ipChange.ipc$dispatch("f4e697be", new Object[]{this, dinamicXEngine, str, jSONObject, map});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject(str)) == null) {
            return null;
        }
        nd5 nd5Var = new nd5();
        nd5Var.f24656a = str;
        nd5Var.c = jSONObject2.getString("eventType");
        nd5Var.k = jSONObject2;
        nd5Var.h = "true".equalsIgnoreCase(jSONObject2.getString("useConstantArgs"));
        if (map == null || !map.containsKey("resetOnStop")) {
            str2 = jSONObject2.getString("resetOnStop");
        } else {
            str2 = (String) map.get("resetOnStop");
        }
        if (!TextUtils.isEmpty(str2)) {
            nd5Var.e = !str2.equalsIgnoreCase("false");
        }
        if (map == null || !map.containsKey("resetOnFinish")) {
            str3 = jSONObject2.getString("resetOnFinish");
        } else {
            str3 = (String) map.get("resetOnFinish");
        }
        if (!TextUtils.isEmpty(str3)) {
            nd5Var.d = !str3.equalsIgnoreCase("false");
        }
        if (!nd5Var.e) {
            if (map == null || !map.containsKey("updateFlattenOnlyOnStop")) {
                str6 = jSONObject2.getString("updateFlattenOnlyOnStop");
            } else {
                str6 = (String) map.get("updateFlattenOnlyOnStop");
            }
            if (!TextUtils.isEmpty(str6)) {
                nd5Var.f = "true".equalsIgnoreCase(str6);
            }
        }
        if (!nd5Var.d) {
            if (map == null || !map.containsKey("updateFlattenOnlyOnFinish")) {
                str5 = jSONObject2.getString("updateFlattenOnlyOnFinish");
            } else {
                str5 = (String) map.get("updateFlattenOnlyOnFinish");
            }
            if (!TextUtils.isEmpty(str5)) {
                nd5Var.g = "true".equalsIgnoreCase(str5);
            }
        }
        if (map == null || !map.containsKey(pg1.ATOM_EXT_repeat)) {
            str4 = jSONObject2.getString(pg1.ATOM_EXT_repeat);
        } else {
            str4 = (String) map.get(pg1.ATOM_EXT_repeat);
        }
        if (!TextUtils.isEmpty(str4)) {
            nd5Var.i = str4.equals("true");
        }
        nd5Var.j = jSONObject2.getJSONArray("props");
        nd5Var.l = jSONObject2.getJSONObject("exitExpression");
        v(dinamicXEngine, nd5Var, map);
        return nd5Var;
    }

    public final void u(JSONObject jSONObject, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed86d21", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null && this.d != null) {
            String string = jSONObject.getString(BaseOuterComponent.b.SOURCE_COMPONENT_ID);
            if (DinamicXEngine.j0()) {
                h36.p("step1--> 收到scroller bindingx消息:  action " + str + " sourceId " + string);
            }
            int intValue = jSONObject.containsKey("offsetX") ? jSONObject.getInteger("offsetX").intValue() : 0;
            if (jSONObject.containsKey("offsetY")) {
                i = jSONObject.getInteger("offsetY").intValue();
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if ("scroll_beigin".equalsIgnoreCase(str)) {
                this.d.e(string, intValue, i, jSONObject2);
            } else if (fzo.SCROLLING.equalsIgnoreCase(str)) {
                this.d.f(string, intValue, i, jSONObject2);
            } else if ("scroll_end".equalsIgnoreCase(str)) {
                this.d.d(string, intValue, i, jSONObject2);
            }
        }
    }

    public void A(DXRootView dXRootView, DXWidgetNode dXWidgetNode, JSONArray jSONArray, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c7db98", new Object[]{this, dXRootView, dXWidgetNode, jSONArray, map});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                if (DinamicXEngine.j0()) {
                    h36.p("step2---> 开始启动" + string + "动画");
                }
                B(dXRootView, dXWidgetNode, string, map);
            }
        }
    }

    public final void F(DXRootView dXRootView, DXWidgetNode dXWidgetNode, nd5 nd5Var, boolean z, boolean z2, boolean z3) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98da7b7", new Object[]{this, dXRootView, dXWidgetNode, nd5Var, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (nd5Var != null && (map = nd5Var.b) != null) {
            this.c.e(map);
            G(null, nd5Var);
            if (z2) {
                D(dXWidgetNode, nd5Var, 2, z3);
            } else {
                D(dXWidgetNode, nd5Var, 1, z3);
            }
            if (z) {
                x(dXRootView, dXWidgetNode, nd5Var);
            }
            if ("timing".equalsIgnoreCase(nd5Var.c)) {
                p(dXWidgetNode, DXBindingXStateChangeEvent.DXVIEWWIDGETNODE_ONBINDINGXSTOP, nd5Var.f24656a);
            }
        }
    }

    public final boolean n(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89afe876", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("property");
        return "transform.translate".equals(string) || "transform.translateX".equals(string) || "transform.translateY".equals(string) || "width".equals(string) || "height".equals(string);
    }

    public final void t(DXWidgetNode dXWidgetNode, JSONObject jSONObject, int i, boolean z) {
        DXWidgetNode dXWidgetNode2;
        ViewGroup.LayoutParams layoutParams;
        View D;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        View D2;
        ViewGroup.LayoutParams layoutParams4;
        View D3;
        Drawable background;
        View D4;
        View D5;
        View D6;
        View D7;
        View D8;
        View D9;
        View D10;
        View D11;
        View D12;
        View D13;
        View D14;
        DXWidgetNode dXWidgetNode3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431085b8", new Object[]{this, dXWidgetNode, jSONObject, new Integer(i), new Boolean(z)});
            return;
        }
        String string = jSONObject.getString("property");
        if (!TextUtils.isEmpty(string)) {
            WeakReference weakReference = (WeakReference) jSONObject.get("element_widgetnode");
            if (weakReference == null || weakReference.get() == null) {
                String z2 = z(jSONObject.getString("element"));
                if ("this".equalsIgnoreCase(z2)) {
                    dXWidgetNode3 = dXWidgetNode;
                } else {
                    dXWidgetNode3 = !zg5.w5(dXWidgetNode.getDXRuntimeContext()) ? dXWidgetNode.queryWTByUserId(z2) : null;
                }
                dXWidgetNode2 = dXWidgetNode3 == null ? dXWidgetNode.queryWidgetNodeByUserId(z2) : dXWidgetNode3;
                if (dXWidgetNode2 != null) {
                    jSONObject.put("element_widgetnode", (Object) new WeakReference(dXWidgetNode2));
                } else {
                    return;
                }
            } else {
                dXWidgetNode2 = (DXWidgetNode) weakReference.get();
            }
            if ("opacity".equals(string)) {
                if (i == 1) {
                    View D15 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D15 != null) {
                        if (!z) {
                            dXWidgetNode2.setAlpha(D15.getAlpha());
                        }
                        svb l = l(dXWidgetNode2);
                        if (l != null) {
                            l.setAlpha(D15.getAlpha());
                        }
                    }
                } else if (i == 2 && (D14 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D14.setAlpha(dXWidgetNode2.getAlpha());
                }
            } else if ("transform.translate".equals(string)) {
                if (i == 1) {
                    View D16 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D16 != null) {
                        float translationX = D16.getTranslationX();
                        float translationY = D16.getTranslationY();
                        if (!z) {
                            dXWidgetNode2.setTranslateX(translationX);
                            dXWidgetNode2.setTranslateY(translationY);
                        }
                        svb l2 = l(dXWidgetNode2);
                        if (l2 != null) {
                            l2.setTranslateX(translationX);
                            l2.setTranslateY(translationY);
                        }
                    }
                } else if (i == 2 && (D13 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D13.setTranslationX(dXWidgetNode2.getTranslateX());
                    D13.setTranslationY(dXWidgetNode2.getTranslateY());
                }
            } else if ("transform.translateX".equals(string)) {
                if (i == 1) {
                    View D17 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D17 != null) {
                        float translationX2 = D17.getTranslationX();
                        if (!z) {
                            dXWidgetNode2.setTranslateX(translationX2);
                        }
                        svb l3 = l(dXWidgetNode2);
                        if (l3 != null) {
                            l3.setTranslateX(translationX2);
                        }
                    }
                } else if (i == 2 && (D12 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D12.setTranslationX(dXWidgetNode2.getTranslateX());
                }
            } else if ("transform.translateY".equals(string)) {
                if (i == 1) {
                    View D18 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D18 != null) {
                        float translationY2 = D18.getTranslationY();
                        if (!z) {
                            dXWidgetNode2.setTranslateY(translationY2);
                        }
                        svb l4 = l(dXWidgetNode2);
                        if (l4 != null) {
                            l4.setTranslateY(translationY2);
                        }
                    }
                } else if (i == 2 && (D11 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D11.setTranslationY(dXWidgetNode2.getTranslateY());
                }
            } else if ("transform.scale".equals(string)) {
                if (i == 1) {
                    View D19 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D19 != null) {
                        float scaleX = D19.getScaleX();
                        float scaleY = D19.getScaleY();
                        if (!z) {
                            dXWidgetNode2.setScaleX(scaleX);
                            dXWidgetNode2.setScaleY(scaleY);
                        }
                        svb l5 = l(dXWidgetNode2);
                        if (l5 != null) {
                            l5.setScaleX(scaleX);
                            l5.setScaleY(scaleY);
                        }
                    }
                } else if (i == 2 && (D10 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D10.setScaleX(dXWidgetNode2.getScaleX());
                    D10.setScaleY(dXWidgetNode2.getScaleY());
                }
            } else if ("transform.scaleX".equals(string)) {
                if (i == 1) {
                    View D20 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D20 != null) {
                        float scaleX2 = D20.getScaleX();
                        if (!z) {
                            dXWidgetNode2.setScaleX(scaleX2);
                        }
                        svb l6 = l(dXWidgetNode2);
                        if (l6 != null) {
                            l6.setScaleX(scaleX2);
                        }
                    }
                } else if (i == 2 && (D9 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D9.setScaleX(dXWidgetNode2.getScaleX());
                }
            } else if ("transform.scaleY".equals(string)) {
                if (i == 1) {
                    View D21 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D21 != null) {
                        float scaleY2 = D21.getScaleY();
                        if (!z) {
                            dXWidgetNode2.setScaleY(scaleY2);
                        }
                        svb l7 = l(dXWidgetNode2);
                        if (l7 != null) {
                            l7.setScaleY(scaleY2);
                        }
                    }
                } else if (i == 2 && (D8 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D8.setScaleY(dXWidgetNode2.getScaleY());
                }
            } else if ("transform.rotateX".equals(string)) {
                if (i == 1) {
                    View D22 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D22 != null) {
                        float rotationX = D22.getRotationX();
                        if (!z) {
                            dXWidgetNode2.setRotationX(rotationX);
                        }
                        svb l8 = l(dXWidgetNode2);
                        if (l8 != null) {
                            l8.setRotationX(rotationX);
                        }
                    }
                } else if (i == 2 && (D7 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D7.setRotationX(dXWidgetNode2.getRotationX());
                }
            } else if ("transform.rotateY".equals(string)) {
                if (i == 1) {
                    View D23 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D23 != null) {
                        float rotationY = D23.getRotationY();
                        if (!z) {
                            dXWidgetNode2.setRotationY(rotationY);
                        }
                        svb l9 = l(dXWidgetNode2);
                        if (l9 != null) {
                            l9.setRotationY(rotationY);
                        }
                    }
                } else if (i == 2 && (D6 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D6.setRotationY(dXWidgetNode2.getRotationY());
                }
            } else if ("transform.rotateZ".equals(string)) {
                if (i == 1) {
                    View D24 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D24 != null) {
                        float rotation = D24.getRotation();
                        if (!z) {
                            dXWidgetNode2.setRotationZ(rotation);
                        }
                        svb l10 = l(dXWidgetNode2);
                        if (l10 != null) {
                            l10.setRotationZ(rotation);
                        }
                    }
                } else if (i == 2 && (D5 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D5.setRotation(dXWidgetNode2.getRotationZ());
                }
            } else if (pg1.ATOM_EXT_UDL_background_color.equals(string)) {
                if (i == 1) {
                    View D25 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D25 != null && (background = D25.getBackground()) != null && (background instanceof ColorDrawable)) {
                        if (!z) {
                            dXWidgetNode2.setBackGroundColor(((ColorDrawable) background).getColor());
                        }
                        svb l11 = l(dXWidgetNode2);
                        if (l11 != null) {
                            l11.setBackGroundColor(((ColorDrawable) background).getColor());
                        }
                    }
                } else if (i == 2 && (D4 = dXWidgetNode2.getDXRuntimeContext().D()) != null) {
                    D4.setBackgroundColor(dXWidgetNode2.getBackGroundColor());
                }
            } else if ("color".equals(string)) {
                if (dXWidgetNode2 instanceof gi6) {
                    if (i == 1) {
                        View D26 = dXWidgetNode2.getDXRuntimeContext().D();
                        if (D26 != null && (D26 instanceof TextView)) {
                            int currentTextColor = ((TextView) D26).getCurrentTextColor();
                            if (!z) {
                                ((gi6) dXWidgetNode2).setTextColor(currentTextColor);
                            }
                            svb l12 = l(dXWidgetNode2);
                            if (l12 != null && (l12 instanceof gi6)) {
                                ((gi6) l12).setTextColor(currentTextColor);
                            }
                        }
                    } else if (i == 2 && (D3 = dXWidgetNode2.getDXRuntimeContext().D()) != null && (D3 instanceof TextView)) {
                        ((TextView) D3).setTextColor(((gi6) dXWidgetNode2).getTextColor());
                    }
                }
            } else if ("width".equals(string)) {
                if (i == 1) {
                    View D27 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D27 != null && (layoutParams3 = D27.getLayoutParams()) != null) {
                        int i2 = layoutParams3.width;
                        if (!z) {
                            dXWidgetNode2.setMeasuredDimension(i2, dXWidgetNode2.getMeasuredHeight());
                        }
                        svb l13 = l(dXWidgetNode2);
                        if (l13 != null) {
                            l13.setMeasuredDimension(i2, l13.getMeasuredHeight());
                        }
                    }
                } else if (i == 2 && (D2 = dXWidgetNode2.getDXRuntimeContext().D()) != null && (layoutParams4 = D2.getLayoutParams()) != null) {
                    layoutParams4.width = dXWidgetNode2.getMeasuredWidth();
                    D2.setLayoutParams(layoutParams4);
                }
            } else if (!"height".equals(string)) {
            } else {
                if (i == 1) {
                    View D28 = dXWidgetNode2.getDXRuntimeContext().D();
                    if (D28 != null && (layoutParams = D28.getLayoutParams()) != null) {
                        int i3 = layoutParams.height;
                        if (!z) {
                            dXWidgetNode2.setMeasuredDimension(dXWidgetNode2.getMeasuredWidth(), i3);
                        }
                        svb l14 = l(dXWidgetNode2);
                        if (l14 != null) {
                            l14.setMeasuredDimension(l14.getMeasuredWidth(), i3);
                        }
                    }
                } else if (i == 2 && (D = dXWidgetNode2.getDXRuntimeContext().D()) != null && (layoutParams2 = D.getLayoutParams()) != null) {
                    layoutParams2.height = dXWidgetNode2.getMeasuredHeight();
                    D.setLayoutParams(layoutParams2);
                }
            }
        }
    }

    public final void v(DinamicXEngine dinamicXEngine, nd5 nd5Var, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa49103", new Object[]{this, dinamicXEngine, nd5Var, map});
            return;
        }
        JSONArray jSONArray = nd5Var.j;
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                E(dinamicXEngine, jSONObject.getJSONObject(DXTraceUtil.TYPE_EXPRESSION_STRING).getJSONObject("transformed"), map, n(jSONObject));
            }
        }
        JSONObject jSONObject2 = nd5Var.l;
        if (jSONObject2 != null) {
            E(dinamicXEngine, jSONObject2.getJSONObject("transformed"), map, false);
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String string = jSONObject3.getString("element");
                if (!TextUtils.isEmpty(string) && string.startsWith("$")) {
                    jSONObject3.put("element", (Object) s(map, string));
                }
            }
        }
    }

    public final void E(DinamicXEngine dinamicXEngine, JSONObject jSONObject, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629665f4", new Object[]{this, dinamicXEngine, jSONObject, map, new Boolean(z)});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("type");
            int i = jSONObject.get("value");
            if (i instanceof String) {
                String str = (String) i;
                if (str.startsWith("$")) {
                    i = r(map, str, string);
                }
            }
            if (z) {
                try {
                    if ("NumericLiteral".equals(string) && (i instanceof String)) {
                        String str2 = (String) i;
                        if (str2.endsWith("ap")) {
                            i = Integer.valueOf(pb6.d(dinamicXEngine, DinamicXEngine.x(), Float.parseFloat(str2.substring(0, str2.length() - 2))));
                        } else if (((String) i).endsWith("np")) {
                            i = Integer.valueOf(pb6.f(DinamicXEngine.x(), Float.parseFloat(str2.substring(0, str2.length() - 2))));
                        }
                    }
                } catch (Throwable th) {
                    xv5.b(th);
                    i = 0;
                }
            }
            jSONObject.put("value", i);
            JSONArray jSONArray = jSONObject.getJSONArray("children");
            if (jSONArray != null && jSONArray.size() > 0) {
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    E(dinamicXEngine, jSONArray.getJSONObject(i2), map, z);
                }
            }
        }
    }
}
