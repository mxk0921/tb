package com.alibaba.ariver.app.api;

import android.os.Bundle;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.Proxiable;
import java.util.Stack;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.ariver.app.AppManagerImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface AppManager extends Node, Proxiable {
    void exitApp(long j);

    App findApp(long j);

    App findAppByAppId(String str);

    App findAppByToken(long j);

    Stack<App> getAppStack();

    App preCreateApp(String str, Bundle bundle, Bundle bundle2);

    App startApp(String str, Bundle bundle, Bundle bundle2);
}
