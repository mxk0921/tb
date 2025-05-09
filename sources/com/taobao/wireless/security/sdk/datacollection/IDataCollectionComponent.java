package com.taobao.wireless.security.sdk.datacollection;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDataCollectionComponent extends IComponent {
    @Deprecated
    String getEncryptedDevAndEnvInfo(int i, String str);

    String getNick();

    String getNickEx(int i);

    boolean setNick(String str);

    boolean setNickEx(int i, String str);
}
