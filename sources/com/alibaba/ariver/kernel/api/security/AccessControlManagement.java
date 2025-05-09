package com.alibaba.ariver.kernel.api.security;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface AccessControlManagement {
    boolean asyncInterceptJsapi(Permission permission, Accessor accessor);

    boolean asyncPermissionCheck(Permission permission, Accessor accessor);

    boolean bizPermissionCheck(Permission permission, Accessor accessor);

    Group manageAccessorGroup(Accessor accessor);

    boolean needAuthPermission();

    boolean needPermissionCheck(Accessor accessor, List<? extends Guard> list);

    ApiPermissionCheckResult permissionCheck(Permission permission, Accessor accessor);
}
