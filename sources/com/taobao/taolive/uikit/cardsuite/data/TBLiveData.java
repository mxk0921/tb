package com.taobao.taolive.uikit.cardsuite.data;

import android.text.TextUtils;
import com.taobao.taolive.uikit.mtop.LiveItem;
import com.taobao.taolive.uikit.mtop.QualitySelectItem;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.frr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveData implements IMTOPDataObject {
    public static final int ROOM_STATUS_END = 2;
    public static final int ROOM_STATUS_LIVE = 1;
    public static final int ROOM_STATUS_NOTSTART = 0;
    public String accountId;
    public String bizCode;
    public BroadCaster broadCaster;
    public String coverImg;
    public String coverImg169;
    public String descInfo;
    public boolean h265;
    public String id;
    public ArrayList<LiveItem> itemList;
    public String liveChannelId;
    public String liveColumnId;
    public String liveUrl;
    public String liveUrlHls;
    public List<QualitySelectItem> liveUrlList;
    public String location;
    public String mediaConfig;
    public String nativeFeedDetailUrl;
    public String needItem;
    public long praiseCount;
    public boolean rateAdapte;
    public int roomStatus;
    public String scm;
    public boolean shownOnceFlg;
    public SimpleBroadCaster simpleBroadCaster;
    public long startTime;
    public String sxm;
    public String title;
    public String topic;
    public String totalViewCount;
    public String trackInfo;
    public long viewCount;
    public String vscore;

    static {
        t2o.a(779093576);
        t2o.a(589299906);
    }

    public int getDefalutQualityIndex() {
        List<QualitySelectItem> list = this.liveUrlList;
        if (list == null || list.size() <= 0) {
            return -1;
        }
        if (this.liveUrlList.size() == 1) {
            return 0;
        }
        if (this.liveUrlList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public String getLiveUrl() {
        int defalutQualityIndex = getDefalutQualityIndex();
        if (defalutQualityIndex == -1) {
            return this.liveUrl;
        }
        String str = this.liveUrlList.get(defalutQualityIndex).h265Url;
        if (TextUtils.isEmpty(str) || !frr.t()) {
            return this.liveUrlList.get(defalutQualityIndex).flvUrl;
        }
        return str;
    }
}
