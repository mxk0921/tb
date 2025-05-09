package com.taobao.android.fluid.business.videocollection.normalcollection.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import tb.jz3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SpeedAdustableRecylerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PAN_DISTANCE = 20;
    public static final double VELOCITY_SPEED = 0.7d;
    private LockableRecycerView.a onDragListener;
    private float startY = -1.0f;
    private float startX = -1.0f;
    private int distanceY = 20;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class AbstractEndlessScrollListener extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int PRELOAD_THRES = jz3.a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f7746a = false;

        static {
            t2o.a(468713746);
        }

        public static /* synthetic */ Object ipc$super(AbstractEndlessScrollListener abstractEndlessScrollListener, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/videocollection/normalcollection/view/SpeedAdustableRecylerView$AbstractEndlessScrollListener");
            }
        }

        public abstract void b();

        public abstract void o();

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i == 0) {
                int itemCount = (linearLayoutManager.getItemCount() - 1) - linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int i2 = PRELOAD_THRES;
                if (itemCount <= i2 && this.f7746a) {
                    b();
                }
                if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() <= i2 && !this.f7746a) {
                    o();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (i2 <= 0) {
                z = false;
            }
            this.f7746a = z;
        }
    }

    static {
        t2o.a(468713745);
    }

    public SpeedAdustableRecylerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(SpeedAdustableRecylerView speedAdustableRecylerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 1852077959) {
            return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/videocollection/normalcollection/view/SpeedAdustableRecylerView");
    }

    public void addOnDragListener(LockableRecycerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5dc7ac", new Object[]{this, aVar});
        } else {
            this.onDragListener = aVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return super.fling((int) (i * 0.7d), (int) (i2 * 0.7d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        LockableRecycerView.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
        } else if (actionMasked == 1) {
            if (Float.compare(this.startY, -1.0f) == 0) {
                this.startY = motionEvent.getY();
            }
            if (Float.compare(this.startX, -1.0f) == 0) {
                this.startX = motionEvent.getX();
            }
            if (this.startY - motionEvent.getY() > this.distanceY) {
                LockableRecycerView.a aVar2 = this.onDragListener;
                if (aVar2 != null) {
                    aVar2.onDragUp();
                }
            } else if (this.startY - motionEvent.getY() < (-this.distanceY) && (aVar = this.onDragListener) != null) {
                aVar.j();
            }
            this.startY = -1.0f;
        } else if (actionMasked != 2) {
            this.startY = -1.0f;
        } else {
            if (Float.compare(this.startY, -1.0f) == 0) {
                this.startY = motionEvent.getY();
            }
            if (Float.compare(this.startX, -1.0f) == 0) {
                this.startX = motionEvent.getX();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public SpeedAdustableRecylerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedAdustableRecylerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
