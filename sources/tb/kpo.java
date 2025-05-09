package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import com.taobao.update.result.BundleUpdateStep;
import java.util.HashMap;
import tb.s7j;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class kpo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLEAR_TIMEOUT = 1;
    public static final String TAG = "SafeMode";

    /* renamed from: a  reason: collision with root package name */
    public final Context f22824a;
    public final vm8 b;
    public final xs3 c;
    public final e d;
    public final HashMap<String, String> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Process.killProcess(Process.myPid());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qpo.a(kpo.this.f22824a, "EnterSafeMode");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qpo.a(kpo.this.f22824a, "ClearFiles");
            try {
                kpo.this.c.a();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class e extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lpo f22831a;

        public e(Looper looper, lpo lpoVar) {
            super(looper);
            this.f22831a = lpoVar;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/safemode/SafeModeBusiness$SafeModeHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1) {
                Log.e(kpo.TAG, "Fix Timeout");
                this.f22831a.onFinish();
                kpo.this.e.put("timeout", "30000");
            } else {
                super.handleMessage(message);
            }
        }
    }

    public kpo(Context context, String str, boolean z, lpo lpoVar) {
        this.f22824a = null;
        this.b = null;
        this.c = null;
        HashMap<String, String> hashMap = new HashMap<>();
        this.e = hashMap;
        this.f22824a = context instanceof Application ? context : context.getApplicationContext();
        this.b = new vm8();
        this.c = new xs3(context);
        hashMap.put("launch", "" + z);
        hashMap.put("version", str);
        this.d = new e(Looper.getMainLooper(), lpoVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e219cb4b", new Object[]{this});
        } else {
            this.b.execute(new c());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c33ce5", new Object[]{this});
            return;
        }
        this.c.c();
        this.b.execute(new a());
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2f8e4b", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent launchIntentForPackage = this.f22824a.getPackageManager().getLaunchIntentForPackage(this.f22824a.getPackageName());
        launchIntentForPackage.addFlags(335544320);
        this.f22824a.startActivity(launchIntentForPackage);
        this.d.post(new b());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.kpo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class C0973a implements yjv.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0973a() {
            }

            @Override // tb.yjv.a
            public void hasPatched(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d4820c60", new Object[]{this, new Boolean(z)});
                }
            }

            @Override // tb.yjv.a
            public void patchFailed(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("839bcb76", new Object[]{this, str});
                    return;
                }
                qpo.a(kpo.this.f22824a, "PatchFail");
                Log.e(kpo.TAG, "Fix Fail");
            }

            @Override // tb.yjv.a
            public void patchStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("77e91881", new Object[]{this});
                } else {
                    Log.e(kpo.TAG, "patch Start");
                }
            }

            @Override // tb.yjv.a
            public void patchSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("890915a2", new Object[]{this});
                    return;
                }
                qpo.a(kpo.this.f22824a, "PatchSuccess");
                Log.e(kpo.TAG, "Fix Success");
            }

            @Override // tb.yjv.a
            public void patching(BundleUpdateStep bundleUpdateStep) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2d52632a", new Object[]{this, bundleUpdateStep});
                    return;
                }
                Log.e(kpo.TAG, "patch" + bundleUpdateStep.toString());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class b implements s7j.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.s7j.b
            public void hasUpdate(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7413e254", new Object[]{this, str});
                    return;
                }
                Log.e(kpo.TAG, "has update " + str);
                qpo.a(kpo.this.f22824a, "HasUpdate");
            }

            @Override // tb.s7j.b
            public void noUpdate() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("429a9d71", new Object[]{this});
                    return;
                }
                Log.e(kpo.TAG, "NO Fix");
                qpo.a(kpo.this.f22824a, "NoUpdate");
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                kjv.getInstance().init((Application) kpo.this.f22824a, "taobao4android", TaoPackageInfo.getTTIDNum(), false, new bjv());
                InstantPatchUpdater.instance().init(kpo.this.f22824a);
                kjv.getInstance().registerListener(gjv.HOTPATCH, InstantPatchUpdater.instance());
                InstantPatchUpdater.instance().patchProcessListener(new C0973a());
                ((s7j) kjv.getInstance().getUpdater(gjv.MTOP_SOURCE)).setMtopDataListener(new b()).startUpdate(true, false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e711d9f0", new Object[]{this});
            return;
        }
        this.b.execute(new d());
        this.d.sendEmptyMessageDelayed(1, 35000L);
    }
}
