package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hk9 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Recycler f20702a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ik9 c;

    public hk9(ik9 ik9Var, RecyclerView.Recycler recycler, b bVar) {
        this.f20702a = recycler;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f20702a.getViewForPosition(ik9.g0(null));
            throw null;
        }
    }
}
