package com.taobao.android.sku.weex;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.WeexCore;
import com.taobao.android.sku.performance.model.PerformanceFlowModel;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;
import tb.axo;
import tb.d3q;
import tb.hxj;
import tb.lca;
import tb.on4;
import tb.pg1;
import tb.q2q;
import tb.q3q;
import tb.t2o;
import tb.tl;
import tb.txl;
import tb.vkb;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexMessageHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliXSkuCore f9470a;
    public final WeexCore b;
    public final WeexWrapper c;
    public volatile boolean e;
    public final b d = new b();
    public final List<Integer> f = new ArrayList();
    public final Map<String, d3q> g = new HashMap();
    public final Map<String, d3q> h = new HashMap();
    public final Map<String, Map.Entry<d3q, d3q>> i = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9472a;
        public final /* synthetic */ Map b;

        public a(String str, Map map) {
            this.f9472a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WeexMessageHandler.d(WeexMessageHandler.this).c(this.f9472a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque<Runnable> f9473a;
        public Runnable b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f9474a;

            public a(Runnable runnable) {
                this.f9474a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f9474a.run();
                } finally {
                    b.this.c();
                }
            }
        }

        static {
            t2o.a(442499350);
        }

        public b() {
            this.f9473a = new ArrayDeque<>();
        }

        public synchronized void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
            } else {
                this.f9473a.clear();
            }
        }

        public synchronized void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                return;
            }
            this.f9473a.offer(new a(runnable));
            if (this.b == null) {
                c();
            }
        }

        public synchronized void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
            } else if (WeexMessageHandler.e(WeexMessageHandler.this)) {
                Runnable poll = this.f9473a.poll();
                this.b = poll;
                if (poll != null) {
                    poll.run();
                }
            }
        }
    }

    static {
        t2o.a(442499299);
    }

    public WeexMessageHandler(AliXSkuCore aliXSkuCore, WeexCore weexCore, WeexWrapper weexWrapper, int i) {
        this.f9470a = aliXSkuCore;
        this.b = weexCore;
        this.c = weexWrapper;
    }

    public static /* synthetic */ AliXSkuCore a(WeexMessageHandler weexMessageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("40209b4e", new Object[]{weexMessageHandler});
        }
        return weexMessageHandler.f9470a;
    }

    public static /* synthetic */ WeexCore b(WeexMessageHandler weexMessageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexCore) ipChange.ipc$dispatch("a44b5107", new Object[]{weexMessageHandler});
        }
        return weexMessageHandler.b;
    }

    public static /* synthetic */ void c(d3q d3qVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64ec9e0", new Object[]{d3qVar, map});
        } else {
            j(d3qVar, map);
        }
    }

    public static /* synthetic */ WeexWrapper d(WeexMessageHandler weexMessageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexWrapper) ipChange.ipc$dispatch("35d06945", new Object[]{weexMessageHandler});
        }
        return weexMessageHandler.c;
    }

    public static /* synthetic */ boolean e(WeexMessageHandler weexMessageHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4583e62", new Object[]{weexMessageHandler})).booleanValue();
        }
        return weexMessageHandler.e;
    }

    public static void i(d3q d3qVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa21dbe", new Object[]{d3qVar, str, str2});
        } else if (str != null && d3qVar != null) {
            d3qVar.b(new HashMap<String, Object>(str, str2) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.6
                public final /* synthetic */ String val$key;
                public final /* synthetic */ String val$msg;

                {
                    this.val$key = str;
                    this.val$msg = str2;
                    put(str, str2);
                }
            });
        }
    }

    public static void j(d3q d3qVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e39c9b", new Object[]{d3qVar, map});
        } else if (map != null && d3qVar != null) {
            d3qVar.b(map);
        }
    }

    public static void k(d3q d3qVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb271ab2", new Object[]{d3qVar, str, str2});
        } else if (str != null && d3qVar != null) {
            d3qVar.a(new HashMap<String, Object>(str, str2) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.7
                public final /* synthetic */ String val$key;
                public final /* synthetic */ String val$msg;

                {
                    this.val$key = str;
                    this.val$msg = str2;
                    put(str, str2);
                }
            });
        }
    }

    public void E(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f05ac4", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("params")) != null && !jSONObject2.isEmpty()) {
            String string = jSONObject2.getString("serviceId");
            if (!TextUtils.isEmpty(string)) {
                i((d3q) ((HashMap) this.g).remove(string), "serviceStrData", jSONObject.toJSONString());
            }
        }
    }

    public void F(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b74224", new Object[]{this, jSONObject});
        } else {
            i((d3q) ((HashMap) this.h).remove(this.f9470a.L()), "changed", "true");
        }
    }

    public final boolean J(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab46a69", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if ("customApi".equals(String.valueOf(map.get("type")))) {
            return h0(map, d3qVar, d3qVar2);
        }
        return g0(map, d3qVar, d3qVar2);
    }

    public void K(JSONObject jSONObject, boolean z) {
        Object remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ade8d3", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        Map<String, Map.Entry<d3q, d3q>> map = this.i;
        String L = this.f9470a.L();
        HashMap hashMap = (HashMap) map;
        if (z) {
            remove = hashMap.get(L);
        } else {
            remove = hashMap.remove(L);
        }
        Map.Entry entry = (Map.Entry) remove;
        if (entry != null) {
            SkuLogUtils.k("onUpdateDetailCallbackData keepAlive:" + z);
            if (z) {
                k((d3q) entry.getKey(), "mtopStr", jSONObject.toJSONString());
            } else {
                i((d3q) entry.getKey(), "mtopStr", jSONObject.toJSONString());
            }
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc25d8ec", new Object[]{this, str});
            return;
        }
        Map.Entry entry = (Map.Entry) ((HashMap) this.i).remove(this.f9470a.L());
        if (entry != null) {
            SkuLogUtils.k("onUpdateDetailFailureData errorMsg:" + str);
            i((d3q) entry.getValue(), "errorMsg", str);
        }
    }

    public boolean P(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59e6f3d", new Object[]{this, map})).booleanValue();
        }
        return T("onSkuClose", g(map));
    }

    public boolean Q(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e03c111a", new Object[]{this, map})).booleanValue();
        }
        return T("onDarkCurtainClosed", g(map));
    }

    public boolean R(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("663c738a", new Object[]{this, map})).booleanValue();
        }
        return T("onSelectSku", g(map));
    }

    public boolean S(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("953e3b2b", new Object[]{this, map})).booleanValue();
        }
        return T("onSKUAction", g(map));
    }

    public boolean T(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ce51f1", new Object[]{this, str, map})).booleanValue();
        }
        this.d.b(new a(str, map));
        return true;
    }

    public boolean U(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a95ceda", new Object[]{this, map})).booleanValue();
        }
        return T("onSelectPVs", g(map));
    }

    public boolean V(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d745675", new Object[]{this, map, str})).booleanValue();
        }
        return T("onPreSkuShow", f(g(map), str));
    }

    public boolean W(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c3f542f", new Object[]{this, map})).booleanValue();
        }
        return T("onSelectSkuId", g(map));
    }

    public boolean X(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("514a102d", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return T("onSkuShow", h(str, z));
    }

    public final boolean Y(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8b61ab6", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.11
                {
                    put("errorMsg", "already downgrade");
                }
            });
            return false;
        }
        this.b.S();
        return true;
    }

    public final void c0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6c2c6a", new Object[]{this, map});
            return;
        }
        if (map != null) {
            Object obj = map.get("JSBRIDGE_START_UPTIME");
            Object obj2 = map.get("WXMODEL_START_UPTIME");
            HashMap hashMap = new HashMap();
            hashMap.put("from", "getInputData");
            if (obj instanceof Long) {
                txl.h().d("jsBridge", lca.STAGE_INTERACTIVE, ((Long) map.get("JSBRIDGE_START_UPTIME")).longValue(), System.currentTimeMillis(), hashMap);
            }
            if (obj2 instanceof Long) {
                txl.h().d("WXModule", lca.STAGE_INTERACTIVE, ((Long) map.get("WXMODEL_START_UPTIME")).longValue(), System.currentTimeMillis(), hashMap);
            }
        }
        txl.h().g();
        PerformanceFlowModel i = txl.h().i();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("performanceRecord", (Object) JSON.parseObject(JSON.toJSONString(i)));
            JSONObject jSONObject2 = this.f9470a.z().e().getJSONObject("skuTimeStamp");
            if (jSONObject2 == null) {
                this.f9470a.z().e().put("skuTimeStamp", (Object) jSONObject);
            } else {
                jSONObject2.putAll(jSONObject);
            }
        } catch (Throwable unused) {
        }
        txl.h().n();
    }

    public final boolean d0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d044da00", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.16
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        vkb w = this.f9470a.w();
        if (w != null) {
            Object obj = map.get("fields");
            JSONObject parseObject = JSON.parseObject(String.valueOf(obj));
            if (obj == null || parseObject == null || parseObject.isEmpty()) {
                j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.17
                    {
                        put("errorMsg", "parse fields to json can not be empty");
                    }
                });
                z = false;
            } else {
                j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.18
                    {
                        put("callback", "true");
                    }
                });
                w.a(parseObject);
            }
            return z;
        }
        j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.19
            {
                put("errorMsg", "native callback is broken");
            }
        });
        return false;
    }

    public final Map<String, Object> f(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3caee475", new Object[]{this, map, str});
        }
        if (map == null) {
            return new HashMap<String, Object>(str) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.2
                public final /* synthetic */ String val$bottomMode;

                {
                    this.val$bottomMode = str;
                    put("bottom_mode", str);
                }
            };
        }
        map.put("bottom_mode", str);
        return map;
    }

    public final Map<String, Object> g(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("82ef087d", new Object[]{this, map});
        }
        if (map == null) {
            return new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.1
                {
                    put("_sku_token_", WeexMessageHandler.a(WeexMessageHandler.this).L());
                }
            };
        }
        map.put("_sku_token_", this.f9470a.L());
        return map;
    }

    public final Map<String, Object> h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d965c5e", new Object[]{this, str, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_sku_token_", this.f9470a.L());
        hashMap.put("bottom_mode", str);
        hashMap.put("nativeShowSku", Boolean.valueOf(z));
        on4 J = this.f9470a.J();
        hashMap.put("propPath", J.c("propPath"));
        hashMap.put("propIsHandle", J.c("propIsHandle"));
        return hashMap;
    }

    public final boolean l(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82080ec3", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.22
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            float parseFloat = Float.parseFloat(String.valueOf(map.get("height")));
            if (parseFloat <= 1.0E-5f) {
                parseFloat = 0.9f;
            } else if (parseFloat >= 1.00001f) {
                parseFloat = 1.0f;
            }
            ((com.taobao.android.sku.presenter.a) this.f9470a.I().n()).o(parseFloat, false);
            j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.23
                {
                    put("changed", "true");
                }
            });
            return true;
        } catch (Throwable unused) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.24
                {
                    put("errorMsg", "height is not a float value or dialog do not support adjust height");
                }
            });
            return false;
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d.a();
        ((HashMap) this.g).clear();
        ((HashMap) this.h).clear();
        ((HashMap) this.i).clear();
        Iterator it = ((ArrayList) this.f).iterator();
        while (it.hasNext()) {
            this.f9470a.J().f(((Integer) it.next()).intValue());
        }
    }

    public final boolean n(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfe4e130", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.28
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.29
            {
                put("dismiss", "true");
            }
        });
        this.f9470a.o();
        return true;
    }

    public final boolean p(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e908525e", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.14
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.15
            {
                put("bottomMode", WeexMessageHandler.b(WeexMessageHandler.this).s());
            }
        });
        return true;
    }

    public final boolean q(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a3a83c", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.20
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.21
            {
                put("utParams", WeexMessageHandler.a(WeexMessageHandler.this).M());
            }
        });
        return true;
    }

    public final boolean s(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15412651", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.30
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        Rect x = this.f9470a.x();
        if (x == null) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.31
                {
                    put("errorMsg", "cart position is empty");
                }
            });
            return false;
        }
        View d = this.c.d();
        if (d == null) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.32
                {
                    put("errorMsg", "weex container is empty");
                }
            });
            return false;
        }
        int[] iArr = new int[2];
        d.getLocationOnScreen(iArr);
        j(d3qVar, new HashMap<String, Object>(x, iArr) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.33
            public final /* synthetic */ Rect val$cartPosition;
            public final /* synthetic */ int[] val$weexContainerLocations;

            {
                this.val$cartPosition = x;
                this.val$weexContainerLocations = iArr;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", (Object) Integer.valueOf(x.left));
                jSONObject.put("y", (Object) Integer.valueOf(x.top));
                jSONObject.put("width", (Object) Integer.valueOf(x.right - x.left));
                jSONObject.put("height", (Object) Integer.valueOf(x.bottom - x.top));
                put("cartIconRect", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", (Object) Integer.valueOf(axo.b(WeexMessageHandler.a(WeexMessageHandler.this).y(), iArr[0])));
                jSONObject2.put("y", (Object) Integer.valueOf(axo.b(WeexMessageHandler.a(WeexMessageHandler.this).y(), iArr[1])));
                put("wxOffset", jSONObject2);
            }
        });
        return true;
    }

    public final boolean t(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58a3ce24", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        c0(map);
        j(d3qVar, new HashMap<String, Object>(this.f9470a.z().e(), q3q.a(this.f9470a.y())) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.9
            public final /* synthetic */ JSONObject val$extInput;
            public final /* synthetic */ JSONObject val$tradeParams;

            {
                this.val$extInput = r2;
                this.val$tradeParams = r3;
                put("extInputStr", r2.toJSONString());
                put("tradeParamStr", r3.toJSONString());
                put("mtopTimeStamp", String.valueOf(SDKUtils.getCorrectionTimeMillis()));
            }
        });
        return true;
    }

    public boolean w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e4a69fd", new Object[]{this, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && ((HashMap) this.i).get(str) != null) {
            return true;
        }
        return false;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2f4956", new Object[]{this});
            return;
        }
        this.e = true;
        this.d.c();
    }

    public boolean B(String str, Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec98636", new Object[]{this, str, map, d3qVar, d3qVar2})).booleanValue();
        }
        if ("onCloseSku".equals(str)) {
            return y(d3qVar, d3qVar2);
        }
        if ("getDetail".equals(str)) {
            return z(d3qVar, d3qVar2);
        }
        if ("getNodeData".equals(str)) {
            return A(map, d3qVar, d3qVar2);
        }
        if ("updateDetail".equals(str)) {
            return J(map, d3qVar, d3qVar2);
        }
        if ("downgrade2Native".equals(str)) {
            return o(map, d3qVar, d3qVar2);
        }
        if ("openServicePage".equals(str)) {
            return N(map, d3qVar, d3qVar2);
        }
        if ("openSizeChartPage".equals(str)) {
            return O(map, d3qVar, d3qVar2);
        }
        if ("openDarkCurtain".equals(str)) {
            return M(map, d3qVar, d3qVar2);
        }
        if ("onNewBuyUMAlarm".equals(str)) {
            return D(map, d3qVar, d3qVar2);
        }
        if ("onNewBuyTlog".equals(str)) {
            return C(map, d3qVar, d3qVar2);
        }
        if ("onSkuV3UMAlarm".equals(str)) {
            return I(map, d3qVar, d3qVar2);
        }
        if ("onSkuV3Tlog".equals(str)) {
            return H(map, d3qVar, d3qVar2);
        }
        if ("getInputData".equals(str)) {
            return t(map, d3qVar, d3qVar2);
        }
        if ("getUserBehaviorData".equals(str)) {
            return v(map, d3qVar, d3qVar2);
        }
        if ("refreshDetail".equals(str)) {
            return Y(map, d3qVar, d3qVar2);
        }
        if ("syncSelectedProps".equals(str)) {
            return e0(map, d3qVar, d3qVar2);
        }
        if ("getBottomMode".equals(str)) {
            return p(map, d3qVar, d3qVar2);
        }
        if ("skuCallback".equals(str)) {
            return d0(map, d3qVar, d3qVar2);
        }
        if ("getClientUTParams".equals(str)) {
            return q(map, d3qVar, d3qVar2);
        }
        if ("changeDialogHeight".equals(str)) {
            return l(map, d3qVar, d3qVar2);
        }
        if ("getTimeStamp".equals(str)) {
            return u(map, d3qVar, d3qVar2);
        }
        if ("dismissLoading".equals(str)) {
            return n(map, d3qVar, d3qVar2);
        }
        if ("getExtInputForAddbag".equals(str)) {
            return s(map, d3qVar, d3qVar2);
        }
        if ("saveData".equals(str)) {
            return a0(map, d3qVar, d3qVar2);
        }
        if ("getData".equals(str)) {
            return r(map, d3qVar, d3qVar2);
        }
        if ("registerObserver".equals(str)) {
            return Z(map, d3qVar, d3qVar2);
        }
        if ("unregisterObserver".equals(str)) {
            return f0(map, d3qVar, d3qVar2);
        }
        if ("onSKUActionCallback".equals(str)) {
            return G(map, d3qVar, d3qVar2);
        }
        if ("setPageVisible".equals(str)) {
            return b0(map, d3qVar, d3qVar2);
        }
        i(d3qVar2, "errorMsg", "not found " + str + " handler");
        return false;
    }

    public final boolean C(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7f79c6d", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        SkuLogUtils.r(SkuLogUtils.LOG_TRACE_MODULE, String.valueOf(map.get(tl.KEY_STEP)), String.valueOf(map.get("stepMsg")), String.valueOf(map.get("logContent")));
        i(d3qVar, pg1.ATOM_EXT_print, "true");
        return true;
    }

    public final boolean D(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27b0374e", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        SkuLogUtils.b(this.f9470a.u(), SkuLogUtils.UM_NEWBUY_E_PREFIX.concat(String.valueOf(map.get("errorCode"))), String.valueOf(map.get("errorMsg")), SkuLogUtils.UM_WEEX_E_SERVICE_ID);
        i(d3qVar, "alarm", "true");
        return true;
    }

    public final boolean H(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af42a5d7", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        SkuLogUtils.r(SkuLogUtils.LOG_TRACE_MODULE_SKU_V3, String.valueOf(map.get(tl.KEY_STEP)), String.valueOf(map.get("stepMsg")), String.valueOf(map.get("logContent")));
        i(d3qVar, pg1.ATOM_EXT_print, "true");
        return true;
    }

    public final boolean I(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcccbda4", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        SkuLogUtils.b(this.f9470a.u(), SkuLogUtils.UM_SKU_V3_E_PREFIX.concat(String.valueOf(map.get("errorCode"))), String.valueOf(map.get("errorMsg")), SkuLogUtils.UM_WEEX_E_SERVICE_ID);
        i(d3qVar, "alarm", "true");
        return true;
    }

    public final boolean N(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b98f7348", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("serviceLink"));
        String valueOf2 = String.valueOf(map.get("serviceId"));
        String valueOf3 = String.valueOf(map.get("serviceUniqueId"));
        String valueOf4 = String.valueOf(map.get("itemId"));
        String valueOf5 = String.valueOf(map.get(q2q.KEY_SKU_ID));
        if (TextUtils.isEmpty(valueOf)) {
            str = "serviceLink is empty";
        } else if (TextUtils.isEmpty(valueOf2)) {
            str = "serviceId is empty";
        } else if (TextUtils.isEmpty(valueOf4)) {
            str = "itemId is empty";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            i(d3qVar2, "errorMsg", str);
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(valueOf).buildUpon();
        buildUpon.appendQueryParameter("serviceItemId", valueOf2);
        buildUpon.appendQueryParameter("serviceItemSkuId", valueOf3);
        buildUpon.appendQueryParameter("itemId", valueOf4);
        buildUpon.appendQueryParameter("itemSkuId", valueOf5);
        buildUpon.appendQueryParameter("sku_token", this.f9470a.L());
        buildUpon.appendQueryParameter("selectedUniqueId", valueOf3);
        AliNavServiceInterface c = xq0.c();
        if (c == null) {
            return false;
        }
        ((HashMap) this.g).put(valueOf2, d3qVar);
        return c.a(this.f9470a.y()).c(buildUpon.build().toString());
    }

    public final boolean v(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81cb80e5", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        j(d3qVar, new HashMap<String, Object>(this.f9470a.z().f("userBehaviorData")) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.10
            public final /* synthetic */ JSONObject val$userBehaviorData;

            {
                this.val$userBehaviorData = r2;
                if (r2 != null && !r2.isEmpty()) {
                    putAll(r2);
                }
            }
        });
        return true;
    }

    public final boolean y(d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51396def", new Object[]{this, d3qVar, d3qVar2})).booleanValue();
        }
        this.b.l();
        i(d3qVar, IDecisionResult.STATE_CLOSED, "true");
        return true;
    }

    public final boolean A(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f12290bf", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        JSONObject n = this.f9470a.z().n();
        if (n == null || n.isEmpty()) {
            i(d3qVar2, "errorMsg", "mtop data is empty");
            return false;
        }
        String valueOf = String.valueOf(map.get("nodePath"));
        if (TextUtils.isEmpty(valueOf)) {
            SkuLogUtils.j("getNodeData", "nodePath is empty");
            i(d3qVar, "nodeStr", n.toJSONString());
        } else {
            String[] split = valueOf.split("\\.");
            if (split.length == 0) {
                SkuLogUtils.j("getNodeData", "nodePath split result length is 0");
                i(d3qVar, "nodeStr", n.toJSONString());
                return true;
            }
            int length = split.length;
            for (int i = 0; i < length; i++) {
                String str = split[i];
                if (TextUtils.isEmpty(str)) {
                    String str2 = "nodePath: " + valueOf + " split with an empty node at index: " + i;
                    SkuLogUtils.j("getNodeData", str2);
                    i(d3qVar2, "errorMsg", str2);
                    return false;
                }
                if (i == length - 1) {
                    try {
                        i(d3qVar, "nodeStr", String.valueOf(n.get(str)));
                    } catch (Throwable th) {
                        String th2 = th.toString();
                        SkuLogUtils.j("getNodeData", "nodePath: " + valueOf + " exception: " + th2);
                        StringBuilder sb = new StringBuilder("exception: ");
                        sb.append(th2);
                        i(d3qVar2, "errorMsg", sb.toString());
                    }
                } else {
                    n = n.getJSONObject(str);
                }
            }
        }
        return true;
    }

    public final boolean G(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f814d69", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.4
                {
                    put("errorMsg", "weex already downgrade");
                }
            });
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            jSONObject.putAll(map);
        }
        this.f9470a.Y(new JSONObject(jSONObject) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.5
            public final /* synthetic */ JSONObject val$paramJson;

            {
                this.val$paramJson = jSONObject;
                put("action", "dark_curtain_on_action_callback");
                put("params", (Object) jSONObject);
            }
        });
        i(d3qVar, "send", "true");
        return true;
    }

    public final boolean Z(Map<String, Object> map, final d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("170d9c9", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.39
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        Object obj = map.get("key");
        if (obj == null) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.40
                {
                    put("errorMsg", "key must not be empty");
                }
            });
            return false;
        }
        int d = this.f9470a.J().d(String.valueOf(obj), new on4.a(this) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.41
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.on4.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a167bb9d", new Object[]{this, str, str2});
                } else {
                    WeexMessageHandler.c(d3qVar, new HashMap<String, Object>(str, str2) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.41.1
                        public final /* synthetic */ String val$newValue;
                        public final /* synthetic */ String val$oldValue;

                        {
                            this.val$oldValue = str;
                            this.val$newValue = str2;
                            put("oldValue", str);
                            put("newValue", str2);
                        }
                    });
                }
            }
        });
        if (d == -1) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.42
                {
                    put("errorMsg", "register failed with unknown error");
                }
            });
            return false;
        }
        ((ArrayList) this.f).add(Integer.valueOf(d));
        j(d3qVar, new HashMap<String, Object>(d) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.43
            public final /* synthetic */ int val$observerId;

            {
                this.val$observerId = d;
                put("observerId", Integer.valueOf(d));
            }
        });
        return true;
    }

    public final boolean a0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7bc95b", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.34
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        Object obj = map.get("key");
        Object obj2 = map.get("value");
        if (obj == null || obj2 == null) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.35
                {
                    put("errorMsg", "key and value must not be empty");
                }
            });
            return false;
        }
        this.f9470a.J().e(String.valueOf(obj), String.valueOf(obj2));
        j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.36
            {
                put("saved", "true");
            }
        });
        return true;
    }

    public final boolean b0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c379f441", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.3
                {
                    put("errorMsg", "weex already downgrade");
                }
            });
            return false;
        }
        this.b.N();
        i(d3qVar, "visible", "true");
        SkuLogUtils.t(SkuLogUtils.UM_SKU_SILENT_WEEX_RESET);
        this.f9470a.V(-700006, "ActiveCallSetPageVisible");
        return true;
    }

    public final boolean e0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a80d4c8", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.12
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.13
            {
                put("sync", "true");
            }
        });
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.syncData");
        intent.putExtra("selectedTextMap", String.valueOf(map.get("selectedTextMap")));
        intent.putExtra(hxj.UNIQID, this.f9470a.L());
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f9470a.y()).sendBroadcast(intent);
        return true;
    }

    public final boolean f0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cc7a550", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.44
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            int parseInt = Integer.parseInt(String.valueOf(map.get("observerId")));
            if (this.f9470a.J().f(parseInt)) {
                j(d3qVar, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.46
                    {
                        put("removed", "true");
                    }
                });
                return true;
            }
            j(d3qVar2, new HashMap<String, Object>("not found observerId : " + parseInt) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.47
                public final /* synthetic */ String val$notFoundIdMsg;

                {
                    this.val$notFoundIdMsg = r2;
                    put("errorMsg", r2);
                }
            });
            return false;
        } catch (Throwable th) {
            j(d3qVar2, new HashMap<String, Object>(th.toString()) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.45
                public final /* synthetic */ String val$msg;

                {
                    this.val$msg = r3;
                    put("errorMsg", "observerId is not a number : " + r3);
                }
            });
            return false;
        }
    }

    public final boolean o(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a051a1ee", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("errorCode"));
        String valueOf2 = String.valueOf(map.get("errorMsg"));
        if (!this.b.C()) {
            this.b.p("Passive=".concat(valueOf), valueOf2);
            i(d3qVar, "downgrade", "true");
            this.f9470a.V("BUYNOW".equals(this.b.s()) ? -700003 : -700004, "WeexCallDowngrade2Native");
            return true;
        }
        i(d3qVar2, "errorMsg", "already downgrade");
        return false;
    }

    public final boolean r(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd367022", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.37
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        j(d3qVar, new HashMap<String, Object>(this.f9470a.J().c(String.valueOf(map.get("key")))) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.38
            public final /* synthetic */ String val$value;

            {
                this.val$value = r2;
                put("value", r2);
            }
        });
        return true;
    }

    public final boolean u(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("598d0202", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        if (this.b.C()) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.25
                {
                    put("errorMsg", "core is broken");
                }
            });
            return false;
        }
        try {
            JSONObject jSONObject = this.f9470a.z().e().getJSONObject("skuTimeStamp");
            if (jSONObject != null) {
                j(d3qVar, new HashMap<String, Object>(jSONObject) { // from class: com.taobao.android.sku.weex.WeexMessageHandler.26
                    public final /* synthetic */ JSONObject val$timeData;

                    {
                        this.val$timeData = jSONObject;
                        put("timeStamp", jSONObject.toJSONString());
                    }
                });
            }
            return true;
        } catch (Throwable unused) {
            j(d3qVar2, new HashMap<String, Object>() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.27
                {
                    put("errorMsg", "timeStamp to string error");
                }
            });
            return false;
        }
    }

    public final boolean z(d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1d2f15d", new Object[]{this, d3qVar, d3qVar2})).booleanValue();
        }
        JSONObject n = this.f9470a.z().n();
        if (n == null || n.isEmpty()) {
            i(d3qVar2, "errorMsg", "mtop data is empty");
            return false;
        }
        i(d3qVar, "mtopStr", n.toJSONString());
        return true;
    }

    public final boolean g0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286daab4", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("originalItemId"));
        String valueOf2 = String.valueOf(map.get("targetItemId"));
        String valueOf3 = String.valueOf(map.get(q2q.KEY_AREA_ID));
        String valueOf4 = String.valueOf(map.get("addressId"));
        String valueOf5 = String.valueOf(map.get("params"));
        String valueOf6 = String.valueOf(map.get("forbidLoading"));
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(valueOf2)) {
            i(d3qVar2, "errorMsg", "originalItemId or targetItemId is empty");
            return false;
        }
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.updateData");
        intent.putExtra("skuToken", this.f9470a.L());
        intent.putExtra("originalItemId", valueOf);
        intent.putExtra("targetItemId", valueOf2);
        intent.putExtra(q2q.KEY_AREA_ID, valueOf3);
        intent.putExtra("addressId", valueOf4);
        intent.putExtra("params", valueOf5);
        intent.putExtra("forbidLoading", valueOf6);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f9470a.y()).sendBroadcast(intent);
        return true;
    }

    public final boolean O(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35d97820", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        String valueOf = String.valueOf(map.get("chartLink"));
        String valueOf2 = String.valueOf(map.get("itemId"));
        String valueOf3 = String.valueOf(map.get("targetItemId"));
        String valueOf4 = String.valueOf(map.get("originalItemId"));
        String valueOf5 = String.valueOf(map.get("sellerId"));
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("needCallback")));
        if (TextUtils.isEmpty(valueOf)) {
            str = "chartLink is empty";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            i(d3qVar2, "errorMsg", str);
            return false;
        }
        Uri.Builder buildUpon = Uri.parse(valueOf).buildUpon();
        buildUpon.appendQueryParameter("itemId", valueOf2);
        buildUpon.appendQueryParameter("targetItemId", valueOf3);
        buildUpon.appendQueryParameter("originalItemId", valueOf4);
        buildUpon.appendQueryParameter("sellerId", valueOf5);
        buildUpon.appendQueryParameter("sku_token", this.f9470a.L());
        buildUpon.appendQueryParameter("needCallback", String.valueOf(parseBoolean));
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            if (parseBoolean) {
                ((HashMap) this.h).put(this.f9470a.L(), d3qVar);
            }
            return c.a(this.f9470a.y()).c(buildUpon.build().toString());
        }
        i(d3qVar2, "errorMsg", "can not open size chart page");
        return false;
    }

    public final boolean M(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        final JSONArray jSONArray;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("edb902f0", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        final JSONArray parseArray = JSON.parseArray(String.valueOf(map.get("imageInfoList")));
        final JSONObject parseObject = JSON.parseObject(String.valueOf(map.get("currentImage")));
        final String valueOf = String.valueOf(map.get("skuBaseNotDisplayed"));
        final JSONArray parseArray2 = JSON.parseArray(String.valueOf(map.get("clickImgRect")));
        final String valueOf2 = String.valueOf(map.get("from"));
        final String valueOf3 = String.valueOf(map.get("bottomMode"));
        final String valueOf4 = String.valueOf(map.get("skuLightoffDowngrade"));
        final String valueOf5 = String.valueOf(map.get("containerType"));
        if (map.containsKey("propImagesForSelect")) {
            jSONArray = JSON.parseArray(String.valueOf(map.get("propImagesForSelect")));
        } else {
            jSONArray = new JSONArray();
        }
        if (parseArray == null || parseArray.isEmpty()) {
            str = "imageInfoList is empty";
        } else if (parseObject == null || parseObject.isEmpty()) {
            str = "currentImage is empty";
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            i(d3qVar2, "errorMsg", str);
            return false;
        }
        this.f9470a.Y(new JSONObject() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.8
            {
                put("action", "next_page_dark_curtain");
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.weex.WeexMessageHandler.8.1
                    {
                        put("imageInfoList", (Object) parseArray);
                        put("currentImage", (Object) parseObject);
                        put("skuBaseNotDisplayed", (Object) valueOf);
                        put("clickImgRect", (Object) parseArray2);
                        put("from", (Object) valueOf2);
                        put("bottomMode", (Object) valueOf3);
                        put("skuLightoffDowngrade", (Object) valueOf4);
                        put("containerType", (Object) valueOf5);
                        put("propImagesForSelect", (Object) jSONArray);
                    }
                });
            }
        });
        i(d3qVar, "opened", "true");
        return true;
    }

    public final boolean h0(Map<String, Object> map, d3q d3qVar, d3q d3qVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e967cff9", new Object[]{this, map, d3qVar, d3qVar2})).booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("reload")));
        String valueOf = String.valueOf(map.get("apiInfo"));
        JSONObject parseObject = JSON.parseObject(valueOf);
        String string = parseObject.getString("apiName");
        String string2 = parseObject.getString("apiVersion");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            i(d3qVar2, "errorMsg", "apiName or apiVersion is empty");
            return false;
        }
        String valueOf2 = String.valueOf(map.get("headerInfo"));
        String valueOf3 = String.valueOf(map.get("data"));
        String valueOf4 = String.valueOf(map.get("forbidLoading"));
        String valueOf5 = String.valueOf(map.get("streamMode"));
        Intent intent = new Intent();
        intent.setAction("com.taobao.sku.intent.action.updateData");
        intent.putExtra("skuToken", this.f9470a.L());
        intent.putExtra("updateWithCustomApi", "true");
        intent.putExtra("apiInfo", valueOf);
        intent.putExtra("headerInfo", valueOf2);
        intent.putExtra("data", valueOf3);
        intent.putExtra("forbidLoading", valueOf4);
        intent.putExtra("streamMode", valueOf5);
        intent.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(this.f9470a.y()).sendBroadcast(intent);
        if (parseBoolean) {
            return true;
        }
        ((HashMap) this.i).put(this.f9470a.L(), new AbstractMap.SimpleEntry(d3qVar, d3qVar2));
        return true;
    }
}
