package com.taobao.weex.ui.view.refresh.wrapper;

import android.content.Context;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.ui.component.list.IWXCell;
import com.taobao.weex.ui.component.list.ListComponentView;
import com.taobao.weex.ui.component.list.StickyHeaderHelper;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.ui.view.listview.WXRecyclerView;
import com.taobao.weex.ui.view.listview.adapter.RecyclerViewBaseAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class BounceRecyclerView extends BaseBounceView<WXRecyclerView> implements ListComponentView, WXGestureObservable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COLUMN_COUNT = 1;
    public static final int DEFAULT_COLUMN_GAP = 1;
    private RecyclerViewBaseAdapter adapter;
    private int mColumnCount;
    private float mColumnGap;
    private WXGesture mGesture;
    private int mLayoutType;
    private StickyHeaderHelper mStickyHeaderHelper;

    static {
        t2o.a(985661791);
        t2o.a(985661714);
        t2o.a(985661751);
    }

    public BounceRecyclerView(Context context, int i, int i2, float f, int i3) {
        super(context, i3);
        this.adapter = null;
        this.mLayoutType = i;
        this.mColumnCount = i2;
        this.mColumnGap = f;
        init(context);
        this.mStickyHeaderHelper = new StickyHeaderHelper(this);
    }

    public static /* synthetic */ Object ipc$super(BounceRecyclerView bounceRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 978072238) {
            return super.getInnerView();
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/ui/view/refresh/wrapper/BounceRecyclerView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        WXGesture wXGesture = this.mGesture;
        if (wXGesture != null) {
            return dispatchTouchEvent | wXGesture.onTouch(this, motionEvent);
        }
        return dispatchTouchEvent;
    }

    @Override // com.taobao.weex.ui.view.gesture.WXGestureObservable
    public WXGesture getGestureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXGesture) ipChange.ipc$dispatch("6443f4e7", new Object[]{this});
        }
        return this.mGesture;
    }

    @Override // com.taobao.weex.ui.view.refresh.wrapper.BaseBounceView, com.taobao.weex.ui.component.list.ListComponentView
    public /* bridge */ /* synthetic */ WXRecyclerView getInnerView() {
        return (WXRecyclerView) super.getInnerView();
    }

    @Override // com.taobao.weex.ui.component.list.ListComponentView
    public RecyclerViewBaseAdapter getRecyclerViewBaseAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewBaseAdapter) ipChange.ipc$dispatch("82076fa2", new Object[]{this});
        }
        return this.adapter;
    }

    public StickyHeaderHelper getStickyHeaderHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StickyHeaderHelper) ipChange.ipc$dispatch("b8d92761", new Object[]{this});
        }
        return this.mStickyHeaderHelper;
    }

    @Override // com.taobao.weex.ui.component.list.ListComponentView
    public void notifyStickyRemove(IWXCell iWXCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30fbe0f7", new Object[]{this, iWXCell});
        } else {
            this.mStickyHeaderHelper.notifyStickyRemove(iWXCell);
        }
    }

    @Override // com.taobao.weex.ui.component.list.ListComponentView
    public void notifyStickyShow(IWXCell iWXCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54d0cde", new Object[]{this, iWXCell});
        } else {
            this.mStickyHeaderHelper.notifyStickyShow(iWXCell);
        }
    }

    @Override // com.taobao.weex.ui.view.refresh.wrapper.BaseBounceView
    public void onLoadmoreComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3f7e9a", new Object[]{this});
            return;
        }
        RecyclerViewBaseAdapter recyclerViewBaseAdapter = this.adapter;
        if (recyclerViewBaseAdapter != null) {
            recyclerViewBaseAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.weex.ui.view.refresh.wrapper.BaseBounceView
    public void onRefreshingComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f10ec6", new Object[]{this});
            return;
        }
        RecyclerViewBaseAdapter recyclerViewBaseAdapter = this.adapter;
        if (recyclerViewBaseAdapter != null) {
            recyclerViewBaseAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.weex.ui.view.gesture.WXGestureObservable
    public void registerGestureListener(WXGesture wXGesture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22228", new Object[]{this, wXGesture});
            return;
        }
        this.mGesture = wXGesture;
        getInnerView().registerGestureListener(wXGesture);
    }

    @Override // com.taobao.weex.ui.component.list.ListComponentView
    public void setRecyclerViewBaseAdapter(RecyclerViewBaseAdapter recyclerViewBaseAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23ef68b6", new Object[]{this, recyclerViewBaseAdapter});
            return;
        }
        this.adapter = recyclerViewBaseAdapter;
        if (getInnerView() != null) {
            getInnerView().setAdapter(recyclerViewBaseAdapter);
        }
    }

    @Override // com.taobao.weex.ui.component.list.ListComponentView
    public void updateStickyView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874adbe5", new Object[]{this, new Integer(i)});
        } else {
            this.mStickyHeaderHelper.updateStickyView(i);
        }
    }

    @Override // com.taobao.weex.ui.view.refresh.wrapper.BaseBounceView
    public WXRecyclerView setInnerView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRecyclerView) ipChange.ipc$dispatch("27b81d2", new Object[]{this, context});
        }
        WXRecyclerView wXRecyclerView = new WXRecyclerView(context);
        wXRecyclerView.initView(context, this.mLayoutType, this.mColumnCount, this.mColumnGap, getOrientation());
        return wXRecyclerView;
    }

    public BounceRecyclerView(Context context, int i, int i2) {
        this(context, i, 1, 1.0f, i2);
    }
}
