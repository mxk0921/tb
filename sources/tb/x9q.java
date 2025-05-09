package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.util.TBSoundPlayer;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x9q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(464519210);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dac8ad0", new Object[0]);
            return;
        }
        try {
            HashMap<Integer, String> configMap = TBSoundPlayer.getConfigMap();
            for (Integer num : configMap.keySet()) {
                TBSoundPlayer.getInstance().updateSound(num.intValue(), FestivalMgr.i().k(configMap.get(num)));
            }
        } catch (Throwable unused) {
        }
    }
}
