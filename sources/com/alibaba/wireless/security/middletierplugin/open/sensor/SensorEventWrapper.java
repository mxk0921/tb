package com.alibaba.wireless.security.middletierplugin.open.sensor;

/* loaded from: classes.dex */
public class SensorEventWrapper {
    public int accuracy;
    public int sensorType;
    public long timestamp;
    public float[] values;

    private SensorEventWrapper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SensorEventWrapper(int i) {
        this.values = new float[i];
    }
}
