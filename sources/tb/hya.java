package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hya {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = hya.class.getSimpleName();
    public static final String d = "orderSearchHistoryKey";
    public static final int e = 6;
    public static final String f = ">>#>>";

    /* renamed from: a  reason: collision with root package name */
    public final Context f20962a;
    public final SharedPreferences.OnSharedPreferenceChangeListener b = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac13492", new Object[]{this, sharedPreferences, str});
            } else {
                vln.a(hya.a(hya.this));
            }
        }
    }

    public hya(Context context) {
        this.f20962a = context;
    }

    public static /* synthetic */ Context a(hya hyaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("73b57a37", new Object[]{hyaVar});
        }
        return hyaVar.f20962a;
    }

    public static hya c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hya) ipChange.ipc$dispatch("2f9fd1fc", new Object[]{context});
        }
        return new hya(context);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858dee8e", new Object[]{this});
            return;
        }
        f().edit().remove(d()).commit();
        ((a) this.b).onSharedPreferenceChanged(f(), "");
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dbb335dc", new Object[]{this});
        }
        return Login.getUserId() + d;
    }

    public final SharedPreferences f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[]{this});
        }
        Context context = this.f20962a;
        if (context != null) {
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
        return null;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f1552a3", new Object[]{this});
        }
        SharedPreferences f2 = f();
        if (f2 == null) {
            return null;
        }
        String string = f2.getString(d(), null);
        lor.c(c, "getSearchHistory() searchKeys:".concat(string == null ? "is null" : string), new String[0]);
        return string;
    }

    public boolean g(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa45b0a4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            lor.c(c, "search key is null", new String[0]);
            return false;
        }
        String str3 = c;
        lor.c(str3, "search key is:" + str, new String[0]);
        String e2 = e();
        String str4 = "";
        if (TextUtils.isEmpty(e2)) {
            str2 = str + f;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str5 = f;
            sb.append(str5);
            if (e2.indexOf(sb.toString()) != -1) {
                e2 = e2.replace(str + str5, str4).trim();
            }
            str2 = str + str5 + e2;
        }
        lor.c(str3, "saveSearchHistory() newSearchKeyString no subString:" + str2, new String[0]);
        String[] split = str2.split(f);
        if (split.length > e) {
            for (int i = 0; i < split.length && i < e; i++) {
                str4 = str4 + split[i] + f;
            }
            str2 = str4;
        }
        lor.c(c, "saveSearchHistory() newSearchKeyString subString:" + str2, new String[0]);
        SharedPreferences f2 = f();
        if (f2 == null) {
            return false;
        }
        return f2.edit().putString(d(), str2).commit();
    }

    static {
        t2o.a(713031897);
    }
}
