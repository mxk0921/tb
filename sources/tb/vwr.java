package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBSoundPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vwr implements mrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267955);
        t2o.a(503316600);
    }

    @Override // tb.mrd
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03f3a8c", new Object[]{this, str});
        } else {
            TBSoundPlayer.getInstance().play(str);
        }
    }

    @Override // tb.mrd
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cc4b74", new Object[]{this, new Integer(i)});
        } else {
            TBSoundPlayer.getInstance().playScene(i);
        }
    }
}
