package com.taobao.homepage.pop.view.container.sub;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.popview.BasePopView;
import tb.e3b;
import tb.pfw;
import tb.vfm;
import tb.ztq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SubHierarchyPopContainer extends BasePopContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SubPopContainer ";

    public SubHierarchyPopContainer(Context context, pfw pfwVar, int i, e3b e3bVar) {
        super(context, pfwVar, i, e3bVar);
        this.mPopTrigger = new ztq(this, pfwVar, e3bVar);
        if (vfm.a()) {
            setBackgroundColor(Color.parseColor("#ccddeeff"));
        }
    }

    public static /* synthetic */ Object ipc$super(SubHierarchyPopContainer subHierarchyPopContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 260827425:
                super.onCardDetached(((Number) objArr[0]).intValue(), (View) objArr[1], (String) objArr[2]);
                return null;
            case 866057427:
                super.onCardAttached(((Number) objArr[0]).intValue(), (View) objArr[1], (String) objArr[2]);
                return null;
            case 1535227285:
                super.translate(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                return null;
            case 1937782423:
                super.onIconScroll(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/pop/view/container/sub/SubHierarchyPopContainer");
        }
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void onCardAttached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339efcd3", new Object[]{this, new Integer(i), view, str});
            return;
        }
        super.onCardAttached(i, view, str);
        vfm.c(TAG, "onCardAttached, sectionBiz=" + str);
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onCardAttached(i, view, str);
        }
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void onCardDetached(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8be921", new Object[]{this, new Integer(i), view, str});
            return;
        }
        super.onCardDetached(i, view, str);
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onCardDetached(i, view, str);
        }
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void onIconScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73803697", new Object[]{this, new Integer(i)});
            return;
        }
        super.onIconScroll(i);
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.onIconScroll(i);
        }
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void translate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b81b595", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        super.translate(f, f2);
        for (BasePopView basePopView : this.mPopViewsOnScreen.values()) {
            basePopView.translate(f, f2);
        }
    }
}
