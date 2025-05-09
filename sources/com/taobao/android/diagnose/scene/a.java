package com.taobao.android.diagnose.scene;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.scene.SceneObserver;
import com.taobao.android.diagnose.scene.a;
import com.taobao.android.diagnose.scene.engine.reader.RulesManager;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.al7;
import tb.idh;
import tb.mk7;
import tb.nzb;
import tb.qk7;
import tb.t2o;
import tb.tx8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tx8 d = new tx8();

    /* renamed from: a  reason: collision with root package name */
    public final Context f7248a;
    public final qk7 b;
    public final RulesManager c;

    static {
        t2o.a(615514179);
    }

    public a(Context context, qk7 qk7Var) {
        this.f7248a = context;
        this.b = qk7Var;
        this.c = new RulesManager(context);
    }

    public static synchronized tx8 f() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tx8) ipChange.ipc$dispatch("9f30fa72", new Object[0]);
            }
            return d;
        }
    }

    public static boolean i(String str) {
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("366b6e7a", new Object[]{str})).booleanValue();
        }
        if (!mk7.p() || TextUtils.isEmpty(str) || (a2 = mk7.a()) == null || a2.isEmpty()) {
            return false;
        }
        return a2.contains(str);
    }

    public static synchronized <T> void p(String str, T t) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50f081b", new Object[]{str, t});
                return;
            }
            if (mk7.p() && !TextUtils.isEmpty(str)) {
                d.e(str, t);
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2afd385", new Object[]{this, str});
            return;
        }
        RulesManager rulesManager = this.c;
        if (rulesManager != null) {
            rulesManager.g(str);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff92e1b", new Object[]{this});
            return;
        }
        RulesManager rulesManager = this.c;
        if (rulesManager != null) {
            rulesManager.d(true, new Runnable() { // from class: tb.jto
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.j();
                }
            });
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        idh.a("SceneManager", "SceneManager init");
        if (!mk7.p()) {
            idh.b("SceneManager", "SceneManager is disable");
            return;
        }
        try {
            this.c.l(this);
            if (i("scene_screenshot")) {
                h();
            } else {
                idh.d("SceneManager", "ScreenShot scene is disable");
            }
        } catch (Exception e) {
            idh.c("SceneManager", "init failed: ", e);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd826d1d", new Object[]{this});
        } else {
            new SceneObserver(this.f7248a).d(new SceneObserver.a() { // from class: tb.ito
                @Override // com.taobao.android.diagnose.scene.SceneObserver.a
                public final void a(Uri uri, String str) {
                    a.this.k(uri, str);
                }
            });
        }
    }

    public final /* synthetic */ void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2e9a8d", new Object[]{this});
            return;
        }
        idh.a("SceneManager", "Trigger SCENE_CHANGE_CONFIG after force update!");
        n("scene_change_config", null);
    }

    public final /* synthetic */ void k(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741d2a03", new Object[]{this, uri, str});
            return;
        }
        boolean z = this.b.c().isInner;
        al7.b().a(new Runnable() { // from class: tb.kto
            @Override // java.lang.Runnable
            public final void run() {
                a.this.l();
            }
        });
    }

    public final /* synthetic */ void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e153bd8", new Object[]{this});
            return;
        }
        TLog.loge("Diagnose", "SceneManager", "onScreenShotScene");
        n("scene_screenshot", new tx8());
    }

    public int m(String str, tx8 tx8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3b910e4", new Object[]{this, str, tx8Var})).intValue();
        }
        if (tx8Var == null) {
            tx8Var = new tx8();
        }
        tx8Var.e("fact_biz_name", str);
        return n("scene_custom", tx8Var);
    }

    public int n(String str, tx8 tx8Var) {
        RulesManager rulesManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a33a955", new Object[]{this, str, tx8Var})).intValue();
        }
        if (i(str) && (rulesManager = this.c) != null) {
            return rulesManager.p(str, tx8Var);
        }
        return 0;
    }

    public void o(nzb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40f753b0", new Object[]{this, aVar});
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc117c27", new Object[]{this, str});
            return;
        }
        RulesManager rulesManager = this.c;
        if (rulesManager != null) {
            rulesManager.t(str);
        }
    }
}
