package tb;

import android.app.Activity;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTControlHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vlo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final vlo b = new vlo();

    /* renamed from: a  reason: collision with root package name */
    public b f30090a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            b4p.a("SearchAddCartUtil", "fail to add to cart: " + str + "::" + str2);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
            } else if (map != null && "1".equals(map.get("resultCode"))) {
                b4p.a("SearchAddCartUtil", "add to cart successfully");
                vlo.this.d();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f30092a = "";
        public String b = "";
        public String c = "";
        public String d = "";

        static {
            t2o.a(815793494);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("48809f06", new Object[]{bVar});
            }
            return bVar.f30092a;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cf6fe47e", new Object[]{bVar, str});
            }
            bVar.f30092a = str;
            return str;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("effc78c7", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String d(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("287b2fff", new Object[]{bVar, str});
            }
            bVar.b = str;
            return str;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97785288", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String f(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("81867b80", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3ef42c49", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ String h(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("da91c701", new Object[]{bVar, str});
            }
            bVar.d = str;
            return str;
        }
    }

    static {
        t2o.a(815793492);
    }

    public static vlo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vlo) ipChange.ipc$dispatch("acf8f540", new Object[0]);
        }
        return b;
    }

    public final ArrayMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("fba1ab5e", new Object[]{this});
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        b bVar = this.f30090a;
        if (bVar == null) {
            return arrayMap;
        }
        arrayMap.put("item_id", b.a(bVar));
        arrayMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, b.c(this.f30090a));
        arrayMap.put("bucket_id", b.e(this.f30090a));
        arrayMap.put("query", b.g(this.f30090a));
        arrayMap.put("rainbow", oen.j());
        return arrayMap;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8194bf", new Object[]{this});
            return;
        }
        b4p.a("SearchAddCartUtil", "success");
        sen.f("ClickAddToCartSuccess", b());
    }

    public final void e(String str, CommonBaseDatasource commonBaseDatasource, AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97437c51", new Object[]{this, str, commonBaseDatasource, auctionBaseBean});
            return;
        }
        b bVar = new b();
        this.f30090a = bVar;
        b.b(bVar, str);
        CommonSearchResult commonSearchResult = (CommonSearchResult) commonBaseDatasource.getTotalSearchResult();
        if (commonSearchResult != null) {
            b.d(this.f30090a, commonSearchResult.getMainInfo().rn);
            b.f(this.f30090a, commonSearchResult.getMainInfo().abtest);
        }
        b.h(this.f30090a, commonBaseDatasource.getKeyword());
    }

    public boolean a(String str, CommonBaseDatasource commonBaseDatasource, boolean z, AuctionBaseBean auctionBaseBean, Activity activity) {
        String str2;
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d016491", new Object[]{this, str, commonBaseDatasource, new Boolean(z), auctionBaseBean, activity})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (z) {
            e(str, commonBaseDatasource, auctionBaseBean);
            ArrayMap<String, String> b2 = b();
            if (!(activity == null || (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(activity)) == null || pageProperties.isEmpty())) {
                String str3 = pageProperties.get("spm-url");
                if (!TextUtils.isEmpty(str3)) {
                    b2.put("spm-url", str3);
                }
                String str4 = pageProperties.get("spm-cnt");
                if (!TextUtils.isEmpty(str4)) {
                    b2.put("spm-cnt", str4);
                }
            }
            UTHitBuilders$UTControlHitBuilder uTHitBuilders$UTControlHitBuilder = new UTHitBuilders$UTControlHitBuilder("/wxcart.list.add_to_cart");
            uTHitBuilders$UTControlHitBuilder.setProperties(b2);
            uTHitBuilders$UTControlHitBuilder.setProperty(g1v.FIELD_ARG1, "/wxcart.list.add_to_cart");
            UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTControlHitBuilder.build());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("actionType", "0");
        hashMap.put("bizName", "taobao_main_search");
        if (o4p.q0()) {
            str2 = "2.0";
        } else {
            str2 = "1.0";
        }
        if (auctionBaseBean != null && !TextUtils.isEmpty(auctionBaseBean.locType)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(r4p.KEY_LOC_TYPE, (Object) auctionBaseBean.locType);
            jSONObject.put(r4p.KEY_MSOA_TRANS_KEY, (Object) r4p.KEY_LOC_TYPE);
            hashMap.put("sourceType", "0");
            hashMap.put("exParams", jSONObject);
            str2 = k75.VIDEOCONFIG_API_VERSION_3;
        }
        try {
            rrh.e().o(new vrh("msoa.taobao.search", "msoa.taobao.detail.showsku", str2, "msoa.taobao.search", hashMap), new a());
        } catch (Exception unused) {
            b4p.b("SearchAddCartUtil", "add to cart exception");
        }
        return true;
    }
}
