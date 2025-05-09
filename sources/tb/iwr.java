package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.adapter.ShareShortenAdapter;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iwr implements ShareShortenAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845835);
        t2o.a(662700054);
    }

    @Override // com.ut.share.adapter.ShareShortenAdapter
    public String shortenURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf7dde5", new Object[]{this, str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        TBShareContent e = bwr.h().e();
        if (e != null) {
            str2 = e.businessId;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "tbshare";
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharepassword.generateShortUrlNew");
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedEcode(true);
        JSONObject parseObject = JSON.parseObject(mtopRequest.getData());
        parseObject.put("targetUrl", (Object) str);
        parseObject.put("bizCode", (Object) str2);
        Map<String, String> map = e.extraParams;
        if (map != null && map.size() > 0) {
            parseObject.put(MspGlobalDefine.EXTENDINFO, (Object) JSON.toJSONString(e.extraParams));
        }
        if (e.disableBackToClient) {
            parseObject.put("isCallClient", (Object) 0);
        }
        mtopRequest.setData(parseObject.toString());
        MtopBuilder build = Mtop.instance(ShareBizAdapter.getInstance().getAppEnv().getApplication()).build(mtopRequest, ShareBizAdapter.getInstance().getAppEnv().getTTID());
        build.setBizId(67);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest.getDataJsonObject() != null) {
            String str3 = str + "," + e.businessId;
            try {
                String string = syncRequest.getDataJsonObject().getString("shortUrl");
                if (!TextUtils.isEmpty(string)) {
                    str = string;
                }
                AppMonitor.Alarm.commitSuccess("share", "generateShortUrl", str3);
            } catch (Throwable unused) {
                AppMonitor.Alarm.commitFail("share", "generateShortUrl", "SHARE_GENERATESHORTURL_FAILED", Localization.q(R.string.taobao_app_1010_1_18118), str3);
            }
        }
        TLog.logd("TBShareShortenURLService", "shortenURL : " + str);
        return str;
    }
}
