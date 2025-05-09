package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tgv implements i6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f28714a;
    public final ar9 b = new ar9("INTELLIGENCE-1009", "获取未曝光列表失败");

    static {
        t2o.a(468714220);
        t2o.a(468714219);
    }

    public tgv(FluidContext fluidContext) {
        this.f28714a = fluidContext;
    }

    @Override // tb.i6e
    public String getUnExposeIds() {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ff2b94", new Object[]{this});
        }
        List<MediaContentDetailData> unVisibleOrExposedItems = ((IDataService) this.f28714a.getService(IDataService.class)).getUnVisibleOrExposedItems(false, false);
        if (unVisibleOrExposedItems == null || unVisibleOrExposedItems.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (MediaContentDetailData mediaContentDetailData : unVisibleOrExposedItems) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            sb.append(mediaContentDetailData.id);
        }
        return sb.toString();
    }

    @Override // tb.i6e
    public List getUnExposeItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c74ff73", new Object[]{this});
        }
        List<MediaContentDetailData> unVisibleOrExposedItems = ((IDataService) this.f28714a.getService(IDataService.class)).getUnVisibleOrExposedItems(false, false);
        ArrayList arrayList = new ArrayList();
        for (MediaContentDetailData mediaContentDetailData : unVisibleOrExposedItems) {
            HashMap hashMap = new HashMap();
            hashMap.put("sectionBizCode", mediaContentDetailData.id);
            hashMap.put("utLogMapEdge", mediaContentDetailData.utLogMapEdge);
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    @Override // tb.i6e
    public List<MediaContentDetailData> getUnVisibleOrExposedItems(boolean z, boolean z2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae902e1a", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList mediaSetList = ((IDataService) this.f28714a.getService(IDataService.class)).getMediaSetList();
        int size = mediaSetList.size();
        int itemCount = ((IFeedsListService) this.f28714a.getService(IFeedsListService.class)).getMediaCardListAdapter().getItemCount();
        for (int i = 0; i < itemCount && i < size; i++) {
            a.d e = ((a) mediaSetList.get(i)).e();
            MediaContentDetailData g = e.g();
            if (!z || "VIDEO".equalsIgnoreCase(g.type)) {
                if (!z2 && !g.hasExposed) {
                    sb.append(g.id);
                    sb.append(",");
                    arrayList.add(g);
                } else if (z2 && g.hasExposed && !e.x()) {
                    sb.append(g.id);
                    sb.append(",");
                    arrayList.add(g);
                }
                sb2.append(g.id);
                sb2.append(",");
            }
        }
        StringBuilder sb3 = new StringBuilder("PickPreloadController，");
        if (z2) {
            str = "";
        } else {
            str = "未";
        }
        sb3.append(str);
        sb3.append("曝光，listsize=");
        sb3.append(arrayList.size());
        sb3.append(" ; [");
        sb3.append((Object) sb);
        sb3.append("]，Lits所有Id，listsize=");
        sb3.append(itemCount);
        sb3.append(" ; [");
        sb3.append((Object) sb2);
        sb3.append("]");
        ir9.b("UnexposedDataManager", sb3.toString());
        return arrayList;
    }

    @Override // tb.i6e
    public List<a.d> getUnExposedItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7da581d1", new Object[]{this});
        }
        LinkedList linkedList = new LinkedList();
        try {
            ir9.b("UnexposedDataManager", "getUnExposedItems: getMediaCardListAdapterSize:" + ((IFeedsListService) this.f28714a.getService(IFeedsListService.class)).getMediaCardListAdapter().getItemCount() + ";getMediaSetListSize:" + ((IDataService) this.f28714a.getService(IDataService.class)).getMediaSetList().size());
            for (int size = ((IDataService) this.f28714a.getService(IDataService.class)).getMediaSetList().size() - 1; size > -1; size--) {
                if (((IDataService) this.f28714a.getService(IDataService.class)).getMediaSetList().get(size) != null) {
                    a.d e = ((a) ((IDataService) this.f28714a.getService(IDataService.class)).getMediaSetList().get(size)).e();
                    MediaContentDetailData g = e.g();
                    if (g.isLocalPreCacheVideo || g.hasExposed) {
                        break;
                    }
                    linkedList.add(e);
                }
            }
            Collections.reverse(linkedList);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < linkedList.size(); i++) {
                sb.append(((a.d) linkedList.get(i)).f());
                sb.append(',');
            }
            ir9.b("UnexposedDataManager", "获取未曝光列表，获取的列表为：" + ((Object) sb));
            return linkedList;
        } catch (Throwable th) {
            ir9.b("UnexposedDataManager", "getUnExposedItemsError");
            FluidException.throwException(this.f28714a, this.b, th);
            linkedList.clear();
            return linkedList;
        }
    }
}
