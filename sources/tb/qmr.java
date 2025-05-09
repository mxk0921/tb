package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQueryRequest;
import com.taobao.taolive.room.afccoldlunch.simple.MtopTbliveRecommendVideoSimpleQuerySafeResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qmr extends n2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092790);
    }

    public qmr(wzc wzcVar) {
        super(wzcVar);
    }

    public static /* synthetic */ Object ipc$super(qmr qmrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/afccoldlunch/simple/TBLiveSimpleQueryBusiness");
    }

    public void o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce1b8d38", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        MtopTbliveRecommendVideoSimpleQueryRequest mtopTbliveRecommendVideoSimpleQueryRequest = new MtopTbliveRecommendVideoSimpleQueryRequest();
        mtopTbliveRecommendVideoSimpleQueryRequest.setAPI_NAME("mtop.tblive.recommend.video.simple.query.safe");
        mtopTbliveRecommendVideoSimpleQueryRequest.setNeedRecommend(yqq.h(str));
        mtopTbliveRecommendVideoSimpleQueryRequest.setLiveSource(str2);
        mtopTbliveRecommendVideoSimpleQueryRequest.setLiveId(str4);
        mtopTbliveRecommendVideoSimpleQueryRequest.setCreatorId(str5);
        mtopTbliveRecommendVideoSimpleQueryRequest.setEntryLiveSource(str3);
        mtopTbliveRecommendVideoSimpleQueryRequest.setHoldItemIds(str6);
        mtopTbliveRecommendVideoSimpleQueryRequest.setItemHoldType(str7);
        mtopTbliveRecommendVideoSimpleQueryRequest.setTransParams(str8);
        k(0, mtopTbliveRecommendVideoSimpleQueryRequest, MtopTbliveRecommendVideoSimpleQuerySafeResponse.class);
    }
}
