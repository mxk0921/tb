package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.tmall.android.dai.DAI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ewv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f18857a;

    static {
        t2o.a(1034944690);
    }

    public static synchronized Application a() {
        synchronized (ewv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (f18857a == null) {
                f18857a = b();
            }
            return f18857a;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("904e852c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void d(String str, String str2, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1325c48", new Object[]{str, str2, map, new Boolean(z)});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            kgh.b("Util", "Intent广播发送！broadcastName=" + str2 + ",modelName=" + str2);
            str = str2;
        }
        try {
            Intent intent = new Intent(DAI.ACTION_COMPUTE_COMPLETE);
            intent.setPackage(kzo.c().b().getPackageName());
            intent.setData(Uri.fromParts("DAI_" + str, "com.tmall.android.dai", null));
            intent.putExtra("com.tmall.android.dai.intent.extra.RESULT", z);
            intent.putExtra("com.tmall.android.dai.intent.extra.MODEL_NAME", str2);
            if (map != null && map.size() > 0) {
                intent.putExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA", new HashMap(map));
            }
            kzo.c().b().sendBroadcast(intent);
            kgh.b("Util", "Intent广播发送成功！broadcastName=" + str + ",modelName=" + str2);
        } catch (Throwable th) {
            kgh.f("Util", "Intent广播发送失败！broadcastName=" + str + ",modelName=" + str2, th);
        }
    }

    public static long f(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a0fe0d0", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void e(String str, MRTFilesDescription mRTFilesDescription, int i, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb20c2b4", new Object[]{str, mRTFilesDescription, new Integer(i), new Boolean(z)});
            return;
        }
        Intent intent = new Intent(DAI.WALLE_RESOURCE_DOWNLOAD);
        StringBuilder sb = new StringBuilder();
        int size = mRTFilesDescription.files.size();
        for (String str2 : mRTFilesDescription.files.keySet()) {
            sb.append(str2);
            if (i2 < size - 1) {
                sb.append(",");
            }
            i2++;
        }
        intent.putExtra("name", str);
        intent.putExtra(vs3.FILES_DIR_NAME, sb.toString());
        intent.putExtra("status", i);
        intent.putExtra("result", z);
        LocalBroadcastManager.getInstance(kzo.c().b()).sendBroadcast(intent);
    }
}
