package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Intent;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.h6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IPrefetchImageService extends ISubService, h6d {
    public static final String SERVICE_NAME = "IPrefetchImageService";

    /* synthetic */ void onDestroy();

    /* synthetic */ void onDestroyView();

    /* synthetic */ void onNewIntent(Intent intent);

    /* synthetic */ void onPause();

    /* synthetic */ void onRestart();

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void onWillExit();

    void prefetchImage(BaseSectionModel<?> baseSectionModel, boolean z, int i);

    void saveImageWidth(String str, String str2, String str3, Object obj, int i, int i2, String str4);
}
