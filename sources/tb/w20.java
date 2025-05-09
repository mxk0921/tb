package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596350);
        t2o.a(444596356);
    }

    public byte[] a(byte[] bArr, tfw tfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f185ae49", new Object[]{this, bArr, tfwVar});
        }
        return bArr;
    }
}
