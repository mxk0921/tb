package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import java.util.Map;
import tb.ah0;
import tb.b5m;
import tb.bq6;
import tb.h1p;
import tb.h8n;
import tb.hr0;
import tb.jwj;
import tb.lba;
import tb.t2o;
import tb.tgh;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class IpvUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6970a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public Map<String, String> f;

        static {
            t2o.a(912262808);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f33cdf3c", new Object[]{this, str});
            }
            this.f6970a = str;
            return this;
        }

        public a b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81f369e7", new Object[]{this, map});
            }
            this.f = map;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d1992ed0", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("936ff339", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("41567076", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ec9374ff", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }
    }

    static {
        t2o.a(912262804);
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae4cd4e", new Object[]{str, context});
        } else {
            b5m.y().a(str, context);
        }
    }

    public static void b(Context context, Map<String, String> map) {
        ze7 Q0;
        bq6 e;
        Params params;
        JSONObject umbParams;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e95783a", new Object[]{context, map});
        } else if ((context instanceof jwj) && (Q0 = ((jwj) context).Q0()) != null && (e = Q0.e()) != null && (params = (Params) e.f(Params.class)) != null && (umbParams = params.getUmbParams()) != null) {
            map.put("bizIdentifyParams", umbParams.getString("aliBizCode"));
            for (Map.Entry<String, Object> entry : umbParams.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value != null) {
                    str = String.valueOf(value);
                } else {
                    str = "";
                }
                map.put(key, str);
            }
        }
    }

    public static a c(JSONObject jSONObject, Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3446be53", new Object[]{jSONObject, uri});
        }
        a aVar = new a();
        Seller seller = (Seller) lba.a(jSONObject, Seller.class);
        aVar.d(DataUtils.G(seller, ""));
        aVar.c(DataUtils.E(seller, ""));
        aVar.a(DataUtils.w((Item) lba.a(jSONObject, Item.class), ""));
        aVar.e(DataUtils.e0(seller));
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        aVar.f(str);
        Params params = (Params) lba.a(jSONObject, Params.class);
        if (params != null) {
            String cpsParams = params.getCpsParams();
            if (!TextUtils.isEmpty(cpsParams)) {
                aVar.b(new HashMap<String, String>(cpsParams) { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils.1
                    public final /* synthetic */ String val$cpsParams;

                    {
                        this.val$cpsParams = cpsParams;
                        put("cpsParams", cpsParams);
                    }
                });
            }
        }
        return aVar;
    }

    public static a d(bq6 bq6Var, Uri uri) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c60eee1a", new Object[]{bq6Var, uri});
        }
        a aVar = new a();
        Seller seller = (Seller) bq6Var.f(Seller.class);
        aVar.d(DataUtils.G(seller, ""));
        aVar.c(DataUtils.E(seller, ""));
        aVar.a(DataUtils.w((Item) bq6Var.f(Item.class), ""));
        aVar.e(DataUtils.e0(seller));
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        aVar.f(str);
        Params params = (Params) bq6Var.f(Params.class);
        if (params != null) {
            String cpsParams = params.getCpsParams();
            if (!TextUtils.isEmpty(cpsParams)) {
                aVar.b(new HashMap<String, String>(cpsParams) { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils.2
                    public final /* synthetic */ String val$cpsParams;

                    {
                        this.val$cpsParams = cpsParams;
                        put("cpsParams", cpsParams);
                    }
                });
            }
        }
        return aVar;
    }

    public static void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a27aaab3", new Object[]{map});
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null && map != null && !map.isEmpty()) {
            defaultTracker.updateNextPageUtparam(JSON.toJSONString(map));
        }
    }

    public static void f(Context context, String str) {
        AliUserTrackerInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("556cec02", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str) && context != null && (c = hr0.c()) != null) {
            c.d(context, str);
            c.updatePageName(context, str);
        }
    }

    public static void g(Context context) {
        AliUserTrackerInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ef8b9", new Object[]{context});
        } else if (context != null && (c = hr0.c()) != null) {
            c.pageDisAppear(context);
        }
    }

    public static void h(Context context, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe5d427", new Object[]{context, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (value != null) {
                    str = String.valueOf(value);
                } else {
                    str = "";
                }
                hashMap.put(key, str);
            }
        }
        i(context, hashMap);
    }

    public static void i(Context context, Map<String, String> map) {
        AliUserTrackerInterface c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e7247c", new Object[]{context, map});
        } else if (context != null && (c = hr0.c()) != null) {
            if (map == null) {
                map = new HashMap<>();
            }
            b(context, map);
            map.put("container_type", "xdetail");
            map.put("native_detail_v", "newArch");
            map.put("spm-cnt", b5m.K().b());
            c.updatePageProperties(context, map);
            try {
                b5m.A().d("Page_Detail", context, map);
            } catch (Throwable unused) {
            }
        }
    }

    public static void j(JSONObject jSONObject, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9bf0bd", new Object[]{jSONObject, uri});
        } else {
            k(c(jSONObject, uri));
        }
    }

    public static void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4b268d", new Object[]{aVar});
        } else if (!TextUtils.isEmpty(aVar.c)) {
            tgh.b("IpvUtils", "sendDuJuanInfo() itemId = " + aVar.f6970a + " ,shopId = " + aVar.b + " ,sellerId = " + aVar.c + " ,isTmall = " + aVar.d + " ,url = " + aVar.e);
            HashMap hashMap = new HashMap();
            Map<String, String> map = aVar.f;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put(ah0.AFC_ID, "");
            try {
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                if (!TextUtils.isEmpty(globalProperty)) {
                    hashMap.put(ah0.AFC_ID, globalProperty);
                }
            } catch (Throwable unused) {
            }
            try {
                AlimamaAdvertising.instance().commitTaokeInfo(aVar.e, aVar.c, aVar.f6970a, aVar.d, hashMap);
            } catch (Throwable unused2) {
            }
            try {
                AlimamaAdvertising.instance().uploadUDTrack(aVar.e, aVar.c, aVar.f6970a, aVar.d, hashMap);
            } catch (Throwable unused3) {
            }
            UtUtils.f(2101, "Page_Detail_Advert-SDKCall", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils.3
                {
                    put("shop_id", (Object) a.this.b);
                    put("seller_id", (Object) a.this.c);
                    put("item_id", (Object) a.this.f6970a);
                    put("is_tmall", (Object) ("" + a.this.d));
                    put("native_detail_v", "newArch");
                }
            });
        }
    }

    public static void l(bq6 bq6Var, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7138490", new Object[]{bq6Var, uri});
        } else {
            k(d(bq6Var, uri));
        }
    }

    public static void m(Context context, h8n h8nVar) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa70dc", new Object[]{context, h8nVar});
        } else if (h8nVar != null && (f = h8nVar.f()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(f);
            jSONObject.put("object_type", (Object) "item_id");
            jSONObject.put("ad_type", (Object) "munion");
            jSONObject.put("item_id", (Object) h8nVar.c());
            jSONObject.put("object_id", (Object) h8nVar.c());
            jSONObject.put("clickid", (Object) h8nVar.a());
            jSONObject.put(h1p.LIST_PARAM_KEY, (Object) f.getString(h1p.LIST_PARAM_KEY));
            jSONObject.put(h1p.LIST_TYPE_KEY, (Object) f.getString(h1p.LIST_TYPE_KEY));
            jSONObject.put("bdid", (Object) f.getString("bdid"));
            jSONObject.put("carrier_id", (Object) f.getString("carrier_id"));
            if (h8nVar.j()) {
                jSONObject.put("action", (Object) "seckill");
            } else {
                jSONObject.put("action", (Object) "ipv");
            }
            h(context, jSONObject);
        }
    }
}
