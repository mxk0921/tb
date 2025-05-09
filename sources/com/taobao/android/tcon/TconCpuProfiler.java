package com.taobao.android.tcon;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import tb.asq;
import tb.j7h;
import tb.up1;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TconCpuProfiler extends TconMallocBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f9632a = false;
        public short b = 0;
        public final /* synthetic */ short c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;

        public a(short s, String str, long j) {
            this.c = s;
            this.d = str;
            this.e = j;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            if (!this.f9632a) {
                short s = this.b;
                this.b = (short) (s + 1);
                if (s > this.c && TconCpuProfiler.startCpuProfiler(this.d, this.e)) {
                    this.f9632a = true;
                }
            }
            if (this.f9632a) {
                TconCpuProfiler.updateMapsFile();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    public static String compressData(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5d4e683", new Object[]{str});
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        copy(fileInputStream, gZIPOutputStream);
        gZIPOutputStream.close();
        return up1.g(byteArrayOutputStream.toByteArray());
    }

    private static long config(long j, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0e677b3", new Object[]{new Long(j), jSONObject, str})).longValue();
        }
        String string = jSONObject.getString(str);
        if (string == null) {
            return j;
        }
        try {
            long parseLong = Long.parseLong(string);
            return parseLong > 1 ? parseLong : j;
        } catch (Exception unused) {
            return j;
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad894149", new Object[]{inputStream, outputStream});
            return;
        }
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TconCpuProfiler tconCpuProfiler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcon/TconCpuProfiler");
    }

    private static native void nativeStartCpuProfiler(String str, long j);

    private static native boolean nativeStopCpuHeapProfiler();

    private static native void nativeUpdateMapsFile();

    private static void reportData(Application application, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd700a10", new Object[]{application, str, new Boolean(z)});
            return;
        }
        try {
            String str2 = str + wh6.DIR;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(compressData(str2 + "maps"));
                sb.append("-");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(compressData(str2 + "tcon_cpuprofiler.log"));
                String sb4 = sb3.toString();
                TconBase.reportException(application, String.valueOf(sb4.length()), sb4, "HA_CPU_PROFILER");
            }
            deleteFile(str2 + "maps");
            deleteFile(str2 + "tcon_cpuprofiler.log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean stopCpuProfiler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca1d195a", new Object[0])).booleanValue();
        }
        return nativeStopCpuHeapProfiler();
    }

    public static void updateMapsFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca32e723", new Object[0]);
        } else {
            nativeUpdateMapsFile();
        }
    }

    public static boolean deleteFile(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea11bd1c", new Object[]{str})).booleanValue();
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        return file.delete();
    }

    public static boolean startCpuProfiler(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e25e7588", new Object[]{str, new Long(j)})).booleanValue();
        }
        nativeStartCpuProfiler(str, j);
        return true;
    }

    public static boolean init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3847dd2c", new Object[]{application})).booleanValue();
        }
        String b = j7h.d().b("tcon", "cpuprofiler_config");
        try {
            JSONObject parseObject = JSON.parseObject(b);
            if (parseObject == null || !"true".equals(parseObject.getString("enable_cpuprofiler"))) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String str = Build.MODEL;
            JSONObject jSONObject = new JSONObject() { // from class: com.taobao.android.tcon.TconCpuProfiler.1
            };
            if (parseObject.containsKey("cpuprofiler_whitelist")) {
                jSONObject = parseObject.getJSONObject("cpuprofiler_whitelist");
            }
            if ((!"*".equals(jSONObject.getString(String.valueOf(i))) && (asq.e(str) || !jSONObject.containsKey(String.valueOf(i)) || !jSONObject.getString(String.valueOf(i)).toLowerCase().contains(str.toLowerCase()))) || !TconBase.loadRequiredLibrary()) {
                return false;
            }
            long config = config(100L, parseObject, "sample_interval_usec");
            reportData(application, application.getFilesDir().getAbsolutePath(), "true".equals(parseObject.getString("force_upload")));
            short random = (short) (Math.random() * 5.0d);
            String str2 = application.getFilesDir().getAbsolutePath() + "/tcon_cpuprofiler.log";
            if (random == 0) {
                return startCpuProfiler(str2, config);
            }
            application.registerActivityLifecycleCallbacks(new a(random, str2, config));
            return true;
        } catch (Exception unused) {
            Log.e(TconInitializer.TCON_TAG, "invalid cpuprofiler config" + b);
            return false;
        }
    }
}
