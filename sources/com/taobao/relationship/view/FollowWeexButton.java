package com.taobao.relationship.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowWeexButton extends FollowButton {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(759169072);
    }

    public FollowWeexButton(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FollowWeexButton followWeexButton, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/view/FollowWeexButton");
    }

    @Override // com.taobao.relationship.view.FollowButton
    public void refreshLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c056c94c", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    public FollowWeexButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowWeexButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
