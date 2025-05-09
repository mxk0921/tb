package com.taobao.taolive.uikit.api;

import android.content.Context;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveBaseComponentView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093568);
    }

    public TBLiveBaseComponentView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(TBLiveBaseComponentView tBLiveBaseComponentView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/uikit/api/TBLiveBaseComponentView");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }
}
