package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPAction;
import com.taobao.taobao.R;
import com.ut.share.ShareServiceApi;
import com.ut.share.business.ShareTargetType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dwr implements xhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Toast f18116a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gis {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eis f18117a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(eis eisVar, Context context, String str) {
            this.f18117a = eisVar;
            this.b = context;
            this.c = str;
        }

        @Override // tb.gis
        public void a(fis fisVar, vhs vhsVar) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("663f302b", new Object[]{this, fisVar, vhsVar});
                return;
            }
            if (vhsVar != null) {
                try {
                    str = vhsVar.f30021a;
                } catch (Throwable unused) {
                    return;
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                String str3 = this.f18117a.b;
                if (TextUtils.isEmpty(str3)) {
                    str2 = this.f18117a.c;
                } else {
                    str2 = str3.concat(" ").concat(this.f18117a.c);
                }
                str = akp.c(str2);
                ehs.l(this.b, this.f18117a.c);
            }
            ((ClipboardManager) this.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(blo.TAO_FLAG, str));
            if (ShareTargetType.Share2Messenger.getValue().equals(this.c)) {
                dwr.b(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2Telegram.getValue().equals(this.c)) {
                dwr.c(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2WeChat.getValue().equals(this.c)) {
                dwr.d(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2WhatsApp.getValue().equals(this.c)) {
                dwr.e(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2Instagram.getValue().equals(this.c)) {
                dwr.f(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2Facebook.getValue().equals(this.c)) {
                dwr.g(dwr.this, this.b, str);
            } else if (ShareTargetType.Share2Line.getValue().equals(this.c)) {
                dwr.h(dwr.this, this.b, str);
            }
        }
    }

    static {
        t2o.a(666894422);
        t2o.a(666894439);
    }

    public static /* synthetic */ void b(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ed59f6", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.l(context, str);
        }
    }

    public static /* synthetic */ void c(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f8a577", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.m(context, str);
        }
    }

    public static /* synthetic */ void d(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9303f0f8", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.n(context, str);
        }
    }

    public static /* synthetic */ void e(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0f3c79", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.o(context, str);
        }
    }

    public static /* synthetic */ void f(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451a87fa", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.j(context, str);
        }
    }

    public static /* synthetic */ void g(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e25d37b", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.i(context, str);
        }
    }

    public static /* synthetic */ void h(dwr dwrVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7311efc", new Object[]{dwrVar, context, str});
        } else {
            dwrVar.k(context, str);
        }
    }

    public final void i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc0b0fc", new Object[]{this, context, str});
        } else if (p(context, "com.facebook.katana")) {
            r(context, "com.facebook.katana", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f77b8d4", new Object[]{this, context, str});
        } else if (p(context, "com.instagram.android")) {
            r(context, "com.instagram.android", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1ad02a", new Object[]{this, context, str});
        } else if (p(context, "jp.naver.line.android")) {
            try {
                String encode = Uri.encode(str);
                Nav from = Nav.from(context);
                Intent intentForUri = from.intentForUri("line://msg/text/" + encode);
                intentForUri.addFlags(268435456);
                context.startActivity(intentForUri);
            } catch (Throwable unused) {
            }
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ff2db5", new Object[]{this, context, str});
        } else if (p(context, "com.facebook.orca")) {
            r(context, "com.facebook.orca", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void m(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f823e7b7", new Object[]{this, context, str});
        } else if (p(context, "org.telegram.messenger")) {
            r(context, "org.telegram.messenger", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2557fc", new Object[]{this, context, str});
        } else if (p(context, "com.tencent.mm")) {
            r(context, "com.tencent.mm", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final void o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68149a8", new Object[]{this, context, str});
        } else if (p(context, "com.whatsapp")) {
            r(context, "com.whatsapp", str);
        } else {
            q(context, Localization.q(R.string.share_ailed_to_redirect));
        }
    }

    public final boolean p(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ab90e7d", new Object[]{this, context, str})).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void q(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{this, context, charSequence});
        } else if (!TextUtils.isEmpty(charSequence)) {
            Toast toast = f18116a;
            if (toast == null) {
                f18116a = Toast.makeText(context.getApplicationContext(), charSequence, 0);
            } else {
                toast.setText(charSequence);
            }
            f18116a.show();
        }
    }

    public final void r(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9bd9e", new Object[]{this, context, str, str2});
        } else if (str2 != null) {
            try {
                context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.xhp
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de08c55", new Object[]{this, str, map});
            return;
        }
        try {
            TBShareContent e = bwr.h().e();
            Context applicationContext = hjp.a().getApplicationContext();
            String str2 = e.description;
            if (bwr.h().n() != null && !TextUtils.isEmpty(null)) {
                str2 = "null " + str2;
            }
            eis eisVar = new eis();
            String str3 = e.businessId;
            eisVar.f18604a = str3;
            eisVar.b = str2;
            eisVar.c = ShareServiceApi.urlBackFlow(str3, "other", e.url);
            eisVar.d = e.imageUrl;
            eisVar.e = e.shareScene;
            eisVar.h = e.extraParams;
            if (!TextUtils.isEmpty("other")) {
                eisVar.k = "other".toLowerCase();
            } else {
                eisVar.k = "other";
            }
            eisVar.i = e.popType.name;
            eisVar.j = e.popUrl;
            if (e.disableBackToClient) {
                eisVar.l = 0;
            }
            ehs.j().i(hjp.a().getApplicationContext(), eisVar, TPAction.OTHER, new a(eisVar, applicationContext, str), ShareBizAdapter.getInstance().getAppEnv().getTTID());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
