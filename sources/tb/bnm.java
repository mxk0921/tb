package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bnm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DEFAULT_HEALTHY_GAP = 1.0f;
    public static final float DEFAULT_HEALTH_BUFFER_LEVEL = 3.5f;
    public static final float DEFAULT_POOR_BUFFER_LEVEL = 3.0f;
    public static float e = 3.5f;
    public static float f = 3.0f;

    static {
        t2o.a(352321670);
    }

    public bnm() {
        e = 3.5f;
        f = 3.0f;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d371e90", new Object[]{this})).intValue();
        }
        float f2 = 0;
        return (int) (((1.0f * f2) / 100.0f) * f2);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d4e2f7", new Object[]{this})).booleanValue();
        }
        if (a() <= f * 1000.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreLoadHealthy{currentPosition=0, total=0, bufferPercent=0}";
    }
}
