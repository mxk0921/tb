package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.business.data.ActionResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.push.business.requests.ActionRequest;
import com.taobao.android.live.plugin.atype.flexalocal.push.business.responses.ActionResponse;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ActionInfo;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j3o extends kq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0d f21741a;

        public a(b0d b0dVar) {
            this.f21741a = b0dVar;
        }

        public final void a(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9e3bf48", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (netResponse != null) {
                o3s.b("RequestActions", netResponse.getApi() + " 请求失败：" + netResponse.getRetMsg());
            } else {
                o3s.b("RequestActions", "请求失败，无响应");
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            a(i, netResponse, obj);
            b0d b0dVar = this.f21741a;
            if (b0dVar != null) {
                b0dVar.onError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            ActionResponseData data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            if ((netBaseOutDo instanceof ActionResponse) && (data = ((ActionResponse) netBaseOutDo).getData()) != null) {
                x0u.a(j3o.this.f22845a, data.toastMsg);
                if (data.success) {
                    b0d b0dVar = this.f21741a;
                    if (b0dVar != null) {
                        b0dVar.onSuccess(i, netResponse, netBaseOutDo, obj);
                        return;
                    }
                    return;
                }
            }
            a(i, netResponse, obj);
            b0d b0dVar2 = this.f21741a;
            if (b0dVar2 != null) {
                b0dVar2.onError(i, netResponse, obj);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            a(i, netResponse, obj);
            b0d b0dVar = this.f21741a;
            if (b0dVar != null) {
                b0dVar.onSystemError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295699627);
    }

    public j3o(kq1 kq1Var) {
        super(kq1Var);
    }

    public static /* synthetic */ Object ipc$super(j3o j3oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/actions/RequestActions");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aeeea8", new Object[]{this});
        } else {
            d(null);
        }
    }

    public void d(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616cef76", new Object[]{this, b0dVar});
        } else if (this.c != null) {
            ActionRequest actionRequest = new ActionRequest();
            ActionInfo actionInfo = this.c;
            actionRequest.API_NAME = actionInfo.mtopApi;
            actionRequest.VERSION = actionInfo.mtopVersion;
            new k4l(new a(b0dVar)).K(actionRequest, ActionResponse.class, this.c.mtopParams);
        }
    }
}
