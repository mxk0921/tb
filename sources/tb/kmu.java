package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.trtc.utils.TrtcLog;
import org.webrtc.ThreadUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kmu implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Runnable b;
    public final SensorManager c;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadUtils.ThreadChecker f22770a = new ThreadUtils.ThreadChecker();
    public Sensor d = null;
    public boolean e = false;

    static {
        t2o.a(395313469);
    }

    public kmu(Context context, Runnable runnable) {
        TrtcLog.j("TrtcProximitySensor", "TrtcProximitySensor" + cju.b());
        this.b = runnable;
        this.c = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
    }

    public static kmu a(Context context, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmu) ipChange.ipc$dispatch("44e34830", new Object[]{context, runnable});
        }
        return new kmu(context, runnable);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("829c9d36", new Object[]{this})).booleanValue();
        }
        if (this.d != null) {
            return true;
        }
        Sensor defaultSensor = this.c.getDefaultSensor(8);
        this.d = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        c();
        return true;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6561a8a", new Object[]{this});
        } else if (this.d != null) {
            TrtcLog.j("TrtcProximitySensor", "Proximity sensor: name=" + this.d.getName() + ", vendor: " + this.d.getVendor() + ", power: " + this.d.getPower() + ", resolution: " + this.d.getResolution() + ", max range: " + this.d.getMaximumRange() + ", min delay: " + this.d.getMinDelay() + ", type: " + this.d.getStringType() + ", max delay: " + this.d.getMaxDelay() + ", reporting mode: " + this.d.getReportingMode() + ", isWakeUpSensor: " + this.d.isWakeUpSensor());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cb130af", new Object[]{this})).booleanValue();
        }
        this.f22770a.checkIsOnValidThread();
        return this.e;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.f22770a.checkIsOnValidThread();
        TrtcLog.j("TrtcProximitySensor", "stop" + cju.b());
        Sensor sensor = this.d;
        if (sensor != null) {
            this.c.unregisterListener(this, sensor);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
            return;
        }
        this.f22770a.checkIsOnValidThread();
        if (sensor.getType() != 8) {
            z = false;
        }
        cju.a(z);
        if (i == 0) {
            TrtcLog.i("TrtcProximitySensor", "The values returned by this sensor cannot be trusted");
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("810347ed", new Object[]{this})).booleanValue();
        }
        this.f22770a.checkIsOnValidThread();
        TrtcLog.j("TrtcProximitySensor", "start" + cju.b());
        if (!b()) {
            return false;
        }
        this.c.registerListener(this, this.d, 3);
        return true;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        this.f22770a.checkIsOnValidThread();
        cju.a(sensorEvent.sensor.getType() == 8);
        if (sensorEvent.values[0] < this.d.getMaximumRange()) {
            TrtcLog.j("TrtcProximitySensor", "Proximity sensor => NEAR state");
            this.e = true;
        } else {
            TrtcLog.j("TrtcProximitySensor", "Proximity sensor => FAR state");
            this.e = false;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        TrtcLog.j("TrtcProximitySensor", "onSensorChanged" + cju.b() + ": accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }
}
