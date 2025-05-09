package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Hashtable;
import tb.t2o;
import tb.w2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveAutoTagLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mBottom;
    public int mLeft;
    private final int mMaxRows;
    public int mRight;
    public int mTop;
    public Hashtable<View, b> map;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f8558a;
        public int b;
        public int c;
        public int d;

        static {
            t2o.a(295699400);
        }

        public b() {
        }
    }

    static {
        t2o.a(295699398);
    }

    public TBLiveAutoTagLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(TBLiveAutoTagLayout tBLiveAutoTagLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/TBLiveAutoTagLayout");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = this.map.get(childAt);
            if (bVar != null) {
                childAt.layout(bVar.f8558a, bVar.b, bVar.c, bVar.d);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        this.mLeft = 0;
        this.mRight = 0;
        this.mTop = w2s.a(12.0f);
        this.mBottom = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i4 > 0) {
                i3 = w2s.a(4.0f);
            } else {
                i3 = 0;
            }
            i5 += i3 + measuredWidth;
            b bVar = new b();
            int i8 = i5 - measuredWidth;
            this.mLeft = i8;
            this.mRight = i8 + childAt.getMeasuredWidth();
            if (i5 >= size) {
                this.mLeft = 0;
                this.mRight = childAt.getMeasuredWidth();
                this.mTop = i6 + measuredHeight + w2s.a(4.0f);
                i7++;
                i5 = measuredWidth;
            }
            if (i7 > this.mMaxRows) {
                break;
            }
            int measuredHeight2 = this.mTop + childAt.getMeasuredHeight();
            this.mBottom = measuredHeight2;
            int i9 = this.mTop;
            bVar.f8558a = this.mLeft;
            bVar.b = i9;
            bVar.c = this.mRight;
            bVar.d = measuredHeight2;
            this.map.put(childAt, bVar);
            i4++;
            i6 = i9;
        }
        setMeasuredDimension(size, this.mBottom);
    }

    public TBLiveAutoTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TBLiveAutoTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.map = new Hashtable<>();
        this.mMaxRows = 3;
        setOrientation(0);
    }
}
