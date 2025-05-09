package com.taobao.search.musie.tab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import java.util.List;
import tb.prs;
import tb.qxd;
import tb.t2o;
import tb.wxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TabContainer extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int itemInset;
    private prs normalStyle;
    private prs selectedStyle;
    private int spacing;
    private qxd tabClickListener;
    private List<wxd> tabList;
    private boolean layoutAverage = false;
    private boolean hasLayout = false;
    private wxd lastSelectedTab = null;
    private int selectedIndex = 0;
    private boolean animated = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TabContainer.this.scrollTabToCenter();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f11596a;

        public b(int i) {
            this.f11596a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (TabContainer.access$000(TabContainer.this) != null) {
                TabContainer.access$000(TabContainer.this).D(this.f11596a);
            }
        }
    }

    static {
        t2o.a(815792776);
    }

    public TabContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ qxd access$000(TabContainer tabContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qxd) ipChange.ipc$dispatch("128d29db", new Object[]{tabContainer});
        }
        return tabContainer.tabClickListener;
    }

    public static /* synthetic */ Object ipc$super(TabContainer tabContainer, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/tab/TabContainer");
    }

    private void refreshIfHasLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38521e73", new Object[]{this});
        } else if (this.hasLayout) {
            requestLayout();
            this.hasLayout = false;
        }
    }

    public void bind(List<wxd> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a136c735", new Object[]{this, list});
            return;
        }
        removeAllViews();
        if (list != null) {
            if (this.selectedIndex >= list.size()) {
                this.selectedIndex = 0;
            }
            this.tabList = list;
            int i = 0;
            for (wxd wxdVar : list) {
                int i2 = i + 1;
                View a2 = wxdVar.a(getContext());
                wxdVar.j(this.normalStyle, this.selectedStyle);
                wxdVar.i(this.animated);
                if (i == this.selectedIndex) {
                    z = true;
                } else {
                    z = false;
                }
                wxdVar.h(z);
                if (i == this.selectedIndex) {
                    this.lastSelectedTab = wxdVar;
                    a2.post(new a());
                }
                int i3 = this.itemInset;
                a2.setPadding(i3, 0, i3, 0);
                addView(a2, new ViewGroup.MarginLayoutParams(-2, -1));
                ViewProxy.setOnClickListener(a2, new b(i));
                i = i2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (getChildCount() != 0) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int paddingLeft = getPaddingLeft();
            int childCount = measuredWidth / getChildCount();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = getChildAt(i5);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (this.layoutAverage) {
                    int i6 = ((childCount - measuredWidth2) / 2) + paddingLeft;
                    childAt.layout(i6, 0, measuredWidth2 + i6, measuredHeight);
                    paddingLeft += childCount;
                } else {
                    int i7 = measuredWidth2 + paddingLeft;
                    childAt.layout(paddingLeft, 0, i7, childAt.getMeasuredHeight());
                    paddingLeft = i7 + this.spacing;
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
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            measureChildWithMargins(childAt, i, 0, i2, 0);
            paddingLeft += childAt.getMeasuredWidth();
        }
        int childCount2 = paddingLeft + ((getChildCount() - 1) * this.spacing);
        int size = View.MeasureSpec.getSize(i);
        if (childCount2 > size) {
            setMeasuredDimension(childCount2, View.MeasureSpec.getSize(i2));
            this.layoutAverage = false;
        } else {
            setMeasuredDimension(size, View.MeasureSpec.getSize(i2));
            this.layoutAverage = true;
        }
        this.hasLayout = true;
    }

    public void scrollTabToCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4684df", new Object[]{this});
            return;
        }
        wxd wxdVar = this.lastSelectedTab;
        if (wxdVar != null) {
            ((TbTabView) getParent()).scrollToTab(wxdVar.b());
        }
    }

    public void setAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f4628", new Object[]{this, new Boolean(z)});
            return;
        }
        this.animated = z;
        List<wxd> list = this.tabList;
        if (list != null) {
            for (wxd wxdVar : list) {
                wxdVar.i(z);
            }
        }
    }

    public void setItemInset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3e58d4", new Object[]{this, new Integer(i)});
        } else if (this.itemInset != i) {
            this.itemInset = i;
            refreshIfHasLayout();
        }
    }

    public void setPadding(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36282d36", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (getPaddingLeft() != i || getPaddingRight() != i2) {
            setPadding(i, 0, i2, 0);
            refreshIfHasLayout();
        }
    }

    public void setSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f095a7b", new Object[]{this, new Integer(i)});
        } else if (this.spacing != i) {
            this.spacing = i;
            refreshIfHasLayout();
        }
    }

    public void setTabClickListener(qxd qxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36c4b97", new Object[]{this, qxdVar});
        } else {
            this.tabClickListener = qxdVar;
        }
    }

    public void setTabSelected(wxd wxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfdce16", new Object[]{this, wxdVar});
            return;
        }
        wxd wxdVar2 = this.lastSelectedTab;
        if (wxdVar2 != null) {
            wxdVar2.h(false);
        }
        wxdVar.h(true);
        this.lastSelectedTab = wxdVar;
    }

    public void setTabStyle(prs prsVar, prs prsVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f78079", new Object[]{this, prsVar, prsVar2});
            return;
        }
        this.normalStyle = prsVar;
        this.selectedStyle = prsVar2;
        List<wxd> list = this.tabList;
        if (list != null) {
            for (wxd wxdVar : list) {
                wxdVar.j(this.normalStyle, this.selectedStyle);
            }
        }
    }

    public void setTabSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88931c8e", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.selectedIndex = i;
            List<wxd> list = this.tabList;
            if (list != null && i < list.size()) {
                setTabSelected(this.tabList.get(i));
                scrollTabToCenter();
            }
        }
    }
}
