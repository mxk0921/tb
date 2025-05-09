package com.taobao.android.fluid.framework.device;

import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.fluid.core.FluidService;
import tb.ar9;
import tb.mzb;
import tb.o6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IDeviceService extends FluidService, o6d {
    public static final ar9 ERROR_CODE_NETWORK_RECEIVER_REGISTER_ERROR = new ar9("DEVICE-1", "网络监听注册失败");
    public static final ar9 ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR = new ar9("DEVICE-2", "网络监听取消注册失败");

    /* synthetic */ void addDeviceRotateListener(mzb.a aVar);

    /* synthetic */ void addDeviceRotateListener(mzb mzbVar);

    /* synthetic */ void addOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener);

    float getDeviceScore();

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onRealStart();

    /* synthetic */ void onRealStop();

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void removeDeviceRotateListener(mzb.a aVar);

    /* synthetic */ void removeDeviceRotateListener(mzb mzbVar);

    /* synthetic */ void removeOnScreenChangedListener(OnScreenChangedListener onScreenChangedListener);
}
