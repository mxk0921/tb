package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class inm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                inm.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                MtbDataServiceFacade.t(userId);
                q32.d(userId);
                tib c = q32.c();
                if (c != null) {
                    c.b();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21452a;

        public c(String str) {
            this.f21452a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BasementFeedDataProvider.INSTANCE.t(this.f21452a);
            }
        }
    }

    static {
        t2o.a(745538169);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            b();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50ac85", new Object[0]);
        } else if (!MtbGlobalEnv.y() || MtbGlobalEnv.x()) {
            c();
        } else {
            d();
        }
    }

    public static void c() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b199ea20", new Object[0]);
            return;
        }
        JSONObject k = ish.g().k();
        l3j.INSTANCE.u();
        if (k == null) {
            str = null;
        } else {
            str = k.toJSONString();
        }
        if (e()) {
            new Handler(Looper.getMainLooper()).postDelayed(new c(str), 500L);
        }
    }

    public static void d() {
        boolean isDebug;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a801a1", new Object[0]);
            return;
        }
        try {
            p3j.a(new b(), 500L);
        } finally {
            if (!isDebug) {
            }
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0a8a25", new Object[0])).booleanValue();
        }
        JSONObject c2 = ish.g().c();
        if (c2 == null) {
            return false;
        }
        try {
            if (TextUtils.equals("true", c2.getString("newBasementContainer"))) {
                return TextUtils.equals("weex", c2.getString("pageType"));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ac3ee0", new Object[0]);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            Coordinator.execute(new a());
        } else {
            b();
        }
    }
}
