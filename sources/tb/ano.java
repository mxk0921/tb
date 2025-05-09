package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ano {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ano b = new ano(LauncherRuntime.g);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f15887a;

    public ano(Context context) {
        this.f15887a = context.getSharedPreferences("uikit_navigation_extern", 0);
    }

    public static ano a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ano) ipChange.ipc$dispatch("174d8941", new Object[0]);
        }
        return b;
    }

    public SharedPreferences.Editor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("dcc4cca", new Object[]{this});
        }
        return this.f15887a.edit();
    }

    public String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{this, str, str2});
        }
        String string = this.f15887a.getString(str, str2);
        jhj.b("SPStorage", "get string: " + str + " ret is " + string);
        return string;
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d492a2e", new Object[]{this, str, str2});
            return;
        }
        jhj.b("SPStorage", "set string" + str + " ret is " + str2);
        b().putString(str, str2).apply();
    }
}
