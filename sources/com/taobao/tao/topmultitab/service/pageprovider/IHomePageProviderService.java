package com.taobao.tao.topmultitab.service.pageprovider;

import com.taobao.tao.topmultitab.service.base.IHomePageService;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomePageProviderService extends IHomePageService {
    public static final String SERVICE_NAME = "HomePageProviderService";

    z6d getPageProvider();

    void setPageProvider(z6d z6dVar);
}
