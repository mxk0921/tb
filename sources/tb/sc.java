package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.MtbGlobalEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f27936a = "";
    public static final String beforeMainApi = "beforeMainApi";
    public static final String beforeOverSeaApi = "beforeOverSeaApi";
    public static final String initSnapshot = "initSnapshot";
    public static final String initView = "initView";
    public static final String initWindWeexBasement = "initWindWeexBasement";
    public static final String outerFragmentOnCreate = "outerFragOnCreate";
    public static final String outerFragmentOnCreateView = "outerFragOnCreateView";
    public static final String outerFragmentOnResume = "outerFragOnResume";
    public static final String processMainData = "processMainData";
    public static final String renderMainApiData = "renderMainApiData";
    public static final String viewInflate = "inflateView";

    static {
        t2o.a(745538187);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327b988b", new Object[]{str});
        } else {
            f27936a = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29dc0994", new Object[]{str});
        } else if (!MtbGlobalEnv.p()) {
            vxm.b.b(f27936a).v(str);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2f12ee", new Object[]{str});
        } else if (!MtbGlobalEnv.p()) {
            vxm.b.b(f27936a).e(str, null);
        }
    }
}
