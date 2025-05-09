package com.taobao.android.detail2.core.optimize.prerender;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.ptr.PullLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NDFeedsPullBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322204);
    }

    public NDFeedsPullBase(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(NDFeedsPullBase nDFeedsPullBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/NDFeedsPullBase");
    }

    @Override // com.taobao.ptr.PullBase
    public PullLayout createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet});
        }
        return new NDFeedsPullEndLayout(context, mode, 0);
    }

    public NDFeedsPullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NDFeedsPullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
