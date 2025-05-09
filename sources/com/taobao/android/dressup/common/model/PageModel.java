package com.taobao.android.dressup.common.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.MediaBrowserModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.afi;
import tb.ckf;
import tb.dun;
import tb.i04;
import tb.l18;
import tb.mqu;
import tb.qpu;
import tb.t2o;
import tb.wyf;
import tb.x83;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/taobao/android/dressup/common/model/PageModel;", "", "<init>", "()V", "Ltb/qpu;", "context", "Lcom/alibaba/fastjson/JSONObject;", "resData", "Ltb/xhv;", "updateData", "(Ltb/qpu;Lcom/alibaba/fastjson/JSONObject;)V", "", "businessId", "Ljava/lang/String;", "getBusinessId", "()Ljava/lang/String;", "setBusinessId", "(Ljava/lang/String;)V", "", "Lcom/taobao/android/dressup/common/model/CardModel;", "cardMap", "Ljava/util/Map;", "getCardMap", "()Ljava/util/Map;", "setCardMap", "(Ljava/util/Map;)V", "Lcom/taobao/android/dressup/common/model/RootModel;", "rootModel", "Lcom/taobao/android/dressup/common/model/RootModel;", "getRootModel", "()Lcom/taobao/android/dressup/common/model/RootModel;", "setRootModel", "(Lcom/taobao/android/dressup/common/model/RootModel;)V", "Lcom/taobao/android/dressup/common/model/LayoutModel;", "layout", "Lcom/taobao/android/dressup/common/model/LayoutModel;", "getLayout", "()Lcom/taobao/android/dressup/common/model/LayoutModel;", "setLayout", "(Lcom/taobao/android/dressup/common/model/LayoutModel;)V", "originData", "Lcom/alibaba/fastjson/JSONObject;", "getOriginData", "()Lcom/alibaba/fastjson/JSONObject;", "setOriginData", "(Lcom/alibaba/fastjson/JSONObject;)V", "Companion", "a", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class PageModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String businessId;
    private Map<String, CardModel> cardMap;
    private LayoutModel layout;
    private JSONObject originData;
    private RootModel rootModel;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552673);
        }

        public a() {
        }

        public final PageModel a(qpu qpuVar, Map<String, ? extends Object> map) {
            String root;
            Object obj;
            Object obj2;
            CardModel a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PageModel) ipChange.ipc$dispatch("391baf65", new Object[]{this, qpuVar, map});
            }
            ckf.g(qpuVar, "context");
            ckf.g(map, "data");
            PageModel pageModel = new PageModel();
            Object obj3 = map.get("businessId");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            pageModel.setBusinessId((String) obj3);
            Object obj4 = map.get("data");
            if (!(obj4 instanceof Map)) {
                obj4 = null;
            }
            Map map2 = (Map) obj4;
            if (map2 != null) {
                pageModel.setCardMap(new LinkedHashMap());
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Map<String, ? extends Object> h = mqu.Companion.h(entry.getValue(), null);
                    if (!(h == null || (a2 = x83.INSTANCE.a(qpuVar, h)) == null)) {
                        Map<String, CardModel> cardMap = pageModel.getCardMap();
                        ckf.d(cardMap);
                        cardMap.put(String.valueOf(key), a2);
                    }
                }
            }
            mqu.a aVar = mqu.Companion;
            Map<String, ? extends Object> h2 = aVar.h(map.get("layout"), null);
            if (h2 != null) {
                pageModel.setLayout(LayoutModel.Companion.a(h2));
            }
            LayoutModel layout = pageModel.getLayout();
            if (!(layout == null || (root = layout.getRoot()) == null)) {
                if (map2 != null) {
                    obj = map2.get(root);
                } else {
                    obj = null;
                }
                Map<String, Object> h3 = aVar.h(obj, null);
                if (!(h3 == null || (obj2 = h3.get("data")) == null || !(obj2 instanceof Map))) {
                    pageModel.setRootModel((RootModel) JSON.toJavaObject(new JSONObject(aVar.h(obj2, null)), RootModel.class));
                }
            }
            return pageModel;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552672);
    }

    public final String getBusinessId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        return this.businessId;
    }

    public final Map<String, CardModel> getCardMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e8220f2", new Object[]{this});
        }
        return this.cardMap;
    }

    public final LayoutModel getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutModel) ipChange.ipc$dispatch("8bec56d3", new Object[]{this});
        }
        return this.layout;
    }

    public final JSONObject getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d23a08d", new Object[]{this});
        }
        return this.originData;
    }

    public final RootModel getRootModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RootModel) ipChange.ipc$dispatch("dc1fe01c", new Object[]{this});
        }
        return this.rootModel;
    }

    public final void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
        } else {
            this.businessId = str;
        }
    }

    public final void setCardMap(Map<String, CardModel> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79425a74", new Object[]{this, map});
        } else {
            this.cardMap = map;
        }
    }

    public final void setLayout(LayoutModel layoutModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94906029", new Object[]{this, layoutModel});
        } else {
            this.layout = layoutModel;
        }
    }

    public final void setOriginData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5bbc97", new Object[]{this, jSONObject});
        } else {
            this.originData = jSONObject;
        }
    }

    public final void setRootModel(RootModel rootModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b35ac8", new Object[]{this, rootModel});
        } else {
            this.rootModel = rootModel;
        }
    }

    public final void updateData(qpu qpuVar, JSONObject jSONObject) {
        Collection<CardModel> values;
        afi afiVar;
        Map map;
        Double d;
        Long l;
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63862042", new Object[]{this, qpuVar, jSONObject});
            return;
        }
        ckf.g(qpuVar, "context");
        this.originData = jSONObject;
        Map<String, CardModel> map2 = this.cardMap;
        if (!(map2 == null || (values = map2.values()) == null)) {
            for (CardModel cardModel : values) {
                if (cardModel instanceof l18) {
                    ((l18) cardModel).e(jSONObject);
                } else if (cardModel instanceof MediaBrowserModel) {
                    MediaBrowserModel mediaBrowserModel = (MediaBrowserModel) cardModel;
                    List<afi> list = mediaBrowserModel.getList();
                    ArrayList arrayList = null;
                    if (list != null) {
                        afiVar = (afi) i04.c0(list);
                    } else {
                        afiVar = null;
                    }
                    Object j = mqu.Companion.j(jSONObject, "content.elements");
                    MediaBrowserModel.a aVar = MediaBrowserModel.Companion;
                    if (j instanceof List) {
                        arrayList = new ArrayList();
                        for (Object obj : (Iterable) j) {
                            if (obj instanceof Map) {
                                arrayList.add(obj);
                            }
                        }
                    } else if (j instanceof String) {
                        try {
                            JSONArray parseArray = JSON.parseArray((String) j);
                            if (parseArray != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : parseArray) {
                                    wyf b = dun.b(Map.class);
                                    if (ckf.b(b, dun.b(String.class))) {
                                        if (!(obj2 instanceof Map)) {
                                            obj2 = null;
                                        }
                                        map = (Map) obj2;
                                    } else if (ckf.b(b, dun.b(Integer.TYPE))) {
                                        if (!(obj2 instanceof Number)) {
                                            obj2 = null;
                                        }
                                        Number number = (Number) obj2;
                                        if (number != null) {
                                            num = Integer.valueOf(number.intValue());
                                        } else {
                                            num = null;
                                        }
                                        if (!(num instanceof Map)) {
                                            num = null;
                                        }
                                        map = (Map) num;
                                    } else if (ckf.b(b, dun.b(Long.TYPE))) {
                                        if (!(obj2 instanceof Number)) {
                                            obj2 = null;
                                        }
                                        Number number2 = (Number) obj2;
                                        if (number2 != null) {
                                            l = Long.valueOf(number2.longValue());
                                        } else {
                                            l = null;
                                        }
                                        if (!(l instanceof Map)) {
                                            l = null;
                                        }
                                        map = (Map) l;
                                    } else if (ckf.b(b, dun.b(Double.TYPE))) {
                                        if (!(obj2 instanceof Number)) {
                                            obj2 = null;
                                        }
                                        Number number3 = (Number) obj2;
                                        if (number3 != null) {
                                            d = Double.valueOf(number3.doubleValue());
                                        } else {
                                            d = null;
                                        }
                                        if (!(d instanceof Map)) {
                                            d = null;
                                        }
                                        map = (Map) d;
                                    } else if (ckf.b(b, dun.b(Boolean.TYPE))) {
                                        if (!(obj2 instanceof Map)) {
                                            obj2 = null;
                                        }
                                        map = (Map) obj2;
                                    } else if (ckf.b(b, dun.b(JSONObject.class))) {
                                        if (!(obj2 instanceof Map)) {
                                            obj2 = null;
                                        }
                                        map = (Map) obj2;
                                    } else {
                                        map = null;
                                    }
                                    if (map != null) {
                                        arrayList2.add(map);
                                    }
                                }
                                arrayList = arrayList2;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    mediaBrowserModel.setList(aVar.c(qpuVar, arrayList, afiVar));
                } else {
                    cardModel.setData(jSONObject);
                }
                cardModel.setDataChanged(true);
            }
        }
    }
}
