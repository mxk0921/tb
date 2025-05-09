package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.api.assets.CheckAssetsResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ad8 implements lid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lid INSTANCE = new ad8();

    @Override // tb.lid
    public w2l a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w2l) ipChange.ipc$dispatch("7df8ac43", new Object[]{this, str});
        }
        return new w2l(str, null, RSoException.error(1001));
    }

    @Override // tb.lid
    public CheckAssetsResult b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CheckAssetsResult) ipChange.ipc$dispatch("bc930abe", new Object[]{this, str});
        }
        return new CheckAssetsResult(str, 1);
    }
}
