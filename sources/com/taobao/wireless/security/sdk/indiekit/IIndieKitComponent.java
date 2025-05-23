package com.taobao.wireless.security.sdk.indiekit;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "misc")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IIndieKitComponent extends IComponent {
    String indieKitRequest(SecurityGuardParamContext securityGuardParamContext);

    int reportSusText(String str, String str2);

    int validateFileSignature(String str, String str2, String str3);
}
