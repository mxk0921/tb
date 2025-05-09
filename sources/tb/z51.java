package tb;

import android.app.Application;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.loopstartstopservice.impl.appdetector.ScreenOnOffReceiver;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z51 implements gsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ScreenOnOffReceiver f32547a;
    public final IMainFeedsLoopStartStopService.a b;

    static {
        t2o.a(486539544);
        t2o.a(486539555);
    }

    public z51(IMainFeedsLoopStartStopService.a aVar) {
        this.b = aVar;
    }

    @Override // tb.gsd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dceb4c", new Object[]{this});
        } else {
            d();
        }
    }

    @Override // tb.gsd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39afac", new Object[]{this});
        } else {
            c();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f15985", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 != null) {
            this.f32547a = new ScreenOnOffReceiver(this.b);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            a2.registerReceiver(this.f32547a, intentFilter);
        }
    }

    public final void d() {
        ScreenOnOffReceiver screenOnOffReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a72486fe", new Object[]{this});
            return;
        }
        Application a2 = eue.a();
        if (a2 != null && (screenOnOffReceiver = this.f32547a) != null) {
            try {
                a2.unregisterReceiver(screenOnOffReceiver);
            } catch (Throwable th) {
                fve.c("AppLevelStartStopDetectorImpl", "unRegisterScreenReceiver error: ", th);
            }
        }
    }

    @Override // tb.gsd
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        ScreenOnOffReceiver screenOnOffReceiver = this.f32547a;
        if (screenOnOffReceiver == null) {
            return true;
        }
        return screenOnOffReceiver.a();
    }
}
