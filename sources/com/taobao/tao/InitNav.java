package com.taobao.tao;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmainfragment.SupportActivity;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.weex.adapter.TBWXNavPreProcessor;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.bew;
import tb.bph;
import tb.ffh;
import tb.har;
import tb.hwe;
import tb.hx9;
import tb.iiz;
import tb.jzm;
import tb.nlq;
import tb.nx9;
import tb.olq;
import tb.qxq;
import tb.rnj;
import tb.sxf;
import tb.t2o;
import tb.tnj;
import tb.ud2;
import tb.unj;
import tb.vd2;
import tb.vow;
import tb.xnj;
import tb.ymj;
import tb.zao;
import tb.zxf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitNav implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> sFragmentMap = new HashMap<String, String>() { // from class: com.taobao.tao.InitNav.1
        {
            put("miniDetail", "com.alibaba.triver.triver_weex.minidetail.MiniDetailWeexFragment");
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements jzm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f11873a;
        public long b = 0;
        public String c = "";
        public String d = "";
        public int e = -1;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.InitNav$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0670a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f11874a;

            public RunnableC0670a(String str) {
                this.f11874a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (String str : TextUtils.split(this.f11874a, "##")) {
                    a.f(a.this, "NavDuration", str);
                }
            }
        }

        public a(InitNav initNav) {
        }

        public static /* synthetic */ void f(a aVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eecfdb79", new Object[]{aVar, str, str2});
            } else {
                aVar.g(str, str2);
            }
        }

        @Override // tb.jzm
        public void a(Context context, String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9183bf13", new Object[]{this, context, str, th});
                return;
            }
            if (this.e == -1) {
                this.e = new Random().nextInt(nx9.h());
            }
            if (this.e < 1) {
                String i = i(PushMessageHelper.ERROR_TYPE, str);
                g("NavError", i + i(MUSAppMonitor.ERROR_MSG, th.toString()));
            }
        }

        @Override // tb.jzm
        public void d(Context context, xnj xnjVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2611d678", new Object[]{this, context, xnjVar, new Long(j)});
            } else {
                e(context, xnjVar.name(), j);
            }
        }

        public final void g(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e2c182a", new Object[]{this, str, str2});
                return;
            }
            try {
                AppMonitor.Counter.commit("Nav", str, str2, 1.0d);
                TLog.loge("Nav", "InitNav", "count app monitor, point is " + str + ", value is " + str2);
            } catch (Throwable th) {
                TLog.loge("Nav", "InitNav", "count failed" + th);
            }
        }

        public final void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("974c5d7e", new Object[]{this, str});
            } else {
                Coordinator.execute(new RunnableC0670a(str));
            }
        }

        public final String i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f34444bf", new Object[]{this, str, str2});
            }
            return str + ":" + str2 + ",";
        }

        public final void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9006477b", new Object[]{this});
                return;
            }
            this.b = 0L;
            this.c = "";
        }

        @Override // tb.jzm
        public void b(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("813e0ecc", new Object[]{this, context, str});
            } else if (this.f11873a < 1) {
                this.c += i(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.d);
                String str2 = this.c + i(iiz.PERF_STAG_TOTAL, String.valueOf(SystemClock.uptimeMillis() - this.b));
                this.c = str2;
                h(str2);
                this.f11873a = 1000000;
            }
        }

        @Override // tb.jzm
        public void c(Context context, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62c4581a", new Object[]{this, context, str});
                return;
            }
            int nextInt = new Random().nextInt(nx9.g());
            this.f11873a = nextInt;
            if (nextInt >= 1) {
                TLog.loge("Nav", "InitNav", "random threshold: " + this.f11873a + ", so skip monitor");
                return;
            }
            j();
            this.d = str;
            this.b = SystemClock.uptimeMillis();
        }

        @Override // tb.jzm
        public void e(Context context, String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b08cd3", new Object[]{this, context, str, new Long(j)});
            } else if (this.f11873a < 1) {
                this.c += i(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.d);
                this.c += i("name", str);
                this.c += i("dur", String.valueOf(j));
                this.c += "##";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ffh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(InitNav initNav) {
        }

        @Override // tb.ffh
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            } else {
                TLog.loge(str, str2);
            }
        }

        @Override // tb.ffh
        public void w(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
            } else {
                TLog.logw(str, str2);
            }
        }

        @Override // tb.ffh
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            } else {
                TLog.loge(str, str2, th);
            }
        }

        @Override // tb.ffh
        public void w(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            } else {
                TLog.logw(str, str2, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements JumpAbility {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(InitNav initNav) {
        }

        @Override // com.taobao.android.nav.jump.JumpAbility
        public boolean a(zxf zxfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cffdef9a", new Object[]{this, zxfVar})).booleanValue();
            }
            if (zxfVar == null) {
                return false;
            }
            nlq nlqVar = new nlq();
            nlqVar.i(zxfVar.b.d());
            nlqVar.r(zxfVar.f33073a);
            nlqVar.q(new WeakReference<>(zxfVar.b.e()));
            nlqVar.s(Integer.valueOf(zxfVar.b.i()));
            zao l = olq.l(nlqVar, null);
            TBMainLog.tlog("NavJumpAbility", "jump: " + l.f32653a + " " + l.b + " " + l.c);
            return l.f32653a;
        }

        @Override // com.taobao.android.nav.jump.JumpAbility
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39a566be", new Object[]{this});
            }
            return JumpAbility.JUMP_ABILITY_FLOATING_WINDOW;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Nav.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(InitNav initNav) {
        }

        public void a(Context context, String str, Exception exc, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b6bc6e", new Object[]{this, context, str, exc, new Boolean(z)});
            } else if (!z || (context != null && context.getString(R.string.package_type).equals("1") && context.getString(R.string.publish_type).equals("0"))) {
                String access$100 = InitNav.access$100(str);
                ud2 ud2Var = new ud2();
                if (!TextUtils.isEmpty(str)) {
                    ud2Var.b = AggregationType.CONTENT;
                    ud2Var.d = access$100;
                    ud2Var.j = str;
                    ud2Var.k = exc;
                } else {
                    ud2Var.b = AggregationType.STACK;
                    ud2Var.k = exc;
                }
                ud2Var.f29301a = "EVENT_NAV_ERROR";
                vd2.a().c(context, ud2Var);
            }
        }
    }

    static {
        t2o.a(775946310);
    }

    public static /* synthetic */ String access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30255a5e", new Object[]{str});
        }
        return simpleUrl(str);
    }

    private static String simpleUrl(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e146932", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements JumpAbility {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(InitNav initNav) {
        }

        @Override // com.taobao.android.nav.jump.JumpAbility
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("39a566be", new Object[]{this});
            }
            return JumpAbility.NAV_JUMP_ABILITY_FRAGMENT;
        }

        public final Bundle c(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("2776af8b", new Object[]{this, intent});
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return extras.getBundle(qxq.KEY_FRAGMENT_ARGS);
        }

        public final Bundle d(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("32e674f0", new Object[]{this, intent});
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return null;
            }
            return extras.getBundle(qxq.KEY_FRAGMENT_BUNDLE);
        }

        public final String e(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f6b7e60b", new Object[]{this, intent});
            }
            Bundle d = d(intent);
            if (d == null) {
                return null;
            }
            return d.getString(qxq.KEY_FRAGMENT_NAME);
        }

        @Override // com.taobao.android.nav.jump.JumpAbility
        public boolean a(zxf zxfVar) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cffdef9a", new Object[]{this, zxfVar})).booleanValue();
            }
            if (!nx9.o()) {
                TBMainLog.tlog("FragmentJumpAbility", "can not jump for jump ability switch off");
                return false;
            } else if (zxfVar == null) {
                TBMainLog.tlog("FragmentJumpAbility", "jumpIntentCompat is null");
                return false;
            } else {
                Context d = zxfVar.b.d();
                if (!nx9.q(d)) {
                    TBMainLog.tlog("FragmentJumpAbility", "can not jump for switch off");
                    return false;
                }
                if (d instanceof bew) {
                    d = ((bew) d).b();
                }
                if (!(d instanceof SupportActivity)) {
                    TBMainLog.tlog("FragmentJumpAbility", "dx context is not SupportActivity");
                    return false;
                }
                SupportActivity supportActivity = (SupportActivity) d;
                if (supportActivity.isDestroyed()) {
                    TBMainLog.tlog("FragmentJumpAbility", "context is destroyed. " + supportActivity);
                    har.a("context_is_destroyed", supportActivity.getClass().getName());
                    return false;
                }
                FragmentManager supportFragmentManager = supportActivity.getSupportFragmentManager();
                if (supportFragmentManager == null) {
                    TBMainLog.tlog("FragmentJumpAbility", "fragment manager is null");
                    return false;
                }
                int f = qxq.f(supportFragmentManager);
                if (f >= 3) {
                    TBMainLog.tlog("FragmentJumpAbility", "fragment count is " + f);
                    return false;
                }
                String e = e(zxfVar.f33073a);
                if (e == null) {
                    TBMainLog.tlog("FragmentJumpAbility", "fragmentName is null");
                    return false;
                }
                try {
                    Intent intent = zxfVar.f33073a;
                    z = hx9.b((SupportActivity) d, intent, e, c(intent));
                } catch (Throwable th) {
                    TBMainLog.tlog("FragmentJumpAbility", "jump to fragment error: " + th);
                }
                if (z) {
                    AppMonitor.Counter.commit(qxq.SAVE_INSTANCE_MODULE_NAME, qxq.JUMP_TO_FRAGMENT, 1.0d);
                    zxfVar.b.B(true, "TBFragmentHookProcessor");
                    zxfVar.b.A(true, "TBFragmentHookProcessor");
                }
                TBMainLog.tlog("FragmentJumpAbility", "jump to fragment: " + e + " ret: " + z);
                return z;
            }
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        Nav.initSwitch(application);
        Nav.setProcessorMonitor(new a(this));
        bph.c(new b(this));
        Nav.setNavResolver(new com.taobao.android.nav.a());
        Nav.setGlobalTransition(R.anim.push_left_in, R.anim.push_left_out);
        Nav.registerPriorHooker(new hwe(), 1);
        sxf.b().c(new c(this));
        sxf.b().c(new d(this));
        Nav.registerPreprocessor(new tnj());
        Nav.registerPreprocessor(new ymj());
        Nav.registerPreprocessor(new NavHyBridPreProcessor());
        Nav.registerPreprocessor(new com.taobao.android.nav.b());
        Nav.registerPreprocessor(new TBWXNavPreProcessor());
        Nav.registerStickPreprocessor(new NavMunionAdPreProcessor());
        Nav.registerPreprocessor(new vow());
        Nav.registerPreprocessor(new rnj());
        Nav.registerAfterProcessor(new unj());
        Nav.registerNavMonitor(new e(this));
    }
}
