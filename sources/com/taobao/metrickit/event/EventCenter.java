package com.taobao.metrickit.event;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.event.lifecycle.LifecycleEventSource;
import com.taobao.metrickit.event.system.PowerConnectEventSource;
import com.taobao.metrickit.event.system.PowerSaveModeEventSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.dli;
import tb.dyo;
import tb.eti;
import tb.f3r;
import tb.hch;
import tb.kbp;
import tb.l1r;
import tb.lgg;
import tb.lj0;
import tb.m3l;
import tb.mti;
import tb.n3c;
import tb.njm;
import tb.ol8;
import tb.pl8;
import tb.qf2;
import tb.qjm;
import tb.r07;
import tb.r92;
import tb.sf4;
import tb.the;
import tb.tw4;
import tb.uf2;
import tb.vf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class EventCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ALARM_MANAGER_SET = 24;
    public static final int EVENT_ALARM_MANAGER_SET_REPEATING = 23;
    public static final int EVENT_APM_LAUNCH_COMPLETED = 6;
    public static final int EVENT_BG_2_FG = 0;
    public static final int EVENT_BLOCK_STACK = 94;
    public static final int EVENT_BLUETOOTH_ADAPTER_CANCEL_DISCOVERY = 26;
    public static final int EVENT_BLUETOOTH_ADAPTER_START_DISCOVERY = 25;
    public static final int EVENT_BLUETOOTH_ADAPTER_START_LE_SCAN = 27;
    public static final int EVENT_BLUETOOTH_ADAPTER_STOP_LE_SCAN = 28;
    public static final int EVENT_CONFIG_CHANGE = 3;
    public static final int EVENT_CPU_HIGH_LOAD = 80;
    public static final int EVENT_CPU_LOAD = 81;
    public static final int EVENT_DEFAULT = -1;
    public static final int EVENT_FG_2_BG = 1;
    public static final int EVENT_FIRST_FRAME = 7;
    public static final int EVENT_FOR_IN_BACKGROUND = 2;
    public static final int EVENT_HONOR_KILLED = 61;
    public static final int EVENT_HONOR_POWER_THERMAL_BASIC_ELEMENT = 40;
    public static final int EVENT_HONOR_POWER_THERMAL_CPU = 41;
    public static final int EVENT_HONOR_POWER_THERMAL_NETWORK = 42;
    public static final int EVENT_HONOR_PRESSURE_CPU = 50;
    public static final int EVENT_HONOR_PRESSURE_IO = 51;
    public static final int EVENT_HONOR_PRESSURE_MEMORY = 52;
    public static final int EVENT_HONOR_PRESSURE_TEMPERATURE = 53;
    public static final int EVENT_HONOR_PRESSURE_TEMPERATURE_RISE = 54;
    public static final int EVENT_HONOR_STABILITY_ANR = 59;
    public static final int EVENT_HONOR_STABILITY_TOMBSTONE = 60;
    public static final int EVENT_LAUNCHER_IDLE = 16;
    public static final int EVENT_LAUNCH_INTERACTIVE = 17;
    public static final int EVENT_LE_PROXY_START_SCAN = 31;
    public static final int EVENT_LE_PROXY_STOP_SCAN = 32;
    public static final int EVENT_LIFECYCLE = 4;
    public static final int EVENT_LOCATION_REMOVE_UPDATES = 30;
    public static final int EVENT_MEMORY_COLLECTED = 15;
    public static final int EVENT_METRICKIT_LAUNCH_FINISH = 8;
    public static final int EVENT_POWER_CONNECTED = 90;
    public static final int EVENT_POWER_CONSUME = 95;
    public static final int EVENT_POWER_DISCONNECTED = 91;
    public static final int EVENT_POWER_MANAGER_ACQUIRE = 19;
    public static final int EVENT_POWER_MANAGER_NEW_WAKE_LOCK = 18;
    public static final int EVENT_POWER_MANAGER_RELEASE = 20;
    public static final int EVENT_POWER_SAVE_MODE_OFF = 93;
    public static final int EVENT_POWER_SAVE_MODE_ON = 92;
    public static final int EVENT_REQUEST_LOCATION_UPDATES = 29;
    public static final int EVENT_SCROLL_END = 12;
    public static final int EVENT_SCROLL_FRAME_MONITOR_CANCEL = 10;
    public static final int EVENT_SCROLL_FRAME_START = 9;
    public static final int EVENT_SCROLL_START = 11;
    public static final int EVENT_SENSOR_MANAGER_REGISTER = 21;
    public static final int EVENT_SENSOR_MANAGER_UNREGISTER = 22;
    public static final int EVENT_SYSTEM_LOW_MEMORY = 13;
    public static final int EVENT_SYSTEM_TRIM_MEMORY = 14;
    public static final EventCenter b = new EventCenter();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, pl8> f11037a = new HashMap();

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface EventType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements n3c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eti.a f11038a;

        public a(EventCenter eventCenter, eti.a aVar) {
            this.f11038a = aVar;
        }

        @Override // tb.n3c
        public void onEvent(int i, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f16fb524", new Object[]{this, new Integer(i), map});
            } else {
                this.f11038a.onEvent(i, map);
            }
        }
    }

    public EventCenter() {
        Handler b2 = mti.c().b();
        a(new sf4(b2));
        a(new LifecycleEventSource(b2));
        a(new r92(b2));
        a(new dyo());
        a(new f3r(b2));
        a(new lgg(b2));
        lj0 lj0Var = new lj0(b2);
        if (!l1r.h(l1r.SWITCH_ALARM_MANAGER_PROXY_EVENT)) {
            a(lj0Var);
        }
        qjm qjmVar = new qjm(b2);
        if (!l1r.h(l1r.SWITCH_POWER_MANAGER_PROXY_EVENT)) {
            a(qjmVar);
        }
        kbp kbpVar = new kbp(b2);
        if (!l1r.h(l1r.SWITCH_SENSOR_MANAGER_PROXY_EVENT)) {
            a(kbpVar);
        }
        uf2 uf2Var = new uf2(b2);
        if (!l1r.h(l1r.SWITCH_BLUETOOTH_ADAPTER_PROXY_EVENT)) {
            a(uf2Var);
        }
        hch hchVar = new hch(b2);
        if (!l1r.h(l1r.SWITCH_LOCATION_MANAGER_PROXY_EVENT)) {
            a(hchVar);
        }
        vf2 vf2Var = new vf2(b2);
        if (!l1r.h(l1r.SWITCH_BLUETOOTH_LE_SCANNER_PROXY_EVENT)) {
            a(vf2Var);
        }
        a(new PowerConnectEventSource(b2));
        a(new PowerSaveModeEventSource(b2));
        a(new qf2(b2));
        a(new m3l(new int[]{16}, the.class, b2));
        a(new m3l(new int[]{15}, dli.class, b2));
        a(new m3l(new int[]{80, 81}, tw4.class, b2));
        a(new m3l(new int[]{95}, njm.class, b2));
        a(new m3l(new int[]{54}, "com.taobao.metrickit.honor.processor.pressure.TemperatureRiseProcessor", b2));
    }

    public static String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34ffce3d", new Object[]{new Integer(i)});
        }
        if (i == -1) {
            return "EVENT_DEFAULT";
        }
        if (i == 0) {
            return "EVENT_BG_2_FG";
        }
        if (i == 1) {
            return "EVENT_FG_2_BG";
        }
        if (i == 2) {
            return "EVENT_FOR_IN_BACKGROUND";
        }
        if (i == 4) {
            return "EVENT_LIFECYCLE";
        }
        if (i == 80) {
            return "EVENT_CPU_HIGH_LOAD";
        }
        if (i == 81) {
            return "EVENT_CPU_LOAD";
        }
        switch (i) {
            case 6:
                return "EVENT_APM_LAUNCH_COMPLETED";
            case 7:
                return "EVENT_FIRST_FRAME";
            case 8:
                return "EVENT_METRICKIT_LAUNCH_FINISH";
            case 9:
                return "EVENT_SCROLL_FRAME_START";
            case 10:
                return "EVENT_SCROLL_FRAME_MONITOR_CANCEL";
            case 11:
                return "EVENT_SCROLL_START";
            case 12:
                return "EVENT_SCROLL_END";
            case 13:
                return "EVENT_SYSTEM_LOW_MEMORY";
            case 14:
                return "EVENT_SYSTEM_TRIM_MEMORY";
            case 15:
                return "EVENT_MEMORY_COLLECTED";
            case 16:
                return "EVENT_LAUNCHER_IDLE";
            case 17:
                return "EVENT_LAUNCH_INTERACTIVE";
            case 18:
                return "EVENT_POWER_MANAGER_NEW_WAKE_LOCK";
            case 19:
                return "EVENT_POWER_MANAGER_ACQUIRE";
            case 20:
                return "EVENT_POWER_MANAGER_RELEASE";
            case 21:
                return "EVENT_SENSOR_MANAGER_REGISTER";
            case 22:
                return "EVENT_SENSOR_MANAGER_REGISTER_MULTI";
            case 23:
                return "EVENT_ALARM_MANAGER_SET_REPEATING";
            case 24:
                return "EVENT_ALARM_MANAGER_SET";
            case 25:
                return "EVENT_BLUETOOTH_ADAPTER_START_DISCOVERY";
            case 26:
                return "EVENT_BLUETOOTH_ADAPTER_CANCEL_DISCOVERY";
            case 27:
                return "EVENT_BLUETOOTH_ADAPTER_START_LE_SCAN";
            case 28:
                return "EVENT_BLUETOOTH_ADAPTER_STOP_LE_SCAN";
            case 29:
                return "EVENT_REQUEST_LOCATION_UPDATES";
            case 30:
                return "EVENT_LOCATION_REMOVE_UPDATES";
            case 31:
                return "EVENT_LE_PROXY_START_SCAN";
            case 32:
                return "EVENT_LE_PROXY_STOP_SCAN";
            default:
                switch (i) {
                    case 40:
                        return "EVENT_HONOR_POWER_THERMAL";
                    case 41:
                        return "EVENT_HONOR_POWER_THERMAL_CPU";
                    case 42:
                        return "EVENT_HONOR_POWER_THERMAL_NETWORK";
                    default:
                        switch (i) {
                            case 50:
                                return "EVENT_HONOR_PRESSURE_CPU";
                            case 51:
                                return "EVENT_HONOR_PRESSURE_IO";
                            case 52:
                                return "EVENT_HONOR_PRESSURE_Memory";
                            case 53:
                                return "EVENT_HONOR_PRESSURE_TEMPERATURE";
                            case 54:
                                return "EVENT_HONOR_PRESSURE_TEMPERATURE_RISE";
                            default:
                                switch (i) {
                                    case 59:
                                        return "EVENT_HONOR_STABILITY_ANR";
                                    case 60:
                                        return "EVENT_HONOR_STABILITY_TOMBSTONE";
                                    case 61:
                                        return "EVENT_HONOR_KILLED";
                                    default:
                                        switch (i) {
                                            case 90:
                                                return "EVENT_POWER_CONNECTED";
                                            case 91:
                                                return "EVENT_POWER_DISCONNECTED";
                                            case 92:
                                                return "EVENT_POWER_SAVE_MODE_ON";
                                            case 93:
                                                return "EVENT_POWER_SAVE_MODE_OFF";
                                            case 94:
                                                return "EVENT_MSG_BLOCK";
                                            case 95:
                                                return "EVENT_POWER_CONSUME";
                                            default:
                                                return "EVENT_ERROR_PARSE";
                                        }
                                }
                        }
                }
        }
    }

    public static EventCenter f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventCenter) ipChange.ipc$dispatch("83e0ff35", new Object[0]);
        }
        return b;
    }

    public final void a(ol8 ol8Var) {
        int[] l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4537b0e4", new Object[]{this, ol8Var});
            return;
        }
        for (int i : ol8Var.l()) {
            if (this.f11037a.get(Integer.valueOf(i)) == null) {
                this.f11037a.put(Integer.valueOf(i), new pl8(i, ol8Var));
            }
        }
    }

    public void b(int i, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe787286", new Object[]{this, new Integer(i), n3cVar});
        } else {
            g(i).a(n3cVar);
        }
    }

    public void c(int i, eti.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ac4090", new Object[]{this, new Integer(i), aVar});
        } else {
            b(i, new a(this, aVar));
        }
    }

    public void d(int[] iArr, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ccdc1f", new Object[]{this, iArr, n3cVar});
            return;
        }
        for (int i : iArr) {
            b(i, n3cVar);
        }
    }

    public pl8 g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pl8) ipChange.ipc$dispatch("522b628c", new Object[]{this, new Integer(i)});
        }
        pl8 pl8Var = (pl8) ((HashMap) this.f11037a).get(Integer.valueOf(i));
        if (pl8Var == null) {
            return new pl8(-1, new r07(mti.c().b()));
        }
        return pl8Var;
    }

    public m3l h(Object obj) {
        Class<?> u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m3l) ipChange.ipc$dispatch("c23547f1", new Object[]{this, obj});
        }
        for (pl8 pl8Var : ((HashMap) this.f11037a).values()) {
            if ((pl8Var.b() instanceof m3l) && (u = ((m3l) pl8Var.b()).u()) != null && u.isInstance(obj)) {
                return (m3l) pl8Var.b();
            }
        }
        return new m3l(new int[]{-1}, obj.getClass(), mti.c().b());
    }

    public void i(int i, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7ced69", new Object[]{this, new Integer(i), n3cVar});
        } else {
            g(i).d(n3cVar);
        }
    }

    public void j(int[] iArr, n3c n3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857bd9c", new Object[]{this, iArr, n3cVar});
            return;
        }
        for (int i : iArr) {
            i(i, n3cVar);
        }
    }

    public void k(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6229046", new Object[]{this, metricContext});
            return;
        }
        Iterator it = new HashSet(((HashMap) this.f11037a).values()).iterator();
        while (it.hasNext()) {
            ((pl8) it.next()).c(metricContext);
        }
    }

    public void l(ol8 ol8Var, MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9054c71", new Object[]{this, ol8Var, metricContext});
            return;
        }
        a(ol8Var);
        for (int i : ol8Var.l()) {
            pl8 pl8Var = (pl8) ((HashMap) this.f11037a).get(Integer.valueOf(i));
            if (pl8Var != null) {
                pl8Var.c(metricContext);
            }
        }
    }
}
