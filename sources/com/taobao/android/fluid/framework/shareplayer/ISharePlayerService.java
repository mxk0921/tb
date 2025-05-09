package com.taobao.android.fluid.framework.shareplayer;

import com.taobao.android.fluid.core.FluidService;
import tb.atb;
import tb.o6d;
import tb.wjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ISharePlayerService extends FluidService, o6d {
    void clearSharePlayer(String str);

    wjp getConfig();

    atb getDWInstance();

    void initSharePlayer();

    boolean isEnableInnerSharePlayer();

    boolean isEnableSharePlayer();

    boolean isHasCreateDWInstance();

    boolean isHasShowInnerSharePlayerPV();

    boolean isSharePlayerViewStateNoPlaying();

    boolean isStillShareVideo();

    @Override // tb.o6d
    /* synthetic */ void onCreate();

    @Override // tb.o6d
    /* synthetic */ void onDestroy();

    @Override // tb.o6d
    /* synthetic */ void onPause();

    @Override // tb.o6d
    /* synthetic */ void onRealStart();

    @Override // tb.o6d
    /* synthetic */ void onRealStop();

    @Override // tb.o6d
    /* synthetic */ void onResume();

    @Override // tb.o6d
    /* synthetic */ void onStart();

    @Override // tb.o6d
    /* synthetic */ void onStop();

    void setDWInstance(atb atbVar);

    void setEnableInnerSharePlayer(boolean z);

    void setEnableSharePlayer(boolean z);

    void setHasCreateDWInstance(boolean z);

    void setHasShowInnerSharePlayerPV(boolean z);
}
