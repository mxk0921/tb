package com.taobao.taolive.room.afccoldlunch;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SimpleVideoInfo implements INetDataObject {
    public String accountId;
    public String disPatchTrackInfo;
    public String dispatchItemID;
    public String encodeAccountId;
    public String holdItemIds;
    public String itemHoldType;
    public String liveId;
    public ArrayList<MediaData.QualityLiveItem> liveUrlList;
    public String roomStatus;
    public String simpleTransParams;
    public String timeMovingId;
    public String timeMovingSpfPlayVideo;
    public String voiceSilent;

    static {
        t2o.a(779092785);
        t2o.a(806355930);
    }
}
