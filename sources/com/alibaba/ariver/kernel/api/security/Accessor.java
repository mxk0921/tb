package com.alibaba.ariver.kernel.api.security;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Accessor {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface InquiryCallback {
        void onComplete(List<? extends Permission> list, List<? extends Permission> list2);
    }

    Group getGroup();

    void inquiry(List<? extends Permission> list, InquiryCallback inquiryCallback);

    List<Permission> usePermissions();
}
