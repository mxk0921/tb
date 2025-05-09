package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dfl implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static dfl p;
    public static final Object q = new Object();
    public static final Set<Integer> r = pxv.j(15);
    public static final Set<Integer> s = pxv.j(11);
    public static final Set<Integer> t = pxv.j(1, 2);

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f17774a;
    public Handler b;
    public final Context c;
    public float[] d;
    public float[] e;
    public float[] f;
    public double[] g;
    public lbp h;
    public Set<Integer> k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final Set<Integer> i = new HashSet();
    public final ArrayList<a> o = new ArrayList<>();
    public final List<Set<Integer>> j = pxv.i(r, s, t);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void n(double d, double d2, double d3);
    }

    static {
        t2o.a(87031885);
    }

    public dfl(Context context) {
        this.c = context.getApplicationContext();
    }

    public static double[] b(float[] fArr, double[] dArr) {
        double d;
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (double[]) ipChange.ipc$dispatch("5a1e88b8", new Object[]{fArr, dArr});
        }
        if (fArr.length != 9) {
            return dArr;
        }
        float f = fArr[8];
        if (f > 0.0f) {
            dArr[0] = Math.atan2(-fArr[1], fArr[4]);
            dArr[1] = Math.asin(fArr[7]);
            dArr[2] = Math.atan2(-fArr[6], fArr[8]);
        } else if (f < 0.0f) {
            dArr[0] = Math.atan2(fArr[1], -fArr[4]);
            double d3 = -Math.asin(fArr[7]);
            dArr[1] = d3;
            if (d3 >= vu3.b.GEO_NOT_SUPPORT) {
                d2 = -3.141592653589793d;
            } else {
                d2 = 3.141592653589793d;
            }
            dArr[1] = d3 + d2;
            dArr[2] = Math.atan2(fArr[6], -fArr[8]);
        } else {
            float f2 = fArr[6];
            double d4 = -1.5707963267948966d;
            if (f2 > 0.0f) {
                dArr[0] = Math.atan2(-fArr[1], fArr[4]);
                dArr[1] = Math.asin(fArr[7]);
                dArr[2] = -1.5707963267948966d;
            } else if (f2 < 0.0f) {
                dArr[0] = Math.atan2(fArr[1], -fArr[4]);
                double d5 = -Math.asin(fArr[7]);
                dArr[1] = d5;
                if (d5 >= vu3.b.GEO_NOT_SUPPORT) {
                    d = -3.141592653589793d;
                } else {
                    d = 3.141592653589793d;
                }
                dArr[1] = d5 + d;
                dArr[2] = -1.5707963267948966d;
            } else {
                dArr[0] = Math.atan2(fArr[3], fArr[0]);
                if (fArr[7] > 0.0f) {
                    d4 = 1.5707963267948966d;
                }
                dArr[1] = d4;
                dArr[2] = 0.0d;
            }
        }
        double d6 = dArr[0];
        if (d6 < vu3.b.GEO_NOT_SUPPORT) {
            dArr[0] = d6 + 6.283185307179586d;
        }
        return dArr;
    }

    public static dfl f(Context context) {
        dfl dflVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dfl) ipChange.ipc$dispatch("8d158536", new Object[]{context});
        }
        synchronized (q) {
            try {
                if (p == null) {
                    p = new dfl(context);
                }
                dflVar = p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dflVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e75fdf", new Object[]{this, aVar});
            return;
        }
        ArrayList<a> arrayList = this.o;
        if (arrayList != null && !arrayList.contains(aVar)) {
            this.o.add(aVar);
        }
    }

    public final void c(float[] fArr, double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6cf42ca", new Object[]{this, fArr, dArr});
            return;
        }
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.e, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.f, this.e);
        } else {
            SensorManager.getRotationMatrixFromVector(this.f, fArr);
        }
        b(this.f, dArr);
        for (int i = 0; i < 3; i++) {
            dArr[i] = Math.toDegrees(dArr[i]);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ecf1ad2", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = new float[9];
        }
        if (this.g == null) {
            this.g = new double[3];
        }
        if (this.e == null) {
            this.e = new float[4];
        }
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        if (this.b == null) {
            HandlerThread handlerThread = new HandlerThread("DeviceOrientation");
            this.f17774a = handlerThread;
            handlerThread.start();
            this.b = new Handler(this.f17774a.getLooper());
        }
        return this.b;
    }

    public final void g(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d336edc", new Object[]{this, fArr, fArr2});
        } else if (fArr != null && fArr2 != null && SensorManager.getRotationMatrix(this.f, null, fArr, fArr2)) {
            b(this.f, this.g);
            j(Math.toDegrees(this.g[0]), Math.toDegrees(this.g[1]), Math.toDegrees(this.g[2]));
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ba554ae", new Object[]{this});
        }
        if (this.n) {
            return "NOT_AVAILABLE";
        }
        Set<Integer> set = this.k;
        if (set == r) {
            return "GAME_ROTATION_VECTOR";
        }
        if (set == s) {
            return "ROTATION_VECTOR";
        }
        if (set == t) {
            return "ACCELEROMETER_MAGNETIC";
        }
        return "NOT_AVAILABLE";
    }

    public final lbp i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lbp) ipChange.ipc$dispatch("4da97d11", new Object[]{this});
        }
        lbp lbpVar = this.h;
        if (lbpVar != null) {
            return lbpVar;
        }
        SensorManager sensorManager = (SensorManager) this.c.getSystemService(APower.TYPE_SENSOR);
        if (sensorManager != null) {
            this.h = new mbp(sensorManager);
        }
        return this.h;
    }

    public void j(double d, double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a14c73", new Object[]{this, new Double(d), new Double(d2), new Double(d3)});
            return;
        }
        ArrayList<a> arrayList = this.o;
        if (arrayList != null) {
            try {
                Iterator<a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().n(d, d2, d3);
                }
            } catch (Throwable th) {
                gfh.c("[OrientationDetector] ", th);
            }
        }
    }

    public final boolean k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2336185", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        lbp i3 = i();
        if (i3 == null) {
            return false;
        }
        return i3.b(this, i, i2, e());
    }

    public final boolean l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f525bec", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.n) {
            return false;
        }
        if (this.k != null) {
            String h = h();
            gfh.a("[OrientationDetector] register sensor:" + h);
            return m(this.k, i, true);
        }
        d();
        for (Set<Integer> set : this.j) {
            this.k = set;
            if (m(set, i, true)) {
                String h2 = h();
                gfh.a("[OrientationDetector] register sensor:" + h2);
                return true;
            }
        }
        this.n = true;
        this.k = null;
        this.f = null;
        this.g = null;
        return false;
    }

    public final boolean m(Set<Integer> set, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b914777", new Object[]{this, set, new Integer(i), new Boolean(z)})).booleanValue();
        }
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(this.i);
        if (hashSet.isEmpty()) {
            return true;
        }
        Iterator it = hashSet.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            boolean k = k(num.intValue(), i);
            if (!k && z) {
                r(hashSet);
                return false;
            } else if (k) {
                ((HashSet) this.i).add(num);
                z2 = true;
            }
        }
        return z2;
    }

    public boolean n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed2f6e20", new Object[]{this, aVar})).booleanValue();
        }
        ArrayList<a> arrayList = this.o;
        if (arrayList == null) {
            return false;
        }
        if (aVar != null) {
            return arrayList.remove(aVar);
        }
        arrayList.clear();
        return true;
    }

    public final void o(boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864c4dd5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        if (!z || this.k != t) {
            z2 = false;
        }
        this.m = z2;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6c61486", new Object[]{this, sensor, new Integer(i)});
        }
    }

    public boolean p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f66283e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        gfh.a("[OrientationDetector] sensor started");
        boolean l = l(i);
        if (l) {
            o(true);
        }
        return l;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        gfh.a("[OrientationDetector] sensor stopped");
        r(new HashSet(this.i));
        o(false);
    }

    public final void r(Iterable<Integer> iterable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9267dd2d", new Object[]{this, iterable});
            return;
        }
        for (Integer num : iterable) {
            if (((HashSet) this.i).contains(num)) {
                i().a(this, num.intValue());
                ((HashSet) this.i).remove(num);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type != 1) {
            if (type != 2) {
                if (type != 11) {
                    if (type != 15) {
                        gfh.b("unexpected sensor type:" + type);
                    } else if (this.l) {
                        c(fArr, this.g);
                        double[] dArr = this.g;
                        j(dArr[0], dArr[1], dArr[2]);
                    }
                } else if (this.l && this.k == s) {
                    c(fArr, this.g);
                    double[] dArr2 = this.g;
                    j(dArr2[0], dArr2[1], dArr2[2]);
                }
            } else if (this.m) {
                if (this.d == null) {
                    this.d = new float[3];
                }
                float[] fArr2 = this.d;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            }
        } else if (this.m) {
            g(fArr, this.d);
        }
    }
}
