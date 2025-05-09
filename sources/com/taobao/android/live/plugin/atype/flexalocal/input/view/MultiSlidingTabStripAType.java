package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MultiSlidingTabStripAType extends PagerSlidingTabStripAType {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699437);
    }

    public MultiSlidingTabStripAType(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(MultiSlidingTabStripAType multiSlidingTabStripAType, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/input/view/MultiSlidingTabStripAType");
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mCacheDataEnable) {
            super.destroy();
        }
    }

    public MultiSlidingTabStripAType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiSlidingTabStripAType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCacheDataEnable = true;
    }
}
