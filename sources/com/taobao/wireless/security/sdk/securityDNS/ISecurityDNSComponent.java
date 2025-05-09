package com.taobao.wireless.security.sdk.securityDNS;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ISecurityDNSComponent extends IComponent {
    void checkSecurityDNS(String[] strArr);

    boolean initSecurityDNS();
}
