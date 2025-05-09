package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s26 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_CACHE_DATA_KEY = "dxLifeCycleInfo";
    public static final String LOCAL_CACHE_PF_NAME = "dxLifeCycle";
    public static final int UPLOAD_DELAY = 5000;
    public static final int UPLOAD_INFO_TYPE_ENGINE_LIFE_CYCLE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<WeakReference<DinamicXEngine>>> f27750a = new HashMap();
    public static final Map<String, int[]> b = new HashMap();
    public static SharedPreferences c;
    public static volatile boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                s26.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ f f27751a;
            public final /* synthetic */ Map b;

            public a(f fVar, Map map) {
                this.f27751a = fVar;
                this.b = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ic5.p(this.f27751a);
                if (DinamicXEngine.j0()) {
                    h36.g("DXLifeCycleMonitor", "uploadToAppMonitor: " + JSON.toJSONString(this.b));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f fVar = new f("dinamicx");
            fVar.c = new ArrayList();
            f.a aVar = new f.a("DX_LifeCycle", "DX_LifeCycle", f.DX_LIFECYCLE_MONITOR);
            Map<String, Object> i = s26.i();
            if (i != null) {
                aVar.f = new HashMap();
                for (Map.Entry<String, Object> entry : i.entrySet()) {
                    aVar.f.put(entry.getKey(), entry.getValue().toString());
                }
            }
            ((ArrayList) fVar.c).add(aVar);
            if (eb5.E()) {
                ic5.p(fVar);
                if (DinamicXEngine.j0()) {
                    h36.g("DXLifeCycleMonitor", "uploadToAppMonitor: " + JSON.toJSONString(i));
                }
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new a(fVar, i), 5000L);
            }
            s26.b(false);
            s26.h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f27752a;

        public c(Map map) {
            this.f27752a = map;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXLifeCycleMonitor$3");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences.Editor edit = s26.c().edit();
            String jSONString = JSON.toJSONString(this.f27752a);
            edit.putString(s26.LOCAL_CACHE_DATA_KEY, jSONString);
            if (DinamicXEngine.j0()) {
                h36.g("DXLifeCycleMonitor", "saveToSp: " + jSONString);
            }
            edit.apply();
        }
    }

    static {
        t2o.a(444596897);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            t();
        }
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3847708d", new Object[0]);
        }
        return c;
    }

    public static void d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67c337b", new Object[]{dinamicXEngine});
        } else if (m()) {
            String c2 = dinamicXEngine.c();
            if (!TextUtils.isEmpty(c2)) {
                synchronized (f27750a) {
                    try {
                        j(c2).add(new WeakReference<>(dinamicXEngine));
                        int[] k = k(c2);
                        k[0] = k[0] + 1;
                        if (DinamicXEngine.j0()) {
                            h36.g("DXLifeCycleMonitor", "addEngine create: " + c2);
                        }
                        p();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e472528", new Object[]{str});
        } else if (m() && !TextUtils.isEmpty(str)) {
            synchronized (f27750a) {
                try {
                    int[] k = k(str);
                    k[4] = k[4] + 1;
                    if (DinamicXEngine.j0()) {
                        h36.g("DXLifeCycleMonitor", "addEngine destroy: " + str);
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9340291", new Object[]{str});
        } else if (m() && !TextUtils.isEmpty(str)) {
            synchronized (f27750a) {
                try {
                    int[] k = k(str);
                    k[2] = k[2] + 1;
                    if (DinamicXEngine.j0()) {
                        h36.g("DXLifeCycleMonitor", "addEngine resume: " + str);
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("521f151c", new Object[]{str});
        } else if (m() && !TextUtils.isEmpty(str)) {
            synchronized (f27750a) {
                try {
                    int[] k = k(str);
                    k[3] = k[3] + 1;
                    if (DinamicXEngine.j0()) {
                        h36.g("DXLifeCycleMonitor", "addEngine stop: " + str);
                    }
                    p();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d51c8f", new Object[0]);
        } else if (m()) {
            SharedPreferences.Editor edit = c.edit();
            edit.clear();
            edit.apply();
        }
    }

    public static Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db86e8b5", new Object[0]);
        }
        String string = c.getString(LOCAL_CACHE_DATA_KEY, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return JSON.parseObject(string).getInnerMap();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<WeakReference<DinamicXEngine>> j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af23d2fe", new Object[]{str});
        }
        Map<String, List<WeakReference<DinamicXEngine>>> map = f27750a;
        List<WeakReference<DinamicXEngine>> list = (List) ((HashMap) map).get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ((HashMap) map).put(str, arrayList);
        return arrayList;
    }

    public static int[] k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("310912d1", new Object[]{str});
        }
        Map<String, int[]> map = b;
        int[] iArr = (int[]) ((HashMap) map).get(str);
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = new int[5];
        ((HashMap) map).put(str, iArr2);
        return iArr2;
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        if (c != null) {
            return true;
        }
        return false;
    }

    public static String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66dd5c12", new Object[]{str});
        }
        return "dx-0-" + str;
    }

    public static String o(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a77b86a6", new Object[]{iArr});
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    public static synchronized void p() {
        synchronized (s26.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84643f84", new Object[0]);
                return;
            }
            if (m() && !d) {
                q();
            }
        }
    }

    public static void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8b66e1", new Object[0]);
        } else {
            jb6.i(new c(s()));
        }
    }

    public static String r(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d125435", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<WeakReference<DinamicXEngine>> j = j(str);
        int[] k = k(str);
        Iterator<WeakReference<DinamicXEngine>> it = j.iterator();
        while (it.hasNext()) {
            WeakReference<DinamicXEngine> next = it.next();
            if (next == null) {
                it.remove();
            } else if (next.get() != null) {
                i++;
            } else {
                it.remove();
            }
        }
        k[1] = i;
        return o(k);
    }

    public static Map<String, String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("54b7e0b6", new Object[0]);
        }
        if (!m()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Map<String, List<WeakReference<DinamicXEngine>>> map = f27750a;
        synchronized (map) {
            try {
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    String str = (String) entry.getKey();
                    String r = r(str);
                    if (!TextUtils.isEmpty(r)) {
                        hashMap.put(n(str), r);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public static void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f170aa08", new Object[0]);
        } else {
            new Thread(new b(), "DXLifeCycleMonitor").start();
        }
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acaadb7c", new Object[0]);
        } else if (m()) {
            d = true;
            if (eb5.E()) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(), 5000L);
            } else {
                t();
            }
        }
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (context != null && !m()) {
            if (zg5.M3()) {
                if (DinamicXEngine.j0()) {
                    h36.g("DXConfigCenter", "全局 LowMemory 监听开");
                }
                c = context.getSharedPreferences(LOCAL_CACHE_PF_NAME, 0);
                if (DinamicXEngine.j0()) {
                    h36.g("DXLifeCycleMonitor", "init DXLifeCycleMonitor Success");
                }
            } else if (DinamicXEngine.j0()) {
                h36.g("DXConfigCenter", "Engine LifeCycle 上报关");
            }
        }
    }
}
