package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.util.NetWorkUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h2b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.commUtils";

    /* renamed from: a  reason: collision with root package name */
    public String f20368a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h2b f20369a = new h2b();

        static {
            t2o.a(729809285);
        }

        public static /* synthetic */ h2b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h2b) ipChange.ipc$dispatch("21a69478", new Object[0]);
            }
            return f20369a;
        }
    }

    static {
        t2o.a(729809283);
    }

    public static h2b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h2b) ipChange.ipc$dispatch("c20a6de", new Object[0]);
        }
        return b.a();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84cf9d2", new Object[0])).booleanValue();
        }
        try {
            return NetWorkUtils.isLowNetworkMode(Globals.getApplication());
        } catch (Exception e) {
            bqa.d(TAG, "lowNetworkMode init failed  !!!" + e);
            return false;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3329ca29", new Object[]{this});
        }
        return this.f20368a;
    }

    public z6d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6d) ipChange.ipc$dispatch("de13c8c1", new Object[]{this});
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) c4b.i().h(IHomePageProviderService.class);
        if (iHomePageProviderService != null) {
            return iHomePageProviderService.getPageProvider();
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c36465c", new Object[]{this});
        } else {
            this.f20368a = b3b.c();
        }
    }

    public void f(z6d z6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8588311", new Object[]{this, z6dVar});
            return;
        }
        IHomePageProviderService iHomePageProviderService = (IHomePageProviderService) c4b.i().h(IHomePageProviderService.class);
        if (iHomePageProviderService != null) {
            iHomePageProviderService.setPageProvider(z6dVar);
        }
    }

    public h2b() {
    }
}
