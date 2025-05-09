package com.taobao.tao.backflow.dialog;

import android.app.AlertDialog;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.statistic.TBS;
import com.taobao.tao.backflow.mtop.TaoPassWordRequest;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import com.taobao.uikit.extend.feature.view.TPriceTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;
import tb.bis;
import tb.bwr;
import tb.f7l;
import tb.fwr;
import tb.hip;
import tb.hjp;
import tb.ihs;
import tb.iis;
import tb.kip;
import tb.kkp;
import tb.l8t;
import tb.lkp;
import tb.lr7;
import tb.lwr;
import tb.mip;
import tb.pis;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.tgs;
import tb.uwn;
import tb.wcm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NewTaoPasswordDialog extends Dialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f11902a;
    public View.OnClickListener b;
    public final Context c;
    public l8t e;
    public ViewGroup g;
    public TpwdLoadingView h;
    public ViewGroup i;
    public ViewGroup j;
    public ViewGroup k;
    public ViewGroup l;
    public ViewGroup m;
    public ViewGroup n;
    public ViewStub o;
    public ViewStub p;
    public ViewStub q;
    public ViewStub r;
    public ViewStub t;
    public WeexBizView x;
    public bis y;
    public static int z = 300;
    public static final int A = Result.ALIPAY_GENERATE_UNREG_NODE_FAILED;
    public boolean d = false;
    public String f = null;
    public int u = -1;
    public boolean v = true;
    public int w = 0;
    public final ViewStub s = (ViewStub) findViewById(R.id.tpd_view_error);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements WeexBizView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11903a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.tao.backflow.dialog.NewTaoPasswordDialog$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0672a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0672a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.this.close();
                ClipUrlWatcherControl.z().n();
                ClipUrlWatcherControl.z().I(null);
                ClipUrlWatcherControl.z().H(0);
            }
        }

        public a(String str, String str2) {
            this.f11903a = str;
            this.b = str2;
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d1f986", new Object[]{this, str, map});
                return;
            }
            kkp.e().i(NewTaoPasswordDialog.a(NewTaoPasswordDialog.this), kkp.SHARE_BACKFLOW_DESTROYE);
            NewTaoPasswordDialog.a(NewTaoPasswordDialog.this).clear();
            ClipUrlWatcherControl.z().t().l = str;
            ClipUrlWatcherControl.z().t().m = map;
            new StringBuilder("update url:").append(str);
            NewTaoPasswordDialog.b(NewTaoPasswordDialog.this).onClick(NewTaoPasswordDialog.a(NewTaoPasswordDialog.this));
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void b(WeexBizView weexBizView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e81cc09", new Object[]{this, weexBizView});
                return;
            }
            String str = this.b;
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexRenderError", str, "weexUrl=" + this.f11903a + ",err=" + weexBizView.getTag().toString());
            kkp.e().i(NewTaoPasswordDialog.a(NewTaoPasswordDialog.this), kkp.SHARE_BACKFLOW_DESTROYE);
            NewTaoPasswordDialog.a(NewTaoPasswordDialog.this).post(new RunnableC0672a());
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void c(WeexBizView weexBizView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4569b455", new Object[]{this, weexBizView, view});
            } else {
                kkp.e().h(NewTaoPasswordDialog.a(NewTaoPasswordDialog.this), kkp.SHARE_BACKFLOW_CREATE, kkp.SHARE_BACKFLOW_PAGENAME, this.f11903a, null);
            }
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.b
        public void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            kkp.e().i(NewTaoPasswordDialog.a(NewTaoPasswordDialog.this), kkp.SHARE_BACKFLOW_DESTROYE);
            NewTaoPasswordDialog.a(NewTaoPasswordDialog.this).clear();
            NewTaoPasswordDialog.b(NewTaoPasswordDialog.this).onClick(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlertDialog f11905a;

        public b(NewTaoPasswordDialog newTaoPasswordDialog, AlertDialog alertDialog) {
            this.f11905a = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f11905a.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlertDialog f11906a;
        public final /* synthetic */ tgs b;

        public c(AlertDialog alertDialog, tgs tgsVar) {
            this.f11906a = alertDialog;
            this.b = tgsVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f11906a.dismiss();
            NewTaoPasswordDialog.n(NewTaoPasswordDialog.this, this.b);
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
            } else if (NewTaoPasswordDialog.o(NewTaoPasswordDialog.this) != null && mip.o(NewTaoPasswordDialog.o(NewTaoPasswordDialog.this).f16414a)) {
                SpUtils.saveShareShowingTimestamp(0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                NewTaoPasswordDialog.c(NewTaoPasswordDialog.this);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11909a;

        public f(View view) {
            this.f11909a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            this.f11909a.setVisibility(0);
            NewTaoPasswordDialog.e(NewTaoPasswordDialog.this).setVisibility(0);
            NewTaoPasswordDialog.d(NewTaoPasswordDialog.this).setInnerViewsVisibility(true);
            NewTaoPasswordDialog.f(NewTaoPasswordDialog.this, this.f11909a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            } else {
                NewTaoPasswordDialog.d(NewTaoPasswordDialog.this).setInnerViewsVisibility(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                NewTaoPasswordDialog.d(NewTaoPasswordDialog.this).setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements DialogInterface.OnKeyListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("196ae81c", new Object[]{this, dialogInterface, new Integer(i), keyEvent})).booleanValue();
            }
            if (i == 4 && keyEvent.getRepeatCount() == 0 && NewTaoPasswordDialog.g(NewTaoPasswordDialog.this)) {
                hip.c(ClipUrlWatcherControl.z().q());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ bis f11912a;

        public i(bis bisVar) {
            this.f11912a = bisVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("originalUrl", this.f11912a.c);
                TFCCommonUtils.p(TFCCommonUtils.FlowType.SHARE, this.f11912a.c, hashMap);
            } catch (Throwable th) {
                th.printStackTrace();
                fwr.b("NewTaoPasswordDialog", "handleFlowParams err:" + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements WeexBizView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11913a;
        public final /* synthetic */ pis b;
        public final /* synthetic */ WeexBizView c;

        public j(ViewGroup viewGroup, pis pisVar, WeexBizView weexBizView) {
            this.f11913a = viewGroup;
            this.b = pisVar;
            this.c = weexBizView;
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d1f986", new Object[]{this, str, map});
                return;
            }
            this.c.clear();
            ClipUrlWatcherControl.z().t().l = str;
            ClipUrlWatcherControl.z().t().m = map;
            new StringBuilder("update url:").append(str);
            NewTaoPasswordDialog.b(NewTaoPasswordDialog.this).onClick(this.c);
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void b(WeexBizView weexBizView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e81cc09", new Object[]{this, weexBizView});
                return;
            }
            this.f11913a.setVisibility(4);
            if (NewTaoPasswordDialog.h(NewTaoPasswordDialog.this) == null) {
                NewTaoPasswordDialog newTaoPasswordDialog = NewTaoPasswordDialog.this;
                NewTaoPasswordDialog.i(newTaoPasswordDialog, NewTaoPasswordDialog.k(newTaoPasswordDialog, NewTaoPasswordDialog.h(newTaoPasswordDialog), NewTaoPasswordDialog.j(NewTaoPasswordDialog.this), R.id.tpd_view_error));
            }
            NewTaoPasswordDialog newTaoPasswordDialog2 = NewTaoPasswordDialog.this;
            NewTaoPasswordDialog.l(newTaoPasswordDialog2, NewTaoPasswordDialog.h(newTaoPasswordDialog2), this.b);
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void c(WeexBizView weexBizView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4569b455", new Object[]{this, weexBizView, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11914a;

        public k(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup) {
            this.f11914a = viewGroup;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f11914a.findViewById(R.id.tpd_common_img_default).setVisibility(4);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11915a;

        public l(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup) {
            this.f11915a = viewGroup;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f11915a.findViewById(R.id.tpd_shop_sign_default).setVisibility(4);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f11916a;

        public m(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup) {
            this.f11916a = viewGroup;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.f11916a.findViewById(R.id.tpd_item_img_default).setVisibility(4);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f11917a;

        public n(NewTaoPasswordDialog newTaoPasswordDialog, View view) {
            this.f11917a = view;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (succPhenixEvent.getDrawable() instanceof uwn) {
                    ((uwn) succPhenixEvent.getDrawable()).l();
                }
                this.f11917a.setBackground(drawable);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tgs f11918a;

        public o(tgs tgsVar) {
            this.f11918a = tgsVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                NewTaoPasswordDialog.m(NewTaoPasswordDialog.this, this.f11918a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class p extends AsyncTask<bis, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<NewTaoPasswordDialog> f11919a;

        static {
            t2o.a(666894361);
        }

        public p(NewTaoPasswordDialog newTaoPasswordDialog) {
            this.f11919a = new WeakReference<>(newTaoPasswordDialog);
        }

        public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/backflow/dialog/NewTaoPasswordDialog$DialogShowingTask");
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
            } else if (bool.booleanValue()) {
                NewTaoPasswordDialog newTaoPasswordDialog = this.f11919a.get();
                if (newTaoPasswordDialog != null) {
                    if (newTaoPasswordDialog.r() == null) {
                        newTaoPasswordDialog.G(new l8t(newTaoPasswordDialog));
                    }
                    boolean b = wcm.a(newTaoPasswordDialog.q()).b(newTaoPasswordDialog.r());
                    fwr.d("调用IPopCenter#addPopOperation,result=" + b);
                    return;
                }
                fwr.d("【异常】dialog=null");
            } else {
                fwr.d("【异常】isNeedShowing=false");
            }
        }

        /* renamed from: a */
        public Boolean doInBackground(bis... bisVarArr) {
            bis bisVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("2e29838d", new Object[]{this, bisVarArr});
            }
            if (!(this.f11919a.get() == null || (bisVar = bisVarArr[0]) == null)) {
                String str = bisVar.f16414a;
                if (mip.o(str)) {
                    if (!SpUtils.getPlayTogetherIsShowing()) {
                        SpUtils.saveShareShowingTimestamp(System.currentTimeMillis());
                    } else {
                        fwr.d("【异常】一起逛不弹淘口令，bizId=" + str);
                        return Boolean.FALSE;
                    }
                }
            }
            return Boolean.TRUE;
        }
    }

    static {
        t2o.a(666894343);
    }

    public NewTaoPasswordDialog(Context context, boolean z2, String str) {
        super(context, R.style.ShareTBDialog);
        I();
        this.c = context;
        w(context, z2, str);
        if (this.x == null) {
            x();
        }
    }

    public static /* synthetic */ WeexBizView a(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBizView) ipChange.ipc$dispatch("84ea780b", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.x;
    }

    public static /* synthetic */ View.OnClickListener b(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("3707a820", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.b;
    }

    public static /* synthetic */ void c(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4645f949", new Object[]{newTaoPasswordDialog});
        } else {
            newTaoPasswordDialog.T();
        }
    }

    public static /* synthetic */ TpwdLoadingView d(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TpwdLoadingView) ipChange.ipc$dispatch("ada62cf2", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.h;
    }

    public static /* synthetic */ ViewGroup e(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("df0722e", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.g;
    }

    public static /* synthetic */ void f(NewTaoPasswordDialog newTaoPasswordDialog, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377ce7ac", new Object[]{newTaoPasswordDialog, view});
        } else {
            newTaoPasswordDialog.M(view);
        }
    }

    public static /* synthetic */ boolean g(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("179c1dda", new Object[]{newTaoPasswordDialog})).booleanValue();
        }
        newTaoPasswordDialog.getClass();
        return false;
    }

    public static /* synthetic */ ViewGroup h(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7951a540", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.n;
    }

    public static /* synthetic */ ViewGroup i(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("41cd723", new Object[]{newTaoPasswordDialog, viewGroup});
        }
        newTaoPasswordDialog.n = viewGroup;
        return viewGroup;
    }

    public static /* synthetic */ Object ipc$super(NewTaoPasswordDialog newTaoPasswordDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/backflow/dialog/NewTaoPasswordDialog");
        }
    }

    public static /* synthetic */ ViewStub j(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d86ea748", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.s;
    }

    public static /* synthetic */ ViewGroup k(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup, ViewStub viewStub, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("752aae84", new Object[]{newTaoPasswordDialog, viewGroup, viewStub, new Integer(i2)});
        }
        return newTaoPasswordDialog.v(viewGroup, viewStub, i2);
    }

    public static /* synthetic */ void l(NewTaoPasswordDialog newTaoPasswordDialog, ViewGroup viewGroup, bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba60b91", new Object[]{newTaoPasswordDialog, viewGroup, bisVar});
        } else {
            newTaoPasswordDialog.F(viewGroup, bisVar);
        }
    }

    public static /* synthetic */ void m(NewTaoPasswordDialog newTaoPasswordDialog, tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db79d805", new Object[]{newTaoPasswordDialog, tgsVar});
        } else {
            newTaoPasswordDialog.U(tgsVar);
        }
    }

    public static /* synthetic */ void n(NewTaoPasswordDialog newTaoPasswordDialog, tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466af086", new Object[]{newTaoPasswordDialog, tgsVar});
        } else {
            newTaoPasswordDialog.z(tgsVar);
        }
    }

    public static /* synthetic */ bis o(NewTaoPasswordDialog newTaoPasswordDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bis) ipChange.ipc$dispatch("7700d587", new Object[]{newTaoPasswordDialog});
        }
        return newTaoPasswordDialog.y;
    }

    public static <K, V> V s(Map<K, V> map, K k2, V v) {
        V v2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("6e158233", new Object[]{map, k2, v});
        }
        if (map == null || map.isEmpty() || (v2 = map.get(k2)) == null) {
            return v;
        }
        return v2;
    }

    public final void A(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc521a58", new Object[]{this, layoutParams});
            return;
        }
        int i2 = this.u;
        if (i2 >= 0) {
            if (this.v) {
                layoutParams.width = i2;
                layoutParams.height = (int) ((layoutParams.height * (i2 / (layoutParams.width * 1.0d))) + 20.0d);
                return;
            }
            int i3 = this.w;
            layoutParams.width = (int) ((i3 / 750.0f) * 640.0f);
            layoutParams.height = (int) (((i3 / 750.0f) - 80.0f) * 418.0f);
        }
    }

    public void B(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a13b941", new Object[]{this, onClickListener, onClickListener2});
            return;
        }
        View view = this.f11902a;
        if (view != null) {
            ViewProxy.setOnClickListener(view, onClickListener);
        }
        this.b = onClickListener2;
    }

    public void C(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc7e44c", new Object[]{this, onClickListener});
        } else {
            ViewProxy.setOnClickListener(this.f11902a, onClickListener);
        }
    }

    public void E(bis bisVar) {
        ViewGroup viewGroup;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca17ea33", new Object[]{this, bisVar});
        } else if (this.x != null) {
            X(bisVar);
        } else {
            if (bisVar == null || !TextUtils.isEmpty(bisVar.i)) {
                viewGroup = null;
                if (bisVar != null) {
                    str = bisVar.i;
                } else {
                    str = null;
                }
                if (mip.r(str)) {
                    ViewGroup viewGroup2 = this.n;
                    if (viewGroup2 == null) {
                        this.n = v(viewGroup2, this.s, R.id.tpd_view_error);
                    }
                    O();
                    F(this.n, bisVar);
                    viewGroup = this.n;
                } else {
                    ClipUrlWatcherControl.z().n();
                }
            } else {
                ViewGroup viewGroup3 = this.n;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                viewGroup = Y(bisVar);
                if (viewGroup == null) {
                    ViewGroup viewGroup4 = this.n;
                    if (viewGroup4 == null) {
                        this.n = v(viewGroup4, this.s, R.id.tpd_view_error);
                    }
                    O();
                    F(this.n, bisVar);
                    viewGroup = this.n;
                }
            }
            if (this.d) {
                N(viewGroup);
            } else {
                this.g.setVisibility(0);
                this.h.setVisibility(4);
            }
            this.d = false;
        }
    }

    public final void F(ViewGroup viewGroup, bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b53b96", new Object[]{this, viewGroup, bisVar});
            return;
        }
        if (!this.v) {
            viewGroup.getLayoutParams().height = lr7.b(this.c, 200.0f);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_error_description);
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_error_icon);
        ((TextView) viewGroup.findViewById(R.id.tpd_error_action)).setVisibility(8);
        if (bisVar == null) {
            textView.setText(Localization.q(R.string.taobao_app_1010_1_17876));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Ba48wr1dRlADInLvO_!!6000000003733-2-tps-440-440.png");
        } else if (TextUtils.equals("PASSWORD_INVALID", bisVar.i) || TextUtils.equals("PASSWORD_NOT_EXIST", bisVar.i)) {
            textView.setText(Localization.q(R.string.taobao_app_1010_1_17855));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01lAMzMc1jrlLVhW0b6_!!6000000004602-2-tps-330-330.png");
        } else {
            textView.setText(Localization.q(R.string.taobao_app_1010_1_17876));
            tUrlImageView.asyncSetImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01Ba48wr1dRlADInLvO_!!6000000003733-2-tps-440-440.png");
        }
    }

    public void G(l8t l8tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2551790f", new Object[]{this, l8tVar});
        } else {
            this.e = l8tVar;
        }
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be1277c", new Object[]{this, str});
        } else if (!mip.r("RETRY_PASSWORD")) {
            ClipUrlWatcherControl.z().n();
        } else {
            ViewGroup viewGroup = this.n;
            if (viewGroup == null) {
                this.n = v(viewGroup, this.s, R.id.tpd_view_error);
            }
            F(this.n, null);
            ((TextView) this.n.findViewById(R.id.tpd_error_description)).setText(Localization.q(R.string.taobao_app_1010_1_17848));
            TextView textView = (TextView) this.n.findViewById(R.id.tpd_error_action);
            textView.setVisibility(0);
            textView.setOnClickListener(this.b);
            if (this.d) {
                this.d = false;
                N(this.n);
            }
        }
    }

    public final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5071d070", new Object[]{this});
            return;
        }
        Window window = getWindow();
        if (kip.a()) {
            window.getDecorView().setSystemUiVisibility(3330);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public void J(View view, TextView textView, TextView textView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecf7518", new Object[]{this, view, textView, textView2});
        } else if (view != null) {
            String f2 = lkp.a.f();
            int g2 = lkp.a.g();
            if (!TextUtils.isEmpty(f2)) {
                s0m.B().T(f2).succListener(new n(this, view)).fetch();
            }
            if (g2 != -1 && (view instanceof TextView)) {
                ((TextView) view).setTextColor(g2);
            }
            int c2 = lkp.c();
            if (!(c2 == -1 || textView == null)) {
                textView.setTextColor(c2);
            }
            int b2 = lkp.b();
            if (b2 != -1 && textView2 != null) {
                textView2.setTextColor(b2);
            }
        }
    }

    public final void K(ViewGroup viewGroup, tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd3f8b1", new Object[]{this, viewGroup, tgsVar});
            return;
        }
        u(viewGroup);
        TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_image);
        if (this.v) {
            tUrlImageView.setErrorImageResId(R.drawable.tb_image_error);
            tUrlImageView.setImageUrl(tgsVar.w);
        } else {
            tUrlImageView.setVisibility(8);
        }
        View findViewById = viewGroup.findViewById(R.id.contacts_share_anti_hijack_title_layout);
        ((TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_item_name)).setText(tgsVar.v);
        TextView textView = (TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_title_view);
        textView.setOnClickListener(this.b);
        ((TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_go_on)).setOnClickListener(this.b);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.contacts_share_anti_hijack_report);
        textView2.setOnClickListener(this.b);
        String b2 = lkp.a.b();
        int c2 = lkp.a.c();
        int a2 = lkp.a.a();
        if (!TextUtils.isEmpty(b2)) {
            textView.setText(b2);
        }
        if (!(c2 == -1 || findViewById == null)) {
            findViewById.setBackgroundColor(c2);
        }
        if (a2 != -1) {
            textView2.setTextColor(a2);
        }
        TBS.Ext.commitEvent("WeakShowPop", 19999, "WeakShowPop_Show", tgsVar.s + "," + lwr.c(tgsVar), tgsVar.c);
    }

    public final void L(ViewGroup viewGroup, tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fed348", new Object[]{this, viewGroup, tgsVar});
            return;
        }
        u(viewGroup);
        if (this.v) {
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_common_img);
            if (!TextUtils.isEmpty(tgsVar.w)) {
                tUrlImageView.succListener(new k(this, viewGroup));
                tUrlImageView.setImageUrl(tgsVar.w);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_common_top_area).setVisibility(8);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_common_text);
        textView.setText(tgsVar.v);
        D(viewGroup, tgsVar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_common_action);
        textView2.setOnClickListener(this.b);
        J(textView2, textView, null);
    }

    public final void M(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58837255", new Object[]{this, view});
            return;
        }
        p(view);
        view.setVisibility(0);
        this.g.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(this.h.getAlpha(), 0.0f);
        alphaAnimation.setDuration(300L);
        this.h.setAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new g());
        alphaAnimation.startNow();
    }

    public final void N(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c76cc3", new Object[]{this, view});
        } else if (view != null) {
            p(this.h);
            this.h.setVisibility(0);
            view.setVisibility(4);
            this.g.setVisibility(4);
            int height = this.h.getHeight();
            int width = this.h.getWidth();
            int i2 = view.getLayoutParams().height;
            int i3 = view.getLayoutParams().width;
            if (i2 == 0 || i3 == 0) {
                i2 = lr7.b(getContext(), 332.0f);
                i3 = lr7.b(getContext(), 290.0f);
            }
            if (height == i2 && width == i3) {
                M(view);
                return;
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, i3 / width, 1.0f, i2 / height, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(400L);
            scaleAnimation.setFillAfter(false);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation.setAnimationListener(new f(view));
            this.h.setVisibility(0);
            this.h.setAnimation(scaleAnimation);
            scaleAnimation.startNow();
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15716ad7", new Object[]{this});
            return;
        }
        this.n.setVisibility(0);
        u(this.n);
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        this.d = true;
        R(null);
        this.f11902a.setVisibility(0);
    }

    public final void R(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dc2302", new Object[]{this, view});
            return;
        }
        this.d = true;
        if (view == null) {
            this.h.setVisibility(0);
            p(this.h);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation.setFillAfter(true);
            this.h.startAnimation(scaleAnimation);
        } else if (view.getParent() != null && view.getParent() == this.g) {
            int b2 = lr7.b(this.c, z);
            int b3 = lr7.b(this.c, A);
            int height = view.getHeight();
            int width = view.getWidth();
            p(this.h);
            if (b2 == height && b3 == width) {
                T();
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
            layoutParams.height = height;
            layoutParams.width = width;
            this.h.setLayoutParams(layoutParams);
            this.h.setVisibility(0);
            float f2 = b3 / width;
            float f3 = b2 / height;
            StringBuilder sb = new StringBuilder("loading scalex:");
            sb.append(f2);
            sb.append(",y:");
            sb.append(f3);
            sb.append(". target(x:");
            sb.append(width);
            sb.append(",y:");
            sb.append(height);
            sb.append(f7l.BRACKET_END_STR);
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, f2, 1.0f, f3, 1, 0.5f, 1, 0.0f);
            scaleAnimation2.setDuration(300L);
            scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
            scaleAnimation2.setFillAfter(false);
            scaleAnimation2.setAnimationListener(new e());
            this.h.setAnimation(scaleAnimation2);
            scaleAnimation2.start();
        }
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8ef966", new Object[]{this});
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ba7688", new Object[]{this});
            return;
        }
        this.h.setVisibility(0);
        if (this.h.getAlpha() != 1.0f) {
            p(this.h);
            AlphaAnimation alphaAnimation = new AlphaAnimation(this.h.getAlpha(), 1.0f);
            alphaAnimation.setDuration(200L);
            this.h.setAnimation(alphaAnimation);
            alphaAnimation.startNow();
        }
    }

    public final void U(tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84d1556", new Object[]{this, tgsVar});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.c, R.style.NormalDialogStyle);
        View inflate = getLayoutInflater().inflate(R.layout.taopassword_report_layout, (ViewGroup) null);
        AlertDialog create = builder.create();
        ((TextView) inflate.findViewById(R.id.tv_canle)).setOnClickListener(new b(this, create));
        ((TextView) inflate.findViewById(R.id.tv_confirm)).setOnClickListener(new c(create, tgsVar));
        create.show();
        create.getWindow().setContentView(inflate);
    }

    public final void V(ViewGroup viewGroup, iis iisVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527df572", new Object[]{this, viewGroup, iisVar});
            return;
        }
        u(viewGroup);
        if (this.v) {
            Map<String, String> map = iisVar.j;
            try {
                str = new JSONObject(map == null ? null : map.get(MspGlobalDefine.EXTENDINFO)).getString("shopSignPic");
            } catch (Throwable unused) {
                str = iisVar.w;
            }
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_sign);
            if (!TextUtils.isEmpty(str)) {
                tUrlImageView.succListener(new l(this, viewGroup));
                tUrlImageView.setImageUrl(str);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_shop_top_area).setVisibility(8);
        }
        ((TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_logo)).setImageUrl(iisVar.w);
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_shop_name);
        textView.setText(iisVar.v);
        ((TUrlImageView) viewGroup.findViewById(R.id.tpd_shop_grade)).setImageUrl(iisVar.z);
        D(viewGroup, iisVar);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_shop_action);
        textView2.setOnClickListener(this.b);
        J(textView2, textView, null);
    }

    public final void X(bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbfbd1ba", new Object[]{this, bisVar});
            return;
        }
        kkp.e().a(kkp.KEY_SHAREBACKRENDER);
        if (bisVar == null || !TextUtils.isEmpty(bisVar.i)) {
            ClipUrlWatcherControl.z().n();
            return;
        }
        String m2 = kip.m();
        try {
            Map<String, String> map = (Map) JSON.parseObject(bisVar.j.get(MspGlobalDefine.EXTENDINFO), Map.class);
            if (bisVar instanceof pis) {
                pis pisVar = (pis) bisVar;
                map.put("taopassword_ownerName", pisVar.x);
                map.put("taopassword_ownerId", pisVar.y);
                map.put("taopassword_url", pisVar.c);
            }
            map.put("share_weex_backflow_data", bisVar.o);
            map.put("launcherParams", bisVar.p);
            this.x.render(m2, map);
            fwr.d("orange close, render weex url by netowrk,url=" + m2);
            t(bisVar);
        } catch (Throwable th) {
            th.printStackTrace();
            fwr.b("NewTaoPasswordDialog", "render err: " + th.toString());
            TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexSetDataError", bisVar.f16414a, "weexUrl=" + m2 + ",err=" + th.toString());
            ClipUrlWatcherControl.z().n();
        }
        String str = bisVar.b + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + bisVar.d + "," + bisVar.f16414a;
        if (bisVar instanceof pis) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(",");
            pis pisVar2 = (pis) bisVar;
            sb.append(pisVar2.t);
            sb.append(",");
            sb.append(pisVar2.z);
            str = sb.toString();
        }
        TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewShow", bisVar.f16414a, bisVar.b, str + "," + bwr.h().m());
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3b0465", new Object[]{this});
            return;
        }
        String b2 = ShareBizAdapter.getInstance().getAppEnv().b();
        this.f = b2;
        if (TextUtils.isEmpty(b2)) {
            TLog.loge("NewTaoPasswordDialog", "mCurPageName", "mCurPageName isEmpty just show");
            show();
            return;
        }
        this.y = ClipUrlWatcherControl.z().t();
        new p(this).execute(this.y);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        fwr.d("淘口令弹窗dismiss");
        if (this.e != null && !TextUtils.isEmpty(this.f)) {
            fwr.d("invoke IPopCenter#finishPopOperation, mCurPageName=" + this.f);
            wcm.a(this.f).a(this.e);
        }
        super.dismiss();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new d());
    }

    public final void p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d48bb81", new Object[]{this, view});
        } else {
            view.animate().cancel();
        }
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b68c695", new Object[]{this});
        }
        return this.f;
    }

    public l8t r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l8t) ipChange.ipc$dispatch("8a3d58d", new Object[]{this});
        }
        return this.e;
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        fwr.d("淘口令弹窗show");
    }

    public final void t(bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d218a3a3", new Object[]{this, bisVar});
        } else {
            Coordinator.execute(new i(bisVar));
        }
    }

    public final void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d70524", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.i;
        if (!(viewGroup == null || view == viewGroup)) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.j;
        if (!(viewGroup2 == null || view == viewGroup2)) {
            viewGroup2.setVisibility(8);
        }
        ViewGroup viewGroup3 = this.k;
        if (!(viewGroup3 == null || view == viewGroup3)) {
            viewGroup3.setVisibility(8);
        }
        ViewGroup viewGroup4 = this.l;
        if (!(viewGroup4 == null || view == viewGroup4)) {
            viewGroup4.setVisibility(8);
        }
        ViewGroup viewGroup5 = this.m;
        if (!(viewGroup5 == null || view == viewGroup5)) {
            viewGroup5.setVisibility(8);
        }
        ViewGroup viewGroup6 = this.n;
        if (viewGroup6 != null && view != viewGroup6) {
            viewGroup6.setVisibility(8);
        }
    }

    public final ViewGroup v(ViewGroup viewGroup, ViewStub viewStub, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("40b5b27e", new Object[]{this, viewGroup, viewStub, new Integer(i2)});
        }
        if (viewGroup == null) {
            if (viewStub != null) {
                viewStub.inflate();
            }
            viewGroup = (ViewGroup) findViewById(i2);
            A(viewGroup.getLayoutParams());
        }
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72596922", new Object[]{this});
            return;
        }
        this.g = (ViewGroup) findViewById(R.id.tpd_common_container);
        this.f11902a = findViewById(R.id.tpd_common_close);
        this.h = (TpwdLoadingView) findViewById(R.id.tpd_common_loading);
        this.o = (ViewStub) findViewById(R.id.tpd_view_shop);
        this.p = (ViewStub) findViewById(R.id.tpd_view_item);
        this.q = (ViewStub) findViewById(R.id.tpd_view_common);
        this.r = (ViewStub) findViewById(R.id.tpd_view_weex);
        this.t = (ViewStub) findViewById(R.id.tpd_view_anti_hijack);
        if (!this.v) {
            z = 200;
            this.h.findViewById(R.id.clip_tpd_loading_view1).setVisibility(8);
            this.h.getLayoutParams().height = lr7.b(this.c, z);
        }
    }

    public final tgs y(bis bisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgs) ipChange.ipc$dispatch("4437c995", new Object[]{this, bisVar});
        }
        tgs tgsVar = new tgs();
        try {
            tgsVar.v = bisVar.j.remove("content");
            bisVar.j.remove("title");
            tgsVar.w = bisVar.j.remove("picUrl");
            bisVar.j.remove("leftButtonText");
            bisVar.j.remove("rightButtonText");
        } catch (Throwable unused) {
            TLog.logi("TaoPasswordDialog", " parseCommonData error.");
        }
        tgsVar.s = bisVar.f16414a;
        tgsVar.b = bisVar.b;
        tgsVar.c = bisVar.c;
        tgsVar.e = bisVar.e;
        tgsVar.h = bisVar.h;
        tgsVar.i = bisVar.i;
        tgsVar.j = bisVar.j;
        return tgsVar;
    }

    public final void z(tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d4853d", new Object[]{this, tgsVar});
            return;
        }
        TaoPassWordRequest taoPassWordRequest = new TaoPassWordRequest();
        String str = tgsVar.q.f31916a;
        if (str != null) {
            taoPassWordRequest.setPasswordContent(str);
        } else {
            taoPassWordRequest.setPasswordContent(tgsVar.v);
        }
        final String passwordContent = taoPassWordRequest.getPasswordContent();
        RemoteBusiness.build((IMTOPDataObject) taoPassWordRequest, ShareBizAdapter.getInstance().getAppEnv().getTTID()).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.backflow.dialog.NewTaoPasswordDialog.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else {
                    AppMonitor.Alarm.commitFail("share", "userTipOff", "SHARE_USERTIPOFF_FAILED", Localization.q(R.string.taobao_app_1010_1_17853), passwordContent);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                TBToast.makeText(hjp.a(), Localization.q(R.string.taobao_app_1010_1_17866)).show();
                AppMonitor.Alarm.commitSuccess("share", "userTipOff", passwordContent);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                } else {
                    AppMonitor.Alarm.commitFail("share", "userTipOff", "SHARE_USERTIPOFF_FAILED", Localization.q(R.string.taobao_app_1010_1_17853), passwordContent);
                }
            }
        }).startRequest();
    }

    public final void P(ViewGroup viewGroup, ihs ihsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e406c3b8", new Object[]{this, viewGroup, ihsVar});
            return;
        }
        u(viewGroup);
        if (this.v) {
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.tpd_item_img);
            if (!TextUtils.isEmpty(ihsVar.w)) {
                tUrlImageView.succListener(new m(this, viewGroup));
                tUrlImageView.setImageUrl(ihsVar.w);
            }
        } else {
            viewGroup.findViewById(R.id.tpd_item_top_area).setVisibility(8);
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_item_action);
        textView.setOnClickListener(this.b);
        if (ihsVar.j != null) {
            Map<String, Object> map = ihsVar.k;
            if (map != null && !TextUtils.isEmpty(String.valueOf(map.get("tipimage")))) {
                TUrlImageView tUrlImageView2 = (TUrlImageView) viewGroup.findViewById(R.id.tpd_item_tag_image);
                tUrlImageView2.setVisibility(0);
                tUrlImageView2.setImageUrl(String.valueOf(map.get("tipimage")));
            }
            if (map != null && !TextUtils.isEmpty(String.valueOf(map.get("buttonText")))) {
                textView.setText(String.valueOf(map.get("buttonText")));
            }
        }
        TPriceTextView tPriceTextView = (TPriceTextView) viewGroup.findViewById(R.id.tpd_item_price);
        try {
            float floatValue = Float.valueOf(ihsVar.z).floatValue();
            tPriceTextView.setVisibility(0);
            tPriceTextView.setPrice(floatValue);
        } catch (Exception unused) {
            if (!TextUtils.isEmpty(ihsVar.z)) {
                tPriceTextView.setVisibility(0);
                tPriceTextView.setText("¥ " + ihsVar.z);
            } else {
                tPriceTextView.setVisibility(4);
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.tpd_item_content);
        textView2.setText(ihsVar.v);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView2.getLayoutParams();
        marginLayoutParams.leftMargin = marginLayoutParams.rightMargin;
        textView2.setLayoutParams(marginLayoutParams);
        D(viewGroup, ihsVar);
        J(textView, textView2, tPriceTextView);
    }

    public final void W(ViewGroup viewGroup, pis pisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92cf0dc", new Object[]{this, viewGroup, pisVar});
            return;
        }
        u(viewGroup);
        String str = pisVar.j.get(MspGlobalDefine.EXTENDINFO);
        WeexBizView weexBizView = (WeexBizView) viewGroup.findViewById(R.id.tpd_weex_view);
        viewGroup.setVisibility(0);
        weexBizView.init(new j(viewGroup, pisVar, weexBizView));
        try {
            Map<String, String> map = (Map) JSON.parseObject(str, Map.class);
            map.put("taopassword_ownerName", pisVar.x);
            map.put("taopassword_ownerId", pisVar.y);
            map.put("taopassword_url", pisVar.c);
            weexBizView.render(pisVar.z, map);
        } catch (Exception unused) {
        }
        D(viewGroup, pisVar);
    }

    public final ViewGroup Y(bis bisVar) {
        ViewGroup viewGroup;
        tgs tgsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("a0e14c21", new Object[]{this, bisVar});
        }
        String str = bisVar.b;
        if (!(bisVar instanceof tgs)) {
            return null;
        }
        t(bisVar);
        if (TextUtils.equals((String) s(bisVar.j, "weakShow", ""), "1")) {
            viewGroup = v(this.m, this.t, R.id.tpd_view_anti_hijack);
            this.m = viewGroup;
            K(viewGroup, (tgs) bisVar);
        } else if (TemplateId.ITEM.equals(str)) {
            viewGroup = v(this.j, this.p, R.id.tpd_view_item);
            this.j = viewGroup;
            P(viewGroup, (ihs) bisVar);
        } else if (TemplateId.SHOP.equals(str)) {
            viewGroup = v(this.i, this.o, R.id.tpd_view_shop);
            this.i = viewGroup;
            V(viewGroup, (iis) bisVar);
        } else if (!TemplateId.WEEX.equals(str) || !this.v) {
            if (TextUtils.isEmpty(str)) {
                tgsVar = y(bisVar);
            } else {
                tgsVar = (tgs) bisVar;
            }
            viewGroup = v(this.k, this.q, R.id.tpd_view_common);
            this.k = viewGroup;
            L(viewGroup, tgsVar);
        } else {
            pis pisVar = (pis) bisVar;
            if (this.l == null) {
                this.l = (ViewGroup) this.r.inflate().findViewById(R.id.tpd_view_weex);
                if (!TextUtils.isEmpty(pisVar.z)) {
                    if (pisVar.z.contains("bigMode")) {
                        this.l.getLayoutParams().height = lr7.b(this.c, 494.0f);
                    } else {
                        this.l.getLayoutParams().height = lr7.b(this.c, 332.0f);
                    }
                }
                A(this.l.getLayoutParams());
            }
            this.l.setVisibility(0);
            viewGroup = this.l;
            W(viewGroup, pisVar);
        }
        String str2 = str + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + bisVar.d + "," + bisVar.f16414a;
        if (bisVar instanceof pis) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(",");
            pis pisVar2 = (pis) bisVar;
            sb.append(pisVar2.t);
            sb.append(",");
            sb.append(pisVar2.z);
            str2 = sb.toString();
        }
        TBS.Ext.commitEvent("Page_Share", 19999, "PasswordViewShow", bisVar.f16414a, bisVar.b, str2 + "," + bwr.h().m());
        return viewGroup;
    }

    public final void D(ViewGroup viewGroup, tgs tgsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91163a2c", new Object[]{this, viewGroup, tgsVar});
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.tpd_common_area_ownerInfo);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_report);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.arrow);
        if (textView != null && tgsVar != null) {
            String e2 = lkp.a.e();
            if (TextUtils.isEmpty(e2)) {
                e2 = Localization.q(R.string.taobao_app_1010_1_17860);
            }
            linearLayout.setOnClickListener(new o(tgsVar));
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            textView.setText(e2);
            String d2 = lkp.a.d();
            if (TextUtils.isEmpty(d2)) {
                d2 = "https://gw.alicdn.com/tfs/TB1KjBDxHGYBuNjy0FoXXciBFXa-41-41.png";
            }
            ((TUrlImageView) viewGroup.findViewById(R.id.iv_report)).setImageUrl(d2);
            TUrlImageView tUrlImageView = (TUrlImageView) viewGroup.findViewById(R.id.iv_header);
            if (tgsVar.j.get("ownerFace") != null && tUrlImageView != null) {
                tUrlImageView.setImageUrl(tgsVar.j.get("ownerFace"));
                tUrlImageView.setVisibility(0);
            } else if (tUrlImageView != null) {
                tUrlImageView.setVisibility(4);
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.tv_desc_title);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ll_image);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.iv_share_tip);
            String str = tgsVar.x;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                if (str.length() > 7) {
                    sb.append(str.charAt(0));
                    sb.append("**");
                    sb.append(str.charAt(str.length() - 1));
                } else {
                    sb.append(str);
                }
                if (textView2 != null && textView3 != null) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(sb);
                    int h2 = lkp.a.h();
                    if (h2 != -1) {
                        textView2.setTextColor(h2);
                    }
                    if (viewGroup2 != null && TextUtils.equals(tgsVar.f, "true") && !TextUtils.isEmpty(tgsVar.g)) {
                        TUrlImageView tUrlImageView2 = (TUrlImageView) viewGroup2.findViewWithTag("friendFlagIv");
                        if (tUrlImageView2 == null) {
                            tUrlImageView2 = new TUrlImageView(this.c);
                        } else {
                            viewGroup2.removeView(tUrlImageView2);
                        }
                        int a2 = lr7.a(39.0f);
                        int a3 = lr7.a(17.0f);
                        int b2 = lr7.b(this.c, 2.0f);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, a3);
                        layoutParams.gravity = 16;
                        layoutParams.rightMargin = b2;
                        layoutParams.leftMargin = b2;
                        tUrlImageView2.setLayoutParams(layoutParams);
                        tUrlImageView2.setTag("friendFlagIv");
                        tUrlImageView2.setImageUrl(tgsVar.g);
                        viewGroup2.addView(tUrlImageView2, viewGroup2.indexOfChild(textView2) + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        }
    }

    public final void w(Context context, boolean z2, String str) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347079ed", new Object[]{this, context, new Boolean(z2), str});
            return;
        }
        String m2 = kip.m();
        TBS.Ext.commitEvent("Page_Share", 19999, "Page_BackFlow", "WeexBackFlow", str, "weexUrl=" + m2);
        this.x = new WeexBizView(context);
        kkp.e().a(kkp.KEY_SHAREBACKINITWEEX);
        this.x.initBackFlow(new a(m2, str), str);
        setContentView(this.x);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        if (context instanceof Application) {
            getWindow().setType(2003);
        }
        setCanceledOnTouchOutside(false);
        setOnKeyListener(new h());
        if (context.getResources().getConfiguration().orientation != 1) {
            z3 = false;
        }
        this.v = z3;
        WindowManager windowManager = getWindow().getWindowManager();
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        if (height <= width) {
            width = height;
        }
        this.w = width;
        this.u = (int) (width * 0.7733333333333333d);
    }
}
