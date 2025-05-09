package com.taobao.mytaobao.ultron.navtiveview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import tb.cpt;
import tb.ih4;
import tb.n14;
import tb.pb6;
import tb.qh4;
import tb.sgj;
import tb.t2o;
import tb.tot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserHeaderBgLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int headerItemHeight;
    private int mBlurHeight;
    private int mParentScrollY;
    private int mRecycleViewScrollY;
    private final SparseIntArray mRecyclerItemHeight;
    private RecyclerView mRecyclerView;
    public RecyclerView.OnScrollListener mScrollListener;
    private int mScrollY;
    private ThemeFrameLayout mThemeView;
    private int mantleBlurHeight;

    static {
        t2o.a(745538156);
    }

    public UserHeaderBgLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$000(UserHeaderBgLayout userHeaderBgLayout, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f1e0d0", new Object[]{userHeaderBgLayout, recyclerView});
        } else {
            userHeaderBgLayout.onScroll(recyclerView);
        }
    }

    private int getFirstVisibleItemPosition(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e5a7f6f", new Object[]{this, recyclerView})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        return -1;
    }

    public static /* synthetic */ Object ipc$super(UserHeaderBgLayout userHeaderBgLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/navtiveview/UserHeaderBgLayout");
    }

    private void notifyScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597ca9a6", new Object[]{this, new Integer(i)});
        } else if (i != this.mScrollY) {
            if (i == Integer.MAX_VALUE) {
                i = -getTop();
            }
            this.mScrollY = i;
            ThemeFrameLayout themeFrameLayout = this.mThemeView;
            if (themeFrameLayout != null) {
                themeFrameLayout.setOnScrollY(i);
            }
        }
    }

    private void onScroll(RecyclerView recyclerView) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a957a84", new Object[]{this, recyclerView});
            return;
        }
        int firstVisibleItemPosition = getFirstVisibleItemPosition(recyclerView);
        View childAt2 = recyclerView.getChildAt(0);
        if (!(childAt2 == null || childAt2.getHeight() <= 0 || (childAt = recyclerView.getLayoutManager().getChildAt(0)) == null)) {
            int i = -childAt.getTop();
            this.mRecyclerItemHeight.put(firstVisibleItemPosition, childAt.getHeight());
            for (int i2 = 0; i2 < firstVisibleItemPosition; i2++) {
                i += this.mRecyclerItemHeight.get(i2);
            }
            this.mRecycleViewScrollY = i;
            notifyScroll(i + this.mParentScrollY);
        }
    }

    public void considerLazyInitThemeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbc4d18", new Object[]{this});
        } else if (this.mThemeView == null) {
            initThemeView(getContext());
        }
    }

    public void processOnScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d29721", new Object[]{this, new Integer(i)});
            return;
        }
        notifyScroll(this.mRecycleViewScrollY + i);
        this.mParentScrollY = i;
    }

    public void setParentListView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b866d181", new Object[]{this, recyclerView});
            return;
        }
        this.mRecyclerView = recyclerView;
        recyclerView.addOnScrollListener(this.mScrollListener);
    }

    public void updateThemeHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a75c43f5", new Object[]{this, new Integer(i)});
        } else if (this.mThemeView != null) {
            int r = ((pb6.r(getContext()) - this.mBlurHeight) - i) + this.mantleBlurHeight;
            if (TBDeviceUtils.P(getContext())) {
                r -= pb6.f(getContext(), 60.0f);
            }
            this.mThemeView.updateCoverHeight(r);
        }
    }

    public UserHeaderBgLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void initThemeView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282d03", new Object[]{this, context});
            return;
        }
        this.mantleBlurHeight = pb6.f(context, qh4.c("mtbMantleBlurHeight", 80));
        this.headerItemHeight = sgj.a(ih4.d("mtbSkinHeightV2", 300));
        this.mBlurHeight = sgj.a(30);
        tot totVar = new tot("mytaobao", pb6.r(context));
        totVar.d = this.headerItemHeight;
        totVar.h = ((pb6.r(context) - this.headerItemHeight) - this.mBlurHeight) + this.mantleBlurHeight;
        totVar.g = n14.c("#f2f2f2");
        totVar.f = true;
        totVar.j = true;
        totVar.k = this.mBlurHeight;
        totVar.i = this.mantleBlurHeight;
        ThemeFrameLayout b = cpt.c().b(context, totVar);
        this.mThemeView = b;
        addView(b, -1, -1);
    }

    public UserHeaderBgLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mScrollY = 0;
        this.mParentScrollY = 0;
        this.mRecycleViewScrollY = 0;
        this.mBlurHeight = 0;
        this.mRecyclerItemHeight = new SparseIntArray();
        this.mScrollListener = new RecyclerView.OnScrollListener() { // from class: com.taobao.mytaobao.ultron.navtiveview.UserHeaderBgLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/navtiveview/UserHeaderBgLayout$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                } else {
                    UserHeaderBgLayout.access$000(UserHeaderBgLayout.this, recyclerView);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                } else {
                    UserHeaderBgLayout.access$000(UserHeaderBgLayout.this, recyclerView);
                }
            }
        };
    }
}
