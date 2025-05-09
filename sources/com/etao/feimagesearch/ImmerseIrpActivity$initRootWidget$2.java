package com.etao.feimagesearch;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.imf;
import tb.v7m;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImmerseIrpActivity$initRootWidget$2 extends Lambda implements g1a<imf, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ImmerseIrpActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmerseIrpActivity$initRootWidget$2(ImmerseIrpActivity immerseIrpActivity) {
        super(1);
        this.this$0 = immerseIrpActivity;
    }

    public static /* synthetic */ Object ipc$super(ImmerseIrpActivity$initRootWidget$2 immerseIrpActivity$initRootWidget$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ImmerseIrpActivity$initRootWidget$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(imf imfVar) {
        invoke2(imfVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(imf imfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc834945", new Object[]{this, imfVar});
            return;
        }
        ckf.g(imfVar, AdvanceSetting.NETWORK_TYPE);
        ImmerseIrpActivity.n3(this.this$0, imfVar);
        int m3 = ImmerseIrpActivity.m3(this.this$0);
        if (m3 == 2) {
            imfVar.M();
        } else if (m3 == 3) {
            imfVar.L();
        } else if (m3 == 4) {
            imfVar.O();
        } else if (m3 == 5) {
            imfVar.K();
        }
        v7m l3 = ImmerseIrpActivity.l3(this.this$0);
        if (l3 != null) {
            l3.q(imfVar);
        } else {
            ckf.y("irpPipLine");
            throw null;
        }
    }
}
