package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.mtop.request.PasswordGenerateRequestI;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.regex.Matcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class btl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f16616a = "PassWordGenBusiness";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ctl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16617a;
        public final /* synthetic */ s9 b;
        public final /* synthetic */ String c;

        public a(btl btlVar, Context context, s9 s9Var, String str) {
            this.f16617a = context;
            this.b = s9Var;
            this.c = str;
        }

        @Override // tb.ctl
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e706128", new Object[]{this, str, str2});
                return;
            }
            this.b.onFail(str, str2);
            AppMonitor.Alarm.commitFail("share", "genpassword", str, str2, this.c);
            String a2 = btl.a();
            fwr.b(a2, "createPassWord err: " + str + " ->" + str2);
            String q = Localization.q(R.string.taobao_app_1010_1_18136);
            TBS.Ext.commitEvent("Share_Exception", 19999, "taopassword", "err", q, Localization.q(R.string.taobao_app_1010_1_18141) + str + Localization.q(R.string.taobao_app_1010_1_18137) + str2);
        }

        @Override // tb.ctl
        public void c(u9 u9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5621cabe", new Object[]{this, u9Var});
                return;
            }
            if (his.a()) {
                if (!TextUtils.isEmpty(u9Var.f)) {
                    btl.e(this.f16617a, u9Var.f);
                } else if (!TextUtils.isEmpty(u9Var.b)) {
                    btl.e(this.f16617a, u9Var.b);
                }
            }
            this.b.onSuccess(u9Var);
            AppMonitor.Alarm.commitSuccess("share", "genpassword", this.c);
            String a2 = btl.a();
            fwr.b(a2, "createPassWord suc: " + u9Var.toString());
            TBS.Ext.commitEvent("Share_Exception", 19999, "taopassword", "info", Localization.q(R.string.taobao_app_1010_1_18122), JSON.toJSONString(u9Var));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final btl f16618a = new btl(null);

        static {
            t2o.a(665845850);
        }

        public static /* synthetic */ btl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (btl) ipChange.ipc$dispatch("e1fea123", new Object[0]);
            }
            return f16618a;
        }
    }

    static {
        t2o.a(665845848);
    }

    public /* synthetic */ btl(a aVar) {
        this();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f16616a;
    }

    public static btl d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btl) ipChange.ipc$dispatch("636caafe", new Object[0]);
        }
        return b.a();
    }

    public final void b(Context context, ALCreatePassWordModel aLCreatePassWordModel, s9 s9Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9628a21b", new Object[]{this, context, aLCreatePassWordModel, s9Var});
            return;
        }
        PasswordGenerateRequestI passwordGenerateRequestI = new PasswordGenerateRequestI();
        if (aLCreatePassWordModel != null) {
            str = aLCreatePassWordModel.c + "," + aLCreatePassWordModel.a();
        } else {
            str = "";
        }
        passwordGenerateRequestI.request(context, aLCreatePassWordModel, new a(this, context, s9Var, str));
    }

    public void c(Context context, ALCreatePassWordModel aLCreatePassWordModel, s9 s9Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d594004", new Object[]{this, context, aLCreatePassWordModel, s9Var});
        } else if (s9Var == null) {
            throw new Exception("listener can not be null!");
        } else if (context == null || aLCreatePassWordModel == null) {
            new u9().f29237a = aLCreatePassWordModel;
            s9Var.onFail("0", "context or content is null ");
        } else {
            b(context, aLCreatePassWordModel, s9Var);
        }
    }

    public btl() {
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8faa0b", new Object[]{context, str});
            return;
        }
        new StringBuilder("saveTaoPassword text=").append(str);
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = Patterns.WEB_URL.matcher(str);
            if (matcher.find()) {
                String group = matcher.group();
                int indexOf = str.indexOf("?");
                String substring = indexOf <= 0 ? group : group.substring(0, indexOf);
                StringBuilder sb = new StringBuilder("saveTaoPassword url=");
                sb.append(group);
                sb.append("  shortUrl=");
                sb.append(substring);
                kwr.f(context, substring);
                return;
            }
            kwr.f(context, str);
        }
    }
}
