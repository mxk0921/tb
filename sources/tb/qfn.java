package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.rank_module.MtopMediaplatformLivedetailEntryRequest;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.business.rank_module.MtopMediaplatformLivedetailEntryResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qfn extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699851);
    }

    public qfn(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(qfn qfnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/business/rank_module/RankModuleBusiness");
    }

    public void K(VideoInfo videoInfo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12e16e77", new Object[]{this, videoInfo, new Integer(i)});
        } else if (videoInfo != null && videoInfo.broadCaster != null) {
            MtopMediaplatformLivedetailEntryRequest mtopMediaplatformLivedetailEntryRequest = new MtopMediaplatformLivedetailEntryRequest();
            mtopMediaplatformLivedetailEntryRequest.setType(i);
            mtopMediaplatformLivedetailEntryRequest.setLiveId(videoInfo.liveId);
            mtopMediaplatformLivedetailEntryRequest.setAccountId(videoInfo.broadCaster.accountId);
            C(0, mtopMediaplatformLivedetailEntryRequest, MtopMediaplatformLivedetailEntryResponse.class);
        }
    }
}
