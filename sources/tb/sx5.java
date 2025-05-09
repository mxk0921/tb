package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sx5 implements vvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<byte[]> f28333a;
    public final SparseArray<String> b;
    public final qwb c;

    static {
        t2o.a(444597910);
        t2o.a(444597917);
    }

    public sx5(SparseArray<byte[]> sparseArray, SparseArray<String> sparseArray2, int i, qwb qwbVar) {
        this.f28333a = sparseArray;
        this.b = sparseArray2;
        this.c = qwbVar;
    }

    @Override // tb.vvb
    public byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cff96e9c", new Object[]{this, new Integer(i)});
        }
        SparseArray<byte[]> sparseArray = this.f28333a;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    @Override // tb.vvb
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("913afbce", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // tb.vvb
    public String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4adcb34", new Object[]{this, new Integer(i)});
        }
        SparseArray<String> sparseArray = this.b;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i);
    }

    @Override // tb.vvb
    public qwb d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwb) ipChange.ipc$dispatch("63310e3f", new Object[]{this});
        }
        return this.c;
    }
}
