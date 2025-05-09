package com.alibaba.wireless.security.open.maldetection;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;

/* compiled from: Taobao */
@InterfacePluginInfo(pluginName = "securitybody")
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IMalDetect extends IComponent {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ICallBack {
        void onDetection(int i, String str, String str2);
    }

    void registerCallBack(ICallBack iCallBack);

    void unregisterCallBack(ICallBack iCallBack);
}
