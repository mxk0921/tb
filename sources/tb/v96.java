package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v96 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f29866a;
    public final /* synthetic */ RecyclerView.Adapter b;
    public final /* synthetic */ DXRecyclerLayout c;

    public v96(DXRecyclerLayout dXRecyclerLayout, boolean z, RecyclerView.Adapter adapter) {
        this.c = dXRecyclerLayout;
        this.f29866a = z;
        this.b = adapter;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f29866a) {
            DXRecyclerLayout dXRecyclerLayout = this.c;
            DXRecyclerLayout.C(dXRecyclerLayout, (RecyclerAdapter) this.b, dXRecyclerLayout.y());
        }
    }
}
