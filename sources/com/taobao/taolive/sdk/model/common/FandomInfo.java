package com.taobao.taolive.sdk.model.common;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FandomInfo implements INetDataObject {
    public FandomMusic backgroundMusic;
    public String backgroundPic;
    public String bbQJumpH5;
    public AccountInfo broadCaster;
    public ArrayList<ConventionItem> conventionList;
    public long currentTime;
    public String disPatchTrackInfo;
    public boolean displayHotItems;
    public boolean displayVideos;
    public boolean enableHideWatchNums;
    public JSONObject extendMap;
    public String h5DynamicRenderUrl;
    public long hot;
    public String id;
    public String onlineLiveId;
    public long praiseCount;
    public ArrayList<FandomPreLiveInfo> preLives;
    public String shareWeexUrl;
    public String topic;
    public String topicNamespace;
    public String userNick;
    public HashMap<String, String> visitorIdentity;

    static {
        t2o.a(806356214);
        t2o.a(806355930);
    }
}
