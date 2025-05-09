package com.taobao.android.nanocompose.runtime.context;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.v4z;
import tb.x4z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class RenderContext$density$2 extends Lambda implements d1a<v4z> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RenderContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderContext$density$2(RenderContext renderContext) {
        super(0);
        this.this$0 = renderContext;
    }

    public static /* synthetic */ Object ipc$super(RenderContext$density$2 renderContext$density$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/context/RenderContext$density$2");
    }

    @Override // tb.d1a
    public final v4z invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v4z) ipChange.ipc$dispatch("dfda7d91", new Object[]{this}) : x4z.b(this.this$0.d().getResources().getDisplayMetrics().density, 0.0f, 2, null);
    }
}
