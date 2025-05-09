package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sxm implements ndd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sxm b = new sxm();

    /* renamed from: a  reason: collision with root package name */
    public ndd f28343a;

    @Override // tb.ndd
    public mdd a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("e3523269", new Object[]{this, str, cVar});
        }
        ndd nddVar = this.f28343a;
        if (nddVar == null) {
            return mdd.DEFAULT;
        }
        return nddVar.a(str, cVar);
    }

    public sxm b(ndd nddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sxm) ipChange.ipc$dispatch("dd9e1318", new Object[]{this, nddVar});
        }
        this.f28343a = nddVar;
        return this;
    }
}
