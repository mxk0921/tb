package com.taobao.message.launcher.server_time;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class GetTimeStampData implements IMTOPDataObject, Serializable {
    private static final long serialVersionUID = 1;
    private String t;

    static {
        t2o.a(529531034);
        t2o.a(589299906);
    }

    public String getT() {
        return this.t;
    }

    public void setT(String str) {
        this.t = str;
    }
}
