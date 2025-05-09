package com.alibaba.triver.cannal_engine.event;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.triver.cannal_engine.event.DXTabEventHandlerImpl")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IDXWidgetEvent extends Proxiable {
    void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext);

    void openApp(Context context, Uri uri, Bundle bundle);
}
