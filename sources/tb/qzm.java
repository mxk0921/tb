package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qzm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f27022a;

    static {
        t2o.a(768606222);
    }

    public qzm(String str, int i, byte[] bArr) {
        this.f27022a = bArr;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
        }
        byte[] bArr = this.f27022a;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }
}
