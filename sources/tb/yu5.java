package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yu5 implements lvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d433cca", new Object[]{new Integer(i)})).intValue();
        }
        float C = pb6.C(DinamicXEngine.x(), i);
        if (C < 12.0f) {
            return pb6.f(DinamicXEngine.x(), 15.0f);
        }
        if (C < 15.0f) {
            return pb6.f(DinamicXEngine.x(), 18.0f);
        }
        if (C < 18.0f) {
            return pb6.f(DinamicXEngine.x(), 21.0f);
        }
        if (C < 21.0f) {
            return pb6.f(DinamicXEngine.x(), 24.0f);
        }
        return pb6.f(DinamicXEngine.x(), 30.0f);
    }

    @Override // tb.lvb
    public float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1afaf708", new Object[]{this, new Float(f)})).floatValue();
        }
        return c((int) f);
    }
}
