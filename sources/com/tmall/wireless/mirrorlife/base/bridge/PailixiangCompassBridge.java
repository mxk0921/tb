package com.tmall.wireless.mirrorlife.base.bridge;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PailixiangCompassBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATA_DIVIDER = ",";
    public static final String KEY_VALUE_DIVIDER = ":";
    public static final String PITCH = ", PITCH:";
    public static final String ROLL = ", ROLL:";
    public static final String YAW = "Yaw:";
    private SensorManager sensorManager;
    public StringBuilder mStringBuilder = new StringBuilder();
    public boolean initial = false;
    public float[] orientation = new float[3];
    public float[] gyro = new float[3];
    private SensorEventListener sensorEventListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            } else if (sensorEvent.sensor.getType() == 3) {
                System.arraycopy(sensorEvent.values, 0, PailixiangCompassBridge.this.orientation, 0, 3);
                PailixiangCompassBridge.this.initial = true;
            } else if (sensorEvent.sensor.getType() == 4) {
                PailixiangCompassBridge pailixiangCompassBridge = PailixiangCompassBridge.this;
                if (pailixiangCompassBridge.initial) {
                    System.arraycopy(sensorEvent.values, 0, pailixiangCompassBridge.gyro, 0, 3);
                    PailixiangCompassBridge.this.mStringBuilder.setLength(0);
                    PailixiangCompassBridge pailixiangCompassBridge2 = PailixiangCompassBridge.this;
                    StringBuilder sb = pailixiangCompassBridge2.mStringBuilder;
                    sb.append(pailixiangCompassBridge2.orientation[0]);
                    sb.append(",");
                    sb.append(PailixiangCompassBridge.this.orientation[1]);
                    sb.append(",");
                    sb.append(PailixiangCompassBridge.this.orientation[2]);
                    sb.append(",");
                    sb.append(PailixiangCompassBridge.this.gyro[0]);
                    sb.append(",");
                    sb.append(PailixiangCompassBridge.this.gyro[1]);
                    sb.append(",");
                    sb.append(PailixiangCompassBridge.this.gyro[2]);
                    PailixiangCompassBridge.this.notifyDirection(PailixiangCompassBridge.this.mStringBuilder.toString());
                }
            }
        }
    }

    static {
        t2o.a(1037041677);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            this.sensorManager = (SensorManager) this.mContext.getSystemService(APower.TYPE_SENSOR);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(PailixiangCompassBridge pailixiangCompassBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/wireless/mirrorlife/base/bridge/PailixiangCompassBridge");
    }

    public void fireEvent(IWVWebView iWVWebView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b044543", new Object[]{this, iWVWebView, str, str2});
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        init();
    }

    public void notifyDirection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab5c047", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resultData", (Object) str);
        fireEvent(this.mWebView, "WEEX_AR_COMPASS_UPDATE", jSONObject.toString());
    }

    public float[] unWrap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("430168d", new Object[]{this, str});
        }
        float[] fArr = new float[3];
        String[] split = str.split(",");
        if (split.length != 3) {
            return fArr;
        }
        fArr[0] = Float.parseFloat(split[0]);
        fArr[1] = Float.parseFloat(split[1]);
        fArr[2] = Float.parseFloat(split[2]);
        return fArr;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("startCompass".equals(str)) {
            SensorManager sensorManager = this.sensorManager;
            sensorManager.registerListener(this.sensorEventListener, sensorManager.getDefaultSensor(3), 1);
            SensorManager sensorManager2 = this.sensorManager;
            sensorManager2.registerListener(this.sensorEventListener, sensorManager2.getDefaultSensor(4), 1);
            wVCallBackContext.success();
            return true;
        } else if (!"stopCompass".equals(str)) {
            return false;
        } else {
            this.sensorManager.unregisterListener(this.sensorEventListener);
            return true;
        }
    }
}
