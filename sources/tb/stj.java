package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;
import tb.ts1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class stj implements vxx<ikl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<ts1> f28263a = new SparseArray<>();

    static {
        t2o.a(628097134);
        t2o.a(628097383);
    }

    public static void b(ts1 ts1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54de62ea", new Object[]{ts1Var});
        } else {
            f28263a.put(ts1Var.l(), ts1Var);
        }
    }

    public static ts1 c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ts1) ipChange.ipc$dispatch("1161c2e6", new Object[]{new Integer(i)});
        }
        ts1 ts1Var = f28263a.get(i);
        if (!p2j.g() || ts1Var != null) {
            return ts1Var;
        }
        throw new Error("connection " + i + " not bind");
    }

    public static <T> void d(int i, ts1.f<List<ikl>, T> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff96440", new Object[]{new Integer(i), fVar});
            return;
        }
        ts1 c = c(i);
        if (c != null) {
            c.i(fVar);
        }
    }

    public static <R> void e(int i, ts1.g<ts1.h<R>, List<ikl>> gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853d06f4", new Object[]{new Integer(i), gVar});
            return;
        }
        ts1 c = c(i);
        if (c != null) {
            c.j(gVar);
        }
    }

    /* renamed from: a */
    public void accept(ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52d87ce", new Object[]{this, iklVar});
            return;
        }
        ts1 c = c(iklVar.k);
        MsgLog.e("NetworkManager", "UpStream >", Integer.valueOf(iklVar.k));
        if (c != null) {
            c.h(iklVar);
        } else {
            MsgLog.g("NetworkManager", "Connection", Integer.valueOf(iklVar.k), "not found");
        }
    }
}
