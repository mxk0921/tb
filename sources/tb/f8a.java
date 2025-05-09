package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.model.TemplateId;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.share.taopassword.genpassword.model.TaoPasswordShareType;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class f8a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f19097a;
    public final String b;
    public TaoPasswordShareType c;
    public final TBShareContent d;
    public d e;
    public fis f;
    public u9 g;
    public dis h;
    public final ktl i = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ktl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.f8a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0921a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0921a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f8a.this.e();
                }
            }
        }

        public a() {
        }

        @Override // tb.ktl
        public void a(fis fisVar, u9 u9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("577a53dc", new Object[]{this, fisVar, u9Var});
            } else if (f8a.a(f8a.this) != null) {
                f8a.b(f8a.this, fisVar);
                f8a.c(f8a.this, u9Var);
                if (u9Var == null) {
                    f8a.a(f8a.this).a("", "NO RESULT");
                } else if (!TextUtils.isEmpty(u9Var.b) && f8a.a(f8a.this).b(f8a.d(f8a.this), fisVar, u9Var)) {
                    new Handler(Looper.myLooper()).postDelayed(new RunnableC0921a(), 300L);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements s9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.s9
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
            } else {
                f8a.a(f8a.this).a(str, str2);
            }
        }

        @Override // tb.s9
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            ((a) f8a.this.i).a(new fis(), (u9) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType;

        static {
            int[] iArr = new int[TaoPasswordShareType.values().length];
            $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType = iArr;
            try {
                iArr[TaoPasswordShareType.ShareTypeQQ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType[TaoPasswordShareType.ShareTypeWeixin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(String str, String str2);

        boolean b(TaoPasswordShareType taoPasswordShareType, fis fisVar, u9 u9Var);
    }

    static {
        t2o.a(665845899);
    }

    public f8a(Context context, String str, TBShareContent tBShareContent, Map<String, String> map) {
        this.f19097a = context;
        this.b = str;
        this.d = tBShareContent;
    }

    public static /* synthetic */ d a(f8a f8aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ba785414", new Object[]{f8aVar});
        }
        return f8aVar.e;
    }

    public static /* synthetic */ fis b(f8a f8aVar, fis fisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fis) ipChange.ipc$dispatch("c205cdc", new Object[]{f8aVar, fisVar});
        }
        f8aVar.f = fisVar;
        return fisVar;
    }

    public static /* synthetic */ u9 c(f8a f8aVar, u9 u9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u9) ipChange.ipc$dispatch("695831d5", new Object[]{f8aVar, u9Var});
        }
        f8aVar.g = u9Var;
        return u9Var;
    }

    public static /* synthetic */ TaoPasswordShareType d(f8a f8aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoPasswordShareType) ipChange.ipc$dispatch("7cca20f8", new Object[]{f8aVar});
        }
        return f8aVar.c;
    }

    public void h() {
        String str;
        TaoPasswordShareType taoPasswordShareType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.d == null) {
            d dVar = this.e;
            if (dVar != null) {
                dVar.a("", "context is null");
            }
        } else {
            if (ShareTargetType.Share2QQ.getValue().equals(this.b)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeQQ;
                str = "TaoPassword-QQ";
            } else if (ShareTargetType.Share2Weixin.getValue().equals(this.b)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeWeixin;
                str = "TaoPassword-WeiXin";
            } else if (ShareTargetType.Share2Copy.getValue().equals(this.b)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeCopy;
                str = "Copy";
            } else if (ShareTargetType.Share2SMS.getValue().equals(this.b)) {
                taoPasswordShareType = TaoPasswordShareType.ShareTypeSMS;
                str = "taopassword-sms";
            } else {
                taoPasswordShareType = null;
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.e.a("", "target is null");
            } else {
                g(this.d, taoPasswordShareType, str);
            }
        }
    }

    public final void i(eis eisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db11f3e", new Object[]{this, eisVar});
            return;
        }
        ALCreatePassWordModel aLCreatePassWordModel = new ALCreatePassWordModel();
        aLCreatePassWordModel.c = eisVar.f18604a;
        aLCreatePassWordModel.b = eisVar.b;
        aLCreatePassWordModel.f11766a = eisVar.c;
        String str = eisVar.e;
        if (str != null) {
            if (TextUtils.equals(str, "item")) {
                aLCreatePassWordModel.b("item");
            } else if (TextUtils.equals(eisVar.e, "shop")) {
                aLCreatePassWordModel.b("shop");
            } else {
                aLCreatePassWordModel.b("other");
            }
        }
        String str2 = eisVar.k;
        if (str2 != null) {
            if (TextUtils.equals(str2, "copy")) {
                aLCreatePassWordModel.b("copy");
            } else if (TextUtils.equals(eisVar.k, ALCreatePassWordModel.QQ)) {
                aLCreatePassWordModel.b(ALCreatePassWordModel.QQ);
            } else if (TextUtils.equals(eisVar.k, ALCreatePassWordModel.WeiXin)) {
                aLCreatePassWordModel.b(ALCreatePassWordModel.WeiXin);
            } else {
                aLCreatePassWordModel.b("other");
            }
        }
        aLCreatePassWordModel.i = eisVar.k;
        aLCreatePassWordModel.d = eisVar.d;
        aLCreatePassWordModel.e = eisVar.m;
        aLCreatePassWordModel.f = eisVar.h;
        aLCreatePassWordModel.g = eisVar.i;
        aLCreatePassWordModel.h = eisVar.j;
        v9.b().a(ShareBizAdapter.getInstance().getAppEnv().getApplication(), aLCreatePassWordModel, new b());
    }

    public final TPTargetType j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TPTargetType) ipChange.ipc$dispatch("a2f8aadd", new Object[]{this});
        }
        int i = c.$SwitchMap$com$taobao$share$taopassword$genpassword$model$TaoPasswordShareType[this.c.ordinal()];
        if (i == 1) {
            return TPTargetType.QQFRIEND;
        }
        if (i != 2) {
            return TPTargetType.OTHER;
        }
        return TPTargetType.WEIXIN;
    }

    public void k(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7229e0", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }

    public void l(dis disVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f333c568", new Object[]{this, disVar});
        } else {
            this.h = disVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e41cc9b", new Object[]{this});
        } else if (this.g != null) {
            if (("true".equals(OrangeConfig.getInstance().getConfig("android_share", "shareWeChatFriendFlag", "false")) || TextUtils.equals(this.g.g, "true")) && this.c == TaoPasswordShareType.ShareTypeWeixin) {
                this.f.a(this.f19097a, this.g.e, this.h);
                vjp.a(this.f19097a, this.g.e);
                this.h.a(true);
                return;
            }
            this.f.b(this.f19097a, j(), this.g.e, this.h);
        }
    }

    public final void f(Context context, TaoPasswordShareType taoPasswordShareType, eis eisVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550d9455", new Object[]{this, context, taoPasswordShareType, eisVar});
        } else if (context == null || eisVar == null) {
            this.e.a("", "context or content is null");
        } else if (TextUtils.isEmpty(eisVar.b) || TextUtils.isEmpty(eisVar.c)) {
            this.e.a("", Localization.q(R.string.taobao_app_1010_1_18116));
        } else {
            if (TextUtils.isEmpty(eisVar.e)) {
                eisVar.e = "other";
            }
            this.f19097a = context;
            this.c = taoPasswordShareType;
            if (taoPasswordShareType == null) {
                this.c = TaoPasswordShareType.ShareTypeOther;
            }
            his.b(true);
            i(eisVar);
        }
    }

    public final void g(TBShareContent tBShareContent, TaoPasswordShareType taoPasswordShareType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c2e7f9f", new Object[]{this, tBShareContent, taoPasswordShareType, str});
            return;
        }
        String str2 = tBShareContent.description;
        if (bwr.h().n() != null && !TextUtils.isEmpty(null)) {
            str2 = "null " + str2;
        }
        eis eisVar = new eis();
        String str3 = tBShareContent.businessId;
        eisVar.f18604a = str3;
        eisVar.b = str2;
        eisVar.c = ShareServiceApi.urlBackFlow(str3, str, tBShareContent.url);
        eisVar.d = tBShareContent.imageUrl;
        String str4 = tBShareContent.shareScene;
        eisVar.e = str4;
        eisVar.h = tBShareContent.extraParams;
        eisVar.m = str4;
        if ("shop".equals(tBShareContent.templateId)) {
            eisVar.m = TemplateId.SHOP.toString();
        } else if ("detail".equals(tBShareContent.templateId)) {
            eisVar.m = TemplateId.ITEM.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            eisVar.k = str.toLowerCase();
        } else {
            eisVar.k = "other";
        }
        eisVar.i = tBShareContent.popType.name;
        eisVar.j = tBShareContent.popUrl;
        if (tBShareContent.disableBackToClient) {
            eisVar.l = 0;
        }
        f(ShareBizAdapter.getInstance().getAppEnv().getApplication().getApplicationContext(), taoPasswordShareType, eisVar);
    }
}
