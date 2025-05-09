package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g3l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final alc f19709a;

    static {
        t2o.a(779092139);
    }

    public g3l(alc alcVar) {
        this.f19709a = alcVar;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b0b86a", new Object[0])).booleanValue();
        }
        return akt.p2("enbleCleanScreenIntercept", true);
    }

    public boolean b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49acd09", new Object[]{this})).booleanValue();
        }
        if (this.f19709a.getViewParams().P() && this.f19709a.getViewParams().I()) {
            z = true;
        }
        tfs.g(a.TAG, "enableMoreLive:" + z);
        return z;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93f266a1", new Object[]{this})).booleanValue();
        }
        return akt.p2("enableReplayStatusShowLiveEnd", true) && TextUtils.equals("true", akt.G2("liveroom.hideReplay.enableHidePlay", "false"));
    }
}
