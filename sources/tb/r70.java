package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class r70 implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f27157a;
    public final Sensor b;
    public final Sensor c;
    public float[] d;
    public float[] e;
    public boolean h;
    public boolean i;
    public final vi7 k;
    public final float[] f = new float[3];
    public final float[] g = new float[3];
    public boolean j = true;

    static {
        t2o.a(730857615);
    }

    public r70(Context context, vi7 vi7Var) {
        this.h = true;
        this.i = true;
        this.k = vi7Var;
        SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
        this.f27157a = sensorManager;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            this.b = defaultSensor;
            if (defaultSensor == null) {
                this.h = false;
            } else {
                try {
                    TLogTracker.f("CaptureSensor", "register accelerometerSensor", "sensor:" + defaultSensor.hashCode() + ", listener:" + this);
                    sensorManager.registerListener(this, defaultSensor, 3);
                } catch (Exception unused) {
                }
            }
            Sensor defaultSensor2 = this.f27157a.getDefaultSensor(4);
            this.c = defaultSensor2;
            if (defaultSensor2 == null) {
                this.i = false;
            } else {
                try {
                    TLogTracker.f("CaptureSensor", "register gyroscopeSensor", "sensor:" + defaultSensor2.hashCode() + ", listener:" + this);
                    this.f27157a.registerListener(this, defaultSensor2, 3);
                } catch (Exception unused2) {
                }
            }
            if (this.c == null && this.b == null) {
                vi7Var.onDeviceStable();
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f27157a != null) {
            if (this.b != null) {
                try {
                    TLogTracker.f("CaptureSensor", "unregister accelerometerSensor", "sensor:" + this.b.hashCode() + ", listener:" + this);
                    this.f27157a.unregisterListener(this, this.b);
                } catch (Exception unused) {
                }
            }
            if (this.c != null) {
                try {
                    TLogTracker.f("CaptureSensor", "unregister gyroscopeSensor", "sensor:" + this.c.hashCode() + ", listener:" + this);
                    this.f27157a.unregisterListener(this, this.c);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final void b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2c8d87b", new Object[]{this});
            return;
        }
        float[] fArr = this.f;
        if (fArr[0] > 0.3f || fArr[1] > 0.3f || fArr[2] > 0.5f) {
            z = true;
        }
        this.h = z;
        d();
    }

    public final void c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba99bd31", new Object[]{this});
            return;
        }
        float[] fArr = this.g;
        if (fArr[0] > 0.06f || fArr[1] > 0.06f || fArr[2] > 0.06f) {
            z = true;
        }
        this.i = z;
        d();
    }

    public final void d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7451cf", new Object[]{this});
            return;
        }
        if (this.h || this.i) {
            z = true;
        }
        if (z != this.j) {
            if (z) {
                this.k.onDeviceMove();
            } else {
                this.k.onDeviceStable();
            }
        }
        this.j = z;
    }

    public final void e(SensorEvent sensorEvent, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df2b3993", new Object[]{this, sensorEvent, fArr});
        } else {
            System.arraycopy(sensorEvent.values, 0, fArr, 0, fArr.length);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (this.d != null) {
                while (true) {
                    float[] fArr = sensorEvent.values;
                    if (i >= fArr.length) {
                        break;
                    }
                    this.f[i] = Math.abs(fArr[i] - this.d[i]);
                    i++;
                }
            } else {
                this.d = new float[3];
            }
            e(sensorEvent, this.d);
            b();
        } else if (type == 4) {
            if (this.e != null) {
                while (true) {
                    float[] fArr2 = sensorEvent.values;
                    if (i >= fArr2.length) {
                        break;
                    }
                    this.g[i] = Math.abs(fArr2[i] - this.e[i]);
                    i++;
                }
            } else {
                this.e = new float[3];
            }
            e(sensorEvent, this.e);
            c();
        }
    }
}
