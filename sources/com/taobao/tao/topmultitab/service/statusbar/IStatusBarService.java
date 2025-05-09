package com.taobao.tao.topmultitab.service.statusbar;

import android.content.Context;
import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IStatusBarService extends IHomePageService {
    public static final String SERVICE_NAME = "IStatusBarService";

    void updateStatusBar(Context context);

    void updateStatusBar(Context context, int i);
}
