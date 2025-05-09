package tb;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.business.videocollection.PopupDialog;
import com.taobao.android.fluid.business.videocollection.common.view.CollectionTabLayout;
import com.taobao.android.fluid.business.videocollection.normalcollection.CollectRequest;
import com.taobao.android.fluid.business.videocollection.normalcollection.view.SpeedAdustableRecylerView;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class r6k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<dz3> f27144a;
    public final SpeedAdustableRecylerView b;
    public final FluidContext c;
    public final CollectionTabLayout d;
    public final List e;
    public int f = 0;
    public final mz3 g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f27146a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;

        public b(boolean[] zArr, int i, int i2, boolean z, int i3) {
            this.f27146a = zArr;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
                return;
            }
            this.f27146a[this.b] = true;
            if (hVar != null) {
                r6k.c(r6k.this, hVar, String.valueOf(this.c), this.d, this.e, this.f27146a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f27147a;

        public c(int i) {
            this.f27147a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r6k.d(r6k.this).c(this.f27147a, 0);
            r6k.d(r6k.this).b(8);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupDialog f27148a;

        public d(PopupDialog popupDialog) {
            this.f27148a = popupDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject h = r6k.this.h();
            if (h == null) {
                h = new JSONObject();
            }
            String string = h.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
            ShareContent shareContent = new ShareContent();
            shareContent.businessId = "guangguang";
            shareContent.description = "我分享给你了一个淘宝页面，快来看看吧";
            HashMap hashMap = new HashMap();
            hashMap.put("title", h.getString("title"));
            hashMap.put("userNick", h.getString("accountName"));
            hashMap.put("headImg", h.getString("avatarUrl"));
            hashMap.put("images", new String[]{string});
            shareContent.templateParams = hashMap;
            shareContent.imageUrl = string;
            JSONObject jSONObject = new JSONObject();
            if (((IDataService) r6k.b(r6k.this).getService(IDataService.class)).getCurrentMediaDetail() != null) {
                jSONObject.put("contentId", (Object) ((IDataService) r6k.b(r6k.this).getService(IDataService.class)).getCurrentMediaDetail().f());
            }
            jSONObject.put("sceneSource", (Object) "guang_share");
            ISceneConfigService iSceneConfigService = (ISceneConfigService) r6k.b(r6k.this).getService(ISceneConfigService.class);
            if (!(iSceneConfigService == null || iSceneConfigService.getSessionParams() == null)) {
                jSONObject.put("spm-url", (Object) iSceneConfigService.getSessionParams().e);
            }
            String str = "https://web.m.taobao.com/app/tnode/web/index?tnode=page_guangguanghome&tabid=video&extParams=" + Uri.encode(jSONObject.toJSONString());
            shareContent.url = str;
            ir9.b("PopupDialog", "shareUrl" + str);
            if (((IDataService) r6k.b(r6k.this).getService(IDataService.class)).getCurrentMediaDetail() != null) {
                shareContent.title = ((IDataService) r6k.b(r6k.this).getService(IDataService.class)).getCurrentMediaDetail().I();
            }
            shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("userNick", h.getString("accountName"));
            hashMap2.put("avatarPath", h.getString("avatarUrl"));
            shareContent.extendParams = hashMap2;
            ShareBusiness.getInstance();
            ShareBusiness.share((Activity) this.f27148a.getContext(), shareContent);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(nz3.X_INDEX, String.valueOf(h.get("index")));
            hashMap3.put(nz3.X_POSITION, String.valueOf(((IDataService) r6k.b(r6k.this).getService(IDataService.class)).getCurrentMediaPosition()));
            xau.E(null, "Button-ShareCollection", hashMap3);
            this.f27148a.s2(true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements IMTopAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27149a;

        public e(boolean z) {
            this.f27149a = z;
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ed028ea", new Object[]{this, mtopResponse, baseOutDo});
                return;
            }
            r6k.d(r6k.this).a(true ^ this.f27149a);
            ir9.b("PopupDialog", "collectLinearLayout.setOnClickListener onCall" + mtopResponse.toString());
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            ir9.b("PopupDialog", "collectLinearLayout.setOnClickListener onError" + mtopResponse.toString());
        }
    }

    static {
        t2o.a(468713718);
    }

    public r6k(ArrayList<dz3> arrayList, SpeedAdustableRecylerView speedAdustableRecylerView, FluidContext fluidContext, CollectionTabLayout collectionTabLayout, mz3 mz3Var, List list) {
        this.f27144a = arrayList;
        this.b = speedAdustableRecylerView;
        this.c = fluidContext;
        this.d = collectionTabLayout;
        this.g = mz3Var;
        this.e = list;
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return g();
    }

    public static /* synthetic */ FluidContext b(r6k r6kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("82031882", new Object[]{r6kVar});
        }
        return r6kVar.c;
    }

    public static /* synthetic */ void c(r6k r6kVar, kon.h hVar, String str, boolean z, int i, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e39b53", new Object[]{r6kVar, hVar, str, new Boolean(z), new Integer(i), zArr});
        } else {
            r6kVar.l(hVar, str, z, i, zArr);
        }
    }

    public static /* synthetic */ mz3 d(r6k r6kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mz3) ipChange.ipc$dispatch("16ce97e1", new Object[]{r6kVar});
        }
        return r6kVar.g;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c88f75b8", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableLoadMorePageForCollection", true);
    }

    public static String i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14efa57d", new Object[]{jSONObject});
        }
        return jSONObject.getString("start");
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("19c711b2", new Object[]{this});
        }
        FluidContext fluidContext = this.c;
        if (!(fluidContext == null || fluidContext.getService(IDataService.class) == null)) {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaSetData();
            JSONObject b2 = nz3.b(currentMediaSetData);
            if (b2 != null) {
                return b2;
            }
            float a2 = nz3.a(currentMediaSetData);
            ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> mediaSetList = ((IDataService) this.c.getService(IDataService.class)).getMediaSetList();
            if (mediaSetList != null) {
                for (com.taobao.android.fluid.framework.data.datamodel.a aVar : mediaSetList) {
                    if (nz3.g(aVar) == a2) {
                        return nz3.b(aVar);
                    }
                }
            }
        }
        return null;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf28f08", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void k(View view, PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f96de06", new Object[]{this, view, popupDialog});
        } else {
            ((LinearLayout) view.findViewById(R.id.shareCollection)).setOnClickListener(new d(popupDialog));
        }
    }

    public final void l(kon.h hVar, String str, boolean z, int i, boolean[] zArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5f5937", new Object[]{this, hVar, str, new Boolean(z), new Integer(i), zArr});
            return;
        }
        ((ICollectionService) this.c.getService(ICollectionService.class)).insertToCollectionDataCacheAndDetailList(hVar);
        if (this.d.getSelectedTabPosition() < this.e.size() && lak.c(i((JSONObject) this.e.get(this.d.getSelectedTabPosition()))) != i) {
            return;
        }
        if (this.d.getSelectedTabPosition() != this.e.size() || i == this.f + 1) {
            e(((ICollectionService) this.c.getService(ICollectionService.class)).getCollectionDataCache(lak.c(str)), z, true);
            if (zArr[0] && zArr[1] && i > 0) {
                s(i);
            }
        }
    }

    public void m(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae386e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            ((IDataService) this.c.getService(IDataService.class)).requestListForCollection(z, null, i, new a(z, i));
        }
    }

    public void n(boolean z, int i, int i2, boolean[] zArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("566f37c3", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), zArr, new Integer(i3)});
            return;
        }
        IDataService iDataService = (IDataService) this.c.getService(IDataService.class);
        if (iDataService != null) {
            iDataService.requestListForCollection(z, null, i, new b(zArr, i3, i, z, i2));
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef84149a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1399e4", new Object[]{this, view});
            return;
        }
        int childAdapterPosition = this.b.getChildAdapterPosition(view);
        HashMap hashMap = new HashMap();
        if (childAdapterPosition >= 0 && childAdapterPosition < this.f27144a.size()) {
            hashMap.put(nz3.X_INDEX, String.valueOf(this.f27144a.get(childAdapterPosition).a()));
            hashMap.put(nz3.X_POSITION, String.valueOf(childAdapterPosition));
            xau.F(this.c, "Page_videointeract_Show-collection", hashMap);
        }
    }

    public final void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("728af3cb", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b("PopupDialog", "updateCellectionAfterTabSelected");
        this.b.post(new c(i));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f27145a;
        public final /* synthetic */ int b;

        public a(boolean z, int i) {
            this.f27145a = z;
            this.b = i;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
            } else if (hVar != null && hVar.g && r6k.a()) {
                ArrayList convertToMediaSetDataArrayList = ((IDataService) r6k.b(r6k.this).getService(IDataService.class)).convertToMediaSetDataArrayList(hVar);
                if (convertToMediaSetDataArrayList == null || convertToMediaSetDataArrayList.isEmpty()) {
                    i = -1;
                } else {
                    i = this.f27145a ? nz3.a((com.taobao.android.fluid.framework.data.datamodel.a) convertToMediaSetDataArrayList.get(0)) - 1 : nz3.a((com.taobao.android.fluid.framework.data.datamodel.a) convertToMediaSetDataArrayList.get(convertToMediaSetDataArrayList.size() - 1)) + 1;
                }
                if (i > 0) {
                    ir9.b("PopupDialog", "onLoadRequest 多请求一页:" + this.b + "->" + i);
                    ((IDataService) r6k.b(r6k.this).getService(IDataService.class)).requestListForCollection(this.f27145a, null, i, null);
                }
            }
        }
    }

    public final CharSequence f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("3e6051cb", new Object[]{this, str, str2});
        }
        String str3 = "第" + str + "集 | " + str2;
        SpannableString spannableString = new SpannableString(str3);
        int length = str.length() + 5;
        int length2 = str3.length();
        spannableString.setSpan(new AbsoluteSizeSpan(14, true), 0, length2, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#50607A")), 0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#11192D")), length, length2, 33);
        spannableString.setSpan(new StyleSpan(1), length, length2, 33);
        return spannableString;
    }

    public void o(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8742f9b5", new Object[]{this, new Boolean(z)});
            return;
        }
        CollectRequest collectRequest = new CollectRequest();
        collectRequest.setApiName(collectRequest.getApi());
        collectRequest.setNeedEcode(false);
        collectRequest.setNeedSession(false);
        collectRequest.setVersion(collectRequest.getVersion());
        if (z) {
            str = "99771";
        } else {
            str = "99769";
        }
        collectRequest.setEntityId(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject h = h();
        if (h != null) {
            jSONObject2.put("collectionId", h.get("collectionId"));
        }
        jSONObject2.put("source", (Object) "common_collection_VIDEO_TAB");
        collectRequest.setParams(jSONObject2.toJSONString());
        FluidSDK.getMTopAdapter().send(a.b.m().t(jSONObject).s(collectRequest).k(new e(z)).r(null).p(true).l(MediaMixContentDetailResponse.class).j());
    }

    public void r(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a67d08", new Object[]{this, hVar});
        } else if (hVar != null) {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.c.getService(IDataService.class)).getCurrentMediaSetData();
            if (!this.f27144a.isEmpty() && currentMediaSetData != null && currentMediaSetData.e() != null) {
                int a2 = this.f27144a.get(0).a();
                ArrayList<dz3> arrayList = this.f27144a;
                int a3 = arrayList.get(arrayList.size() - 1).a();
                int i = (int) hVar.f22810a.get(0).continuousSequenceNumber;
                List<MediaContentDetailData> list = hVar.f22810a;
                int i2 = (int) list.get(list.size() - 1).continuousSequenceNumber;
                ir9.b("PopupDialog", "tryInsertToCollectionPopCells: 当前cell范围：" + a2 + "->" + a3 + " target范围：" + i + "->" + i2);
                ArrayList convertToMediaSetDataArrayList = ((IDataService) this.c.getService(IDataService.class)).convertToMediaSetDataArrayList(hVar);
                if (i2 == a2 - 1) {
                    e(convertToMediaSetDataArrayList, true, false);
                } else if (i == a3 + 1) {
                    e(convertToMediaSetDataArrayList, false, false);
                }
            }
        }
    }

    public void e(ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList, boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ccd22c", new Object[]{this, arrayList, new Boolean(z), new Boolean(z2)});
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            com.taobao.android.fluid.framework.data.datamodel.a aVar = arrayList.get(i);
            if (aVar == null || arrayList.get(i).e() == null || arrayList.get(i).e().d == null || arrayList.get(i).e().p() == null) {
                StringBuilder sb = new StringBuilder("筛选展示广告：");
                sb.append(nz3.e(aVar));
                sb.append(",");
                if (aVar != null) {
                    str = aVar.d();
                } else {
                    str = "";
                }
                sb.append(str);
                ir9.b("PopupDialog", sb.toString());
            } else {
                JSONObject b2 = nz3.b(aVar);
                MediaContentDetailData.PlayletInfo playletInfo = aVar.i().playletInfo;
                if (b2 == null || playletInfo == null) {
                    ir9.b("PopupDialog", "cell 过滤：" + aVar.d());
                } else {
                    String string = b2.getString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
                    String string2 = b2.getString("index");
                    String string3 = b2.getString("contentTitle");
                    if (string3 == null) {
                        string3 = b2.getString("collectionName");
                    }
                    dz3 dz3Var = new dz3(f(string2, string3), b2.getString("durationStr"), string, arrayList.get(i).e().f(), lak.c(string2), playletInfo.free, playletInfo.locked);
                    dz3Var.h = playletInfo.contentPayableImgUrl;
                    dz3Var.i = nwv.t(playletInfo.tagWidth, 0);
                    dz3Var.j = nwv.t(playletInfo.tagHeight, 0);
                    arrayList2.add(dz3Var);
                }
            }
        }
        if (z2) {
            this.f27144a.clear();
            this.f27144a.addAll(arrayList2);
            this.b.getAdapter().notifyDataSetChanged();
        } else if (z) {
            SpeedAdustableRecylerView speedAdustableRecylerView = this.b;
            if (!(speedAdustableRecylerView == null || speedAdustableRecylerView.getAdapter() == null)) {
                this.f27144a.addAll(0, arrayList2);
                ir9.b("PopupDialog", "notifyItemRangeInserted:" + this.f27144a.size() + "," + arrayList2.size());
                this.b.getAdapter().notifyItemRangeInserted(0, arrayList2.size());
            }
        } else {
            SpeedAdustableRecylerView speedAdustableRecylerView2 = this.b;
            if (!(speedAdustableRecylerView2 == null || speedAdustableRecylerView2.getAdapter() == null)) {
                this.f27144a.addAll(arrayList2);
                int size = this.f27144a.size() - arrayList2.size();
                ir9.b("PopupDialog", "notifyItemRangeInserted:" + this.f27144a.size() + "," + arrayList2.size() + "startIndex:" + size);
                this.b.getAdapter().notifyItemRangeInserted(size, arrayList2.size());
            }
        }
    }
}
