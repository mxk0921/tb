package com.taobao.android.appdevtools.core.internal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.lcn;
import tb.sgh;
import tb.sm8;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "success", "Ltb/xhv;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class WVDevToolsPlugin$wrapCallback$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVDevToolsPlugin$wrapCallback$1(WVCallBackContext wVCallBackContext) {
        super(1);
        this.$callback = wVCallBackContext;
    }

    public static /* synthetic */ Object ipc$super(WVDevToolsPlugin$wrapCallback$1 wVDevToolsPlugin$wrapCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/WVDevToolsPlugin$wrapCallback$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else if (z) {
            WVCallBackContext wVCallBackContext = this.$callback;
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
        } else {
            lcn.f(RVLLevel.Error, sgh.a("WVDevToolsPlugin"), ckf.p("JS API Error, stacktrace: ", sm8.b(new Throwable())));
            WVCallBackContext wVCallBackContext2 = this.$callback;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.error("msg", "error");
            }
        }
    }
}
