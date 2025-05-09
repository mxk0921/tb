package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopRoomstudioLiveDisplayDetailRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopRoomstudioLiveDisplayDetailResponse;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopRequest;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.MtopTbliveGrowthApiPopCheckPopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c6q extends n2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699725);
    }

    public c6q(wzc wzcVar) {
        super(wzcVar);
    }

    public static /* synthetic */ Object ipc$super(c6q c6qVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlanding/business/SmartLandingBusiness");
    }

    public void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, JSONObject jSONObject, String str10, JSONObject jSONObject2, String str11) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0feee8", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, new Boolean(z), str9, jSONObject, str10, jSONObject2, str11});
            return;
        }
        MtopRoomstudioLiveDisplayDetailRequest mtopRoomstudioLiveDisplayDetailRequest = new MtopRoomstudioLiveDisplayDetailRequest();
        mtopRoomstudioLiveDisplayDetailRequest.setBizCode(str);
        mtopRoomstudioLiveDisplayDetailRequest.setEntryLiveSource(str2);
        mtopRoomstudioLiveDisplayDetailRequest.setUrlParams(str3);
        mtopRoomstudioLiveDisplayDetailRequest.setLiveSource(str4);
        mtopRoomstudioLiveDisplayDetailRequest.setContentId(str5);
        mtopRoomstudioLiveDisplayDetailRequest.setAnchorId(str6);
        mtopRoomstudioLiveDisplayDetailRequest.setAppVersion(str7);
        mtopRoomstudioLiveDisplayDetailRequest.setSjsdParams(jSONObject.toJSONString());
        mtopRoomstudioLiveDisplayDetailRequest.setHasSjsdParams(!jSONObject.isEmpty());
        mtopRoomstudioLiveDisplayDetailRequest.setChannel(str8);
        mtopRoomstudioLiveDisplayDetailRequest.setTargetAliveId(str9);
        mtopRoomstudioLiveDisplayDetailRequest.setIsRecommendLive(z);
        mtopRoomstudioLiveDisplayDetailRequest.setQueryCheckPop(true);
        mtopRoomstudioLiveDisplayDetailRequest.setDisplayExtParams(str10);
        JSONObject jSONObject3 = jSONObject2 == null ? new JSONObject() : jSONObject2;
        jSONObject3.put("smartLandingToken", (Object) str11);
        mtopRoomstudioLiveDisplayDetailRequest.setFeatures(jSONObject3.toJSONString());
        m(0, mtopRoomstudioLiveDisplayDetailRequest, MtopRoomstudioLiveDisplayDetailResponse.class, false, true);
    }

    public void p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6327ca36", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        MtopTbliveGrowthApiPopCheckPopRequest mtopTbliveGrowthApiPopCheckPopRequest = new MtopTbliveGrowthApiPopCheckPopRequest();
        mtopTbliveGrowthApiPopCheckPopRequest.setBizCode(str);
        mtopTbliveGrowthApiPopCheckPopRequest.setEntryLiveSource(str2);
        mtopTbliveGrowthApiPopCheckPopRequest.setUrlParams(str3);
        mtopTbliveGrowthApiPopCheckPopRequest.setLiveSource(str4);
        mtopTbliveGrowthApiPopCheckPopRequest.setLiveId(str5);
        mtopTbliveGrowthApiPopCheckPopRequest.setAnchorId(str6);
        mtopTbliveGrowthApiPopCheckPopRequest.setAppVersion(str7);
        m(0, mtopTbliveGrowthApiPopCheckPopRequest, MtopTbliveGrowthApiPopCheckPopResponse.class, false, true);
    }
}
