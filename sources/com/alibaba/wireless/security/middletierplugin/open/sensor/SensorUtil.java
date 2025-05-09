package com.alibaba.wireless.security.middletierplugin.open.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;

/* loaded from: classes.dex */
public class SensorUtil {

    /* renamed from: а  reason: contains not printable characters */
    static ISecurityGuardPlugin f236 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static final int f237 = 100;

    /* renamed from: г  reason: contains not printable characters */
    static int f239;

    /* renamed from: в  reason: contains not printable characters */
    private static SensorEventWrapper[] f238 = new SensorEventWrapper[100];

    /* renamed from: д  reason: contains not printable characters */
    static SensorEventListener f240 = new C0143();

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.sensor.SensorUtil$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0143 implements SensorEventListener {
        C0143() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            if (!(sensorEvent == null || (fArr = sensorEvent.values) == null || sensorEvent.sensor == null || fArr.length == 0 || SensorUtil.f239 >= 100)) {
                if (SensorUtil.f238[SensorUtil.f239] == null || SensorUtil.f238[SensorUtil.f239].values == null || sensorEvent.values.length > SensorUtil.f238[SensorUtil.f239].values.length) {
                    SensorUtil.f238[SensorUtil.f239] = new SensorEventWrapper(sensorEvent.values.length);
                }
                SensorUtil.f238[SensorUtil.f239].accuracy = sensorEvent.accuracy;
                SensorUtil.f238[SensorUtil.f239].sensorType = sensorEvent.sensor.getType();
                SensorUtil.f238[SensorUtil.f239].timestamp = sensorEvent.timestamp;
                for (int i = 0; i < sensorEvent.values.length && i < SensorUtil.f238[SensorUtil.f239].values.length; i++) {
                    SensorUtil.f238[SensorUtil.f239].values[i] = sensorEvent.values[i];
                }
                int i2 = SensorUtil.f239 + 1;
                SensorUtil.f239 = i2;
                if (i2 == 100) {
                    try {
                        SensorUtil.f236.getRouter().doCommand(70603, 100, SensorUtil.f238);
                    } catch (Exception unused) {
                    }
                    SensorUtil.f239 = 0;
                }
            }
        }
    }

    public static SensorEventListener getListener() {
        return f240;
    }

    public static void init(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f236 = iSecurityGuardPlugin;
    }
}
