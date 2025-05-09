package com.taobao.android.layoutmanager.module;

import android.content.Intent;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import java.util.WeakHashMap;
import tb.esw;
import tb.kpw;
import tb.r4c;
import tb.spw;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
@CleanAnnotation(name = "clean")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WindvaneModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindvaneModule";
    private static WeakHashMap<o, esw> pluginManagerMap = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8226a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ spw c;

        public a(d.j jVar, esw eswVar, spw spwVar) {
            this.f8226a = jVar;
            this.b = eswVar;
            this.c = spwVar;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "FAILURE");
            jSONObject.put("result", (Object) str);
            d.j jVar = this.f8226a;
            jVar.c.a(jVar, jSONObject);
            Object b = this.b.b(this.c.d);
            if (b instanceof kpw) {
                ((kpw) b).onDestroy();
            }
            WindvaneModule.access$000().remove(this.f8226a.f11976a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.j f8227a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ spw c;

        public b(d.j jVar, esw eswVar, spw spwVar) {
            this.f8227a = jVar;
            this.b = eswVar;
            this.c = spwVar;
        }

        @Override // tb.r4c
        public void b(String str) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
                return;
            }
            try {
                obj = JSON.parseObject(str);
            } catch (Exception e) {
                tfs.e(WindvaneModule.TAG, e.getMessage());
                obj = str;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "SUCCESS");
            jSONObject.put("result", obj);
            d.j jVar = this.f8227a;
            jVar.c.a(jVar, jSONObject);
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
                return;
            }
            try {
                obj = JSON.parseObject(str);
            } catch (Exception e) {
                tfs.e(WindvaneModule.TAG, e.getMessage());
                obj = str;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "SUCCESS");
            jSONObject.put("result", obj);
            d.j jVar = this.f8227a;
            jVar.c.a(jVar, jSONObject);
            Object b = this.b.b(this.c.d);
            if (b instanceof kpw) {
                ((kpw) b).onDestroy();
            }
            WindvaneModule.access$000().remove(this.f8227a.f11976a);
        }
    }

    static {
        t2o.a(502268153);
        t2o.a(503316559);
    }

    public static /* synthetic */ WeakHashMap access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("fff6ea32", new Object[0]);
        }
        return pluginManagerMap;
    }

    public static void call(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c00abee", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.containsKey("pluginName") ? jSONObject.getString("pluginName") : null;
            String string2 = jSONObject.containsKey(FluidException.METHOD_NAME) ? jSONObject.getString(FluidException.METHOD_NAME) : null;
            JSONObject jSONObject2 = jSONObject.containsKey("params") ? jSONObject.getJSONObject("params") : null;
            spw spwVar = new spw();
            spwVar.d = string;
            spwVar.e = string2;
            esw eswVar = new esw(jVar.c(), null);
            a aVar = new a(jVar, eswVar, spwVar);
            b bVar = new b(jVar, eswVar, spwVar);
            if (jSONObject2 != null) {
                try {
                    spwVar.f = jSONObject2.toJSONString();
                } catch (Throwable th) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "FAILURE");
                    jSONObject3.put("result", (Object) ("call windvane failed :" + th.getMessage()));
                    jVar.c.a(jVar, jSONObject3);
                    Object b2 = eswVar.b(spwVar.d);
                    if (b2 instanceof kpw) {
                        ((kpw) b2).onDestroy();
                    }
                    pluginManagerMap.remove(jVar.f11976a);
                    return;
                }
            }
            WVJsBridge.g().f(eswVar, spwVar, aVar, bVar);
            pluginManagerMap.put(jVar.f11976a, eswVar);
        }
    }

    public static void clean(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557c1de0", new Object[]{oVar});
        } else {
            pluginManagerMap.remove(oVar);
        }
    }

    public static void onActivityResult(o oVar, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621df1bb", new Object[]{oVar, new Integer(i), new Integer(i2), intent});
            return;
        }
        esw eswVar = pluginManagerMap.get(oVar);
        if (eswVar != null) {
            eswVar.c(i, i2, intent);
        }
    }

    public static void postNotify(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa580a3", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            WVStandardEventCenter.postNotificationToJS(jSONObject.getString("name"), jSONObject.getString("args"));
        }
    }
}
