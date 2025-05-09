package com.taobao.android.fluid.framework;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.EnvAdapter;
import com.taobao.android.fluid.framework.adapter.HttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IEnvAdapter;
import com.taobao.android.fluid.framework.adapter.IHttpNetAdapter;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.android.fluid.framework.adapter.ILocationAdapter;
import com.taobao.android.fluid.framework.adapter.ILoginAdapter;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.INavAdapter;
import com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter;
import com.taobao.android.fluid.framework.adapter.IShareAdapter;
import com.taobao.android.fluid.framework.adapter.IUTAdapter;
import com.taobao.android.fluid.framework.adapter.LocationAdapter;
import com.taobao.android.fluid.framework.adapter.LoginAdapter;
import com.taobao.android.fluid.framework.adapter.NavAdapter;
import com.taobao.android.fluid.framework.adapter.ShareAdapter;
import com.taobao.android.fluid.framework.adapter.UTAdapter;
import com.taobao.android.fluid.framework.adapter.image.ImageAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.MTopAdapter;
import com.taobao.android.fluid.framework.adapter.remoteconfig.RemoteConfigAdapter;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoJsBridge;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoTNodeModule;
import com.taobao.android.fluid.framework.deprecated.message.module.ShortVideoWeexV2Module;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent;
import com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumSliderComponent;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.avplayer.component.weex.WXInteractiveComponent;
import com.taobao.global.setting.SettingStateWVApiPlugin;
import com.taobao.tao.flexbox.layoutmanager.core.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.io.Serializable;
import tb.fsw;
import tb.ir9;
import tb.p91;
import tb.t2o;
import tb.tr9;
import tb.vr9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DefaultFluidInitialize implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String APP_NAME = "taobao";
    private static final String TAG = "DefaultFluidInitialize";
    private static boolean sIsInitialized = false;

    static {
        t2o.a(468713791);
    }

    private DefaultFluidInitialize() {
    }

    private static tr9 createFluidSDKConfig(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tr9) ipChange.ipc$dispatch("48df46fa", new Object[]{context});
        }
        if (context == null) {
            context = p91.a();
        }
        return tr9.k().d(context).a("taobao").b(vr9.a()).e(vr9.b()).f(IEnvAdapter.class, new EnvAdapter()).f(IShareAdapter.class, new ShareAdapter()).f(IImageAdapter.class, new ImageAdapter()).f(ILoginAdapter.class, new LoginAdapter()).f(IMTopAdapter.class, new MTopAdapter(p91.a())).f(IHttpNetAdapter.class, new HttpNetAdapter()).f(IRemoteConfigAdapter.class, new RemoteConfigAdapter()).f(INavAdapter.class, new NavAdapter()).f(IUTAdapter.class, new UTAdapter()).f(ILocationAdapter.class, new LocationAdapter()).c();
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        ir9.b(TAG, "Fluid SDK 初始化开始");
        if (sIsInitialized) {
            ir9.b(TAG, "Fluid SDK 已经初始化完成，无需调用初始化方法");
            return;
        }
        try {
            tr9 createFluidSDKConfig = createFluidSDKConfig(context);
            registerModule(createFluidSDKConfig.i());
            FluidSDK.init(createFluidSDKConfig);
            sIsInitialized = true;
            ir9.b(TAG, "Fluid SDK 初始化成功, SDK 配置：" + createFluidSDKConfig);
        } catch (Exception e) {
            FluidException.throwException((FluidContext) null, FluidSDK.SDK_INIT_ERROR, e);
        }
    }

    private static void registerModule(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8554dc92", new Object[]{context});
            return;
        }
        ir9.b(TAG, "Fluid SDK 注册跨端容器 Module 开始");
        ir9.b(TAG, "注册 Weex module");
        try {
            WXSDKEngine.registerComponent("videoplus", WXInteractiveComponent.class);
        } catch (WXException e) {
            ir9.c(TAG, "注册 Weex Module 失败", e);
        }
        MUSEngine.registerModule("tbShortVideoModuleV2", ShortVideoWeexV2Module.class);
        ir9.b(TAG, "注册 WindVane Module");
        fsw.h("TBMyTaobaoSettingStateWVApiPlugin", SettingStateWVApiPlugin.class);
        fsw.h("tbShortVideoModule", ShortVideoJsBridge.class);
        ir9.b(TAG, "注册 TNode Module");
        o.T0("$shortvideo", ShortVideoTNodeModule.class);
        ir9.b(TAG, "注册 TNode Component");
        d.h("fullpagealbum", FullPageAlbumComponent.class);
        d.h("fullpagealbumslider", FullPageAlbumSliderComponent.class);
        ir9.b(TAG, "Fluid SDK 注册跨端容器 Module 成功");
    }
}
