package com.taobao.themis.weex.runtime;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWeexRender$mRootView$2 extends Lambda implements d1a<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSWeexRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWeexRender$mRootView$2(TMSWeexRender tMSWeexRender) {
        super(0);
        this.this$0 = tMSWeexRender;
    }

    public static /* synthetic */ Object ipc$super(TMSWeexRender$mRootView$2 tMSWeexRender$mRootView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/weex/runtime/TMSWeexRender$mRootView$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FrameLayout invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this}) : new FrameLayout(TMSWeexRender.s1(this.this$0));
    }
}
