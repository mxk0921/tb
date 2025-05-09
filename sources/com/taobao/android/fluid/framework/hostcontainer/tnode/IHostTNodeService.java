package com.taobao.android.fluid.framework.hostcontainer.tnode;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.monitor.procedure.IPage;
import tb.h3e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IHostTNodeService extends FluidService {
    IPage getApmPage();

    h3e getTab2ServiceDelegate();

    boolean isNativeHost();

    void setTab2ServiceDelegate(h3e h3eVar);

    void showOrHideTab2TopBar(boolean z);
}
