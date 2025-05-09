package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.webApp.WebAppJSBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f31024a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wyw f31025a = new wyw();

        static {
            t2o.a(1030750356);
        }

        public static /* synthetic */ wyw a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wyw) ipChange.ipc$dispatch("c2f5aa13", new Object[0]);
            }
            return f31025a;
        }
    }

    static {
        t2o.a(1030750354);
    }

    public static wyw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wyw) ipChange.ipc$dispatch("5906b078", new Object[0]);
        }
        return b.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        irg.d(true);
        this.f31024a = context;
        fsw.h(WebAppJSBridge.NAME, WebAppJSBridge.class);
        irg.a("WebApp", "WebAppManager === init === 初始化完成");
    }

    public wyw() {
    }
}
