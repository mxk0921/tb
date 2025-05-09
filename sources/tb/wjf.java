package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.intimacy.MtopTaobaoGiuliaIntimacyQueryLiveRequest;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.intimacy.MtopTaobaoGiuliaIntimacyQueryLiveResponse;
import com.taobao.tbliveinteractive.view.systemcomponent.IntimacyParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wjf extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699840);
    }

    public wjf(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(wjf wjfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/intimacy/IntimacyBusiness");
    }

    public void K(IntimacyParams intimacyParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13c263f", new Object[]{this, intimacyParams, str});
            return;
        }
        int i = intimacyParams.roomType;
        String str2 = intimacyParams.accountId;
        String str3 = intimacyParams.liveId;
        boolean z = intimacyParams.follow;
        boolean z2 = intimacyParams.shopVip;
        boolean z3 = intimacyParams.shopHasVip;
        MtopTaobaoGiuliaIntimacyQueryLiveRequest mtopTaobaoGiuliaIntimacyQueryLiveRequest = new MtopTaobaoGiuliaIntimacyQueryLiveRequest();
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setAPI_NAME("mtop.taobao.giulia.intimacy.query.live");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setBizCode("live");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setInvokeType("native");
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setRoomType(i);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setSource(intimacyParams.liveSource);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setTargetUid(str2);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setShowCodes(str);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setLiveId(str3);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setFollow(z);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.setSpm(intimacyParams.spm);
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.member = z2;
        mtopTaobaoGiuliaIntimacyQueryLiveRequest.hasMember = z3;
        C(0, mtopTaobaoGiuliaIntimacyQueryLiveRequest, MtopTaobaoGiuliaIntimacyQueryLiveResponse.class);
    }
}
