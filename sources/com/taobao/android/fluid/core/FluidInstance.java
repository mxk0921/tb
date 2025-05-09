package com.taobao.android.fluid.core;

import tb.ar9;
import tb.o6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface FluidInstance extends FluidContext, o6d {
    public static final ar9 INSTANCE_PARSE_INSTANCE_CONFIG_ERROR = new ar9("INSTANCE-1", "FluidInstanceConfig 解析失败");
    public static final ar9 INSTANCE_NEW_INSTANCE_ERROR = new ar9("INSTANCE-2", "FluidInstance 初始化实例失败");
    public static final ar9 INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY = new ar9("INSTANCE-3", "Android 上下文 Context 不是 Activity");
    public static final ar9 INSTANCE_LISTENER_CALLBACK_EXECUTE_ERROR = new ar9("INSTANCE-4", "监听器回调执行异常");
    public static final ar9 INSTANCE_CREATE_INSTANCE_ERROR = new ar9("INSTANCE-5", "FluidInstance 创建实例失败");
    public static final ar9 INSTANCE_DESTROY_INSTANCE_ERROR = new ar9("INSTANCE-6", "FluidInstance 销毁实例失败");

    boolean isDestroyed();

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
}
