package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809260);
    }

    public void a(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869e2b9", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController b = b();
        if (b != null) {
            b.addPopMessageListenerByMain(aVar);
        }
    }

    public final IHomeSubTabController b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("c6238f43", new Object[]{this});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getHomeSubTabController("home");
        }
        return null;
    }

    public void c(IPopViewService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8fa476", new Object[]{this, aVar});
            return;
        }
        IHomeSubTabController b = b();
        if (b != null) {
            b.removePopMessageListenerByMain(aVar);
        }
    }

    public void d(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b38f4fa", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        IHomeSubTabController b = b();
        if (b != null) {
            b.triggerPopShowByMain(i, jSONObject);
        }
    }
}
