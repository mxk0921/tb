package com.taobao.search.searchdoor.ai;

import com.alibaba.fastjson.annotation.JSONField;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AIHistoryBean {
    @JSONField(name = "chatId")
    public String chatId;
    @JSONField(name = "q")
    public String q;
    @JSONField(name = "sessionId")
    public String sessionId;

    static {
        t2o.a(815793039);
    }

    public AIHistoryBean(String str, String str2, String str3) {
        this.q = str;
        this.sessionId = str2;
        this.chatId = str3;
    }

    public AIHistoryBean() {
        this.q = "";
        this.sessionId = "";
        this.chatId = "";
    }
}
