package tb;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class oyl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PERMISSION_ALLOW = "allow";
    public static final String PERMISSION_DENY = "deny";

    static {
        t2o.a(989856379);
    }

    public static synchronized a a(Context context, String[] strArr) {
        synchronized (oyl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("466cf51d", new Object[]{context, strArr});
            } else if (context == null) {
                throw new NullPointerException("context can not be null");
            } else if (strArr == null || strArr.length == 0) {
                throw new NullPointerException("permissions can not be null");
            } else {
                a aVar = new a();
                a.a(aVar, context);
                a.b(aVar, strArr);
                return aVar;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f25750a;
        public String[] b;
        public Runnable c;
        public n8d d;

        static {
            t2o.a(989856380);
        }

        public static /* synthetic */ Context a(a aVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("4f46ff4c", new Object[]{aVar, context});
            }
            aVar.f25750a = context;
            return context;
        }

        public static /* synthetic */ String[] b(a aVar, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("1c21263b", new Object[]{aVar, strArr});
            }
            aVar.b = strArr;
            return strArr;
        }

        public a d(n8d n8dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f63d8904", new Object[]{this, n8dVar});
            }
            this.d = n8dVar;
            return this;
        }

        public a e(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9f8def88", new Object[]{this, runnable});
            }
            if (runnable != null) {
                this.c = runnable;
                return this;
            }
            throw new NullPointerException("permissionGrantedRunnable is null");
        }

        public void c() {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.b) {
                try {
                    if (ContextCompat.checkSelfPermission(this.f25750a, str) != 0) {
                        arrayList.add(str);
                    }
                } catch (Throwable unused) {
                    this.c.run();
                    return;
                }
            }
            if (arrayList.size() == 0) {
                this.c.run();
            } else {
                ((dsw) this.d).a(arrayList);
            }
        }
    }

    public static Map<String, String> b(Context context, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("547ec96f", new Object[]{context, strArr});
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, str.contains(AttributionReporter.SYSTEM_PERMISSION) ? str : "android.permission.".concat(str));
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : hashMap.keySet()) {
            try {
                if (ContextCompat.checkSelfPermission(context, (String) hashMap.get(str2)) != 0) {
                    hashMap2.put(str2, PERMISSION_DENY);
                } else {
                    hashMap2.put(str2, PERMISSION_ALLOW);
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap2;
    }
}
