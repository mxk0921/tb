package tb;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.vfw.adapter.RecyclerViewAdapter;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class x17 implements rjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286671);
        t2o.a(157286672);
    }

    @Override // tb.rjc
    public RecyclerViewAdapter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("b1214140", new Object[]{this});
        }
        return null;
    }

    @Override // tb.rjc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6484ad", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.rjc
    public void c(ViewEngine viewEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab67ab1", new Object[]{this, viewEngine});
        }
    }

    @Override // tb.rjc
    public void d(et6 et6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4362f9a0", new Object[]{this, et6Var});
        }
    }

    @Override // tb.rjc
    public RecyclerView.LayoutManager e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.LayoutManager) ipChange.ipc$dispatch("1077ec7c", new Object[]{this, context});
        }
        return null;
    }
}
