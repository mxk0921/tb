package tb;

import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class snp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final snp INSTANCE = new snp();

    static {
        t2o.a(766510138);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ece0a5", new Object[]{this})).booleanValue();
        }
        return EVO.isSwitchOpened(Globals.getApplication(), "enableAsyncDataPrefetch");
    }
}
