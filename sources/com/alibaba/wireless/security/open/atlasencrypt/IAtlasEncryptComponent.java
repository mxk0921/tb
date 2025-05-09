package com.alibaba.wireless.security.open.atlasencrypt;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "main")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IAtlasEncryptComponent extends IComponent {
    String atlasSafeEncrypt(String str, String str2) throws SecException;
}
