package com.taobao.android.dinamicx.widget.recycler.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class DXAbsOnLoadMoreView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597559);
        t2o.a(444597560);
    }

    public DXAbsOnLoadMoreView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(DXAbsOnLoadMoreView dXAbsOnLoadMoreView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/loadmore/DXAbsOnLoadMoreView");
    }

    public abstract void onLoadMoreStatusUpdate(int i, JSONObject jSONObject);

    public DXAbsOnLoadMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXAbsOnLoadMoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
