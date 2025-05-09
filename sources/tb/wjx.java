package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.ui.engine.render.b;
import com.taobao.tao.util.AnalyticsUtil;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import tb.nwo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wjx extends ksa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ukj b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements nwo.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f30736a;
        public final /* synthetic */ ma4 b;

        public a(Context context, ma4 ma4Var) {
            this.f30736a = context;
            this.b = ma4Var;
        }

        @Override // tb.nwo.e
        public void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a211a4c6", new Object[]{this, context});
                return;
            }
            gj8.e();
            wjx.e(wjx.this, context);
        }

        @Override // tb.nwo.e
        public void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("680a80b1", new Object[]{this, context});
                return;
            }
            gj8.f();
            wjx.e(wjx.this, context);
        }

        @Override // tb.nwo.e
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e65661d7", new Object[]{this, str});
                return;
            }
            gj8.g();
            wjx.d(wjx.this, this.f30736a, this.b);
        }
    }

    static {
        t2o.a(666894449);
    }

    public wjx(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ void d(wjx wjxVar, Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390f3a87", new Object[]{wjxVar, context, ma4Var});
        } else {
            wjxVar.g(context, ma4Var);
        }
    }

    public static /* synthetic */ void e(wjx wjxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47abd6a", new Object[]{wjxVar, context});
        } else {
            wjxVar.f(context);
        }
    }

    public static /* synthetic */ Object ipc$super(wjx wjxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/interceptor/WxqqHandlerInterceptor");
    }

    @Override // tb.ksa
    public void b(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0736b2", new Object[]{this, context, ma4Var, new Integer(i), bVar});
            return;
        }
        com.taobao.share.ui.engine.render.a aVar = bVar.b;
        if (aVar instanceof ukj) {
            this.b = (ukj) aVar;
        }
        TBShareContent e = bwr.h().e();
        if (ma4Var == null) {
            return;
        }
        if (!TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), ma4Var.b()) && !TextUtils.equals(ShareTargetType.Share2QQ.getValue(), ma4Var.b())) {
            return;
        }
        if (tn1.m(e.businessId)) {
            this.f22885a.h(ma4Var.b(), true, new a(context, ma4Var));
        } else {
            g(context, ma4Var);
        }
    }

    @Override // tb.ksa
    public boolean c(Context context, ma4 ma4Var, int i, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d18e050", new Object[]{this, context, ma4Var, new Integer(i), bVar})).booleanValue();
        }
        if (ma4Var == null || (!TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), ma4Var.b()) && !TextUtils.equals(ShareTargetType.Share2QQ.getValue(), ma4Var.b()))) {
            return false;
        }
        return true;
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9c03f8", new Object[]{this, context});
        } else if (context != null) {
            Toast makeText = Toast.makeText(context, Localization.q(R.string.taobao_app_1010_1_17885), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        }
    }

    public final void g(Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403332f6", new Object[]{this, context, ma4Var});
            return;
        }
        AnalyticsUtil.wxAndQQOnClick(ma4Var);
        ukj ukjVar = this.b;
        if (ukjVar != null) {
            ukjVar.h().t();
        } else {
            gj8.k(0);
        }
        if (this.b != null) {
            if (!TextUtils.equals("common", bwr.h().e().templateId)) {
                this.f22885a.i(context, ma4Var);
            } else {
                this.f22885a.c(context, ma4Var);
            }
            this.b.h().q();
            return;
        }
        this.f22885a.c(context, ma4Var);
    }
}
