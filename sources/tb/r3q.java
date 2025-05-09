package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.SkuCore;
import com.taobao.android.detail.ttdetail.feature.DevFeature;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class r3q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(String str, JSONObject jSONObject);
    }

    static {
        t2o.a(912262836);
    }

    public static /* synthetic */ void a(SkuCore.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b87325", new Object[]{aVar});
        } else {
            n(aVar);
        }
    }

    public static String b(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f0e89eb", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter("from");
    }

    public static String c(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82083479", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return null;
        }
        return data.getQueryParameter(q2q.KEY_SKU_ID);
    }

    public static String d(List<? extends sx9> list, int i) {
        nb4 t;
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56fc08d", new Object[]{list, new Integer(i)});
        }
        if (list == null || list.isEmpty() || i < 0 || i >= list.size() || (t = ((tx9) ((sx9) list.get(i)).getComponentData()).t()) == null || (f = t.f()) == null) {
            return null;
        }
        return f.getString("skuText");
    }

    public static boolean f(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("696fe71c", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isDetail3SkuPriceLinkage();
    }

    public static boolean g(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64d4b088", new Object[]{feature})).booleanValue();
        }
        if (feature == null) {
            return false;
        }
        return feature.isDonateItem();
    }

    public static boolean h(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dfea5ab", new Object[]{feature})).booleanValue();
        }
        return true;
    }

    public static boolean i(Feature feature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("758d4870", new Object[]{feature})).booleanValue();
        }
        return true;
    }

    public static String j(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e99f6400", new Object[]{jSONObject});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(to8.ADD_CART);
        if (jSONObject3 != null) {
            str = jSONObject3.getString("itemId");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject(go2.EVENT_TYPE)) == null) {
            return str;
        }
        return jSONObject2.getString("itemId");
    }

    public static boolean k(SkuCore skuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5359fc", new Object[]{skuCore})).booleanValue();
        }
        return false;
    }

    public static void l(Context context, ze7 ze7Var, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c9346c", new Object[]{context, ze7Var, jSONObject, cVar});
            return;
        }
        SkuCore skuCore = (SkuCore) ze7Var.e().f(SkuCore.class);
        if (skuCore != null) {
            SkuCore.c skuItem = skuCore.getSkuItem();
            SkuCore.a aVar = null;
            String f = skuItem != null ? skuItem.f() : null;
            tgh.b("SkuUtils", "preloadWeex SkuUtils.preFetchSkuData newBuyUrl:" + f);
            SkuCore.a b2 = skuItem != null ? skuItem.b() : null;
            if (skuItem != null) {
                aVar = skuItem.d();
            }
            pos.mExecutor.execute(new a(context, b2, aVar, f, jSONObject, cVar));
        }
    }

    public static void m(Context context, ze7 ze7Var, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19e2bef", new Object[]{context, ze7Var, jSONObject, cVar});
            return;
        }
        SkuCore skuCore = (SkuCore) ze7Var.e().f(SkuCore.class);
        if (skuCore != null) {
            String e = skuCore.getSkuItem().e();
            tgh.b("SkuUtils", "preloadWeex SkuUtils.preFetchSkuV3Data skuV3WeexUrl:" + e);
            pos.mExecutor.execute(new b(context, e, jSONObject, cVar));
        }
    }

    public static void n(SkuCore.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23540fd6", new Object[]{aVar});
        } else if (aVar != null) {
            b5m.N().b(new SimpleEntry<>(aVar.b(), aVar.c()));
        }
    }

    public static String o(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ed33ef4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split2 = str2.split(":");
        if (split2.length != 2 || TextUtils.isEmpty(split2[0])) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(";")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split3 = str3.split(":");
                if (split3.length == 2 && TextUtils.equals(split3[0], split2[0])) {
                    str3 = str2;
                }
                sb.append(";");
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27089a;
        public final /* synthetic */ SkuCore.a b;
        public final /* synthetic */ SkuCore.a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ c f;

        public a(Context context, SkuCore.a aVar, SkuCore.a aVar2, String str, JSONObject jSONObject, c cVar) {
            this.f27089a = context;
            this.b = aVar;
            this.c = aVar2;
            this.d = str;
            this.e = jSONObject;
            this.f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!pq4.a(this.f27089a) && !tq4.e(this.f27089a)) {
                r3q.a(this.b);
                r3q.a(this.c);
                if (!TextUtils.isEmpty(this.d) && this.e != null) {
                    if (vbl.v0() || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData))) {
                        jSONObject = DynamicMergeUtils.j(this.e);
                    } else {
                        try {
                            jSONObject = a58.f(JSON.toJSONString(this.e, SerializerFeature.DisableCircularReferenceDetect));
                        } catch (Exception e) {
                            tgh.b("SkuUtils", "preFetchSkuData mergeResponseToJson exception:" + e.getMessage());
                            jSONObject = null;
                        }
                    }
                    if (!pq4.a(this.f27089a) && !tq4.e(this.f27089a) && (cVar = this.f) != null && jSONObject != null) {
                        cVar.a(this.d, jSONObject);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27090a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ c d;

        public b(Context context, String str, JSONObject jSONObject, c cVar) {
            this.f27090a = context;
            this.b = str;
            this.c = jSONObject;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!pq4.a(this.f27090a) && !tq4.e(this.f27090a) && !TextUtils.isEmpty(this.b) && this.c != null) {
                if (vbl.v0() || Boolean.TRUE.equals(DevFeature.mFeature.get(DevFeature.sDisableCopySkuData))) {
                    jSONObject = DynamicMergeUtils.j(this.c);
                } else {
                    try {
                        jSONObject = a58.f(JSON.toJSONString(this.c, SerializerFeature.DisableCircularReferenceDetect));
                    } catch (Exception e) {
                        tgh.b("SkuUtils", "preFetchSkuV3Data mergeResponseToJson exception:" + e.getMessage());
                        jSONObject = null;
                    }
                }
                if (!pq4.a(this.f27090a) && !tq4.e(this.f27090a) && (cVar = this.d) != null && jSONObject != null) {
                    cVar.a(this.b, jSONObject);
                }
            }
        }
    }

    public static int e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9890469c", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                return jSONObject.getJSONObject("data").getJSONObject("skuV3Data").getJSONObject("global").getJSONObject("skuGlobal").getJSONObject("skuDetail").getJSONObject("skuMap").keySet().size();
            } catch (Exception unused) {
                tgh.a("getSkuV3DataSkuCount exception");
            }
        }
        return 0;
    }

    public static boolean p(JSONObject jSONObject, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("231fa90f", new Object[]{jSONObject, ze7Var})).booleanValue();
        }
        if (!(jSONObject == null || ze7Var == null)) {
            String string = jSONObject.getString("actionFrom");
            if (TextUtils.isEmpty(string)) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail actionFrom is empty");
                return false;
            }
            string.hashCode();
            if (!string.equals("CONFIRM_DISMISS")) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail actionFrom(" + string + ") is not CONFIRM_DISMISS");
                return false;
            }
            String j = j(jSONObject);
            if (TextUtils.isEmpty(j)) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail itemId is empty");
                return false;
            }
            Resource resource = (Resource) ze7Var.e().f(Resource.class);
            if (resource == null) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail resource is null");
                return false;
            }
            JSONObject resident = resource.getResident();
            if (resident == null) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail resident is null");
                return false;
            }
            JSONObject jSONObject2 = resident.getJSONObject("bundle");
            if (jSONObject2 == null) {
                tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail bundle is null");
                return false;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(j);
            if (jSONObject3 != null) {
                jSONObject3.put("skuInfo", (Object) jSONObject);
                return true;
            }
            tgh.b("SkuUtils", "onSkuInfoChangedAndUpdateMainDetail itemInfo is null");
        }
        return false;
    }
}
