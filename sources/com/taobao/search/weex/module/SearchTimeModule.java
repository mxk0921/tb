package com.taobao.search.weex.module;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.b4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchTimeModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchTime";
    private static final String TAG = "SearchTimeModule";

    static {
        t2o.a(815793817);
    }

    public static /* synthetic */ Object ipc$super(SearchTimeModule searchTimeModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/weex/module/SearchTimeModule");
    }

    @JSMethod(uiThread = false)
    public void getTime(JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509755fe", new Object[]{this, jSCallback});
            return;
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp() / 1000;
        b4p.a(TAG, "getTime: " + currentTimeStamp);
        jSCallback.invoke(String.valueOf(currentTimeStamp));
    }
}
