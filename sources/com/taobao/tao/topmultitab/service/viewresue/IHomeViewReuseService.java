package com.taobao.tao.topmultitab.service.viewresue;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.tao.topmultitab.service.base.IHomePageService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeViewReuseService extends IHomePageService {
    public static final String SERVICE_NAME = "HomeViewReuseService";

    View inflateRocketView(Activity activity);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void preCreateRocket();

    void preCreateRootView(IHomeViewService iHomeViewService);

    void preCreateTheme();

    void setAsyncTaskCount(int i);
}
