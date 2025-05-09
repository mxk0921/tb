package com.taobao.message.lab.comfrm.render;

import android.view.View;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface WidgetInterface<T extends Serializable> extends Disposable {
    int getId();

    View getView();

    void postEvent(Event event);
}
