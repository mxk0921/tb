package com.alibaba.wireless.security.open.simulatordetect;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "securitybody")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ISimulatorDetectComponent extends IComponent {
    boolean isSimulator();
}
