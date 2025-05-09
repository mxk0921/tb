package com.taobao.android.shop.features.category;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.util.List;
import tb.lf3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StickHeadersRecylerview extends TRecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = StickHeadersRecylerview.class.getSimpleName();
    public GridLayoutManager gridLayoutManager;
    public CategoryAdapter mAdapter;
    public List<lf3> mCatInfos;
    private boolean mInitFlag = false;
    private View mSuspendView;
    private int mSuspendViewHeight;
    private boolean mSuspendViewVisible;
    private int mSuspendViewWidth;
    public float x;
    public float y;

    static {
        t2o.a(764411983);
        t2o.a(764411982);
    }

    public StickHeadersRecylerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ Object ipc$super(StickHeadersRecylerview stickHeadersRecylerview, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1480138640:
                super.setLayoutManager((RecyclerView.LayoutManager) objArr[0]);
                return null;
            case 1978689528:
                super.setAdapter((RecyclerView.Adapter) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/category/StickHeadersRecylerview");
        }
    }

    public void configurePinnedHeader(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e166cd03", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (this.mCatInfos.get(i).d != 1) {
            if (this.mCatInfos.get(i).d == 2 || this.mCatInfos.get(i).d == 4) {
                i--;
                while (this.mCatInfos.get(i).d != 1) {
                    i--;
                }
            } else {
                i = -1;
            }
        }
        lf3 lf3Var = this.mCatInfos.get(i);
        ((TextView) view.findViewById(R.id.shop_category_group_item1_title)).setText(lf3Var.b);
        TextView textView = (TextView) view.findViewById(R.id.shop_category_group_item1_all);
        ImageView imageView = (ImageView) view.findViewById(R.id.shop_category_group_item1_next_img);
        view.findViewById(R.id.shop_category_group_item1_divider).setVisibility(8);
        if (lf3Var.d == 0) {
            textView.setVisibility(8);
            imageView.setVisibility(0);
            return;
        }
        textView.setVisibility(0);
        imageView.setVisibility(8);
    }

    public void configureSuspendView(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20134201", new Object[]{this, new Integer(i)});
        } else if (this.mSuspendView != null) {
            if (!this.mInitFlag) {
                this.mInitFlag = true;
            }
            int pinnedHeaderState = getPinnedHeaderState(i);
            if (pinnedHeaderState == 0) {
                this.mSuspendViewVisible = false;
            } else if (pinnedHeaderState == 1) {
                configurePinnedHeader(this.mSuspendView, i);
                this.mSuspendView.layout(0, 0, this.mSuspendViewWidth, this.mSuspendViewHeight);
                this.mSuspendViewVisible = true;
            } else if (pinnedHeaderState == 2) {
                int bottom = getChildAt(0).getBottom();
                int height = this.mSuspendView.getHeight();
                if (bottom < height) {
                    i2 = bottom - height;
                } else {
                    i2 = 0;
                }
                configurePinnedHeader(this.mSuspendView, i);
                if (this.mSuspendView.getTop() != i2) {
                    this.mSuspendView.layout(0, i2, this.mSuspendViewWidth, this.mSuspendViewHeight + i2);
                }
                this.mSuspendViewVisible = true;
            }
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        super.dispatchDraw(canvas);
        if (this.mSuspendViewVisible && (view = this.mSuspendView) != null) {
            drawChild(canvas, view, getDrawingTime());
        }
    }

    public int getPinnedHeaderState(int i) {
        List<lf3> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7debeb9", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i <= 0 || (list = this.mCatInfos) == null) {
            return 0;
        }
        try {
            int i2 = list.get(i).d;
            if (i2 != 1) {
                if (i2 != 2) {
                    return 0;
                }
                if (this.mCatInfos.get(i).e) {
                    return 2;
                }
                if (!this.mCatInfos.get(i).e) {
                    if (this.mCatInfos.get(i + 2).d != 2) {
                        return 2;
                    }
                }
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void notifyDataChanged(List<lf3> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8325999", new Object[]{this, list});
        } else {
            this.mCatInfos = list;
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View view = this.mSuspendView;
        if (view != null) {
            view.layout(0, 0, this.mSuspendViewWidth, this.mSuspendViewHeight);
            configureSuspendView(this.gridLayoutManager.findFirstVisibleItemPosition());
        }
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        View view = this.mSuspendView;
        if (view != null) {
            measureChild(view, i, i2);
            this.mSuspendViewWidth = this.mSuspendView.getMeasuredWidth();
            this.mSuspendViewHeight = this.mSuspendView.getMeasuredHeight();
        }
    }

    public void setAdapter(CategoryAdapter categoryAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1d2161", new Object[]{this, categoryAdapter});
            return;
        }
        super.setAdapter((RecyclerView.Adapter) categoryAdapter);
        this.mAdapter = categoryAdapter;
    }

    @Override // com.taobao.uikit.feature.view.TRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58391f90", new Object[]{this, layoutManager});
            return;
        }
        super.setLayoutManager(layoutManager);
        this.gridLayoutManager = (GridLayoutManager) layoutManager;
    }

    public void setPinnedHeaderView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c248a1f", new Object[]{this, view});
            return;
        }
        this.mSuspendView = view;
        if (view != null) {
            setFadingEdgeLength(0);
        }
        requestLayout();
    }

    public StickHeadersRecylerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickHeadersRecylerview(Context context) {
        super(context);
    }
}
