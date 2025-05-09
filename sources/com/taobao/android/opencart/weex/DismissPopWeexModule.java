package com.taobao.android.opencart.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.jgm;
import tb.wad;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/taobao/android/opencart/weex/DismissPopWeexModule;", "Lcom/taobao/android/weex_framework/module/MUSModule;", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "Lcom/taobao/android/weex_framework/MUSDKInstance;", "instance", "<init>", "(Ljava/lang/String;Lcom/taobao/android/weex_framework/MUSDKInstance;)V", "Ltb/xhv;", "dismissPop", "()V", "Companion", "a", "OpenCart_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DismissPopWeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String MODULE_NAME = "OpenCart";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissPopWeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        ckf.g(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        ckf.g(mUSDKInstance, "instance");
    }

    public static /* synthetic */ Object ipc$super(DismissPopWeexModule dismissPopWeexModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/opencart/weex/DismissPopWeexModule");
    }

    @MUSMethod
    public final void dismissPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e7c6e", new Object[]{this});
            return;
        }
        jgm jgmVar = jgm.INSTANCE;
        com.taobao.android.weex_framework.a instance = getInstance();
        ckf.f(instance, "instance");
        Context uIContext = instance.getUIContext();
        ckf.f(uIContext, "instance.uiContext");
        wad b = jgmVar.b(uIContext);
        if (b != null) {
            b.dismiss();
        }
    }
}
