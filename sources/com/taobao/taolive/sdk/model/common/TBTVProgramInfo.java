package com.taobao.taolive.sdk.model.common;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBTVProgramInfo implements INetDataObject {
    public AccountInfo accountDo;
    public String backgroundImageURL;
    public String coverImg;
    public String descInfo;
    public boolean h265;
    public String headWeex;
    public boolean landScape;
    public String liveId;
    public VideoInfo.SubLiveInfo liveSubView;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String location;
    public String menuWeex;
    public MillionbabyInfo millionBaby;
    public String nativeFeedDetailUrl;
    public boolean rateAdapte;
    public VideoInfo.RoomExtendInfo roomExtend;
    public int roomStatus;
    public String shareUrl;
    public String standbyPic;
    public long startTime;
    public String supportNewLogo;
    public String supportNewUrl;
    public bannerDO tbtvHeadBannerDO;
    public String title;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class bannerDO {
        public String bkUrl;
        public String iconUrl;

        static {
            t2o.a(806356254);
        }

        public bannerDO() {
        }
    }

    static {
        t2o.a(806356253);
        t2o.a(806355930);
    }
}
