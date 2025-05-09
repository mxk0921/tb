package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.TBSoundPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uwr implements lrd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(758120549);
        t2o.a(758120484);
    }

    @Override // tb.lrd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af10d91b", new Object[]{this});
        } else {
            TBSoundPlayer.getInstance().playScene(7);
        }
    }
}
