package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kon;
import tb.w9q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class nz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String X_INDEX = "x_index";
    public static final String X_POSITION = "x_position";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements spm<com.taobao.android.fluid.framework.data.datamodel.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f25042a;

        public a(int i) {
            this.f25042a = i;
        }

        /* renamed from: a */
        public boolean apply(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f02b2bd4", new Object[]{this, aVar})).booleanValue();
            }
            if (nz3.e(aVar) == this.f25042a) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(468713677);
    }

    public static int a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777bb5a8", new Object[]{aVar})).intValue();
        }
        return (int) e(aVar);
    }

    public static JSONObject b(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("38cd3be0", new Object[]{aVar});
        }
        if (aVar == null || aVar.i() == null) {
            return null;
        }
        return aVar.i().collectionData;
    }

    public static ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> c(w9q<com.taobao.android.fluid.framework.data.datamodel.a> w9qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("68dacfb1", new Object[]{w9qVar, new Integer(i)});
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> d = d(w9qVar, i, true, true);
        if (!d.isEmpty()) {
            d.addAll(d(w9qVar, i, false, false));
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> d(w9q<com.taobao.android.fluid.framework.data.datamodel.a> w9qVar, int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("986f5071", new Object[]{w9qVar, new Integer(i), new Boolean(z), new Boolean(z2)});
        }
        ArrayList<com.taobao.android.fluid.framework.data.datamodel.a> arrayList = new ArrayList<>();
        w9q<com.taobao.android.fluid.framework.data.datamodel.a>.b<com.taobao.android.fluid.framework.data.datamodel.a> d = w9qVar.d(new a(i));
        if (d != null) {
            if (z2) {
                arrayList.add(d.f30547a);
            }
            if (!z) {
                w9q.b bVar = d.c;
                while (bVar != null) {
                    int a2 = a((com.taobao.android.fluid.framework.data.datamodel.a) bVar.f30547a);
                    if (a2 - i > 1) {
                        break;
                    }
                    arrayList.add(bVar.f30547a);
                    bVar = bVar.c;
                    i = Math.max(i, a2);
                }
            } else {
                w9q.b bVar2 = d.b;
                while (bVar2 != null) {
                    int a3 = a((com.taobao.android.fluid.framework.data.datamodel.a) bVar2.f30547a);
                    if (i - a3 > 1) {
                        break;
                    }
                    arrayList.add(0, bVar2.f30547a);
                    bVar2 = bVar2.b;
                    i = Math.min(i, a3);
                }
            }
        }
        return arrayList;
    }

    public static float e(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76fb58d5", new Object[]{aVar})).floatValue();
        }
        if (aVar != null && aVar.i() != null) {
            return aVar.i().continuousSequenceNumber;
        }
        ir9.b("CollectionPagingHelper", "mediaSetData取值错误 mediaSetData为" + aVar);
        return -1.0f;
    }

    public static int f(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b01844e", new Object[]{list})).intValue();
        }
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return a(list.get(list.size() - 1));
    }

    public static int g(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d75346b5", new Object[]{aVar})).intValue();
        }
        if (aVar != null && aVar.i() != null) {
            return aVar.i().sequenceNumber;
        }
        ir9.b("CollectionPagingHelper", "mediaSetData取值错误 mediaSetData为" + aVar);
        return -1;
    }

    public static int h(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80f3a4a7", new Object[]{list})).intValue();
        }
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return a(list.get(0));
    }

    public static void i(FluidContext fluidContext, kon.h hVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c315fd", new Object[]{fluidContext, hVar, new Boolean(z)});
            return;
        }
        ncp j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j != null && j.v) {
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            boolean isUpNoMoreData = ((IDataService) fluidContext.getService(IDataService.class)).isUpNoMoreData();
            boolean isDownNoMoreData = ((IDataService) fluidContext.getService(IDataService.class)).isDownNoMoreData();
            if (iMessageService != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("isTop", String.valueOf(z));
                hashMap.put("list", hVar.c);
                if (!z ? isDownNoMoreData : isUpNoMoreData) {
                    z2 = false;
                }
                hashMap.put("hasMore", String.valueOf(z2));
                iMessageService.sendMessage(new vrp("VSMSG_addList", "-1", hashMap));
            }
        }
    }

    public static void j(FluidContext fluidContext, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf97b54", new Object[]{fluidContext, new Boolean(z)});
        } else if (fluidContext != null) {
            a.d currentMediaDetail = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaDetail();
            if (currentMediaDetail != null) {
                str = currentMediaDetail.c;
            } else {
                str = "";
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap.put("loop", str2);
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new vrp("VSMSG_setForceLoop", str, hashMap));
        }
    }

    public static void k(List<MediaContentDetailData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428e1506", new Object[]{list});
        } else if (list != null) {
            float f = 0.0f;
            for (MediaContentDetailData mediaContentDetailData : list) {
                int i = mediaContentDetailData.sequenceNumber;
                if (i > 0) {
                    f = i;
                    mediaContentDetailData.continuousSequenceNumber = f;
                } else {
                    f += 0.01f;
                    mediaContentDetailData.continuousSequenceNumber = f;
                }
            }
        }
    }

    public static void l(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a490603", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(X_INDEX, String.valueOf(i2));
        hashMap.put(X_POSITION, String.valueOf(i));
        xau.E(fluidContext, "Button-collection", hashMap);
    }
}
