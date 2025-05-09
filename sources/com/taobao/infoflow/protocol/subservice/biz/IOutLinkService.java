package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Intent;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.w1e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IOutLinkService extends ISubService {
    public static final String SERVICE_NAME = "OutLinkService";

    w1e getScrolledToItemTraceInfo();

    boolean isInQRCodePreview();

    void onOutLinkTrigger(String str, Intent intent);
}
