package com.alibaba.security.realidentity.biz.start.model;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StartStatusResult implements Serializable {
    public String biz;
    public boolean gradeCertified;
    public boolean reviewStatus;
    public AuditStatus rpAuditStatus;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class AuditStatus implements Serializable {
        public int code;
        public String desc;
        public String name;
    }
}
