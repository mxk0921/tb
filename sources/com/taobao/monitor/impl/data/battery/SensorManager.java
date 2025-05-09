package com.taobao.monitor.impl.data.battery;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.monitor.impl.trace.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.f7l;
import tb.out;
import tb.zq6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SensorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SensorManager";
    private static c sBatteryDispatcher;
    private static final Map<String, Integer> sSensorInfoCache = new ConcurrentHashMap();

    public static Map<String, Integer> getCurrSensorInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8650c2cc", new Object[0]);
        }
        return new HashMap(sSensorInfoCache);
    }

    private static int getDelay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8941f7a2", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 20000;
        }
        if (i == 2) {
            return 66667;
        }
        if (i != 3) {
            return i;
        }
        return f.DX_ERROR_CODE_SLIDER_LAYOUT_ITEM_COUNT_0;
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a861ca", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i)})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i);
    }

    public static void setBatteryDispatcher(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68be27a5", new Object[]{cVar});
        } else {
            sBatteryDispatcher = cVar;
        }
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a734bc", new Object[]{sensorManager, sensorEventListener});
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        recordUnregister(sensorEventListener);
    }

    private static void recordUnregister(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3386c50", new Object[]{obj});
        } else if (obj != null) {
            String name = obj.getClass().getName();
            sSensorInfoCache.remove(name);
            c cVar = sBatteryDispatcher;
            if (cVar != null) {
                cVar.h(name);
            }
            zq6.a(TAG, "unregisterListener", name);
        }
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ebe31fa", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), handler})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, handler);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42969a4", new Object[]{sensorManager, sensorEventListener, sensor});
            return;
        }
        sensorManager.unregisterListener(sensorEventListener, sensor);
        recordUnregister(sensorEventListener);
    }

    private static void recordRegister(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("144bd22c", new Object[]{obj, new Integer(i)});
        } else if (obj != null) {
            String name = obj.getClass().getName();
            long a2 = out.a();
            int delay = getDelay(i);
            sSensorInfoCache.put(name, Integer.valueOf(delay));
            c cVar = sBatteryDispatcher;
            if (cVar != null) {
                cVar.g(name, delay, a2);
            }
            if (i <= 66667) {
                zq6.a(TAG, "high speed sensor register: " + name + f7l.BRACKET_START_STR + delay + "us)");
            }
            zq6.a(TAG, "registerListener", name, Integer.valueOf(delay));
        }
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e644a01", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), new Integer(i2)})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, i2);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e56d232", new Object[]{sensorManager, sensorListener});
            return;
        }
        sensorManager.unregisterListener(sensorListener);
        recordUnregister(sensorListener);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i, int i2, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52d8b1", new Object[]{sensorManager, sensorEventListener, sensor, new Integer(i), new Integer(i2), handler})).booleanValue();
        }
        recordRegister(sensorEventListener, i);
        return sensorManager.registerListener(sensorEventListener, sensor, i, i2, handler);
    }

    public static void unregisterListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c83e711", new Object[]{sensorManager, sensorListener, new Integer(i)});
            return;
        }
        sensorManager.unregisterListener(sensorListener, i);
        recordUnregister(sensorListener);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dad9093c", new Object[]{sensorManager, sensorListener, new Integer(i)})).booleanValue();
        }
        recordRegister(sensorListener, 3);
        return sensorManager.registerListener(sensorListener, i);
    }

    public static boolean registerListener(android.hardware.SensorManager sensorManager, SensorListener sensorListener, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("804890cf", new Object[]{sensorManager, sensorListener, new Integer(i), new Integer(i2)})).booleanValue();
        }
        recordRegister(sensorListener, i2);
        return sensorManager.registerListener(sensorListener, i, i2);
    }
}
