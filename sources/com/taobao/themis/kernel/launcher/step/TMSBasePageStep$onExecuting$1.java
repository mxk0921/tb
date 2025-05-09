package com.taobao.themis.kernel.launcher.step;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSBasePageStep$onExecuting$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSBasePageStep this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBasePageStep$onExecuting$1(TMSBasePageStep tMSBasePageStep) {
        super(0);
        this.this$0 = tMSBasePageStep;
    }

    public static /* synthetic */ Object ipc$super(TMSBasePageStep$onExecuting$1 tMSBasePageStep$onExecuting$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/launcher/step/TMSBasePageStep$onExecuting$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            TMSBasePageStep.k(this.this$0);
        }
    }
}
