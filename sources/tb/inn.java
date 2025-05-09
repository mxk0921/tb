package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.ListRenderManager;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kon;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class inn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f21453a;
    public ListRenderManager.h f;
    public int g;
    public boolean i;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> c = new ArrayList<>();
    public final ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> d = new ArrayList<>();
    public final LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> e = new LinkedList<>();
    public final olk<mkc> h = new olk<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends jrf<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f21454a;
        public final /* synthetic */ vrp.a b;
        public final /* synthetic */ vx1 c;
        public final /* synthetic */ a.d d;
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a e;

        public a(long j, vrp.a aVar, vx1 vx1Var, a.d dVar, com.taobao.android.fluid.framework.data.datamodel.a aVar2) {
            this.f21454a = j;
            this.b = aVar;
            this.c = vx1Var;
            this.d = dVar;
            this.e = aVar2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/request/recommend/RecommendDataManager$1");
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            mtopResponse.setApi("refresh:" + mtopResponse.getApi());
            s0j.t(inn.a(inn.this), mtopResponse, this.f21454a, false);
            if (this.b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refreshStatus", "failed");
                hashMap.put("isLocked", "true");
                this.b.b(this.c, hashMap);
            }
        }

        /* renamed from: c */
        public void b(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c54449", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse});
                return;
            }
            mtopResponse.setApi("refresh:" + mtopResponse.getApi());
            if (jSONObject != null && mediaMixContentDetailResponse == null) {
                mediaMixContentDetailResponse = hrl.a(jSONObject);
            }
            if (jSONObject == null || mediaMixContentDetailResponse == null || (t = mediaMixContentDetailResponse.data) == 0) {
                s0j.t(inn.a(inn.this), mtopResponse, this.f21454a, false);
                return;
            }
            MediaContentDetailData mediaContentDetailData = (MediaContentDetailData) vt6.b(((MediaMixContentDetail) t).list);
            JSONArray d = vt6.d(jSONObject, "data", "sectionList");
            JSONObject jSONObject2 = (d == null || d.isEmpty()) ? null : d.getJSONObject(0);
            if (com.taobao.android.fluid.framework.data.datamodel.a.k(mediaContentDetailData) == -1 || jSONObject2 == null) {
                s0j.t(inn.a(inn.this), mtopResponse, this.f21454a, false);
                return;
            }
            a.d dVar = this.d;
            dVar.d = jSONObject2;
            dVar.E(mediaContentDetailData);
            s0j.t(inn.a(inn.this), mtopResponse, this.f21454a, true);
            int indexOfList = ((IDataService) inn.a(inn.this).getService(IDataService.class)).getIndexOfList(this.e);
            if (indexOfList == -1) {
                ir9.b("RecommendDataManager", "refreshCurrentData index==-1");
                return;
            }
            if (this.b != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refreshStatus", "success");
                if (this.d.p() != null) {
                    hashMap.put("isLocked", String.valueOf(this.d.p().locked));
                } else {
                    hashMap.put("isLocked", "true");
                }
                this.b.b(this.c, hashMap);
            }
            ((IFeedsListService) inn.a(inn.this).getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemChanged(indexOfList);
            ((ICollectionService) inn.a(inn.this).getService(ICollectionService.class)).invalidCollectionCache();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IMTopAdapter.a<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(inn innVar) {
        }

        /* renamed from: b */
        public MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("373d1124", new Object[]{this, bArr, cls});
            }
            if (ws6.d()) {
                return null;
            }
            return hrl.b(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((IFeedsListService) inn.a(inn.this).getService(IFeedsListService.class)).preloadNext(((ICardService) inn.a(inn.this).getService(ICardService.class)).getActiveCard(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((IFeedsListService) inn.a(inn.this).getService(IFeedsListService.class)).preloadNext(((ICardService) inn.a(inn.this).getService(ICardService.class)).getActiveCard(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((IFeedsListService) inn.a(inn.this).getService(IFeedsListService.class)).preloadNext(((IFeedsListService) inn.a(inn.this).getService(IFeedsListService.class)).getActiveCard(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements ListRenderManager.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f21458a;

        public f(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            this.f21458a = aVar;
        }

        @Override // com.taobao.android.fluid.framework.list.render.ListRenderManager.h
        public int a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3eaba227", new Object[]{this, aVar})).intValue();
            }
            return inn.b(inn.this).indexOf(this.f21458a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements ListRenderManager.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f21459a;

        public g(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            this.f21459a = aVar;
        }

        @Override // com.taobao.android.fluid.framework.list.render.ListRenderManager.h
        public int a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3eaba227", new Object[]{this, aVar})).intValue();
            }
            if (!inn.c(inn.this).isEmpty()) {
                return inn.b(inn.this).indexOf(aVar) - inn.b(inn.this).indexOf(this.f21459a);
            }
            if (inn.d(inn.this).contains(this.f21459a)) {
                i = inn.d(inn.this).indexOf(this.f21459a);
            }
            return inn.d(inn.this).indexOf(aVar) - i;
        }
    }

    static {
        t2o.a(468714287);
        t2o.a(468714285);
    }

    public inn(FluidContext fluidContext) {
        this.f21453a = fluidContext;
    }

    public static /* synthetic */ FluidContext a(inn innVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("c96c5978", new Object[]{innVar});
        }
        return innVar.f21453a;
    }

    public static /* synthetic */ ArrayList b(inn innVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("61d9bd6b", new Object[]{innVar});
        }
        return innVar.c;
    }

    public static /* synthetic */ LinkedList c(inn innVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("30e3161c", new Object[]{innVar});
        }
        return innVar.e;
    }

    public static /* synthetic */ ArrayList d(inn innVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e22f8aed", new Object[]{innVar});
        }
        return innVar.d;
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585bea37", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableRemoveCardRangeChange", true);
    }

    public final void B(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1106688", new Object[]{this, list});
        } else if (!sz3.a(list)) {
            for (mkc mkcVar : this.h.b()) {
                try {
                    mkcVar.onListDataAdd(Collections.unmodifiableList(list));
                } catch (Exception e2) {
                    FluidException.throwObserverCallbackException(this.f21453a, mkcVar, "notifyListDataAdd", e2);
                }
            }
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdd682e8", new Object[]{this});
            return;
        }
        for (mkc mkcVar : this.h.b()) {
            try {
                mkcVar.onListDataChange(x());
            } catch (Exception e2) {
                FluidException.throwObserverCallbackException(this.f21453a, mkcVar, "notifyListDataChange", e2);
            }
        }
    }

    public void E(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3da30", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.c.size()) {
            if (this.c.get(i).e().x()) {
                ((IDataService) this.f21453a.getService(IDataService.class)).setTab3CacheEnable(false);
            }
            this.c.remove(i);
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRemoved(i);
            if (A()) {
                ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i, this.c.size());
            }
            hr9.c(this.f21453a);
            C();
        }
    }

    public void F(List<String> list) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd2cae6", new Object[]{this, list});
        } else if (this.c.size() > 0 && list != null && !list.isEmpty()) {
            Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it = this.c.iterator();
            while (it.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a next = it.next();
                if (next != null && !sz3.a(next.f7799a) && (e2 = next.e()) != null && list.contains(e2.f())) {
                    it.remove();
                }
            }
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
            hr9.c(this.f21453a);
            C();
        }
    }

    public void G(String str) {
        a.d e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59e7615", new Object[]{this, str});
        } else if (this.c.size() > 0 && !TextUtils.isEmpty(str)) {
            Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it = this.c.iterator();
            while (it.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a next = it.next();
                if (next != null && !sz3.a(next.f7799a) && (e2 = next.e()) != null && str.equals(e2.d())) {
                    it.remove();
                }
            }
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
            hr9.c(this.f21453a);
            C();
        }
    }

    public void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5890d8d9", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void J(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b141ebd8", new Object[]{this, list});
            return;
        }
        boolean isInQuickOpenMode = ((IQuickOpenService) this.f21453a.getService(IQuickOpenService.class)).isInQuickOpenMode();
        L(list, true ^ isInQuickOpenMode);
        ir9.b("RecommendDataManager", " PickPreloadControllerNew，setMediaSet()，将detail数据增加到list中，hookRequestRecommend：");
        ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getRecyclerView().scrollToPosition(0);
        ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
        if (!isInQuickOpenMode) {
            ((IDataService) this.f21453a.getService(IDataService.class)).postLoadDownRunnable();
            ((IDataService) this.f21453a.getService(IDataService.class)).postLoadUpRunnable();
        }
    }

    public void K(List<com.taobao.android.fluid.framework.data.datamodel.a> list, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a4067a7", new Object[]{this, list, new Boolean(z), str});
            return;
        }
        L(list, z);
        ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyDataSetChanged();
        ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).scrollToItem(str);
    }

    public final void L(List<com.taobao.android.fluid.framework.data.datamodel.a> list, boolean z) {
        com.taobao.android.fluid.framework.data.datamodel.a h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdcd3497", new Object[]{this, list, new Boolean(z)});
            return;
        }
        ir9.a("changfeng", "VideoProcess PublicCardListController.setMediaSet(),PickPreloadControllerNew");
        if (!sz3.a(list) && (h = com.taobao.android.fluid.framework.data.datamodel.a.h(list)) != null) {
            if (((ICollectionService) this.f21453a.getService(ICollectionService.class)).isCollectionScene()) {
                if (h.e() != null) {
                    ((ICollectionService) this.f21453a.getService(ICollectionService.class)).putCollectionDataCache(h);
                } else {
                    return;
                }
            }
            if (z) {
                this.g++;
            }
            this.c.clear();
            this.d.clear();
            this.e.clear();
            ((IDataService) this.f21453a.getService(IDataService.class)).resetNoMoreDataFlag();
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).renderCacheVideo(null);
            this.c.addAll(list);
            this.d.addAll(list);
            if (pto.d(this.f21453a)) {
                this.f = new f(h);
            } else {
                this.f = new g(h);
            }
            B(list);
            C();
        }
    }

    public void f(mkc mkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9ef294", new Object[]{this, mkcVar});
        } else {
            this.h.a(mkcVar);
        }
    }

    public void g(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bfd5ef", new Object[]{this, hVar});
        } else {
            e(0, hVar);
        }
    }

    public void h(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e3ecd", new Object[]{this, hVar});
        } else {
            e(s().size(), hVar);
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e61f7cd", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public void j() {
        LinearLayoutManager layoutManager;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513a36f", new Object[]{this});
            return;
        }
        IFeedsListService iFeedsListService = (IFeedsListService) this.f21453a.getService(IFeedsListService.class);
        if (iFeedsListService != null && (layoutManager = iFeedsListService.getLayoutManager()) != null && !sz3.a(this.c)) {
            this.i = true;
            int findLastVisibleItemPosition = layoutManager.findLastVisibleItemPosition() + 1;
            if (findLastVisibleItemPosition < this.c.size()) {
                try {
                    ir9.b("RecommendDataManager", "clearListNextData,清除数据范围，nextPosition：" + findLastVisibleItemPosition + ",mMediaSetList.size():" + this.c.size());
                    ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList = this.c;
                    arrayList.subList(findLastVisibleItemPosition, arrayList.size()).clear();
                    MultiRecyclerViewAdapter mediaCardListAdapter = iFeedsListService.getMediaCardListAdapter();
                    if (mediaCardListAdapter != null) {
                        if (this.c.size() >= findLastVisibleItemPosition) {
                            i = this.c.size() - findLastVisibleItemPosition;
                        }
                        mediaCardListAdapter.notifyItemRangeRemoved(findLastVisibleItemPosition, i);
                        iFeedsListService.getRecyclerView().requestLayout();
                    }
                    C();
                } catch (Throwable th) {
                    th.printStackTrace();
                    ir9.c("RecommendDataManager", "clearListNextData", th);
                }
            }
        }
    }

    public ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> k(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d9eead36", new Object[]{this, hVar});
        }
        if (!hVar.c()) {
            return new ArrayList<>();
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList = new ArrayList<>();
        List<MediaContentDetailData> list = hVar.f22810a;
        JSONArray jSONArray = hVar.c;
        for (int i = 0; i < jSONArray.size(); i++) {
            MediaContentDetailData mediaContentDetailData = list.get(i);
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (-1 != com.taobao.android.fluid.framework.data.datamodel.a.k(mediaContentDetailData)) {
                arrayList.add(new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData, jSONObject));
            }
        }
        return arrayList;
    }

    public LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> l(List<MediaContentDetailData> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("71484afa", new Object[]{this, list, jSONArray});
        }
        LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> linkedList = new LinkedList<>();
        for (int i = 0; i < jSONArray.size(); i++) {
            MediaContentDetailData mediaContentDetailData = list.get(i);
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (-1 != com.taobao.android.fluid.framework.data.datamodel.a.k(mediaContentDetailData)) {
                linkedList.addLast(new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData, jSONObject));
            }
        }
        return linkedList;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedca28", new Object[]{this});
        }
        a.d currentMediaDetail = ((IDataService) this.f21453a.getService(IDataService.class)).getCurrentMediaDetail();
        if (currentMediaDetail != null) {
            return currentMediaDetail.f();
        }
        ir9.b("RecommendDataManager", "【getCurrentContentId】current MediaDetail is null");
        return null;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9b5b4c", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public a.d o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("548daa07", new Object[]{this});
        }
        int activePosition = ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getActivePosition();
        if (activePosition < 0 || activePosition >= this.c.size()) {
            return null;
        }
        return this.c.get(activePosition).e();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fde0424", new Object[]{this})).intValue();
        }
        return ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getActivePosition();
    }

    public com.taobao.android.fluid.framework.data.datamodel.a q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fluid.framework.data.datamodel.a) ipChange.ipc$dispatch("541847df", new Object[]{this});
        }
        int activePosition = ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getActivePosition();
        if (activePosition < 0 || activePosition >= this.c.size()) {
            return null;
        }
        return this.c.get(activePosition);
    }

    public int r(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d51cc26", new Object[]{this, aVar})).intValue();
        }
        if (aVar == null) {
            return -1;
        }
        return this.c.indexOf(aVar);
    }

    public ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e318faf3", new Object[]{this});
        }
        return this.c;
    }

    public ListRenderManager.h t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListRenderManager.h) ipChange.ipc$dispatch("d9fd5963", new Object[]{this});
        }
        return this.f;
    }

    public long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9235809", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue();
        }
        return this.c.size();
    }

    public ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("27e83b10", new Object[]{this});
        }
        return this.d;
    }

    public List<com.taobao.android.fluid.framework.data.datamodel.a> x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98383071", new Object[]{this});
        }
        return Collections.unmodifiableList(this.c);
    }

    public Handler y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a3d7e1fa", new Object[]{this});
        }
        return this.b;
    }

    public void z(kon.h hVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e481aa39", new Object[]{this, hVar});
            return;
        }
        int M = ((ICardService) this.f21453a.getService(ICardService.class)).getActiveCard().M();
        if (hVar != null) {
            int a2 = hVar.a();
            if (a2 == 0) {
                ((IDataService) this.f21453a.getService(IDataService.class)).addDetailList(M + 1, hVar);
                ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
                ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().post(new d());
            } else if (a2 < 0) {
                int i2 = M + a2 + 1;
                if (i2 >= 0) {
                    i = i2;
                }
                ((IDataService) this.f21453a.getService(IDataService.class)).addDetailList(i, hVar);
            } else {
                int i3 = M + a2;
                if (i3 > this.c.size()) {
                    i3 = this.c.size();
                }
                ((IDataService) this.f21453a.getService(IDataService.class)).addDetailList(i3, hVar);
                if (a2 == 1) {
                    ir9.a("PreLoadManagerNew", "insertDetailListAtCurrent preloadstatus---> insert index=" + i3 + " ");
                    ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
                    ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().post(new e());
                }
            }
        }
    }

    public void D(com.taobao.android.fluid.framework.data.datamodel.a aVar, vrp.a aVar2, vx1 vx1Var) {
        a.d e2;
        pep sessionParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cb0a19", new Object[]{this, aVar, aVar2, vx1Var});
        } else if (aVar != null && (e2 = aVar.e()) != null && (sessionParams = ((ISceneConfigService) this.f21453a.getService(ISceneConfigService.class)).getSessionParams()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ir9.a("RecommendDataManager", "refreshCurrentData");
            a aVar3 = new a(currentTimeMillis, aVar2, vx1Var, e2, aVar);
            b bVar = new b(this);
            IMTOPRequest e3 = jwi.e(this.f21453a, sessionParams, e2.f());
            HashMap hashMap = new HashMap();
            hashMap.put("asac", k1k.ASAC_VALUE);
            a.b s = a.b.m().s(e3);
            if (!ws6.i()) {
                hashMap = null;
            }
            FluidSDK.getMTopAdapter().send(s.v(hashMap).k(aVar3).r(bVar).p(true).u("detail_reload-cell").l(MediaMixContentDetailResponse.class).j());
        }
    }

    public void H(kon.h hVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba9906a", new Object[]{this, hVar, str});
        } else if (hVar != null && !hVar.b() && !TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                if (i >= this.c.size()) {
                    i = -1;
                    break;
                }
                a.d e2 = this.c.get(i).e();
                if (e2 != null && str.equals(e2.f())) {
                    break;
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= this.e.size()) {
                    i2 = -1;
                    break;
                }
                a.d e3 = this.e.get(i2).e();
                if (e3 != null && str.equals(e3.f())) {
                    break;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.d.size()) {
                    i3 = -1;
                    break;
                }
                a.d e4 = this.d.get(i3).e();
                if (e4 != null && str.equals(e4.f())) {
                    break;
                }
                i3++;
            }
            if (i == -1) {
                ir9.b("RecommendDataManager", "replace未找到数据:" + str);
                return;
            }
            new LinkedList();
            if (hVar.d() && i2 != -1) {
                LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> l = l(hVar.d, hVar.e);
                this.e.remove(i2);
                this.e.addAll(i2, l);
            }
            LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> linkedList = new LinkedList<>();
            if (hVar.c()) {
                linkedList = l(hVar.f22810a, hVar.c);
                this.c.remove(i);
                this.c.addAll(i, linkedList);
                if (i3 != -1) {
                    this.d.remove(i3);
                    this.d.addAll(i3, linkedList);
                }
                B(linkedList);
                C();
            }
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i, linkedList.size());
            hr9.c(this.f21453a);
            if (i == ((IDataService) this.f21453a.getService(IDataService.class)).getCurrentMediaPosition() + 1) {
                ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
                ((IDataService) this.f21453a.getService(IDataService.class)).getmPreloadNextHandler().post(new c());
            }
        }
    }

    public int e(int i, kon.h hVar) {
        com.taobao.android.fluid.framework.data.datamodel.a next;
        int f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dccd59b3", new Object[]{this, new Integer(i), hVar})).intValue();
        }
        ir9.b("RecommendDataManager", "addDetailList " + i);
        if (hVar == null) {
            return 0;
        }
        if ((!hVar.c() && !hVar.d()) || i < 0 || i > this.c.size()) {
            return 0;
        }
        if (hVar.d()) {
            this.e.addAll(l(hVar.d, hVar.e));
        }
        LinkedList<com.taobao.android.fluid.framework.data.datamodel.a> l = hVar.c() ? l(hVar.f22810a, hVar.c) : null;
        int findLastVisibleItemPosition = ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getLayoutManager().findLastVisibleItemPosition();
        StringBuilder sb = new StringBuilder("recommend 插入数据，tempList ");
        String str = "null";
        sb.append(l != null ? Integer.valueOf(l.size()) : str);
        ir9.b("RecommendDataManager", sb.toString());
        if (findLastVisibleItemPosition >= 0 && i > findLastVisibleItemPosition && !this.e.isEmpty()) {
            int size = this.c.size();
            int i2 = findLastVisibleItemPosition + 1;
            int i3 = i2;
            while (i3 < this.c.size()) {
                com.taobao.android.fluid.framework.data.datamodel.a aVar = this.c.get(i3);
                if (com.taobao.android.fluid.framework.data.datamodel.a.f(aVar) > 0) {
                    aVar.p(false);
                    this.c.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (l != null && !l.isEmpty()) {
                if (i > this.c.size()) {
                    i = this.c.size();
                }
                this.c.addAll(i, l);
                B(l);
            }
            Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it = this.e.iterator();
            while (it.hasNext() && (f2 = com.taobao.android.fluid.framework.data.datamodel.a.f((next = it.next()))) <= this.c.size()) {
                if (f2 > findLastVisibleItemPosition && !next.o() && (f2 >= this.c.size() || com.taobao.android.fluid.framework.data.datamodel.a.f(this.c.get(f2)) <= 0)) {
                    next.p(true);
                    this.c.add(f2, next);
                    B(Collections.singletonList(next));
                }
            }
            int size2 = this.c.size();
            int i4 = size2 - size;
            ir9.b("RecommendDataManager", "(PreLoadManagerNew) curSize:" + size2 + " lastSize:" + size + " insertSize:" + i4 + " curPosition:" + findLastVisibleItemPosition);
            if (i4 > 0) {
                ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeInserted(i2, i4);
            } else if (i4 < 0) {
                ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeRemoved(i2, i4);
            }
            int i5 = (size2 - findLastVisibleItemPosition) - 1;
            if (i5 > 0) {
                ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(i2, i5);
            }
            hr9.c(this.f21453a);
            C();
            return i4;
        } else if (l == null) {
            return 0;
        } else {
            int size3 = this.c.size();
            try {
                if (i <= 0) {
                    this.d.addAll(0, l);
                } else if (i >= this.c.size()) {
                    this.d.addAll(l);
                } else {
                    this.d.addAll(this.d.indexOf(this.c.get(i - 1)) + 1, l);
                }
            } catch (Exception e2) {
                ir9.c("RecommendDataManager", "", e2);
            }
            this.c.addAll(i, l);
            if (("(PreLoadManagerNew) end add detail at " + i + " " + l) != null) {
                str = String.valueOf(l.size());
            } else {
                if (("null curPosition:" + findLastVisibleItemPosition + " ; lastSize=" + size3 + " curSize=" + this.c) != null) {
                    str = String.valueOf(this.c.size());
                }
            }
            ir9.b("RecommendDataManager", str);
            ((IFeedsListService) this.f21453a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeInserted(i, l.size());
            hr9.c(this.f21453a);
            B(l);
            C();
            return l.size();
        }
    }
}
