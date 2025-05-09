package tb;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.trigger.adapter.TriggerControllerInfoManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.application.common.IApmEventListener;
import com.taobao.login4android.api.Login;
import com.taobao.tbpoplayer.watermask.WaterMaskInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Uri k;
    public static final Pattern l;

    /* renamed from: a  reason: collision with root package name */
    public ContentResolver f22990a;
    public ContentObserver c;
    public IApmEventListener d;
    public SimpleDateFormat f;
    public final Set<String> b = new HashSet();
    public boolean e = false;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public volatile boolean h = false;
    public long i = 0;
    public final Map<String, end> j = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DO_BACKGROUND = 3;
        public static final int DO_FOREGROUND = 2;
        public static final int DO_REGISTER_LISTENER = 6;
        public static final int DO_RESUME = 5;
        public static final int DO_SCREEN_SHOT = 4;
        public static final int DO_START = 0;
        public static final int DO_STOP = 1;
        public static final int DO_UNREGISTER_LISTENER = 7;

        /* renamed from: a  reason: collision with root package name */
        public final kxo f22992a;
        public final int b;
        public final Object[] c;

        static {
            t2o.a(790626569);
        }

        public b(kxo kxoVar, int i, Object... objArr) {
            this.f22992a = kxoVar;
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.b;
            if (i == 0) {
                kxo.d(this.f22992a);
            } else if (i == 1) {
                kxo.e(this.f22992a);
            } else if (i == 2) {
                kxo.f(this.f22992a);
            } else if (i == 3) {
                kxo.g(this.f22992a);
            } else if (i == 4) {
                kxo kxoVar = this.f22992a;
                Object[] objArr = this.c;
                kxo.h(kxoVar, (Uri) objArr[0], ((Long) objArr[1]).longValue());
            } else if (i == 6) {
                kxo kxoVar2 = this.f22992a;
                Object[] objArr2 = this.c;
                kxo.i(kxoVar2, (String) objArr2[0], (end) objArr2[1]);
            } else if (i == 7) {
                kxo.j(this.f22992a, (String) this.c[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final kxo f22993a = new kxo();

        static {
            t2o.a(790626570);
        }

        public static /* synthetic */ kxo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kxo) ipChange.ipc$dispatch("bc848a9", new Object[0]);
            }
            return f22993a;
        }
    }

    static {
        t2o.a(790626567);
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        k = uri;
        l = Pattern.compile(uri + "/[0-9]+");
    }

    public static /* synthetic */ void d(kxo kxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990df322", new Object[]{kxoVar});
        } else {
            kxoVar.m();
        }
    }

    public static /* synthetic */ void e(kxo kxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a5f82a3", new Object[]{kxoVar});
        } else {
            kxoVar.n();
        }
    }

    public static /* synthetic */ void f(kxo kxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb11224", new Object[]{kxoVar});
        } else {
            kxoVar.v();
        }
    }

    public static /* synthetic */ void g(kxo kxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d02a1a5", new Object[]{kxoVar});
        } else {
            kxoVar.z();
        }
    }

    public static /* synthetic */ void h(kxo kxoVar, Uri uri, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2721fe03", new Object[]{kxoVar, uri, new Long(j)});
        } else {
            kxoVar.l(uri, j);
        }
    }

    public static /* synthetic */ void i(kxo kxoVar, String str, end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3ef5ac", new Object[]{kxoVar, str, endVar});
        } else {
            kxoVar.k(str, endVar);
        }
    }

    public static /* synthetic */ void j(kxo kxoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7527bff2", new Object[]{kxoVar, str});
        } else {
            kxoVar.o(str);
        }
    }

    public static kxo q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxo) ipChange.ipc$dispatch("db570ba4", new Object[0]);
        }
        return c.a();
    }

    public boolean A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1dfcfa5", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            return false;
        }
        hst.b(new b(this, 7, str));
        return true;
    }

    public final void k(String str, end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c16b2e", new Object[]{this, str, endVar});
        } else {
            ((HashMap) this.j).put(str, endVar);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da3479e", new Object[]{this});
        } else if (!this.e) {
            wdm.a("ScreenshotMonitor.start screenshot monitor");
            v();
            c21.c(this.d);
            this.e = true;
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205a7134", new Object[]{this});
        } else if (this.e) {
            c21.k(this.d);
            z();
            ((HashSet) this.b).clear();
            this.e = false;
        }
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1d194c", new Object[]{this, str});
        } else {
            ((HashMap) this.j).remove(str);
        }
    }

    public void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        wdm.g("other", "", "ScreenshotMonitor.init");
        this.f22990a = context.getContentResolver();
        this.c = new a(null);
        this.d = new IApmEventListener() { // from class: tb.jxo
            @Override // com.taobao.application.common.IApmEventListener
            public final void onEvent(int i) {
                kxo.this.s(i);
            }
        };
    }

    public final boolean r(WaterMaskInfo.Scene scene, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9496690", new Object[]{this, scene, str, str2})).booleanValue();
        }
        if (scene == null || !scene.uris.contains(str) || !lto.a(str2, scene.filter)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152a49c3", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            this.g.set(true);
            this.h = true;
            hst.b(new b(this, 3, new Object[0]));
        } else if (i == 2) {
            this.g.set(true);
            this.h = false;
            hst.b(new b(this, 2, new Object[0]));
        }
    }

    public final /* synthetic */ void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af4ba63", new Object[]{this});
        } else {
            this.f22990a.registerContentObserver(k, true, this.c);
        }
    }

    public final /* synthetic */ void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c6f36b", new Object[]{this});
        } else {
            this.f22990a.unregisterContentObserver(this.c);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d66fd3", new Object[]{this});
        } else {
            hst.c(new Runnable() { // from class: tb.ixo
                @Override // java.lang.Runnable
                public final void run() {
                    kxo.this.t();
                }
            });
        }
    }

    public boolean w(String str, end endVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eb08ac7", new Object[]{this, str, endVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || str.length() > 100 || endVar == null) {
            return false;
        }
        hst.b(new b(this, 6, str, endVar));
        return true;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            hst.b(new b(this, 0, new Object[0]));
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42b099a", new Object[]{this});
        } else {
            hst.c(new Runnable() { // from class: tb.hxo
                @Override // java.lang.Runnable
                public final void run() {
                    kxo.this.u();
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Handler handler) {
            super(handler);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/watermask/screenshot/ScreenshotMonitor$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
            } else if (uri != null) {
                wdm.g("other", "", "ScreenshotMonitor.receive.ContentObserverChanged.uri=" + uri);
                hst.b(new b(kxo.this, 4, uri, Long.valueOf(System.currentTimeMillis())));
            }
        }
    }

    public final boolean x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5fa9cd0", new Object[]{this, str})).booleanValue();
        }
        try {
            if (!a9l.w().O()) {
                wdm.g("other", "", "ScreenShotMonitor.reportMiniTLog.orangeSwitch=false.cancel");
                return false;
            }
            WaterMaskInfo i = com.taobao.tbpoplayer.watermask.a.m().i();
            if (i != null && i.needReportLog) {
                long j = i.reportLogInterval;
                if (j < 0) {
                    j = 0;
                }
                long j2 = this.i;
                if (j2 <= 0 || j2 + (j * 1000) <= System.currentTimeMillis()) {
                    List<WaterMaskInfo.Scene> list = i.reportLogBlackPageList;
                    if (list != null && !list.isEmpty()) {
                        for (WaterMaskInfo.Scene scene : list) {
                            if (r(scene, TriggerControllerInfoManager.instance().getCurUri(), TriggerControllerInfoManager.instance().getCurActivityInfo())) {
                                wdm.d("ScreenShotMonitor.reportMiniTLog.hitTLogBlackPageList.matchId=" + scene.matchId, new Object[0]);
                                wdm.g("other", "", "ScreenShotMonitor.reportMiniTLog.hitTLogBlackPageList.cancel");
                                return false;
                            }
                        }
                    }
                    tx8 tx8Var = new tx8();
                    tx8Var.e("screenUuid", str);
                    nzb.b().c("taobao_screenshot_tracesource", tx8Var);
                    this.i = System.currentTimeMillis();
                    wdm.g("other", "", "ScreenShotMonitor.reportMiniTLog.reportLogSuccess.uuid=" + str);
                    return true;
                }
                wdm.g("other", "", "ScreenShotMonitor.reportMiniTLog.reportLogInterval.cancel");
                return false;
            }
            wdm.g("other", "", "ScreenShotMonitor.reportMiniTLog.needReportLog=false.cancel");
            return false;
        } catch (Throwable th) {
            wdm.h("ScreenShotMonitor.reportMiniTLog.error", th);
            return false;
        }
    }

    public final void l(Uri uri, long j) {
        boolean z;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab072e49", new Object[]{this, uri, new Long(j)});
            return;
        }
        try {
            if (!this.g.get()) {
                z = c21.g().getBoolean("isInBackground", false);
            } else {
                z = this.h;
            }
            if (z) {
                z();
                wdm.g("other", null, "[doScreenshotReport] background not allow to screenshot monitor.");
                return;
            }
            String uri2 = uri.toString();
            if (l.matcher(uri2).matches() && ((HashSet) this.b).add(uri2)) {
                String uuid = UUID.randomUUID().toString();
                boolean x = x(uuid);
                wdm.g("other", "", "[doScreenshotReport] uri=" + uri2 + ".time=" + j);
                if (FalcoGlobalTracer.get() == null || FalcoGlobalTracer.get().e() == null) {
                    str = "";
                } else {
                    str = FalcoGlobalTracer.get().e().getFalcoId();
                }
                String userId = Login.getUserId();
                String b2 = j21.b(TriggerControllerInfoManager.instance().getCurUri());
                String c2 = j21.c();
                if (this.f == null) {
                    this.f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                }
                String format = this.f.format(new Date(j));
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : ((HashMap) this.j).entrySet()) {
                        String str3 = (String) entry.getKey();
                        Map<String, String> a2 = ((end) entry.getValue()).a();
                        if (a2 != null && a2.size() > 0) {
                            if (a2.size() <= 50) {
                                JSONObject jSONObject2 = new JSONObject();
                                for (Map.Entry<String, String> entry2 : a2.entrySet()) {
                                    String key = entry2.getKey();
                                    String value = entry2.getValue();
                                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                                        jSONObject2.put(key, (Object) value);
                                    }
                                }
                                jSONObject.put(str3, (Object) jSONObject2);
                            }
                        }
                    }
                    if (!jSONObject.isEmpty()) {
                        str2 = jSONObject.toString();
                    } else {
                        str2 = "";
                    }
                } catch (Exception e) {
                    wdm.h("[doScreenshotReport] userinfo error.", e);
                    str2 = "";
                }
                wdm.g("other", "", "[doScreenshotReport] pageName =" + b2 + ".localTime=" + format + ".userInfoStr=" + str2);
                q71.g(str, userId, b2, c2, format, str2, uuid, x);
            }
        } catch (Throwable th) {
            wdm.h("doScreenshotReport.error", th);
        }
    }
}
