package com.alibaba.wireless.security.open.compat;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ICompatComponent extends IComponent {
    String getCachedSecurityToken(int i) throws SecException;
}
