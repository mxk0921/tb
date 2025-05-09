package com.taobao.taolive.uikit.mtop;

import java.util.ArrayList;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VideoInfo implements IMTOPDataObject {
    public String coverImg;
    public String curItemNum;
    public boolean h265;
    public String liveFlagPic;
    public String liveId;
    public String liveUrl;
    public ArrayList<LiveUrlData> liveUrlList;
    public String mediaConfig;
    public String nativeFeedDetailUrl;
    public String praiseCount;
    public boolean rateAdapte;
    public String roomStatus;
    public ArrayList<LiveItem> showItemList;
    public boolean shownOnceFlg;
    public String title;
    public String viewCount;

    static {
        t2o.a(779093642);
        t2o.a(589299906);
    }

    public int describeContents() {
        return 0;
    }
}
