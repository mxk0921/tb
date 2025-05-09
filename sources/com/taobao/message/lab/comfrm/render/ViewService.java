package com.taobao.message.lab.comfrm.render;

import android.content.Context;
import com.taobao.message.lab.comfrm.core.ViewObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ViewService {
    WidgetInstance createView(RenderTemplate renderTemplate);

    void dryRun(ViewObject viewObject);

    Context getContext();

    boolean isSnapshot();

    void removeView(WidgetInstance widgetInstance);
}
