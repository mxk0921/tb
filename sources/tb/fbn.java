package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fbn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f19171a;
    public static final Set<String> b = new CopyOnWriteArraySet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements c52 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f19172a;

        public a(Context context) {
            this.f19172a = context;
        }

        @Override // tb.c52
        public void b(d52 d52Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f4b58cf", new Object[]{this, d52Var});
            } else if (!d52Var.d()) {
                RSoLog.d("RSoLite, triggerSetup(), batch request has failed");
            } else if (!fbn.a()) {
                RSoLog.d("RSoLite, triggerSetup(), data not expired, skip");
            } else {
                Context applicationContext = this.f19172a.getApplicationContext();
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("rso_lite", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                for (String str : sharedPreferences.getAll().keySet()) {
                    edit.remove(str);
                    RSoLog.d("RSoLite, triggerSetup(), remove key = " + str);
                }
                String str2 = applicationContext.getApplicationInfo().sourceDir;
                edit.putString("apk_path", str2);
                RSoLog.d("RSoLite, triggerSetup(), save new apkPath = " + str2);
                for (b79 b79Var : d52Var.c()) {
                    String e = b79Var.e();
                    String d = b79Var.d();
                    RSoLog.d("RSoLite, triggerSetup(), save lib & path for " + e + "=" + d);
                    edit.putString(e, d);
                }
                edit.commit();
                RSoLog.d("RSoLite, triggerSetup(), sp commit done");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int ERR_CTX_NULL = 102;
        public static final int ERR_DATA_EXPIRED = 104;
        public static final int ERR_LIB_NAME_EMPTY = 103;
        public static final int ERR_LIB_PATH_NULL = 105;
        public static final int ERR_NO = 101;
        public static final int ERR_UNKNOWN = 106;

        /* renamed from: a  reason: collision with root package name */
        public final String f19173a;

        public b(int i, String str, String str2) {
            this.f19173a = str2;
        }

        public static b a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d84ecb2c", new Object[]{new Integer(i), str});
            }
            return new b(i, str, null);
        }

        public static b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7f407224", new Object[]{str});
            }
            return new b(101, null, str);
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f19171a;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136d939c", new Object[]{context});
            return;
        }
        try {
            if (context == null) {
                rbn.e("RSoLite.triggerSetup.ERR_CTX_NULL", "context is null, availableLibs=" + b);
                return;
            }
            StringBuilder sb = new StringBuilder("triggerSetup(), targetLibs = ");
            Set<String> set = b;
            sb.append(set);
            Log.e("RemoteSo.RSoLite", sb.toString());
            bzn.b().e(new ArrayList(set), new a(context));
        } catch (Throwable th) {
            rbn.g("RSoLite.triggerSetup.failed:", th);
        }
    }

    public static b b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e950edc1", new Object[]{context, str});
        }
        try {
            if (context == null) {
                Log.e("RemoteSo.RSoLite", "fetch(), context == null");
                return b.a(102, "context is null, libName=" + str);
            } else if (trq.c(str)) {
                Log.e("RemoteSo.RSoLite", "fetch(), libName is empty");
                return b.a(103, "libName is empty");
            } else {
                Set<String> set = b;
                ((CopyOnWriteArraySet) set).add(str);
                Log.e("RemoteSo.RSoLite", "fetch(), lib = " + str + ", now targetLibs = " + set);
                Context applicationContext = context.getApplicationContext();
                String str2 = applicationContext.getApplicationInfo().sourceDir;
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("rso_lite", 0);
                String string = sharedPreferences.getString("apk_path", "empty");
                if (trq.f(string, str2)) {
                    Log.e("RemoteSo.RSoLite", "fetch(), data expired, currentApkPath = " + str2 + ", recordApkPath=" + string);
                    f19171a = true;
                    return b.a(104, "recordApkPath=" + string + ", currentApkPath=" + str2);
                }
                Log.e("RemoteSo.RSoLite", "fetch(), data expired, currentApkPath == recordApkPath :" + str2);
                String string2 = sharedPreferences.getString(str, null);
                if (trq.c(string2)) {
                    Log.e("RemoteSo.RSoLite", "fetch(), libPath is empty for lib=" + str);
                    return b.a(105, "libPath is null");
                }
                Log.e("RemoteSo.RSoLite", "fetch(), success libPath=" + string2);
                return b.b(string2);
            }
        } catch (Throwable th) {
            Log.e("RemoteSo.RSoLite", "RSoLite.fetch failed:", th);
            return b.a(106, th.toString());
        }
    }
}
