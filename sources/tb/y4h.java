package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.card.cards.live.livestatus.LiveStatus;
import com.taobao.android.fluid.framework.card.cards.live.livestatus.LiveStatusRequest;
import com.taobao.android.fluid.framework.card.cards.live.livestatus.LiveStatusResponse;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.MtopStatistics;
import tb.k5h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class y4h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "LiveStatusManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(468713966);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements IMTopAdapter.b<LiveStatusResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f31848a;

        public c(b bVar) {
            this.f31848a = bVar;
        }

        /* renamed from: b */
        public void a(MtopResponse mtopResponse, LiveStatusResponse liveStatusResponse) {
            MtopStatistics mtopStatistics;
            LiveStatus liveStatus;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6883ee10", new Object[]{this, mtopResponse, liveStatusResponse});
                return;
            }
            StringBuilder sb = new StringBuilder("[直播状态检查] fetchLiveStatus success getMtopStat:");
            if (mtopResponse != null) {
                mtopStatistics = mtopResponse.getMtopStat();
            } else {
                mtopStatistics = null;
            }
            sb.append(mtopStatistics);
            ir9.b(y4h.TAG, sb.toString());
            if (liveStatusResponse != null && (liveStatus = (LiveStatus) liveStatusResponse.data) != null) {
                ir9.b(y4h.TAG, "[直播状态检查] fetchLiveStatus success " + liveStatus);
                ((k5h.b) this.f31848a).a(liveStatus);
            }
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            ckf.g(mtopResponse, "response");
            ir9.b(y4h.TAG, "[直播状态检查] fetchLiveStatus error getMtopStat:" + mtopResponse.getMtopStat());
        }
    }

    static {
        t2o.a(468713965);
    }

    public final void a(String str, Map<String, ? extends Object> map, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c2f563", new Object[]{this, str, map, bVar});
            return;
        }
        ckf.g(str, "liveId");
        ckf.g(bVar, "callback");
        ir9.b(TAG, "[直播状态检查] fetchLiveStatus liveId=" + str + "; extParams=" + map);
        LiveStatusRequest liveStatusRequest = new LiveStatusRequest();
        liveStatusRequest.setLiveId(str);
        liveStatusRequest.setExtParams(map);
        FluidSDK.getMTopAdapter().send(liveStatusRequest, new c(bVar), LiveStatusResponse.class);
    }
}
