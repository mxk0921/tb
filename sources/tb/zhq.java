package tb;

import android.content.Context;
import android.os.Build;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.evo.internal.database.ExperimentDO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.statistics.model.FileInfoRecord;
import com.taobao.android.statistics.model.SoLibInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zhq extends whq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f32779a = new HashMap(16);
    public static final List<Map<String, Object>> b = new ArrayList(16);
    public static final List<Map<String, Object>> c = new ArrayList(16);

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2147b05c", new Object[0]);
            return;
        }
        HashMap hashMap = new HashMap(20);
        hashMap.put(h7r.DEVICE_BRAND, Build.BRAND);
        hashMap.put("device_core_size", Integer.valueOf(jrt.a(vu3.b.GEO_NOT_SUPPORT)));
        hashMap.put("device_manufacturer", Build.MANUFACTURER);
        hashMap.put(h7r.DEVICE_MODEL, Build.MODEL);
        hashMap.put("os", "android");
        hashMap.put("os_version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("package_debug", Boolean.valueOf(LauncherRuntime.l));
        hashMap.put("package_tag", LauncherRuntime.f);
        hashMap.put("packageName", LauncherRuntime.b);
        hashMap.put("app_version", LauncherRuntime.e);
        chb g = c21.g();
        hashMap.put(dov.K_DEVICE_SCORE, Integer.valueOf(g.getInt(ai7.KEY_OLD_SCORE, 60)));
        hashMap.put("app_status_is_full_new_install", Boolean.valueOf(g.getBoolean("isFullNewInstall", false)));
        hashMap.put("app_status_is_first_launch", Boolean.valueOf(g.getBoolean("isFirstLaunch", false)));
        hashMap.put("start_time", Long.valueOf(LauncherRuntime.f8166a));
        ((HashMap) f32779a).putAll(hashMap);
    }

    public static /* synthetic */ Object ipc$super(zhq zhqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/statistics/StartupDefaultImpl");
    }

    @Override // tb.whq
    public void a(String str, fn8 fn8Var, Map<String, fn8> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae1825f", new Object[]{this, str, fn8Var, map});
            return;
        }
        HashMap hashMap = new HashMap(8);
        if ("m-b-f".equals(str)) {
            ((HashMap) f32779a).put("startup_duration", Long.valueOf(fn8Var.f19417a - LauncherRuntime.f8166a));
        }
        hashMap.put("stage_name", str);
        hashMap.put("stage_execution_start", Long.valueOf(fn8Var.f19417a));
        hashMap.put("stage_execution_end", Long.valueOf(fn8Var.b));
        hashMap.put("stage_execution_duration", Long.valueOf(fn8Var.b - fn8Var.f19417a));
        hashMap.put("stage_execution_node_count_total", Integer.valueOf(fn8Var.c));
        hashMap.put("stage_execution_node_count_executed", Integer.valueOf(fn8Var.d));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, fn8> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("name", entry.getKey());
            fn8 value = entry.getValue();
            hashMap2.put("start_time", Long.valueOf(value.f19417a));
            hashMap2.put(ExperimentDO.COLUMN_END_TIME, Long.valueOf(value.b));
            hashMap2.put("duration", Long.valueOf(value.b - value.f19417a));
            hashMap2.put("is_main_thread", Boolean.valueOf(value.e));
            arrayList.add(hashMap2);
        }
        hashMap.put("launchers", arrayList);
        ((ArrayList) b).add(hashMap);
    }

    @Override // tb.whq
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ab57ad", new Object[]{this, context});
            return;
        }
        try {
            i();
            h();
        } catch (Throwable th) {
            jdh.a(hiq.TAG, "dump error:", th);
        }
    }

    @Override // tb.whq
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    @Override // tb.whq
    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6c3409", new Object[]{this, context});
            return;
        }
        jdh.a(hiq.TAG, "[Startup][commit] start", new Object[0]);
        g();
        f();
        j(context);
    }

    @Override // tb.whq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2604488b", new Object[]{this});
            return;
        }
        ((HashMap) f32779a).clear();
        ((ArrayList) b).clear();
        ((ArrayList) c).clear();
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89c5cf6", new Object[]{this});
            return;
        }
        Map<String, Object> map = f32779a;
        ((HashMap) map).put("jank", c);
        ((HashMap) map).put(v4s.PARAM_UPLOAD_STAGE, b);
        ((HashMap) map).put("traceId", q1r.b(".apm/.traceId", "UNKNOWN"));
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd3468e", new Object[]{this});
            return;
        }
        List<FileInfoRecord> openedFilesFromUIThread = FileInfoRecord.getOpenedFilesFromUIThread();
        ArrayList arrayList = new ArrayList(openedFilesFromUIThread.size());
        for (FileInfoRecord fileInfoRecord : openedFilesFromUIThread) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("biz", fileInfoRecord.fileInfo.path);
            hashMap.put("time", Long.valueOf(fileInfoRecord.timestamp));
            hashMap.put("method_trace", fileInfoRecord.fileInfo.threadInfo.getStackTraces());
            arrayList.add(hashMap);
        }
        ((HashMap) f32779a).put(ErrorType.IO, arrayList);
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aededf2", new Object[]{this});
            return;
        }
        Set<String> solibs = SoLibInfo.getSolibs();
        ArrayList arrayList = new ArrayList(solibs.size());
        for (String str : solibs) {
            HashMap hashMap = new HashMap(4);
            hashMap.put("name", str);
            arrayList.add(hashMap);
        }
        ((HashMap) f32779a).put("solib", arrayList);
    }

    public final void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1666b34a", new Object[]{this, context});
            return;
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(context);
        Request requestImpl = new RequestImpl("http://tmq-service.taobao.org/api/whiteboxlaunchdata/uploadStartupInfo");
        requestImpl.setMethod("POST");
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(true);
        requestImpl.setRetryTime(3);
        requestImpl.addHeader("Content-Type", "application/json");
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry(JSON.toJSONBytes(f32779a, new SerializerFeature[0]));
        byteArrayEntry.setContentType("application/json");
        requestImpl.setBodyEntry(byteArrayEntry);
        try {
            if (degradableNetwork.syncSend(requestImpl, null).getStatusCode() == 200) {
                jdh.a(hiq.TAG, "[Startup][commit] success", new Object[0]);
            }
        } catch (Throwable th) {
            jdh.a(hiq.TAG, "[Startup][commit] failed:", th);
        }
    }
}
