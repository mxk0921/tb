package com.taobao.android.appdevtools.core.internal;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.lcn;
import tb.nsw;
import tb.sgh;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "success", "", "msg", "keepAlive", "Ltb/xhv;", "invoke", "(ZLjava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class WVDevToolsPlugin$execute$2 extends Lambda implements w1a<Boolean, String, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVDevToolsPlugin$execute$2(WVCallBackContext wVCallBackContext) {
        super(3);
        this.$callback = wVCallBackContext;
    }

    public static /* synthetic */ Object ipc$super(WVDevToolsPlugin$execute$2 wVDevToolsPlugin$execute$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/appdevtools/core/internal/WVDevToolsPlugin$execute$2");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, String str, Boolean bool2) {
        invoke(bool.booleanValue(), str, bool2.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z, String str, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a453ae75", new Object[]{this, new Boolean(z), str, new Boolean(z2)});
            return;
        }
        ckf.g(str, "msg");
        lcn.a(RVLLevel.Info, sgh.a("WVDevToolsPlugin")).j("remoteDebug").a("success", Boolean.valueOf(z)).a("msg", str).a("keepAlive", Boolean.valueOf(z2)).f();
        nsw nswVar = new nsw();
        nswVar.i(z2);
        nswVar.b("msg", str);
        if (z) {
            nswVar.k();
            WVCallBackContext wVCallBackContext = this.$callback;
            if (wVCallBackContext != null) {
                wVCallBackContext.onSuccess(nswVar);
                return;
            }
            return;
        }
        WVCallBackContext wVCallBackContext2 = this.$callback;
        if (wVCallBackContext2 != null) {
            wVCallBackContext2.onFailure(nswVar);
        }
    }
}
