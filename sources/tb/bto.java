package tb;

import com.alibaba.poplayer.norm.ISceneFreqAdapter;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bto implements ISceneFreqAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(790626341);
        t2o.a(625999977);
    }

    @Override // com.alibaba.poplayer.norm.ISceneFreqAdapter
    public String getSceneFreqConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74350da9", new Object[]{this});
        }
        return a9l.w().p();
    }
}
