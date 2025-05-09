package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveListRequest implements IMTOPDataObject {
    public String appVersion;
    public String contentId;
    public String subContentId;
    public String API_NAME = "mtop.tblive.recommend.videolist.query";
    public String VERSION = "2.0";
    public long s = 0;
    public long n = 0;
    public boolean mNeedCache = false;
    public int queryAd = 0;
    public int channelId = 0;
    public int moduleIndex = 0;
    public String channelType = "jingxuan";
    public String subChannelType = "all";
    public boolean isChannelUpgradation = true;
    public boolean subChannelFollow = true;
    public String extendParams = "";
    public String extendCommonParams = "";
    public String clientParam = "";

    static {
        t2o.a(310378721);
        t2o.a(589299906);
    }

    public boolean needCache() {
        return this.mNeedCache;
    }
}
