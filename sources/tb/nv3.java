package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.qrcode.result.Result;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.statistic.TBS;
import com.taobao.tao.backflow.dialog.NewTaoPasswordDialog;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Properties;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nv3 implements View.OnClickListener, aib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f24966a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(nv3 nv3Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            hip.c(ClipUrlWatcherControl.z().q());
            ClipUrlWatcherControl.z().n();
            ClipUrlWatcherControl.z().I(null);
            ClipUrlWatcherControl.z().H(0);
            TBS.Ext.commitEvent("CopyTips_TimeOut_Close", (Properties) null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TLog.logi("ClipUrlWatcherControl", "click re-loading");
            ClipUrlWatcherControl.z().H(1);
            ClipUrlWatcherControl.z().I(null);
            ClipUrlWatcherControl.z().m(null);
            nv3.b(nv3.this);
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).S();
            TBS.Ext.commitEvent("CopyTips_TimeOut_Reload", (Properties) null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(nv3 nv3Var) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Ext.commitEvent("Page_Extend_CloseLoading", (Properties) null);
            TLog.logi("ClipUrlWatcherControlImp", "closeWithParam loading_close");
            ClipUrlWatcherControl.z().P(true);
            ClipUrlWatcherControl.z().E();
            ClipUrlWatcherControl.z().I(null);
            hip.c(ClipUrlWatcherControl.z().q());
            ClipUrlWatcherControl.z().n();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements DialogInterface.OnCancelListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(nv3 nv3Var) {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                return;
            }
            ClipUrlWatcherControl.z().n();
            ClipUrlWatcherControl.z().I(null);
            ClipUrlWatcherControl.z().E();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nv3 f24968a = new nv3(null);

        static {
            t2o.a(666894342);
        }

        public static /* synthetic */ nv3 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nv3) ipChange.ipc$dispatch("8cf4c167", new Object[0]);
            }
            return f24968a;
        }
    }

    static {
        t2o.a(666894337);
        t2o.a(665845794);
    }

    public /* synthetic */ nv3(a aVar) {
        this();
    }

    public static /* synthetic */ void b(nv3 nv3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dae842", new Object[]{nv3Var});
        } else {
            nv3Var.k();
        }
    }

    public static nv3 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nv3) ipChange.ipc$dispatch("f2f59203", new Object[0]);
        }
        return e.a();
    }

    public final void c(int i, String str, bis bisVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a4fe2c", new Object[]{this, new Integer(i), str, bisVar});
        } else if (bisVar != null && !TextUtils.isEmpty(bisVar.b) && !o(i, bisVar)) {
            if (bisVar.e) {
                str3 = "uncheck";
                str2 = "mycopy";
            } else {
                str3 = FactoryType.TYPE_INVALID;
                str2 = "otherscopy";
            }
            d(str, str2, str3);
        }
    }

    public final void d(String str, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b6d891f", new Object[]{this, str, str2, str3});
            return;
        }
        String str5 = ClipUrlWatcherControl.z().t().b;
        if (TemplateId.ITEM.equals(str5)) {
            str4 = "item";
        } else if (TemplateId.SHOP.equals(str5)) {
            str4 = "shop";
        } else if (TemplateId.COUPON.equals(str5)) {
            str4 = "coupon";
        } else if (TemplateId.COMMON.equals(str5)) {
            str4 = "common";
        } else {
            str4 = "others";
        }
        Properties properties = new Properties();
        if (ClipUrlWatcherControl.z().t().i == null) {
            properties.put("returnType", Result.MSG_SUCCESS);
        } else {
            properties.put("returnType", ClipUrlWatcherControl.z().t().i);
        }
        if (!TextUtils.isEmpty(ClipUrlWatcherControl.z().t().f16414a)) {
            properties.put("BID", ClipUrlWatcherControl.z().t().f16414a);
        } else {
            properties.put("BID", "");
        }
        if (str != null) {
            properties.put("shareType", str4);
            if (!TextUtils.isEmpty(ClipUrlWatcherControl.z().t().c)) {
                properties.put("url", ClipUrlWatcherControl.z().t().c);
            }
            properties.put("showType", "taobao");
            if (!TextUtils.isEmpty(str2)) {
                properties.put("pageType", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                properties.put("alertType", str3);
            }
            if (!TextUtils.isEmpty(ClipUrlWatcherControl.z().t().h)) {
                properties.put("passwordType", ClipUrlWatcherControl.z().t().h);
            } else {
                properties.put("passwordType", "");
            }
            bis t = ClipUrlWatcherControl.z().t();
            if (t instanceof ihs) {
                if (!TextUtils.isEmpty(((ihs) t).x)) {
                    properties.put("ShowUserName", "1");
                } else {
                    properties.put("ShowUserName", "0");
                }
            }
            if (ClipUrlWatcherControl.z().t().j != null) {
                String str6 = ClipUrlWatcherControl.z().t().j.get("createAppkey");
                if (!TextUtils.isEmpty(str6)) {
                    properties.put("appKey", str6);
                }
            }
            bis t2 = ClipUrlWatcherControl.z().t();
            Map<String, String> map = t2.m;
            if (map != null && !map.isEmpty()) {
                properties.put("s_appendParam", t2.m);
            }
            String str7 = t2.d;
            if (str7 != null) {
                properties.put("passwordorigin", str7);
            }
            TBS.Ext.commitEvent(str, properties);
        }
    }

    public final void f(WeakReference<Activity> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb706bff", new Object[]{this, weakReference});
        } else {
            g(weakReference, false, null);
        }
    }

    public final void g(WeakReference<Activity> weakReference, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9348d3f", new Object[]{this, weakReference, new Boolean(z), str});
        } else if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity == null) {
                TLog.loge("ClipUrlWatcherControl", "showDialog activity is null");
                return;
            }
            if (ClipUrlWatcherControl.z().u() != null) {
                ClipUrlWatcherControl.z().n();
            }
            ClipUrlWatcherControl.z().J(new NewTaoPasswordDialog(activity, z, str));
            ClipUrlWatcherControl.z().u().setOnCancelListener(new d(this));
            this.f24966a = weakReference;
        }
    }

    public final boolean i(WeakReference<Activity> weakReference, WeakReference<Activity> weakReference2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58ed19a6", new Object[]{this, weakReference, weakReference2})).booleanValue();
        }
        if (weakReference == null || weakReference2 == null || weakReference.get() != weakReference2.get()) {
            return false;
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1429e43d", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.sharepassword.securitytipoff");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedSession(false);
        RemoteBusiness.build(mtopRequest).startRequest();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1f00cd", new Object[]{this});
        } else {
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).C(new c(this));
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0bedb8", new Object[]{this});
        } else if (ClipUrlWatcherControl.z().u() != null) {
            fwr.c("ClipUrlWatcherControl", " showDialogWithLoading ！=null");
        } else {
            if (ClipUrlWatcherControl.z().u() == null) {
                f(ClipUrlWatcherControl.z().s());
            }
            if (ClipUrlWatcherControl.z().u() == null) {
                fwr.c("ClipUrlWatcherControl", " Init ClipUrlDialog failed!");
                return;
            }
            k();
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).Q();
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).Z();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bd9264", new Object[]{this});
            return;
        }
        String r = ClipUrlWatcherControl.z().r();
        if (TextUtils.isEmpty(r)) {
            ClipUrlWatcherControl.z().n();
            fwr.c("ClipUrlWatcherControl", Localization.q(R.string.taobao_app_1010_1_17880));
            return;
        }
        if (!i(this.f24966a, ClipUrlWatcherControl.z().s())) {
            ClipUrlWatcherControl.z().n();
            f(ClipUrlWatcherControl.z().s());
        } else if (ClipUrlWatcherControl.z().u() == null) {
            f(ClipUrlWatcherControl.z().s());
        }
        if (ClipUrlWatcherControl.z().u() == null) {
            fwr.c("ClipUrlWatcherControl", " Init ClipUrlDialog failed!");
            return;
        }
        ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).B(new a(this), new b());
        if (ClipUrlWatcherControl.z().u() == null) {
            fwr.c("ClipUrlWatcherControl", "Init ClipUrlDialog failed!");
            return;
        }
        ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).H(r);
        try {
            if (ClipUrlWatcherControl.z().u() != null) {
                ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).Z();
                fwr.a("ClipUrlWatcherControl", "ok, final showWithPopUpCenter");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        TBS.Ext.commitEvent("Page_Extend_ShowCopy_timeOut", (Properties) null);
    }

    public void n() {
        WeakReference<Activity> weakReference;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692ca0a7", new Object[]{this});
            return;
        }
        p();
        if (ClipUrlWatcherControl.z().u() != null && ClipUrlWatcherControl.z().s() != null && (weakReference = this.f24966a) != null && weakReference.get() != null && !this.f24966a.get().isFinishing()) {
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).Z();
            if (ClipUrlWatcherControl.z().t() != null) {
                String str2 = ClipUrlWatcherControl.z().t().i;
                if (TextUtils.isEmpty(str2) || TextUtils.equals("PASSWORD_INVALID", str2)) {
                    AppMonitor.Alarm.commitSuccess("share", "Share_opentaopwd");
                    if (ClipUrlWatcherControl.z().t().e) {
                        str = "mycopy";
                    } else {
                        str = "otherscopy";
                    }
                    d(e(ClipUrlWatcherControl.z().t(), "Page_Extend_ShowCopy", "Page_Extend_ShowSavePic"), str, null);
                    ClipUrlWatcherControl.z().O(System.currentTimeMillis());
                    hip.c(ClipUrlWatcherControl.z().q());
                    return;
                }
                if (TextUtils.equals("PASSWORD_NOT_EXIST", str2)) {
                    TBS.Ext.commitEvent("Page_Extend_ShowCopy_notExist", (Properties) null);
                } else {
                    TBS.Ext.commitEvent("Page_Extend_ShowCopy_others", (Properties) null);
                }
                AppMonitor.Alarm.commitFail("share", "Share_opentaopwd", str2, Localization.q(R.string.taobao_app_1010_1_17887));
            }
        }
    }

    public final boolean o(int i, bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7016308e", new Object[]{this, new Integer(i), bisVar})).booleanValue();
        }
        if (i == R.id.contacts_share_anti_hijack_title_view) {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickInfor");
            return true;
        } else if (i == R.id.contacts_share_anti_hijack_go_on) {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickOpen", bisVar.f16414a + "," + lwr.c(bisVar), bisVar.c);
            return true;
        } else if (i != R.id.contacts_share_anti_hijack_report) {
            return false;
        } else {
            TBS.Ext.commitEvent("Page_Share", 19999, "WeakShowPop_Button-ClickFeedback", bisVar.f16414a + "," + lwr.c(bisVar), bisVar.c);
            return true;
        }
    }

    public final void p() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc0b78", new Object[]{this});
        } else if (ClipUrlWatcherControl.z().t() != null) {
            bis t = ClipUrlWatcherControl.z().t();
            if (TemplateId.WEEX.equals(t.b) && (t instanceof pis)) {
                z = true;
            }
            if (!i(this.f24966a, ClipUrlWatcherControl.z().s())) {
                ClipUrlWatcherControl.z().n();
                g(ClipUrlWatcherControl.z().s(), z, t.f16414a);
            } else if (ClipUrlWatcherControl.z().u() == null) {
                g(ClipUrlWatcherControl.z().s(), z, t.f16414a);
            }
            if (ClipUrlWatcherControl.z().u() == null) {
                fwr.c("ClipUrlWatcherControl", "Init ClipUrlDialog failed!");
                return;
            }
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).B(this, this);
            ((NewTaoPasswordDialog) ClipUrlWatcherControl.z().u()).E(ClipUrlWatcherControl.z().t());
            fwr.a("ClipUrlWatcherControl", "ok,显示淘口令对话框!");
        }
    }

    public nv3() {
    }

    public final String e(bis bisVar, String str, String str2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e59ec98f", new Object[]{this, bisVar, str, str2});
        }
        if (bisVar != null) {
            z = "pic".equals(bisVar.h);
        }
        return z ? str2 : str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (ClipUrlWatcherControl.z().u() != null) {
            int id = view != null ? view.getId() : 0;
            if (id == R.id.tpd_common_close || id == 0) {
                bis t = ClipUrlWatcherControl.z().t();
                if (t != null) {
                    String str = t.b + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + t.d + "," + t.b;
                    if (t instanceof pis) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        pis pisVar = (pis) t;
                        sb.append(pisVar.t);
                        sb.append(",");
                        sb.append(pisVar.z);
                        str = sb.toString();
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewClose", null, null, str);
                }
                ClipUrlWatcherControl.z().n();
            } else if (id == R.id.contacts_share_anti_hijack_title_view) {
                Nav.from(hjp.a()).toUri("http://huodong.m.taobao.com/act/com.taobao.share.taopassword.html");
                ClipUrlWatcherControl.z().n();
            } else if (id == R.id.contacts_share_anti_hijack_report) {
                ClipUrlWatcherControl.z().n();
                j();
                Toast.makeText(hjp.a(), R.string.contacts_share_anti_hijack_report_success, 0).show();
                bis t2 = ClipUrlWatcherControl.z().t();
                if (t2 != null) {
                    String str2 = t2.b + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + t2.d + "," + t2.b;
                    if (t2 instanceof pis) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(",");
                        pis pisVar2 = (pis) t2;
                        sb2.append(pisVar2.t);
                        sb2.append(",");
                        sb2.append(pisVar2.z);
                        str2 = sb2.toString();
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewReport", null, null, str2);
                }
            } else {
                ClipUrlWatcherControl.z().n();
                bis t3 = ClipUrlWatcherControl.z().t();
                if (t3 != null && !TextUtils.isEmpty(t3.c) && TextUtils.isEmpty(t3.i)) {
                    if (!TextUtils.isEmpty(t3.l)) {
                        String str3 = t3.l;
                        if (!kip.p()) {
                            try {
                                String queryParameter = Uri.parse(t3.c).getQueryParameter("ut_sk");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    Uri parse = Uri.parse(t3.l);
                                    if (!"/n/im/dynamic/quickchat.html".equals(parse.getPath()) && !"/n/im/dynamic/middleContainer.html".equals(parse.getPath())) {
                                        Uri.Builder buildUpon = parse.buildUpon();
                                        buildUpon.appendQueryParameter("ut_sk", queryParameter);
                                        buildUpon.appendQueryParameter("s_share_url", URLEncoder.encode(t3.l, "utf-8"));
                                        str3 = buildUpon.build().toString();
                                    }
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        if (ShareBizAdapter.getInstance().getAppEnv().f(str3)) {
                            Nav.from(hjp.a()).toUri(str3);
                        }
                    } else if (ShareBizAdapter.getInstance().getAppEnv().f(t3.c)) {
                        Nav.from(hjp.a()).toUri(t3.c);
                    }
                    String str4 = t3.b + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + t3.d + "," + t3.b;
                    if (t3 instanceof pis) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str4);
                        sb3.append(",");
                        pis pisVar3 = (pis) t3;
                        sb3.append(pisVar3.t);
                        sb3.append(",");
                        sb3.append(pisVar3.z);
                        str4 = sb3.toString();
                    }
                    TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewGo", null, null, str4);
                } else {
                    return;
                }
            }
            hip.c(ClipUrlWatcherControl.z().q());
            c(id, e(ClipUrlWatcherControl.z().t(), "CopyTips_Close", "SavePic_Close"), ClipUrlWatcherControl.z().t());
            ClipUrlWatcherControl.z().I(null);
            ClipUrlWatcherControl.z().H(0);
        }
    }

    @Override // tb.aib
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800c8bd7", new Object[]{this, new Integer(i)});
            return;
        }
        kkp.e().a(kkp.KEY_SHAREBACKSHOWDIALOG);
        if (ClipUrlWatcherControl.z().U()) {
            fwr.c("ClipUrlWatcherControl", " showTaoPasswordStop true");
        } else if (i == 1) {
            l();
        } else if (i == 2) {
            n();
        } else if (i == 3) {
            n();
        } else if (i == 4) {
            m();
        }
    }
}
