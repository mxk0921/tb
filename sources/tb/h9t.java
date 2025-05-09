package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.zho;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h9t implements zho.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tmc f20489a;

    public h9t(Context context, tmc tmcVar) {
        this.f20489a = tmcVar;
    }

    public final dbn a(bu4 bu4Var, dbn dbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("6da62e82", new Object[]{this, bu4Var, dbnVar});
        }
        return new oa7(dbnVar, bu4Var.f16635a, bu4Var.d);
    }

    public dbn b(bu4 bu4Var, dbn dbnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dbn) ipChange.ipc$dispatch("26df4730", new Object[]{this, bu4Var, dbnVar});
        }
        return new whl(new nc1(a(bu4Var, dbnVar), bu4Var.f16635a), bu4Var.d, bu4Var.c);
    }
}
