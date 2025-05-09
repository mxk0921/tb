package com.taobao.tao.topmultitab.service.editionswitch.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.TBEditionSwitcherElderHomePopBridge;
import com.taobao.android.editionswitcher.TBEditionSwitcherPopBridge;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.revision.ChangeContainerProcess;
import com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.b3b;
import tb.bqa;
import tb.bx;
import tb.cfc;
import tb.ddc;
import tb.f4b;
import tb.fsw;
import tb.h1p;
import tb.h2b;
import tb.kbq;
import tb.lq6;
import tb.mzj;
import tb.n78;
import tb.nrv;
import tb.o78;
import tb.q1c;
import tb.q78;
import tb.qul;
import tb.r1c;
import tb.s2b;
import tb.s78;
import tb.sa8;
import tb.sfh;
import tb.t1c;
import tb.t2o;
import tb.t78;
import tb.uza;
import tb.v20;
import tb.vqa;
import tb.vxl;
import tb.wcc;
import tb.xcc;
import tb.yyj;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HomeEditionSwitchServiceImpl implements IHomeEditionSwitchService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_REVISION = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    private static final String TAG = "RevisionService";
    private WeakReference<z6d> mWeakReference;
    private final List<r1c> mEditionSwitchListenerList = new CopyOnWriteArrayList();
    private final q1c onEditionDepend = new c();
    private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver(this) { // from class: com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/editionswitch/impl/HomeEditionSwitchServiceImpl$5");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            sfh.d(HomeEditionSwitchServiceImpl.TAG, "收到广播:" + intent.getAction());
            if ("taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(intent.getAction())) {
                ChangeContainerProcess.d().e(ChangeContainerProcess.ChangeContainerType.revision);
                s2b.c().t();
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends v20 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1504501726) {
                super.onDestroy();
                return null;
            } else if (hashCode == -1392519801) {
                super.onCreateView();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/topmultitab/service/editionswitch/impl/HomeEditionSwitchServiceImpl$1");
            }
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onCreateView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acffd587", new Object[]{this});
                return;
            }
            super.onCreateView();
            HomeEditionSwitchServiceImpl.access$000(HomeEditionSwitchServiceImpl.this);
            HomeEditionSwitchServiceImpl.access$102(HomeEditionSwitchServiceImpl.this, new WeakReference(h2b.a().c()));
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(HomeEditionSwitchServiceImpl.access$200(HomeEditionSwitchServiceImpl.this), new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }

        @Override // tb.v20, com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            super.onDestroy();
            HomeEditionSwitchServiceImpl.access$102(HomeEditionSwitchServiceImpl.this, null);
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(HomeEditionSwitchServiceImpl.access$200(HomeEditionSwitchServiceImpl.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends bx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1504501726) {
                super.i();
                return null;
            } else if (hashCode == -1392519801) {
                super.h();
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/topmultitab/service/editionswitch/impl/HomeEditionSwitchServiceImpl$2");
            }
        }

        @Override // tb.bx
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acffd587", new Object[]{this});
                return;
            }
            super.h();
            HomeEditionSwitchServiceImpl.access$102(HomeEditionSwitchServiceImpl.this, new WeakReference(h2b.a().c()));
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(HomeEditionSwitchServiceImpl.access$200(HomeEditionSwitchServiceImpl.this), new IntentFilter("taobao.action.ACTION_REVISION_SWITCH_CHANGE"));
        }

        @Override // tb.bx
        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            super.i();
            HomeEditionSwitchServiceImpl.access$102(HomeEditionSwitchServiceImpl.this, null);
            LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(HomeEditionSwitchServiceImpl.access$200(HomeEditionSwitchServiceImpl.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            try {
                CookieManager.getInstance().flush();
            } catch (Exception e) {
                bqa.b(HomeEditionSwitchServiceImpl.TAG, "writeCookie exception:", e);
            }
        }
    }

    static {
        t2o.a(729810187);
        t2o.a(729810186);
    }

    public static /* synthetic */ void access$000(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac164aa", new Object[]{homeEditionSwitchServiceImpl});
        } else {
            homeEditionSwitchServiceImpl.init();
        }
    }

    public static /* synthetic */ WeakReference access$102(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9b1fb79f", new Object[]{homeEditionSwitchServiceImpl, weakReference});
        }
        homeEditionSwitchServiceImpl.mWeakReference = weakReference;
        return weakReference;
    }

    public static /* synthetic */ BroadcastReceiver access$200(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("92cfdf23", new Object[]{homeEditionSwitchServiceImpl});
        }
        return homeEditionSwitchServiceImpl.mBroadcastReceiver;
    }

    public static /* synthetic */ void access$300(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl, s78 s78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d03d67f", new Object[]{homeEditionSwitchServiceImpl, s78Var});
        } else {
            homeEditionSwitchServiceImpl.triggerEditionSwitchRequest(s78Var);
        }
    }

    public static /* synthetic */ void access$400(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136b87ae", new Object[]{homeEditionSwitchServiceImpl});
        } else {
            homeEditionSwitchServiceImpl.doEditionCodeChange();
        }
    }

    public static /* synthetic */ void access$500(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d996106f", new Object[]{homeEditionSwitchServiceImpl});
        } else {
            homeEditionSwitchServiceImpl.showDialog();
        }
    }

    public static /* synthetic */ void access$600(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc09930", new Object[]{homeEditionSwitchServiceImpl});
        } else {
            homeEditionSwitchServiceImpl.notifyLocationChange();
        }
    }

    public static /* synthetic */ void access$700(HomeEditionSwitchServiceImpl homeEditionSwitchServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5779cf03", new Object[]{homeEditionSwitchServiceImpl, new Boolean(z)});
        } else {
            homeEditionSwitchServiceImpl.notifyRequestEnd(z);
        }
    }

    private void cookieSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7662a426", new Object[]{this});
        } else {
            Coordinator.execute(new d());
        }
    }

    private bx createAbsPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bx) ipChange.ipc$dispatch("36e5e101", new Object[]{this});
        }
        return new b();
    }

    private IPageLifeCycle createPageLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageLifeCycle) ipChange.ipc$dispatch("da6084ef", new Object[]{this});
        }
        return new a();
    }

    private void doEditionCodeChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c24fb97", new Object[]{this});
            return;
        }
        WeakReference<z6d> weakReference = this.mWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            b3b.g(null);
            lq6.a().g("homepage", b3b.c());
            sfh.f(TAG, "AreaChangeReceiver homepage " + b3b.c());
            z6d z6dVar = this.mWeakReference.get();
            if (z6dVar != null && z6dVar.k1() != null) {
                writeCookie(z6dVar.k1());
                qul.g();
                notifyEditionCodeChange();
                s2b.c().a();
                nrv.a().c();
                ChangeContainerProcess.d().e(ChangeContainerProcess.ChangeContainerType.edition);
                sa8.a(z6dVar.k1());
            }
        }
    }

    private void notifyEditionCodeChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2583399", new Object[]{this});
        } else if (!this.mEditionSwitchListenerList.isEmpty()) {
            for (r1c r1cVar : this.mEditionSwitchListenerList) {
                r1cVar.a();
            }
        }
    }

    private void notifyLocationChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243dd0f5", new Object[]{this});
        } else if (!this.mEditionSwitchListenerList.isEmpty()) {
            for (r1c r1cVar : this.mEditionSwitchListenerList) {
                r1cVar.b();
            }
        }
    }

    private void notifyRequestEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e786458", new Object[]{this, new Boolean(z)});
        } else if (!this.mEditionSwitchListenerList.isEmpty()) {
            for (r1c r1cVar : this.mEditionSwitchListenerList) {
                r1cVar.a(z);
            }
        }
    }

    private void triggerEditionSwitchRequest(s78 s78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d8ce050", new Object[]{this, s78Var});
        } else if (s78Var != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(mzj.SWITCH_REQUEST_CONSTANT, (Object) s78Var.c());
            if (s78Var.c != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("switcherVersion", (Object) s78Var.c.c);
                jSONObject.put("bizParam", (Object) jSONObject2);
            }
            vqa.k().i("MTopRequest").j("RevisionServicedoEditionSwitch").g("requestType", "editionSwitch").g(mzj.SWITCH_REQUEST_CONSTANT, jSONObject.toString()).a();
            yyj.e().Q(jSONObject);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService
    public void addEditionSwitchListener(r1c r1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c1a2e4", new Object[]{this, r1cVar});
        } else {
            this.mEditionSwitchListenerList.add(r1cVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomeStaticService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onDestroyService() {
        ddc.a(this);
    }

    @Override // com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService
    public void removeEditionSwitchListener(r1c r1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f71a1", new Object[]{this, r1cVar});
        } else {
            this.mEditionSwitchListenerList.remove(r1cVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService
    public void updateEditionSwitch(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a399f142", new Object[]{this, context, str});
        } else {
            o78.H(context, str);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService
    public void updateRevisionSwitch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429d9631", new Object[]{this, jSONObject});
        } else {
            ((t1c) n78.a(t1c.class)).onVersionResponse(t78.c(jSONObject));
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        fsw.i("TBEditionSwitcherElderHomePopBridge", TBEditionSwitcherElderHomePopBridge.class, true);
        fsw.i("TBEditionSwitcherPopBridge", TBEditionSwitcherPopBridge.class, true);
        q78.a(this.onEditionDepend);
        sfh.d(TAG, "初始化");
    }

    private void showDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
        } else if (Localization.o()) {
            sfh.d(TAG, "海外站点非中文场景不出切站弹窗");
        } else {
            WeakReference<z6d> weakReference = this.mWeakReference;
            if (weakReference == null || weakReference.get() == null) {
                sfh.d(TAG, "mWeakReference.get() == null");
                return;
            }
            z6d z6dVar = this.mWeakReference.get();
            if (z6dVar != null) {
                uza.c(z6dVar, 0, null);
                sfh.d(TAG, "展示切站弹窗");
            }
        }
    }

    private void writeCookie(Context context) {
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
                cookieSync();
            } catch (Exception e) {
                bqa.b(TAG, "writeCookie exception:", e);
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.editionswitch.IHomeEditionSwitchService
    public void initEditionSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b39a5ae9", new Object[]{this});
        } else if (vxl.b().v()) {
            if (f4b.b("enableFixEditionSwitchInit", true)) {
                sfh.d(TAG, "orange开关为true，走新逻辑");
                return;
            }
            fsw.i("TBEditionSwitcherElderHomePopBridge", TBEditionSwitcherElderHomePopBridge.class, true);
            fsw.i("TBEditionSwitcherPopBridge", TBEditionSwitcherPopBridge.class, true);
            q78.a(this.onEditionDepend);
            s2b.c().r(createAbsPageLifeCycle());
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
        } else if (!f4b.b("enableFixEditionSwitchInit", true)) {
            sfh.d(TAG, "orange开关为false，走老逻辑");
        } else {
            IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
            if (iHomePageLifecycleService != null) {
                iHomePageLifecycleService.getPageLifeCycleRegister().a(createPageLifeCycle());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements q1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (r8.equals(tb.r78.LOCATION_REQUEST_SUCCESS) == false) goto L_0x0031;
         */
        @Override // tb.q1c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(tb.s78 r7, tb.t7l r8) {
            /*
                r6 = this;
                r0 = 2
                r1 = 3
                r2 = 1
                r3 = 0
                com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.c.$ipChange
                boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r5 == 0) goto L_0x0018
                java.lang.String r5 = "baa06836"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r6
                r1[r2] = r7
                r1[r0] = r8
                r4.ipc$dispatch(r5, r1)
                return
            L_0x0018:
                if (r8 == 0) goto L_0x00a1
                java.lang.String r4 = r8.f28544a
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L_0x0024
                goto L_0x00a1
            L_0x0024:
                java.lang.String r8 = r8.f28544a
                r8.hashCode()
                r4 = -1
                int r5 = r8.hashCode()
                switch(r5) {
                    case 47089513: goto L_0x0061;
                    case 606614847: goto L_0x0055;
                    case 814285193: goto L_0x004b;
                    case 1283931406: goto L_0x003f;
                    case 1309857207: goto L_0x0033;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r0 = -1
                goto L_0x006b
            L_0x0033:
                java.lang.String r0 = "triggerRequest"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x003d
                goto L_0x0031
            L_0x003d:
                r0 = 4
                goto L_0x006b
            L_0x003f:
                java.lang.String r0 = "locationRequestError"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x0049
                goto L_0x0031
            L_0x0049:
                r0 = 3
                goto L_0x006b
            L_0x004b:
                java.lang.String r1 = "locationRequestSuccess"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x006b
                goto L_0x0031
            L_0x0055:
                java.lang.String r0 = "locationChanged"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x005f
                goto L_0x0031
            L_0x005f:
                r0 = 1
                goto L_0x006b
            L_0x0061:
                java.lang.String r0 = "editionCodeChanged"
                boolean r8 = r8.equals(r0)
                if (r8 != 0) goto L_0x006a
                goto L_0x0031
            L_0x006a:
                r0 = 0
            L_0x006b:
                switch(r0) {
                    case 0: goto L_0x009c;
                    case 1: goto L_0x0081;
                    case 2: goto L_0x007b;
                    case 3: goto L_0x0075;
                    case 4: goto L_0x006f;
                    default: goto L_0x006e;
                }
            L_0x006e:
                goto L_0x00a1
            L_0x006f:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r8 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$300(r8, r7)
                goto L_0x00a1
            L_0x0075:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r7 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$700(r7, r3)
                goto L_0x00a1
            L_0x007b:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r7 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$700(r7, r2)
                goto L_0x00a1
            L_0x0081:
                boolean r7 = tb.kbz.e()
                if (r7 == 0) goto L_0x0091
                android.app.Application r7 = com.taobao.tao.Globals.getApplication()
                boolean r7 = tb.kbq.h(r7)
                if (r7 != 0) goto L_0x0096
            L_0x0091:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r7 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$500(r7)
            L_0x0096:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r7 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$600(r7)
                goto L_0x00a1
            L_0x009c:
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl r7 = com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.this
                com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.access$400(r7)
            L_0x00a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.topmultitab.service.editionswitch.impl.HomeEditionSwitchServiceImpl.c.a(tb.s78, tb.t7l):void");
        }
    }
}
