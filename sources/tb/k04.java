package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class k04<CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract CollectResult a(int i, Map<String, ?> map);

    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4c7c910", new Object[]{this});
        }
        return new int[0];
    }

    public abstract void c();

    public void d(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa642358", new Object[]{this, new Integer(i), map});
        }
    }
}
