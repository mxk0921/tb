package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xti {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AREA_MAINLAND = "mainland";
    public static final String AREA_OVERSEA = "oversea";
    public static final String FRAMEWORK_MICROSERVICES = "microservices";
    public static final String HOME_TAB_ID_HOME = "home";
    public static final String KEY_TAB_BAR_FRAMEWORK = "framework";
    public static final wti MICROSERVICES_INFO_FLOW_PERFORMANCE = new wti();
    public static final String TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES = "home_mainland";
    public static final String TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES = "home_oversea";
    public static final String[] HOME_MICROSERVICES_RECOMMEND_TAB_IDS = {TAB_ID_MAINLAND_RECOMMEND_MICROSERVICES, TAB_ID_OVERSEA_RECOMMEND_MICROSERVICES};

    static {
        t2o.a(729810115);
    }

    public static wti a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wti) ipChange.ipc$dispatch("e348dbe1", new Object[0]);
        }
        return MICROSERVICES_INFO_FLOW_PERFORMANCE;
    }

    public static IHomeSubTabController b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f0f1ac47", new Object[]{str});
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService != null) {
            return iHomeControllerService.getRealSubTabController(str);
        }
        return null;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb30a61", new Object[0])).booleanValue();
        }
        IHomeControllerService iHomeControllerService = (IHomeControllerService) c4b.i().h(IHomeControllerService.class);
        if (iHomeControllerService == null) {
            return false;
        }
        return e(iHomeControllerService.getCurrentSubTabController());
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bee0bbf", new Object[0])).booleanValue();
        }
        if (rue.a(yyj.e().k()) != null) {
            return true;
        }
        return false;
    }

    public static boolean e(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f22b1b", new Object[]{iHomeSubTabController})).booleanValue();
        }
        if (iHomeSubTabController == null) {
            return false;
        }
        if (iHomeSubTabController == b("home")) {
            return true;
        }
        for (String str : HOME_MICROSERVICES_RECOMMEND_TAB_IDS) {
            if (b(str) == iHomeSubTabController) {
                return true;
            }
        }
        return false;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("252e2889", new Object[0]);
        }
        return rrs.a();
    }

    public static Set<String> g(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2c4e91f7", new Object[]{set});
        }
        if (set == null || set.size() != 2) {
            return set;
        }
        String f = yyj.e().f();
        String k = yyj.e().k();
        if (!set.contains(f) || !set.contains(k)) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        linkedHashSet.add(f);
        linkedHashSet.add(k);
        return linkedHashSet;
    }
}
