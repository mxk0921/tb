package com.alibaba.triver.triver_shop.shop2023.template;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCarBottomBarTemplate$updateTransparentStatus$action$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ boolean $isLivePage;
    public final /* synthetic */ TmallCarBottomBarTemplate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCarBottomBarTemplate$updateTransparentStatus$action$1(TmallCarBottomBarTemplate tmallCarBottomBarTemplate, boolean z) {
        super(0);
        this.this$0 = tmallCarBottomBarTemplate;
        this.$isLivePage = z;
    }

    public static /* synthetic */ Object ipc$super(TmallCarBottomBarTemplate$updateTransparentStatus$action$1 tmallCarBottomBarTemplate$updateTransparentStatus$action$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/TmallCarBottomBarTemplate$updateTransparentStatus$action$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.z(brf.a(jpu.a("transparentBgColor", Boolean.valueOf(this.$isLivePage))));
        }
    }
}
