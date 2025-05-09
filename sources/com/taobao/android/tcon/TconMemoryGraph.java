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

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TconMemoryGraph extends TconMallocBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f9634a = false;
        public short b = 0;
        public final /* synthetic */ short c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ long j;
        public final /* synthetic */ long k;
        public final /* synthetic */ long l;

        public a(short s, String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.c = s;
            this.d = str;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = j4;
            this.i = j5;
            this.j = j6;
            this.k = j7;
            this.l = j8;
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
            if (!this.f9634a) {
                short s = this.b;
                this.b = (short) (s + 1);
                if (s > this.c && TconMemoryGraph.startMallocProfiling(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l)) {
                    this.f9634a = true;
                }
            }
            if (this.f9634a) {
                TconMemoryGraph.updateMapsFile();
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

    public static /* synthetic */ Object ipc$super(TconMemoryGraph tconMemoryGraph, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tcon/TconMemoryGraph");
    }

    private static native void nativeStartHeapProfiling(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    private static native boolean nativeStopHeapProfiling();

    private static native void nativeUpdateMapsFile();

    private static void reportData(Application application, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd700a10", new Object[]{application, str, new Boolean(z)});
            return;
        }
        String str2 = str + "/maps";
        String str3 = str + "/small_zone_meta_info.dat";
        String str4 = str + "/medium_zone_meta_info.dat";
        String str5 = str + "/large_zone_meta_info.dat";
        String str6 = str + "/super_zone_meta_info.dat";
        try {
            try {
                if (!z) {
                    try {
                        if (TconMallocBase.checkAndInstallNativeCrashCallback(application)) {
                        }
                        deleteFile(str2);
                        deleteFile(str3);
                        deleteFile(str4);
                    } catch (Exception e) {
                        e.printStackTrace();
                        deleteFile(str2);
                        deleteFile(str3);
                        deleteFile(str4);
                    }
                    deleteFile(str5);
                    deleteFile(str6);
                }
                String compressData = compressData(str2);
                String compressData2 = compressData(str3);
                String compressData3 = compressData(str4);
                String compressData4 = compressData(str5);
                String compressData5 = compressData(str6);
                if (compressData2.length() + compressData3.length() + compressData4.length() + compressData5.length() > 1024) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("<section-maps>");
                    sb.append(compressData);
                    sb.append("</section-maps>");
                    sb.append("<section-small>");
                    sb.append(compressData2);
                    sb.append("</section-small>");
                    sb.append("<section-medium>");
                    sb.append(compressData3);
                    sb.append("</section-medium>");
                    sb.append("<section-large>");
                    sb.append(compressData4);
                    sb.append("</section-large>");
                    sb.append("<section-super>");
                    sb.append(compressData5);
                    sb.append("</section-super>");
                    TconBase.reportException(application, "MEMORY_PROFILER_" + sb.length(), sb.toString(), "HA_MEM_GRAPH");
                }
                deleteFile(str2);
                deleteFile(str3);
                deleteFile(str4);
                deleteFile(str5);
                deleteFile(str6);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            try {
                deleteFile(str2);
                deleteFile(str3);
                deleteFile(str4);
                deleteFile(str5);
                deleteFile(str6);
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    public static boolean startMallocProfiling(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a08abbf1", new Object[]{str, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), new Long(j7), new Long(j8)})).booleanValue();
        }
        nativeStartHeapProfiling(str, j, j2, j3, j4, j5, j6, j7, j8);
        return TconMallocBase.replaceSystemMalloc();
    }

    public static boolean stopMallocProfiling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df111847", new Object[0])).booleanValue();
        }
        return nativeStopHeapProfiling();
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

    public static boolean init(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3847dd2c", new Object[]{application})).booleanValue();
        }
        String b = j7h.d().b("tcon", "memgraph_config");
        try {
            JSONObject parseObject = JSON.parseObject(b);
            if (parseObject == null || !"true".equals(parseObject.getString("enable_memgraph"))) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            String str = Build.MODEL;
            JSONObject jSONObject = new JSONObject() { // from class: com.taobao.android.tcon.TconMemoryGraph.1
                {
                    put("29", "Mi 10");
                    put("28", "VTR-AL00");
                }
            };
            if (parseObject.containsKey("memgraph_whitelist")) {
                jSONObject = parseObject.getJSONObject("memgraph_whitelist");
            }
            if ((!"*".equals(jSONObject.getString(String.valueOf(i))) && (asq.e(str) || !jSONObject.containsKey(String.valueOf(i)) || !jSONObject.getString(String.valueOf(i)).toLowerCase().contains(str.toLowerCase()))) || !TconBase.loadRequiredLibrary()) {
                return false;
            }
            long config = config(100L, parseObject, "sample_rate");
            long config2 = config(1000L, parseObject, "small_zone_num");
            long config3 = config(1000L, parseObject, "medium_zone_num");
            long config4 = config(500L, parseObject, "large_zone_num");
            long config5 = config(100L, parseObject, "super_zone_num");
            long config6 = config(64L, parseObject, "small_zone_size");
            long config7 = config(1024L, parseObject, "medium_zone_size");
            long config8 = config(1048576L, parseObject, "large_zone_size");
            reportData(application, application.getFilesDir().getAbsolutePath(), "true".equals(parseObject.getString("forceUpload")));
            short random = (short) (Math.random() * 5.0d);
            String absolutePath = application.getFilesDir().getAbsolutePath();
            if (random == 0) {
                return startMallocProfiling(absolutePath, config, config2, config3, config4, config5, config6, config7, config8);
            }
            application.registerActivityLifecycleCallbacks(new a(random, absolutePath, config, config2, config3, config4, config5, config6, config7, config8));
            return true;
        } catch (Exception unused) {
            Log.e(TconInitializer.TCON_TAG, "invalid memgraph config" + b);
            return false;
        }
    }
}
