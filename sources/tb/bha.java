package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.jg3;
import tb.nqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bha<T extends nqd> extends tfa<T> implements cbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String j = bha.class.getSimpleName();
    public ItemlistV2Business2 c;
    public jg3 d;
    public String e;
    public boolean f;
    public long g = 0;
    public i0h h;
    public j8n i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f16386a;
        public final /* synthetic */ String b;
        public final /* synthetic */ List c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public a(boolean z, String str, List list, boolean z2, boolean z3) {
            this.f16386a = z;
            this.b = str;
            this.c = list;
            this.d = z2;
            this.e = z3;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            a(i, netResponse, obj, "onError");
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", -1);
            a(i, netResponse, obj, "onSystemError");
        }

        public final void a(int i, NetResponse netResponse, Object obj, String str) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a539d364", new Object[]{this, new Integer(i), netResponse, obj, str});
                return;
            }
            String str2 = "onSystemError";
            String responseCode = netResponse != null ? netResponse.getResponseCode() : str2;
            if (netResponse != null) {
                str2 = netResponse.getRetMsg();
            }
            String x = bha.x();
            hha.b(x, "errorCode = " + responseCode + " , errorMsg = " + str2);
            if (bha.j(bha.this)) {
                bha bhaVar = bha.this;
                bha.A(bhaVar, bha.y(bhaVar).u(), bha.z(bha.this), this.f16386a, this.c, bha.k(bha.this));
            } else {
                iha.o(bha.B(bha.this) == null ? null : bha.C(bha.this).u(), bha.z(bha.this), Boolean.valueOf(this.f16386a), this.d, this.b, Boolean.valueOf(this.e));
                ((nqd) bha.D(bha.this)).F();
            }
            try {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("feed_id", bha.l(bha.this).u());
                if (!(netResponse == null || netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0)) {
                    hashMap.put("traceId", list.get(0));
                }
                hashMap.put("itemlistType", "dx");
                hashMap.put("itemCategoryId", jga.c(bha.m(bha.this)));
                if (netResponse != null) {
                    hashMap.put("mtopCode", netResponse.getResponseCode());
                }
                hashMap.put("successCode", str);
                if (kkr.i().o() != null) {
                    kkr.i().o().c("LiveItemCdnMonitor", hashMap);
                }
            } catch (Exception e) {
                String x2 = bha.x();
                hha.b(x2, "onSystemError : " + e.getMessage());
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            try {
                ItemlistV2ResponseData data = ((ItemlistV2Response) netBaseOutDo).getData();
                if (!(netResponse == null || netResponse.getHeaderFields() == null || (list = netResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2)) == null || list.size() <= 0)) {
                    kkr.i().f = list.get(0);
                }
                if (!data.useCdn || !bha.j(bha.this)) {
                    nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 1);
                    nha.c(data, null);
                    ((nqd) bha.v(bha.this)).G(data, this.f16386a, false, bha.k(bha.this), bha.this.c.M(), this.b);
                    return;
                }
                a(i, null, null, "useCdn");
            } catch (Exception e) {
                e.printStackTrace();
                String x = bha.x();
                hha.b(x, "getItemListV2: " + e.getMessage());
                a(i, null, null, "exception");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements jg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f16387a;
        public final /* synthetic */ String b;

        public b(long j, String str) {
            this.f16387a = j;
            this.b = str;
        }

        @Override // tb.jg3.b
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f229973", new Object[]{this, new Integer(i), str, str2});
                return;
            }
            String str3 = this.b;
            nha.k("https://live-spare.alicdn.com/liveitems", i + "_" + str + "_" + str2 + "_" + str3);
        }

        @Override // tb.jg3.b
        public void b(Object obj, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60aa40dd", new Object[]{this, obj, new Long(j)});
                return;
            }
            ItemlistV2ResponseData itemlistV2ResponseData = (ItemlistV2ResponseData) obj;
            if (itemlistV2ResponseData.itemListv1 != null) {
                nha.o("https://live-spare.alicdn.com/liveitems", 1);
                try {
                    nha.c(itemlistV2ResponseData, null);
                    jq6.m(itemlistV2ResponseData);
                    ((nqd) bha.n(bha.this)).G((ItemlistV2ResponseData) obj, false, true, this.f16387a, j, "cdnCache");
                } catch (Exception e) {
                    String x = bha.x();
                    hha.b(x, "filterItemList : " + e.getMessage());
                }
            } else {
                nha.o("https://live-spare.alicdn.com/liveitems", -1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements jg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16388a;
        public final /* synthetic */ List b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ String g;

        public c(String str, List list, long j, String str2, String str3, boolean z, String str4) {
            this.f16388a = str;
            this.b = list;
            this.c = j;
            this.d = str2;
            this.e = str3;
            this.f = z;
            this.g = str4;
        }

        @Override // tb.jg3.b
        public void a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f229973", new Object[]{this, new Integer(i), str, str2});
                return;
            }
            iha.o(this.d, this.e, Boolean.valueOf(this.f), true, null, null);
            String str3 = this.g;
            nha.k(this.f16388a, i + "_" + str + "_" + str2 + "_" + str3);
            ((nqd) bha.r(bha.this)).F();
        }

        @Override // tb.jg3.b
        public void b(Object obj, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60aa40dd", new Object[]{this, obj, new Long(j)});
            } else if (obj == null || !(obj instanceof ItemlistV2ResponseData)) {
                nha.o(this.f16388a, -1);
            } else {
                ItemlistV2ResponseData itemlistV2ResponseData = (ItemlistV2ResponseData) obj;
                if (itemlistV2ResponseData.itemListv1 != null) {
                    nha.o(this.f16388a, 1);
                    try {
                        nha.c(itemlistV2ResponseData, null);
                        jq6.m(itemlistV2ResponseData);
                        itemlistV2ResponseData.itemListv1 = bha.o(bha.this, this.b, itemlistV2ResponseData.itemListv1, itemlistV2ResponseData.itemSortInfo);
                    } catch (Exception e) {
                        String x = bha.x();
                        hha.b(x, "filterItemList : " + e.getMessage());
                    }
                }
                ((nqd) bha.p(bha.this)).G(itemlistV2ResponseData, false, true, this.c, j, "cdnBack");
                List<ItemlistV2ResponseData.ItemListv1> list = itemlistV2ResponseData.itemListv1;
                if (list != null && list.size() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    for (int i = 0; i < itemlistV2ResponseData.itemListv1.size(); i++) {
                        if (i > 0) {
                            sb.append(",");
                        }
                        if (!(itemlistV2ResponseData.itemListv1.get(i) == null || itemlistV2ResponseData.itemListv1.get(i).liveItemDO == null)) {
                            sb.append(itemlistV2ResponseData.itemListv1.get(i).liveItemDO.itemId);
                        }
                    }
                    sb.append("]");
                    bha.this.H(sb, zqq.h(kkr.i().c(bha.q(bha.this))), this.d);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            ArrayList<LiveItemPersonalityGetResponseData.LiveItemPersonalityData> arrayList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            LiveItemPersonalityGetResponseData data = ((LiveItemPersonalityGetResponse) netBaseOutDo).getData();
            if (data != null && (arrayList = data.personalities) != null && !arrayList.isEmpty()) {
                Iterator<LiveItemPersonalityGetResponseData.LiveItemPersonalityData> it = data.personalities.iterator();
                while (it.hasNext()) {
                    ((wga) bha.s(bha.this)).c0(it.next());
                }
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<j8n> f16390a;

        public e() {
            this.f16390a = new WeakReference<>(bha.t(bha.this));
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            j8n j8nVar = this.f16390a.get();
            if (j8nVar != null) {
                j8nVar.M(false);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            JSONObject jSONObject = (JSONObject) fkx.a(netResponse.getDataJsonObject().toString());
            HashMap hashMap = new HashMap();
            j8n j8nVar = this.f16390a.get();
            if (j8nVar != null) {
                hashMap.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, String.valueOf(j8nVar.K()));
                j8nVar.M(false);
            }
            nha.e(jSONObject, hashMap);
            if (jSONObject == null || jSONObject.isEmpty()) {
                bha.u(bha.this);
            } else {
                ((wga) bha.w(bha.this)).a0(new th5("999998goodsRights", 1, jSONObject, 999998, 0L), false);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            j8n j8nVar = this.f16390a.get();
            if (j8nVar != null) {
                j8nVar.M(false);
            }
        }
    }

    static {
        t2o.a(295699344);
        t2o.a(295699334);
    }

    public bha(xea xeaVar) {
        super(xeaVar);
    }

    public static /* synthetic */ void A(bha bhaVar, String str, String str2, boolean z, List list, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a52b241", new Object[]{bhaVar, str, str2, new Boolean(z), list, new Long(j2)});
        } else {
            bhaVar.F(str, str2, z, list, j2);
        }
    }

    public static /* synthetic */ xea B(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("2415848b", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ xea C(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("a1e41caa", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ bdd D(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("77105dbb", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ Object ipc$super(bha bhaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/GoodsListModel2");
    }

    public static /* synthetic */ boolean j(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8eeb568c", new Object[]{bhaVar})).booleanValue();
        }
        return bhaVar.f;
    }

    public static /* synthetic */ long k(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4867ec3d", new Object[]{bhaVar})).longValue();
        }
        return bhaVar.g;
    }

    public static /* synthetic */ xea l(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("b58c9523", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ xea m(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("335b2d42", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ bdd n(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("d1177a53", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ List o(bha bhaVar, List list, List list2, ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2e389a70", new Object[]{bhaVar, list, list2, itemSortInfo});
        }
        return bhaVar.G(list, list2, itemSortInfo);
    }

    public static /* synthetic */ bdd p(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("b4e27991", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ xea q(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("2a958dbe", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ bdd r(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("98ad78cf", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ bdd s(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("8a92f86e", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ j8n t(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8n) ipChange.ipc$dispatch("6b9b480b", new Object[]{bhaVar});
        }
        return bhaVar.i;
    }

    public static /* synthetic */ void u(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c8c500", new Object[]{bhaVar});
        } else {
            bhaVar.E();
        }
    }

    public static /* synthetic */ bdd v(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("d9c9e062", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ bdd w(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdd) ipChange.ipc$dispatch("3816ef56", new Object[]{bhaVar});
        }
        return bhaVar.b;
    }

    public static /* synthetic */ String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return j;
    }

    public static /* synthetic */ xea y(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("aaa9bc2e", new Object[]{bhaVar});
        }
        return bhaVar.f28683a;
    }

    public static /* synthetic */ String z(bha bhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a82f14f3", new Object[]{bhaVar});
        }
        return bhaVar.e;
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43ab9e8", new Object[]{this});
        } else {
            ((wga) this.b).R(new th5("999998goodsRights", 1, null, 999998, 0L));
        }
    }

    public final void F(String str, String str2, boolean z, List<ItemIdentifier> list, long j2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a71347", new Object[]{this, str, str2, new Boolean(z), list, new Long(j2)});
        } else if (TextUtils.isEmpty(str)) {
            ((nqd) this.b).F();
        } else {
            if (TextUtils.equals("0", str2)) {
                str3 = "https://live-spare.alicdn.com/liveitems";
            } else {
                str3 = "https://live-spare.alicdn.com/liveitem4category";
            }
            if ("0".equals(str2)) {
                str4 = "http://live-spare.alicdn.com/liveitems/" + str;
            } else {
                str4 = "https://live-spare.alicdn.com/liveitem4category/" + str + "/" + str2;
            }
            nha.o(str3, 0);
            jg3 jg3Var = new jg3(str4, ItemlistV2ResponseData.class, new c(str3, list, j2, str, str2, z, str4));
            this.d = jg3Var;
            jg3Var.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public final List<ItemlistV2ResponseData.ItemListv1> G(List<ItemIdentifier> list, List<ItemlistV2ResponseData.ItemListv1> list2, ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b38fd5ba", new Object[]{this, list, list2, itemSortInfo});
        }
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if ((list == 0 || list.isEmpty()) && itemSortInfo != null && itemSortInfo.sortList != null) {
            list = new ArrayList<>();
            for (ItemIdentifier itemIdentifier : itemSortInfo.sortList) {
                if (list.size() >= 10) {
                    break;
                }
                list.add(itemIdentifier);
            }
        }
        if (list == 0 || list.isEmpty()) {
            for (ItemlistV2ResponseData.ItemListv1 itemListv1 : list2) {
                if (itemListv1 != null) {
                    arrayList.add(itemListv1);
                    if (arrayList.size() >= 10) {
                        break;
                    }
                }
            }
            return arrayList;
        }
        for (ItemlistV2ResponseData.ItemListv1 itemListv12 : list2) {
            if (itemListv12 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ItemIdentifier) it.next()).goodsIndex == zqq.j(itemListv12.goodsIndex)) {
                            arrayList.add(itemListv12);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public void H(StringBuilder sb, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2eb8c2", new Object[]{this, sb, new Long(j2), str});
            return;
        }
        if (this.h == null) {
            this.h = new i0h(new d());
        }
        this.h.K(sb.toString(), j2, zqq.h(str));
    }

    @Override // tb.cbc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39138ca3", new Object[]{this});
            return;
        }
        String str = "http://live-spare.alicdn.com/liveitems/" + this.f28683a.u();
        nha.o("https://live-spare.alicdn.com/liveitems", 0);
        jg3 jg3Var = new jg3(str, ItemlistV2ResponseData.class, new b(System.currentTimeMillis(), str));
        this.d = jg3Var;
        jg3Var.k();
    }

    @Override // tb.fvc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce866d5d", new Object[]{this});
            return;
        }
        ItemlistV2Business2 itemlistV2Business2 = this.c;
        if (itemlistV2Business2 != null) {
            itemlistV2Business2.destroy();
        }
        i0h i0hVar = this.h;
        if (i0hVar != null) {
            i0hVar.destroy();
        }
        j8n j8nVar = this.i;
        if (j8nVar != null) {
            j8nVar.destroy();
        }
        jg3 jg3Var = this.d;
        if (jg3Var != null) {
            jg3Var.j();
        }
    }

    @Override // tb.cbc
    public void e(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86c240e", new Object[]{this, itemCategory});
        } else if (kkr.i().p(this.f28683a) != 1) {
            if (this.i == null) {
                this.i = new j8n(new e());
            }
            this.i.L(this.f28683a, itemCategory, true);
        }
    }

    @Override // tb.cbc
    public void g(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, boolean z, boolean z2, String str) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da83eb3", new Object[]{this, list, list2, itemCategory, new Boolean(z), new Boolean(z2), str});
            return;
        }
        if (list2 == null || list2.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        f(list, list2, itemCategory, z, z2, str, z3);
    }

    @Override // tb.cbc
    public void f(List<ItemIdentifier> list, List<ItemIdentifier> list2, ItemCategory itemCategory, boolean z, boolean z2, String str, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27604a81", new Object[]{this, list, list2, itemCategory, new Boolean(z), new Boolean(z2), str, new Boolean(z3)});
            return;
        }
        this.e = itemCategory.categoryId;
        this.f = z2;
        this.g = System.currentTimeMillis();
        nha.o("mtop.tblive.live.item.getVideoDetailItemListWithPagination", 0);
        ItemlistV2Business2 itemlistV2Business2 = new ItemlistV2Business2(new a(z, str, list2, z2, z3));
        this.c = itemlistV2Business2;
        itemlistV2Business2.P(list, list2, itemCategory, this.f28683a, str, z3, 10L);
    }
}
