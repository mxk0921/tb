package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a implements AbsFlexibleMarqueeGallery.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378592);
        t2o.a(310378589);
    }

    public a(FlexibleMarqueeGallery flexibleMarqueeGallery) {
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.e
    public void onAnimatePerform(View view, int i, float f, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2167426b", new Object[]{this, view, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof AbsFlexibleMarqueeGallery.e) {
                    ((AbsFlexibleMarqueeGallery.e) childAt).onAnimatePerform(view, i, f, z, i2, i3);
                }
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.e
    public void onAnimateUpdate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178e8f8e", new Object[]{this, new Float(f)});
        }
    }
}
