package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class o5q implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f25154a;
    public final /* synthetic */ IrpParamModel b;

    public o5q(Context context, IrpParamModel irpParamModel) {
        this.f25154a = context;
        this.b = irpParamModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        o4w.a();
        nmj.e(this.f25154a, this.b);
    }
}
