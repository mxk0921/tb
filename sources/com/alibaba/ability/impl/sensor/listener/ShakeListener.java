package com.alibaba.ability.impl.sensor.listener;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.util.Arrays;
import tb.a07;
import tb.bkc;
import tb.cjf;
import tb.ckf;
import tb.sgb;
import tb.t2o;
import tb.yt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ShakeListener implements SensorEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public SensorManager f2025a;
    public Sensor b;
    public Vibrator c;
    public float[] d;
    public int e;
    public long f;
    public long g;
    public final yt h;
    public final Context i;
    public final String j;
    public final double k;
    public final int l;
    public final int m;
    public final boolean n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum Error {
        REGISTER_FAIL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Error error, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/sensor/listener/ShakeListener$Error");
        }

        public static Error valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("55e407fd", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Error.class, str);
            }
            return (Error) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(91226117);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements bkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bkc
        public void onBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83d13a74", new Object[]{this});
            } else {
                ShakeListener.a(ShakeListener.this);
            }
        }

        @Override // tb.bkc
        public void onForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
            } else {
                ShakeListener.b(ShakeListener.this);
            }
        }
    }

    static {
        t2o.a(91226116);
    }

    public ShakeListener(Context context, String str, double d, int i, int i2, boolean z) {
        yt ytVar;
        ckf.g(context, "context");
        ckf.g(str, "axis");
        this.i = context;
        this.j = str;
        this.k = d;
        this.l = i;
        this.m = i2;
        this.n = z;
        sgb b2 = cjf.INSTANCE.b();
        if (b2 != null) {
            ytVar = b2.a(new b());
        } else {
            ytVar = null;
        }
        this.h = ytVar;
    }

    public static final /* synthetic */ void a(ShakeListener shakeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c06641", new Object[]{shakeListener});
        } else {
            shakeListener.g();
        }
    }

    public static final /* synthetic */ void b(ShakeListener shakeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f6ba78", new Object[]{shakeListener});
        } else {
            shakeListener.i();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final float c(float[] fArr, float[] fArr2) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("556af390", new Object[]{this, fArr, fArr2})).floatValue();
        }
        if (fArr.length < 3 || fArr2.length < 3) {
            return 0.0f;
        }
        String str = this.j;
        switch (str.hashCode()) {
            case 88:
                if (str.equals("X")) {
                    f = Math.abs(fArr[0] - fArr2[0]);
                    break;
                }
                double d = 2;
                f = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d)) + ((float) Math.pow(fArr[1] - fArr2[1], d)) + ((float) Math.pow(fArr[2] - fArr2[2], d)));
                break;
            case 89:
                if (str.equals("Y")) {
                    f = Math.abs(fArr[1] - fArr2[1]);
                    break;
                }
                double d2 = 2;
                f = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d2)) + ((float) Math.pow(fArr[1] - fArr2[1], d2)) + ((float) Math.pow(fArr[2] - fArr2[2], d2)));
                break;
            case 90:
                if (str.equals("Z")) {
                    f = Math.abs(fArr[2] - fArr2[2]);
                    break;
                }
                double d22 = 2;
                f = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d22)) + ((float) Math.pow(fArr[1] - fArr2[1], d22)) + ((float) Math.pow(fArr[2] - fArr2[2], d22)));
                break;
            default:
                double d222 = 2;
                f = (float) Math.sqrt(((float) Math.pow(fArr[0] - fArr2[0], d222)) + ((float) Math.pow(fArr[1] - fArr2[1], d222)) + ((float) Math.pow(fArr[2] - fArr2[2], d222)));
                break;
        }
        return f / 9.80665f;
    }

    public final boolean d(float[] fArr, float[] fArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46068ecb", new Object[]{this, fArr, fArr2})).booleanValue();
        }
        if (fArr.length < 3 || fArr2.length < 3 || (fArr[0] * fArr2[0]) + (fArr[1] * fArr2[1]) + (fArr[2] * fArr2[2]) >= 0) {
            return false;
        }
        return true;
    }

    public abstract void e(Error error);

    public abstract void f(double d);

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.f2025a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.d = null;
    }

    public final boolean h() {
        Sensor sensor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a23a9ae", new Object[]{this})).booleanValue();
        }
        SensorManager sensorManager = this.f2025a;
        if (sensorManager == null || (sensor = this.b) == null) {
            return false;
        }
        return sensorManager.registerListener(this, sensor, 3);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (!h()) {
            e(Error.REGISTER_FAIL);
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Object systemService = this.i.getSystemService(APower.TYPE_SENSOR);
        Sensor sensor = null;
        if (!(systemService instanceof SensorManager)) {
            systemService = null;
        }
        SensorManager sensorManager = (SensorManager) systemService;
        this.f2025a = sensorManager;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(10);
        }
        this.b = sensor;
        if (h()) {
            yt ytVar = this.h;
            if (ytVar != null) {
                ytVar.b();
                return;
            }
            return;
        }
        e(Error.REGISTER_FAIL);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        yt ytVar = this.h;
        if (ytVar != null) {
            ytVar.c();
        }
        SensorManager sensorManager = this.f2025a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f2025a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void l() {
        VibrationEffect createOneShot;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed5aa76", new Object[]{this});
            return;
        }
        if (this.c == null) {
            Object systemService = this.i.getSystemService("vibrator");
            if (!(systemService instanceof Vibrator)) {
                systemService = null;
            }
            this.c = (Vibrator) systemService;
        }
        Vibrator vibrator = this.c;
        if (vibrator != null && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                createOneShot = VibrationEffect.createOneShot(300L, 255);
                vibrator.vibrate(createOneShot);
                return;
            }
            vibrator.vibrate(300L);
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
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b05a78", new Object[]{this, sensorEvent});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.g + 50 <= elapsedRealtime) {
            if (!(sensorEvent == null || (fArr3 = this.d) == null)) {
                float[] fArr4 = sensorEvent.values;
                ckf.f(fArr4, "event.values");
                if (d(fArr4, fArr3)) {
                    float[] fArr5 = sensorEvent.values;
                    ckf.f(fArr5, "event.values");
                    double c = c(fArr5, fArr3);
                    if (c > this.k) {
                        if (this.f + this.l < elapsedRealtime) {
                            this.e = 0;
                        }
                        int i = this.e + 1;
                        this.e = i;
                        this.f = elapsedRealtime;
                        if (i >= this.m) {
                            this.e = 0;
                            if (this.n) {
                                l();
                            }
                            f(c);
                        }
                    }
                }
            }
            if (sensorEvent == null || (fArr2 = sensorEvent.values) == null) {
                fArr = null;
            } else {
                fArr = Arrays.copyOf(fArr2, fArr2.length);
                ckf.f(fArr, "java.util.Arrays.copyOf(this, size)");
            }
            this.d = fArr;
            this.g = elapsedRealtime;
        }
    }
}
