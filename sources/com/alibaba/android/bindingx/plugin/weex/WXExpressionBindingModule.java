package com.alibaba.android.bindingx.plugin.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import java.util.List;
import java.util.Map;
import tb.bb2;
import tb.fr8;
import tb.i3c;
import tb.k21;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class WXExpressionBindingModule extends WXSDKEngine.DestroyableModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private bb2 mExpressionBindingCore;
    private com.alibaba.android.bindingx.core.a mPlatformManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(WXExpressionBindingModule wXExpressionBindingModule) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new BindingXScrollHandler(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements bb2.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSCallback f2187a;

        public b(WXExpressionBindingModule wXExpressionBindingModule, JSCallback jSCallback) {
            this.f2187a = jSCallback;
        }

        @Override // tb.bb2.g
        public void callback(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9c6f28", new Object[]{this, obj});
                return;
            }
            JSCallback jSCallback = this.f2187a;
            if (jSCallback != null) {
                jSCallback.invokeAndKeepAlive(obj);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(WXExpressionBindingModule wXExpressionBindingModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/bindingx/plugin/weex/WXExpressionBindingModule");
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.mExpressionBindingCore;
        if (bb2Var != null) {
            bb2Var.f();
            this.mExpressionBindingCore = null;
        }
    }

    @JSMethod
    @Deprecated
    public void disableAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277025a0", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.mExpressionBindingCore;
        if (bb2Var != null) {
            bb2Var.f();
        }
    }

    @JSMethod
    @Deprecated
    public void disableBinding(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b903cf98", new Object[]{this, str, str2});
            return;
        }
        bb2 bb2Var = this.mExpressionBindingCore;
        if (bb2Var != null) {
            bb2Var.g(str, str2);
        }
    }

    @JSMethod
    @Deprecated
    public void enableBinding(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c208f9d", new Object[]{this, str, str2});
            return;
        }
        if (this.mPlatformManager == null) {
            this.mPlatformManager = WXBindingXModule.createPlatformManager(this.mWXSDKInstance);
        }
        if (this.mExpressionBindingCore == null) {
            bb2 bb2Var = new bb2(this.mPlatformManager);
            this.mExpressionBindingCore = bb2Var;
            bb2Var.l("scroll", new a(this));
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.mExpressionBindingCore;
        if (bb2Var != null) {
            bb2Var.j();
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.mExpressionBindingCore;
        if (bb2Var != null) {
            bb2Var.k();
        }
    }

    @JSMethod
    @Deprecated
    public void createBinding(String str, String str2, String str3, List<Map<String, Object>> list, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdaf6769", new Object[]{this, str, str2, str3, list, jSCallback});
            return;
        }
        String str4 = null;
        try {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            k21.b("weex", wXSDKInstance != null ? wXSDKInstance.getBundleUrl() : null);
        } catch (Throwable unused) {
        }
        enableBinding(null, null);
        fr8 a2 = fr8.a(null, str3);
        bb2 bb2Var = this.mExpressionBindingCore;
        b bVar = new b(this, jSCallback);
        WXSDKInstance wXSDKInstance2 = this.mWXSDKInstance;
        Context context = wXSDKInstance2 == null ? null : wXSDKInstance2.getContext();
        WXSDKInstance wXSDKInstance3 = this.mWXSDKInstance;
        if (wXSDKInstance3 != null) {
            str4 = wXSDKInstance3.N();
        }
        bb2Var.d(str, null, str2, null, a2, list, null, bVar, context, str4, null, new Object[0]);
    }
}
