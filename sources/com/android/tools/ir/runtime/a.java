package com.android.tools.ir.runtime;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.tao.Globals;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, ApplicationInvoker.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d66c38", new Object[]{str, aVar});
        } else if ("com.taobao.taolive".equals(str)) {
            TaoLiveLaunchInitializer.init();
        } else if (!TextUtils.isEmpty(str) && BundleInfoManager.instance().getBundleInfo(str) != null) {
            String str2 = BundleInfoManager.instance().getBundleInfo(str).n;
            if (!TextUtils.isEmpty(str2)) {
                ApplicationInvoker.getInstance(str).invoke(str2, Globals.getApplication(), aVar);
            } else if (aVar != null) {
                aVar.a();
            }
        } else if (aVar != null) {
            aVar.onInitError("bundlename == null||bundleinfo == null");
        }
    }
}
