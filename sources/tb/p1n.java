package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p1n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097179);
    }

    public static byte[] a(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("24b7550e", new Object[]{cs6Var});
        }
        byte[] bArr = new byte[cs6Var.m];
        System.arraycopy(cs6Var.n, cs6.b(0, cs6Var) + 2, bArr, 0, cs6Var.m);
        return bArr;
    }

    public static byte[] b(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cb02c6c9", new Object[]{cs6Var});
        }
        byte[] bArr = new byte[cs6Var.l];
        System.arraycopy(cs6Var.n, cs6.c(0, cs6Var) + 2, bArr, 0, cs6Var.l);
        return bArr;
    }

    public static byte[] c(cs6 cs6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("354c3a07", new Object[]{cs6Var});
        }
        byte[] bArr = new byte[cs6Var.k];
        System.arraycopy(cs6Var.n, cs6.d(0) + 2, bArr, 0, cs6Var.k);
        return bArr;
    }
}
