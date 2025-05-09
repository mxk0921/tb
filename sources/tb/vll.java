package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.view.IHomeViewService;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vll {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static vll f30087a;

    static {
        t2o.a(729808975);
    }

    public static vll c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vll) ipChange.ipc$dispatch("c2dcf0fd", new Object[0]);
        }
        if (f30087a == null) {
            f30087a = new vll();
        }
        return f30087a;
    }

    public final void a(wll wllVar) {
        IHomeSubTabController currentSubTabController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35982d76", new Object[]{this, wllVar});
            return;
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null && (currentSubTabController = iHomeControllerService.getCurrentSubTabController()) != null) {
            String subControllerType = iHomeControllerService.getSubControllerType(currentSubTabController);
            if (!TextUtils.isEmpty(subControllerType)) {
                f(subControllerType, wllVar.d, wllVar.b);
            }
        }
    }

    public final List<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c16b320f", new Object[]{this});
        }
        IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
        if (iHomeViewService != null) {
            return iHomeViewService.getAllTabType();
        }
        return null;
    }

    public final boolean e(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c7cbdc9", new Object[]{this, list, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }

    public final void f(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e38cd4dd", new Object[]{this, str, intent, str2});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = (IHomePageLifecycleService) c4b.i().h(IHomePageLifecycleService.class);
        if (iHomePageLifecycleService != null) {
            iHomePageLifecycleService.onOutLink(str, intent, str2);
        }
    }

    public void g(z6d z6dVar, wll wllVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("875d3811", new Object[]{this, z6dVar, wllVar, new Boolean(z)});
            return;
        }
        tfl.b(tfl.OUT_LINK_TRIGGER, null);
        if (z6dVar != null && wllVar != null) {
            i(z6dVar, wllVar.e);
            h(z6dVar, wllVar, z);
        }
    }

    public final void h(z6d z6dVar, wll wllVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e169ceca", new Object[]{this, z6dVar, wllVar, new Boolean(z)});
        } else if (wllVar != null && wllVar.f30767a != null) {
            tfl.b(tfl.OUT_LINK_PARSE_PARAMS_END, null);
            String str = wllVar.f30767a;
            str.hashCode();
            if (str.equals("recmd")) {
                qfl.b(wllVar, z);
            } else if (d()) {
                List<String> b = b();
                String str2 = wllVar.f30767a;
                if (e(b, str2)) {
                    IHomeViewService iHomeViewService = (IHomeViewService) c4b.i().h(IHomeViewService.class);
                    if (iHomeViewService != null) {
                        iHomeViewService.selectTab(str2);
                    }
                    f(wllVar.f30767a, wllVar.d, wllVar.b);
                    return;
                }
                a(wllVar);
            }
        }
    }

    public final void i(z6d z6dVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56cefaf", new Object[]{this, z6dVar, str});
        } else if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(wll.ALI_TRACK_ID, str);
            r5a.t(z6dVar.k1(), hashMap);
        }
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2bed9d", new Object[]{this})).booleanValue();
        }
        String h = f4b.h("outLinkToSubscribeEnable", "true");
        return !TextUtils.isEmpty(h) && h.equalsIgnoreCase("true");
    }
}
