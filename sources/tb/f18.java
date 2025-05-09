package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f18 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, WeakReference<DinamicXEngine>> f18935a = new ConcurrentHashMap(2);

    static {
        t2o.a(486539338);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9ae937", new Object[]{dinamicXEngine});
            return;
        }
        fve.e("Dx3RegisterCenter", "cacheDX3Engine...bizTag:" + dinamicXEngine.c());
        ((ConcurrentHashMap) f18935a).put(dinamicXEngine.c(), new WeakReference(dinamicXEngine));
    }

    public static DinamicXEngine b(DXEngineConfig.b bVar, String str, IDxItemRenderService.a aVar) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("668879f9", new Object[]{bVar, str, aVar});
        }
        if (str != null) {
            dinamicXEngine = f(str);
            fve.e("Dx3RegisterCenter", "createDx3Engine...reuse cache bizTag:".concat(str));
        } else {
            dinamicXEngine = null;
        }
        if (dinamicXEngine == null) {
            dinamicXEngine = c(bVar, str);
        }
        eve.c("dx3Engine", "register");
        vue.a(dinamicXEngine);
        if (aVar != null) {
            fve.e("Dx3RegisterCenter", "dx3Register");
            aVar.a(dinamicXEngine);
        }
        eve.b("dx3Engine", "register");
        fve.e("Dx3RegisterCenter", "dx3 引擎创建完成");
        return dinamicXEngine;
    }

    public static DinamicXEngine c(DXEngineConfig.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("9d9e5d2b", new Object[]{bVar, str});
        }
        int g = g();
        fve.e("Dx3RegisterCenter", "createEngine...bizType:" + str + " , periodTime:" + g);
        if (bVar == null) {
            bVar = new DXEngineConfig.b(str);
        }
        bVar.Q(2).c0(g);
        bVar.S(bve.e());
        bVar.X(53).Y("guess");
        bVar.U(true);
        bVar.K(e());
        return new DinamicXEngine(bVar.F());
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ea26a99", new Object[0]);
        }
        if (!bve.m()) {
            return "";
        }
        return f4b.h("infoFlowPreRenderXWhiteList2", zg5.DEFAULT_INFORMATIONFLOW_WHITE_LIST);
    }

    public static DinamicXEngine f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("e706e81", new Object[]{str});
        }
        WeakReference weakReference = (WeakReference) ((ConcurrentHashMap) f18935a).get(str);
        if (weakReference != null) {
            return (DinamicXEngine) weakReference.get();
        }
        return null;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d1ac200", new Object[0])).intValue();
        }
        int c = mve.c("dinamicXCallbackInterval", 1000);
        if (c <= 0 || c >= 10000) {
            return 1000;
        }
        return c;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccb1ee5", new Object[0]);
            return;
        }
        fve.e("Dx3RegisterCenter", "removeCache");
        ((ConcurrentHashMap) f18935a).clear();
    }

    public static String d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("586c6e1e", new Object[]{cfcVar});
        }
        if (mve.a("userDiffDxBizTypeWithHomePage", false) && zn4.a(cfcVar.getContainerType().getContainerId())) {
            return j18.AFTER_BUY_DX_MODULE;
        }
        return j18.HOMEPAGE_DX_MODULE;
    }
}
