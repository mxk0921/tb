package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.itemgroup.common.SearchTransferInfo;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import java.util.List;
import tb.qac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cof<T extends qac> extends tfa<T> implements ogc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final wea c = new wea(new b());
    public boolean d;
    public JSONObject e;
    public SearchTransferInfo f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(295699394);
            t2o.a(806355932);
        }

        public b() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            String str2 = "";
            if (obj == null) {
                str = str2;
            } else {
                str = ((wea) obj).l.searchWord;
            }
            ((qac) cof.o(cof.this)).t(str);
            cof.n(cof.this, false);
            if (obj != null) {
                str2 = ((wea) obj).l.searchType;
            }
            iha.C(str, str2, false, null);
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            GoodListSearchResponse.GoodListSearchResponseData data = ((GoodListSearchResponse) netBaseOutDo).getData();
            String str2 = "";
            if (obj == null) {
                str = str2;
            } else {
                str = ((wea) obj).l.searchWord;
            }
            if (obj != null) {
                str2 = ((wea) obj).l.searchType;
            }
            if (data != null && (jSONObject = data.searchTransferInfo) != null && !jSONObject.isEmpty() && wda.m()) {
                cof.k(cof.this, data.searchTransferInfo);
                cof cofVar = cof.this;
                cof.l(cofVar, (SearchTransferInfo) fkx.f(cof.j(cofVar).toJSONString(), SearchTransferInfo.class));
            }
            iha.C(str, str2, true, data);
            ((qac) cof.m(cof.this)).H(data, str);
            cof.n(cof.this, false);
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            if (obj == null) {
                str = "";
            } else {
                str = ((wea) obj).l.searchWord;
            }
            ((qac) cof.p(cof.this)).t(str);
            cof.n(cof.this, false);
        }
    }

    static {
        t2o.a(295699392);
        t2o.a(295699407);
    }

    public static /* synthetic */ Object ipc$super(cof cofVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/search/ItemGroupModel");
    }

    public static /* synthetic */ JSONObject j(cof cofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4e557fe9", new Object[]{cofVar});
        }
        return cofVar.e;
    }

    public static /* synthetic */ JSONObject k(cof cofVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f102e0e9", new Object[]{cofVar, jSONObject});
        }
        cofVar.e = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ SearchTransferInfo l(cof cofVar, SearchTransferInfo searchTransferInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchTransferInfo) ipChange.ipc$dispatch("90cd8bd0", new Object[]{cofVar, searchTransferInfo});
        }
        cofVar.f = searchTransferInfo;
        return searchTransferInfo;
    }

    public static /* synthetic */ bdd m(cof cofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("a0fea3c5", new Object[]{cofVar});
        }
        return cofVar.b;
    }

    public static /* synthetic */ boolean n(cof cofVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c41904b4", new Object[]{cofVar, new Boolean(z)})).booleanValue();
        }
        cofVar.d = z;
        return z;
    }

    public static /* synthetic */ bdd o(cof cofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("beb60347", new Object[]{cofVar});
        }
        return cofVar.b;
    }

    public static /* synthetic */ bdd p(cof cofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("cd91b308", new Object[]{cofVar});
        }
        return cofVar.b;
    }

    @Override // tb.ogc
    public SearchTransferInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchTransferInfo) ipChange.ipc$dispatch("dfe98cb1", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.fvc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce866d5d", new Object[]{this});
        } else {
            this.c.destroy();
        }
    }

    @Override // tb.ogc
    public void d(xea xeaVar, String str, String str2, int i, ItemIdentifier itemIdentifier, List<ItemIdentifier> list) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ffa898", new Object[]{this, xeaVar, str, str2, new Integer(i), itemIdentifier, list});
        } else if (!TextUtils.isEmpty(str) && !this.d) {
            this.d = true;
            if (itemIdentifier == null) {
                i2 = 0;
            } else {
                i2 = itemIdentifier.goodsIndex;
            }
            this.c.K(xeaVar, str, str2, i, i2, list, this.e);
        }
    }

    @Override // tb.ogc
    public void i(xea xeaVar, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ca41bd", new Object[]{this, xeaVar, str, str2, new Integer(i)});
        } else if (!TextUtils.isEmpty(str)) {
            this.d = true;
            this.e = null;
            this.f = null;
            this.c.K(xeaVar, str, str2, i, 0, null, null);
        }
    }
}
