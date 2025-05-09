package com.alibaba.ariver.kernel.api.remote;

import com.alibaba.ariver.kernel.api.extension.Extension;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RemoteControlManagement {
    IRemoteCaller getRemoteCallerProxy();

    boolean isRemoteExtension(Extension extension, Method method);
}
