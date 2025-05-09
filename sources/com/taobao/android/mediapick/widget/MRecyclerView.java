package com.taobao.android.mediapick.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.mediapick.MediaPickClient;
import tb.t2o;
import tb.xnc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MediaPickClient mPickClient;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class MGridLayoutManager extends GridLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MediaPickClient f8903a;
        public boolean b = true;

        static {
            t2o.a(519045174);
        }

        public MGridLayoutManager(Context context, int i, MediaPickClient mediaPickClient) {
            super(context, i);
            this.f8903a = mediaPickClient;
        }

        public static /* synthetic */ Object ipc$super(MGridLayoutManager mGridLayoutManager, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -574012007) {
                return new Boolean(super.canScrollHorizontally());
            }
            if (hashCode == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            if (hashCode == 1027840325) {
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/mediapick/widget/MRecyclerView$MGridLayoutManager");
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            if (!this.b || !super.canScrollHorizontally()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
            }
            if (!this.b || !super.canScrollVertically()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                return;
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                xnc x = this.f8903a.x();
                x.e(MediaPickClient.TAG, "MGridLayoutManager.onLayoutChildren exception. e:" + Log.getStackTraceString(e));
            }
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class MLinearLayoutManager extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final MediaPickClient f8904a;
        public boolean b = true;

        static {
            t2o.a(519045175);
        }

        public MLinearLayoutManager(Context context, int i, boolean z, MediaPickClient mediaPickClient) {
            super(context, i, z);
            this.f8904a = mediaPickClient;
        }

        public static /* synthetic */ Object ipc$super(MLinearLayoutManager mLinearLayoutManager, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -574012007) {
                return new Boolean(super.canScrollHorizontally());
            }
            if (hashCode == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            if (hashCode == 1027840325) {
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/mediapick/widget/MRecyclerView$MLinearLayoutManager");
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            if (!this.b || !super.canScrollHorizontally()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue();
            }
            if (!this.b || !super.canScrollVertically()) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
                return;
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                xnc x = this.f8904a.x();
                x.e(MediaPickClient.TAG, "MLinearLayoutManager.onLayoutChildren exception. e:" + Log.getStackTraceString(e));
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean supportsPredictiveItemAnimations() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c4fda0d0", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }
    }

    static {
        t2o.a(519045173);
    }

    public MRecyclerView(Context context, MediaPickClient mediaPickClient) {
        super(context);
        this.mPickClient = mediaPickClient;
    }

    public static /* synthetic */ Object ipc$super(MRecyclerView mRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1696676907:
                super.scrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/mediapick/widget/MRecyclerView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            xnc x = this.mPickClient.x();
            x.e(MediaPickClient.TAG, "MRecyclerView.dispatchDraw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            super.draw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            xnc x = this.mPickClient.x();
            x.e(MediaPickClient.TAG, "MRecyclerView.draw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            th.printStackTrace();
            xnc x = this.mPickClient.x();
            x.e(MediaPickClient.TAG, "MRecyclerView.onDraw exception. e:" + Log.getStackTraceString(th));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollBy(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65213c2b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            super.scrollBy(i, i2);
        } catch (Throwable th) {
            th.printStackTrace();
            xnc x = this.mPickClient.x();
            x.e(MediaPickClient.TAG, "MRecyclerView.scrollBy exception. e:" + Log.getStackTraceString(th));
        }
    }
}
