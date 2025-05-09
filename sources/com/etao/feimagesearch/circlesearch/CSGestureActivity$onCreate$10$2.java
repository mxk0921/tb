package com.etao.feimagesearch.circlesearch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.mzu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CSGestureActivity$onCreate$10$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CSGestureActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSGestureActivity$onCreate$10$2(CSGestureActivity cSGestureActivity) {
        super(0);
        this.this$0 = cSGestureActivity;
    }

    public static /* synthetic */ Object ipc$super(CSGestureActivity$onCreate$10$2 cSGestureActivity$onCreate$10$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/circlesearch/CSGestureActivity$onCreate$10$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        mzu.n("Page_CircleSearchMask", "illegalGesture", 2101, new String[0]);
        CSGestureActivity.l3(this.this$0);
    }
}
