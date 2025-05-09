package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ows extends yb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814213);
    }

    public static /* synthetic */ Object ipc$super(ows owsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolivehome/nav/TaoLiveHomepageProcessorNodeComponentFilterItem0");
    }

    @Override // tb.yb4, tb.xb4
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15c09d0", new Object[]{this, str})).booleanValue();
        }
        return str.equals(FlexaLiveX.TAO_LIVE_HOME_ACTIVITY);
    }

    @Override // tb.yb4, tb.xb4
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8cdc9e", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.taobao");
    }
}
