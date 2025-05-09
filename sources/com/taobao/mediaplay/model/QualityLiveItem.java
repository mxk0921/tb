package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class QualityLiveItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_BITRATE = 838860800;
    public String additionUrlMap;
    public String artpUrl;
    public String bfrtcUrl;
    public String definition;
    public String extInfo;
    public String flvUrl;
    public String h265Url;
    public String hlsUrl;
    public LiveStreamStatsInfo liveStreamStatsInfo;
    public String liveUrlMiniBfrtc;
    public String name;
    public String newDefinition;
    public String newName;
    public String recomm;
    public String replayUrl;
    public String rtcLiveUrl;
    public String selectedProtocol;
    public String unit;
    public String unitType;
    public String videoUrl;
    public String wholeH265ArtpUrl;
    public String wholeH265FlvUrl;

    static {
        t2o.a(774897780);
    }

    public void copy(QualityLiveItem qualityLiveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950991fd", new Object[]{this, qualityLiveItem});
            return;
        }
        this.hlsUrl = qualityLiveItem.hlsUrl;
        this.h265Url = qualityLiveItem.h265Url;
        this.flvUrl = qualityLiveItem.flvUrl;
        this.name = qualityLiveItem.name;
        this.artpUrl = qualityLiveItem.artpUrl;
        this.bfrtcUrl = qualityLiveItem.bfrtcUrl;
        this.liveUrlMiniBfrtc = qualityLiveItem.liveUrlMiniBfrtc;
        this.rtcLiveUrl = qualityLiveItem.rtcLiveUrl;
        this.wholeH265FlvUrl = qualityLiveItem.wholeH265FlvUrl;
        this.wholeH265ArtpUrl = qualityLiveItem.wholeH265ArtpUrl;
        this.definition = qualityLiveItem.definition;
        this.replayUrl = qualityLiveItem.replayUrl;
        this.videoUrl = qualityLiveItem.videoUrl;
        this.unit = qualityLiveItem.unit;
        this.unitType = qualityLiveItem.unitType;
        this.newDefinition = qualityLiveItem.newDefinition;
        this.newName = qualityLiveItem.newName;
        this.recomm = qualityLiveItem.recomm;
        this.selectedProtocol = qualityLiveItem.selectedProtocol;
        this.liveStreamStatsInfo = qualityLiveItem.liveStreamStatsInfo;
        this.additionUrlMap = qualityLiveItem.additionUrlMap;
        this.extInfo = qualityLiveItem.extInfo;
    }

    public long getStreamAvgBitrate() {
        LiveStreamStatsNetwork liveStreamStatsNetwork;
        LiveStreamStatsNetworkVatsb liveStreamStatsNetworkVatsb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42bfcf4c", new Object[]{this})).longValue();
        }
        LiveStreamStatsInfo liveStreamStatsInfo = this.liveStreamStatsInfo;
        if (liveStreamStatsInfo == null || (liveStreamStatsNetwork = liveStreamStatsInfo.network) == null || (liveStreamStatsNetworkVatsb = liveStreamStatsNetwork.vatsb) == null) {
            return 0L;
        }
        return Math.min(Math.max(liveStreamStatsNetworkVatsb.avg, 0L), 838860800L);
    }

    public long getStreamMaxBitrate() {
        LiveStreamStatsNetwork liveStreamStatsNetwork;
        LiveStreamStatsNetworkVatsb liveStreamStatsNetworkVatsb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb31b57a", new Object[]{this})).longValue();
        }
        LiveStreamStatsInfo liveStreamStatsInfo = this.liveStreamStatsInfo;
        if (liveStreamStatsInfo == null || (liveStreamStatsNetwork = liveStreamStatsInfo.network) == null || (liveStreamStatsNetworkVatsb = liveStreamStatsNetwork.vatsb) == null) {
            return 0L;
        }
        return Math.min(Math.max(liveStreamStatsNetworkVatsb.max, 0L), 838860800L);
    }

    public long getStreamMinBitrate() {
        LiveStreamStatsNetwork liveStreamStatsNetwork;
        LiveStreamStatsNetworkVatsb liveStreamStatsNetworkVatsb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f25973cc", new Object[]{this})).longValue();
        }
        LiveStreamStatsInfo liveStreamStatsInfo = this.liveStreamStatsInfo;
        if (liveStreamStatsInfo == null || (liveStreamStatsNetwork = liveStreamStatsInfo.network) == null || (liveStreamStatsNetworkVatsb = liveStreamStatsNetwork.vatsb) == null) {
            return 0L;
        }
        return Math.min(Math.max(liveStreamStatsNetworkVatsb.min, 0L), 838860800L);
    }
}
