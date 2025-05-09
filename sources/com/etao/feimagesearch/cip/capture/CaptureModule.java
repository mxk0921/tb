package com.etao.feimagesearch.cip.capture;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.a07;
import tb.ckf;
import tb.rad;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String NAME = "TBSImageCaptureModule";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296902);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296901);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        ckf.g(mUSDKInstance, "instance");
    }

    public static /* synthetic */ Object ipc$super(CaptureModule captureModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/cip/capture/CaptureModule");
    }

    @MUSMethod
    public final void dismissPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e7c6e", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a instance = getInstance();
        if (instance != null) {
            Context uIContext = instance.getUIContext();
            if (uIContext instanceof rad) {
                ((rad) uIContext).A2();
            }
        }
    }
}
