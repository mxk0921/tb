package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponse;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a f20248a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f20249a;

        public a(gut gutVar, b bVar) {
            this.f20249a = bVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1677869863) {
                super.onSystemError(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], objArr[2]);
                return null;
            } else if (hashCode == -83293931) {
                super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                return null;
            } else if (hashCode == 1845393354) {
                super.onError(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/movehighlight/bundle/timeshift/TimeShiftModel$1");
            }
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            super.onError(i, netResponse, obj);
            this.f20249a.onError();
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            super.onSuccess(i, netResponse, netBaseOutDo, obj);
            if (netBaseOutDo instanceof LiveCommonIssueInteractResponse) {
                LiveCommonIssueInteractResponse liveCommonIssueInteractResponse = (LiveCommonIssueInteractResponse) netBaseOutDo;
                if (liveCommonIssueInteractResponse.getData() != null) {
                    this.f20249a.a(liveCommonIssueInteractResponse.getData());
                }
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            super.onSystemError(i, netResponse, obj);
            this.f20249a.onError();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData);

        void onError();
    }

    static {
        t2o.a(779092511);
    }

    public void a(LiveTimemovingModel liveTimemovingModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12067e09", new Object[]{this, liveTimemovingModel, bVar});
            return;
        }
        if (this.f20248a == null) {
            this.f20248a = new com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a(new a(this, bVar));
        }
        this.f20248a.K(liveTimemovingModel);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a aVar = this.f20248a;
        if (aVar != null) {
            aVar.destroy();
            this.f20248a = null;
        }
    }
}
