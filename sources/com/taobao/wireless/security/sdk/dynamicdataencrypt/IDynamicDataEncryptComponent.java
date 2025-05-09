package com.taobao.wireless.security.sdk.dynamicdataencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDynamicDataEncryptComponent extends IComponent {
    @Deprecated
    String dynamicDecrypt(String str);

    String dynamicDecryptDDp(String str);

    @Deprecated
    String dynamicEncrypt(String str);

    String dynamicEncryptDDp(String str);
}
