package com.taobao.uikit.gesture.api;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.gesture.GestureSdkManager;
import com.taobao.uikit.gesture.model.GestureFilter;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class GestureApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(933232648);
    }

    public static void registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, GestureFilter gestureFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c664751", new Object[]{iGlobalGestureListener, gestureFilter});
        } else {
            GestureSdkManager.getInstance().registerGlobalGestureListener(iGlobalGestureListener, gestureFilter);
        }
    }

    public static boolean unregisterGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200bfe54", new Object[]{iGlobalGestureListener})).booleanValue();
        }
        return GestureSdkManager.getInstance().unregisterGlobalGestureListener(iGlobalGestureListener);
    }

    public static boolean registerGlobalGestureListener(IGlobalGestureListener iGlobalGestureListener, List<GestureFilter> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3205df6c", new Object[]{iGlobalGestureListener, list})).booleanValue() : GestureSdkManager.getInstance().registerGlobalGestureListener(iGlobalGestureListener, list);
    }
}
