package com.taobao.android.live.plugin.atype.flexalocal.smartlayer.view;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.n6q;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmartLayerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<n6q> weakReference;

    static {
        t2o.a(295699810);
    }

    public SmartLayerFrameLayout(Context context, n6q n6qVar) {
        super(context);
        this.weakReference = new WeakReference<>(n6qVar);
    }

    public static /* synthetic */ Object ipc$super(SmartLayerFrameLayout smartLayerFrameLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/smartlayer/view/SmartLayerFrameLayout");
    }

    public n6q getLayerController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n6q) ipChange.ipc$dispatch("de84cc6b", new Object[]{this});
        }
        WeakReference<n6q> weakReference = this.weakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
