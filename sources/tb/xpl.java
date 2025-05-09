package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.speed.TBSpeed;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.adapter.test.H5ProcedureGetterBridge;
import java.io.File;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Removed duplicated region for block: B:39:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.xpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "98178eae"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x0022
            return r1
        L_0x0022:
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: all -> 0x003e, NumberFormatException -> 0x0040, IOException -> 0x0043
            java.lang.String r2 = "r"
            r4.<init>(r0, r2)     // Catch: all -> 0x003e, NumberFormatException -> 0x0040, IOException -> 0x0043
            java.lang.String r0 = r4.readLine()     // Catch: all -> 0x0037, NumberFormatException -> 0x003a, IOException -> 0x003c
            r4.close()     // Catch: IOException -> 0x0032
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0036:
            return r0
        L_0x0037:
            r0 = move-exception
            r1 = r4
            goto L_0x0053
        L_0x003a:
            r0 = move-exception
            goto L_0x0045
        L_0x003c:
            r0 = move-exception
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            r4 = r1
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            goto L_0x0041
        L_0x0045:
            r0.printStackTrace()     // Catch: all -> 0x0037
            if (r4 == 0) goto L_0x0052
            r4.close()     // Catch: IOException -> 0x004e
            goto L_0x0052
        L_0x004e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0052:
            return r1
        L_0x0053:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch: IOException -> 0x0059
            goto L_0x005d
        L_0x0059:
            r4 = move-exception
            r4.printStackTrace()
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xpl.a(java.lang.String):java.lang.String");
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faaf52e9", new Object[]{application});
        } else {
            e81.b().c("isApmSpeed", TBSpeed.isSpeedEdition(application, "apm"));
        }
    }

    public static void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ee5512", new Object[]{application});
            return;
        }
        b(application);
        SharedPreferences k = w9a.g().k();
        d(k);
        c(k);
    }

    public static void f(Map<String, ?> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd8682", new Object[]{map});
            return;
        }
        try {
            str = new JSONObject(map).toString();
        } catch (Exception unused) {
            str = "";
        }
        zq6.a("ParamCache", "apmConfig", str);
    }

    public static void c(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce57fb38", new Object[]{sharedPreferences});
            return;
        }
        v5r.d = sharedPreferences.getString(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_ID, "");
        long j = sharedPreferences.getLong(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_VALID_TIME, -1L);
        v5r.e = "scan";
        if (j > 0 && System.currentTimeMillis() >= j) {
            v5r.d = "";
            v5r.e = "";
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_ID);
            edit.remove(H5ProcedureGetterBridge.SP_KEY_REALTIME_TRACE_VALID_TIME);
            edit.apply();
        }
        if (TextUtils.isEmpty(v5r.d) && new File("/data/local/tmp/.apm/.traceId").exists()) {
            v5r.d = a("/data/local/tmp/.apm/.traceId");
            v5r.e = "file";
        }
        if (!TextUtils.isEmpty(v5r.d)) {
            v5r.c = false;
        }
    }

    public static void d(SharedPreferences sharedPreferences) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7176019", new Object[]{sharedPreferences});
            return;
        }
        o48.f25136a = sharedPreferences.getBoolean(x11.NETWORK_SAMPLE, o48.f25136a);
        o48.n = sharedPreferences.getBoolean(x11.NEXT_LAUNCH_UPLOAD_SAMPLE, o48.n);
        o48.m = sharedPreferences.getBoolean(x11.NEED_WX_END_RUNTIME_INFO, o48.m);
        o48.o = sharedPreferences.getBoolean(x11.BATTERY_CANARY_SAMPLE, o48.o);
        o48.h = sharedPreferences.getBoolean(x11.FILTERED_PAGE_TAG_SAMPLE, o48.h);
        o48.i = sharedPreferences.getBoolean(x11.CLOSE_SAMPLE_ON_GREY, o48.i);
        o48.f = sharedPreferences.getBoolean(x11.WINDVANE_H5_SAMPLE, o48.f);
        o48.g = sharedPreferences.getBoolean(x11.WINDVANE_UC_T2_SAMPLE, o48.g);
        o48.p = sharedPreferences.getBoolean(x11.LOOPER_OBSERVER_SAMPLE, o48.p);
        o48.q = sharedPreferences.getBoolean(x11.NEED_PAGE_PSS, o48.q);
        o48.s = ABGlobal.isFeatureOpened(w9a.g().a(), "APMUseNewStandard");
        if (new Random().nextInt(10) == 0 || new File("/data/local/tmp/.apm/.needWeex").exists()) {
            z = true;
        }
        o48.e = z;
        o48.j = sharedPreferences.getBoolean(x11.LAUNCHER_PROCESSOR_SAMPLE, o48.j);
        o48.d = sharedPreferences.getBoolean(x11.NETWORK_PROCESSOR_SAMPLE, o48.d);
        o48.c = sharedPreferences.getBoolean(x11.IMAGE_PROCESSOR_SAMPLE, o48.c);
        o48.l = sharedPreferences.getBoolean(x11.NEED_RUNTIME_INFO, o48.l);
        tqo.b(sharedPreferences.getString(x11.SPECIAL_PAGE_SAMPLE, ""));
        ProcedureGlobal.f().j(sharedPreferences.getString(x11.SUBTASK_SAMPLE, ""));
        f(sharedPreferences.getAll());
    }
}
