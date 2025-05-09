package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNImageProcess;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ss0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(482345012);
    }

    public static AliNNImageProcess.a a(float[] fArr, float[] fArr2, AliNNImageProcess.Format format) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNImageProcess.a) ipChange.ipc$dispatch("e271647c", new Object[]{fArr, fArr2, format});
        }
        AliNNImageProcess.a aVar = new AliNNImageProcess.a();
        aVar.c = AliNNImageProcess.Format.RGB;
        aVar.f6331a = fArr;
        aVar.b = fArr2;
        return aVar;
    }

    public static AliNNImageProcess.a b(float[] fArr, float[] fArr2, AliNNImageProcess.Format format, AliNNImageProcess.Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNImageProcess.a) ipChange.ipc$dispatch("b70eaf4c", new Object[]{fArr, fArr2, format, filter});
        }
        AliNNImageProcess.a aVar = new AliNNImageProcess.a();
        aVar.c = AliNNImageProcess.Format.RGB;
        aVar.f6331a = fArr;
        aVar.b = fArr2;
        aVar.d = filter;
        return aVar;
    }
}
