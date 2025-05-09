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
public class NDMainPicPullBase extends PullBase {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352322207);
    }

    public NDMainPicPullBase(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(NDMainPicPullBase nDMainPicPullBase, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/optimize/prerender/NDMainPicPullBase");
    }

    @Override // com.taobao.ptr.PullBase
    public PullLayout createEndPullLayout(Context context, PullBase.Mode mode, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullLayout) ipChange.ipc$dispatch("aca86d37", new Object[]{this, context, mode, attributeSet});
        }
        return new NDMainPicNativePullEndLayout(context, mode, 1);
    }

    public NDMainPicPullBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NDMainPicPullBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
