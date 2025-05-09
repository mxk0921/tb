package com.alibaba.ariver.kernel.ipc;

import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.ariver.ipc.RemoteCallerImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface RVRemoteCallerProxy extends Proxiable {
    <T> T getRemoteCaller(Class<T> cls);

    <T> void registerServiceBean(Class<T> cls, T t);
}
