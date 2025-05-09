package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nbp extends a74 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GravityObserver";
    public static nbp k = null;
    public Sensor g;
    public Sensor h;
    public long i = 0;
    public long j = 0;

    static {
        t2o.a(404750568);
    }

    public static /* synthetic */ Object ipc$super(nbp nbpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/SensorObserver");
    }

    public static nbp q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbp) ipChange.ipc$dispatch("251ee2f5", new Object[0]);
        }
        if (k == null) {
            synchronized (nbp.class) {
                try {
                    if (k == null) {
                        k = new nbp();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    @Override // tb.a74
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return v82.k("globalGravityTrackDelay", 10);
    }

    @Override // tb.a74
    public boolean d(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65847b62", new Object[]{this, sensorEvent})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (sensorEvent.sensor.getType() == 9 && currentTimeMillis - this.i < 300) {
            return true;
        }
        if (sensorEvent.sensor.getType() == 10 && currentTimeMillis - this.j < 200) {
            return true;
        }
        if (sensorEvent.sensor.getType() == 9) {
            this.i = currentTimeMillis;
        } else {
            this.j = currentTimeMillis;
        }
        return false;
    }

    @Override // tb.a74
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return v82.k("globalGravityTrackInterval", 30000);
    }

    @Override // tb.a74
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        return v82.k("globalGravityTrackInterval", 3000);
    }

    @Override // tb.a74
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dc951aa", new Object[]{this});
            return;
        }
        this.g = this.f15579a.getDefaultSensor(9);
        this.h = this.f15579a.getDefaultSensor(10);
    }

    @Override // tb.a74
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6743aa67", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f15579a;
        if (sensorManager != null) {
            sensorManager.registerListener(this, this.h, 2);
            this.f15579a.registerListener(this, this.g, 3);
        }
    }

    @Override // tb.a74
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63731920", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f15579a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }
}
