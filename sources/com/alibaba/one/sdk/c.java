package com.alibaba.one.sdk;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import org.json.JSONObject;
import tb.m09;
import tb.pg1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2504a;
    private static long b;
    private static String c;

    public static String a() {
        Context context = f2504a;
        if (context == null) {
            return "";
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            return String.valueOf(Math.min(i, i2)) + "*" + String.valueOf(Math.max(i, i2));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String a(double d) {
        return new DecimalFormat("#.##").format(d);
    }

    private static String a(File file) {
        if (file != null) {
            try {
                if (file.getAbsolutePath().length() != 0) {
                    StatFs statFs = new StatFs(file.getPath());
                    return Build.VERSION.SDK_INT >= 18 ? String.valueOf(statFs.getTotalBytes()) : String.valueOf(statFs.getBlockCount() * statFs.getBlockSize());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static void a(Context context) {
        if (context != null && f2504a == null) {
            f2504a = context;
        }
    }

    public static String b() {
        int i;
        int i2;
        Context context = f2504a;
        if (context == null) {
            return "";
        }
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            float f = displayMetrics.xdpi;
            float f2 = displayMetrics.ydpi;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 14 || i3 >= 17) {
                if (i3 >= 17) {
                    defaultDisplay.getRealMetrics(displayMetrics);
                }
                i2 = displayMetrics.widthPixels;
                i = displayMetrics.heightPixels;
            } else {
                Method method = Display.class.getMethod("getRawWidth", new Class[0]);
                Method method2 = Display.class.getMethod("getRawHeight", new Class[0]);
                i2 = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method2.invoke(defaultDisplay, new Object[0])).intValue();
            }
            double d = i2;
            double d2 = f;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = i;
            double d5 = f2;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            float refreshRate = defaultDisplay.getRefreshRate();
            return a(d3) + "*" + a(d6) + "*" + Float.toString(refreshRate);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            jSONObject.put("is_vulkan_support", context.getPackageManager().hasSystemFeature("android.hardware.vulkan.level") ? 1 : 0);
            if (Build.VERSION.SDK_INT < 17) {
                return null;
            }
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            try {
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (EGL14.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
                                    EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
                                    String glGetString = GLES20.glGetString(7937);
                                    String glGetString2 = GLES20.glGetString(7936);
                                    jSONObject.put("opengl_version", GLES20.glGetString(7938));
                                    jSONObject.put("gpu_renderer", glGetString);
                                    jSONObject.put("gpu_vendor", glGetString2);
                                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                    EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                    EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                                    EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                                    EGL14.eglTerminate(eglGetDisplay);
                                    return jSONObject.toString();
                                }
                                throw new RuntimeException("Unable to create EGL surface");
                            }
                            throw new RuntimeException("Unable to create EGL context");
                        }
                        throw new RuntimeException("Unable to find a suitable EGLConfig");
                    }
                    throw new RuntimeException("Unable to initialize EGL14");
                }
                throw new RuntimeException("Unable to get EGL14 display");
            } catch (Throwable unused) {
                return null;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String b(File file) {
        if (file != null) {
            try {
                if (file.getAbsolutePath().length() != 0) {
                    StatFs statFs = new StatFs(file.getPath());
                    return Build.VERSION.SDK_INT >= 18 ? String.valueOf(statFs.getFreeBytes()) : String.valueOf(statFs.getFreeBlocks() * statFs.getBlockSize());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ram", h());
            jSONObject.put("rom", i());
            jSONObject.put("sdcard", j());
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(File file) {
        if (file != null) {
            try {
                if (file.getAbsolutePath().length() != 0) {
                    StatFs statFs = new StatFs(file.getPath());
                    return Build.VERSION.SDK_INT >= 18 ? String.valueOf(statFs.getAvailableBytes()) : String.valueOf(statFs.getAvailableBlocks() * statFs.getBlockSize());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private static boolean c(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String d() {
        k();
        String str = c;
        return str == null ? "-1" : str;
    }

    private static boolean d(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.television");
        } catch (Exception unused) {
            return false;
        }
    }

    public static String e() {
        return f2504a == null ? "" : Float.toString(new Paint().getTextSize());
    }

    private static boolean e(Context context) {
        try {
            return ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String f() {
        try {
            DisplayMetrics displayMetrics = f2504a.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.densityDpi);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String g() {
        return c(f2504a) ? "Tablet" : (d(f2504a) || e(f2504a)) ? "TV" : "Phone";
    }

    private static JSONObject h() {
        JSONObject jSONObject;
        Throwable th;
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    jSONObject = new JSONObject();
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/meminfo"));
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine != null) {
                                    if (readLine.startsWith("MemTotal")) {
                                        jSONObject.put("t", readLine.substring(readLine.indexOf("MemTotal:") + 9 + 1, readLine.indexOf("kB")).trim());
                                        z = true;
                                    }
                                    if (readLine.startsWith("MemFree")) {
                                        jSONObject.put("f", readLine.substring(readLine.indexOf("MemFree:") + 8 + 1, readLine.indexOf("kB")).trim());
                                        z2 = true;
                                    }
                                    if (readLine.startsWith("MemAvailable")) {
                                        jSONObject.put("a", readLine.substring(readLine.indexOf("MemAvailable:") + 13 + 1, readLine.indexOf("kB")).trim());
                                        z3 = true;
                                    }
                                    if (z && z2 && z3) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } catch (Exception unused) {
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return jSONObject;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                                throw th;
                            }
                        }
                        bufferedReader2.close();
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    jSONObject = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused5) {
        }
    }

    private static JSONObject i() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                File dataDirectory = Environment.getDataDirectory();
                jSONObject.put("t", a(dataDirectory));
                jSONObject.put("f", b(dataDirectory));
                jSONObject.put("a", c(dataDirectory));
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static JSONObject j() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    return jSONObject;
                }
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                jSONObject.put("t", a(externalStorageDirectory));
                jSONObject.put("f", b(externalStorageDirectory));
                jSONObject.put("a", c(externalStorageDirectory));
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static synchronized void k() {
        Intent registerReceiver;
        synchronized (c.class) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (b == 0 || currentTimeMillis - b >= 10000 || c == null) {
                    b = currentTimeMillis;
                    Context context = f2504a;
                    if (!(context == null || (registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(m09.TASK_TYPE_LEVEL, registerReceiver.getIntExtra(m09.TASK_TYPE_LEVEL, -1));
                        jSONObject.put("voltage", registerReceiver.getIntExtra("voltage", -1));
                        jSONObject.put("temperature", registerReceiver.getIntExtra("temperature", -1));
                        jSONObject.put("status", registerReceiver.getIntExtra("status", -1));
                        jSONObject.put("health", registerReceiver.getIntExtra("health", -1));
                        jSONObject.put("present", registerReceiver.getIntExtra("present", -1));
                        jSONObject.put("plugged", registerReceiver.getIntExtra("plugged", -1));
                        jSONObject.put("scale", registerReceiver.getIntExtra("scale", -1));
                        try {
                            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
                            if (batteryManager != null && Build.VERSION.SDK_INT >= 21) {
                                jSONObject.put("electricity", batteryManager.getIntProperty(2));
                                jSONObject.put("capacity", batteryManager.getIntProperty(4));
                            }
                        } catch (Throwable unused) {
                        }
                        c = jSONObject.toString();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
