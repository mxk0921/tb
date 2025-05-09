package tb;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.android.turbo.subpage.component.dx.DxVideoControlHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xyo extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long SCROLLTOPOSITIONTOP = 491406381362131949L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRecyclerView f31700a;

        public a(DXRecyclerView dXRecyclerView) {
            this.f31700a = dXRecyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f31700a.scrollBy(0, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(916455758);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public xyo build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xyo) ipChange.ipc$dispatch("ee3773c9", new Object[]{this, obj});
            }
            return new xyo();
        }
    }

    static {
        t2o.a(916455756);
    }

    public static /* synthetic */ Object ipc$super(xyo xyoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/ScrollToPositionTopAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        try {
            DXRecyclerView dXRecyclerView = (DXRecyclerView) DxVideoControlHelper.r(((tk6) k8Var).o().getFlattenWidgetNode().queryWidgetNodeByUserId(n8Var.i("recyclerNodeId")).getWRView().get(), DXRecyclerView.class);
            int e = n8Var.e("index");
            RecyclerView.LayoutManager layoutManager = dXRecyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(e, 0);
            }
            dXRecyclerView.post(new a(dXRecyclerView));
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
