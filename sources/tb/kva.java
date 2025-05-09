package tb;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.jsbridge.WVABGlobalApi;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.tao.log.TLog;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kva {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SERIALIZE_EXP_BUCKET_ID = "bucket_id";
    public static final String SERIALIZE_EXP_GROUP_ID = "group_id";
    public static final String SERIALIZE_EXP_HEADER = "exps";
    public static final String SERIALIZE_EXP_ID = "id";
    public static final String SERIALIZE_EXP_NAME = "name";
    public static final String SERIALIZE_EXP_RELEASE_ID = "release_id";
    public static final String SERIALIZE_EXP_VARIATIONS = "variations";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f22947a = new AtomicInteger(0);
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.b + "-" + this.f22947a.getAndIncrement());
        }
    }

    public static ExecutorService a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("4708c40e", new Object[]{str, new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, timeUnit, blockingQueue, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e616e24c", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static long c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef521081", new Object[]{str, str2, new Integer(i)})).longValue();
        }
        String f = f(str2 + str);
        if (!TextUtils.isEmpty(f)) {
            return Math.abs(f.hashCode() % i);
        }
        return -1L;
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else {
            TLog.loge("ABGlobal", str, str2);
        }
    }

    public static JSONObject e(Map<String, tij> map, pij pijVar, boolean z) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b7fdd15b", new Object[]{map, pijVar, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(SERIALIZE_EXP_HEADER, jSONArray);
        for (Map.Entry<String, tij> entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            String key = entry.getKey();
            if (pijVar == null || !((WVABGlobalApi.a) pijVar).a(key)) {
                tij value = entry.getValue();
                jSONObject2.put("name", key);
                jSONObject2.put("id", value.getExperimentId());
                jSONObject2.put("release_id", value.c());
                jSONObject2.put("group_id", value.getGroupId());
                jSONObject2.put("bucket_id", value.a());
                if (value.iterator().hasNext()) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (p2w p2wVar : value) {
                        if (z) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("value", p2wVar.getValue());
                            jSONObject4.put("desc", p2wVar.getDesc());
                            jSONObject3.put(p2wVar.getName(), jSONObject4);
                        } else {
                            jSONObject3.put(p2wVar.getName(), p2wVar.getValue());
                        }
                    }
                    jSONObject2.put(SERIALIZE_EXP_VARIATIONS, jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
        }
        return jSONObject;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        try {
            return String.format("%032X", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static <T, R> R g(Map<T, R> map, T t, R r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (R) ipChange.ipc$dispatch("6d011254", new Object[]{map, t, r});
        }
        if (map == null || map.isEmpty() || !map.containsKey(t)) {
            return r;
        }
        return map.get(t);
    }

    public static Context h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("295babf3", new Object[]{context});
        }
        if (context instanceof Application) {
            return context;
        }
        if (context == null) {
            return LauncherRuntime.h;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }
}
