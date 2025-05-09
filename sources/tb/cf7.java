package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.prefetch.DressUpMtopRequest;
import com.taobao.android.dressup.common.service.data.CommonDataService;
import com.taobao.android.turbo.adapter.RequestType;
import java.util.List;
import java.util.Map;
import tb.mqu;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cf7 extends CommonDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DETAIL_CACHE_KEY = "dress_detail_cache_data";
    public static final String LAYOUT_DSL_ORANGE_KEY = "weitao_switch.dressup_detail_layout";
    public static final String TAG = "DetailDataService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552822);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552821);
    }

    public static /* synthetic */ Object ipc$super(cf7 cf7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/detail/service/data/DetailDataService");
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return DressUpMtopRequest.Companion.b();
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public RequestType R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestType) ipChange.ipc$dispatch("f7ff2806", new Object[]{this});
        }
        return DressUpMtopRequest.Companion.c();
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public Map<String, String> e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d2e6b5a", new Object[]{this});
        }
        return DressUpMtopRequest.Companion.a(K1().a().h());
    }

    @Override // com.taobao.android.dressup.common.service.data.CommonDataService
    public JSONObject V1(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9a4b6aaa", new Object[]{this, map});
        }
        ckf.g(map, Constants.SEND_TYPE_RES);
        mqu.a aVar = mqu.Companion;
        List<?> f = aVar.f(map.get("module"), null);
        Object obj = f != null ? f.get(0) : null;
        if (!(obj instanceof Map)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject(aVar.h(obj, null));
    }

    /* renamed from: d2 */
    public PageModel s() {
        PageModel Q1;
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageModel) ipChange.ipc$dispatch("9ee35527", new Object[]{this});
        }
        if (Q1() == null) {
            try {
                ud0.a aVar = ud0.Companion;
                JSONObject parseObject = JSON.parseObject((String) aVar.b().a(LAYOUT_DSL_ORANGE_KEY, "\n{\n\t\"data\": {\n\t\t\"dressingPage_1\": {\n\t\t\t\"type\": \"dressingPage\",\n\t\t\t\"data\": {\n\t\t\t\t\"bottomContainerLinkable\": \"true\"\n\t\t\t}\n\t\t},\n\t\t\"dressContentNavbarComponent_1\": {\n\t\t\t\"type\": \"dressContentNavbarComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_content_navbar\",\n\t\t\t\t\"version\": \"15\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_content_navbar/1744184009375/dress_content_navbar.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentBannerComponent_1\": {\n\t\t\t\"type\": \"dressingContentBannerComponent\",\n\t\t\t\"renderMode\": \"native\"\n\t\t},\n\t\t\"dressingContentTitleComponent_1\": {\n\t\t\t\"type\": \"dressingContentTitleComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_content_title\",\n\t\t\t\t\"version\": \"31\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_content_title/1744267661389/dress_content_title.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentCommentComponent_1\": {\n\t\t\t\"type\": \"dressingContentCommentComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"comment_scrolbar_card\",\n\t\t\t\t\"version\": \"31\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/comment_scrolbar_card/1744265263169/comment_scrolbar_card.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentProductMountCardComponent_1\": {\n\t\t\t\"type\": \"dressingContentProductMountCardComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"product_mount_card\",\n\t\t\t\t\"version\": \"25\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/product_mount_card/1744623648291/product_mount_card.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentBottomCommentFrameComponent_1\": {\n\t\t\t\"type\": \"dressingContentBottomCommentFrameComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"bottom_comment_frame\",\n\t\t\t\t\"version\": \"12\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/bottom_comment_frame/1744206657921/bottom_comment_frame.zip\"\n\t\t\t}\n\t\t}\n\t},\n\t\"layout\": {\n\t\t\"root\": \"dressingPage_1\",\n\t\t\"structure\": {\n\t\t\t\"topBar\": [\"dressContentNavbarComponent_1\"],\n\t\t\t\"list\": [\"dressingContentBannerComponent_1\", \"dressingContentTitleComponent_1\", \"dressingContentCommentComponent_1\", \"dressingContentProductMountCardComponent_1\"],\n\t\t\t\"bottomBar\": [\"dressingContentBottomCommentFrameComponent_1\"]\n\t\t}\n\t},\n\t\"businessId\": \"dressUpDetail\"\n}\n", false));
                if (kz7.a() && (c = dz7.Companion.c()) != null) {
                    parseObject = c;
                }
                PageModel.a aVar2 = PageModel.Companion;
                qpu K1 = K1();
                ckf.f(parseObject, "template");
                Z1(aVar2.a(K1, parseObject));
                Object e = aVar.f().e("mem", DETAIL_CACHE_KEY);
                if (!(e == null || (Q1 = Q1()) == null)) {
                    Q1.updateData(K1(), (JSONObject) e);
                }
                aVar.f().d("mem", DETAIL_CACHE_KEY, null);
            } catch (Throwable th) {
                tpu.Companion.a(TAG, "getPageData error", th);
            }
        }
        return Q1();
    }
}
