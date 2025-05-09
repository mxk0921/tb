package com.taobao.monitor.impl.data.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.c;
import tb.ic;
import tb.l52;
import tb.m09;
import tb.nca;
import tb.out;
import tb.s52;
import tb.w9a;
import tb.yq7;
import tb.zq6;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BatteryInfoReceiver extends BroadcastReceiver implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "BatteryInfoReceiver";

    /* renamed from: a  reason: collision with root package name */
    private boolean f11083a = false;
    private final Context b;
    private c c;
    private s52 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Intent f11084a;

        public a(Intent intent) {
            this.f11084a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BatteryInfoReceiver batteryInfoReceiver = BatteryInfoReceiver.this;
            batteryInfoReceiver.onReceive(BatteryInfoReceiver.a(batteryInfoReceiver), this.f11084a);
        }
    }

    public BatteryInfoReceiver(Context context) {
        this.b = context;
        zzb<?> b = yq7.b(ic.BATTERY_DISPATCHER);
        if (b instanceof c) {
            this.c = (c) b;
        }
    }

    public static /* synthetic */ Context a(BatteryInfoReceiver batteryInfoReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7051be34", new Object[]{batteryInfoReceiver});
        }
        return batteryInfoReceiver.b;
    }

    private void b(float f) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e14a703", new Object[]{this, new Float(f)});
            return;
        }
        if (this.d == null && f >= 45.0f) {
            s52 s52Var = new s52(false, "highTemperature");
            this.d = s52Var;
            s52Var.d();
        }
        s52 s52Var2 = this.d;
        String str2 = "fg";
        if (s52Var2 != null && f < 40.0f) {
            if (nca.f24637a) {
                str = "bg";
            } else {
                str = str2;
            }
            s52Var2.c(str);
            this.d = null;
        }
        if (this.d != null && out.a() - this.d.b() > 60000) {
            s52 s52Var3 = this.d;
            if (nca.f24637a) {
                str2 = "bg";
            }
            s52Var3.c(str2);
        }
    }

    public static /* synthetic */ Object ipc$super(BatteryInfoReceiver batteryInfoReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/monitor/impl/data/battery/BatteryInfoReceiver");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else if (!this.f11083a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            Intent registerReceiver = this.b.registerReceiver(this, intentFilter, null, w9a.g().f());
            if (registerReceiver != null) {
                w9a.g().f().post(new a(registerReceiver));
            }
            this.f11083a = true;
            zq6.a(e, "BatteryInfoReceiver registerReceiver");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        w9a.g().f().removeCallbacks(this);
        this.b.unregisterReceiver(this);
        this.d = null;
        this.f11083a = false;
        zq6.a(e, "BatteryInfoReceiver unregisterReceiver");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Intent a2 = l52.a(this.b);
        if (a2 != null) {
            onReceive(this.b, a2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        Handler f = w9a.g().f();
        f.removeCallbacks(this);
        f.postDelayed(this, 20000L);
        if (!TextUtils.isEmpty(intent.getAction())) {
            String action = intent.getAction();
            action.hashCode();
            switch (action.hashCode()) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1538406691:
                    if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1454123155:
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    zq6.a(e, "Detect screen off.");
                    c cVar = this.c;
                    if (cVar != null) {
                        cVar.f("android.intent.action.SCREEN_OFF");
                        return;
                    }
                    return;
                case 1:
                    int intExtra = intent.getIntExtra("temperature", -1);
                    int intExtra2 = intent.getIntExtra(m09.TASK_TYPE_LEVEL, 0);
                    int intExtra3 = intent.getIntExtra("scale", 100);
                    int intExtra4 = intent.getIntExtra("plugged", 0);
                    int i = (intExtra2 * 100) / intExtra3;
                    zq6.a(e, "temperature", Integer.valueOf(intExtra), m09.TASK_TYPE_LEVEL, Integer.valueOf(intExtra2), "scale", Integer.valueOf(intExtra3), "plugged", Integer.valueOf(intExtra4), "health", Integer.valueOf(intent.getIntExtra("health", 1)), "status", Integer.valueOf(intent.getIntExtra("status", 1)), "voltage", Integer.valueOf(intent.getIntExtra("voltage", 0)));
                    c cVar2 = this.c;
                    if (cVar2 != null) {
                        cVar2.e(intExtra / 10.0f, intExtra4, i);
                    }
                    b(intExtra / 10.0f);
                    return;
                case 2:
                    zq6.a(e, "Detect screen on.");
                    c cVar3 = this.c;
                    if (cVar3 != null) {
                        cVar3.f("android.intent.action.SCREEN_ON");
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
