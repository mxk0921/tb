package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.android.navigationextern.model.IconIntroductoryDatasource;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lpj implements IconIntroductoryDatasource.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rqs f23493a;
    public rqs b;
    public final Handler e = new Handler(Looper.getMainLooper());
    public volatile boolean f = false;
    public final List<IconIntroductoryDatasource.b> g = new ArrayList();
    public final IconIntroductoryDatasource c = new IconIntroductoryDatasource(this);
    public final a.d d = new upj();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IconIntroductoryDatasource.b f23494a;

        public a(IconIntroductoryDatasource.b bVar) {
            this.f23494a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                lpj.a(lpj.this, this.f23494a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23495a;
        public final /* synthetic */ String b;
        public final /* synthetic */ NavigationTabMsgMode c;
        public final /* synthetic */ String d;

        public b(String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
            this.f23495a = str;
            this.b = str2;
            this.c = navigationTabMsgMode;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                opj.i(this.f23495a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23496a;
        public final /* synthetic */ Drawable b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public c(String str, Drawable drawable, String str2, int i) {
            this.f23496a = str;
            this.b = drawable;
            this.c = str2;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                opj.h(this.f23496a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IconIntroductoryDatasource.b f23497a;

        public d(IconIntroductoryDatasource.b bVar) {
            this.f23497a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:6:0x0020, B:8:0x002a, B:11:0x0032, B:13:0x0040, B:16:0x004e, B:18:0x005a, B:24:0x006d, B:25:0x007b, B:26:0x0088, B:28:0x0090, B:30:0x00a2, B:32:0x00a8, B:36:0x00b6, B:37:0x00f2), top: B:41:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a2 A[Catch: all -> 0x006a, TryCatch #0 {all -> 0x006a, blocks: (B:6:0x0020, B:8:0x002a, B:11:0x0032, B:13:0x0040, B:16:0x004e, B:18:0x005a, B:24:0x006d, B:25:0x007b, B:26:0x0088, B:28:0x0090, B:30:0x00a2, B:32:0x00a8, B:36:0x00b6, B:37:0x00f2), top: B:41:0x0020 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onHappen(com.taobao.phenix.intf.event.SuccPhenixEvent r9) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpj.d.onHappen(com.taobao.phenix.intf.event.SuccPhenixEvent):boolean");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IconIntroductoryDatasource.b f23498a;

        public e(IconIntroductoryDatasource.b bVar) {
            this.f23498a = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            Boolean d;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                d = opj.d(this.f23498a.e);
            } catch (Throwable th) {
                jhj.b("NavigationGuardianController", "addAlienEffectiveWithoutCommonMark error." + th + " dataCompat:" + this.f23498a);
                rpj.a("addAlienEffectiveWithoutCommonMark", th + "_bizCode_" + this.f23498a.e);
            }
            if (d != null && !d.booleanValue()) {
                String str = this.f23498a.c;
                if (str == null || !str.contains("inbox")) {
                    i = 11;
                } else {
                    i = 12;
                }
                lpj.e(lpj.this, this.f23498a.e, succPhenixEvent.getDrawable(), this.f23498a.f, i);
                ekf a2 = ekf.a();
                IconIntroductoryDatasource.b bVar = this.f23498a;
                a2.d(bVar.e, bVar.b, 14, bVar.g);
                lpj.f(lpj.this, this.f23498a);
                lpj.g(lpj.this, this.f23498a);
                return true;
            }
            TLog.loge(y9a.c(), "NavigationGuardianController", "addCommonMark indicatorView is null or selected.");
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IconIntroductoryDatasource.b f23499a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                f fVar = f.this;
                lpj.a(lpj.this, fVar.f23499a);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                f fVar = f.this;
                lpj.c(lpj.this, fVar.f23499a);
            }
        }

        public f(IconIntroductoryDatasource.b bVar) {
            this.f23499a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!lpj.h(lpj.this)) {
                lpj.i(lpj.this).add(this.f23499a);
            } else {
                IconIntroductoryDatasource.b bVar = this.f23499a;
                int i = bVar.f9044a;
                if (i == 11) {
                    lpj.j(lpj.this, bVar);
                } else if (i == 12) {
                    lpj.k(lpj.this).post(new a());
                } else if (i == 13) {
                    lpj.k(lpj.this).post(new b());
                }
            }
        }
    }

    public static /* synthetic */ void a(lpj lpjVar, IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fc76c7", new Object[]{lpjVar, bVar});
        } else {
            lpjVar.s(bVar);
        }
    }

    public static /* synthetic */ boolean b(lpj lpjVar, NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f410d27c", new Object[]{lpjVar, navigationTabMsgMode, str})).booleanValue();
        }
        return lpjVar.p(navigationTabMsgMode, str);
    }

    public static /* synthetic */ void c(lpj lpjVar, IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7377b6", new Object[]{lpjVar, bVar});
        } else {
            lpjVar.r(bVar);
        }
    }

    public static /* synthetic */ void d(lpj lpjVar, String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e650ef2b", new Object[]{lpjVar, str, str2, navigationTabMsgMode, str3});
        } else {
            lpjVar.B(str, str2, navigationTabMsgMode, str3);
        }
    }

    public static /* synthetic */ void e(lpj lpjVar, String str, Drawable drawable, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70116d0", new Object[]{lpjVar, str, drawable, str2, new Integer(i)});
        } else {
            lpjVar.A(str, drawable, str2, i);
        }
    }

    public static /* synthetic */ void f(lpj lpjVar, IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b784cb", new Object[]{lpjVar, bVar});
        } else {
            lpjVar.z(bVar);
        }
    }

    public static /* synthetic */ void g(lpj lpjVar, IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a66484c", new Object[]{lpjVar, bVar});
        } else {
            lpjVar.y(bVar);
        }
    }

    public static /* synthetic */ boolean h(lpj lpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0e8327c", new Object[]{lpjVar})).booleanValue();
        }
        return lpjVar.f;
    }

    public static /* synthetic */ List i(lpj lpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db0d9890", new Object[]{lpjVar});
        }
        return lpjVar.g;
    }

    public static /* synthetic */ void j(lpj lpjVar, IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7292cf", new Object[]{lpjVar, bVar});
        } else {
            lpjVar.q(bVar);
        }
    }

    public static /* synthetic */ Handler k(lpj lpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("74da0711", new Object[]{lpjVar});
        }
        return lpjVar.e;
    }

    public final void A(String str, Drawable drawable, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51197e07", new Object[]{this, str, drawable, str2, new Integer(i)});
        } else {
            this.e.post(new c(str, drawable, str2, i));
        }
    }

    public final void B(String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd08d66d", new Object[]{this, str, str2, navigationTabMsgMode, str3});
        } else {
            this.e.post(new b(str, str2, navigationTabMsgMode, str3));
        }
    }

    public void C() {
        rqs rqsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1c7628", new Object[]{this});
            return;
        }
        if (!wpj.j() || TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE)) {
            rqsVar = u();
        } else {
            rqsVar = t();
        }
        com.taobao.tao.navigation.a.X(rqsVar);
    }

    public final void l(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e13e9d", new Object[]{this, bVar});
        } else if ("inboxNum".equals(bVar.c) || "inboxText".equals(bVar.c) || "outboxText".equals(bVar.c) || "outboxNum".equals(bVar.c)) {
            m(bVar);
        } else if ("inbox".equals(bVar.c) || "outbox".equals(bVar.c)) {
            n(bVar);
        }
    }

    public final void m(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fec78a3f", new Object[]{this, bVar});
        } else {
            s0m.B().T(bVar.d.getString("picUrl")).succListener(new d(bVar)).fetch();
        }
    }

    public final void n(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e028fc5f", new Object[]{this, bVar});
        } else {
            s0m.B().T(bVar.d.getString("picUrl")).succListener(new e(bVar)).fetch();
        }
    }

    public final void o(IconIntroductoryDatasource.b bVar) {
        NavigationTabMsgMode navigationTabMsgMode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8989f465", new Object[]{this, bVar});
            return;
        }
        Boolean d2 = opj.d(bVar.e);
        if (d2 == null || d2.booleanValue()) {
            jhj.b("NavigationGuardianController", "addCommonMark indicatorView is null or selected.");
            return;
        }
        String string = bVar.d.getString(bVar.c);
        if (TextUtils.equals(bVar.c, "text")) {
            navigationTabMsgMode = NavigationTabMsgMode.GUARDIAN_TEXT;
        } else {
            navigationTabMsgMode = NavigationTabMsgMode.GUARDIAN_NUM;
        }
        if (p(navigationTabMsgMode, string)) {
            jhj.b("NavigationGuardianController", "addCommonMark indicatorView failed. " + bVar);
            return;
        }
        B(bVar.e, string, navigationTabMsgMode, bVar.f);
        ekf.a().d(bVar.e, bVar.b, 14, bVar.g);
        y(bVar);
        z(bVar);
    }

    public final boolean p(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1270effd", new Object[]{this, navigationTabMsgMode, str})).booleanValue();
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_TEXT && (TextUtils.isEmpty(str) || str.length() > 5)) {
            return true;
        }
        if (navigationTabMsgMode != NavigationTabMsgMode.GUARDIAN_NUM || ege.c(str)) {
            return false;
        }
        return true;
    }

    public final void q(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d42004d", new Object[]{this, bVar});
            return;
        }
        try {
            if ("alienEffect".equals(bVar.b)) {
                l(bVar);
            } else if ("commonMark".equals(bVar.b)) {
                o(bVar);
            }
        } catch (Throwable th) {
            jhj.b("NavigationGuardianController", "doAddOperation error." + th + " dataCompat:" + bVar);
            rpj.a("doAddOperation", th + "_bizCode_" + bVar.e);
        }
    }

    public final void r(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a18ee0e", new Object[]{this, bVar});
        } else {
            opj.f(bVar.e);
        }
    }

    public final void s(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb0ef66", new Object[]{this, bVar});
            return;
        }
        opj.a(bVar.e);
        opj.b(bVar.e);
        ekf.a().d(bVar.e, bVar.b, 15, null);
    }

    public final rqs t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqs) ipChange.ipc$dispatch("c50afc0", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new a.c(new ege());
        }
        return this.b;
    }

    public final rqs u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqs) ipChange.ipc$dispatch("ab63d200", new Object[]{this});
        }
        if (this.f23493a == null) {
            this.f23493a = new a.f();
        }
        return this.f23493a;
    }

    public void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!NavigationExternSwitch.s()) {
            TLog.loge(y9a.c(), "NavigationGuardianController", "init failed. switch is off");
        } else {
            this.c.d(context);
            com.taobao.tao.navigation.a.U(this.d);
            ekf.a().b();
        }
    }

    public void w(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("264ec664", new Object[]{this, bVar});
        } else {
            Coordinator.execute(new f(bVar));
        }
    }

    public final void y(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb424ff0", new Object[]{this, bVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) JSON.parse(bVar.f);
            if (jSONObject == null) {
                String c2 = y9a.c();
                TLog.loge(c2, "NavigationGuardianController", "sendUtExposure jsonObject is null. bizCode:" + bVar.e + " trackInfo:" + bVar.f);
                return;
            }
            w4v.b(bVar.e, bVar.b, bVar.c, jSONObject.getString("augeTrackInfo"));
        } catch (Throwable th) {
            String c3 = y9a.c();
            TLog.loge(c3, "NavigationGuardianController", "sendUtExposure error. bizCode:" + bVar.e + " trackInfo:" + bVar.f);
            rpj.a("NavigationGuardianController", th + "sendUtExposure error. bizCode:" + bVar.e);
        }
    }

    public final void z(IconIntroductoryDatasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273a821c", new Object[]{this, bVar});
            return;
        }
        String string = bVar.d.getString("disappearDuration");
        try {
            int parseInt = Integer.parseInt(string);
            if (parseInt == 0) {
                jhj.b("NavigationGuardianController", "startDelayRemoveOperation duration is 0. cancel delay remove bizCode:" + bVar.e);
                return;
            }
            this.e.postDelayed(new a(bVar), parseInt);
        } catch (NumberFormatException unused) {
            jhj.b("NavigationGuardianController", "startDelayRemoveOperation duration parse error. duration: " + string + " bizCode:" + bVar.e);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2214e2", new Object[]{this});
            return;
        }
        this.f = true;
        if (((ArrayList) this.g).isEmpty()) {
            TLog.loge(y9a.c(), "NavigationGuardianController", "onLaunchTaskAttached cacheDataCompat is empty.");
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            w((IconIntroductoryDatasource.b) it.next());
        }
        ((ArrayList) this.g).clear();
    }
}
