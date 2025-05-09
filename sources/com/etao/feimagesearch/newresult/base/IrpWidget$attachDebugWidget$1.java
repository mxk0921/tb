package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import tb.caa;
import tb.ckf;
import tb.d1a;
import tb.hmf;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpWidget$attachDebugWidget$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IrpWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IrpWidget$attachDebugWidget$1(IrpWidget irpWidget) {
        super(0);
        this.this$0 = irpWidget;
    }

    public static /* synthetic */ Object ipc$super(IrpWidget$attachDebugWidget$1 irpWidget$attachDebugWidget$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/base/IrpWidget$attachDebugWidget$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        hmf l0 = IrpWidget.l0(this.this$0);
        if (l0 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("nick", Login.getNick());
            linkedHashMap.put("utdid", UTDevice.getUtdid(caa.c()));
            xhv xhvVar = xhv.INSTANCE;
            l0.o0("irpContextUpload", linkedHashMap);
            return;
        }
        ckf.y("hybridWidget");
        throw null;
    }
}
