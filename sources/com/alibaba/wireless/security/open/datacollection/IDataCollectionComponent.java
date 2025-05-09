package com.alibaba.wireless.security.open.datacollection;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDataCollectionComponent extends IComponent {
    String getNick();

    boolean setNick(String str);
}
