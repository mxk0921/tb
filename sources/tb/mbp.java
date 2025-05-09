package tb;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mbp implements lbp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SensorManager f23923a;

    static {
        t2o.a(87031895);
        t2o.a(87031894);
    }

    public mbp(SensorManager sensorManager) {
        this.f23923a = sensorManager;
    }

    @Override // tb.lbp
    public void a(SensorEventListener sensorEventListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfc802a", new Object[]{this, sensorEventListener, new Integer(i)});
            return;
        }
        List<Sensor> sensorList = this.f23923a.getSensorList(i);
        if (!sensorList.isEmpty()) {
            try {
                this.f23923a.unregisterListener(sensorEventListener, sensorList.get(0));
            } catch (Throwable unused) {
                gfh.f("Failed to unregister device sensor " + sensorList.get(0).getName());
            }
        }
    }

    @Override // tb.lbp
    public boolean b(SensorEventListener sensorEventListener, int i, int i2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b061ec34", new Object[]{this, sensorEventListener, new Integer(i), new Integer(i2), handler})).booleanValue();
        }
        List<Sensor> sensorList = this.f23923a.getSensorList(i);
        if (sensorList.isEmpty()) {
            return false;
        }
        return this.f23923a.registerListener(sensorEventListener, sensorList.get(0), i2, handler);
    }
}
