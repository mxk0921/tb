package com.taobao.zcachecorewrapper.model;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Error implements Serializable {
    public int errCode;
    public String errMsg;

    static {
        t2o.a(996147287);
    }

    public Error(com.taobao.zcache.Error error) {
        if (error == null) {
            this.errCode = 0;
            this.errMsg = null;
            return;
        }
        this.errCode = error.getCode();
        this.errMsg = error.getMessage();
    }
}
