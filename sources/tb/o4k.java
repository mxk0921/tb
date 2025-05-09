package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.device.IDeviceService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import tb.o4k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o4k implements o6d, yid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f25140a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final FluidContext c;
    public BroadcastReceiver d;
    public boolean e;

    static {
        t2o.a(468714378);
        t2o.a(468714445);
        t2o.a(468714139);
    }

    public o4k(FluidContext fluidContext) {
        this.c = fluidContext;
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        ((IContainerService) fluidContext.getService(IContainerService.class)).addRenderLifecycleListener(this);
        this.f25140a = fluidContext.getContext();
    }

    public static /* synthetic */ boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fe40835", new Object[]{context})).booleanValue();
        }
        return r(context);
    }

    public static /* synthetic */ void k(o4k o4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c8b73e", new Object[]{o4kVar});
        } else {
            o4kVar.t();
        }
    }

    public static /* synthetic */ void l(o4k o4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf46a7f", new Object[]{o4kVar});
        } else {
            o4kVar.s();
        }
    }

    public static /* synthetic */ void m(o4k o4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60201dc0", new Object[]{o4kVar});
        } else {
            o4kVar.u();
        }
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    @Override // tb.yid
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63456940", new Object[]{this});
        }
    }

    @Override // tb.yid
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a60635", new Object[]{this});
        } else {
            o();
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.b.removeMessages(0);
        u();
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.e) {
            this.e = true;
            this.b.postDelayed(new n4k(this), 1000L);
        }
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            n();
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac7ea03", new Object[]{this});
        } else {
            this.d = new BroadcastReceiver() { // from class: com.taobao.android.fluid.framework.device.wifi.NoWifiTipHelper$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(NoWifiTipHelper$2 noWifiTipHelper$2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/device/wifi/NoWifiTipHelper$2");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            i = activeNetworkInfo.getType();
                        } else {
                            i = -1;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && i == 0) {
                            o4k.k(o4k.this);
                            o4k.m(o4k.this);
                        }
                    }
                }
            };
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd610a1", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        BroadcastReceiver broadcastReceiver = this.d;
        if (broadcastReceiver == null) {
            p();
        } else {
            try {
                this.f25140a.unregisterReceiver(broadcastReceiver);
            } catch (Throwable th) {
                FluidException.throwException(this.c, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR, th);
            }
        }
        try {
            this.f25140a.registerReceiver(this.d, intentFilter);
        } catch (Throwable th2) {
            FluidException.throwException(this.c, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_REGISTER_ERROR, th2);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472aaa68", new Object[]{this});
            return;
        }
        try {
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                this.f25140a.unregisterReceiver(broadcastReceiver);
                this.d = null;
            }
        } catch (Throwable th) {
            FluidException.throwException(this.c, IDeviceService.ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR, th);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96af2e", new Object[]{this});
        } else if (!f && !uut.b(ono.c(this.f25140a, "fullscreen_no_wifi_tip_last_time"), System.currentTimeMillis())) {
            h1u.a(this.f25140a, "当前为非Wi-Fi环境，请注意流量消耗");
            f = true;
            ono.i(this.f25140a, "fullscreen_no_wifi_tip_last_time", System.currentTimeMillis());
        }
    }
}
