package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class m5p implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1a<? super SensorEvent, xhv> f23796a;
    public long b = 200;
    public long c;

    static {
        t2o.a(815793501);
    }

    public m5p(g1a<? super SensorEvent, xhv> g1aVar, g1a<? super Integer, xhv> g1aVar2) {
        this.f23796a = g1aVar;
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef0eb821", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babf2c43", new Object[]{this, new Long(j)});
            return;
        }
        if (j <= 0) {
            j = 200;
        }
        this.b = j;
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
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        g1a<? super SensorEvent, xhv> g1aVar = this.f23796a;
        if (g1aVar != null && sensorEvent != null && g1aVar != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.c >= this.b) {
                g1a<? super SensorEvent, xhv> g1aVar2 = this.f23796a;
                ckf.d(g1aVar2);
                g1aVar2.invoke(sensorEvent);
                this.c = currentTimeMillis;
            }
        }
    }
}
