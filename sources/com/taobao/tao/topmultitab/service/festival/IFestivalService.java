package com.taobao.tao.topmultitab.service.festival;

import com.taobao.tao.topmultitab.service.base.IHomePageService;
import tb.l6c;
import tb.m6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IFestivalService extends l6c, IHomePageService {
    public static final String SERVICE_NAME = "FestivalService";

    m6c getFestivalChangeRegister();

    @Override // tb.l6c
    /* synthetic */ void onFestivalChanged();
}
