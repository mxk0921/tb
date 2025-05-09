package com.taobao.uikit.gesture.biz;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.circlesearch.PltCircleSearchGestureListener;
import com.taobao.uikit.gesture.GestureLog;
import com.taobao.uikit.gesture.api.GestureApi;
import com.taobao.uikit.gesture.model.GestureFilter;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ListenerInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ListenerInitializer";

    static {
        t2o.a(934281219);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GestureFilter.Builder().setActivityName("com.taobao.android.detail2.core.framework.NewDetailActivity").setGestureType(32).build());
        arrayList.add(new GestureFilter.Builder().setActivityName("com.taobao.android.detail.alittdetail.TTDetailActivity").setGestureType(32).build());
        arrayList.add(new GestureFilter.Builder().setActivityName("com.taobao.search.sf.MainSearchResultActivity").setGestureType(32).build());
        arrayList.add(new GestureFilter.Builder().setActivityName("com.etao.feimagesearch.IrpActivity").setGestureType(32).build());
        if (!GestureApi.registerGlobalGestureListener(new PltCircleSearchGestureListener(), arrayList)) {
            GestureLog.loge(TAG, "init, add listener failed");
        }
    }
}
