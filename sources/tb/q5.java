package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.AISearchDoorWidget;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class q5 extends r2p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793099);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(SearchDoorActivity searchDoorActivity) {
        super(searchDoorActivity);
        ckf.g(searchDoorActivity, "activity");
    }

    public static /* synthetic */ Object ipc$super(q5 q5Var, String str, Object... objArr) {
        if (str.hashCode() == 1217101459) {
            super.K();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/AISearchDoorWrapper");
    }

    @Override // tb.r2p
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("488b7e93", new Object[]{this});
        } else {
            super.K();
        }
    }

    @Override // tb.r2p
    public o2p l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o2p) ipChange.ipc$dispatch("6deda54d", new Object[]{this});
        }
        SearchDoorActivity searchDoorActivity = this.f27063a;
        ckf.f(searchDoorActivity, "activity");
        SearchDoorActivity searchDoorActivity2 = this.f27063a;
        ckf.f(searchDoorActivity2, "activity");
        return new AISearchDoorWidget(searchDoorActivity, searchDoorActivity2);
    }
}
