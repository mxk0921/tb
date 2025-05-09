package com.taobao.homepage.page.weexv2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import java.lang.ref.WeakReference;
import tb.bqa;
import tb.kcj;
import tb.pvh;
import tb.t2o;
import tb.wcc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WeexSecondModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "secondHome";
    private static final String TAG = "WeexSecondModule";

    static {
        t2o.a(729809103);
    }

    public WeexSecondModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private void callBackHome(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd32692", new Object[]{this, aVar});
            return;
        }
        Object tag = aVar.getTag(kcj.HOME_PAGE_CONTEXT);
        if (tag == null) {
            bqa.d(TAG, "tag == null");
        } else if (!(tag instanceof WeakReference)) {
            bqa.d(TAG, "!(tag instanceof WeakReference<?>)");
        } else {
            WeakReference weakReference = (WeakReference) tag;
            if (!(weakReference.get() instanceof wcc)) {
                bqa.d(TAG, "!(weakReference.get() instanceof IHomePageContext)");
                return;
            }
            IPullDownService iPullDownService = (IPullDownService) ((wcc) weakReference.get()).a(IPullDownService.class);
            if (iPullDownService == null) {
                bqa.d(TAG, "pullDownUpManager == null");
                return;
            }
            iPullDownService.secondBackHome();
            bqa.d(TAG, "返回首页");
        }
    }

    public static /* synthetic */ Object ipc$super(WeexSecondModule weexSecondModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/page/weexv2/WeexSecondModule");
    }

    @MUSMethod(uiThread = true)
    public void backHome(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5122bb96", new Object[]{this, pvhVar});
        } else {
            callBackHome(getInstance());
        }
    }
}
