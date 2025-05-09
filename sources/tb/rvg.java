package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rvg extends y4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public rvg(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(rvg rvgVar, String str, Object... objArr) {
        if (str.hashCode() == 606228094) {
            super.onPullRefresh();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/litetao/service/biz/sceneservice/LiteTaoPullDownRefreshInvoker");
    }

    @Override // tb.y4n, tb.hed
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.y4n, tb.hed
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
        } else {
            super.onPullRefresh();
        }
    }
}
