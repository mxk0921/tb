package com.taobao.appbundle.runtime;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ModuleDependencyUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(377487418);
    }

    public static List<String> getDependencies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("78a11b57", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (BundleInfoManager.instance().getDynamicFeatureInfo(str) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(BundleInfoManager.instance().getDynamicFeatureInfo(str).dependencies);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (BundleInfoManager.instance().getDynamicFeatureInfo(str2) == null) {
                arrayList2.add(str2);
            }
        }
        arrayList.removeAll(arrayList2);
        return arrayList;
    }
}
