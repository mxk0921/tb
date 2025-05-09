package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fmu implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ emu f19412a;

    public fmu(emu emuVar) {
        this.f19412a = emuVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        TrtcLog.j("OutputStream", "DataChannel send: " + emu.h(this.f19412a) + ", recv: " + emu.e(this.f19412a));
        emu emuVar = this.f19412a;
        emu.i(emuVar, emu.f(emuVar, 0));
        emu.l(this.f19412a).postDelayed(emu.k(this.f19412a), 5000L);
    }
}
