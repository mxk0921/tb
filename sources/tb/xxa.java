package tb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.tao.log.TLog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f31657a;
    public boolean b;
    public int c;
    public final float d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr != null && fArr.length > 0) {
                float f = fArr[0];
                if (f < -5.0f) {
                    xxa.b(xxa.this, -1);
                } else if (f <= xxa.c(xxa.this)) {
                    xxa.b(xxa.this, 2);
                } else if (f < 150.0f) {
                    xxa.b(xxa.this, 1);
                } else if (f < 185.0f) {
                    xxa.b(xxa.this, 0);
                } else {
                    xxa.b(xxa.this, -1);
                }
                for (b bVar : xxa.d(xxa.this)) {
                    bVar.a(f);
                }
                TLog.loge("TBAutoSize.HingeAngleSensor", "angle=" + f + " status=" + FoldPosture.f(xxa.a(xxa.this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(float f);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c {
        public static final xxa INSTANCE = new xxa(null);
    }

    public /* synthetic */ xxa(a aVar) {
        this();
    }

    public static /* synthetic */ int a(xxa xxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec9e3832", new Object[]{xxaVar})).intValue();
        }
        return xxaVar.c;
    }

    public static /* synthetic */ int b(xxa xxaVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c894dc19", new Object[]{xxaVar, new Integer(i)})).intValue();
        }
        xxaVar.c = i;
        return i;
    }

    public static /* synthetic */ float c(xxa xxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f2a2038e", new Object[]{xxaVar})).floatValue();
        }
        return xxaVar.d;
    }

    public static /* synthetic */ List d(xxa xxaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96f289aa", new Object[]{xxaVar});
        }
        return xxaVar.f31657a;
    }

    public static xxa g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xxa) ipChange.ipc$dispatch("96f0e898", new Object[0]);
        }
        return c.INSTANCE;
    }

    public void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("752c090d", new Object[]{this, bVar});
        } else {
            ((CopyOnWriteArrayList) this.f31657a).add(bVar);
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45957343", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44df02c9", new Object[]{this, context});
            return;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(APower.TYPE_SENSOR);
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = sensorManager.registerListener(new a(), sensorManager.getDefaultSensor(36), 3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r3.equals("huawei") != false) goto L_0x0071;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public xxa() {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r7.f31657a = r0
            r0 = 0
            r7.b = r0
            r1 = -1
            r7.c = r1
            r2 = 1108082688(0x420c0000, float:35.0)
            r7.d = r2
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = r3.toLowerCase()
            int r4 = r3.hashCode()
            r5 = 2
            r6 = 1
            switch(r4) {
                case -1206476313: goto L_0x0066;
                case -759499589: goto L_0x005b;
                case 3418016: goto L_0x0050;
                case 3620012: goto L_0x0045;
                case 99462250: goto L_0x003a;
                case 108389869: goto L_0x002f;
                case 1864941562: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0070
        L_0x0024:
            java.lang.String r0 = "samsung"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 6
            goto L_0x0071
        L_0x002f:
            java.lang.String r0 = "redmi"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 5
            goto L_0x0071
        L_0x003a:
            java.lang.String r0 = "honor"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0071
        L_0x0045:
            java.lang.String r0 = "vivo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 2
            goto L_0x0071
        L_0x0050:
            java.lang.String r0 = "oppo"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 3
            goto L_0x0071
        L_0x005b:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 4
            goto L_0x0071
        L_0x0066:
            java.lang.String r4 = "huawei"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r0 = -1
        L_0x0071:
            if (r0 == r6) goto L_0x007b
            if (r0 == r5) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            r0 = 1096810496(0x41600000, float:14.0)
            r7.d = r0
            goto L_0x007d
        L_0x007b:
            r7.d = r2
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xxa.<init>():void");
    }
}
