package com.taobao.android.appdevtools.core.internal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.appdevtools.core.model.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.rrf;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/android/appdevtools/core/model/Config;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Lcom/taobao/android/appdevtools/core/model/Config;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class WVDevToolsPlugin$execute$1 extends Lambda implements g1a<Config, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVDevToolsPlugin$execute$1(WVCallBackContext wVCallBackContext) {
        super(1);
        this.$callback = wVCallBackContext;
    }

    public static /* synthetic */ Object ipc$super(WVDevToolsPlugin$execute$1 wVDevToolsPlugin$execute$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/WVDevToolsPlugin$execute$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Config config) {
        invoke2(config);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e23ed91", new Object[]{this, config});
            return;
        }
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(rrf.b(config));
        }
    }
}
