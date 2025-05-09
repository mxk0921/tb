package tb;

import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.HashMap;
import java.util.List;
import tb.gfa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class z4o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gfa f32534a = new gfa(new a());
    public final uzp b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements gfa.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(NetResponse netResponse, gfa.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d134c3f", new Object[]{this, netResponse, bVar});
            } else {
                z4o.c(z4o.this, netResponse, "onError", bVar);
            }
        }

        public void b(gfa.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d44d1773", new Object[]{this, bVar});
            } else {
                z4o.b(z4o.this, bVar);
            }
        }

        public void d(NetResponse netResponse, gfa.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3acf560e", new Object[]{this, netResponse, bVar});
            } else {
                z4o.c(z4o.this, netResponse, "onSystemError", bVar);
            }
        }

        public void c(NetResponse netResponse, NetBaseOutDo netBaseOutDo, gfa.b bVar) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be713b7", new Object[]{this, netResponse, netBaseOutDo, bVar});
                return;
            }
            try {
                ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
                if (!(netResponse == null || netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0)) {
                    kkr.i().f = list.get(0);
                }
                hha.c("ItemRequestModel", "onServerDataSuccess | size=" + data.itemListv1.size());
                uzp a2 = z4o.a(z4o.this);
                long j = -1;
                long j2 = bVar != null ? bVar.b : -1L;
                if (bVar != null) {
                    j = bVar.c;
                }
                a2.G(data, false, false, j2, j, "");
                z4o.b(z4o.this, bVar);
            } catch (Exception e) {
                hha.b("ItemRequestModel", "getItemListV2: " + e.getMessage());
                z4o.c(z4o.this, null, "exception", bVar);
            }
        }
    }

    static {
        t2o.a(295699340);
    }

    public z4o(uzp uzpVar) {
        this.b = uzpVar;
    }

    public static /* synthetic */ uzp a(z4o z4oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uzp) ipChange.ipc$dispatch("f33a7f2", new Object[]{z4oVar});
        }
        return z4oVar.b;
    }

    public static /* synthetic */ void b(z4o z4oVar, gfa.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e66b9f", new Object[]{z4oVar, bVar});
        } else {
            z4oVar.f(bVar);
        }
    }

    public static /* synthetic */ void c(z4o z4oVar, NetResponse netResponse, String str, gfa.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3645339", new Object[]{z4oVar, netResponse, str, bVar});
        } else {
            z4oVar.e(netResponse, str, bVar);
        }
    }

    public void d(List<ItemIdentifier> list, List<ItemIdentifier> list2, xea xeaVar, ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33884645", new Object[]{this, list, list2, xeaVar, itemCategory});
            return;
        }
        this.c = xeaVar.u();
        this.f32534a.a(ItemlistV2Business2.L(list, list2, itemCategory, xeaVar, "", false, 10L), false);
    }

    public final void f(gfa.b bVar) {
        List<ItemIdentifier> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c348a1", new Object[]{this, bVar});
            return;
        }
        List<x4h> T = this.b.T();
        if (!(T == null || bVar == null || (list = bVar.f19946a.itemIndexIdList) == null)) {
            for (ItemIdentifier itemIdentifier : list) {
                for (int i = 0; i < T.size(); i++) {
                    x4h x4hVar = T.get(i);
                    if (x4hVar.b == itemIdentifier.goodsIndex) {
                        x4hVar.d = false;
                    }
                }
            }
        }
    }

    public final void e(NetResponse netResponse, String str, gfa.b bVar) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af50ac5", new Object[]{this, netResponse, str, bVar});
            return;
        }
        f(bVar);
        String str2 = "onSystemError";
        String responseCode = netResponse != null ? netResponse.getResponseCode() : str2;
        if (netResponse != null) {
            str2 = netResponse.getRetMsg();
        }
        hha.b("ItemRequestModel", "errorCode = " + responseCode + " , errorMsg = " + str2);
        kkr.i().f = null;
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("feed_id", this.c);
            if (!(netResponse == null || netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0)) {
                hashMap.put("traceId", list.get(0));
            }
            hashMap.put("itemlistType", "dx");
            hashMap.put("itemCategoryId", jga.b(this.b.M()));
            if (netResponse != null) {
                hashMap.put("mtopCode", netResponse.getResponseCode());
            }
            hashMap.put("successCode", str);
            hashMap.put("sense", "update");
            if (kkr.i().o() != null) {
                kkr.i().o().c("LiveItemCdnMonitor", hashMap);
            }
        } catch (Exception e) {
            hha.b("ItemRequestModel", "onSystemError : " + e.getMessage());
        }
    }
}
