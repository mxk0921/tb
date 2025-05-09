package com.taobao.android.turbo.subpage.component.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "invoke", "()V", "com/taobao/android/turbo/subpage/component/dx/DxContainer$createView$1$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxContainer$createView$1$$special$$inlined$forEach$lambda$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DXTemplateItem $hasRenderDXTemplateItem;
    public final /* synthetic */ DxContainer$createView$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createView$1$$special$$inlined$forEach$lambda$1(DXTemplateItem dXTemplateItem, DxContainer$createView$1 dxContainer$createView$1) {
        super(0);
        this.$hasRenderDXTemplateItem = dXTemplateItem;
        this.this$0 = dxContainer$createView$1;
    }

    public static /* synthetic */ Object ipc$super(DxContainer$createView$1$$special$$inlined$forEach$lambda$1 dxContainer$createView$1$$special$$inlined$forEach$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/DxContainer$createView$1$$special$$inlined$forEach$lambda$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        DxContainer$createView$1 dxContainer$createView$1 = this.this$0;
        DxContainer dxContainer = dxContainer$createView$1.this$0;
        int i = dxContainer$createView$1.$height;
        int i2 = dxContainer$createView$1.$width;
        String str = dxContainer$createView$1.$name;
        DXTemplateItem dXTemplateItem = this.$hasRenderDXTemplateItem;
        long j = dXTemplateItem.b;
        String str2 = dXTemplateItem.c;
        ckf.f(str2, "hasRenderDXTemplateItem.templateUrl");
        DxContainer$createView$1 dxContainer$createView$12 = this.this$0;
        dxContainer.n(i, i2, str, j, str2, dxContainer$createView$12.$customParams, dxContainer$createView$12.$downloadCallBak, dxContainer$createView$12.$renderCallback);
    }
}
