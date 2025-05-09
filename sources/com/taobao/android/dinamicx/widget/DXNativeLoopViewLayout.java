package com.taobao.android.dinamicx.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DXNativeLoopViewLayout extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_PAGE_INDEX = -1;
    public static final int LAYER_ORDER_NORMAL = 0;
    public static final int LAYER_ORDER_REVERSE = 1;
    private a mAdapter;
    private int mCurPageIndex;
    private d mCurViewHolder;
    private int mLayerOrder;
    private b mLifecycleListener;
    private d mNextViewHolder;
    private d mPreViewHolder;
    private c mRecyclerViewPool = new c();
    private Rect mTouchDelegateRect = new Rect();
    private final BroadcastReceiver screenOnOffReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXNativeLoopViewLayout$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                DXNativeLoopViewLayout.access$000(DXNativeLoopViewLayout.this);
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                DXNativeLoopViewLayout.access$100(DXNativeLoopViewLayout.this);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class a<VH extends d, Node extends DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public final void a(VH vh, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e61025e", new Object[]{this, vh, new Integer(i)});
            } else {
                e(vh, i);
            }
        }

        public final VH b(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VH) ((d) ipChange.ipc$dispatch("9c11536", new Object[]{this, viewGroup, new Integer(i)}));
            }
            VH f = f(viewGroup, i);
            f.b = i;
            return f;
        }

        public abstract int c();

        public abstract int d(int i);

        public abstract void e(VH vh, int i);

        public abstract VH f(ViewGroup viewGroup, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void a();

        public abstract void b();

        public abstract void c(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<Integer, List<d>> f7373a = new WeakHashMap<>();

        public d a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("33e7bf96", new Object[]{this, new Integer(i)});
            }
            List<d> list = this.f7373a.get(Integer.valueOf(i));
            if (list == null || list.isEmpty()) {
                return null;
            }
            return list.remove(0);
        }

        public void b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d715adc", new Object[]{this, dVar});
                return;
            }
            List<d> list = this.f7373a.get(Integer.valueOf(dVar.b));
            if (list == null) {
                list = new LinkedList<>();
                this.f7373a.put(Integer.valueOf(dVar.b), list);
            }
            if (list.size() < 3) {
                list.add(dVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final View f7374a;
        public int b;

        public d(View view) {
            this.f7374a = view;
        }
    }

    public DXNativeLoopViewLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(DXNativeLoopViewLayout dXNativeLoopViewLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd87514", new Object[]{dXNativeLoopViewLayout});
        } else {
            dXNativeLoopViewLayout.onScreenOff();
        }
    }

    public static /* synthetic */ void access$100(DXNativeLoopViewLayout dXNativeLoopViewLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e807fd33", new Object[]{dXNativeLoopViewLayout});
        } else {
            dXNativeLoopViewLayout.onScreenOn();
        }
    }

    private d getCurPageViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("51242c55", new Object[]{this});
        }
        return getPageViewHolder(this.mCurPageIndex);
    }

    private d getNextPageViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("92dee916", new Object[]{this});
        }
        return getPageViewHolder(this.mCurPageIndex + 1);
    }

    private d getPageViewHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("73ec8bc0", new Object[]{this, new Integer(i)});
        }
        int d2 = this.mAdapter.d(i);
        d a2 = this.mRecyclerViewPool.a(d2);
        if (a2 == null) {
            a2 = this.mAdapter.b(this, d2);
        }
        this.mAdapter.a(a2, i);
        return a2;
    }

    public static /* synthetic */ Object ipc$super(DXNativeLoopViewLayout dXNativeLoopViewLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXNativeLoopViewLayout");
        }
    }

    private void onScreenOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fd8ccb", new Object[]{this});
            return;
        }
        b bVar = this.mLifecycleListener;
        if (bVar != null) {
            bVar.a();
        }
    }

    private void onScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebc1f1", new Object[]{this});
            return;
        }
        b bVar = this.mLifecycleListener;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        removeAllViews();
        d dVar = this.mCurViewHolder;
        if (dVar != null) {
            this.mRecyclerViewPool.b(dVar);
        }
        d dVar2 = this.mNextViewHolder;
        if (dVar2 != null) {
            this.mRecyclerViewPool.b(dVar2);
        }
        d dVar3 = this.mPreViewHolder;
        if (dVar3 != null) {
            this.mRecyclerViewPool.b(dVar3);
        }
        this.mNextViewHolder = null;
        this.mCurViewHolder = null;
        this.mPreViewHolder = null;
        this.mCurPageIndex = -1;
    }

    public void bindData(int i, int i2, a aVar, int i3, int i4) {
        int i5 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360d6374", new Object[]{this, new Integer(i), new Integer(i2), aVar, new Integer(i3), new Integer(i4)});
            return;
        }
        reset();
        this.mTouchDelegateRect.set(0, 0, i, i2);
        this.mAdapter = aVar;
        this.mCurPageIndex = i3;
        if (i4 == 1) {
            i5 = 1;
        }
        this.mLayerOrder = i5;
        if (aVar != null && aVar.c() != 0 && this.mCurPageIndex != -1) {
            this.mCurViewHolder = getCurPageViewHolder();
            if (aVar.c() == 1) {
                addView(this.mCurViewHolder.f7374a);
            } else {
                d nextPageViewHolder = getNextPageViewHolder();
                this.mNextViewHolder = nextPageViewHolder;
                nextPageViewHolder.f7374a.setVisibility(4);
                if (this.mLayerOrder == 0) {
                    addView(this.mCurViewHolder.f7374a);
                    addView(this.mNextViewHolder.f7374a);
                } else {
                    addView(this.mNextViewHolder.f7374a);
                    addView(this.mCurViewHolder.f7374a);
                }
            }
            setTouchDelegate(new TouchDelegate(this.mTouchDelegateRect, this.mCurViewHolder.f7374a));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Context applicationContext = getContext().getApplicationContext();
        try {
            applicationContext.unregisterReceiver(this.screenOnOffReceiver);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            applicationContext.registerReceiver(this.screenOnOffReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        try {
            getContext().getApplicationContext().unregisterReceiver(this.screenOnOffReceiver);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        b bVar = this.mLifecycleListener;
        if (bVar != null) {
            bVar.c(i);
        }
    }

    public void setLifecycleListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65195523", new Object[]{this, bVar});
        } else {
            this.mLifecycleListener = bVar;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public void roll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06c7e84", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null && aVar.c() >= 3 && this.mCurPageIndex != -1) {
            d dVar = this.mPreViewHolder;
            if (dVar != null) {
                removeView(dVar.f7374a);
                this.mRecyclerViewPool.b(this.mPreViewHolder);
                this.mPreViewHolder = null;
            }
            this.mPreViewHolder = this.mCurViewHolder;
            d dVar2 = this.mNextViewHolder;
            this.mCurViewHolder = dVar2;
            dVar2.f7374a.setVisibility(0);
            this.mCurPageIndex++;
            d nextPageViewHolder = getNextPageViewHolder();
            this.mNextViewHolder = nextPageViewHolder;
            nextPageViewHolder.f7374a.setVisibility(4);
            if (this.mLayerOrder == 0) {
                addView(this.mNextViewHolder.f7374a);
            } else {
                addView(this.mNextViewHolder.f7374a, 0);
            }
            setTouchDelegate(new TouchDelegate(this.mTouchDelegateRect, this.mCurViewHolder.f7374a));
        }
    }

    public DXNativeLoopViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXNativeLoopViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
