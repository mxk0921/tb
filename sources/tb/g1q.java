package tb;

import android.graphics.Color;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.jsbridge.TBSkinThemeWVPlugin;
import com.taobao.android.festival.skin.SkinConfig;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;
import java.util.Map;
import tb.k1q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g1q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final g1q b = new g1q();

    /* renamed from: a  reason: collision with root package name */
    public final k1q f19683a = k1q.q();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements k1q.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.g1q$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0931a extends Coordinator.TaggedRunnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0931a(String str) {
                super(str);
            }

            public static /* synthetic */ Object ipc$super(C0931a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/skin/SkinManager$1$1");
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    g1q.a(g1q.this).A();
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    x9q.a();
                }
            }
        }

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97f869b2", new Object[]{this});
                return;
            }
            g1q.a(g1q.this).k();
            Coordinator.execute(new b());
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            g1q.this.o();
            Coordinator.postTask(new C0931a("updateSkin"), 10000);
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f442e1f5", new Object[]{this});
            } else {
                g1q.this.o();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends AsyncTask<SkinConfig, Void, h1q> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xkb f19687a;
        public final /* synthetic */ String b;

        public b(xkb xkbVar, String str) {
            this.f19687a = xkbVar;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/skin/SkinManager$2");
        }

        /* renamed from: a */
        public h1q doInBackground(SkinConfig... skinConfigArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h1q) ipChange.ipc$dispatch("6e4315d7", new Object[]{this, skinConfigArr});
            }
            return g1q.a(g1q.this).f(skinConfigArr[0]);
        }

        /* renamed from: b */
        public void onPostExecute(h1q h1qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f59efce2", new Object[]{this, h1qVar});
            } else if (h1qVar.a()) {
                g1q.this.o();
                this.f19687a.onSuccess(this.b);
                TLog.loge("SkinManager", "setCurrentSkin", "commitSuccess");
            } else {
                this.f19687a.onError(this.b, "NO_DATA", "no downloadSync data");
                TLog.loge("SkinManager", "setCurrentSkin", "commitFail" + h1qVar.c + ":" + h1qVar.b);
            }
        }
    }

    static {
        t2o.a(464519236);
    }

    public static /* synthetic */ k1q a(g1q g1qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1q) ipChange.ipc$dispatch("49e10855", new Object[]{g1qVar});
        }
        return g1qVar.f19683a;
    }

    public static g1q h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1q) ipChange.ipc$dispatch("f00dee71", new Object[0]);
        }
        return b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d18562", new Object[]{this})).booleanValue();
        }
        return this.f19683a.h();
    }

    public int d(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd35252e", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        return e(f(str, str2), i);
    }

    public final int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b982b9d", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6204afec", new Object[]{this, str, str2});
        }
        return this.f19683a.n(str, str2);
    }

    public int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e6486fb", new Object[]{this, str, new Integer(i)})).intValue();
        }
        return e(f("global", str), i);
    }

    public Map<String, String> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc22d04a", new Object[]{this, str});
        }
        return this.f19683a.r(str);
    }

    public String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f88e7cb6", new Object[]{this, str});
        }
        String l = this.f19683a.l(RemoteMessageConst.Notification.SOUND, str);
        return !TextUtils.isEmpty(l) ? l : "";
    }

    public String k(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("569aa18a", new Object[]{this, str, str2, new Boolean(z)});
        }
        String f = f(str, str2);
        if (TextUtils.isEmpty(f)) {
            f = "";
        }
        SkinConfig o = this.f19683a.o();
        if (o != null && !TextUtils.isEmpty(o.skinCode) && !this.f19683a.t().contains(o.skinCode)) {
            if (f.endsWith(".png")) {
                str3 = this.f19683a.m(str, str2, ".png");
            } else if (f.endsWith(".jpg")) {
                str3 = this.f19683a.m(str, str2, ".jpg");
            } else if (f.endsWith(".apng")) {
                str3 = this.f19683a.m(str, str2, ".apng");
            } else {
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        if (z && n1q.b(f)) {
            f = ImageStrategyDecider.decideUrl(f, 960, 960, null);
        }
        if (TextUtils.isEmpty(f)) {
            return "";
        }
        return f;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f19683a.v(new a());
        fsw.i("TBSkinThemeWVPlugin", TBSkinThemeWVPlugin.class, true);
    }

    public boolean m(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f24a39f8", new Object[]{this, str})).booleanValue();
        }
        if (this.f19683a.p() == null || (map = this.f19683a.p().get(str)) == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb84ec2", new Object[]{this, str, str2})).booleanValue();
        }
        return !TextUtils.isEmpty(f(str, str2));
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7f793d", new Object[]{this});
        } else {
            wl2.c(Globals.getApplication(), FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE);
        }
    }

    public void q(SkinConfig skinConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d452afc", new Object[]{this, skinConfig});
        } else {
            this.f19683a.C(skinConfig);
        }
    }

    public SkinConfig r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkinConfig) ipChange.ipc$dispatch("91c86d4d", new Object[]{this});
        }
        return this.f19683a.o();
    }

    public void c(String str, xkb xkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb4128", new Object[]{this, str, xkbVar});
        } else if (TextUtils.isEmpty(str)) {
            xkbVar.onError(str, "NO_PARAMS", "no params");
            TLog.loge("SkinManager", "downloadSkin", "no params");
        } else {
            try {
                SkinConfig skinConfig = (SkinConfig) JSON.parseObject(str, SkinConfig.class);
                if (skinConfig != null && skinConfig.isValidConfig()) {
                    if (this.f19683a.g(skinConfig)) {
                        xkbVar.onSuccess(str);
                    } else {
                        new e1q(str, skinConfig, xkbVar).execute(new Void[0]);
                    }
                }
            } catch (Throwable unused) {
                xkbVar.onError(str, "PARAMS_ERROR", "error params format");
                TLog.loge("SkinManager", "downloadSkin", "error format");
            }
        }
    }

    public void p(String str, xkb xkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84146a17", new Object[]{this, str, xkbVar});
        } else if (TextUtils.isEmpty(str)) {
            TLog.loge("SkinManager", "setCurrentSkin", "no params");
            xkbVar.onError(str, "NO_PARAMS", "no params");
        } else {
            try {
                SkinConfig skinConfig = (SkinConfig) JSON.parseObject(str, SkinConfig.class);
                if (skinConfig.isValidConfig()) {
                    new b(xkbVar, str).execute(skinConfig);
                } else if (!TextUtils.isEmpty(skinConfig.skinCode) || !TextUtils.isEmpty(skinConfig.skinUrl)) {
                    xkbVar.onError(str, "PARAMS_ERROR", "skinCode or skinUrl should not be null");
                    TLog.loge("SkinManager", "setCurrentSkin", "skinCode or skinUrl should not be null");
                } else {
                    this.f19683a.y();
                    xkbVar.onSuccess(str);
                    o();
                }
            } catch (Throwable unused) {
                xkbVar.onError(str, "PARAMS_ERROR", "error params format");
                TLog.loge("SkinManager", "setCurrentSkin", "error format");
            }
        }
    }
}
