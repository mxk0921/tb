package com.loc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.taobao.adaemon.power.APower;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ey implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    SensorManager f5687a;
    Sensor b;
    Sensor c;
    Sensor d;
    private Context s;
    public boolean e = false;
    public double f = vu3.b.GEO_NOT_SUPPORT;
    public float g = 0.0f;
    private float t = 1013.25f;
    private float u = 0.0f;
    Handler h = new Handler();
    double i = vu3.b.GEO_NOT_SUPPORT;
    double j = vu3.b.GEO_NOT_SUPPORT;
    double k = vu3.b.GEO_NOT_SUPPORT;
    double l = vu3.b.GEO_NOT_SUPPORT;
    double[] m = new double[3];
    volatile double n = vu3.b.GEO_NOT_SUPPORT;
    long o = 0;
    long p = 0;
    final int q = 100;
    final int r = 30;

    public ey(Context context) {
        this.s = null;
        this.f5687a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        try {
            this.s = context;
            if (this.f5687a == null) {
                this.f5687a = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
            }
            try {
                this.b = this.f5687a.getDefaultSensor(6);
            } catch (Throwable unused) {
            }
            try {
                this.c = this.f5687a.getDefaultSensor(11);
            } catch (Throwable unused2) {
            }
            try {
                this.d = this.f5687a.getDefaultSensor(1);
            } catch (Throwable unused3) {
            }
        } catch (Throwable th) {
            fr.a(th, "AMapSensorManager", "<init>");
        }
    }

    public final void a() {
        SensorManager sensorManager = this.f5687a;
        if (sensorManager != null && !this.e) {
            this.e = true;
            try {
                Sensor sensor = this.b;
                if (sensor != null) {
                    sensorManager.registerListener(this, sensor, 3, this.h);
                }
            } catch (Throwable th) {
                fr.a(th, "AMapSensorManager", "registerListener mPressure");
            }
            try {
                Sensor sensor2 = this.c;
                if (sensor2 != null) {
                    this.f5687a.registerListener(this, sensor2, 3, this.h);
                }
            } catch (Throwable th2) {
                fr.a(th2, "AMapSensorManager", "registerListener mRotationVector");
            }
            try {
                Sensor sensor3 = this.d;
                if (sensor3 != null) {
                    this.f5687a.registerListener(this, sensor3, 3, this.h);
                }
            } catch (Throwable th3) {
                fr.a(th3, "AMapSensorManager", "registerListener mAcceleroMeterVector");
            }
        }
    }

    public final void b() {
        SensorManager sensorManager = this.f5687a;
        if (sensorManager != null && this.e) {
            this.e = false;
            try {
                Sensor sensor = this.b;
                if (sensor != null) {
                    sensorManager.unregisterListener(this, sensor);
                }
            } catch (Throwable unused) {
            }
            try {
                Sensor sensor2 = this.c;
                if (sensor2 != null) {
                    this.f5687a.unregisterListener(this, sensor2);
                }
            } catch (Throwable unused2) {
            }
            try {
                Sensor sensor3 = this.d;
                if (sensor3 != null) {
                    this.f5687a.unregisterListener(this, sensor3);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    public final double c() {
        return this.f;
    }

    public final float d() {
        return this.u;
    }

    public final double e() {
        return this.l;
    }

    public final void f() {
        try {
            b();
            this.b = null;
            this.c = null;
            this.f5687a = null;
            this.d = null;
            this.e = false;
        } catch (Throwable th) {
            fr.a(th, "AMapSensorManager", "destroy");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            try {
                int type = sensorEvent.sensor.getType();
                if (type != 1) {
                    if (type == 6) {
                        try {
                            if (this.b != null) {
                                float[] fArr = (float[]) sensorEvent.values.clone();
                                this.g = fArr[0];
                                b(fArr);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (type == 11) {
                        try {
                            if (this.c != null) {
                                c((float[]) sensorEvent.values.clone());
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } else if (this.d != null) {
                    a((float[]) sensorEvent.values.clone());
                }
            } catch (Throwable unused3) {
            }
        }
    }

    private void a(float[] fArr) {
        double[] dArr = this.m;
        float f = fArr[0];
        double d = (dArr[0] * 0.800000011920929d) + (f * 0.19999999f);
        dArr[0] = d;
        float f2 = fArr[1];
        double d2 = (dArr[1] * 0.800000011920929d) + (f2 * 0.19999999f);
        dArr[1] = d2;
        float f3 = fArr[2];
        double d3 = (dArr[2] * 0.800000011920929d) + (0.19999999f * f3);
        dArr[2] = d3;
        this.i = f - d;
        this.j = f2 - d2;
        this.k = f3 - d3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.o >= 100) {
            double d4 = this.i;
            double d5 = this.j;
            double d6 = (d4 * d4) + (d5 * d5);
            double d7 = this.k;
            double sqrt = Math.sqrt(d6 + (d7 * d7));
            this.p++;
            this.o = currentTimeMillis;
            this.n += sqrt;
            if (this.p >= 30) {
                this.l = this.n / this.p;
                this.n = vu3.b.GEO_NOT_SUPPORT;
                this.p = 0L;
            }
        }
    }

    private void b(float[] fArr) {
        if (fArr != null) {
            this.f = fy.a(SensorManager.getAltitude(this.t, fArr[0]));
        }
    }

    private void c(float[] fArr) {
        if (fArr != null) {
            float[] fArr2 = new float[9];
            SensorManager.getRotationMatrixFromVector(fArr2, fArr);
            float[] fArr3 = new float[3];
            SensorManager.getOrientation(fArr2, fArr3);
            float degrees = (float) Math.toDegrees(fArr3[0]);
            this.u = degrees;
            if (degrees <= 0.0f) {
                degrees += 360.0f;
            }
            this.u = (float) Math.floor(degrees);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
