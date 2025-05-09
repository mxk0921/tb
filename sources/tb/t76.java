package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f28534a = 0.0f;
    public final String b = "";
    public final String c = "";

    static {
        t2o.a(444596518);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "\n load=0.0\n parser=0.0\n measure=0.0\n layout=0.0\n flatten=0.0\n render=0.0\n countTime=" + this.f28534a + "\n createViewInfo(createCount 0 reuseCount 0) " + this.b + "\n renderViewInfo" + this.c + "\n isHitCache=false";
    }
}
