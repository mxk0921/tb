package com.taobao.share.copy;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.ali.user.mobile.login.action.OtherActions;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.poplayer.PopLayer;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.adapter.biz.TBShareBiz;
import com.taobao.tao.log.TLog;
import com.ut.share.business.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import tb.aib;
import tb.bis;
import tb.blo;
import tb.br0;
import tb.bwr;
import tb.fwr;
import tb.h8t;
import tb.hip;
import tb.hjp;
import tb.kkp;
import tb.m8t;
import tb.mv3;
import tb.nsu;
import tb.ov3;
import tb.pis;
import tb.qjp;
import tb.r9;
import tb.t2o;
import tb.v9;
import tb.w9;
import tb.x9;
import tb.y9;
import tb.y9o;
import tb.yhs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ClipUrlWatcherControl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GET_PASSWORD_FAIL = 3;
    public static final int GET_PASSWORD_FINISH = 5;
    public static final int LOAD_CLIP_SERVICE = 6;
    public static final int NO_STATE = 0;
    public static final int RETRY_PASSWORD = 4;
    public static final int SHOW_LOADING = 1;
    public static final int SHOW_PASSWORD_DIALOG = 2;
    public static final List<String> s;
    public static final boolean t;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f11739a;
    public Dialog b;
    public bis c;
    public ClipboardManager d;
    public long e;
    public long f;
    public boolean g;
    public int h;
    public Context i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public final Handler o;
    public final c p;
    public y9 q;
    public e r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements x9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11740a;
        public final /* synthetic */ long b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.share.copy.ClipUrlWatcherControl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0663a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0663a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent(OtherActions.TBPWD_OPEN));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                    LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(new Intent(OtherActions.TBPWD_NOT_OPEN));
                }
            }
        }

        public a(Map map, long j) {
            this.f11740a = map;
            this.b = j;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3df3009c", new Object[]{this});
            } else if (ClipUrlWatcherControl.c(ClipUrlWatcherControl.this)) {
                ClipUrlWatcherControl.d(ClipUrlWatcherControl.this).f31916a = null;
                ClipUrlWatcherControl.this.m(this.f11740a);
            }
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            ClipUrlWatcherControl.this.n = null;
            bis bisVar = new bis();
            bisVar.i = str;
            bisVar.p = this.f11740a;
            fwr.d("口令监测失败, 错误码：" + str + " 错误信息：" + str2);
            ClipUrlWatcherControl.f(ClipUrlWatcherControl.this, bisVar, true, null, this.f11740a);
            ClipUrlWatcherControl.g(ClipUrlWatcherControl.this).post(new b());
            TBS.Ext.commitEvent("Share_Exception", 19999, nsu.TRACK_TYPE_BACK_FLOW, "err", "口令检测失败", "错误码：" + str + " 错误信息：" + str2);
            TBS.Ext.commitEvent("Page_Share", 19999, "GetPasswordContentFailed", null, null, ClipUrlWatcherControl.d(ClipUrlWatcherControl.this).f31916a + "," + hjp.b() + "," + str + ", " + str2);
        }

        public void b(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a667ae3", new Object[]{this, obj, obj2});
                return;
            }
            kkp.e().a(kkp.KEY_SHAREBACKPASSWORDCHECKEND);
            w9 w9Var = (w9) obj;
            ClipUrlWatcherControl.e(ClipUrlWatcherControl.this, w9Var.a());
            bis c = y9o.c((Map) obj2, ClipUrlWatcherControl.d(ClipUrlWatcherControl.this));
            c.o = JSON.toJSONString(obj2);
            ClipUrlWatcherControl.this.n = c.d;
            TBS.Ext.commitEvent("Share_Exception", 19999, nsu.TRACK_TYPE_BACK_FLOW, "info", "口令检测成功", JSON.toJSONString(c));
            String str = c.d + "," + c.h + "," + hjp.b() + "," + c.b;
            if (c instanceof pis) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(",");
                pis pisVar = (pis) c;
                sb.append(pisVar.t);
                sb.append(",");
                sb.append(pisVar.z);
                str = sb.toString();
            }
            TBS.Ext.commitEvent("Page_Share", 19999, "GetPasswordContentSuccess", null, null, str);
            long currentTimeMillis = System.currentTimeMillis() - this.b;
            TBS.Ext.commitEvent("UT", 19999, "Page_Share-CheckPassword", null, null, c.d + "," + c.h + "," + currentTimeMillis);
            if ("pic".equals(c.h)) {
                TBS.Ext.commitEvent("UT", 19999, "Page_Share-FetchLastPic", null, null, c.d + "," + currentTimeMillis);
                TBS.Ext.commitEvent("Page_Extend", 19999, c.f16414a, "qrcode", c.c);
            }
            r9 r9Var = w9Var.n;
            if (r9Var != null) {
                c.n = r9Var;
            }
            c.p = this.f11740a;
            fwr.d("口令监测成功");
            ClipUrlWatcherControl.f(ClipUrlWatcherControl.this, c, true, w9Var.r, this.f11740a);
            ClipUrlWatcherControl.g(ClipUrlWatcherControl.this).post(new RunnableC0663a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
            ClipUrlWatcherControl.b(ClipUrlWatcherControl.this);
            ClipUrlWatcherControl.this.R();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ClipUrlWatcherControl f11745a = new ClipUrlWatcherControl();

        static {
            t2o.a(664797198);
        }

        public static /* synthetic */ ClipUrlWatcherControl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClipUrlWatcherControl) ipChange.ipc$dispatch("b96d7200", new Object[0]);
            }
            return f11745a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    public static void S(Context context, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b1de7", new Object[]{context, new Integer(i)});
            return;
        }
        z().K(System.currentTimeMillis());
        long x = z().x();
        if ("pic".equals(Integer.valueOf(i))) {
            str = "Page_Extend_ShowSavePic_Time";
        } else {
            str = "Page_Extend_ShowCopy_Time";
        }
        Properties properties = new Properties();
        properties.put("time", Long.valueOf(x));
        TBS.Ext.commitEvent(str, properties);
        aib backFlowEngine = ShareBizAdapter.getInstance().getBackFlowEngine();
        if (backFlowEngine != null) {
            kkp.e().a(kkp.KEY_SHAREBACKINITDIALOG);
            backFlowEngine.a(i);
        }
    }

    public static /* synthetic */ ClipboardManager a(ClipUrlWatcherControl clipUrlWatcherControl, ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipboardManager) ipChange.ipc$dispatch("d4d50b26", new Object[]{clipUrlWatcherControl, clipboardManager});
        }
        clipUrlWatcherControl.d = clipboardManager;
        return clipboardManager;
    }

    public static /* synthetic */ void b(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e873d811", new Object[]{clipUrlWatcherControl});
        } else {
            clipUrlWatcherControl.o();
        }
    }

    public static /* synthetic */ boolean c(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33d13f43", new Object[]{clipUrlWatcherControl})).booleanValue();
        }
        return clipUrlWatcherControl.m;
    }

    public static /* synthetic */ y9 d(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9) ipChange.ipc$dispatch("3bef1766", new Object[]{clipUrlWatcherControl});
        }
        return clipUrlWatcherControl.q;
    }

    public static /* synthetic */ y9 e(ClipUrlWatcherControl clipUrlWatcherControl, y9 y9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9) ipChange.ipc$dispatch("1e3975ba", new Object[]{clipUrlWatcherControl, y9Var});
        }
        clipUrlWatcherControl.q = y9Var;
        return y9Var;
    }

    public static /* synthetic */ void f(ClipUrlWatcherControl clipUrlWatcherControl, bis bisVar, boolean z, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78271e4", new Object[]{clipUrlWatcherControl, bisVar, new Boolean(z), str, map});
        } else {
            clipUrlWatcherControl.V(bisVar, z, str, map);
        }
    }

    public static /* synthetic */ Handler g(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("737aeaea", new Object[]{clipUrlWatcherControl});
        }
        return clipUrlWatcherControl.o;
    }

    public static /* synthetic */ int h(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb33a8ae", new Object[]{clipUrlWatcherControl})).intValue();
        }
        return clipUrlWatcherControl.h;
    }

    public static /* synthetic */ int i(ClipUrlWatcherControl clipUrlWatcherControl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2581d1d", new Object[]{clipUrlWatcherControl, new Integer(i)})).intValue();
        }
        clipUrlWatcherControl.h = i;
        return i;
    }

    public static /* synthetic */ WeakReference j(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9a4e64e8", new Object[]{clipUrlWatcherControl});
        }
        return clipUrlWatcherControl.f11739a;
    }

    public static /* synthetic */ boolean k(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46e4dd7d", new Object[]{clipUrlWatcherControl})).booleanValue();
        }
        return clipUrlWatcherControl.k;
    }

    public static /* synthetic */ boolean l(ClipUrlWatcherControl clipUrlWatcherControl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74bd77dc", new Object[]{clipUrlWatcherControl})).booleanValue();
        }
        return clipUrlWatcherControl.l;
    }

    public static ClipUrlWatcherControl z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipUrlWatcherControl) ipChange.ipc$dispatch("e4dbafe4", new Object[0]);
        }
        return d.a();
    }

    public final boolean A(Activity activity) {
        Intent intent;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ec6fb5a", new Object[]{this, activity})).booleanValue();
        }
        String str = null;
        if (activity == null) {
            intent = null;
        } else {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
        }
        if (intent != null) {
            str = intent.getDataString();
        }
        String str2 = this.c.c;
        if (!(str == null || str2 == null)) {
            if (!str.contains("meta.wapa.taobao.com/app/tb-trade/present/") || !str2.contains("meta.wapa.taobao.com/app/tb-trade/present/")) {
                z = false;
            } else {
                z = true;
            }
            if (str.contains("meta.m.taobao.com/app/tb-trade/present/")) {
                if (str2.contains("meta.m.taobao.com/app/tb-trade/present/")) {
                    z2 = true;
                    if (z && !z2) {
                        return false;
                    }
                }
            }
            z2 = false;
            return z ? true : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (com.taobao.login4android.api.Login.isLoginPage(r2) != false) goto L_0x00a0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean B(boolean r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.share.copy.ClipUrlWatcherControl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r10)
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r1] = r9
            r10[r0] = r3
            java.lang.String r0 = "3cb50229"
            java.lang.Object r10 = r2.ipc$dispatch(r0, r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x0021:
            java.lang.ref.WeakReference<android.app.Activity> r2 = r9.f11739a
            java.lang.String r3 = "ClipUrlWatcherControl"
            r4 = 0
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L_0x0045
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = " isCanDisplayOnThisActivity2 :activityname:"
            java.lang.String r6 = r6.concat(r5)
            tb.mv3.a(r3, r6)
            goto L_0x0045
        L_0x0044:
            r2 = r4
        L_0x0045:
            com.taobao.share.multiapp.ShareBizAdapter r6 = com.taobao.share.multiapp.ShareBizAdapter.getInstance()
            tb.igb r6 = r6.getAppEnv()
            java.util.List r6 = r6.k()
            com.taobao.share.multiapp.ShareBizAdapter r7 = com.taobao.share.multiapp.ShareBizAdapter.getInstance()
            tb.igb r7 = r7.getAppEnv()
            boolean r7 = r7.e()
            java.util.List<java.lang.String> r8 = com.taobao.share.copy.ClipUrlWatcherControl.s
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r5)
            if (r8 != 0) goto L_0x006f
            if (r6 == 0) goto L_0x0070
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            java.lang.String r6 = "com.taobao.tao.welcome.Welcome"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0085
            if (r7 == 0) goto L_0x0080
            java.lang.String r10 = "Welcome页面弹淘口令弹窗"
            tb.fwr.d(r10)
            return r0
        L_0x0080:
            java.lang.String r5 = "Welcome页面不弹淘口令弹窗"
            tb.fwr.d(r5)
        L_0x0085:
            tb.bis r5 = r9.c
            if (r5 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x00a2
            boolean r5 = r9.A(r2)
            if (r5 == 0) goto L_0x00a2
            if (r10 == 0) goto L_0x00a0
            tb.bis r10 = r9.c
            java.lang.String r10 = r10.f16414a
            r1 = 19999(0x4e1f, float:2.8025E-41)
            java.lang.String r2 = "Page_Share_Skip_Gift_BackFlow"
            java.lang.String r5 = "Page_Share"
            com.taobao.statistic.TBS.Ext.commitEvent(r5, r1, r2, r10, r4)
        L_0x00a0:
            r1 = 1
            goto L_0x00ab
        L_0x00a2:
            if (r2 == 0) goto L_0x00ab
            boolean r10 = com.taobao.login4android.api.Login.isLoginPage(r2)
            if (r10 == 0) goto L_0x00ab
            goto L_0x00a0
        L_0x00ab:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = " isCanDisplayOnThisActivity ;result:"
            r10.<init>(r2)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            tb.mv3.a(r3, r10)
            r10 = r1 ^ 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.share.copy.ClipUrlWatcherControl.B(boolean):boolean");
    }

    public void D(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c327f8", new Object[]{this, context});
            return;
        }
        mv3.b("ClipUrlWatcherControl", "register com.taobao.share.taopassword receiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PopLayer.ACTION_OUT_DISPLAY);
        intentFilter.addAction(PopLayer.ACTION_OUT_DISMISS);
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver(this) { // from class: com.taobao.share.copy.ClipUrlWatcherControl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/copy/ClipUrlWatcherControl$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                mv3.c("TaoPasswordReceiver", "onReceive action =" + intent.getAction());
                if (intent.getAction().equals(PopLayer.ACTION_OUT_DISPLAY)) {
                    String stringExtra = intent.getStringExtra("event");
                    fwr.d("onReceive event value =" + stringExtra);
                    if (!TextUtils.isEmpty(stringExtra) && stringExtra.contains("no_tbSecretOrder")) {
                        ClipUrlWatcherControl.z().L(true);
                    }
                } else if (intent.getAction().equals(PopLayer.ACTION_OUT_DISMISS)) {
                    ClipUrlWatcherControl.z().L(false);
                }
            }
        }, intentFilter);
        mv3.b("ClipUrlWatcherControl", "register com.taobao.share.taopassword receiver success");
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1246f68e", new Object[]{this});
        } else {
            this.h = 0;
        }
    }

    public void F(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0c5cd1", new Object[]{this, context});
            return;
        }
        this.i = context;
        Message message = new Message();
        message.what = 6;
        this.p.sendMessage(message);
    }

    public void G(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837b7d51", new Object[]{this, weakReference});
        } else {
            this.f11739a = weakReference;
        }
    }

    public void H(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56b25782", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void I(bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca17ea33", new Object[]{this, bisVar});
        } else {
            this.c = bisVar;
        }
    }

    public void J(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d50cd20a", new Object[]{this, dialog});
        } else {
            this.b = dialog;
        }
    }

    public void K(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e12d357", new Object[]{this, new Long(j)});
        } else {
            this.f = j;
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60655b5", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void M(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7481e2ad", new Object[]{this, eVar});
        } else {
            this.r = eVar;
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48775abe", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void O(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.e = j;
        }
    }

    public void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f33dbb1", new Object[]{this, new Boolean(z)});
        } else {
            this.k = z;
        }
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41e61ce", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
        } else if (this.k) {
            fwr.c("ClipUrlWatcherControl", " 用户点击close，不在显示淘口令");
        } else if (this.l) {
            fwr.c("ClipUrlWatcherControl", " 红包雨已弹出，不显示淘口令");
        } else if (this.f11739a == null) {
            fwr.c("ClipUrlWatcherControl", " mWeakRefActivity=null，不显示淘口令");
        } else {
            bis bisVar = this.c;
            if (bisVar == null) {
                if (this.g) {
                    int i = this.h;
                    if (i == 1) {
                        S(this.i, 1);
                    } else if (i == 3) {
                        S(this.i, 3);
                    } else if (i == 4) {
                        S(this.i, 4);
                    }
                }
                fwr.c("ClipUrlWatcherControl", " data=null，不显示淘口令 mCurrentState:" + this.h);
                return;
            }
            String str = bisVar.i;
            if (str != null) {
                if (TextUtils.equals("PASSWORD_INVALID", str)) {
                    hip.c(this.d);
                }
                this.h = 3;
                if (!this.g) {
                    if (TextUtils.equals("PASSWORD_INVALID", this.c.i)) {
                        S(this.i, 3);
                    }
                } else if (this.c.i.contains("NETWORK") || this.c.i.contains(LogStrategyManager.SP_STRATEGY_KEY_NETWORK)) {
                    this.h = 4;
                    S(this.i, 4);
                } else {
                    S(this.i, 3);
                }
                fwr.c("ClipUrlWatcherControl", " GET_PASSWORD_FAIL，不显示淘口令 data.errorCode:" + this.c.i);
                return;
            }
            this.h = 2;
            S(this.i, 2);
            fwr.a("ClipUrlWatcherControl", " BackFlowDialogService.showDialog 显示淘口令");
        }
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("736018cd", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7441e7", new Object[]{this});
            return;
        }
        try {
            try {
                Dialog dialog = this.b;
                if (dialog != null) {
                    dialog.dismiss();
                }
            } catch (Exception unused) {
                mv3.b("ClipUrlWatcherControl", "dismiss error");
            }
        } finally {
            this.b = null;
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73c7ed5", new Object[]{this});
        } else if (ov3.i > 0) {
            ov3.i = 0L;
            AppMonitor.Counter.commit("tbshare", "backflowPerf", System.currentTimeMillis() - ov3.i);
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97fd2d70", new Object[]{this})).booleanValue();
        }
        if (!t || this.h != 2) {
            return false;
        }
        return ShareBizAdapter.getInstance().getAppEnv().d();
    }

    public ClipboardManager q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClipboardManager) ipChange.ipc$dispatch("5ba5d651", new Object[]{this});
        }
        return this.d;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("612d64ec", new Object[]{this});
        }
        if (!qjp.b()) {
            return null;
        }
        return br0.b(ShareBizAdapter.getInstance().getAppEnv().getApplication());
    }

    public WeakReference<Activity> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("9f3d8647", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.f11739a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f11739a;
        }
        TLog.loge("ClipUrlWatcherControl", "getCurrentActivity is empty, use onlineMonitor data.");
        if (this.r != null) {
            return new WeakReference<>(((TBShareBiz.a) this.r).a());
        }
        return new WeakReference<>(null);
    }

    public bis t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bis) ipChange.ipc$dispatch("6525c94f", new Object[]{this});
        }
        return this.c;
    }

    public Dialog u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f928d0aa", new Object[]{this});
        }
        return this.b;
    }

    public long v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("250d18d", new Object[]{this})).longValue();
        }
        return this.f;
    }

    public long w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("490f0b94", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return v() - w();
    }

    public boolean y() {
        boolean z;
        String str;
        bis bisVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6785886e", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("ClipUrlWatcherControl#hasTaoPassword mIsStop=");
        sb.append(this.k);
        sb.append(" mHasPopLayer=");
        sb.append(this.l);
        sb.append(" dataIsNull=");
        if (this.c == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("errCode=");
        bis bisVar2 = this.c;
        if (bisVar2 == null) {
            str = "null";
        } else {
            str = bisVar2.i;
        }
        sb.append(str);
        fwr.a("ClipUrlWatcherControl", sb.toString());
        if (this.k || this.l || (bisVar = this.c) == null || bisVar.i != null) {
            return false;
        }
        return true;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ClipUrlWatcherControl f11744a;

        static {
            t2o.a(664797197);
        }

        public c(ClipUrlWatcherControl clipUrlWatcherControl, Looper looper) {
            super(looper);
            this.f11744a = clipUrlWatcherControl;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/copy/ClipUrlWatcherControl$MyHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ClipUrlWatcherControl clipUrlWatcherControl;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message != null && (clipUrlWatcherControl = this.f11744a) != null) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        ClipUrlWatcherControl.i(clipUrlWatcherControl, 2);
                        if (ClipUrlWatcherControl.j(clipUrlWatcherControl) == null) {
                            mv3.b("ClipUrlWatcherControl", "showDialog weakActivity is null");
                        } else {
                            ClipUrlWatcherControl.S(clipUrlWatcherControl.i, 2);
                        }
                    } else if (i == 3) {
                        ClipUrlWatcherControl.i(clipUrlWatcherControl, 3);
                        if (ClipUrlWatcherControl.j(clipUrlWatcherControl) == null) {
                            mv3.b("ClipUrlWatcherControl", "showDialog weakActivity is null");
                        } else {
                            ClipUrlWatcherControl.S(clipUrlWatcherControl.i, 3);
                        }
                    } else if (i != 4) {
                        if (i == 6) {
                            ClipUrlWatcherControl.a(clipUrlWatcherControl, (ClipboardManager) clipUrlWatcherControl.i.getSystemService("clipboard"));
                        }
                    } else if (ClipUrlWatcherControl.h(clipUrlWatcherControl) == 1) {
                        mv3.c("ClipUrlWatcherControl", "RETRY_PASSWORD mIsStop=" + ClipUrlWatcherControl.k(clipUrlWatcherControl));
                        if (!ClipUrlWatcherControl.k(clipUrlWatcherControl) && !ClipUrlWatcherControl.l(clipUrlWatcherControl)) {
                            if (ClipUrlWatcherControl.h(clipUrlWatcherControl) == 1) {
                                TBS.Ext.commitEventEnd("Page_Extend_ShowLoading", null);
                            }
                            ClipUrlWatcherControl.i(clipUrlWatcherControl, 4);
                            if (ClipUrlWatcherControl.j(clipUrlWatcherControl) == null) {
                                mv3.b("ClipUrlWatcherControl", "showDialog weakActivity is null");
                            } else {
                                ClipUrlWatcherControl.S(clipUrlWatcherControl.i, 4);
                            }
                        }
                    }
                } else if (ClipUrlWatcherControl.h(clipUrlWatcherControl) != 5 && ClipUrlWatcherControl.h(clipUrlWatcherControl) != 2 && ClipUrlWatcherControl.h(clipUrlWatcherControl) != 3 && ClipUrlWatcherControl.h(clipUrlWatcherControl) != 1) {
                    TBS.Ext.commitEventBegin("Page_Extend_ShowLoading", null);
                    ClipUrlWatcherControl.i(clipUrlWatcherControl, 1);
                    if (ClipUrlWatcherControl.j(clipUrlWatcherControl) == null) {
                        mv3.b("ClipUrlWatcherControl", "showDialog weakActivity is null");
                    } else {
                        ClipUrlWatcherControl.S(clipUrlWatcherControl.i, 1);
                    }
                }
            }
        }
    }

    public ClipUrlWatcherControl() {
        this.c = null;
        this.e = 0L;
        this.f = 0L;
        this.g = true;
        this.h = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.o = new Handler(Looper.getMainLooper());
        this.p = new c(this, Looper.getMainLooper());
    }

    public void C(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81eff72d", new Object[]{this, map});
            return;
        }
        kkp e2 = kkp.e();
        e2.a(kkp.KEY_SHAREBACKPREPAREDATASTART);
        if (bwr.h().i()) {
            fwr.c("ClipUrlWatcherControl", "检测到您的分享流程还没有完成，不检查口令");
            return;
        }
        this.m = "true".equals(OrangeConfig.getInstance().getConfig("android_share", "isNeedReCheckPic", "true"));
        fwr.a("ClipUrlWatcherControl", " 检测口令入口");
        O(System.currentTimeMillis());
        this.k = false;
        hip.a a2 = hip.a();
        String str = a2.f20672a;
        String str2 = a2.b;
        y9 y9Var = new y9();
        this.q = y9Var;
        y9Var.f31916a = str;
        y9Var.c = blo.TAO_FLAG.equals(str2);
        e2.a(kkp.KEY_SHAREBACKPREPAREDATAEND);
        m(map);
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18f75b3", new Object[]{this});
        } else if (B(false)) {
            mv3.c("ClipUrlWatcherControl", "in showDialogByCase showDialog");
            if (p()) {
                fwr.d("当前页面正在显示回流弹窗， 过滤重复显示");
            } else {
                R();
            }
        }
    }

    public void m(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfffc77b", new Object[]{this, map});
            return;
        }
        kkp.e().a(kkp.KEY_SHAREBACKPASSWORDCHECKSTART);
        if (!TextUtils.isEmpty(OrangeConfig.getInstance().getConfig("android_share", "backFlowAppKeys", ""))) {
            String string = hjp.a().getSharedPreferences(ShareConstants.SP_SHARE, 0).getString(ShareConstants.KEY_TAO_PASSWORD, "");
            if (!TextUtils.isEmpty(this.q.f31916a) && TextUtils.equals(string, this.q.f31916a)) {
                fwr.c("ClipUrlWatcherControl", "检测到跟缓存的非当前app的口令一致，直接返回");
                return;
            }
        }
        if (blo.q()) {
            yhs.g(new m8t());
            yhs.h(new h8t());
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(this.q.f31916a)) {
            TBS.Ext.commitEvent("Share_Exception", 19999, nsu.TRACK_TYPE_BACK_FLOW, "info", "口令检测入口", "cbd=" + this.q.f31916a);
        }
        v9.b().c(hjp.a(), this.q, new a(map, currentTimeMillis));
    }

    static {
        t2o.a(664797191);
        ArrayList arrayList = new ArrayList();
        s = arrayList;
        t = true;
        arrayList.add("com.taobao.tao.welcome.Welcome");
        arrayList.add("com.taobao.tao.ad.AdNavActivity");
        arrayList.add("com.taobao.open.oauth.OauthActivity");
        arrayList.add("com.taobao.open.GetWayActivity");
        arrayList.add("com.taobao.bootimage.activity.BootImageActivity");
        arrayList.add("com.taobao.runtimepermission.PermissionActivity");
        arrayList.add("com.ali.user.mobile.login.ui.UserLoginActivity");
        t = "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "filterDuplicateBackFlowShow", "true"));
    }

    public final void V(bis bisVar, boolean z, String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca19db4", new Object[]{this, bisVar, new Boolean(z), str, map});
            return;
        }
        if (this.h == 1) {
            TBS.Ext.commitEventEnd("Page_Extend_ShowLoading", null);
        }
        this.h = 5;
        kkp e2 = kkp.e();
        e2.a(kkp.KEY_SHAREBACKPASSWORDVALIDSTART);
        String config = OrangeConfig.getInstance().getConfig("android_share", "backFlowAppKeys", "");
        if (!TextUtils.isEmpty(config) && (TextUtils.isEmpty(str) || (!TextUtils.isEmpty(str) && !config.contains(str)))) {
            SharedPreferences.Editor edit = hjp.a().getSharedPreferences(ShareConstants.SP_SHARE, 0).edit();
            edit.putString(ShareConstants.KEY_TAO_PASSWORD, bisVar.d);
            edit.apply();
            LocalBroadcastManager.getInstance(hjp.a()).sendBroadcast(new Intent(ShareConstants.ACTION_TAO_PASSWORD));
            fwr.d("不是当前的app生成的口令，不显示淘口令，存起来，发通知");
        } else if (this.k) {
            fwr.d("用户点击close，不在显示淘口令");
        } else if (bisVar == null && this.c == null) {
            fwr.d("没数据");
            if (z) {
                m(map);
            }
        } else {
            if (bisVar != null) {
                if (TextUtils.equals(bisVar.i, "NOSHOW_PASSWORD_FRAME")) {
                    if ("true".equals(OrangeConfig.getInstance().getConfig("android_share", "clear_clipboard_on_security_err", "true"))) {
                        hip.c(this.d);
                    }
                    AppMonitor.Alarm.commitFail("share", "response_not_show_pwd", "0", "NOSHOW_PASSWORD_FRAME");
                    fwr.d("Share->Clip: Error code is NOSHOW_PASSWORD_FRAME, should not show dialog.");
                    return;
                } else if (this.g || (str2 = bisVar.i) == null || TextUtils.equals("PASSWORD_INVALID", str2)) {
                    this.c = bisVar;
                } else {
                    fwr.d("不显示异常框");
                    return;
                }
            }
            if (this.l) {
                if (TextUtils.isEmpty(this.c.i) || TextUtils.equals("PASSWORD_INVALID", this.c.i)) {
                    hip.c(this.d);
                }
                fwr.d("红包雨已弹出，不显示淘口令");
            } else if (B(true)) {
                e2.a(kkp.KEY_SHAREBACKPASSWORDVALIDEND);
                this.p.post(new b());
            } else {
                fwr.d("当前Activity不允许显示淘口令");
            }
        }
    }
}
