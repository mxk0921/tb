package com.taobao.search.searchdoor;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DoorListViewModel extends ViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<RecyclerView> f11608a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792932);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a(Context context, int i) {
            RecyclerView.LayoutManager layoutManager;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1d035c04", new Object[]{this, context, new Integer(i)})).intValue();
            }
            ckf.g(context, "context");
            RecyclerView a2 = ((DoorListViewModel) ViewModelProviders.of((FragmentActivity) context).get(DoorListViewModel.class)).a();
            ChildLayoutManager childLayoutManager = null;
            if (a2 != null) {
                layoutManager = a2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof ChildLayoutManager) {
                childLayoutManager = (ChildLayoutManager) layoutManager;
            }
            if (childLayoutManager != null) {
                return childLayoutManager.y(i);
            }
            return 0;
        }

        public final void b(Context context, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a983747f", new Object[]{this, context, recyclerView});
                return;
            }
            ckf.g(context, "context");
            ((DoorListViewModel) ViewModelProviders.of((FragmentActivity) context).get(DoorListViewModel.class)).b(recyclerView);
        }

        public a() {
        }
    }

    static {
        t2o.a(815792931);
    }

    public static /* synthetic */ Object ipc$super(DoorListViewModel doorListViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/DoorListViewModel");
    }

    public final RecyclerView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("128209f1", new Object[]{this});
        }
        WeakReference<RecyclerView> weakReference = this.f11608a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdf31a7", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
            this.f11608a = null;
        } else {
            this.f11608a = new WeakReference<>(recyclerView);
        }
    }
}
