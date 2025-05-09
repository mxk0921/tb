package com.taobao.homepage.view.manager.broadcast;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess.OrderFinishedBroadcastReceiver;
import com.taobao.tao.topmultitab.service.festival.IFestivalService;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.a3w;
import tb.b3b;
import tb.bqa;
import tb.c4b;
import tb.f4b;
import tb.h1p;
import tb.kbq;
import tb.lq6;
import tb.n78;
import tb.nrv;
import tb.o78;
import tb.p78;
import tb.qul;
import tb.s2b;
import tb.s78;
import tb.sa8;
import tb.sfh;
import tb.t1c;
import tb.t2b;
import tb.t2o;
import tb.vqa;
import tb.vxl;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BroadcastManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SPLASH_CLOSE = "ACTION_TAOBAO_BOOTIMAGE_COLDSTART_FLASH_CLOSE";
    public static final String ACTION_SPLASH_SHOW = "ACTION_TAOBAO_BOOTIMAGE_COLDSTART_FLASH_SHOW";

    /* renamed from: a  reason: collision with root package name */
    public final z6d f10607a;
    public FestivalBroadcastReceiver b;
    public AreaChangeReceiver c;
    public final SettingReceiver d;
    public final boolean f = f4b.b("homeReceiverFlagsNotExported", true);
    public final OrderFinishedBroadcastReceiver e = new OrderFinishedBroadcastReceiver();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class AreaChangeReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<t2b> f10608a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                try {
                    CookieManager.getInstance().flush();
                } catch (Exception e) {
                    bqa.b("BroadcastManager", "writeCookie exception:", e);
                }
            }
        }

        static {
            t2o.a(729809170);
        }

        public AreaChangeReceiver(t2b t2bVar) {
            this.f10608a = new WeakReference<>(t2bVar);
        }

        public static /* synthetic */ Object ipc$super(AreaChangeReceiver areaChangeReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/manager/broadcast/BroadcastManager$AreaChangeReceiver");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7662a426", new Object[]{this});
            } else {
                Coordinator.execute(new a());
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            sfh.d("BroadcastManager", "AreaChangeReceiver.onReceive");
            String action = intent.getAction();
            t2b t2bVar = this.f10608a.get();
            if (t2bVar != null && t2bVar.d().k1() != null) {
                if (TextUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED") && !vxl.b().v()) {
                    b3b.g(null);
                    lq6.a().g("homepage", b3b.c());
                    sfh.f("BroadcastManager", "AreaChangeReceiver homepage " + b3b.c());
                    b(context);
                    qul.g();
                    nrv.a().c();
                    ChangeContainerProcess.d().e(ChangeContainerProcess.ChangeContainerType.edition);
                    sa8.a(t2bVar.d().k1());
                    s2b.c().a();
                } else if (TextUtils.equals(action, "com.taobao.social.family.add")) {
                    p78.c(context, o78.REFRESH_SOURCE_OLD_USER_BIND);
                }
            }
        }

        public final void b(Context context) {
            SimpleDateFormat simpleDateFormat;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdb808de", new Object[]{this, context});
                return;
            }
            String str = kbq.c(context).hngCookie;
            if (!TextUtils.isEmpty(str)) {
                String replace = str.replace("|", "%7C");
                Calendar instance = Calendar.getInstance();
                instance.add(1, 1);
                Date time = instance.getTime();
                new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).setTimeZone(TimeZone.getTimeZone("GMT"));
                String str2 = replace + ";" + ("expires=" + simpleDateFormat.format(time));
                try {
                    CookieManager.getInstance().setCookie(".taobao.com", "hng=" + str2);
                    CookieManager.getInstance().setCookie(h1p.TMALL_HOST, "hng=" + str2);
                    a();
                } catch (Exception e) {
                    bqa.b("BroadcastManager", "writeCookie exception:", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SettingReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<t2b> f10611a;

        static {
            t2o.a(729809173);
        }

        public SettingReceiver(t2b t2bVar) {
            this.f10611a = new WeakReference<>(t2bVar);
        }

        public static /* synthetic */ Object ipc$super(SettingReceiver settingReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/manager/broadcast/BroadcastManager$SettingReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            t2b t2bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!vxl.b().v() && (t2bVar = this.f10611a.get()) != null && t2bVar.d().k1() != null) {
                String stringExtra = intent.getStringExtra("TaoOptionKey");
                if (!TextUtils.isEmpty(stringExtra)) {
                    String stringExtra2 = intent.getStringExtra(stringExtra);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(stringExtra, (Object) stringExtra2);
                    String stringExtra3 = intent.getStringExtra(ParamsConstants.Key.PARAM_SCENE_CODE);
                    vqa.k().j("Broadcast").j("BroadcastManager.SettingReceiver.onReceive").g(stringExtra, stringExtra2).g(ParamsConstants.Key.PARAM_SCENE_CODE, stringExtra3).a();
                    ((t1c) n78.a(t1c.class)).doChangeVersion(s78.d().a(stringExtra3).b(a3w.h().f(stringExtra2).b(jSONObject)), null);
                }
            }
        }
    }

    static {
        t2o.a(729809169);
    }

    public BroadcastManager(t2b t2bVar) {
        z6d d = t2bVar.d();
        this.f10607a = d;
        this.b = new FestivalBroadcastReceiver(d);
        this.c = new AreaChangeReceiver(t2bVar);
        this.d = new SettingReceiver(t2bVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77516f0b", new Object[]{this});
            return;
        }
        bqa.d("BroadcastManager", "registerBoradcast");
        z6d z6dVar = this.f10607a;
        Activity k1 = z6dVar == null ? null : z6dVar.k1();
        if (k1 != null) {
            b(k1, this.b, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
        }
        Application application = Globals.getApplication();
        if (application != null) {
            LocalBroadcastManager.getInstance(application).registerReceiver(this.b, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
        }
        if (k1 != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
            intentFilter.addAction(o78.ACTION_LOCATION_CHANGED);
            intentFilter.addAction("com.taobao.social.family.add");
            intentFilter.addAction(o78.ACTION_LOCATION_RECEIVE);
            b(k1, this.c, intentFilter);
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.d, new IntentFilter("com.taobao.option.checkoption"));
        IntentFilter intentFilter2 = new IntentFilter(OrderFinishedBroadcastReceiver.ACTION_ORDER_DID_FINISHED);
        intentFilter2.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.e, intentFilter2);
    }

    public final void b(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986a21c4", new Object[]{this, activity, broadcastReceiver, intentFilter});
        } else if (Build.VERSION.SDK_INT < 26 || !this.f) {
            activity.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            activity.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d54640f", new Object[]{this});
            return;
        }
        bqa.d("BroadcastManager", "unregisterReceivers");
        if (this.b != null) {
            this.f10607a.k1().unregisterReceiver(this.b);
            LocalBroadcastManager.getInstance(this.f10607a.k1()).unregisterReceiver(this.b);
            this.b = null;
        }
        if (this.c != null) {
            this.f10607a.k1().unregisterReceiver(this.c);
            this.c = null;
        }
        if (this.e != null) {
            LocalBroadcastManager.getInstance(this.f10607a.k1()).unregisterReceiver(this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class FestivalBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<z6d> f10610a;

        static {
            t2o.a(729809172);
        }

        public FestivalBroadcastReceiver(z6d z6dVar) {
            this.f10610a = new WeakReference<>(z6dVar);
        }

        public static /* synthetic */ Object ipc$super(FestivalBroadcastReceiver festivalBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/manager/broadcast/BroadcastManager$FestivalBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IFestivalService iFestivalService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            sfh.d("BroadcastManager", "FestivalBroadcastReceiver.onReceive");
            z6d z6dVar = this.f10610a.get();
            if (z6dVar != null && z6dVar.k1() != null && a(intent.getStringExtra("extra-festival-change-reason")) && (iFestivalService = (IFestivalService) c4b.i().h(IFestivalService.class)) != null) {
                iFestivalService.onFestivalChanged();
            }
        }

        public final boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b6407f19", new Object[]{this, str})).booleanValue();
            }
            return !TextUtils.equals(str, FestivalMgr.SKIN_CHANGE_REASON_CONFIG_CHANGE) || !FestivalMgr.i().t();
        }
    }
}
