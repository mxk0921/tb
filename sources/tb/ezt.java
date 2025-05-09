package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ezt extends y4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ezt(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(ezt eztVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/recommend/service/invoker/TmgRecPullDownRefreshInvoker");
    }

    @Override // tb.y4n, tb.hed
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
