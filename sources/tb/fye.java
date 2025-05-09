package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.base.Versions;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.android.task.Coordinator;
import com.taobao.message.notification.base.VibratorAndMediaManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fye extends mss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements PanguApplication.CrossActivityLifecycleCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f19623a;
        public boolean b;
        public Coordinator.TaggedRunnable c;
        public Coordinator.TaggedRunnable d;
        public static final String[] groupNames = {"agoo"};
        public static volatile boolean e = false;
        public static volatile boolean f = false;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(String str) {
                super(str);
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitClipUrlWatcherLifeCycle$AgooConfigCrossActivityLifecycleObserver$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    bVar = b.this;
                } finally {
                    try {
                    } finally {
                    }
                }
                if (!bVar.b) {
                    b.b(bVar);
                    b.c(b.this);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.fye$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0930b implements y8l {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0930b() {
            }

            @Override // tb.y8l
            public void onConfigUpdate(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                } else {
                    b.d(b.this, OrangeConfig.getInstance().getConfig("agoo", "default", "default"));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c(String str) {
                super(str);
            }

            public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitClipUrlWatcherLifeCycle$AgooConfigCrossActivityLifecycleObserver$3");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    b.e = true;
                    b.this.a();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        public b() {
            this.b = false;
        }

        public static /* synthetic */ void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d716b612", new Object[]{bVar});
            } else {
                bVar.h();
            }
        }

        public static /* synthetic */ void c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("202dbcb1", new Object[]{bVar});
            } else {
                bVar.g();
            }
        }

        public static /* synthetic */ void d(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0bdb91a", new Object[]{bVar, str});
            } else {
                bVar.i(str);
            }
        }

        public static String e(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2a23613f", new Object[]{obj});
            }
            if (obj == null) {
                return "";
            }
            if (obj instanceof String) {
                return ((String) obj).toString();
            }
            if (obj instanceof Integer) {
                return "" + ((Integer) obj);
            } else if (obj instanceof Long) {
                return "" + ((Long) obj);
            } else if (obj instanceof Double) {
                return "" + ((Double) obj);
            } else if (obj instanceof Float) {
                return "" + ((Float) obj);
            } else if (obj instanceof Short) {
                return "" + ((Short) obj);
            } else if (obj instanceof Byte) {
                return "" + ((Byte) obj);
            } else if (obj instanceof Boolean) {
                return ((Boolean) obj).toString();
            } else {
                if (obj instanceof Character) {
                    return ((Character) obj).toString();
                }
                return obj.toString();
            }
        }

        public static String f(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f955fc7d", new Object[]{context});
            }
            try {
                return context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString("agooConfig", "");
            } catch (Throwable unused) {
                return "";
            }
        }

        public static final String j(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b3560e19", new Object[]{new Long(j)});
            }
            if (j == 0) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(j));
            } catch (Throwable unused) {
                return "none";
            }
        }

        public final void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("629ac11f", new Object[]{this});
                return;
            }
            i(OrangeConfig.getInstance().getConfig("agoo", "default", "default"));
            OrangeConfig.getInstance().registerListener(groupNames, new C0930b());
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc107b13", new Object[]{this, activity});
            } else {
                this.b = true;
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
            } else if (!e) {
                if (this.d == null) {
                    this.d = new c("pingAppStart");
                }
                Coordinator.postTask(this.d, 5000);
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
            }
        }

        public final void i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9aa2e996", new Object[]{this, str});
                return;
            }
            try {
            } catch (Exception e2) {
                if (Versions.isDebug()) {
                    new StringBuilder("saveAgooConfig fail:").append(e2.toString());
                }
            }
            if (!TextUtils.equals(str, "default")) {
                SharedPreferences.Editor edit = this.f19623a.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putString("agooConfig", str);
                edit.commit();
                Versions.isDebug();
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c56f72a", new Object[]{this});
                return;
            }
            String f2 = f(this.f19623a);
            if (!TextUtils.isEmpty(f2) && !TextUtils.equals(f2, "default")) {
                try {
                    JSONArray jSONArray = new JSONArray(f2);
                    int length = jSONArray.length();
                    if (length > 0) {
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray("app" + i);
                                if (jSONArray2 != null) {
                                    JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                    String string = jSONObject2.getString("action");
                                    String string2 = jSONObject2.getString("pack");
                                    String string3 = jSONObject2.getString("service");
                                    boolean z = jSONObject2.getBoolean("enabled");
                                    int i2 = jSONObject2.getInt(xxl.PERCENT);
                                    if (z) {
                                        TaobaoRegister.pingApp(this.f19623a, string, string2, string3, i2);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.e("AgooConfigObserver", "pingApp error,e=" + th.toString());
                }
            }
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5acab9d0", new Object[]{this});
                return;
            }
            try {
                SharedPreferences sharedPreferences = this.f19623a.getSharedPreferences("bindServiceConfig", 0);
                long j = sharedPreferences.getLong("last_time", 0L);
                new StringBuilder("AgooConfigCrossActivityLifecycleObserver,registerAgoo last_time=").append(j(j));
                if (System.currentTimeMillis() - j < 86400000) {
                    new StringBuilder("AgooConfigCrossActivityLifecycleObserver,registerAgoo_time is end.currentTime=").append(j(System.currentTimeMillis()));
                    return;
                }
                boolean z = PreferenceManager.getDefaultSharedPreferences(this.f19623a).getBoolean(VibratorAndMediaManager.ISOPENSERVICE, true);
                new StringBuilder("is_OpenService param,flag=").append(z);
                if (z) {
                    li0.a(this.f19623a);
                } else {
                    UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder("agooUnregister", 66001, e(UtilityImpl.getDeviceId(this.f19623a)), e(Boolean.valueOf(z)), null, null).build());
                    TaobaoRegister.unregister(this.f19623a, null);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_time", System.currentTimeMillis());
                edit.commit();
            } catch (Throwable th) {
                Log.e("AgooConfigObserver", "registerAgoo,error=" + th.toString());
            }
        }

        @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
        public void onCreated(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f00e362", new Object[]{this, activity});
                return;
            }
            this.f19623a = Globals.getApplication().getApplicationContext();
            this.b = false;
            if (this.c == null) {
                this.c = new a("remoteconfig");
            }
            if (!f) {
                f = true;
                Coordinator.postTask(this.c, 30000);
            }
        }
    }

    public fye(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(fye fyeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/biz/launcher/InitClipUrlWatcherLifeCycle");
    }

    @Override // tb.mss
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c246ea2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.mss
    public void p(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ea6706", new Object[]{this, application, hashMap});
            return;
        }
        p5f.a(application, hashMap);
        ((PanguApplication) application).registerCrossActivityLifecycleCallback(new b());
    }
}
