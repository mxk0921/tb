package com.taobao.android.miniLive.model;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;
import tb.y2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SimpleLiveInfo implements INetDataObject {
    public static final int LIVE_STATUS_LIVING = 1;
    public static final int LIVE_STATUS_PRE = 0;
    public static final int LIVE_STATUS_REPLAY = 2;
    public String accountId;
    public String backgroundImageURL;
    public List<y2s> benefits;
    public BroadcasterInfo broadCaster;
    public String coverImg;
    public String coverImg169;
    public String defaultImageUrl;
    public boolean edgePcdn;
    public boolean h265;
    public ShowCaseItem item;
    public boolean landScape = false;
    public String liveConfigForStream;
    public String liveId;
    public String liveUrl;
    public String liveUrlHls;
    public ArrayList<QualitySelectItem> liveUrlList;
    public String mediaConfig;
    public String pushFeature;
    public boolean rateAdapte;
    public String replayUrl;
    public int roomStatus;
    public int streamStatus;
    public String title;
    public String topic;
    public long viewCount;

    static {
        t2o.a(779091990);
        t2o.a(806355930);
    }
}
