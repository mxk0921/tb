package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zc8 implements fgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.fgd
    public void a(xan xanVar, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dd4cf", new Object[]{this, xanVar, rSoException});
        }
    }

    @Override // tb.fgd
    public void b(xan xanVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34782f22", new Object[]{this, xanVar, new Integer(i)});
        }
    }

    @Override // tb.fgd
    public void c(xan xanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a71c947", new Object[]{this, xanVar});
        }
    }
}
