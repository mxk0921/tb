package tb;

import android.content.Context;
import android.taobao.windvane.export.prerender.PrerenderManager;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridDestroyPolicy;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import java.util.List;
import tb.xum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wbv implements t5e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final cbv b;

    /* renamed from: a  reason: collision with root package name */
    public final xbv f30597a = new xbv();
    public final HashMap<String, JSONObject> c = new HashMap<>();
    public final HashMap<String, JSONObject> d = new HashMap<>();
    public final HashMap<String, JSONObject> e = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lbv.l();
            hav.d("UltronTradeHybridPreRenderManager", "延迟执行UltronTradeHybridHelper.registerWeexModule");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements g1a<Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(wbv wbvVar) {
        }

        /* renamed from: a */
        public xhv invoke(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("60af166d", new Object[]{this, bool});
            }
            hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "preRender result: " + bool);
            return null;
        }
    }

    public wbv(cbv cbvVar) {
        this.b = cbvVar;
    }

    @Override // tb.t5e
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else {
            k(str, str2, z(jSONObject));
        }
    }

    public void b(String str, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a7e068", new Object[]{this, str, aVar});
            return;
        }
        mbv v = v(str);
        if (v == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.addPreRenderInstanceToPool", "model is null");
        } else {
            this.f30597a.a(v, aVar);
        }
    }

    public void c(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2aa71e", new Object[]{this, obj, jSONObject});
        } else if (jSONObject != null) {
            if (jSONObject.containsKey("context")) {
                jSONObject.remove("context");
            }
            e(this.c, obj, jSONObject);
        }
    }

    public void d(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66dfe6a1", new Object[]{this, obj, jSONObject});
        } else if (jSONObject != null) {
            if (jSONObject.containsKey("context")) {
                jSONObject.remove("context");
            }
            e(this.d, obj, jSONObject);
        }
    }

    public final void e(HashMap<String, JSONObject> hashMap, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0a3625", new Object[]{this, hashMap, obj, jSONObject});
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, jSONObject);
                return;
            }
        }
        if (obj instanceof com.taobao.android.weex_framework.a) {
            com.taobao.android.weex_framework.a aVar = (com.taobao.android.weex_framework.a) obj;
            Object tag = aVar.getTag("bizId");
            if (tag instanceof String) {
                String str2 = (String) tag;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put(str2, jSONObject);
                    return;
                }
            }
            hashMap.put(String.valueOf(aVar.getInstanceId()), jSONObject);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa78885", new Object[]{this, str});
            return;
        }
        mbv v = v(str);
        if (v == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstance", "model is null");
        } else {
            this.f30597a.e(v);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e7c4e", new Object[]{this, str});
        } else {
            h(null, str);
        }
    }

    public void h(String str, String str2) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb166e98", new Object[]{this, str, str2});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByPolicy", str2 + ": mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str2);
        if (c == null || (list = c.b) == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByPolicy", str2 + ": sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str2, mbvVar.f23930a)) {
                    String str3 = mbvVar.f23930a;
                    hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByPolicy", str2 + "-" + str3 + " switcher is off");
                } else if (!TextUtils.equals(mbvVar.g, "none")) {
                    if (TextUtils.equals(mbvVar.g, "destroy")) {
                        f(mbvVar.b);
                    } else if (!TextUtils.equals(mbvVar.g, UltronTradeHybridDestroyPolicy.DESTROY_ON_LOW_MEMORY)) {
                        hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByPolicy", "destroyPolicy invalid");
                    }
                }
            }
        }
    }

    public void i(String str) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b146b2", new Object[]{this, str});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByScene", "mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str);
        if (c == null || (list = c.b) == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByScene", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str, mbvVar.f23930a)) {
                    String str2 = mbvVar.f23930a;
                    hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByScene", str + "-" + str2 + " switcher is off");
                } else {
                    f(mbvVar.b);
                }
            }
        }
    }

    public void j(String str, String str2) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d151b86e", new Object[]{this, str, str2});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByStage", "mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str2);
        if (c == null || (list = c.b) == null) {
            hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByStage", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str2, mbvVar.f23930a)) {
                    String str3 = mbvVar.f23930a;
                    hav.g("UltronTradeHybridPreRenderManager", "destroyPreRenderInstanceByStage", str2 + "-" + str3 + " switcher is off");
                } else if (TextUtils.equals(str, mbvVar.h) && TextUtils.equals(mbvVar.g, UltronTradeHybridDestroyPolicy.DESTROY_ON_STAGE)) {
                    f(mbvVar.b);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
        if (r27.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage.ON_IDLE) == false) goto L_0x00a6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r27, java.lang.String r28, com.alibaba.fastjson.JSONObject r29) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wbv.k(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    public boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a25e695", new Object[]{this, str, str2})).booleanValue();
        }
        return UltronTradeHybridSwitcherHelper.e(str, str2);
    }

    public void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db18ab2", new Object[]{this, context, str});
            return;
        }
        mbv v = v(str);
        if (v == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.generatePreRenderInstance", "model is null");
        } else {
            this.f30597a.g(context, v);
        }
    }

    public void n(Context context, String str, String str2) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a9d1d9", new Object[]{this, context, str, str2});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str);
        if (c == null || (list = c.b) == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str, mbvVar.f23930a)) {
                    String str3 = mbvVar.f23930a;
                    hav.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", str + "-" + str3 + " switcher is off");
                } else if (!TextUtils.equals(mbvVar.e, str2)) {
                    UnifyLog.n("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "no match stage");
                } else {
                    m(context, mbvVar.b);
                }
            }
        }
    }

    public void o(Context context, String str, String str2, String str3) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd699763", new Object[]{this, context, str, str2, str3});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", str2 + "_" + str + ": mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str2);
        if (c == null || (list = c.b) == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", str2 + "_" + str + ": sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str2, mbvVar.f23930a)) {
                    String str4 = mbvVar.f23930a;
                    hav.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", str2 + "-" + str4 + " switcher is off");
                } else if (!TextUtils.equals(mbvVar.e, str3)) {
                    String str5 = mbvVar.e;
                    UnifyLog.n("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "no match stage: " + str5);
                } else if (!TextUtils.equals(mbvVar.f23930a, str)) {
                    String str6 = mbvVar.f23930a;
                    UnifyLog.n("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "no match bizName: " + str6);
                } else {
                    m(context, mbvVar.b);
                }
            }
        }
    }

    public Object p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4abef077", new Object[]{this, str});
        }
        mbv v = v(str);
        if (v != null) {
            return this.f30597a.k(v);
        }
        UnifyLog.e("UltronTradeHybridPreRenderManager.getBackgroundPreRenderInstance", "model is null");
        return null;
    }

    public JSONObject q(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d311c019", new Object[]{this, aVar});
        }
        return s(this.c, aVar);
    }

    public JSONObject r(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b8e79b8", new Object[]{this, aVar});
        }
        return s(this.d, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0036;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject s(java.util.HashMap<java.lang.String, com.alibaba.fastjson.JSONObject> r5, com.taobao.android.weex_framework.a r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.wbv.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "ab9aff3c"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r5 = 2
            r2[r5] = r6
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            return r5
        L_0x001b:
            java.lang.String r0 = "bizId"
            java.lang.Object r0 = r6.getTag(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x002e
            goto L_0x0036
        L_0x002e:
            int r6 = r6.getInstanceId()
            java.lang.String r0 = java.lang.String.valueOf(r6)
        L_0x0036:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x004a
            boolean r6 = r5.containsKey(r0)
            if (r6 != 0) goto L_0x0043
            goto L_0x004a
        L_0x0043:
            java.lang.Object r5 = r5.remove(r0)
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5
            return r5
        L_0x004a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wbv.s(java.util.HashMap, com.taobao.android.weex_framework.a):com.alibaba.fastjson.JSONObject");
    }

    public JSONObject t(String str) {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ef0b5cc", new Object[]{this, str});
        }
        if (!str.isEmpty() && (hashMap = this.e) != null && !hashMap.isEmpty() && this.e.containsKey(str)) {
            return this.e.get(str);
        }
        return null;
    }

    public Object u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("976334a9", new Object[]{this, str});
        }
        mbv v = v(str);
        if (v != null) {
            return this.f30597a.m(v);
        }
        UnifyLog.e("UltronTradeHybridPreRenderManager.getPreRenderInstance", "model is null");
        return null;
    }

    public final mbv v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbv) ipChange.ipc$dispatch("8042b358", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.getPreRenderModelByUrl", "preRenderUrl is empty");
            return null;
        }
        cbv cbvVar = this.b;
        if (cbvVar != null) {
            return cbvVar.b(str);
        }
        UnifyLog.e("UltronTradeHybridPreRenderManager.getPreRenderModelByUrl", "mConfig is null");
        return null;
    }

    public void x(String str, String str2, JSONObject jSONObject) {
        List<mbv> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e82176", new Object[]{this, str, str2, jSONObject});
            return;
        }
        cbv cbvVar = this.b;
        if (cbvVar == null) {
            hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "mConfig is null");
            return;
        }
        hcv c = cbvVar.c(str);
        if (c == null || (list = c.b) == null) {
            hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (mbv mbvVar : list) {
            if (mbvVar != null) {
                if (!l(str, mbvVar.f23930a)) {
                    String str3 = mbvVar.f23930a;
                    hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", str + "-" + str3 + " switcher is off");
                } else if (!TextUtils.equals(mbvVar.e, str2)) {
                    hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "no match stage");
                } else {
                    w(mbvVar, jSONObject);
                }
            }
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a107f510", new Object[]{this, str});
            return;
        }
        mbv v = v(str);
        if (v == null) {
            UnifyLog.e("UltronTradeHybridPreRenderManager.addPreRenderInstanceToPool", "model is null");
        } else {
            this.f30597a.n(v);
        }
    }

    public JSONObject z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("367da879", new Object[]{this, jSONObject});
        }
        return lbv.o(jSONObject);
    }

    public void w(mbv mbvVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c40c0e", new Object[]{this, mbvVar, jSONObject});
            return;
        }
        try {
            String str = mbvVar.j;
            List<String> list = mbvVar.k;
            String str2 = "default";
            if (jSONObject != null) {
                if (!TextUtils.isEmpty(jSONObject.getString("themisPreRenderUrl"))) {
                    str = jSONObject.getString("themisPreRenderUrl");
                }
                if (!TextUtils.isEmpty(jSONObject.getString("themisQueryIgnores"))) {
                    list = JSON.parseArray(jSONObject.getString("themisQueryIgnores"), String.class);
                }
                if (!TextUtils.isEmpty(jSONObject.getString("themisBizName"))) {
                    str2 = jSONObject.getString("themisBizName");
                }
            }
            if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
                if (jSONObject != null) {
                    this.e.put(str2, jSONObject);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("themisPreRenderUrl", (Object) str);
                    jSONObject2.put("themisQueryIgnores", (Object) list);
                    this.e.put(str2, jSONObject2);
                }
                PrerenderManager.INSTANCE.c(new xum.a().f(str).c(2).d(list).a(), new b(this));
                return;
            }
            hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "tmsPreRenderUrl or tmsQueryIgnoreList is invalid");
        } catch (Throwable th) {
            hav.g("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "onError:" + th.toString());
        }
    }

    static {
        t2o.a(157286835);
        t2o.a(157286824);
        t2o.a(157286825);
        if (pav.b()) {
            pav.l(new a(), vav.f("newUltron_container", "registerWeexModuleDelayMills", 0L));
        } else {
            lbv.l();
        }
    }
}
