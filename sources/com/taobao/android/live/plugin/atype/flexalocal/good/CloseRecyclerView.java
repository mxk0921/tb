package com.taobao.android.live.plugin.atype.flexalocal.good;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.adapter.GoodsLiveStateListAdapter2;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.ArrayList;
import java.util.List;
import tb.hea;
import tb.hha;
import tb.ijr;
import tb.pfa;
import tb.t2o;
import tb.x4h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CloseRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int BOTTOM = 3;
    private static final int MIDDLE = 2;
    private static final String TAG = "CloseRecyclerView";
    private static final int TOP = 1;
    private a callBack;
    public long ensureFingerSlideStartTime;
    private float mCurPosY;
    private float mPosY;
    private int status = 1;
    private boolean isStop = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(boolean z);

        void b(int i, int i2, int i3);

        void c(boolean z, boolean z2);

        void d();
    }

    static {
        t2o.a(295698842);
    }

    public CloseRecyclerView(Context context) {
        super(context);
    }

    private void calculateBackTopButtonIfNeed(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360b9600", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (i >= ijr.a()) {
            a aVar = this.callBack;
            if (aVar != null) {
                aVar.c(true, z);
            }
        } else {
            a aVar2 = this.callBack;
            if (aVar2 != null) {
                aVar2.c(false, z);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(CloseRecyclerView closeRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 1893018130:
                super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/CloseRecyclerView");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        try {
            super.addView(view, i, layoutParams);
        } catch (Exception e) {
            hha.b(TAG, e.getMessage());
        }
    }

    public int getCurrentPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78622a0b", new Object[]{this})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager == null) {
            return -1;
        }
        return linearLayoutManager.findFirstVisibleItemPosition();
    }

    public List<ItemIdentifier> getCurrentShowItemList(hea heaVar) {
        List<x4h> N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("30443015", new Object[]{this, heaVar});
        }
        int currentPos = getCurrentPos();
        int lastShowPos = getLastShowPos();
        RecyclerView.Adapter adapter = getAdapter();
        ArrayList arrayList = new ArrayList();
        if (currentPos >= 0 && lastShowPos >= 0 && (adapter instanceof GoodsLiveStateListAdapter2) && (N = ((GoodsLiveStateListAdapter2) adapter).N()) != null && N.size() > currentPos && N.size() > lastShowPos) {
            for (int i = currentPos; i < N.size() && i <= lastShowPos; i++) {
                x4h x4hVar = N.get(i);
                if (x4hVar != null && pfa.E(x4hVar.f31139a)) {
                    arrayList.add(hea.f(heaVar, x4hVar.b, x4hVar.e));
                }
            }
            hha.c(TAG, "getCurrentShowItem | from=" + currentPos + "    to=" + lastShowPos + "  size=" + arrayList.size() + " totalSize=" + N.size());
        }
        return arrayList;
    }

    public int getLastShowPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66715065", new Object[]{this})).intValue();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        if (linearLayoutManager == null) {
            return -1;
        }
        return linearLayoutManager.findLastVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosY = motionEvent.getY();
        } else if (action == 2) {
            this.mCurPosY = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mPosY = motionEvent.getY();
        } else if (action == 1) {
            this.ensureFingerSlideStartTime = System.currentTimeMillis();
            if (Math.abs(this.mCurPosY - this.mPosY) > 500.0f && (aVar = this.callBack) != null) {
                if (this.mCurPosY - this.mPosY > 0.0f) {
                    if (this.status == 1) {
                        aVar.d();
                    }
                } else if (this.status == 3) {
                    aVar.a(true);
                }
            }
        } else if (action == 2) {
            this.mCurPosY = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCloseViewListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db0ee96", new Object[]{this, aVar});
        } else {
            this.callBack = aVar;
        }
    }

    public CloseRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (this.isStop) {
            if (!canScrollVertically(-1)) {
                this.status = 1;
            } else if (!canScrollVertically(1)) {
                this.status = 3;
            } else {
                this.status = 2;
            }
        }
        this.isStop = true;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int itemCount = getAdapter().getItemCount();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int childCount = getChildCount();
        a aVar = this.callBack;
        if (aVar != null && findLastVisibleItemPosition >= itemCount - 3 && childCount > 0 && i2 > 0) {
            aVar.a(false);
        } else if (aVar != null) {
            aVar.b(findFirstVisibleItemPosition, findLastVisibleItemPosition, i2);
        }
        if (this.status == 3) {
            hha.c(TAG, "onScrolled | to bottom.");
        } else {
            z = false;
        }
        if (Math.abs(i2) > Math.abs(i)) {
            calculateBackTopButtonIfNeed(findLastVisibleItemPosition, i2, z);
        }
    }

    public CloseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
