package tb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.behavir.util.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xko implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SensorManager f31445a;
    public Sensor b;
    public Sensor c;
    public float[] d;
    public float[] e;
    public boolean f;
    public final AtomicBoolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/RywObserver$1");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                xko.b(xko.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/RywObserver$2");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else if (!xko.f(xko.this)) {
                xko.c(xko.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/observer/RywObserver$3");
        }

        @Override // tb.m02
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4134b145", new Object[]{this});
            } else {
                xko.b(xko.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d {
        static {
            t2o.a(404750566);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final xko f31446a = new xko(null);

        static {
            t2o.a(404750567);
        }

        public static /* synthetic */ xko a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xko) ipChange.ipc$dispatch("8494aaa1", new Object[0]);
            }
            return f31446a;
        }
    }

    static {
        t2o.a(404750562);
    }

    public /* synthetic */ xko(a aVar) {
        this();
    }

    public static /* synthetic */ void b(xko xkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("286fd121", new Object[]{xkoVar});
        } else {
            xkoVar.g();
        }
    }

    public static /* synthetic */ void c(xko xkoVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58b05d3", new Object[]{xkoVar, new Boolean(z)});
        } else {
            xkoVar.d(z);
        }
    }

    public static /* synthetic */ boolean f(xko xkoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4ddcd84", new Object[]{xkoVar})).booleanValue();
        }
        return xkoVar.f;
    }

    public static final xko h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xko) ipChange.ipc$dispatch("a0969cb", new Object[0]);
        }
        return e.a();
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return v82.k("motionTrackDelay", 5000);
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f31445a.unregisterListener(this, this.b);
        this.f31445a.unregisterListener(this, this.c);
        this.f = false;
        if (z) {
            com.taobao.android.behavir.util.b.a(new c(), e());
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return v82.k("motionTrackInterval", 30000);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f31445a.registerListener(this, this.b, 2);
        this.f31445a.registerListener(this, this.c, 2);
        com.taobao.android.behavir.util.b.a(new b(), 10000L);
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
        if (sensorEvent.sensor.getType() == 1) {
            this.d = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 2) {
            this.e = sensorEvent.values;
        }
        float[] fArr2 = this.d;
        if (fArr2 != null && (fArr = this.e) != null) {
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[9];
            if (SensorManager.getRotationMatrix(fArr4, null, fArr2, fArr)) {
                SensorManager.getOrientation(fArr4, fArr3);
                Math.round(Math.toDegrees(fArr3[0]));
                Math.round(Math.toDegrees(fArr3[1]));
                Math.round(Math.toDegrees(fArr3[2]));
                this.f = true;
                d(true);
            }
        }
    }

    public xko() {
        this.f = false;
        this.g = new AtomicBoolean();
    }

    public void i() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.g.compareAndSet(false, true) && (a2 = a()) >= 0) {
            SensorManager sensorManager = (SensorManager) f82.d().getSystemService(APower.TYPE_SENSOR);
            this.f31445a = sensorManager;
            this.b = sensorManager.getDefaultSensor(1);
            this.c = this.f31445a.getDefaultSensor(2);
            com.taobao.android.behavir.util.b.a(new a(), a2);
        }
    }
}
