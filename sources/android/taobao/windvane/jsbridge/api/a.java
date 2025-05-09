package android.taobao.windvane.jsbridge.api;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.taobao.windvane.jsbridge.api.WVMotion;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class a implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SensorManager f1818a;
    public AbstractC0011a b;
    public final Context c;
    public final long d;
    public float e;
    public float f;
    public float g;
    public long h;

    /* compiled from: Taobao */
    /* renamed from: android.taobao.windvane.jsbridge.api.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface AbstractC0011a {
    }

    static {
        t2o.a(989856244);
    }

    public a(Context context, long j) {
        this.c = context;
        this.d = j;
        d();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1818a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public void c(AbstractC0011a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cb239cc", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1818a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f1818a = null;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
        } else if (sensorEvent.sensor.getType() == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.h >= this.d) {
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float f4 = f - this.e;
                float f5 = f2 - this.f;
                float f6 = f3 - this.g;
                if (Math.sqrt((f4 * f4) + (f5 * f5) + (f6 * f6)) > 10.0d && this.b != null && Math.abs(this.e) > 0.0f && Math.abs(this.f) > 0.0f && Math.abs(this.g) > 0.0f) {
                    ((WVMotion.d) this.b).a();
                }
                this.h = currentTimeMillis;
                this.e = f;
                this.f = f2;
                this.g = f3;
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f1818a;
        if (sensorManager != null && !sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2)) {
            this.f1818a.unregisterListener(this);
            v7t.n("ShakeListener", "start: Accelerometer not supported");
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        SensorManager sensorManager = (SensorManager) this.c.getSystemService(APower.TYPE_SENSOR);
        this.f1818a = sensorManager;
        if (sensorManager == null) {
            v7t.n("ShakeListener", "start: Sensors not supported");
        } else if (!sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2)) {
            this.f1818a.unregisterListener(this);
            v7t.n("ShakeListener", "start: Accelerometer not supported");
        }
    }
}
