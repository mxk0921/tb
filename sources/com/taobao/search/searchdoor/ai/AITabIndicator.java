package com.taobao.search.searchdoor.ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.ckf;
import tb.oxb;
import tb.t2o;
import tb.wqs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class AITabIndicator extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int currentIndicatorPos;
    private Drawable indicatorDrawable;
    private final List<wqs> tabs = new ArrayList();
    private final List<Rect> tabsLocation = new ArrayList();

    static {
        t2o.a(815793057);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AITabIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(AITabIndicator aITabIndicator, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/AITabIndicator");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        Drawable drawable = this.indicatorDrawable;
        if (drawable != null) {
            drawable.setBounds((this.currentIndicatorPos - getLeft()) - (drawable.getIntrinsicWidth() / 2), 0, (this.currentIndicatorPos - getLeft()) + (drawable.getIntrinsicWidth() / 2), drawable.getIntrinsicHeight());
            Drawable drawable2 = this.indicatorDrawable;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int size = this.tabs.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.tabsLocation.get(i5).left = this.tabs.get(i5).b().getLeft();
            this.tabsLocation.get(i5).right = this.tabs.get(i5).b().getRight();
        }
        if (this.currentIndicatorPos == 0 && this.tabsLocation.size() > 0) {
            this.currentIndicatorPos = (this.tabsLocation.get(0).right + this.tabsLocation.get(0).left) / 2;
        }
    }

    public final void refresh(boolean z) {
        oxb oxbVar;
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa69bd32", new Object[]{this, new Boolean(z)});
            return;
        }
        Context context = getContext();
        if (context instanceof oxb) {
            oxbVar = (oxb) context;
        } else {
            oxbVar = null;
        }
        if ((oxbVar == null || !oxbVar.E1()) && !z) {
            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.tbsearch_ai_search_tab_indicator, null);
        } else {
            drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.tbsearch_ai_search_tab_indicator_night, null);
        }
        this.indicatorDrawable = drawable;
    }

    public final void updatePos(int i, float f) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44af306f", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        int i3 = i + 1;
        if (i3 >= this.tabs.size()) {
            i3 = i;
            i--;
            f = 1.0f;
        }
        this.currentIndicatorPos = (int) (((this.tabsLocation.get(i).right + this.tabsLocation.get(i).left) / 2) + ((((this.tabsLocation.get(i3).right + this.tabsLocation.get(i3).left) / 2) - i2) * f));
        invalidate();
    }

    public final void attachToTabs(List<wqs> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55916bb6", new Object[]{this, list});
            return;
        }
        ckf.g(list, "tabs");
        this.tabs.addAll(list);
        this.tabsLocation.clear();
        for (wqs wqsVar : list) {
            this.tabsLocation.add(new Rect());
        }
        this.currentIndicatorPos = 0;
        requestLayout();
    }
}
