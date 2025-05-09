package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseContentComponent$setAllItemCountIconVisibleFunction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $enable;
    public final /* synthetic */ int $iconBottomPadding;
    public final /* synthetic */ int $iconRightPadding;
    public final /* synthetic */ BaseContentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$setAllItemCountIconVisibleFunction$1(boolean z, BaseContentComponent baseContentComponent, int i, int i2) {
        super(0);
        this.$enable = z;
        this.this$0 = baseContentComponent;
        this.$iconBottomPadding = i;
        this.$iconRightPadding = i2;
    }

    public static /* synthetic */ Object ipc$super(BaseContentComponent$setAllItemCountIconVisibleFunction$1 baseContentComponent$setAllItemCountIconVisibleFunction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/BaseContentComponent$setAllItemCountIconVisibleFunction$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (this.$enable) {
            if (this.this$0.i().getParent() == null) {
                this.this$0.H().addView(this.this$0.i(), kew.l(0, 0, 0, this.$iconBottomPadding, 0, this.$iconRightPadding, BadgeDrawable.BOTTOM_END, 23, null));
            }
            kew.g0(this.this$0.i());
        } else {
            kew.C(this.this$0.i());
        }
        kew.U(this.this$0.i(), this.$iconBottomPadding);
        kew.b0(this.this$0.i(), this.$iconRightPadding);
    }
}
