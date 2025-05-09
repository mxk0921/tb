package com.alibaba.ariver.kernel.api.security;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface AccessController {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ApplyCallback {
        void onFailure(List<? extends Permission> list);

        void onSuccess();
    }

    boolean check(Accessor accessor, List<? extends Guard> list, ApplyCallback applyCallback) throws AccessControlException;

    void setAccessControlManagement(AccessControlManagement accessControlManagement);
}
