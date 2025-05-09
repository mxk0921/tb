package com.taobao.taolive.sdk.ui.media;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MediaData implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public AtmosphereInfo atmosphereInfo;
    public String dataTracks;
    public boolean edgePcdn;
    public boolean h265;
    public String liveId;
    public ArrayList<QualityLiveItem> liveUrlList;
    public String mediaConfig;
    public String mediaSourceType;
    public boolean rateAdapte;
    public int status;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AtmosphereInfo implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String resUrl;
        public String title;

        static {
            t2o.a(806356453);
            t2o.a(806355930);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AtmosphereInfo{resUrl='" + this.resUrl + ", title='" + this.title + '}';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class QualityLiveItem implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String additionUrlMap;
        public String artpUrl;
        public String bfrtcUrl;
        public String definition;
        public String extInfo;
        public String flvUrl;
        public String h265Url;
        public String hlsUrl;
        public String liveStreamStatsInfo;
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
            t2o.a(806356454);
            t2o.a(806355930);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "QualityLiveItem{flvUrl='" + this.flvUrl + ", name='" + this.name + ", definition=" + this.definition + ", rtcLiveUrl=" + this.rtcLiveUrl + ", newDefinition=" + this.newDefinition + ", recomm=" + this.recomm + ", newName=" + this.newName + '}';
        }
    }

    static {
        t2o.a(806356452);
        t2o.a(806355930);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MediaData{liveUrlList=" + this.liveUrlList + ", h265=" + this.h265 + ", anchorId=" + this.anchorId + ", liveId=" + this.liveId + ", status=" + this.status + '}';
    }
}
