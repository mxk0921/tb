package com.taobao.android.live.plugin.atype.flexalocal.usertask.business;

import com.alibaba.fastjson.JSONObject;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.ArrayList;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MtopIliadUsertaskTasksEntryResponseData implements INetDataObject {
    public JSONObject asset;
    public BizData bizData;
    public String bizId;
    public String bizType;
    public long deliveryId;
    public EntryConfig entryConfig;
    public String entryType;
    public String entryUrl;
    public boolean hideProcessBar;
    public String jumpData;
    public String jumpType;
    public JSONObject newAtmosphere;
    public UserTaskProcess process;
    public JSONObject rewards;
    public JSONObject taskWelfarePopLayer;
    public Map<String, String> utParams;
    public boolean showEntry = false;
    public int countdownTime = 20;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class BizData implements INetDataObject {
        public ArrayList<String> anchorIdList;
        public boolean userJoin;

        static {
            t2o.a(295700112);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class EntryConfig implements INetDataObject {
        public int animationDuration;
        public String normalIcon;
        public String pauseIcon;
        public String pauseText;
        public String successIcon;
        public String text;

        static {
            t2o.a(295700113);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(295700111);
        t2o.a(806355930);
    }
}
