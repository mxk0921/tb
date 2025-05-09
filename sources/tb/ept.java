package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ept {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LAST_SKIN_PIC_HEIGHT_KEY = "lastGlobalBGSkinHeight";

    /* renamed from: a  reason: collision with root package name */
    public final String f18746a;
    public ThemeData b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f18747a;

        public a(int i) {
            this.f18747a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = ept.a(ept.this);
            ns6.c(a2, "" + this.f18747a);
        }
    }

    static {
        t2o.a(491782842);
    }

    public ept(String str) {
        this.f18746a = str;
    }

    public static /* synthetic */ String a(ept eptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65bb3073", new Object[]{eptVar});
        }
        return eptVar.d();
    }

    public final tot b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tot) ipChange.ipc$dispatch("6d972ae4", new Object[]{this});
        }
        Application application = Globals.getApplication();
        tot totVar = new tot(this.f18746a, pb6.r(application));
        totVar.j = true;
        try {
            String d = d();
            totVar.d = Integer.parseInt(ns6.a(d, "" + pb6.c(application, 200.0f)));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return totVar;
    }

    public ThemeFrameLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("5bfa7094", new Object[]{this});
        }
        return cpt.c().b(Globals.getApplication(), b());
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6450cd7", new Object[]{this});
        }
        return LAST_SKIN_PIC_HEIGHT_KEY + this.f18746a;
    }

    public final boolean e(ThemeData themeData, ThemeData themeData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5cffd32", new Object[]{this, themeData, themeData2})).booleanValue();
        }
        if (themeData != null) {
            return true ^ themeData.equals(themeData2);
        }
        if (themeData2 != null) {
            return true;
        }
        return false;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            g(null);
        }
    }

    public void g(ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4480d4", new Object[]{this, themeData});
            return;
        }
        if (e(this.b, themeData)) {
            h(this.f18746a, themeData);
        }
        this.b = themeData;
    }

    public final void h(String str, ThemeData themeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b9199c", new Object[]{this, str, themeData});
        } else if (themeData != null) {
            fve.e("ThemeDataHandler", "updateCustomTheme: setCustomerTheme");
            cpt.c().k(str, themeData);
        } else {
            fve.e("ThemeDataHandler", "updateCustomTheme: removeCustomerTheme");
            cpt.c().i(str);
        }
    }

    public void i(ThemeFrameLayout themeFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5d8675", new Object[]{this, themeFrameLayout, new Integer(i)});
        } else if (themeFrameLayout != null) {
            themeFrameLayout.updateImageHeight(i);
            Coordinator.execute(new a(i));
        }
    }
}
