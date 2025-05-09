package android.taobao.windvane.jsbridge.api;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Vibrator;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.a;
import android.text.TextUtils;
import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;
import tb.dqw;
import tb.hzl;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.tf2;
import tb.v7t;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVMotion extends kpw implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHAKE_STOP = 1;
    private static final String TAG = "WVMotion";
    private tf2 blowSensor;
    private Vibrator vibrator;
    private android.taobao.windvane.jsbridge.api.a mShakeListener = null;
    private SensorManager sm = null;
    private long currentTime = 0;
    private long currentTime2 = 0;
    private long frequency = 0;
    private long frequency2 = 0;
    private WVCallBackContext mCallback = null;
    public SensorEventListener mSensorListener = new b();
    public SensorEventListener mSensorListener2 = new c();
    private Handler handler = new Handler(Looper.getMainLooper(), this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f1808a;
        public final /* synthetic */ String b;

        public a(WVCallBackContext wVCallBackContext, String str) {
            this.f1808a = wVCallBackContext;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WVMotion.this.listenBlow(this.f1808a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements a.AbstractC0011a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WVCallBackContext f1811a;
        public final long b;
        public long c = 0;

        static {
            t2o.a(989856289);
            t2o.a(989856245);
        }

        public d(WVCallBackContext wVCallBackContext, long j) {
            this.f1811a = wVCallBackContext;
            this.b = j;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93da1d6e", new Object[]{this});
            } else if (WVMotion.access$000(WVMotion.this)) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.c >= this.b) {
                    nsw nswVar = new nsw();
                    nswVar.k();
                    WVCallBackContext wVCallBackContext = this.f1811a;
                    if (wVCallBackContext != null) {
                        wVCallBackContext.fireEvent("motion.shake", nswVar.m());
                    }
                    this.c = currentTimeMillis;
                }
            }
        }
    }

    static {
        t2o.a(989856285);
    }

    public static /* synthetic */ boolean access$000(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cffad6b", new Object[]{wVMotion})).booleanValue();
        }
        return wVMotion.isAlive;
    }

    public static /* synthetic */ long access$100(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("571b2bfa", new Object[]{wVMotion})).longValue();
        }
        return wVMotion.frequency;
    }

    public static /* synthetic */ long access$200(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7136aa99", new Object[]{wVMotion})).longValue();
        }
        return wVMotion.currentTime;
    }

    public static /* synthetic */ long access$202(WVMotion wVMotion, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d01483b5", new Object[]{wVMotion, new Long(j)})).longValue();
        }
        wVMotion.currentTime = j;
        return j;
    }

    public static /* synthetic */ WVCallBackContext access$300(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("9a98324f", new Object[]{wVMotion});
        }
        return wVMotion.mCallback;
    }

    public static /* synthetic */ void access$400(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a56da7e3", new Object[]{wVMotion});
        } else {
            wVMotion.stopListenGyro();
        }
    }

    public static /* synthetic */ long access$500(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf892676", new Object[]{wVMotion})).longValue();
        }
        return wVMotion.frequency2;
    }

    public static /* synthetic */ long access$600(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9a4a515", new Object[]{wVMotion})).longValue();
        }
        return wVMotion.currentTime2;
    }

    public static /* synthetic */ long access$602(WVMotion wVMotion, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7565d8b9", new Object[]{wVMotion, new Long(j)})).longValue();
        }
        wVMotion.currentTime2 = j;
        return j;
    }

    public static /* synthetic */ void access$700(WVMotion wVMotion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c023c0", new Object[]{wVMotion});
        } else {
            wVMotion.stopListenRota();
        }
    }

    public static /* synthetic */ Object ipc$super(WVMotion wVMotion, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in android/taobao/windvane/jsbridge/api/WVMotion");
        }
    }

    private void stopListenGyro() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76239f3f", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager != null) {
            SensorEventListener sensorEventListener = this.mSensorListener;
            if (sensorEventListener != null) {
                sensorManager.unregisterListener(sensorEventListener);
            }
            this.sm = null;
        }
    }

    private void stopListenRota() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de76a47a", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (sensorManager != null) {
            SensorEventListener sensorEventListener = this.mSensorListener2;
            if (sensorEventListener != null) {
                sensorManager.unregisterListener(sensorEventListener);
            }
            this.sm = null;
        }
    }

    private void stopShake() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc7daab", new Object[]{this});
            return;
        }
        android.taobao.windvane.jsbridge.api.a aVar = this.mShakeListener;
        if (aVar != null) {
            aVar.e();
            this.mShakeListener = null;
        }
    }

    public synchronized void listenBlow(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf549e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, "listenBlow: start. " + str);
        }
        this.mCallback = wVCallBackContext;
        tf2 tf2Var = this.blowSensor;
        if (tf2Var != null) {
            tf2Var.d();
        }
        tf2 tf2Var2 = new tf2(this.handler);
        this.blowSensor = tf2Var2;
        tf2Var2.c();
        wVCallBackContext.success(new nsw());
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        stopShake();
        stopListenGyro();
        stopListenRota();
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
        this.mCallback = null;
        tf2 tf2Var = this.blowSensor;
        if (tf2Var != null) {
            tf2Var.d();
        }
    }

    @Override // tb.kpw
    public void onPause() {
        SensorEventListener sensorEventListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (!(sensorManager == null || (sensorEventListener = this.mSensorListener) == null)) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        android.taobao.windvane.jsbridge.api.a aVar = this.mShakeListener;
        if (aVar != null) {
            aVar.a();
        }
        tf2 tf2Var = this.blowSensor;
        if (tf2Var != null) {
            tf2Var.d();
        }
        super.onPause();
    }

    @Override // tb.kpw
    public void onResume() {
        SensorEventListener sensorEventListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        SensorManager sensorManager = this.sm;
        if (!(sensorManager == null || (sensorEventListener = this.mSensorListener) == null)) {
            sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(9), 3);
        }
        android.taobao.windvane.jsbridge.api.a aVar = this.mShakeListener;
        if (aVar != null) {
            aVar.b();
        }
        tf2 tf2Var = this.blowSensor;
        if (tf2Var != null) {
            tf2Var.c();
        }
        super.onResume();
    }

    public synchronized void stopListenBlow(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7846109", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, "stopListenBlow: stopped. " + str);
        }
        tf2 tf2Var = this.blowSensor;
        if (tf2Var != null) {
            tf2Var.d();
            this.blowSensor = null;
        }
        wVCallBackContext.success(new nsw());
    }

    public synchronized void vibrate(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e224e5bd", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        try {
            int i = 350;
            int optInt = new JSONObject(str).optInt("duration", 350);
            if (optInt >= 0) {
                i = optInt;
            }
            if (this.vibrator == null) {
                this.vibrator = (Vibrator) this.mContext.getSystemService("vibrator");
            }
            this.vibrator.vibrate(i);
            v7t.a(TAG, "vibrate: start ...");
            wVCallBackContext.success(new nsw());
        } catch (JSONException unused) {
            v7t.d(TAG, "vibrate: param parse to JSON error, param=" + str);
            nswVar.j("HY_PARAM_ERR");
            wVCallBackContext.error(nswVar);
        }
    }

    public synchronized void listenGyro(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4c80a4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, "listenGyro:  " + str);
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.frequency = jSONObject.optInt(AURAPageEventStrategy.FREQUENCY, 100);
            boolean optBoolean = jSONObject.optBoolean("on");
            this.mCallback = wVCallBackContext;
            if (this.sm == null) {
                this.sm = (SensorManager) this.mContext.getSystemService(APower.TYPE_SENSOR);
            }
            if (optBoolean) {
                SensorManager sensorManager = this.sm;
                sensorManager.registerListener(this.mSensorListener, sensorManager.getDefaultSensor(9), 3);
                this.currentTime = System.currentTimeMillis();
            } else {
                stopListenGyro();
            }
            wVCallBackContext.success(new nsw());
        } catch (JSONException unused) {
            v7t.d(TAG, "vibrate: param parse to JSON error, param=" + str);
            nswVar.j("HY_PARAM_ERR");
            wVCallBackContext.error(nswVar);
        }
    }

    public synchronized void listenRotationRate(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210b35b3", new Object[]{this, wVCallBackContext, str});
            return;
        }
        if (v7t.h()) {
            v7t.a(TAG, "listenRotationRate:  " + str);
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.frequency2 = jSONObject.optInt(AURAPageEventStrategy.FREQUENCY, 100);
            boolean optBoolean = jSONObject.optBoolean("on");
            this.mCallback = wVCallBackContext;
            if (this.sm == null) {
                this.sm = (SensorManager) this.mContext.getSystemService(APower.TYPE_SENSOR);
            }
            if (optBoolean) {
                SensorManager sensorManager = this.sm;
                sensorManager.registerListener(this.mSensorListener2, sensorManager.getDefaultSensor(4), 3);
                this.currentTime = System.currentTimeMillis();
            } else {
                stopListenRota();
            }
            wVCallBackContext.success(new nsw());
        } catch (JSONException unused) {
            v7t.d(TAG, "vibrate: param parse to JSON error, param=" + str);
            nswVar.j("HY_PARAM_ERR");
            wVCallBackContext.error(nswVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
            } else if (9 == sensorEvent.sensor.getType() && WVMotion.access$100(WVMotion.this) <= System.currentTimeMillis() - WVMotion.access$200(WVMotion.this)) {
                float[] fArr = sensorEvent.values;
                String str = "{\"x\":\"" + ((-fArr[0]) / 10.0f) + "\",\"y\":\"" + ((-fArr[1]) / 10.0f) + "\",\"z\":\"" + ((-fArr[2]) / 10.0f) + "\"}";
                if (WVMotion.access$300(WVMotion.this) != null) {
                    WVMotion.access$300(WVMotion.this).fireEvent("motion.gyro", str);
                } else {
                    WVMotion.access$400(WVMotion.this);
                }
                WVMotion.access$202(WVMotion.this, System.currentTimeMillis());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements SensorEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
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
            } else if (4 == sensorEvent.sensor.getType() && WVMotion.access$500(WVMotion.this) <= System.currentTimeMillis() - WVMotion.access$600(WVMotion.this)) {
                float[] fArr = sensorEvent.values;
                String str = "{\"alpha\":\"" + fArr[0] + "\",\"beta\":\"" + fArr[1] + "\",\"gama\":\"" + fArr[2] + "\"}";
                if (WVMotion.access$300(WVMotion.this) != null) {
                    WVMotion.access$300(WVMotion.this).fireEvent("WV.Event.Motion.RotationRate", str);
                } else {
                    WVMotion.access$700(WVMotion.this);
                }
                WVMotion.access$602(WVMotion.this, System.currentTimeMillis());
            }
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("listeningShake".equals(str)) {
            listeningShake(wVCallBackContext, str2);
        } else if (HapticsEngineAbility.API_VIBRATE.equals(str)) {
            vibrate(wVCallBackContext, str2);
        } else if ("listenBlow".equals(str)) {
            try {
                hzl.b(this.mContext, new String[]{"android.permission.RECORD_AUDIO"}).i(new a(wVCallBackContext, str2)).h(new dqw(wVCallBackContext, "NO_PERMISSION")).d();
            } catch (Exception unused) {
            }
        } else if ("stopListenBlow".equals(str)) {
            stopListenBlow(wVCallBackContext, str2);
        } else if ("listenGyro".equals(str)) {
            listenGyro(wVCallBackContext, str2);
        } else if (!"listenRotationRate".equals(str)) {
            return false;
        } else {
            listenRotationRate(wVCallBackContext, str2);
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            stopShake();
            Object obj = message.obj;
            if (obj instanceof WVCallBackContext) {
                ((WVCallBackContext) obj).success(new nsw());
            }
            return true;
        } else if (i != 4101) {
            if (i != 4102) {
                return false;
            }
            WVCallBackContext wVCallBackContext = this.mCallback;
            if (wVCallBackContext != null) {
                wVCallBackContext.error(new nsw());
            }
            return true;
        } else if (!this.isAlive) {
            return true;
        } else {
            nsw nswVar = new nsw();
            nswVar.k();
            nswVar.b(yj4.PARAM_VRPASS, "1");
            WVCallBackContext wVCallBackContext2 = this.mCallback;
            if (wVCallBackContext2 != null) {
                wVCallBackContext2.fireEvent("motion.blow", nswVar.m());
            }
            return true;
        }
    }

    public synchronized void listeningShake(WVCallBackContext wVCallBackContext, String str) {
        boolean z;
        boolean z2 = false;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6252f859", new Object[]{this, wVCallBackContext, str});
                return;
            }
            nsw nswVar = new nsw();
            long j = 500;
            long j2 = 1000;
            if (!TextUtils.isEmpty(str)) {
                try {
                    str = URLDecoder.decode(str, "utf-8");
                } catch (Exception unused) {
                    v7t.d(TAG, "listeningShake: param decode error, param=" + str);
                    z2 = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    z = jSONObject.getBoolean("on");
                    j = jSONObject.optLong(AURAPageEventStrategy.FREQUENCY, 500L);
                    j2 = jSONObject.optLong("checkFrequency", 1000L);
                } catch (JSONException unused2) {
                    v7t.d(TAG, "listeningShake: param parse to JSON error, param=" + str);
                    nswVar.j("HY_PARAM_ERR");
                    wVCallBackContext.error(nswVar);
                    return;
                }
            } else {
                z = false;
            }
            if (z2) {
                if (v7t.h()) {
                    v7t.n(TAG, "listeningShake: isFail");
                }
                wVCallBackContext.error(nswVar);
                return;
            }
            if (z) {
                v7t.d(TAG, "listeningShake: start ...");
                android.taobao.windvane.jsbridge.api.a aVar = this.mShakeListener;
                if (aVar != null) {
                    aVar.e();
                }
                android.taobao.windvane.jsbridge.api.a aVar2 = new android.taobao.windvane.jsbridge.api.a(this.mContext, j2);
                this.mShakeListener = aVar2;
                aVar2.c(new d(wVCallBackContext, j));
                wVCallBackContext.success(nswVar);
            } else {
                v7t.d(TAG, "listeningShake: stop.");
                Message message = new Message();
                message.what = 1;
                message.obj = wVCallBackContext;
                Handler handler = this.handler;
                if (handler != null) {
                    handler.sendMessage(message);
                }
            }
        }
    }
}
