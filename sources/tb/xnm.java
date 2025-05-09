package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.taolive.room.afccoldlunch.PreSimpleRequestParams;
import com.taobao.taolive.room.pre.LiveDetailPreRequestParams;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xnm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093358);
    }

    public static LiveDetailPreRequestParams a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailPreRequestParams) ipChange.ipc$dispatch("a6a43b66", new Object[]{intent});
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        return b(intent.getData());
    }

    public static LiveDetailPreRequestParams b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailPreRequestParams) ipChange.ipc$dispatch("2f03ae8a", new Object[]{uri});
        }
        return c(new LiveDetailPreRequestParams(), uri);
    }

    public static LiveDetailPreRequestParams c(LiveDetailPreRequestParams liveDetailPreRequestParams, Uri uri) {
        String str;
        String str2;
        String str3;
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailPreRequestParams) ipChange.ipc$dispatch("97a3071e", new Object[]{liveDetailPreRequestParams, uri});
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (liveDetailPreRequestParams.extJson == null) {
            liveDetailPreRequestParams.extJson = new JSONObject();
        }
        JSONObject jSONObject = liveDetailPreRequestParams.extJson;
        if (TextUtils.isEmpty(liveDetailPreRequestParams.adImpId)) {
            str = "false";
        } else {
            str = "true";
        }
        jSONObject.put("adLive", (Object) str);
        if ("/app/mtb/content/pages/live".equals(uri.getPath())) {
            str2 = uri.getQueryParameter("bizFrom");
        } else {
            str2 = uri.getQueryParameter("livesource");
        }
        liveDetailPreRequestParams.extJson.put("entryLiveSource", (Object) str2);
        if (queryParameterNames.contains("id")) {
            liveDetailPreRequestParams.feedId = uri.getQueryParameter("id");
        }
        if (queryParameterNames.contains("userId")) {
            liveDetailPreRequestParams.userId = uri.getQueryParameter("userId");
        }
        if (queryParameterNames.contains("itemid")) {
            liveDetailPreRequestParams.itemid = uri.getQueryParameter("itemid");
        }
        if (queryParameterNames.contains(yj4.PARAM_TIMEMOVING_ITEM_ID)) {
            liveDetailPreRequestParams.timeMovingItemId = uri.getQueryParameter(yj4.PARAM_TIMEMOVING_ITEM_ID);
        }
        if (queryParameterNames.contains(yj4.PARAM_SJSD_ITEM_ID)) {
            liveDetailPreRequestParams.sjsdItemId = uri.getQueryParameter(yj4.PARAM_SJSD_ITEM_ID);
        }
        if (queryParameterNames.contains("keyPointId")) {
            liveDetailPreRequestParams.keyPointId = uri.getQueryParameter("keyPointId");
        }
        liveDetailPreRequestParams.liveSource = str2;
        if (queryParameterNames.contains(yj4.PARAM_RCMD)) {
            liveDetailPreRequestParams.rcmd = uri.getQueryParameter(yj4.PARAM_RCMD);
        }
        if (queryParameterNames.contains(yj4.PARAM_ITEM_IDS)) {
            liveDetailPreRequestParams.itemIds = uri.getQueryParameter(yj4.PARAM_ITEM_IDS);
        }
        if (queryParameterNames.contains(yj4.PARAM_ITEM_HOLD_TYPE)) {
            liveDetailPreRequestParams.holdType = uri.getQueryParameter(yj4.PARAM_ITEM_HOLD_TYPE);
        }
        if (queryParameterNames.contains(yj4.PARAM_TCP_OUTER_PARAM)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(yj4.PARAM_TCP_OUTER_PARAM, (Object) uri.getQueryParameter(yj4.PARAM_TCP_OUTER_PARAM));
            liveDetailPreRequestParams.tcpParams = jSONObject2;
        }
        String str4 = "";
        String queryParameter = queryParameterNames.contains(yj4.PARAM_SHARER_ID) ? uri.getQueryParameter(yj4.PARAM_SHARER_ID) : str4;
        JSONObject e = e(uri);
        if (e != null && !TextUtils.isEmpty(queryParameter)) {
            e.put(yj4.PARAM_SHARER_ID, (Object) queryParameter);
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!TextUtils.isEmpty(liveDetailPreRequestParams.itemId)) {
            jSONObject3.put("itemid", (Object) liveDetailPreRequestParams.itemId);
        }
        jSONObject3.put("version", (Object) "202003");
        if (e != null) {
            jSONObject3.putAll(e);
        }
        JSONObject jSONObject4 = liveDetailPreRequestParams.extJson;
        if (jSONObject4 != null) {
            jSONObject4.putAll(jSONObject3);
        } else {
            liveDetailPreRequestParams.extJson = jSONObject3;
        }
        if (uri.getQueryParameterNames().contains(yj4.PARAM_PRODUCT_TYPE)) {
            str4 = uri.getQueryParameter(yj4.PARAM_PRODUCT_TYPE);
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "live";
        }
        liveDetailPreRequestParams.productType = str4;
        if (queryParameterNames.contains(yj4.PARAM_NEED_RECOMMEND)) {
            liveDetailPreRequestParams.needRecommend = uri.getQueryParameter(yj4.PARAM_NEED_RECOMMEND);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("entryLiveSource", str2);
        liveDetailPreRequestParams.transMap = hashMap;
        liveDetailPreRequestParams.useLiveFandom = "true";
        JSONObject d2 = fkx.d(rnv.f(uri));
        if (d2 == null) {
            d2 = new JSONObject();
        }
        LiveItem.SpfPlayVideo spfPlayVideo = (LiveItem.SpfPlayVideo) fkx.f(uri.getQueryParameter("timeMovingSpfPlayVideo"), LiveItem.SpfPlayVideo.class);
        if (!(spfPlayVideo == null || (str3 = spfPlayVideo.timeMovingUtParams) == null || (d = fkx.d(str3)) == null)) {
            d2.put("pcmId", d.get("pcmId"));
        }
        String queryParameter2 = uri.getQueryParameter(yj4.CHANNEL_EXP_INFO);
        if (!yqq.e(queryParameter2)) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(yj4.CHANNEL_EXP_INFO, (Object) fkx.b(queryParameter2));
            d2.put("tppParam", (Object) jSONObject5);
        }
        liveDetailPreRequestParams.transParams = rnv.d(d2.toJSONString(), uri.toString());
        if (queryParameterNames.contains(yj4.PARAM_OUTER_PARAM)) {
            liveDetailPreRequestParams.outerParam = uri.getQueryParameter(yj4.PARAM_OUTER_PARAM);
        }
        if (queryParameterNames.contains(yj4.PARAM_FORCE_FANDOM)) {
            liveDetailPreRequestParams.forceFandom = uri.getQueryParameter(yj4.PARAM_FORCE_FANDOM);
        } else {
            liveDetailPreRequestParams.forceFandom = null;
        }
        return liveDetailPreRequestParams;
    }

    public static PreSimpleRequestParams d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreSimpleRequestParams) ipChange.ipc$dispatch("3ca1473c", new Object[]{uri});
        }
        PreSimpleRequestParams preSimpleRequestParams = new PreSimpleRequestParams();
        c(preSimpleRequestParams, uri);
        preSimpleRequestParams.entryLiveSource = uri.getQueryParameter("livesource");
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(preSimpleRequestParams.transParams)) {
            jSONObject = fkx.d(preSimpleRequestParams.transParams);
        }
        for (String str : uri.getQueryParameterNames()) {
            jSONObject.put(str, (Object) uri.getQueryParameter(str));
        }
        preSimpleRequestParams.transParams = jSONObject.toJSONString();
        return preSimpleRequestParams;
    }

    public static JSONObject e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afc500", new Object[]{uri});
        }
        String queryParameter = uri.getQueryParameter("anchorGuard");
        String queryParameter2 = uri.getQueryParameter("timestamp");
        String queryParameter3 = uri.getQueryParameter(SimpleProfile.KEY_SIGNATURE);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(queryParameter)) {
            jSONObject.put("anchorGuard", (Object) queryParameter);
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            jSONObject.put("timestamp", (Object) queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) queryParameter3);
        }
        return jSONObject;
    }
}
