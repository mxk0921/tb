package tb;

import android.text.TextUtils;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f1p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WSEARCH_TPP_API_NAME_VALUE = "mtop.relationrecommend.MtopRecommend.recommend";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f18946a;
    public static boolean b = n4p.d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements AliServiceFindedCallback<mvd> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void onServiceFinded(mvd mvdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("914c168f", new Object[]{this, mvdVar});
            } else if (mvdVar != null) {
                try {
                    f1p.b(mvdVar.isAutoPlayVideoUnderCurrentNetwork(Globals.getApplication()));
                } catch (Throwable unused) {
                    f1p.b(n4p.d());
                }
            }
        }
    }

    static {
        t2o.a(815792166);
        HashMap hashMap = new HashMap();
        f18946a = hashMap;
        hashMap.put("localSearch", "24795");
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0871424", new Object[]{map});
        }
        if (map == null || map.isEmpty() || !o4p.q2()) {
            return null;
        }
        String str = map.get("channelSrp");
        if (TextUtils.isEmpty(str)) {
            str = map.get(xrl.G_CHANNELSRP);
        }
        return (String) ((HashMap) f18946a).get(str);
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static String c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("882a4851", new Object[]{map});
        }
        if (map == null) {
            return "mtop.taobao.wsearch.appsearch";
        }
        if (!TextUtils.isEmpty(map.get("appId"))) {
            return WSEARCH_TPP_API_NAME_VALUE;
        }
        String a2 = a(map);
        if (!TextUtils.isEmpty(a2)) {
            map.put("appId", a2);
            return WSEARCH_TPP_API_NAME_VALUE;
        }
        String str = map.get("m");
        if (TextUtils.equals(map.get("m"), r4p.VALUE_MODULE_INSHOP)) {
            map.put("appId", r4p.VALUE_TPP_IN_SHOP_APP_ID);
            if (l3p.INSTANCE.b()) {
                map.put("ovsFrom", "inshop");
            }
            return WSEARCH_TPP_API_NAME_VALUE;
        } else if (TextUtils.equals(r4p.VALUE_SHOWTYPE_SIMILAR_SHOP, str) || TextUtils.equals(r4p.VALUE_SIMILAR_SHOP_NEW, str) || TextUtils.equals("shop", map.get("tab"))) {
            return "mtop.taobao.wsearch.appsearch";
        } else {
            String str2 = map.get("tab");
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, "all")) {
                if ("dingyue".equals(map.get("mainChannel"))) {
                    map.put("appId", r4p.VALUE_TPP_SUBSCRIBE_SEARCH_APP_ID);
                } else if (TextUtils.isEmpty(str)) {
                    map.put("appId", r4p.VALUE_TPP_MAIN_SEARCH_APP_ID);
                } else {
                    map.put("appId", r4p.VALUE_TPP_ROUTER_APP_ID);
                }
                return WSEARCH_TPP_API_NAME_VALUE;
            }
            map.put("appId", r4p.VALUE_TPP_MAIN_SEARCH_APP_ID);
            return WSEARCH_TPP_API_NAME_VALUE;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90952ebe", new Object[0])).booleanValue();
        }
        b4p.a("SearchConfig", "auto play: " + b);
        return b;
    }

    public static boolean e(o02 o02Var) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8b3410e", new Object[]{o02Var})).booleanValue();
        }
        if ((!(o02Var instanceof CommonBaseDatasource) || (commonSearchResult = (CommonSearchResult) o02Var.getTotalSearchResult()) == null || !commonSearchResult.isServerAutoPlay) && !d()) {
            return false;
        }
        return true;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2f6a98", new Object[0]);
        } else if (o4p.k0()) {
            try {
                AliAdaptServiceManager.getInstance().findAliAdaptService(mvd.class, new a());
            } catch (Throwable unused) {
                b = n4p.d();
            }
        } else {
            b = n4p.d();
        }
    }
}
