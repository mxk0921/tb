package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.business.data.FestivalInfoData;
import com.taobao.android.festival.business.data.FestivalInfoResponse;
import com.taobao.android.festival.business.data.FestivalRequest;
import com.taobao.android.festival.business.data.FestivalResponse;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.SDKConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p69 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519185);
    }

    public static FestivalInfoData a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalInfoData) ipChange.ipc$dispatch("63367704", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.wireless.skin.atmosphere.info");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject.toJSONString());
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, SDKConfig.getInstance().getGlobalTtid());
        build.showLoginUI(false);
        build.setJsonType(JsonTypeEnum.ORIGINALJSON);
        MtopResponse syncRequest = build.syncRequest();
        if (!syncRequest.isApiSuccess() || syncRequest.getBytedata() == null) {
            return null;
        }
        return ((FestivalInfoResponse) JSON.parseObject(syncRequest.getBytedata(), FestivalInfoResponse.class, new Feature[0])).getData();
    }

    public static FestivalResponse b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalResponse) ipChange.ipc$dispatch("947196f4", new Object[]{context, str});
        }
        FestivalRequest festivalRequest = new FestivalRequest();
        festivalRequest.version = str;
        RemoteBusiness build = RemoteBusiness.build((IMTOPDataObject) festivalRequest);
        build.setBizId(51);
        build.showLoginUI(false);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest == null || !syncRequest.isApiSuccess()) {
            return null;
        }
        return (FestivalResponse) JSON.parseObject(syncRequest.getBytedata(), FestivalResponse.class, new Feature[0]);
    }
}
