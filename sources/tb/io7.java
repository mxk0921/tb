package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class io7 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DXRenderOptions f21477a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ cd5 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ DinamicXEngine f;

    public io7(DinamicXEngine dinamicXEngine, DXRenderOptions dXRenderOptions, List list, Context context, cd5 cd5Var, boolean z) {
        this.f = dinamicXEngine;
        this.f21477a = dXRenderOptions;
        this.b = list;
        this.c = context;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DXRenderOptions dXRenderOptions = this.f21477a;
        if (dXRenderOptions == null) {
            dXRenderOptions = fd5.m();
        }
        ArrayList arrayList = new ArrayList();
        for (uc5 uc5Var : this.b) {
            DinamicXEngine dinamicXEngine = this.f;
            Context context = this.c;
            uc5Var.getClass();
            arrayList.add(dinamicXEngine.m0(context, null, null, null, null, dXRenderOptions));
        }
        vc5 i = DinamicXEngine.i(this.f);
        DinamicXEngine dinamicXEngine2 = this.f;
        i.l(arrayList, dXRenderOptions, dinamicXEngine2.k, dinamicXEngine2.o, dinamicXEngine2.m, null, this.e);
    }
}
