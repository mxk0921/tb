package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IFoldDeviceAndPadService extends ISubService {
    public static final String SERVICE_NAME = "FoldDeviceAndPadService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onScreenChanged(boolean z, boolean z2);
    }

    void addOnScreenChangeListener(a aVar);

    int getInfoFlowAdaptiveColumn(Context context);

    boolean isAdaptHudScreen();

    void removeOnScreenChangeListener(a aVar);
}
