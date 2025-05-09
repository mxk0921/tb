package com.taobao.search.searchdoor.activate.guess;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.mh1;
import tb.t2o;
import tb.wxi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActivateGuessBean implements Serializable {
    @JSONField(name = "cateid")
    public String cateid;
    @JSONField(name = mh1.PRD_P4P_URL)
    public String clickUrl;
    @JSONField(name = "displaytype")
    public String displaytype;
    @JSONField(name = "justWatchInfo")
    public JSONObject justWatchInfo;
    @JSONField(name = "noMergeRecallType")
    public String noMergeRecallType;
    @JSONField(name = wxi.KEY_PIC_URL)
    public String picurl;
    @JSONField(name = "preIconInfo")
    public PreIconInfo preIconInfo;
    @JSONField(name = "rawRecQuery")
    public String rawRecQuery;
    @JSONField(name = "recallType")
    public String recallType;
    @JSONField(name = "searchparams")
    public String searchparams;
    @JSONField(name = "searchtext")
    public String searchtext;
    @JSONField(name = "showtext")
    public String showtext;
    @JSONField(name = "subtype")
    public String subtype;
    @JSONField(name = "topcateid")
    public String topcateid;
    @JSONField(name = "trigger")
    public String trigger;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class PreIconInfo {
        @JSONField(name = "height")
        public String height;
        @JSONField(name = "url")
        public String url;
        @JSONField(name = "width")
        public String width;

        static {
            t2o.a(815792969);
        }
    }

    static {
        t2o.a(815792968);
    }
}
