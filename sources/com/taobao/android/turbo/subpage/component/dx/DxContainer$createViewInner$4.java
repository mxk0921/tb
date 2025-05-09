package com.taobao.android.turbo.subpage.component.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.turbo.subpage.component.dx.DxContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxContainer$createViewInner$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DxContainer.b $customParams;
    public final /* synthetic */ g1a $downloadCallBak;
    public final /* synthetic */ DXTemplateItem $dxTemplateItem;
    public final /* synthetic */ int $height;
    public final /* synthetic */ w1a $renderCallback;
    public final /* synthetic */ int $width;
    public final /* synthetic */ DxContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$createViewInner$4(DxContainer dxContainer, int i, int i2, DXTemplateItem dXTemplateItem, DxContainer.b bVar, g1a g1aVar, w1a w1aVar) {
        super(0);
        this.this$0 = dxContainer;
        this.$height = i;
        this.$width = i2;
        this.$dxTemplateItem = dXTemplateItem;
        this.$customParams = bVar;
        this.$downloadCallBak = g1aVar;
        this.$renderCallback = w1aVar;
    }

    public static /* synthetic */ Object ipc$super(DxContainer$createViewInner$4 dxContainer$createViewInner$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/DxContainer$createViewInner$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        DxContainer dxContainer = this.this$0;
        int i = this.$height;
        int i2 = this.$width;
        String str = this.$dxTemplateItem.f7343a;
        ckf.f(str, "dxTemplateItem.name");
        DXTemplateItem dXTemplateItem = this.$dxTemplateItem;
        long j = dXTemplateItem.b;
        String str2 = dXTemplateItem.c;
        ckf.f(str2, "dxTemplateItem.templateUrl");
        dxContainer.n(i, i2, str, j, str2, this.$customParams, this.$downloadCallBak, this.$renderCallback);
    }
}
