package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.common.mtop.request.CainiaoLdDetailH5AuthGetRequest;
import com.taobao.taobao.scancode.common.mtop.request.PailitaoRecommendRequest;
import com.taobao.taobao.scancode.common.mtop.resp.CainiaoLdDetailH5AuthGetResp;
import com.taobao.taobao.scancode.common.mtop.resp.PailitaoRecommendResp;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceRequest;
import com.taobao.taobao.scancode.huoyan.object.MtopEtaoKakaMailtraceResponse;
import com.taobao.taobao.scancode.huoyan.util.KakaLibMTopParserHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mtopsdk.mtop.common.ApiID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o1g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String READ_WHITE_LIST_API = "http://www.etao.com/go/rgn/kaka/whitelist.php";

    static {
        t2o.a(760217769);
    }

    public static ApiID b(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, y7b<CainiaoLdDetailH5AuthGetResp> y7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("da19ddd0", new Object[]{context, str, str2, str3, str4, str5, str6, str7, str8, str9, y7bVar});
        }
        CainiaoLdDetailH5AuthGetRequest cainiaoLdDetailH5AuthGetRequest = new CainiaoLdDetailH5AuthGetRequest();
        cainiaoLdDetailH5AuthGetRequest.setMailNo(str);
        cainiaoLdDetailH5AuthGetRequest.setResCode(str2);
        cainiaoLdDetailH5AuthGetRequest.setReceiverMobile(str3);
        cainiaoLdDetailH5AuthGetRequest.setReceiverAddress(str4);
        cainiaoLdDetailH5AuthGetRequest.setSenderMobile(str5);
        cainiaoLdDetailH5AuthGetRequest.setSenderAddress(str6);
        cainiaoLdDetailH5AuthGetRequest.setAppKey(str7);
        cainiaoLdDetailH5AuthGetRequest.setTradeId(str8);
        cainiaoLdDetailH5AuthGetRequest.setExtParams(str9);
        return KakaLibMTopParserHelper.b(context, cainiaoLdDetailH5AuthGetRequest, CainiaoLdDetailH5AuthGetResp.class, y7bVar);
    }

    public static ApiID c(Context context, String str, y7b<MtopEtaoKakaMailtraceResponse> y7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("ec16e35a", new Object[]{context, str, y7bVar});
        }
        MtopEtaoKakaMailtraceRequest mtopEtaoKakaMailtraceRequest = new MtopEtaoKakaMailtraceRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mailNo", (Object) str);
        mtopEtaoKakaMailtraceRequest.bizParam = jSONObject.toString();
        mtopEtaoKakaMailtraceRequest.bizType = "kaka.mailtrace";
        ey3.g().h("huoyan_kaka_api_asyncSearchExpress");
        return KakaLibMTopParserHelper.b(context, mtopEtaoKakaMailtraceRequest, MtopEtaoKakaMailtraceResponse.class, y7bVar);
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b11cce17", new Object[0]);
        }
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).format(new Date());
    }

    public static ApiID a(Context context, long j, String str, y7b<PailitaoRecommendResp> y7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ApiID) ipChange.ipc$dispatch("90faebe1", new Object[]{context, new Long(j), str, y7bVar});
        }
        PailitaoRecommendRequest pailitaoRecommendRequest = new PailitaoRecommendRequest();
        pailitaoRecommendRequest.setAppId(j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("barCodeUrl", (Object) str);
        jSONObject.put("scanTime", (Object) d());
        HashMap hashMap = new HashMap(2);
        hashMap.put("contentJson", jSONObject.toJSONString());
        pailitaoRecommendRequest.setParams(JSON.toJSONString(hashMap));
        return KakaLibMTopParserHelper.b(context, pailitaoRecommendRequest, PailitaoRecommendResp.class, y7bVar);
    }
}
