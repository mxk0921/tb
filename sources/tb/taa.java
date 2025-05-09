package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class taa implements ggc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, DXWidgetNode> f28590a = new HashMap<>(4);
    public final HashMap<String, String> c = new HashMap<>(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements k1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f28591a;
        public final /* synthetic */ String b;
        public final /* synthetic */ p18 c;
        public final /* synthetic */ c48 d;
        public final /* synthetic */ DXRuntimeContext e;
        public final /* synthetic */ JSONObject f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ DinamicXEngine h;
        public final /* synthetic */ jh3 i;

        public a(boolean z, String str, p18 p18Var, c48 c48Var, DXRuntimeContext dXRuntimeContext, JSONObject jSONObject, boolean z2, DinamicXEngine dinamicXEngine, jh3 jh3Var) {
            this.f28591a = z;
            this.b = str;
            this.c = p18Var;
            this.d = c48Var;
            this.e = dXRuntimeContext;
            this.f = jSONObject;
            this.g = z2;
            this.h = dinamicXEngine;
            this.i = jh3Var;
        }

        @Override // tb.k1c
        public void b(String str, f fVar) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                return;
            }
            taa.b(taa.this).remove(this.c.d().c);
            if (taa.h(taa.this) && !taa.d(taa.this)) {
                taa.g(taa.this, this.g, this.e.h(), this.h, "hideLoading");
            }
            StringBuilder sb = new StringBuilder("dxCreateViewError ");
            sb.append(str);
            sb.append(" error info: ");
            if (fVar == null) {
                str2 = "";
            } else {
                str2 = fVar.toString();
            }
            sb.append(str2);
            String sb2 = sb.toString();
            TLog.logi(null, "LOG_ADAM", sb2 + " templateUrl = " + this.c.d().c);
            AppMonitor.Counter.commit("ADAM_MONITOR", "NOT_FOUND_GLOBAL_EVENT", sb2, 1.0d);
        }

        @Override // tb.k1c
        public void a(DXRootView dXRootView) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            if (this.f28591a) {
                str = this.b;
            } else {
                str = (String) taa.b(taa.this).get(this.c.d().c);
            }
            taa.b(taa.this).remove(this.c.d().c);
            DXResult<DXRootView> i1 = this.d.h().i1(this.e.h(), dXRootView, dXRootView.getDxTemplateItem(), null, -1, new DXRenderOptions.b().q());
            if (i1.f7291a != null || !i1.d()) {
                taa.c(taa.this).put(this.c.d().c, i1.f7291a.getExpandWidgetNode());
                if (!taa.d(taa.this) && taa.f(taa.this, this.e, i1.f7291a.getExpandWidgetNode(), str, this.c.d().c, this.f)) {
                    taa.e(taa.this, true);
                    taa.g(taa.this, this.g, this.e.h(), this.h, "hideLoading");
                    TLog.logi(null, "LOG_ADAM", "handle evChain by global template, eventName = " + str);
                    Util.m("globalEventChain", (Map) this.i.b().get("utParams"));
                }
            }
            if (taa.h(taa.this) && !taa.d(taa.this)) {
                taa.g(taa.this, this.g, this.e.h(), this.h, "hideLoading");
                AppMonitor.Counter.commit("ADAM_MONITOR", "NOT_FOUND_GLOBAL_EVENT", 1.0d);
            }
        }
    }

    static {
        t2o.a(350224411);
        t2o.a(350224413);
    }

    public static /* synthetic */ HashMap b(taa taaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("eab1f2b", new Object[]{taaVar});
        }
        return taaVar.c;
    }

    public static /* synthetic */ HashMap c(taa taaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ef24752c", new Object[]{taaVar});
        }
        return taaVar.f28590a;
    }

    public static /* synthetic */ boolean d(taa taaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c46f544e", new Object[]{taaVar})).booleanValue();
        }
        return taaVar.b;
    }

    public static /* synthetic */ boolean e(taa taaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1f8c70c", new Object[]{taaVar, new Boolean(z)})).booleanValue();
        }
        taaVar.b = z;
        return z;
    }

    public static /* synthetic */ boolean f(taa taaVar, DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dacc6a4d", new Object[]{taaVar, dXRuntimeContext, dXWidgetNode, str, str2, jSONObject})).booleanValue();
        }
        return taaVar.i(dXRuntimeContext, dXWidgetNode, str, str2, jSONObject);
    }

    public static /* synthetic */ void g(taa taaVar, boolean z, Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15dc1fb", new Object[]{taaVar, new Boolean(z), context, dinamicXEngine, str});
        } else {
            taaVar.k(z, context, dinamicXEngine, str);
        }
    }

    public static /* synthetic */ boolean h(taa taaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f1de111", new Object[]{taaVar})).booleanValue();
        }
        return taaVar.j();
    }

    public final boolean i(DXRuntimeContext dXRuntimeContext, DXWidgetNode dXWidgetNode, String str, String str2, JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("242cfd3b", new Object[]{this, dXRuntimeContext, dXWidgetNode, str, str2, jSONObject})).booleanValue();
        }
        if (dXWidgetNode == null || sj8.h(dXWidgetNode.getDXRuntimeContext(), str) == null) {
            return false;
        }
        rv5 s = dXRuntimeContext.s().f().s(str, dXRuntimeContext.W(), dXWidgetNode, jSONObject, null, null);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("execute result = ");
        if (s != null) {
            obj = Integer.valueOf(s.h());
        } else {
            obj = "null";
        }
        sb.append(obj);
        TLog.logi(null, "LOG_ADAM", sb.toString());
        return true;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e11b029", new Object[]{this})).booleanValue();
        }
        return this.c.isEmpty();
    }

    public final void k(boolean z, Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd100970", new Object[]{this, new Boolean(z), context, dinamicXEngine, str});
        } else if (z) {
            Util.n(context, dinamicXEngine, str);
        }
    }

    @Override // tb.ggc
    public wao a(rmb rmbVar, DXEvent dXEvent, Object[] objArr, jh3 jh3Var) {
        JSONObject jSONObject;
        DXRuntimeContext a2;
        boolean parseBoolean;
        String str;
        String str2;
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("eecb2af8", new Object[]{this, rmbVar, dXEvent, objArr, jh3Var});
        }
        if (jh3Var == null || jh3Var.b() == null || objArr == null || objArr.length <= 0) {
            return wao.a();
        }
        boolean a3 = Util.a();
        if (a3) {
            this.c.clear();
        }
        this.b = false;
        String valueOf = String.valueOf(objArr[0]);
        if (objArr.length > 1) {
            Object obj = objArr[1];
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                a2 = jh3Var.a();
                if (a2 != null || a2.s() == null) {
                    return wao.a();
                }
                DinamicXEngine f = a2.s().f();
                if (f == null) {
                    return wao.a();
                }
                List<JSONObject> list = (List) jh3Var.b().get("templates");
                String str3 = "LOG_ADAM";
                if (list == null || list.isEmpty()) {
                    TLog.logi(null, str3, "templates is null, eventName = " + objArr[0]);
                    return wao.a();
                }
                JSONObject jSONObject2 = (JSONObject) jh3Var.b().get("global_adam_config");
                if (jSONObject2 == null) {
                    jSONObject2 = Util.d();
                }
                JSONObject jSONObject3 = (JSONObject) jh3Var.b().get("event_adam_config");
                String str4 = "true";
                String str5 = "showLoading";
                if (jSONObject3 == null || jSONObject3.get(str5) == null) {
                    parseBoolean = Boolean.parseBoolean(jSONObject2.getString(str5));
                } else {
                    parseBoolean = str4.equals(String.valueOf(jSONObject3.get(str5)));
                }
                for (JSONObject jSONObject4 : list) {
                    DXWidgetNode dXWidgetNode = this.f28590a.get(jSONObject4.getString("url"));
                    if (i(a2, dXWidgetNode, valueOf, jSONObject4.getString("url"), jSONObject)) {
                        Util.m("globalEventChain", (Map) jh3Var.b().get("utParams"));
                        k(parseBoolean, a2.h(), f, "hideLoading");
                        TLog.logi(null, str3, "handle evChain by global template(cache), eventName = " + objArr[0]);
                        return wao.c();
                    } else if (dXWidgetNode != null) {
                        parseBoolean = parseBoolean;
                        str4 = str4;
                        str5 = str5;
                        valueOf = valueOf;
                    } else {
                        if (jSONObject3 == null || jSONObject3.getString("renderType") == null) {
                            str2 = jSONObject2.getString("renderType");
                        } else {
                            str2 = jSONObject3.getString("renderType");
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("sharedEngine", (Object) str4);
                        jSONObject5.put(x96.REFRESH_TYPE, (Object) str2);
                        jSONObject5.put("template", (Object) jSONObject4);
                        p18 p18Var = new p18(jSONObject5);
                        c48 c48Var = new c48(a2.h(), p18Var, a2.c(), null);
                        if (a3 || !this.c.containsKey(p18Var.d().c)) {
                            this.c.put(p18Var.d().c, valueOf);
                            str4 = str4;
                            valueOf = valueOf;
                            jSONObject3 = jSONObject3;
                            jSONObject2 = jSONObject2;
                            a3 = a3;
                            dinamicXEngine = f;
                            str3 = str3;
                            c48Var.g(new a(a3, valueOf, p18Var, c48Var, a2, jSONObject, parseBoolean, f, jh3Var));
                        } else {
                            this.c.put(p18Var.d().c, valueOf);
                            valueOf = valueOf;
                            jSONObject3 = jSONObject3;
                            jSONObject2 = jSONObject2;
                            str3 = str3;
                            dinamicXEngine = f;
                            a3 = a3;
                            str4 = str4;
                        }
                        if (this.b) {
                            break;
                        }
                        if (!j()) {
                            f = dinamicXEngine;
                            str5 = str5;
                            k(parseBoolean, a2.h(), f, str5);
                        } else {
                            f = dinamicXEngine;
                            str5 = str5;
                        }
                        parseBoolean = parseBoolean;
                    }
                }
                if (this.b) {
                    return wao.c();
                }
                if (j()) {
                    str = wao.b;
                } else {
                    str = wao.f30570a;
                }
                return wao.b(str);
            }
        }
        jSONObject = null;
        a2 = jh3Var.a();
        if (a2 != null) {
        }
        return wao.a();
    }
}
