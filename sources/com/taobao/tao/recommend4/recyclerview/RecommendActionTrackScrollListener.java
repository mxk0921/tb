package com.taobao.tao.recommend4.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cqv;
import tb.gh0;
import tb.t2o;
import tb.z4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class RecommendActionTrackScrollListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12699a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public boolean e = false;
    public final z4a f;

    static {
        t2o.a(729810043);
    }

    public RecommendActionTrackScrollListener(z4a z4aVar) {
        this.f = z4aVar;
    }

    public static /* synthetic */ Object ipc$super(RecommendActionTrackScrollListener recommendActionTrackScrollListener, String str, Object... objArr) {
        if (str.hashCode() == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend4/recyclerview/RecommendActionTrackScrollListener");
    }

    public void b(RecyclerView recyclerView) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4a77a9", new Object[]{this, recyclerView});
        } else if (this.e && (i = this.b) != -1 && (i2 = this.f12699a) != -1) {
            if (i2 != 1 || i != 2) {
                if (i2 != 0 || i != 1) {
                    System.currentTimeMillis();
                    cqv.G(p(), o(), recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset(), new String[0]);
                    gh0.j().e(o(), recyclerView);
                    this.c = 0;
                    this.d = 0;
                    this.e = false;
                }
            }
        }
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this});
        }
        try {
            return this.f.f32522a;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        this.f12699a = this.b;
        this.b = recyclerView.getScrollState();
        if (recyclerView.getScrollState() == 1) {
            if (this.e) {
                b(recyclerView);
            }
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            System.currentTimeMillis();
            cqv.K(p(), o(), computeHorizontalScrollOffset, computeVerticalScrollOffset, new String[0]);
            this.e = true;
            super.onScrollStateChanged(recyclerView, i);
            return;
        }
        if (!(this.c == 0 && this.d == 0)) {
            b(recyclerView);
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i + this.c;
        this.d = i2 + this.d;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        try {
            return this.f.c;
        } catch (Throwable unused) {
            return "";
        }
    }
}
