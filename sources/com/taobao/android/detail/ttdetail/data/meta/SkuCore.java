package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.q2q;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "skuCore")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SkuCore extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final boolean isNoSkuId;
    private final c skuItem;
    private final Map<String, b> zeroSku2info;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6764a;
        public final String b;

        static {
            t2o.a(912261709);
        }

        public a(JSONObject jSONObject) {
            this.f6764a = jSONObject.getString("cacheName");
            this.b = jSONObject.getString("cacheUrl");
        }

        public static a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1304447", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new a(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f3c430e2", new Object[]{this});
            }
            return this.f6764a;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a89d4ad6", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f6765a;
        public final String b;

        static {
            t2o.a(912261710);
        }

        public b(JSONObject jSONObject) {
            this.f6765a = jSONObject.getString("asac");
            this.b = jSONObject.getString("itemApplyParams");
        }

        public static b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cb84fd68", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new b(jSONObject);
            }
            return null;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f65364ef", new Object[]{this});
            }
            return this.f6765a;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("990fb88e", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final String b;
        public final String c;
        public final boolean d;
        public final a e;
        public final a f;

        static {
            t2o.a(912261711);
        }

        public c(JSONObject jSONObject) {
            jSONObject.getString("skuH5Url");
            this.b = jSONObject.getString("skuWeexUrl");
            this.c = jSONObject.getString("skuV3WeexUrl");
            jSONObject.getString(q2q.KEY_SKU_ID);
            this.d = jSONObject.getBooleanValue("showAddressTaobao");
            this.e = a.a(jSONObject.getJSONObject("skuClientCache"));
            this.f = a.a(jSONObject.getJSONObject("skuV3ClientCache"));
        }

        public static c a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9d4e427a", new Object[]{jSONObject});
            }
            if (jSONObject != null) {
                return new c(jSONObject);
            }
            return null;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("31594c43", new Object[]{this});
            }
            return this.e;
        }

        public a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f681686", new Object[]{this});
            }
            return this.f;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b7c26ef", new Object[]{this});
            }
            return this.c;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("38a1b792", new Object[]{this});
            }
            return this.b;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9cc67546", new Object[]{this})).booleanValue();
            }
            return this.d;
        }
    }

    static {
        t2o.a(912261707);
    }

    public SkuCore(JSONObject jSONObject) {
        super(jSONObject);
        this.skuItem = c.a(jSONObject.getJSONObject("skuItem"));
        Map<String, b> initSku2Info = initSku2Info(jSONObject);
        this.zeroSku2info = initSku2Info;
        this.isNoSkuId = isNoSkuId(jSONObject, initSku2Info);
    }

    private Map<String, b> initSku2Info(JSONObject jSONObject) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7b64acab", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sku2info");
        if (jSONObject2 == null || (a2 = b.a(jSONObject2.getJSONObject("0"))) == null) {
            return null;
        }
        return new HashMap<String, b>(a2) { // from class: com.taobao.android.detail.ttdetail.data.meta.SkuCore.1
            public final /* synthetic */ b val$zeroSkuIdAttr;

            {
                this.val$zeroSkuIdAttr = a2;
                put("0", a2);
            }
        };
    }

    public static /* synthetic */ Object ipc$super(SkuCore skuCore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/SkuCore");
    }

    private boolean isNoSkuId(JSONObject jSONObject, Map<String, b> map) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("451daded", new Object[]{this, jSONObject, map})).booleanValue() : (map == null || (jSONObject2 = jSONObject.getJSONObject("sku2info")) == null || jSONObject2.size() != 1) ? false : true;
    }

    public c getSkuItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8d2cc0b4", new Object[]{this});
        }
        return this.skuItem;
    }

    public Map<String, b> getZeroSku2info() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bb466e5d", new Object[]{this});
        }
        return this.zeroSku2info;
    }

    public boolean isNoSkuId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bec0c358", new Object[]{this})).booleanValue() : this.isNoSkuId;
    }
}
