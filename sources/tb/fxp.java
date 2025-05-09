package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fxp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT_UNKNOWN = "UNKNOWN";
    public static final String EXTRA_KEY_DEATH_RECOVERY = "deathRecovery";
    public static final String FLAG_UNKNOWN = "UNKNOWN";
    public static fxp e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19614a;
    public final Intent b;
    public final boolean c;
    public final String d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final fxp f19615a = new fxp(false, new Intent().putExtra("originStartupContextEmpty", true), null, false);

        public static /* synthetic */ fxp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fxp) ipChange.ipc$dispatch("d14661e0", new Object[0]);
            }
            return f19615a;
        }
    }

    public static fxp b(xhq xhqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxp) ipChange.ipc$dispatch("bfc4f2ca", new Object[]{xhqVar});
        }
        if (xhqVar == null) {
            return b.a();
        }
        Intent intent = xhqVar.e;
        if (intent == null) {
            intent = new Intent();
        }
        intent.setExtrasClassLoader(fxp.class.getClassLoader());
        Intent cloneFilter = intent.cloneFilter();
        cloneFilter.setFlags(intent.getFlags());
        cloneFilter.setExtrasClassLoader(fxp.class.getClassLoader());
        cloneFilter.putExtra(EXTRA_KEY_DEATH_RECOVERY, xhqVar.g);
        return new fxp(xhqVar.f31405a, cloneFilter, xhqVar.f, xhqVar.g);
    }

    public static String c(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db159bf6", new Object[]{fxpVar});
        }
        if (fxpVar == null) {
            return "UNKNOWN";
        }
        return fxpVar.d();
    }

    public static String e(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61a90cd1", new Object[]{fxpVar});
        }
        if (fxpVar == null) {
            return "UNKNOWN";
        }
        return fxpVar.f();
    }

    public static int g(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("adac2ba8", new Object[]{fxpVar})).intValue();
        }
        if (fxpVar == null) {
            return Integer.MIN_VALUE;
        }
        return fxpVar.h();
    }

    public static boolean i(Intent intent) {
        Set<String> categories;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f3e9af7", new Object[]{intent})).booleanValue();
        }
        if ("android.intent.action.MAIN".equals(intent.getAction()) && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER")) {
            return true;
        }
        return false;
    }

    public static fxp j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fxp) ipChange.ipc$dispatch("756a63d4", new Object[0]);
        }
        return e;
    }

    public static String k(String str, String str2, String str3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c90370cf", new Object[]{str, str2, str3});
        }
        String str4 = str2 + "=";
        int indexOf = str.indexOf("Intent {");
        if (indexOf >= 0) {
            i = indexOf;
        }
        int indexOf2 = str.indexOf(str4, i);
        if (indexOf2 < 0) {
            return str3;
        }
        int indexOf3 = str.indexOf(" ", str4.length() + indexOf2);
        if (indexOf3 < 0) {
            return str3;
        }
        return str.substring(indexOf2 + str4.length(), indexOf3);
    }

    public static int m(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("653844c8", new Object[]{fxpVar})).intValue();
        }
        if (fxpVar == null) {
            return 0;
        }
        if (fxpVar.c) {
            return 2;
        }
        return 1;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc5b2b55", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.d)) {
            String k = k(this.d, "cmp", null);
            if (k != null) {
                return k;
            }
            String str = this.d;
            return k(str, "className", str);
        }
        ComponentName component = this.b.getComponent();
        if (component == null) {
            return "UNKNOWN";
        }
        return component.getPackageName() + "/" + component.getClassName();
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca1edb9a", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.d)) {
            return k(this.d, "flg", "UNKNOWN");
        }
        return String.format("0x%08X", Integer.valueOf(this.b.getFlags()));
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SimpleContext{fromActivity=" + this.f19614a + ", intent=" + this.b + ", source=" + this.d + ", deathRecovery=" + this.c + '}';
    }

    public fxp(boolean z, Intent intent, String str, boolean z2) {
        this.f19614a = z;
        this.b = intent;
        this.d = str;
        this.c = z2;
    }

    public static void a(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350a02b4", new Object[]{fxpVar});
            return;
        }
        fxp fxpVar2 = e;
        if (!(fxpVar2 == null || fxpVar == null)) {
            fxpVar.b.putExtra("originStartupContextEmpty", fxpVar2.b.getBooleanExtra("originStartupContextEmpty", false));
        }
        e = fxpVar;
    }

    public static boolean l(fxp fxpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ad62cb1", new Object[]{fxpVar})).booleanValue();
        }
        if (fxpVar == null) {
            return false;
        }
        return fxpVar.b.getBooleanExtra("originStartupContextEmpty", false);
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e23fdf3", new Object[]{this})).intValue();
        }
        TLog.loge(erj.MODULE, "startup_context", "context: " + this);
        if (!this.f19614a) {
            return this.b.getIntExtra("mode", -1);
        }
        if (i(this.b)) {
            return 1;
        }
        Uri data = this.b.getData();
        if (data != null && "tbopen".equals(data.getScheme())) {
            return this.b.getIntExtra("mode", 0);
        }
        return 2;
    }
}
