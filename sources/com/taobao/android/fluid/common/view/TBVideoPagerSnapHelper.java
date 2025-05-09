package com.taobao.android.fluid.common.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBVideoPagerSnapHelper extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f7750a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Handler f = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/common/view/TBVideoPagerSnapHelper$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                TBVideoPagerSnapHelper.this.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i);

        void b(boolean z);

        void c();
    }

    static {
        t2o.a(468713774);
    }

    public static /* synthetic */ Object ipc$super(TBVideoPagerSnapHelper tBVideoPagerSnapHelper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1760828615) {
            return super.calculateDistanceToFinalSnap((RecyclerView.LayoutManager) objArr[0], (View) objArr[1]);
        }
        if (hashCode == -1160778905) {
            return new Integer(super.findTargetSnapPosition((RecyclerView.LayoutManager) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        }
        if (hashCode == -259228053) {
            return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/common/view/TBVideoPagerSnapHelper");
    }

    public final boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c05097ea", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        Object tag = view.getTag(R.id.fluid_sdk_footer_loading);
        if (!(tag instanceof Boolean) || !((Boolean) tag).booleanValue()) {
            return false;
        }
        return true;
    }

    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be0f2f6", new Object[]{this, bVar});
        } else {
            this.f7750a = bVar;
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("970be339", new Object[]{this, layoutManager, view});
        }
        return super.calculateDistanceToFinalSnap(layoutManager, view);
    }

    public final void d(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad31f918", new Object[]{this, new Boolean(z), str});
        } else if (this.c != z) {
            this.c = z;
            b bVar = this.f7750a;
            if (bVar != null) {
                bVar.b(z);
            }
        }
    }

    public final void e(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7f17c3", new Object[]{this, new Integer(i), str});
            return;
        }
        b bVar = this.f7750a;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
        }
        View findSnapView = super.findSnapView(layoutManager);
        if (findSnapView != null) {
            int position = layoutManager.getPosition(findSnapView);
            int itemCount = layoutManager.getItemCount();
            ir9.b("TBVideoPagerSnapHelper", "findSnapView position=" + position + " childCount=" + itemCount + " snapView=" + findSnapView);
            if (position == itemCount - 2) {
                View childAt = layoutManager.getChildAt(layoutManager.getChildCount() - 1);
                boolean a2 = a(childAt);
                ir9.b("TBVideoPagerSnapHelper", "findSnapView isFooter=" + a2);
                if (a2) {
                    return childAt;
                }
            }
            if (position != -1) {
                e(position, "findSnapView");
                d(false, "findSnapView");
                this.b = false;
                this.d = false;
                this.e = false;
            }
        }
        return findSnapView;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.d = false;
        this.e = false;
        this.b = false;
        d(false, DMComponent.RESET);
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bacfeb67", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
        }
        int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
        ir9.b("TBVideoPagerSnapHelper", "findTargetSnapPosition position=" + findTargetSnapPosition + " velocityY=" + i2);
        if (findTargetSnapPosition != -1) {
            e(findTargetSnapPosition, "findTargetSnapPosition");
            if (i2 < 0 && findTargetSnapPosition == 0) {
                if (this.d && this.b) {
                    d(false, "上边界");
                    this.f7750a.c();
                }
                this.b = true;
                this.d = true;
                return findTargetSnapPosition;
            } else if (i2 <= 0 || findTargetSnapPosition != layoutManager.getItemCount()) {
                if (this.b) {
                    d(true, "快滑");
                }
                this.b = true;
                this.d = false;
                this.e = false;
                this.f.removeMessages(0);
                this.f.sendEmptyMessageDelayed(0, 1000L);
            } else {
                if (this.e && this.b) {
                    d(false, "下边界");
                    this.f7750a.c();
                }
                this.b = true;
                this.e = true;
                return findTargetSnapPosition;
            }
        }
        return findTargetSnapPosition;
    }
}
