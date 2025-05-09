package tb;

import android.app.Application;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.wireless.link.common.LinkCommonHomeReceiver;
import com.taobao.wireless.link.common.PushStateJsbridge;
import com.taobao.wireless.link.controller.MessageServiceReceiver;
import com.taobao.wireless.link.pop.PopMessageReceiver;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ypg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Application f32260a;
    public String b;
    public aqg c;
    public boolean d;
    public boolean e;
    public String f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ypg f32261a = new ypg();

        static {
            t2o.a(1030750220);
        }

        public static /* synthetic */ ypg a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ypg) ipChange.ipc$dispatch("e20b45c", new Object[0]);
            }
            return f32261a;
        }
    }

    static {
        t2o.a(1030750218);
    }

    public static ypg e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypg) ipChange.ipc$dispatch("2d7baa81", new Object[0]);
        }
        return b.a();
    }

    public final void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c229e834", new Object[]{this, application});
            return;
        }
        LocalBroadcastManager.getInstance(application).registerReceiver(LinkCommonHomeReceiver.b.f14171a, new IntentFilter("action_welcome_need_finish"));
        zhm.q(application);
        application.registerActivityLifecycleCallbacks(new r81());
        zhm.p(application);
    }

    public void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        try {
            irg.a("link_tag", "LinkCommonInit === init === 开始初始化");
            this.f32260a = application;
            this.b = (String) hashMap.get("appVersion");
            this.g = ((Boolean) hashMap.get("isDebuggable")).booleanValue();
            cno.b(application);
            this.c = new aqg(application);
            d(application, hashMap);
            a(application);
            irg.a("link_tag", "LinkCommonInit === init === 初始化完成");
        } catch (Throwable th) {
            irg.a("link_tag", "LinkCommonInit === init === 初始化异常：" + th);
        }
    }

    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e63da4e", new Object[]{this, application, hashMap});
            return;
        }
        e().g(application);
        irg.a("link_tag", "LinkCommonInit === initChannel === channel进程注册消息监听");
    }

    public final void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06bd217", new Object[]{this, application, hashMap});
            return;
        }
        wyw.b().a(application);
        md1.h().g(application, hashMap);
        mu7.k().i(application);
        uih.f().e(application, hashMap);
        fsw.h(PushStateJsbridge.CLASSNAME_PUSH_STATE, PushStateJsbridge.class);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c29898", new Object[]{this, application});
            return;
        }
        GlobalClientInfo.getInstance(application).registerService("assistant", MessageServiceReceiver.class.getName());
        GlobalClientInfo.getInstance(application).registerService("agooSendForPop", PopMessageReceiver.class.getName());
    }

    public ypg() {
        this.d = true;
        this.e = false;
        this.f = "COLD";
        this.g = false;
    }
}
