package com.taobao.message.chatv2.viewcenter.monitor;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WhiteMonitorError {
    public int errCode;
    public String errMsg;
    public String widget;

    static {
        t2o.a(552599629);
    }

    public WhiteMonitorError(String str, int i, String str2) {
        this.widget = str;
        this.errCode = i;
        this.errMsg = str2;
    }
}
