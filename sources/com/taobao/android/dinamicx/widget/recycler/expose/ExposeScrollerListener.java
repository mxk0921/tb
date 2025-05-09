package com.taobao.android.dinamicx.widget.recycler.expose;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExposeScrollerListener extends RecyclerView.OnScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExposeChildAttachListener f7479a;
    public long b = 0;

    static {
        t2o.a(444597551);
    }

    public ExposeScrollerListener(ExposeChildAttachListener exposeChildAttachListener) {
        this.f7479a = exposeChildAttachListener;
    }

    public static /* synthetic */ Object ipc$super(ExposeScrollerListener exposeScrollerListener, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1177043419) {
            super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
            return null;
        } else if (hashCode == 1361287682) {
            super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/recycler/expose/ExposeScrollerListener");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ExposeChildAttachListener exposeChildAttachListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && (exposeChildAttachListener = this.f7479a) != null) {
            exposeChildAttachListener.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ExposeChildAttachListener exposeChildAttachListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b > 500 && (exposeChildAttachListener = this.f7479a) != null) {
            exposeChildAttachListener.b();
            this.b = currentTimeMillis;
        }
    }
}
