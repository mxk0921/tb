package com.taobao.android.litecreator.widgets;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LCPagerSnapHelper extends PagerSnapHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f8344a;
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/widgets/LCPagerSnapHelper$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                LCPagerSnapHelper.this.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a(int i);

        void b(boolean z);

        void c();

        void d();
    }

    static {
        t2o.a(511705703);
    }

    public static /* synthetic */ Object ipc$super(LCPagerSnapHelper lCPagerSnapHelper, String str, Object... objArr) {
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/widgets/LCPagerSnapHelper");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.d = false;
        this.e = false;
        this.b = false;
        b bVar = this.f8344a;
        if (bVar != null && this.c) {
            this.c = false;
            bVar.b(false);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6a94b8", new Object[]{this, bVar});
        } else {
            this.f8344a = bVar;
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

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
        }
        View findSnapView = super.findSnapView(layoutManager);
        if (findSnapView != null) {
            int position = layoutManager.getPosition(findSnapView);
            b bVar = this.f8344a;
            if (!(bVar == null || position == -1)) {
                bVar.a(position);
                if (this.c) {
                    this.c = false;
                    this.f8344a.b(false);
                }
                this.b = false;
                this.d = false;
                this.e = false;
            }
        }
        return findSnapView;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bacfeb67", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
        }
        int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
        b bVar = this.f8344a;
        if (!(bVar == null || findTargetSnapPosition == -1)) {
            bVar.d();
            this.f8344a.a(findTargetSnapPosition);
            if (i2 < 0 && findTargetSnapPosition == 0) {
                if (this.d && this.b) {
                    if (this.c) {
                        this.c = false;
                        this.f8344a.b(false);
                    }
                    this.f8344a.c();
                }
                this.b = true;
                this.d = true;
                return findTargetSnapPosition;
            } else if (i2 <= 0 || findTargetSnapPosition != layoutManager.getItemCount()) {
                if (this.b && !this.c) {
                    this.c = true;
                    this.f8344a.b(true);
                }
                this.b = true;
                this.d = false;
                this.e = false;
                this.f.removeMessages(0);
                this.f.sendEmptyMessageDelayed(0, 1000L);
            } else {
                if (this.e && this.b) {
                    if (this.c) {
                        this.c = false;
                        this.f8344a.b(false);
                    }
                    this.f8344a.c();
                }
                this.b = true;
                this.e = true;
                return findTargetSnapPosition;
            }
        }
        return findTargetSnapPosition;
    }
}
