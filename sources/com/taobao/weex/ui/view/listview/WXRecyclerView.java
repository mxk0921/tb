package com.taobao.weex.ui.view.listview;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.ui.view.gesture.WXGesture;
import com.taobao.weex.ui.view.gesture.WXGestureObservable;
import com.taobao.weex.ui.view.listview.ExtendedLinearLayoutManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXRecyclerView extends RecyclerView implements WXGestureObservable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_GRID_LAYOUT = 2;
    public static final int TYPE_LINEAR_LAYOUT = 1;
    public static final int TYPE_STAGGERED_GRID_LAYOUT = 3;
    private WXGesture mGesture;
    private boolean scrollable = true;
    private boolean hasTouch = false;

    static {
        t2o.a(985661760);
        t2o.a(985661751);
    }

    public WXRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WXRecyclerView wXRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/ui/view/listview/WXRecyclerView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.hasTouch = true;
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

    public void initView(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84deb2cc", new Object[]{this, context, new Integer(i), new Integer(i2)});
        } else {
            initView(context, i, 1, 32.0f, i2);
        }
    }

    public boolean isScrollable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c7d2e7c", new Object[]{this})).booleanValue();
        }
        return this.scrollable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.taobao.weex.ui.view.gesture.WXGestureObservable
    public void registerGestureListener(WXGesture wXGesture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f22228", new Object[]{this, wXGesture});
        } else {
            this.mGesture = wXGesture;
        }
    }

    public void scrollTo(boolean z, int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21513e7e", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!z) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, -i2);
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i, -i2);
            }
        } else {
            smoothScrollToPosition(i);
            if (i2 != 0) {
                setOnSmoothScrollEndListener(new ExtendedLinearLayoutManager.OnSmoothScrollEndListener() { // from class: com.taobao.weex.ui.view.listview.WXRecyclerView.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.ui.view.listview.ExtendedLinearLayoutManager.OnSmoothScrollEndListener
                    public void onStop() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b3dde88", new Object[]{this});
                        } else {
                            WXRecyclerView.this.post(WXThread.secure(new Runnable() { // from class: com.taobao.weex.ui.view.listview.WXRecyclerView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    AnonymousClass1 r2 = AnonymousClass1.this;
                                    if (i3 == 1) {
                                        WXRecyclerView.this.smoothScrollBy(0, i2);
                                    } else {
                                        WXRecyclerView.this.smoothScrollBy(i2, 0);
                                    }
                                }
                            }));
                        }
                    }
                });
            }
        }
    }

    public void setOnSmoothScrollEndListener(final ExtendedLinearLayoutManager.OnSmoothScrollEndListener onSmoothScrollEndListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3aa875", new Object[]{this, onSmoothScrollEndListener});
        } else {
            addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.weex.ui.view.listview.WXRecyclerView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/view/listview/WXRecyclerView$2");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                    } else if (i == 0) {
                        recyclerView.removeOnScrollListener(this);
                        ExtendedLinearLayoutManager.OnSmoothScrollEndListener onSmoothScrollEndListener2 = onSmoothScrollEndListener;
                        if (onSmoothScrollEndListener2 != null) {
                            onSmoothScrollEndListener2.onStop();
                        }
                    }
                }
            });
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    public void initView(Context context, int i, int i2, float f, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80a330f", new Object[]{this, context, new Integer(i), new Integer(i2), new Float(f), new Integer(i3)});
        } else if (i == 2) {
            setLayoutManager(new GridLayoutManager(context, i2, i3, false));
        } else if (i == 3) {
            setLayoutManager(new ExtendedStaggeredGridLayoutManager(i2, i3));
        } else if (i == 1) {
            setLayoutManager(new ExtendedLinearLayoutManager(context, i3, false));
        }
    }
}
