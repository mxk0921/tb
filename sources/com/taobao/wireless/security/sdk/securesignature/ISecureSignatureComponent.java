package com.taobao.wireless.security.sdk.securesignature;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ISecureSignatureComponent extends IComponent {
    String signRequest(SecurityGuardParamContext securityGuardParamContext);
}
