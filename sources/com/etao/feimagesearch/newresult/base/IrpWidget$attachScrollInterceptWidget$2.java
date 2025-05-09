package com.etao.feimagesearch.newresult.base;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpWidget$attachScrollInterceptWidget$2 extends Lambda implements g1a<MotionEvent, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IrpWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpWidget$attachScrollInterceptWidget$2(IrpWidget irpWidget) {
        super(1);
        this.this$0 = irpWidget;
    }

    public static /* synthetic */ Object ipc$super(IrpWidget$attachScrollInterceptWidget$2 irpWidget$attachScrollInterceptWidget$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpWidget$attachScrollInterceptWidget$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b44f654", new Object[]{this, motionEvent});
            return;
        }
        ckf.g(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            IrpWidget.t0(this.this$0, true);
        } else if (action == 1 || action == 3) {
            IrpWidget.t0(this.this$0, false);
            IrpWidget.q0(this.this$0);
        }
    }
}
