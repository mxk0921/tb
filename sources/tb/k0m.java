package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k0m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f22327a;
    public SharedPreferences b;
    public SharedPreferences.Editor c = null;
    public final Context d;

    static {
        t2o.a(962592873);
    }

    public k0m(Context context, String str, String str2, boolean z, boolean z2) {
        this.b = null;
        this.f22327a = str2;
        this.d = context;
        if (context != null) {
            this.b = context.getSharedPreferences(str2, 0);
        }
    }

    public boolean a() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c9f3a42", new Object[]{this})).booleanValue();
        }
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            ymo.a(editor);
        }
        if (!(this.b == null || (context = this.d) == null)) {
            this.b = context.getSharedPreferences(this.f22327a, 0);
        }
        return true;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!hsq.f(string)) {
                return string;
            }
        }
        return "";
    }

    public final void c() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bd54a4", new Object[]{this});
        } else if (this.c == null && (sharedPreferences = this.b) != null) {
            this.c = sharedPreferences.edit();
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{this, str, str2});
            return;
        }
        c();
        SharedPreferences.Editor editor = this.c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }
}
