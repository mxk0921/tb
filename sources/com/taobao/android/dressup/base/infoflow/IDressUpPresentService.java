package com.taobao.android.dressup.base.infoflow;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDressUpPresentService extends ISubService {
    public static final String SERVICE_NAME = "IDressUpPresentService";

    double calculateCardExposeRatio(int i);

    void notifyDataSetChanged(boolean z, boolean z2);
}
