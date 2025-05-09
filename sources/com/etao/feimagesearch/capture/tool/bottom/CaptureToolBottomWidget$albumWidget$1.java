package com.etao.feimagesearch.capture.tool.bottom;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.h73;
import tb.pei;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolBottomWidget$albumWidget$1 extends Lambda implements u1a<pei, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ CaptureToolBottomWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureToolBottomWidget$albumWidget$1(CaptureToolBottomWidget captureToolBottomWidget, Activity activity) {
        super(2);
        this.this$0 = captureToolBottomWidget;
        this.$activity = activity;
    }

    public static /* synthetic */ Object ipc$super(CaptureToolBottomWidget$albumWidget$1 captureToolBottomWidget$albumWidget$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/bottom/CaptureToolBottomWidget$albumWidget$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(pei peiVar, Boolean bool) {
        invoke(peiVar, bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb8deae", new Object[]{this, peiVar, new Boolean(z)});
        } else if (peiVar != null) {
            String str = this.this$0.s0().a().a().get("token");
            if (str == null || str.length() == 0) {
                this.$activity.finish();
                return;
            }
            h73 h73Var = h73.INSTANCE;
            String uri = peiVar.b().toString();
            ckf.f(uri, "item.genUri().toString()");
            h73Var.d(str, uri, peiVar.f());
            this.$activity.finish();
        }
    }
}
