package com.taobao.android.searchbaseframe.xsl.section.refact;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.xsl.refact.XslDataSource;
import com.taobao.android.xsearchplugin.muise.AbsMuiseViewHolder;
import tb.acx;
import tb.dod;
import tb.eod;
import tb.fod;
import tb.o02;
import tb.oxb;
import tb.t2o;
import tb.t7p;
import tb.ttc;
import tb.u7p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class XSectionLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a backgroundSetter;
    private eod heightChangeListener;
    private fod lastStickyHolder;
    private boolean observeSectionChange;
    private PartnerRecyclerView recyclerView;
    private u7p sectionChangeListener;
    private final XSectionDecoration sectionDecoration;
    private final ClipDecoration clipDecoration = new ClipDecoration();
    private int lastStickySectionIndex = -1;
    private boolean attached = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void g(View view, boolean z);
    }

    static {
        t2o.a(993002112);
        t2o.a(993002098);
    }

    public XSectionLayout(Context context, ttc ttcVar) {
        super(context);
        if (context instanceof oxb) {
            this.sectionDecoration = new XSectionDecoration(((oxb) context).E1(), ttcVar);
        } else {
            this.sectionDecoration = new XSectionDecoration(false, ttcVar);
        }
    }

    public static /* synthetic */ Object ipc$super(XSectionLayout xSectionLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/xsl/section/refact/XSectionLayout");
    }

    private static boolean isMeasurementNotUpToDate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("228e657b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return true;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return false;
            }
            if (mode == 1073741824 && size == i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return true;
        } else {
            return false;
        }
    }

    private boolean shouldMeasure(View view, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f299e1", new Object[]{this, view, new Integer(i), new Integer(i2), layoutParams})).booleanValue();
        }
        if (view.isLayoutRequested() || isMeasurementNotUpToDate(view.getWidth(), i, layoutParams.width) || isMeasurementNotUpToDate(view.getHeight(), i2, layoutParams.height)) {
            return true;
        }
        return false;
    }

    public void addSection(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec24567", new Object[]{this, view});
        } else {
            addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
    }

    public void attach(RecyclerView recyclerView, dod dodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926e46fd", new Object[]{this, recyclerView, dodVar});
            return;
        }
        if (!this.attached) {
            PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) recyclerView;
            this.sectionDecoration.d(partnerRecyclerView, this, dodVar);
            this.clipDecoration.e(partnerRecyclerView, dodVar);
            this.attached = true;
        }
        this.recyclerView = (PartnerRecyclerView) recyclerView;
    }

    public void clearSectionCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2986f611", new Object[]{this});
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.sectionDecoration.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        if (partnerRecyclerView == null) {
            super.dispatchDraw(canvas);
            return;
        }
        Path clipPath = partnerRecyclerView.getClipPath();
        if (clipPath != null) {
            canvas.save();
            canvas.clipPath(clipPath);
        }
        super.dispatchDraw(canvas);
        if (clipPath != null) {
            canvas.restore();
        }
    }

    public void measureChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b37eccd", new Object[]{this, view});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(getMeasuredWidth(), layoutManager.getWidthMode(), 0, layoutParams.width, true);
        int childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(getMeasuredHeight(), layoutManager.getHeightMode(), 0, layoutParams.height, true);
        if (shouldMeasure(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        if (partnerRecyclerView == null || !partnerRecyclerView.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        eod eodVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredHeight = childAt.getMeasuredHeight();
            measureChild(childAt);
            if (measuredHeight != childAt.getMeasuredHeight()) {
                z = true;
            }
        }
        if (z && (eodVar = this.heightChangeListener) != null) {
            ((XSectionDecoration) eodVar).o();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        PartnerRecyclerView partnerRecyclerView = this.recyclerView;
        if (partnerRecyclerView == null || !partnerRecyclerView.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void refreshSectionBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88500cdf", new Object[]{this});
        } else if (this.backgroundSetter != null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt.getTranslationY() <= 0.1f) {
                    this.backgroundSetter.g(childAt, true);
                } else {
                    this.backgroundSetter.g(childAt, false);
                }
            }
        }
    }

    public void sectionAttached(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1ed954", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof AbsMuiseViewHolder) {
            AbsMuiseViewHolder absMuiseViewHolder = (AbsMuiseViewHolder) viewHolder;
            absMuiseViewHolder.r0();
            absMuiseViewHolder.V(null);
        }
    }

    public void sectionDetached(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7569a2", new Object[]{this, viewHolder});
        } else if (viewHolder instanceof AbsMuiseViewHolder) {
            AbsMuiseViewHolder absMuiseViewHolder = (AbsMuiseViewHolder) viewHolder;
            absMuiseViewHolder.s0();
            absMuiseViewHolder.g(null);
        }
    }

    public void sectionTurnSticky(RecyclerView.ViewHolder viewHolder) {
        BaseCellBean baseCellBean;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b569fcb6", new Object[]{this, viewHolder});
        } else if (this.sectionChangeListener != null && this.observeSectionChange) {
            if (viewHolder instanceof fod) {
                fod fodVar = this.lastStickyHolder;
                if (!(fodVar == null || fodVar == viewHolder)) {
                    fodVar.a(false);
                }
                fod fodVar2 = (fod) viewHolder;
                fodVar2.a(true);
                this.lastStickyHolder = fodVar2;
            }
            if (viewHolder instanceof WidgetViewHolder) {
                WidgetViewHolder widgetViewHolder = (WidgetViewHolder) viewHolder;
                acx acxVar = (acx) widgetViewHolder.l0();
                if (widgetViewHolder.getData() != null && this.lastStickySectionIndex != (i = (baseCellBean = (BaseCellBean) widgetViewHolder.getData()).sectionPos)) {
                    o02 e = acxVar.e();
                    if (e instanceof XslDataSource) {
                        i2 = ((XslDataSource) e).getCurrentTabIndex();
                    } else if (e instanceof com.taobao.android.meta.data.a) {
                        i2 = ((com.taobao.android.meta.data.a) e).getIndex();
                    }
                    this.lastStickySectionIndex = i;
                    this.sectionChangeListener.D(i2, i, baseCellBean.id);
                }
            }
        }
    }

    public void setBackgroundSetter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52cc582", new Object[]{this, aVar});
        } else {
            this.backgroundSetter = aVar;
        }
    }

    public void setBgStyle(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20cd37df", new Object[]{this, jSONObject});
        }
    }

    public void setCellGap(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876dbf4a", new Object[]{this, new Integer(i)});
        }
    }

    public void setHeightChangeListener(eod eodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("316ad00", new Object[]{this, eodVar});
        } else {
            this.heightChangeListener = eodVar;
        }
    }

    public void setHeightUpdateListener(eod eodVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e19f47", new Object[]{this, eodVar});
        }
    }

    public void setItemBackgroundProvider(t7p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3174fe7", new Object[]{this, aVar});
        } else {
            this.sectionDecoration.q(aVar);
        }
    }

    public void setObserveStickySectionChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e140079b", new Object[]{this, new Boolean(z)});
        } else {
            this.observeSectionChange = z;
        }
    }

    public void setOverlayHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85910427", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDecoration.r(i);
        }
    }

    public void setSectionChangeListener(u7p u7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7f36b5f", new Object[]{this, u7pVar});
        } else {
            this.sectionChangeListener = u7pVar;
        }
    }

    public void setSectionStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc407cbd", new Object[]{this, new Integer(i)});
        } else {
            this.sectionDecoration.s(i);
        }
    }

    public void setStickyContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfc1455", new Object[]{this, view});
        } else {
            this.sectionDecoration.t(view);
        }
    }
}
