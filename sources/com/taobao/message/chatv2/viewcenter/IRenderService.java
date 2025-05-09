package com.taobao.message.chatv2.viewcenter;

import android.content.Context;
import com.taobao.message.lab.comfrm.inner2.Plugins;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.render.WidgetInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IRenderService {
    WidgetInterface createWidget(Context context, String str, LayoutInfo layoutInfo);

    void setPlugin(Plugins plugins);
}
