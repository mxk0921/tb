package tb;

import android.content.Context;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.data.battery.BatteryInfoReceiver;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class k52 implements ApplicationBackgroundChangedDispatcher.b, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean c;
    private static BatteryInfoReceiver d;

    /* renamed from: a  reason: collision with root package name */
    private final s52 f22402a = new s52(false, "BgFgRecord");
    private final s52 b = new s52(false, "BgTickRecord");

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (!c && context != null && o48.o && !nca.b) {
            c = true;
            BatteryInfoReceiver batteryInfoReceiver = new BatteryInfoReceiver(context);
            d = batteryInfoReceiver;
            batteryInfoReceiver.c();
            zzb<?> b = yq7.b(ic.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
            if (b instanceof ApplicationBackgroundChangedDispatcher) {
                ((ApplicationBackgroundChangedDispatcher) b).addListener(new k52());
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ab83d7", new Object[]{this});
        } else {
            w9a.g().f().postDelayed(this, (long) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT);
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.b
    public void r(int i, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903f52fd", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        if (o48.o) {
            s52 s52Var = this.f22402a;
            if (i == 0) {
                str = "bg";
            } else {
                str = "fg";
            }
            s52Var.c(str);
        }
        if (!o48.o || i != 1) {
            w9a.g().f().removeCallbacks(this);
            return;
        }
        this.b.d();
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.b.c("bg");
        b();
    }
}
