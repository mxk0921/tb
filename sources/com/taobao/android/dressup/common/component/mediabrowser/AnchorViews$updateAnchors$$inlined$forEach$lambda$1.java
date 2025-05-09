package com.taobao.android.dressup.common.component.mediabrowser;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.bzm;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "invoke", "()V", "com/taobao/android/dressup/common/component/mediabrowser/AnchorViews$updateAnchors$1$view$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class AnchorViews$updateAnchors$$inlined$forEach$lambda$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ bzm $anchor;
    public final /* synthetic */ AnchorViews this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorViews$updateAnchors$$inlined$forEach$lambda$1(bzm bzmVar, AnchorViews anchorViews) {
        super(0);
        this.$anchor = bzmVar;
        this.this$0 = anchorViews;
    }

    public static /* synthetic */ Object ipc$super(AnchorViews$updateAnchors$$inlined$forEach$lambda$1 anchorViews$updateAnchors$$inlined$forEach$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/mediabrowser/AnchorViews$updateAnchors$$inlined$forEach$lambda$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            AnchorViews.a(this.this$0, false, this.$anchor);
        }
    }
}
