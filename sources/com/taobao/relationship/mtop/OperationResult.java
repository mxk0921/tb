package com.taobao.relationship.mtop;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class OperationResult implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = -7405719299395506387L;
    private long id;
    private boolean isSuccess;
    private String success;

    static {
        t2o.a(759169048);
        t2o.a(589299906);
    }

    public long getId() {
        return this.id;
    }

    public String getSuccess() {
        return this.success;
    }

    public boolean isIsSuccess() {
        return this.isSuccess;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setSuccess(String str) {
        this.success = str;
    }
}
