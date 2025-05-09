package tb;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.layoutmanager.module.WeexModule;
import com.taobao.android.layoutmanager.setup.NotifyRegister;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import tb.fhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class it8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements fhb.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b(a aVar) {
            }

            @Override // com.taobao.tao.navigation.a.g
            public void reset() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("788e6256", new Object[]{this});
                } else {
                    NavigationTabModule.onReset();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            od0.D().f().A(new C0950a(this));
            od0.D().f().B(new b(this));
        }

        /* compiled from: Taobao */
        /* renamed from: tb.it8$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0950a implements fhb.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0950a(a aVar) {
            }

            @Override // tb.hvd
            public void onTabChanged(int i, String str) {
                Intent intent;
                Activity a2;
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                    return;
                }
                if (i == 1) {
                    TabBarControllerComponent.u = true;
                } else {
                    TabBarControllerComponent.u = false;
                    if (akt.p2("restoreStatusBarStyle", true) && (a2 = od0.D().f().a()) != null) {
                        s6o.M(a2, 0, true);
                    }
                }
                Activity a3 = od0.D().f().a();
                if (!(a3 == null || (intent = a3.getIntent()) == null)) {
                    z = intent.getBooleanExtra(y9a.EXTRA_KEY_CLICK_TO_TAB_CHANGE, false);
                }
                NavigationTabModule.onTabChanged(i);
                Intent intent2 = new Intent(NotifyRegister.ACTION_GG_TNODE_TAB_SELECT_CHANGED);
                intent2.putExtra("selectedTabIndex", i);
                intent2.putExtra("clickTabChange", z);
                if (akt.p2("syncBroadcast", true)) {
                    LocalBroadcastManager.getInstance(o.J()).sendBroadcastSync(intent2);
                } else {
                    LocalBroadcastManager.getInstance(o.J()).sendBroadcast(intent2);
                }
            }
        }
    }

    static {
        t2o.a(502268159);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        b();
        nwv.y0(new a());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce56557", new Object[0]);
            return;
        }
        tfs.e("ExtraRegister", "registerWeexModule");
        try {
            MUSEngine.registerModule("tnode", WeexModule.class);
        } catch (Exception e) {
            tfs.e("ExtraRegister", "registerWeexModule, catch exception, e=" + e);
        }
    }
}
