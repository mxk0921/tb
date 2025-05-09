package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.TaoLiveVideoActivity;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o7t implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f25193a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TaoLiveVideoActivity c;

    public o7t(TaoLiveVideoActivity taoLiveVideoActivity, boolean z, boolean z2) {
        this.c = taoLiveVideoActivity;
        this.f25193a = z;
        this.b = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("orangeSwitch", String.valueOf(this.f25193a));
        hashMap.put("wholeDeviceLevelSwitchOpt", String.valueOf(qvs.V0()));
        hashMap.put("!isBlackliveSource", String.valueOf(true ^ this.b));
        x5t.h(TaoLiveVideoActivity.G3(), hashMap.toString());
        rbu.Q(19999, "startUpSwitchStrUT", hashMap);
    }
}
