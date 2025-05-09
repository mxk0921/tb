package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import java.text.SimpleDateFormat;
import java.util.Date;
import tb.f8a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wx4 extends yhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final com.taobao.share.ui.engine.render.b b;
    public final ukj c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements dis {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f30982a;

        public b(ma4 ma4Var) {
            this.f30982a = ma4Var;
        }

        @Override // tb.dis
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d11a", new Object[]{this, new Boolean(z)});
                return;
            }
            akp.h(this.f30982a.b());
            if (wx4.f(wx4.this) != null && ogs.f25380a) {
                gj8.a(this.f30982a.b(), "code");
            }
            if (wx4.e(wx4.this) != null) {
                wx4.e(wx4.this).h().u();
            } else {
                if (wx4.g(wx4.this).b.g) {
                    Toast.makeText(gjp.a(), Localization.q(R.string.share_str_wx_copy_tips), 0).show();
                }
                gj8.k(2);
            }
            if (wx4.f(wx4.this) != null && !ogs.f25380a) {
                wx4.f(wx4.this).c();
            }
        }

        @Override // tb.dis
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76bf38a5", new Object[]{this, str});
            } else if (TextUtils.isEmpty(str)) {
                TLog.loge("CreatePassWorker", "onDidCopyed: isEmpty" + str);
            } else {
                akp.a();
                ShareBizAdapter.getInstance().getAppEnv().j(str);
            }
        }

        @Override // tb.dis
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            Toast.makeText(gjp.a(), Localization.q(R.string.taobao_app_1010_1_23580), 1).show();
            if (wx4.f(wx4.this) != null) {
                wx4.f(wx4.this).c();
            }
        }
    }

    static {
        t2o.a(666894455);
    }

    public wx4(whp whpVar) {
        super(whpVar);
        com.taobao.share.ui.engine.render.b bVar = whpVar.b;
        this.b = bVar;
        com.taobao.share.ui.engine.render.a aVar = bVar.b;
        if (aVar instanceof ukj) {
            this.c = (ukj) aVar;
        }
    }

    public static /* synthetic */ void d(wx4 wx4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d48079", new Object[]{wx4Var, str});
        } else {
            wx4Var.h(str);
        }
    }

    public static /* synthetic */ ukj e(wx4 wx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukj) ipChange.ipc$dispatch("73ce8dc0", new Object[]{wx4Var});
        }
        return wx4Var.c;
    }

    public static /* synthetic */ com.taobao.share.ui.engine.render.b f(wx4 wx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.share.ui.engine.render.b) ipChange.ipc$dispatch("91dcd7ab", new Object[]{wx4Var});
        }
        return wx4Var.b;
    }

    public static /* synthetic */ whp g(wx4 wx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (whp) ipChange.ipc$dispatch("6b4bf71c", new Object[]{wx4Var});
        }
        return wx4Var.f32102a;
    }

    public static /* synthetic */ Object ipc$super(wx4 wx4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CreatePassWorker");
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347d69b7", new Object[]{this, str});
            return;
        }
        Toast.makeText(gjp.a(), str, 0).show();
        com.taobao.share.ui.engine.render.b bVar = this.b;
        if (bVar != null) {
            bVar.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements f8a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ma4 f30981a;
        public final /* synthetic */ f8a b;
        public final /* synthetic */ Context c;

        public a(ma4 ma4Var, f8a f8aVar, Context context) {
            this.f30981a = ma4Var;
            this.b = f8aVar;
            this.c = context;
        }

        @Override // tb.f8a.d
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            } else if (TextUtils.equals(str, "ANTISPAM_BLACK_USER")) {
                wx4.d(wx4.this, Localization.q(R.string.taobao_app_1010_1_23576));
            } else {
                wx4.d(wx4.this, Localization.q(R.string.taobao_app_1010_1_23575));
            }
        }

        @Override // tb.f8a.d
        public boolean b(TaoPasswordShareType taoPasswordShareType, fis fisVar, u9 u9Var) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c9f8ef73", new Object[]{this, taoPasswordShareType, fisVar, u9Var})).booleanValue();
            }
            if (u9Var == null) {
                return false;
            }
            if (!TextUtils.isEmpty(u9Var.c)) {
                Date date = new Date(Long.parseLong(u9Var.c));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Localization.q(R.string.taobao_app_1010_1_17874));
                String str2 = Localization.q(R.string.taobao_app_1010_1_17831) + simpleDateFormat.format(date) + Localization.q(R.string.taobao_app_1010_1_17857);
                bwr.h().e().validateTime = str2;
                gj8.m(str2, u9Var.c);
            }
            if (mip.e()) {
                ma4 ma4Var = this.f30981a;
                if (TextUtils.isEmpty(u9Var.d)) {
                    str = this.f30981a.a().a().url;
                } else {
                    str = u9Var.d;
                }
                AnalyticsUtil.traceWXAndQQShare(ma4Var, str, true, u9Var.b);
            }
            if (wx4.e(wx4.this) == null) {
                gj8.k(1);
                this.b.e();
                return false;
            }
            if (TextUtils.equals("common", bwr.h().e().templateId)) {
                wx4.e(wx4.this).h().p();
            } else {
                wx4.e(wx4.this).h().u();
            }
            if (SpUtils.getGuide(this.c, SpUtils.SHARE_GUIDE)) {
                return true;
            }
            if (!TextUtils.equals("common", bwr.h().e().templateId)) {
                wx4.e(wx4.this).q(this.b);
                return false;
            }
            if (wx4.e(wx4.this) == null) {
                this.b.e();
            }
            return true;
        }
    }

    public void i(Context context, ma4 ma4Var) {
        TPTargetType tPTargetType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c28b21", new Object[]{this, context, ma4Var});
        } else if (ma4Var != null) {
            f8a f8aVar = new f8a(context, ma4Var.b(), ma4Var.a().a(), null);
            f8aVar.k(new a(ma4Var, f8aVar, context));
            f8aVar.l(new b(ma4Var));
            if (tn1.m(bwr.h().e().businessId)) {
                if (mip.e()) {
                    AnalyticsUtil.traceWXAndQQShare(ma4Var, ma4Var.a().a().url, true, "");
                }
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share", "ScreenShotAutoOpenApp", "true"))) {
                    Toast.makeText(gjp.a(), Localization.q(R.string.share_str_wx_copy_tips), 0).show();
                    this.b.c();
                    if (TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), ma4Var.b())) {
                        tPTargetType = TPTargetType.WEIXIN;
                    } else {
                        tPTargetType = TPTargetType.QQFRIEND;
                    }
                    kwr.e(context, kwr.c(tPTargetType));
                    return;
                }
                return;
            }
            f8aVar.h();
        }
    }
}
