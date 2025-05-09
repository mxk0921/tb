package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qbp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final qbp INSTANCE = new qbp();

    static {
        t2o.a(815793508);
    }

    @JvmStatic
    public static final Sensor a(Context context, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sensor) ipChange.ipc$dispatch("35d606c5", new Object[]{context, num});
        }
        if (context == null || num == null) {
            return null;
        }
        Object systemService = context.getApplicationContext().getSystemService(APower.TYPE_SENSOR);
        ckf.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getDefaultSensor(num.intValue());
    }

    @JvmStatic
    public static final void c(Context context, SensorEventListener sensorEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b8290b", new Object[]{context, sensorEventListener});
        } else if (context != null && sensorEventListener != null) {
            Object systemService = context.getApplicationContext().getSystemService(APower.TYPE_SENSOR);
            ckf.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            ((SensorManager) systemService).unregisterListener(sensorEventListener);
        }
    }

    @JvmStatic
    public static final boolean b(Context context, Integer num, m5p m5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8afd6b77", new Object[]{context, num, m5pVar})).booleanValue();
        }
        if (context == null || m5pVar == null) {
            return false;
        }
        Object systemService = context.getApplicationContext().getSystemService(APower.TYPE_SENSOR);
        ckf.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor a2 = a(context, num);
        if (a2 == null) {
            return false;
        }
        sensorManager.registerListener(m5pVar, a2, (int) m5pVar.a());
        return true;
    }
}
