package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickRequest;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewClickResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryRequest;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewStatusRequest;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business.MtopTbliveRecommendPopviewStatusResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eon extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699695);
    }

    public eon(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(eon eonVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/business/RecommendPopviewBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cb3a9dd", new Object[]{this, str, str2});
            return;
        }
        MtopTbliveRecommendPopviewClickRequest mtopTbliveRecommendPopviewClickRequest = new MtopTbliveRecommendPopviewClickRequest();
        mtopTbliveRecommendPopviewClickRequest.setType(str);
        mtopTbliveRecommendPopviewClickRequest.setBackParams(str2);
        JSONObject d = fkx.d(str2);
        if (d != null) {
            String string = d.getString("asac");
            mtopTbliveRecommendPopviewClickRequest.setAsac(string);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", string);
            A(hashMap);
        }
        D(0, mtopTbliveRecommendPopviewClickRequest, MtopTbliveRecommendPopviewClickResponse.class, true);
    }

    public void L(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14443389", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, new Boolean(z)});
            return;
        }
        MtopTbliveRecommendPopviewQueryRequest mtopTbliveRecommendPopviewQueryRequest = new MtopTbliveRecommendPopviewQueryRequest();
        mtopTbliveRecommendPopviewQueryRequest.setLiveId(str);
        mtopTbliveRecommendPopviewQueryRequest.setAccountId(str2);
        mtopTbliveRecommendPopviewQueryRequest.setItemIds(str7);
        mtopTbliveRecommendPopviewQueryRequest.setEntrySpm(str4);
        mtopTbliveRecommendPopviewQueryRequest.setLiveSource(str5);
        mtopTbliveRecommendPopviewQueryRequest.setEntryLiveSource(str6);
        mtopTbliveRecommendPopviewQueryRequest.setShareType(str8);
        mtopTbliveRecommendPopviewQueryRequest.setSpm(str3);
        mtopTbliveRecommendPopviewQueryRequest.setQuery(str9);
        mtopTbliveRecommendPopviewQueryRequest.setSwitchIndex(str10);
        mtopTbliveRecommendPopviewQueryRequest.setRecExtParams(str11);
        mtopTbliveRecommendPopviewQueryRequest.setS(str12);
        mtopTbliveRecommendPopviewQueryRequest.setN(str13);
        mtopTbliveRecommendPopviewQueryRequest.setExpInfoList(str14);
        mtopTbliveRecommendPopviewQueryRequest.setSmartDx(String.valueOf(z));
        A(null);
        E(0, mtopTbliveRecommendPopviewQueryRequest, MtopTbliveRecommendPopviewQueryResponse.class, false, true);
    }

    public void M(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f5e2e6", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        MtopTbliveRecommendPopviewStatusRequest mtopTbliveRecommendPopviewStatusRequest = new MtopTbliveRecommendPopviewStatusRequest();
        mtopTbliveRecommendPopviewStatusRequest.setType(str);
        mtopTbliveRecommendPopviewStatusRequest.setBackParams(str2);
        mtopTbliveRecommendPopviewStatusRequest.setIndex(i);
        A(null);
        C(0, mtopTbliveRecommendPopviewStatusRequest, MtopTbliveRecommendPopviewStatusResponse.class);
    }
}
