package tb;

import android.content.Context;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.BroadcasterInfo;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gq2 implements nkb, f0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093096);
        t2o.a(779093117);
        t2o.a(806355974);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1279b4", new Object[]{this, context, str});
            return;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("id");
        new c3s(this).b("https://alive-interact.alicdn.com/livedetail/common/" + queryParameter);
    }

    @Override // tb.f0c
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        }
    }

    @Override // tb.f0c
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) fkx.f((String) obj, SimpleLiveInfo.class);
        if (simpleLiveInfo == null || simpleLiveInfo.liveUrlList == null) {
            TLog.loge("tblive", "CDNPreCreateImpl", "CDN video Info 为空");
        } else if (!"1".equalsIgnoreCase(String.valueOf(simpleLiveInfo.roomStatus))) {
            TLog.loge("tblive", "CDNPreCreateImpl", "直播间非直播中");
        } else {
            MediaData mediaData = new MediaData();
            int size = simpleLiveInfo.liveUrlList.size();
            mediaData.h265 = simpleLiveInfo.h265;
            mediaData.rateAdapte = simpleLiveInfo.rateAdapte;
            mediaData.edgePcdn = simpleLiveInfo.edgePcdn;
            mediaData.mediaConfig = simpleLiveInfo.mediaConfig;
            BroadcasterInfo broadcasterInfo = simpleLiveInfo.broadCaster;
            if (broadcasterInfo != null) {
                mediaData.anchorId = broadcasterInfo.accountId;
            }
            mediaData.liveId = simpleLiveInfo.liveId;
            mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
            mediaData.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
                qualityLiveItem.definition = qualitySelectItem.definition;
                qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
                qualityLiveItem.h265Url = qualitySelectItem.h265Url;
                qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
                qualityLiveItem.name = qualitySelectItem.name;
                qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
                qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
                qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
                qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
                qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
                qualityLiveItem.unit = qualitySelectItem.unit;
                qualityLiveItem.unitType = qualitySelectItem.unitType;
                qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
                qualityLiveItem.recomm = qualitySelectItem.recomm;
                qualityLiveItem.newName = qualitySelectItem.newName;
                qualityLiveItem.liveStreamStatsInfo = qualitySelectItem.liveStreamStatsInfo;
                mediaData.liveUrlList.add(qualityLiveItem);
                if (i == 0) {
                    mediaData.dataTracks = qualitySelectItem.dataTracks;
                }
            }
            lgi lgiVar = new lgi();
            lgiVar.f23322a = mediaData;
            gsm.a().e(simpleLiveInfo.liveId, lgiVar);
        }
    }
}
