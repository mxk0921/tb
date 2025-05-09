package com.etao.feimagesearch.circlesearch;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.mzu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CSGestureActivity$onCreate$10$3 extends Lambda implements g1a<RectF, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ CSGestureActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSGestureActivity$onCreate$10$3(CSGestureActivity cSGestureActivity) {
        super(1);
        this.this$0 = cSGestureActivity;
    }

    public static /* synthetic */ Object ipc$super(CSGestureActivity$onCreate$10$3 cSGestureActivity$onCreate$10$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/circlesearch/CSGestureActivity$onCreate$10$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(RectF rectF) {
        invoke2(rectF);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae3ddf10", new Object[]{this, rectF});
            return;
        }
        ckf.g(rectF, AdvanceSetting.NETWORK_TYPE);
        mzu.n("Page_CircleSearchMask", "circleCompleted", 2101, new String[0]);
        CSGestureActivity.s3(this.this$0, rectF);
    }
}
