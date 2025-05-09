package com.etao.feimagesearch.newresult.base;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.hmf;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpWidget$attachAIWidget$1 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IrpWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpWidget$attachAIWidget$1(IrpWidget irpWidget) {
        super(1);
        this.this$0 = irpWidget;
    }

    public static /* synthetic */ Object ipc$super(IrpWidget$attachAIWidget$1 irpWidget$attachAIWidget$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpWidget$attachAIWidget$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        hmf l0 = IrpWidget.l0(this.this$0);
        if (l0 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "showState", String.valueOf(z));
            xhv xhvVar = xhv.INSTANCE;
            l0.o0("notifyAIWidgetState", jSONObject);
            return;
        }
        ckf.y("hybridWidget");
        throw null;
    }
}
