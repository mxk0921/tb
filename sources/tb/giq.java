package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class giq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_VERSION = "version";
    public static volatile boolean d;

    /* renamed from: a  reason: collision with root package name */
    private final String f20030a;
    private final String b;
    private final fxp c;

    public giq(fxp fxpVar, String str, String str2) {
        this.c = fxpVar;
        this.b = str;
        this.f20030a = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.f20030a, 0);
        String c = fxp.c(this.c);
        int g = fxp.g(this.c);
        String e = fxp.e(this.c);
        int m = fxp.m(this.c);
        d = TextUtils.equals(LauncherRuntime.e, sharedPreferences.getString("version", null));
        Locale locale = Locale.US;
        String str = this.b;
        sharedPreferences.edit().putString(this.b, str + "|" + g + "|" + c + "-" + e + "-" + m + "|").putString("version", LauncherRuntime.e).commit();
    }
}
