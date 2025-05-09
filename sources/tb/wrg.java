package tb;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.LinkRule;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wrg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wrg.f
        public boolean a(Application application, b8l b8lVar, sgg sggVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b580de", new Object[]{this, application, b8lVar, sggVar, str})).booleanValue();
            }
            return wrg.a(application, sggVar, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wrg.f
        public boolean a(Application application, b8l b8lVar, sgg sggVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b580de", new Object[]{this, application, b8lVar, sggVar, str})).booleanValue();
            }
            return wrg.b(application, sggVar, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wrg.f
        public boolean a(Application application, b8l b8lVar, sgg sggVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b580de", new Object[]{this, application, b8lVar, sggVar, str})).booleanValue();
            }
            return wrg.c(application, sggVar, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wrg.f
        public boolean a(Application application, b8l b8lVar, sgg sggVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b580de", new Object[]{this, application, b8lVar, sggVar, str})).booleanValue();
            }
            return wrg.d(application, sggVar, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f30872a = Pattern.compile("(.*)/wow/a/act/(tmall|tao|ju)/tmc/(.*)wh_pid(.*)");

        public static /* synthetic */ Pattern a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pattern) ipChange.ipc$dispatch("d6fe7a40", new Object[0]);
            }
            return f30872a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        boolean a(Application application, b8l b8lVar, sgg sggVar, String str);
    }

    public static /* synthetic */ boolean a(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b623e1bc", new Object[]{application, sggVar, str})).booleanValue();
        }
        return p(application, sggVar, str);
    }

    public static /* synthetic */ boolean b(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de6a21fd", new Object[]{application, sggVar, str})).booleanValue();
        }
        return m(application, sggVar, str);
    }

    public static /* synthetic */ boolean c(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b0623e", new Object[]{application, sggVar, str})).booleanValue();
        }
        return k(application, sggVar, str);
    }

    public static /* synthetic */ boolean d(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ef6a27f", new Object[]{application, sggVar, str})).booleanValue();
        }
        return o(application, sggVar, str);
    }

    public static void e(ScheduleComposer scheduleComposer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e99832", new Object[]{scheduleComposer});
        } else {
            InstrumentationDelegate.c(scheduleComposer);
        }
    }

    public static void f(sgg sggVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293b501", new Object[]{sggVar});
            return;
        }
        boolean d2 = InstrumentationDelegate.d(sggVar);
        LauncherRuntime.n = d2;
        if (d2) {
            LauncherRuntime.o = true;
            LinkRule c2 = yrg.c();
            String str2 = null;
            if (c2 == null) {
                str = null;
            } else {
                str = c2.component;
            }
            if (c2 != null) {
                str2 = c2.name;
            }
            BootstrapMode.l(3, str2, str);
        }
    }

    public static boolean h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1756826d", new Object[]{str, str2})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        return parse.getQueryParameterNames().contains(str2);
    }

    public static boolean i(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62b04f36", new Object[]{str, str2, str3})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque()) {
            return false;
        }
        return TextUtils.equals(str3, parse.getQueryParameter(str2));
    }

    public static boolean l(Application application, sgg sggVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("459c8bf4", new Object[]{application, sggVar})).booleanValue();
        }
        fxp j = fxp.j();
        if (j == null || j.f19614a) {
            return false;
        }
        String c2 = fxp.c(j);
        int indexOf = c2.indexOf("/");
        if (indexOf >= 0) {
            str = c2.substring(indexOf + 1);
        } else {
            str = c2;
        }
        SparseIntArray a2 = BootstrapMode.a(application, str);
        if (a2.get(0, 0) == 1) {
            BootstrapMode.k(-2, c2, a2.get(1, 0));
            LauncherRuntime.n = InstrumentationDelegate.d(sggVar);
            return true;
        }
        if (!t.a(application, Build.MANUFACTURER.toUpperCase() + "_slim_boost_" + str)) {
            return false;
        }
        BootstrapMode.j(-2, c2);
        LauncherRuntime.n = InstrumentationDelegate.d(sggVar);
        return true;
    }

    public static void n(Application application, b8l b8lVar, sgg sggVar) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca0bde0", new Object[]{application, b8lVar, sggVar});
        } else if (!TextUtils.equals(b8lVar.f16248a, b8lVar.b)) {
            InstrumentationDelegate.f(b8lVar, sggVar);
        } else {
            imo imoVar = new imo();
            xhq d2 = LauncherRuntime.d();
            if (l(application, sggVar)) {
                imoVar.a(application, b8lVar, sggVar, "");
            } else if (d2 == null || !d2.f31405a || (intent = d2.e) == null) {
                imoVar.a(application, b8lVar, sggVar, "");
            } else {
                String dataString = intent.getDataString();
                if (TextUtils.isEmpty(dataString)) {
                    imoVar.a(application, b8lVar, sggVar, "");
                } else if (!BootstrapMode.p()) {
                    imoVar.a(application, b8lVar, sggVar, "");
                } else {
                    f[] fVarArr = {new a(), new b(), new c(), imoVar, new d()};
                    for (int i = 0; i < 5 && !fVarArr[i].a(application, b8lVar, sggVar, dataString); i++) {
                    }
                }
            }
        }
    }

    public static boolean p(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d93fd015", new Object[]{application, sggVar, str})).booleanValue();
        }
        if (!j(application, str)) {
            return false;
        }
        f(sggVar);
        return true;
    }

    public static LinkRule q(Context context, Intent intent) {
        Pair<String, String> g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkRule) ipChange.ipc$dispatch("304c3b98", new Object[]{context, intent});
        }
        String dataString = intent.getDataString();
        if (!TextUtils.isEmpty(dataString) && (g = g(context, dataString)) != null) {
            return yrg.o(context, (String) g.first, true);
        }
        return null;
    }

    public static boolean j(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7879cbed", new Object[]{context, str})).booleanValue();
        }
        String h = bqg.h(str);
        if (TextUtils.isEmpty(h)) {
            return false;
        }
        return yrg.o(context, h, true) != null || (i(h, bps.CONFIG_LAUNCH, "1") || e.a().matcher(h).matches());
    }

    public static boolean k(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be029a44", new Object[]{application, sggVar, str})).booleanValue();
        }
        Pair<String, String> g = g(application, str);
        if (g == null) {
            return false;
        }
        String str2 = (String) g.first;
        if (TextUtils.isEmpty(str2) || i(str, bps.CONFIG_LAUNCH, "0") || i(str, "module", "native")) {
            return false;
        }
        if (i(str2, bps.CONFIG_LAUNCH, "0") && (!h(str2, "sKeep") || i(str2, "sKeep", "0"))) {
            return false;
        }
        if (yrg.i(str2) && yrg.n(application, str2) == null) {
            return false;
        }
        if (yrg.o(application, str2, true) == null && !"growth_dhh".equals(g.second)) {
            return false;
        }
        f(sggVar);
        return true;
    }

    public static boolean o(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2750c38", new Object[]{application, sggVar, str})).booleanValue();
        }
        if (!t.a(application, "link_opt_open_sso")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"tbopen".equals(parse.getScheme()) || parse.isOpaque() || !"true".equals(parse.getQueryParameter("sso_tao_simple"))) {
            return false;
        }
        LauncherRuntime.n = InstrumentationDelegate.d(sggVar);
        return true;
    }

    public static Pair<String, String> g(Context context, String str) {
        String[] split;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("16af6fd8", new Object[]{context, str});
        }
        Uri parse = Uri.parse(str);
        if (!"tbopen".equals(parse.getScheme()) || parse.isOpaque()) {
            return null;
        }
        String queryParameter = parse.getQueryParameter("h5Url");
        String queryParameter2 = parse.getQueryParameter("bc_fl_src");
        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
            if (queryParameter2.split("_", 3).length >= 2) {
                str2 = split[0] + "_" + split[1];
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (t.a(context, "link_opt_src_" + str2)) {
                    return Pair.create(queryParameter, str2);
                }
            }
        }
        return null;
    }

    public static boolean m(Application application, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f93fbab", new Object[]{application, sggVar, str})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (parse.isOpaque() || !qqg.b(parse)) {
            return false;
        }
        String queryParameter = parse.getQueryParameter("bc_fl_src");
        if (TextUtils.isEmpty(queryParameter) || !queryParameter.startsWith("tanx_df_")) {
            return false;
        }
        String[] split = queryParameter.split("_");
        if (split.length < 3) {
            return false;
        }
        String str2 = split[2];
        if (!t.a(application, "adzoneid_" + str2) || split.length < 12) {
            return false;
        }
        String str3 = split[11];
        if (!t.a(application, "adsrc_" + str3)) {
            return false;
        }
        yrg.o(application, str, true);
        f(sggVar);
        return true;
    }
}
