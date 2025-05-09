package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/qun;", "", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class qun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TBSwipeRefreshLayout f26939a;

    static {
        t2o.a(745537994);
    }

    public qun(Context context) {
        ckf.h(context, "ctx");
        TBSwipeRefreshLayout tBSwipeRefreshLayout = new TBSwipeRefreshLayout(context);
        this.f26939a = tBSwipeRefreshLayout;
        TBOldRefreshHeader tBOldRefreshHeader = new TBOldRefreshHeader(context);
        tBSwipeRefreshLayout.enableLoadMore(false);
        tBOldRefreshHeader.setBackground(null);
        tBSwipeRefreshLayout.setHeaderView(tBOldRefreshHeader);
        tBSwipeRefreshLayout.setCustomRefreshHeight(DensityUtil.dip2px(context, 40.0f));
        tBSwipeRefreshLayout.enablePullRefresh(true);
        tBSwipeRefreshLayout.setDragRate(0.75f);
    }

    public final TBSwipeRefreshLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("6cee4fbb", new Object[]{this});
        }
        return this.f26939a;
    }
}
