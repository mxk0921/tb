package com.alibaba.security.client.smart.core.model;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ActionResult implements Serializable {
    public String actionCode;
    public String params;
    public String sign;

    public ActionResult(String str, String str2, String str3) {
        this.actionCode = str;
        this.params = str2;
        this.sign = str3;
    }
}
