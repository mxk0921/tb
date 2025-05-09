package com.taobao.themis.widget.kernal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetEngine$WidgetRenderInstance$destroy$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TMSWidgetEngine.WidgetRenderInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetEngine$WidgetRenderInstance$destroy$1(TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance) {
        super(0);
        this.this$0 = widgetRenderInstance;
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetEngine$WidgetRenderInstance$destroy$1 tMSWidgetEngine$WidgetRenderInstance$destroy$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/kernal/TMSWidgetEngine$WidgetRenderInstance$destroy$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WeexInstance weexInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        WeakReference n = TMSWidgetEngine.WidgetRenderInstance.n(this.this$0);
        if (n != null && (weexInstance = (WeexInstance) n.get()) != null) {
            weexInstance.destroy();
        }
    }
}
