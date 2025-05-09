package com.taobao.android.fluid.devtools;

import android.view.ViewGroup;
import com.taobao.android.fluid.core.FluidService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDevToolsService extends FluidService {
    public static final String SERVICE_NAME = "IDevToolsService";

    void attachDevToolsEntry(ViewGroup viewGroup);

    void setDebugText(String str);

    void showException(Throwable th);

    void showObserverProfiler(String str, String str2, long j);

    void showServiceProfiler(String str, String str2, long j);

    void traceBeginSection(String str);

    void traceEndSection(String str);
}
