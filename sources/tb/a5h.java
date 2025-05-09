package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.model.TabModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a5h extends r12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092133);
    }

    public a5h(TabModel tabModel) {
        super(tabModel);
    }

    public static /* synthetic */ Object ipc$super(a5h a5hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveTabConfig");
    }

    @Override // tb.r12
    public boolean isEnableShareButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f82460ef", new Object[]{this})).booleanValue();
        }
        boolean e = d4s.e("enableTab2ShareButton", true);
        o3s.b("LiveTabConfig", "enableShareButtonOrange: " + e);
        if (!e) {
            return false;
        }
        boolean c = d4s.c("Tab2LiveShare", "enableTab2LiveShare", false);
        o3s.b("LiveTabConfig", "enableShareButtonABTest: " + c);
        return c;
    }
}
