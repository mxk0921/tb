package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.service.data.CommonDataService;
import com.taobao.android.turbo.adapter.RequestType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class j59 extends CommonDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String LAYOUT_DSL_ORANGE_KEY = "weitao_switch.dressup_feed_layout";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552832);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552831);
    }

    public static /* synthetic */ Object ipc$super(j59 j59Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/feeds/service/data/FeedDataService");
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public String L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa55b3bf", new Object[]{this});
        }
        return "originaljson";
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return "mtop.relationrecommend.wirelessrecommend.recommend";
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public String P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e285e97", new Object[]{this});
        }
        return "dressup_feed_cache";
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public RequestType R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("f7ff2806", new Object[]{this});
        }
        return RequestType.POST;
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public boolean c2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e1c3a29", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public Map<String, String> e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d2e6b5a", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", "47648");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) "daily_outfit");
        xhv xhvVar = xhv.INSTANCE;
        hashMap.put("params", jSONObject.toJSONString());
        return hashMap;
    }

    /* renamed from: d2 */
    public PageModel s() {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("9ee35527", new Object[]{this});
        }
        if (Q1() == null) {
            JSONObject parseObject = JSON.parseObject((String) ud0.Companion.b().a(LAYOUT_DSL_ORANGE_KEY, "\n{\n\t\"data\": {\n\t\t\"dressingPage_1\": {\n\t\t\t\"type\": \"dressingPage\",\n\t\t\t\"data\": {\n\t\t\t\t\"showPullToRefresh\": \"true\",\n\t\t\t\t\"ceilingImageUrl\": \"https://gw.alicdn.com/imgextra/i2/O1CN016cgWLb1buVAc6grdZ_!!6000000003525-2-tps-1500-2452.png\",\n\t\t\t\t\"forbidRefreshContainers\": [\"topBar\"],\n\t\t\t\t\"skeletonImageUrl\": \"https://gw.alicdn.com/imgextra/i1/O1CN01KMqx4G1JzOK06ACSG_!!6000000001099-2-tps-1500-4170.png\"\n\t\t\t}\n\t\t},\n\t\t\"topBarComponent_1\": {\n\t\t\t\"type\": \"topBarComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_home_navbar\",\n\t\t\t\t\"version\": \"12\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_home_navbar/1744281622272/dress_home_navbar.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingBannerComponent_1\": {\n\t\t\t\"type\": \"dressingBannerComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_home_banner\",\n\t\t\t\t\"version\": \"38\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_home_banner/1744897443233/dress_home_banner.zip\"\n\t\t\t}\n\t\t}\n\t},\n\t\"layout\": {\n\t\t\"root\": \"dressingPage_1\",\n\t\t\"structure\": {\n\t\t\t\"topBar\": [\"topBarComponent_1\"],\n\t\t\t\"list\": [\"dressingBannerComponent_1\"],\n\t\t\t\"bottomBar\": []\n\t\t}\n\t},\n\t\"businessId\": \"dressUpFeed\"\n}\n    \n", false));
            if (kz7.a() && (b = dz7.Companion.b()) != null) {
                parseObject = b;
            }
            PageModel.a aVar = PageModel.Companion;
            qpu K1 = K1();
            ckf.f(parseObject, "template");
            Z1(aVar.a(K1, parseObject));
            JSONObject O1 = O1();
            if (O1 != null) {
                O1.put((JSONObject) "cache", (String) Boolean.TRUE);
                PageModel Q1 = Q1();
                if (Q1 != null) {
                    Q1.updateData(K1(), O1);
                }
            }
        }
        PageModel Q12 = Q1();
        ckf.d(Q12);
        return Q12;
    }
}
