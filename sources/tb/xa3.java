package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xa3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f31243a;
        public final /* synthetic */ deb b;

        public a(xea xeaVar, deb debVar) {
            this.f31243a = xeaVar;
            this.b = debVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            xa3.c(xa3.this, this.f31243a);
            this.b.onError(netResponse.getRetCode(), netResponse.getRetMsg());
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo instanceof ItemActionQueryResponse) {
                ItemActionQueryResponse itemActionQueryResponse = (ItemActionQueryResponse) netBaseOutDo;
                if (xa3.a(xa3.this, itemActionQueryResponse)) {
                    if (!(netBaseOutDo == null || netBaseOutDo.getData() == null || TextUtils.isEmpty(itemActionQueryResponse.getData().msgInfo))) {
                        a1u.a(this.f31243a.i(), itemActionQueryResponse.getData().msgInfo);
                    }
                    this.b.onResult(Boolean.TRUE);
                    return;
                }
                hha.b("CartDetailChecker", "check | onSuccess, code=" + netResponse.getDataJsonObject());
                a1u.a(this.f31243a.i(), xa3.b(xa3.this, itemActionQueryResponse));
                this.b.onResult(Boolean.FALSE);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            xa3.c(xa3.this, this.f31243a);
            this.b.onError(netResponse.getRetCode(), netResponse.getRetMsg());
        }
    }

    static {
        t2o.a(295698975);
    }

    public static /* synthetic */ boolean a(xa3 xa3Var, ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a068cb6", new Object[]{xa3Var, itemActionQueryResponse})).booleanValue();
        }
        return xa3Var.f(itemActionQueryResponse);
    }

    public static /* synthetic */ String b(xa3 xa3Var, ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda4a1af", new Object[]{xa3Var, itemActionQueryResponse});
        }
        return xa3Var.e(itemActionQueryResponse);
    }

    public static /* synthetic */ void c(xa3 xa3Var, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d0b51e", new Object[]{xa3Var, xeaVar});
        } else {
            xa3Var.g(xeaVar);
        }
    }

    public void d(xea xeaVar, LiveItem liveItem, deb<Boolean> debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dcd87e", new Object[]{this, xeaVar, liveItem, debVar});
        } else if (xeaVar != null && liveItem != null && debVar != null) {
            new qnf(new a(xeaVar, debVar)).K(xeaVar, liveItem);
        } else if (debVar != null) {
            debVar.onResult(Boolean.TRUE);
        }
    }

    public final String e(ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("732a820d", new Object[]{this, itemActionQueryResponse});
        }
        if (itemActionQueryResponse == null || itemActionQueryResponse.getData() == null || TextUtils.isEmpty(itemActionQueryResponse.getData().msgInfo)) {
            return g7p.MSG_TOAST_DEFAULT;
        }
        return itemActionQueryResponse.getData().msgInfo;
    }

    public final boolean f(ItemActionQueryResponse itemActionQueryResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe62310c", new Object[]{this, itemActionQueryResponse})).booleanValue();
        }
        if (itemActionQueryResponse == null || itemActionQueryResponse.getData() == null || !TextUtils.equals(itemActionQueryResponse.getData().type, "boolean")) {
            return true;
        }
        return itemActionQueryResponse.getData().success;
    }

    public final void g(xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c841882e", new Object[]{this, xeaVar});
        } else {
            a1u.a(xeaVar.i(), g7p.MSG_TOAST_DEFAULT);
        }
    }
}
