package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.iqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IIconBackGuideAnimeService extends ISubService, iqb {
    public static final String SERVICE_NAME = "IconBackGuideAnimeService";

    /* synthetic */ void addOnContainerListener(iqb.a aVar);

    @Override // tb.iqb
    /* synthetic */ ViewGroup createContainer(Context context);

    boolean currentBackWithAnim();

    @Override // tb.iqb
    /* synthetic */ void destroyContainer();

    boolean isAnimeConfigValidate(String str);

    void onOutLinkTrigger(String str, Intent intent);

    /* synthetic */ void removeOnContainerListener(iqb.a aVar);
}
