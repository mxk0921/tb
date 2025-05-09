package com.alibaba.one.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.taobao.adaemon.power.APower;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static SensorManager f2507a;
    private static Context b;

    public static String a() {
        List<Sensor> sensorList;
        Context context = b;
        String str = null;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
                if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                    StringBuilder sb = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb.append(sensor.getName());
                        sb.append(sensor.getVersion());
                        sb.append(sensor.getVendor());
                    }
                    str = d.a(sb.toString());
                }
            } catch (Exception unused) {
            }
        }
        return str == null ? "" : str;
    }

    public static void a(Context context) {
        if (context != null && f2507a == null) {
            try {
                b = context;
                f2507a = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
            } catch (Throwable unused) {
            }
        }
    }
}
