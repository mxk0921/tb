package com.taobao.infoflow.protocol.subservice.base;

import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.cfc;
import tb.rgc;
import tb.vgc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IItemRenderService extends ISubService {
    public static final String SERVICE_NAME = "ItemRenderService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        rgc a(String str);
    }

    vgc getItemRenderPresenter(cfc cfcVar);

    void setItemRenderFactory(a aVar);

    void setLoadMoreBottomOffset(int i);
}
