package com.alibaba.triver.cannal_engine.event;

import android.view.MotionEvent;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

/* compiled from: Taobao */
@DefaultImpl("com.alibaba.triver.cannal_engine.event.WidgetTouchEventUtils")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IWidgetTouchEventBridge extends Proxiable {
    void onClick(MotionEvent motionEvent, App app);

    void onTouch(MotionEvent motionEvent, App app);
}
