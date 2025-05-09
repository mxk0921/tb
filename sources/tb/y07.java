package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y07 implements o5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331522);
        t2o.a(676331536);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a7aea73", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureFromClassName(str);
    }

    public List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d11fdc3d", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            return arrayList;
        }
        for (String str2 : BundleInfoManager.instance().getDynamicFeatureInfo(str).dependencies) {
            if (BundleInfoManager.instance().getDynamicFeatureInfo(str2) != null) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a1500e7", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureFromFragment(str);
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fa1ff58", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureFromInitalClass(str);
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5a05d2", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureFromService(str);
    }

    public String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ecf66f2", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureFromView(str);
    }

    public String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de5e1b22", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryFeatureInitialClassName(str);
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95b14fc8", new Object[]{this, str});
        }
        return BundleInfoManager.instance().queryServiceFromInterface(str);
    }
}
