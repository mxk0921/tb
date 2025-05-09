package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FeedbackLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378766);
    }

    public FeedbackLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FeedbackLayout feedbackLayout, String str, Object... objArr) {
        if (str.hashCode() == 348684699) {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/feedback/FeedbackLayout");
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        if ((4 == i || 8 == i) && (viewGroup = (ViewGroup) getParent()) != null) {
            viewGroup.removeView(this);
        }
    }

    public FeedbackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedbackLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
