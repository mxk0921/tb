package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.component.layout.CommonListLayoutComponent;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.model.RootModel;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ttg extends tw1<fwa<PageModel, FrameLayout>, PageModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552771);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552770);
    }

    public static /* synthetic */ Object ipc$super(ttg ttgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/layout/ListLayoutService");
    }

    public fwa<PageModel, FrameLayout> r(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("59d1b5cc", new Object[]{this, qpuVar});
        }
        ckf.g(qpuVar, "context");
        Object s = ((byb) qpuVar.getService(byb.class)).s();
        if (s != null) {
            PageModel pageModel = (PageModel) s;
            tpu.a aVar = tpu.Companion;
            StringBuilder sb = new StringBuilder("onCreateLayoutComponent showPullToRefresh:");
            RootModel rootModel = pageModel.getRootModel();
            sb.append(rootModel != null ? Boolean.valueOf(rootModel.getShowPullToRefresh()) : null);
            tpu.a.b(aVar, "ListLayoutService", sb.toString(), null, 4, null);
            RootModel rootModel2 = pageModel.getRootModel();
            if (rootModel2 == null || !rootModel2.getShowPullToRefresh()) {
                tpu.a.b(aVar, "ListLayoutService", "creating CommonListLayoutComponent", null, 4, null);
                return new CommonListLayoutComponent(qpuVar);
            }
            tpu.a.b(aVar, "ListLayoutService", "creating RefreshListLayoutComponent", null, 4, null);
            return new uun(qpuVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.PageModel");
    }
}
