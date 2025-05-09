package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cz3 implements mkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f17459a;
    public int b = 0;
    public final w9q<com.taobao.android.fluid.framework.data.datamodel.a> c = new w9q<>(new a(this));
    public final HashMap<String, Float> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Comparator<com.taobao.android.fluid.framework.data.datamodel.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cz3 cz3Var) {
        }

        /* renamed from: a */
        public int compare(com.taobao.android.fluid.framework.data.datamodel.a aVar, com.taobao.android.fluid.framework.data.datamodel.a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66aa1495", new Object[]{this, aVar, aVar2})).intValue();
            }
            return Float.compare(nz3.e(aVar), nz3.e(aVar2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements spm<com.taobao.android.fluid.framework.data.datamodel.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.taobao.android.fluid.framework.data.datamodel.a f17460a;

        public b(cz3 cz3Var, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            this.f17460a = aVar;
        }

        /* renamed from: a */
        public boolean apply(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f02b2bd4", new Object[]{this, aVar})).booleanValue();
            }
            if (nz3.e(this.f17460a) == nz3.e(aVar)) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(468713671);
        t2o.a(468713679);
        t2o.a(468714178);
    }

    public cz3(FluidContext fluidContext) {
        this.f17459a = fluidContext;
        ((IDataService) fluidContext.getService(IDataService.class)).addListDataChangeListener(this);
    }

    public static /* synthetic */ FluidContext a(cz3 cz3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("26610d1e", new Object[]{cz3Var});
        }
        return cz3Var.f17459a;
    }

    public ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("beacf7f2", new Object[]{this, new Integer(i)});
        }
        return nz3.c(this.c, i);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30c8fd8a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public void d(kon.h hVar) {
        List<MediaContentDetailData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18a645b", new Object[]{this, hVar});
        } else if (hVar != null && (list = hVar.f22810a) != null && !list.isEmpty()) {
            h(hVar);
            Iterator it = ((IDataService) this.f17459a.getService(IDataService.class)).convertToMediaSetDataList(hVar.f22810a, hVar.c).iterator();
            while (it.hasNext()) {
                f((com.taobao.android.fluid.framework.data.datamodel.a) it.next());
            }
            ir9.b("CollectionPagingManager", "合集缓存更新了：" + iz3.a(this.c));
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7a6087f", new Object[]{this})).booleanValue();
        }
        FluidContext fluidContext = this.f17459a;
        if (!(fluidContext == null || fluidContext.getService(IDataService.class) == null)) {
            com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.f17459a.getService(IDataService.class)).getCurrentMediaSetData();
            int collectionTotal = ((ICollectionService) this.f17459a.getService(ICollectionService.class)).getCollectionTotal();
            if (nz3.a(currentMediaSetData) == collectionTotal && collectionTotal > 0) {
                return true;
            }
        }
        return false;
    }

    public void f(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12ecb4d", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (!this.c.c(new b(this, aVar))) {
                this.c.b(aVar);
            }
            this.d.put(aVar.d(), Float.valueOf(nz3.e(aVar)));
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62aa5758", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public boolean i(int i, sv2<kon.h> sv2Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebb9ff01", new Object[]{this, new Integer(i), sv2Var, new Boolean(z)})).booleanValue();
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> d = nz3.d(this.c, i, z, true);
        if (d.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray();
        Iterator<com.taobao.android.fluid.framework.data.datamodel.a> it = d.iterator();
        while (it.hasNext()) {
            com.taobao.android.fluid.framework.data.datamodel.a next = it.next();
            if (next != null) {
                arrayList.add(next.e().g());
                jSONArray.add(next.e().d);
            }
        }
        kon.h hVar = new kon.h(null, arrayList, jSONArray, null, null);
        h(hVar);
        nz3.i(this.f17459a, hVar, z);
        ((ICollectionService) this.f17459a.getService(ICollectionService.class)).updateCollectionDialog(hVar);
        if (sv2Var != null) {
            sv2Var.a(hVar);
        }
        return true;
    }

    @Override // tb.mkc
    public void onListDataAdd(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        JSONObject b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddce9d32", new Object[]{this, list});
        } else if (this.b <= 0) {
            for (com.taobao.android.fluid.framework.data.datamodel.a aVar : list) {
                if (!(aVar == null || (b2 = nz3.b(aVar)) == null)) {
                    this.b = nwv.t(b2.get("count"), 0);
                    return;
                }
            }
        }
    }

    @Override // tb.mkc
    public void onListDataChange(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54cd90ef", new Object[]{this, list});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f17461a;
        public final /* synthetic */ String b;

        public c(int i, String str) {
            this.f17461a = i;
            this.b = str;
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
                return;
            }
            if (hVar == null || !hVar.g) {
                ir9.b("CollectionPagingManager", "requestListForCollection 请求失败，弹错误toast");
                h1u.d(cz3.a(cz3.this).getContext(), "请稍后再试~");
            } else {
                ir9.b("CollectionPagingManager", "requestListForCollection 请求成功");
                ArrayList collectionDataCache = ((ICollectionService) cz3.a(cz3.this).getService(ICollectionService.class)).getCollectionDataCache(this.f17461a);
                if (!sz3.a(collectionDataCache)) {
                    ir9.b("CollectionPagingManager", "requestListForCollection 请求成功后有缓存数据，更新视频列表，并滚动");
                    ((IDataService) cz3.a(cz3.this).getService(IDataService.class)).setMediaSetAndScrollTo(collectionDataCache, true, this.b);
                    ((IDataService) cz3.a(cz3.this).getService(IDataService.class)).postLoadUpRunnable();
                } else {
                    ir9.b("CollectionPagingManager", "requestListForCollection 请求成功后无缓存数据，弹错误toast");
                    h1u.d(cz3.a(cz3.this).getContext(), "请稍后再试~");
                }
            }
            ((IContainerService) cz3.a(cz3.this).getService(IContainerService.class)).toggleCacheLoading(false);
        }
    }

    public final void h(kon.h hVar) {
        List<MediaContentDetailData> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c77b99", new Object[]{this, hVar});
        } else if (hVar != null && (list = hVar.f22810a) != null && !list.isEmpty()) {
            ArrayList mediaSetList = ((IDataService) this.f17459a.getService(IDataService.class)).getMediaSetList();
            int h = nz3.h(mediaSetList);
            int f = nz3.f(mediaSetList);
            int i = (int) hVar.f22810a.get(0).continuousSequenceNumber;
            List<MediaContentDetailData> list2 = hVar.f22810a;
            int i2 = (int) list2.get(list2.size() - 1).continuousSequenceNumber;
            ir9.b("CollectionPagingManager", "tryInsertToDetailList:现列表：" + h + "->" + f + ",新数据：" + i + "->" + i2);
            if (i == f + 1) {
                ((IDataService) this.f17459a.getService(IDataService.class)).appendDetailListAtLast(hVar);
            } else if (i2 == h - 1) {
                ((IDataService) this.f17459a.getService(IDataService.class)).appendDetailListAtFirst(hVar);
            }
        }
    }

    public void j(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e36eb", new Object[]{this, str, new Integer(i)});
            return;
        }
        ir9.b("CollectionPagingManager", "updateDetailListAndScrollTo: contentId：" + str + " , collectionIndex:" + i);
        if (!TextUtils.isEmpty(str) && i >= 0) {
            boolean scrollToItem = ((IFeedsListService) this.f17459a.getService(IFeedsListService.class)).scrollToItem(str);
            ir9.b("CollectionPagingManager", "scrollToItem: " + str + " , result:" + scrollToItem);
            if (!scrollToItem) {
                ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> b2 = b(i);
                if (!sz3.a(b2)) {
                    ((IDataService) this.f17459a.getService(IDataService.class)).setMediaSetAndScrollTo(b2, false, str);
                    ir9.b("CollectionPagingManager", "有缓存数据 更新视频列表，并滚动");
                    return;
                }
                ((IContainerService) this.f17459a.getService(IContainerService.class)).toggleCacheLoading(true);
                ((IDataService) this.f17459a.getService(IDataService.class)).requestListForCollection(false, null, i, new c(i, str));
            }
        }
    }
}
