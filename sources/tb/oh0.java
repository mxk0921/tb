package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oh0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENABLE_AFTER_BUY_NEW_FRAMEWORK = "enableAfterBuyNewFramework";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Boolean f25386a;
        public final /* synthetic */ String b;

        public a(Boolean bool, String str) {
            this.f25386a = bool;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences e = ulp.c(Globals.getApplication()).e();
            if (e != null) {
                SharedPreferences.Editor edit = e.edit();
                if (this.f25386a != null) {
                    edit.putBoolean(this.b + oh0.KEY_ENABLE_AFTER_BUY_NEW_FRAMEWORK, this.f25386a.booleanValue());
                }
                edit.apply();
            }
        }
    }

    static {
        t2o.a(491782850);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7f29ee0", new Object[]{str})).booleanValue();
        }
        SharedPreferences e = ulp.c(Globals.getApplication()).e();
        if (e == null) {
            return false;
        }
        return e.getBoolean(str + KEY_ENABLE_AFTER_BUY_NEW_FRAMEWORK, false);
    }

    public static void b(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("883ef137", new Object[]{str, bool});
        } else {
            get.a().e(new a(bool, str));
        }
    }
}
