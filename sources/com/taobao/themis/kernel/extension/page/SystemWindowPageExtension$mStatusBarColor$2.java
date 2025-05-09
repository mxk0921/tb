package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class SystemWindowPageExtension$mStatusBarColor$2 extends Lambda implements d1a<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SystemWindowPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemWindowPageExtension$mStatusBarColor$2(SystemWindowPageExtension systemWindowPageExtension) {
        super(0);
        this.this$0 = systemWindowPageExtension;
    }

    public static /* synthetic */ Object ipc$super(SystemWindowPageExtension$mStatusBarColor$2 systemWindowPageExtension$mStatusBarColor$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/SystemWindowPageExtension$mStatusBarColor$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final Integer invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("14feca66", new Object[]{this}) : Integer.valueOf(SystemWindowPageExtension.a(this.this$0).getStatusBarColor());
    }
}
