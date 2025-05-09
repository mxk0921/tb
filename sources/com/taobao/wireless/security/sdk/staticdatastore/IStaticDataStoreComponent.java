package com.taobao.wireless.security.sdk.staticdatastore;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IStaticDataStoreComponent extends IComponent {
    String getAppKeyByIndex(int i);

    String getExtraData(String str);

    int getKeyType(String str);
}
