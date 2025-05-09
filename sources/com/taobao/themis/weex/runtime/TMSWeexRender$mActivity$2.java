package com.taobao.themis.weex.runtime;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWeexRender$mActivity$2 extends Lambda implements d1a<Activity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSWeexRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWeexRender$mActivity$2(TMSWeexRender tMSWeexRender) {
        super(0);
        this.this$0 = tMSWeexRender;
    }

    public static /* synthetic */ Object ipc$super(TMSWeexRender$mActivity$2 tMSWeexRender$mActivity$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/runtime/TMSWeexRender$mActivity$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Activity invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("70cb7309", new Object[]{this});
        }
        Activity I = TMSWeexRender.u1(this.this$0).getInstance().I();
        ckf.f(I, "mPage.getInstance().activity");
        return I;
    }
}
