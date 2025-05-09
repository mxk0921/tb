package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w64 extends cio {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(615514200);
    }

    public w64(String str, long j, String str2, String str3, ze4 ze4Var, List<x80> list, int i) {
        super(str, j, str2, str3, ze4Var, list, i);
    }

    public static /* synthetic */ Object ipc$super(w64 w64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/scene/engine/core/CommonRule");
    }

    @Override // tb.cio
    public boolean a(tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db23870d", new Object[]{this, tx8Var})).booleanValue();
        }
        if (o()) {
            return this.j.a(tx8Var);
        }
        idh.a("CommonRule", "Do not evaluate condition, not in sampling!");
        return false;
    }

    @Override // tb.cio
    public void b(tx8 tx8Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca98de5", new Object[]{this, tx8Var});
            return;
        }
        for (x80 x80Var : this.k) {
            if (x80Var.a()) {
                x80Var.c(tx8Var, this);
            } else {
                idh.a("CommonRule", "Action isSampling = false, rule: " + toString());
            }
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cfb3c", new Object[]{this})).booleanValue();
        }
        if (new Random().nextInt(10000) < this.e) {
            return true;
        }
        return false;
    }
}
