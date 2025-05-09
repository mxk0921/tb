package com.taobao.taolive.room.business.fanslevel;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GetFansLevelDetailData implements INetDataObject {
    public String audienceExp;
    public String audienceLevel;
    public String briefUrl;
    public String detailUrl;
    public String expNeeded4NextLevel;
    public ArrayList<FanLevelConfigData> levels;
    public ArrayList<String> rewards;
    public String scopeId;
    public String subScopeId;
    public String weexUrl;

    static {
        t2o.a(806355679);
        t2o.a(806355930);
    }
}
