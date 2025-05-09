package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class dz7 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552829);
        }

        public a() {
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dac85738", new Object[]{this})).booleanValue();
            }
            if (kz7.a()) {
                if (ud0.Companion.b().a("dress_support_refresh_banner")) {
                    tpu.a.b(tpu.Companion, "DressRefreshBanner", "debugAppCheckRefreshBanner:dressUp Support RefreshBanner", null, 4, null);
                    return true;
                }
                tpu.a.b(tpu.Companion, "DressRefreshBanner", "debugAppCheckRefreshBanner:dressUp NotSupport RefreshBanner", null, 4, null);
            }
            return false;
        }

        public final JSONObject b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("6051e85e", new Object[]{this});
            }
            JSONObject jSONObject = null;
            if (!kz7.a()) {
                return null;
            }
            if (ud0.Companion.b().a("dress_template_use_code_mock")) {
                JSONObject parseObject = JSON.parseObject("\n{\n\t\"data\": {\n\t\t\"dressingPage_1\": {\n\t\t\t\"type\": \"dressingPage\",\n\t\t\t\"data\": {\n\t\t\t\t\"showPullToRefresh\": \"true\",\n\t\t\t\t\"ceilingImageUrl\": \"https://gw.alicdn.com/imgextra/i2/O1CN016cgWLb1buVAc6grdZ_!!6000000003525-2-tps-1500-2452.png\",\n\t\t\t\t\"forbidRefreshContainers\": [\"topBar\"],\n\t\t\t\t\"skeletonImageUrl\": \"https://gw.alicdn.com/imgextra/i1/O1CN01KMqx4G1JzOK06ACSG_!!6000000001099-2-tps-1500-4170.png\"\n\t\t\t}\n\t\t},\n\t\t\"topBarComponent_1\": {\n\t\t\t\"type\": \"topBarComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_home_navbar\",\n\t\t\t\t\"version\": \"12\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_home_navbar/1744281622272/dress_home_navbar.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingBannerComponent_1\": {\n\t\t\t\"type\": \"dressingBannerComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_home_banner\",\n\t\t\t\t\"version\": \"38\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_home_banner/1744897443233/dress_home_banner.zip\"\n\t\t\t}\n\t\t}\n\t},\n\t\"layout\": {\n\t\t\"root\": \"dressingPage_1\",\n\t\t\"structure\": {\n\t\t\t\"topBar\": [\"topBarComponent_1\"],\n\t\t\t\"list\": [\"dressingBannerComponent_1\"],\n\t\t\t\"bottomBar\": []\n\t\t}\n\t},\n\t\"businessId\": \"dressUpFeed\"\n}\n    \n");
                tpu.a.b(tpu.Companion, "DressMockTemplate", "loadDebugConfigJsonSuccess:dress_template_use_code_mock", null, 4, null);
                return parseObject;
            }
            File file = new File("/data/local/tmp/dress_template_mock_2025.json");
            if (!file.exists()) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        fileInputStream.close();
                        bufferedReader.close();
                        String sb2 = sb.toString();
                        ckf.f(sb2, "stringBuilder.toString()");
                        jSONObject = JSON.parseObject(sb2);
                        tpu.a.b(tpu.Companion, "DressMockTemplate", "loadDebugConfigJsonSuccess:成功读取并解析 mock JSON 文件", null, 4, null);
                        return jSONObject;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "DressMockTemplate", "loadDebugConfigJsonFail:读取或解析 mock JSON 文件时出错: " + e.getMessage(), null, 4, null);
                return jSONObject;
            }
        }

        public final JSONObject c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("8103813e", new Object[]{this});
            }
            JSONObject jSONObject = null;
            if (!kz7.a()) {
                return null;
            }
            if (ud0.Companion.b().a("dress_detail_template_use_code_mock")) {
                JSONObject parseObject = JSON.parseObject("\n{\n\t\"data\": {\n\t\t\"dressingPage_1\": {\n\t\t\t\"type\": \"dressingPage\",\n\t\t\t\"data\": {\n\t\t\t\t\"bottomContainerLinkable\": \"true\"\n\t\t\t}\n\t\t},\n\t\t\"dressContentNavbarComponent_1\": {\n\t\t\t\"type\": \"dressContentNavbarComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_content_navbar\",\n\t\t\t\t\"version\": \"15\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_content_navbar/1744184009375/dress_content_navbar.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentBannerComponent_1\": {\n\t\t\t\"type\": \"dressingContentBannerComponent\",\n\t\t\t\"renderMode\": \"native\"\n\t\t},\n\t\t\"dressingContentTitleComponent_1\": {\n\t\t\t\"type\": \"dressingContentTitleComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"dress_content_title\",\n\t\t\t\t\"version\": \"31\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/dress_content_title/1744267661389/dress_content_title.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentCommentComponent_1\": {\n\t\t\t\"type\": \"dressingContentCommentComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"comment_scrolbar_card\",\n\t\t\t\t\"version\": \"31\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/comment_scrolbar_card/1744265263169/comment_scrolbar_card.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentProductMountCardComponent_1\": {\n\t\t\t\"type\": \"dressingContentProductMountCardComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"product_mount_card\",\n\t\t\t\t\"version\": \"25\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/product_mount_card/1744623648291/product_mount_card.zip\"\n\t\t\t}\n\t\t},\n\t\t\"dressingContentBottomCommentFrameComponent_1\": {\n\t\t\t\"type\": \"dressingContentBottomCommentFrameComponent\",\n\t\t\t\"renderMode\": \"dx\",\n\t\t\t\"dx\": {\n\t\t\t\t\"name\": \"bottom_comment_frame\",\n\t\t\t\t\"version\": \"12\",\n\t\t\t\t\"url\": \"https://dinamicx.alibabausercontent.com/pub/bottom_comment_frame/1744206657921/bottom_comment_frame.zip\"\n\t\t\t}\n\t\t}\n\t},\n\t\"layout\": {\n\t\t\"root\": \"dressingPage_1\",\n\t\t\"structure\": {\n\t\t\t\"topBar\": [\"dressContentNavbarComponent_1\"],\n\t\t\t\"list\": [\"dressingContentBannerComponent_1\", \"dressingContentTitleComponent_1\", \"dressingContentCommentComponent_1\", \"dressingContentProductMountCardComponent_1\"],\n\t\t\t\"bottomBar\": [\"dressingContentBottomCommentFrameComponent_1\"]\n\t\t}\n\t},\n\t\"businessId\": \"dressUpDetail\"\n}\n");
                tpu.a.b(tpu.Companion, "DressDetailMockTemplate", "loadDetailDebugConfigJsonSuccess:dress_detail_template_use_code_mock", null, 4, null);
                return parseObject;
            }
            File file = new File("/data/local/tmp/dress_detail_template_mock_2025.json");
            if (!file.exists()) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        fileInputStream.close();
                        bufferedReader.close();
                        String sb2 = sb.toString();
                        ckf.f(sb2, "stringBuilder.toString()");
                        jSONObject = JSON.parseObject(sb2);
                        tpu.a.b(tpu.Companion, "DressDetailMockTemplate", "loadDetailDebugConfigJsonSuccess:成功读取并解析 mock JSON 文件", null, 4, null);
                        return jSONObject;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, "DressDetailMockTemplate", "loadDetailDebugConfigJsonFail:读取或解析 mock JSON 文件时出错: " + e.getMessage(), null, 4, null);
                return jSONObject;
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552828);
    }
}
