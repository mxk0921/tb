package tb;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.BroadcasterInfo;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hq2 extends mei implements f0c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093126);
        t2o.a(806355974);
    }

    public hq2(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(hq2 hq2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/prerequest/CDNPreRequest");
    }

    @Override // tb.mei
    public void a(Intent intent, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4442697f", new Object[]{this, intent, uri});
            return;
        }
        String queryParameter = uri.getQueryParameter("id");
        new c3s(this).b("https://alive-interact.alicdn.com/livedetail/common/" + queryParameter);
    }

    @Override // tb.f0c
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
        } else {
            wnm.b().d(this.f23990a, nei.a());
        }
    }

    @Override // tb.f0c
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        wnm b = wnm.b();
        String str = this.f23990a;
        SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) fkx.f((String) obj, SimpleLiveInfo.class);
        if (simpleLiveInfo == null) {
            TLog.loge("tblive", "CDNPreRequest", "CDN预请求video Info为空");
            b.d(str, nei.a());
            return;
        }
        if ("2".equalsIgnoreCase(String.valueOf(simpleLiveInfo.roomStatus))) {
            String str2 = simpleLiveInfo.replayUrl;
            if (!yqq.e(str2)) {
                TLog.loge("tblive", "CDNPreRequest", "CDN 请求 返回回放");
                b.d(str, nei.c(str2));
                return;
            }
        }
        ArrayList<QualitySelectItem> arrayList = simpleLiveInfo.liveUrlList;
        if (arrayList == null || arrayList.isEmpty()) {
            TLog.loge("tblive", "CDNPreRequest", "CDN 预请求， liveUrlList 为空");
            b.d(str, nei.a());
            return;
        }
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
        b.d(str, nei.b(mediaData));
    }
}
