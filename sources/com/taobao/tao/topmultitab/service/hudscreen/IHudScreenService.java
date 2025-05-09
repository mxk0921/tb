package com.taobao.tao.topmultitab.service.hudscreen;

import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHudScreenService extends IHomePageService {
    public static final String SERVICE_NAME = "HudScreenService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a();
    }

    void addOnScreenChangeListener(a aVar);

    void removeOnScreenChangeListener(a aVar);
}
