package com.alibaba.wireless.security.open.pkgvaliditycheck;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "misc")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPkgValidityCheckComponent extends IComponent {
    int checkEnvAndFiles(String... strArr) throws SecException;
}
