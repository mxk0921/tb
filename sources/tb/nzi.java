package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static nzi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nzi) ipChange.ipc$dispatch("dc9e2178", new Object[0]);
        }
        return new nzi();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207f96ba", new Object[]{this});
            return;
        }
        t0s t0sVar = new t0s();
        yyi b = l1s.c().b();
        l1s.c().d(t0sVar);
        if (b instanceof u0s) {
            ((u0s) b).b(new izi(t0sVar));
        }
    }
}
