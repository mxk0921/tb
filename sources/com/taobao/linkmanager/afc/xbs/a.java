package com.taobao.linkmanager.afc.xbs;

import android.app.Activity;
import android.text.TextUtils;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.taobao.linkmanager.afc.xbs.TBFloatingLayer;
import com.taobao.statistic.TBS;
import com.taobao.tao.welcome.Welcome;
import java.math.BigDecimal;
import java.util.HashMap;
import tb.ah0;
import tb.bh0;
import tb.bht;
import tb.c21;
import tb.qg0;
import tb.rg0;
import tb.t2o;
import tb.u11;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a extends com.taobao.flowcustoms.afc.xbs.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLOSE_REASON_BACKGROUND = "background";
    public static final String CLOSE_REASON_CLOSE_BTN = "close_btn";
    public static final String CLOSE_REASON_LEFT_SWIPE = "left_swipe";
    public static final String CLOSE_REASON_SWITCH_PAGE = "switch_page";
    public boolean d = false;
    public boolean e = false;
    public String f = "";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.linkmanager.afc.xbs.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0576a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0576a() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                try {
                    if (a.this.f10580a && TBFloatingLayer.B != null && a.this.e) {
                        vp9.a("linkx", "OnApmEventListener  === NOTIFY_FOREGROUND_2_BACKGROUND.退后台，小把手销毁");
                        a.this.a("background");
                    }
                } catch (Throwable unused) {
                    vp9.b("linkx", "OnApmEventListener.error.");
                }
            }
        }
    }

    static {
        t2o.a(744489067);
    }

    public a() {
        c21.c(new C0576a());
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1997045008:
                super.onClick();
                return null;
            case 359384822:
                super.g();
                return null;
            case 1252159293:
                return super.f();
            case 1736834837:
                super.b((Activity) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/linkmanager/afc/xbs/TbXbsPluginAdapter");
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a, tb.hxt
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6cf52a", new Object[]{this, str});
            return;
        }
        t(str);
        d();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a, tb.hxt
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6785ff15", new Object[]{this, activity});
            return;
        }
        super.b(activity);
        if (activity != null) {
            String e = AfcUtils.e(activity);
            String str = this.f;
            vp9.a("linkx", "TbXbsPluginAdapter.onShow.activityKeyCode=" + e + ".mShowActivityCode=" + str + ".");
            this.f = e;
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b372e5d9", new Object[]{this});
            return;
        }
        this.f10580a = false;
        this.f = "";
        TBFloatingLayer.w().v();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156bc6f6", new Object[]{this});
            return;
        }
        super.g();
        bht.b();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab825b21", new Object[]{this});
        } else if (TBFloatingLayer.B != null) {
            TBFloatingLayer.w().x();
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public boolean j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79aced8", new Object[]{this, activity})).booleanValue();
        }
        if (activity.getClass() != new Class[]{Welcome.class}[0] && !"UserLoginActivity".equals(activity.getClass().getSimpleName())) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void l(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2108915e", new Object[]{this, activity});
        } else {
            TBFloatingLayer.w().G(activity);
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfc84cfd", new Object[]{this});
        } else {
            ah0.c(2101, ah0.ARG1_FLOW_BACK, "", "", f());
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4699072d", new Object[]{this});
        } else {
            ah0.c(2201, ah0.ARG1_FLOW_EXPOSE, "", "", f());
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void o(AfcXbsData afcXbsData) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("872168ec", new Object[]{this, afcXbsData});
            return;
        }
        this.f10580a = true;
        if (this.c != null) {
            this.d = bh0.f(afcXbsData);
            this.e = bh0.e(afcXbsData);
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = afcXbsData.expireTime;
            if (j2 > 0) {
                j = j2 * 1000;
            } else {
                j = 10;
            }
            TBFloatingLayer.w().B(BigDecimal.valueOf(currentTimeMillis + j)).D(TBFloatingLayer.FloatingType.SHOW_ONCE).C(this.c, afcXbsData).E(this).F();
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a, tb.hxt
    public void onClick() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        qg0 qg0Var = this.c;
        if (qg0Var != null) {
            str = qg0Var.f26733a;
        } else {
            str = null;
        }
        TBS.Ext.commitEvent(1013, "applink_back", str, Long.valueOf(System.currentTimeMillis()));
        super.onClick();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public void r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54dbabc", new Object[]{this, activity});
        } else if (this.f10580a && TBFloatingLayer.B != null && this.d) {
            String e = AfcUtils.e(activity);
            if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(this.f) && !e.equals(this.f)) {
                String str = this.f;
                vp9.a("linkx", "TbXbsPluginAdapter.switchPage.切换页面，小把手销毁.activityKeyCode=" + e + ".mShowActivityCode=" + str + ".");
                a(CLOSE_REASON_SWITCH_PAGE);
            }
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.a
    public HashMap<String, String> f() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4aa26f3d", new Object[]{this});
        }
        HashMap<String, String> f = super.f();
        String str = "";
        f.put("sourceAppkey", !TextUtils.isEmpty(this.c.f26733a) ? this.c.f26733a : str);
        f.put("source", !TextUtils.isEmpty(this.c.h) ? this.c.h : str);
        f.put(rg0.SOURCE_PACKAGE_NAME, !TextUtils.isEmpty(qg0.D) ? qg0.D : str);
        f.put("backUrl", !TextUtils.isEmpty(this.c.g) ? this.c.g : str);
        if (!TextUtils.isEmpty(this.c.n)) {
            str = this.c.n;
        }
        f.put("url", str);
        AfcXbsData afcXbsData = this.c.y;
        if (afcXbsData != null) {
            i = afcXbsData.tipsStrategy;
        }
        f.put("xbsStrategy", String.valueOf(i));
        f.put(MspEventTypes.ACTION_INVOKE_SHOW_PAGE, String.valueOf(this.f));
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r8.equals("background") == false) goto L_0x0024;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.linkmanager.afc.xbs.a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "a26c1510"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            r8.hashCode()
            r3 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r4 = ""
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1834032894: goto L_0x0046;
                case -1332194002: goto L_0x003d;
                case -482160747: goto L_0x0032;
                case 2129249466: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r0 = -1
            goto L_0x0051
        L_0x0026:
            java.lang.String r0 = "switch_page"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0030
            goto L_0x0024
        L_0x0030:
            r0 = 3
            goto L_0x0051
        L_0x0032:
            java.lang.String r0 = "close_btn"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003b
            goto L_0x0024
        L_0x003b:
            r0 = 2
            goto L_0x0051
        L_0x003d:
            java.lang.String r1 = "background"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0051
            goto L_0x0024
        L_0x0046:
            java.lang.String r0 = "left_swipe"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0050
            goto L_0x0024
        L_0x0050:
            r0 = 0
        L_0x0051:
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x006b;
                case 2: goto L_0x0060;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0080
        L_0x0055:
            java.lang.String r8 = "return_refer_app_switchpage"
            java.util.HashMap r0 = r7.f()
            tb.ah0.c(r3, r8, r4, r4, r0)
            goto L_0x0080
        L_0x0060:
            java.lang.String r8 = "return_refer_app_close"
            java.util.HashMap r0 = r7.f()
            tb.ah0.c(r3, r8, r4, r4, r0)
            goto L_0x0080
        L_0x006b:
            java.lang.String r8 = "return_refer_app_background"
            java.util.HashMap r0 = r7.f()
            tb.ah0.c(r3, r8, r4, r4, r0)
            goto L_0x0080
        L_0x0076:
            java.lang.String r8 = "return_refer_app_swipe"
            java.util.HashMap r0 = r7.f()
            tb.ah0.c(r3, r8, r4, r4, r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.linkmanager.afc.xbs.a.t(java.lang.String):void");
    }
}
