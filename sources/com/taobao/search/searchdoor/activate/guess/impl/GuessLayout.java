package com.taobao.search.searchdoor.activate.guess.impl;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.guess.ActivateGuessBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryVO;
import com.taobao.search.searchdoor.activate.guess.impl.GuessLayout;
import java.util.ArrayList;
import java.util.List;
import tb.a07;
import tb.ckf;
import tb.nbc;
import tb.o1p;
import tb.t2o;
import tb.uma;
import tb.xyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GuessLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GuessDiscoveryCellBean lastBean;
    private final int marginTop;
    private final boolean tb2024;
    public static final a Companion = new a(null);
    private static final int itemDivider2024 = o1p.a(18.0f);
    private static final int itemDivider = o1p.a(18.0f);
    private static final int itemHorizontalMargin = o1p.a(8.0f);
    private static final int firstLineMarginTop = o1p.a(8.5f);
    private final ArrayList<GuessItemView> viewCache = new ArrayList<>();
    private final ArrayList<uma> itemList = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792989);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792988);
    }

    public GuessLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        setClipChildren(false);
        ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
        boolean a2 = xyd.a((Activity) context);
        this.tb2024 = a2;
        if (a2) {
            i = itemDivider2024;
        } else {
            i = itemDivider;
        }
        this.marginTop = i;
    }

    public static /* synthetic */ Object ipc$super(GuessLayout guessLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/guess/impl/GuessLayout");
    }

    private final void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ckf.e(childAt, "null cannot be cast to non-null type com.taobao.search.searchdoor.activate.guess.impl.GuessItemView");
            this.viewCache.add((GuessItemView) childAt);
        }
        removeAllViews();
    }

    private final void render(final nbc nbcVar) {
        GuessItemView guessItemView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca0f3af", new Object[]{this, nbcVar});
            return;
        }
        final int i = 0;
        for (final uma umaVar : this.itemList) {
            int i2 = i + 1;
            if (!this.viewCache.isEmpty()) {
                guessItemView = this.viewCache.remove(0);
            } else {
                guessItemView = new GuessItemView(getContext());
            }
            ckf.d(guessItemView);
            addView(guessItemView);
            guessItemView.bind(umaVar.b(), this.tb2024);
            guessItemView.setOnClickListener(new View.OnClickListener() { // from class: tb.z7z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuessLayout.render$lambda$2(nbc.this, umaVar, i, view);
                }
            });
            if (!umaVar.a()) {
                GuessDiscoveryCellBean guessDiscoveryCellBean = this.lastBean;
                if (guessDiscoveryCellBean != null) {
                    nbcVar.R1(guessDiscoveryCellBean, umaVar.b(), i);
                    umaVar.c(true);
                } else {
                    return;
                }
            }
            if (i <= 1) {
                guessItemView.setPadding(0, firstLineMarginTop, 0, this.marginTop / 2);
            } else {
                int i3 = this.marginTop / 2;
                guessItemView.setPadding(0, i3, 0, i3);
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(nbc nbcVar, uma umaVar, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77aadb5", new Object[]{nbcVar, umaVar, new Integer(i), view});
            return;
        }
        ckf.g(nbcVar, "$itemListener");
        ckf.g(umaVar, "$item");
        nbcVar.E0(umaVar.b(), i);
    }

    public final void bind(GuessDiscoveryCellBean guessDiscoveryCellBean, nbc nbcVar) {
        GuessDiscoveryVO.a aVar;
        List<ActivateGuessBean> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5aa4ef3", new Object[]{this, guessDiscoveryCellBean, nbcVar});
            return;
        }
        ckf.g(guessDiscoveryCellBean, "bean");
        ckf.g(nbcVar, "itemListener");
        if (this.lastBean != guessDiscoveryCellBean) {
            this.lastBean = guessDiscoveryCellBean;
            ArrayList arrayList = new ArrayList();
            GuessDiscoveryVO guessDiscoveryVO = guessDiscoveryCellBean.discoveryVO;
            if (!(guessDiscoveryVO == null || (aVar = guessDiscoveryVO.result) == null || (list = aVar.text) == null)) {
                for (ActivateGuessBean activateGuessBean : list) {
                    ckf.d(activateGuessBean);
                    arrayList.add(new uma(activateGuessBean, false, 2, null));
                }
            }
            this.itemList.clear();
            this.itemList.addAll(arrayList);
            recycle();
            render(nbcVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                if (i5 % 2 == 1) {
                    paddingLeft = getPaddingLeft();
                    paddingTop += childAt.getMeasuredHeight();
                } else {
                    paddingLeft += childAt.getMeasuredWidth() + itemHorizontalMargin;
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (childCount == 0) {
            setMeasuredDimension(size, paddingTop);
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((((size - getPaddingLeft()) - getPaddingRight()) - itemHorizontalMargin) / 2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ckf.e(childAt, "null cannot be cast to non-null type com.taobao.search.searchdoor.activate.guess.impl.GuessItemView");
            GuessItemView guessItemView = (GuessItemView) childAt;
            guessItemView.measure(makeMeasureSpec, makeMeasureSpec2);
            if (i3 % 2 == 0) {
                paddingTop += guessItemView.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size, paddingTop);
    }

    public final void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.lastBean = null;
        }
    }
}
