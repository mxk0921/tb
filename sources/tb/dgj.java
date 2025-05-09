package tb;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.ultron.MTBLayoutManagerV2;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dgj extends vv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public MTBLayoutManagerV2 f17797a;
    public RecyclerViewAdapter b;
    public ViewEngine c;
    public int d;
    public int e;
    public final MTPtrRecyclerView f;
    public final Fragment g;

    static {
        t2o.a(745538082);
    }

    public dgj(MTPtrRecyclerView mTPtrRecyclerView, Fragment fragment) {
        ckf.h(mTPtrRecyclerView, "rv");
        ckf.h(fragment, "fragment");
        this.f = mTPtrRecyclerView;
        this.g = fragment;
    }

    public static /* synthetic */ Object ipc$super(dgj dgjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/MyTBLayoutExtendV2");
    }

    @Override // tb.rjc
    public RecyclerViewAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("b1214140", new Object[]{this});
        }
        RecyclerViewAdapter recyclerViewAdapter = this.b;
        if (recyclerViewAdapter != null) {
            return recyclerViewAdapter;
        }
        ckf.s();
        throw null;
    }

    @Override // tb.rjc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6484ad", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.rjc
    public void d(et6 et6Var) {
        int i;
        int i2;
        String str;
        IDMComponent iDMComponent;
        List<IDMComponent> data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4362f9a0", new Object[]{this, et6Var});
            return;
        }
        ckf.h(et6Var, c4o.KEY_DATA_SOURCE);
        RecyclerViewAdapter recyclerViewAdapter = this.b;
        if (recyclerViewAdapter == null || (data = recyclerViewAdapter.getData()) == null) {
            i = 0;
        } else {
            i = data.size();
        }
        List<IDMComponent> c = et6Var.c();
        if (c != null) {
            i2 = c.size();
        } else {
            i2 = 0;
        }
        this.e = i2;
        List<IDMComponent> c2 = et6Var.c();
        if (c2 == null || (iDMComponent = (IDMComponent) i04.d0(c2, this.e - 1)) == null) {
            str = null;
        } else {
            str = iDMComponent.getTag();
        }
        Lifecycle lifecycle = this.g.getLifecycle();
        ckf.c(lifecycle, "fragment.lifecycle");
        boolean isAtLeast = lifecycle.getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
        int i3 = this.e;
        if (i3 > 0 && i > 0 && i == i3 && this.d == 0 && ckf.b(str, "basementTip") && isAtLeast) {
            this.d = 1;
        } else if (this.d == 1) {
            this.d = 0;
        }
        RecyclerViewAdapter recyclerViewAdapter2 = this.b;
        if (recyclerViewAdapter2 != null) {
            recyclerViewAdapter2.setData(et6Var.c());
        } else {
            ckf.s();
            throw null;
        }
    }

    @Override // tb.rjc
    public RecyclerView.LayoutManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("1077ec7c", new Object[]{this, context});
        }
        MTBLayoutManagerV2 mTBLayoutManagerV2 = this.f17797a;
        if (mTBLayoutManagerV2 != null) {
            return mTBLayoutManagerV2;
        }
        ckf.s();
        throw null;
    }

    @Override // tb.rjc
    public void c(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab67ab1", new Object[]{this, viewEngine});
            return;
        }
        ckf.h(viewEngine, "viewEngine");
        this.c = viewEngine;
        if (this.f17797a == null) {
            Context K = viewEngine.K();
            ckf.c(K, "viewEngine.context");
            this.f17797a = new MTBLayoutManagerV2(K, 1, false);
        }
        if (this.b == null) {
            this.b = new RecyclerViewAdapter(this.c);
        }
    }

    @Override // tb.vv
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13bc9146", new Object[]{this})).booleanValue();
        }
        RecyclerView.Adapter adapter = this.f.getAdapter();
        if (adapter == null || this.f.getFlEndViewContainer() == null || this.d != 1 || adapter.getItemCount() - 1 != this.e) {
            return false;
        }
        this.d = 2;
        adapter.notifyItemRangeChanged(0, adapter.getItemCount() - 1);
        TLog.loge("mtbMainLink", "notifyItemRangeChanged， newDataCount=" + this.e);
        return true;
    }
}
