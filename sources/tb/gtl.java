package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.clipboard.TextTokenChecker;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.picturepassword.ShareCopyAlbumChecker;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordCheckRequest;
import com.taobao.taobao.R;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gtl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBShare#PasswordCheckBusiness";

    /* renamed from: a  reason: collision with root package name */
    public PasswordCheckRequest f20217a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements g8t {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y9 f20218a;
        public final /* synthetic */ x9 b;
        public final /* synthetic */ Context c;

        public a(y9 y9Var, x9 x9Var, Context context) {
            this.f20218a = y9Var;
            this.b = x9Var;
            this.c = context;
        }

        public void g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e73681c6", new Object[]{this, new Boolean(z)});
                return;
            }
            if (!z && gtl.a(gtl.this, this.f20218a.f31916a)) {
                this.f20218a.b = kis.MIAO;
                z = true;
            }
            if (!z) {
                fwr.c(gtl.TAG, "return: isPassword false");
                ((ClipUrlWatcherControl.a) this.b).c();
                return;
            }
            try {
                gtl.this.g(this.c, this.f20218a, this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements TextTokenChecker.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y9 f20219a;
        public final /* synthetic */ x9 b;
        public final /* synthetic */ Context c;

        public b(y9 y9Var, x9 x9Var, Context context) {
            this.f20219a = y9Var;
            this.b = x9Var;
            this.c = context;
        }

        public void a(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8ce85bf", new Object[]{this, bool});
                return;
            }
            if (!bool.booleanValue() && gtl.a(gtl.this, this.f20219a.f31916a)) {
                this.f20219a.b = kis.MIAO;
                bool = Boolean.TRUE;
            }
            if (!bool.booleanValue()) {
                fwr.c(gtl.TAG, "return: isPassword false");
                ((ClipUrlWatcherControl.a) this.b).c();
                return;
            }
            try {
                gtl.this.g(this.c, this.f20219a, this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements ShareCopyAlbumChecker.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20220a;
        public final /* synthetic */ y9 b;
        public final /* synthetic */ x9 c;

        public c(Context context, y9 y9Var, x9 x9Var) {
            this.f20220a = context;
            this.b = y9Var;
            this.c = x9Var;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8bb1183", new Object[]{this});
            } else {
                AppMonitor.Alarm.commitFail("share", "querypassword", "", Localization.q(R.string.taobao_app_1010_1_18128));
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            fwr.a(gtl.TAG, Localization.q(R.string.taobao_app_1010_1_18114));
            if (TextUtils.equals(kwr.b(this.f20220a, kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY), str)) {
                fwr.c(gtl.TAG, Localization.q(R.string.taobao_app_1010_1_18138));
                return;
            }
            if (str != null) {
                y9 y9Var = this.b;
                y9Var.f31916a = str;
                y9Var.b = "pic";
            }
            if (!blo.d(blo.KEY_CHECK_PWD_URL_VALIDATE, false) || i6n.a(str)) {
                try {
                    gtl.this.g(this.f20220a, this.b, this.c);
                } catch (Exception e) {
                    e.printStackTrace();
                    fwr.b(gtl.TAG, "getTaoPassword" + e.getMessage());
                    AppMonitor.Alarm.commitFail("share", "querypassword", "", e.getLocalizedMessage());
                }
            } else {
                AppMonitor.Alarm.commitFail("share", "querypassword", "", Localization.q(R.string.taobao_app_1010_1_18107));
                fwr.c(gtl.TAG, Localization.q(R.string.taobao_app_1010_1_18127));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements htl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x9 f20221a;
        public final /* synthetic */ String b;

        public d(x9 x9Var, String str) {
            this.f20221a = x9Var;
            this.b = str;
        }

        @Override // tb.htl
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e706128", new Object[]{this, str, str2});
                return;
            }
            ((ClipUrlWatcherControl.a) this.f20221a).a(str, str2);
            fwr.d("mtop.taobao.sharepassword.querypassword failed :" + str2);
            AppMonitor.Alarm.commitFail("share", "querypassword", str, str2, this.b);
        }

        @Override // tb.htl
        public void b(w9 w9Var, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3e2ecd0", new Object[]{this, w9Var, obj});
                return;
            }
            kkp.e().a(kkp.KEY_SHAREBACKGETPASSWORDMTOPEND);
            gtl.b(gtl.this, null);
            ((ClipUrlWatcherControl.a) this.f20221a).b(w9Var, obj);
            AppMonitor.Alarm.commitSuccess("share", "querypassword", this.b);
            fwr.d("mtop.taobao.sharepassword.querypassword success");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final gtl f20222a = new gtl(null);

        static {
            t2o.a(665845856);
        }

        public static /* synthetic */ gtl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gtl) ipChange.ipc$dispatch("2102584b", new Object[0]);
            }
            return f20222a;
        }
    }

    static {
        t2o.a(665845851);
    }

    public /* synthetic */ gtl(a aVar) {
        this();
    }

    public static /* synthetic */ boolean a(gtl gtlVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ab67759", new Object[]{gtlVar, str})).booleanValue();
        }
        return gtlVar.i(str);
    }

    public static /* synthetic */ PasswordCheckRequest b(gtl gtlVar, PasswordCheckRequest passwordCheckRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PasswordCheckRequest) ipChange.ipc$dispatch("d6df4a18", new Object[]{gtlVar, passwordCheckRequest});
        }
        gtlVar.f20217a = passwordCheckRequest;
        return passwordCheckRequest;
    }

    public static gtl f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gtl) ipChange.ipc$dispatch("ff155766", new Object[0]);
        }
        return e.a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        PasswordCheckRequest passwordCheckRequest = this.f20217a;
        if (passwordCheckRequest != null) {
            passwordCheckRequest.cancel();
        }
    }

    public void d(Context context, y9 y9Var, x9 x9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd28362d", new Object[]{this, context, y9Var, x9Var});
        } else if (x9Var != null && y9Var != null) {
            if (y9Var.f31916a != null) {
                if (blo.q()) {
                    try {
                        zhs.d().a(context, y9Var, new a(y9Var, x9Var, context));
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        fwr.b(TAG, "isWxAgainstModeCheckErr: " + e2.getMessage());
                    }
                }
                new TextTokenChecker().h(y9Var.f31916a, new b(y9Var, x9Var, context));
                return;
            }
            ShareCopyAlbumChecker.h(context, new c(context, y9Var, x9Var));
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadae57", new Object[]{this});
        } else {
            ShareBizAdapter.getInstance().getShareWeexSdk().e();
        }
    }

    public void g(Context context, y9 y9Var, x9 x9Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03d9e69", new Object[]{this, context, y9Var, x9Var});
        } else if (!TextUtils.isEmpty(y9Var.f31916a)) {
            c();
            h(context, y9Var, x9Var);
            e();
        }
    }

    public final void h(Context context, y9 y9Var, x9 x9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21416525", new Object[]{this, context, y9Var, x9Var});
            return;
        }
        if (y9Var != null) {
            str = y9Var.f31916a + "," + y9Var.b;
        } else {
            str = "";
        }
        d dVar = new d(x9Var, str);
        if (x9Var != null && !TextUtils.isEmpty(y9Var.f31916a)) {
            this.f20217a = new PasswordCheckRequest();
            kkp e2 = kkp.e();
            e2.a(kkp.KEY_SHAREBACKPARSERMATCHSTART);
            if (msl.c().e()) {
                List<String> a2 = msl.c().a(y9Var.f31916a);
                boolean f = msl.c().f();
                e2.a(kkp.KEY_SHAREBACKPARSERMATCHEND);
                e2.a(kkp.KEY_SHAREBACKGETPASSWORDMTOPSTART);
                if (a2 != null && a2.size() > 0) {
                    this.f20217a.request(context, new PasswordCheckRequest.a(JSON.toJSONString(a2), y9Var.b, a2, f, y9Var.c), dVar);
                    return;
                }
                return;
            }
            this.f20217a.request(context, new PasswordCheckRequest.a(y9Var.f31916a, y9Var.b, y9Var.c), dVar);
        }
    }

    public gtl() {
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c46324b9", new Object[]{this, str})).booleanValue();
        }
        try {
            return Pattern.compile(OrangeConfig.getInstance().getConfig("android_share", "taopassword_js", "")).matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }
}
