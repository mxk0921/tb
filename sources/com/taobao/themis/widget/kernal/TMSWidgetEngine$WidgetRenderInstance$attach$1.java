package com.taobao.themis.widget.kernal;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.q6x;
import tb.xhv;
import tb.xid;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetEngine$WidgetRenderInstance$attach$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSWidgetEngine.WidgetRenderInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetEngine$WidgetRenderInstance$attach$1(TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance) {
        super(0);
        this.this$0 = widgetRenderInstance;
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetEngine$WidgetRenderInstance$attach$1 tMSWidgetEngine$WidgetRenderInstance$attach$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance$attach$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WeexInstance weexInstance;
        q6x q6xVar;
        xid f;
        WeexInstance weexInstance2;
        q6x q6xVar2;
        xid f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (TMSWidgetEngine.WidgetRenderInstance.e(this.this$0) && TMSWidgetEngine.WidgetRenderInstance.f(this.this$0)) {
            TMSWidgetEngine.WidgetRenderInstance.t(this.this$0, false);
            if (TMSWidgetEngine.WidgetRenderInstance.h(this.this$0) != WeexUnicornConfig.RenderMode.texture) {
                try {
                    WeakReference n = TMSWidgetEngine.WidgetRenderInstance.n(this.this$0);
                    if (!(n == null || (weexInstance = (WeexInstance) n.get()) == null || (q6xVar = (q6x) weexInstance.getExtend(q6x.class)) == null || (f = q6xVar.f()) == null)) {
                        f.C();
                    }
                    TMSLogger.a(TMSWidgetEngine.TAG, "onAttach! recover surface");
                } catch (Throwable th) {
                    TMSLogger.d(TMSWidgetEngine.TAG, th);
                }
            } else if (TMSWidgetEngine.WidgetRenderInstance.i(this.this$0) != null && TMSWidgetEngine.WidgetRenderInstance.j(this.this$0) != null) {
                ViewGroup j = TMSWidgetEngine.WidgetRenderInstance.j(this.this$0);
                ckf.d(j);
                if (j.getChildCount() > 0) {
                    ViewGroup j2 = TMSWidgetEngine.WidgetRenderInstance.j(this.this$0);
                    ckf.d(j2);
                    j2.removeAllViews();
                }
                TMSLogger.a(TMSWidgetEngine.TAG, "onAttach! add View");
                ViewGroup j3 = TMSWidgetEngine.WidgetRenderInstance.j(this.this$0);
                ckf.d(j3);
                j3.addView(TMSWidgetEngine.WidgetRenderInstance.i(this.this$0));
            } else {
                return;
            }
            try {
                WeakReference n2 = TMSWidgetEngine.WidgetRenderInstance.n(this.this$0);
                if (!(n2 == null || (weexInstance2 = (WeexInstance) n2.get()) == null || (q6xVar2 = (q6x) weexInstance2.getExtend(q6x.class)) == null || (f2 = q6xVar2.f()) == null)) {
                    f2.D();
                }
                TMSLogger.a(TMSWidgetEngine.TAG, "onAttach! recover images");
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th2) {
                Result.m1108constructorimpl(b.a(th2));
            }
        }
    }
}
