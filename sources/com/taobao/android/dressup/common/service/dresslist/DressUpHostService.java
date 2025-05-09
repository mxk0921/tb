package com.taobao.android.dressup.common.service.dresslist;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dressup.base.infoflow.IDressUpHostService;
import com.taobao.android.dressup.base.infoflow.IDressUpPresentService;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.android.dressup.common.service.data.CommonDataService;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend4.manager.b;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.amb;
import tb.byb;
import tb.cf7;
import tb.cfc;
import tb.ckf;
import tb.e1c;
import tb.fnm;
import tb.fwa;
import tb.hpl;
import tb.lz7;
import tb.plk;
import tb.qpu;
import tb.r6o;
import tb.sg5;
import tb.sod;
import tb.t2o;
import tb.tep;
import tb.tpu;
import tb.ud0;
import tb.uun;
import tb.vjc;
import tb.wsq;
import tb.xmo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\b\u0004*\u0001t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00060\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0\u001bH\u0016¢\u0006\u0004\b,\u0010\u001dJ\u001f\u00101\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J%\u00105\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\u00072\n\u00104\u001a\u0006\u0012\u0002\b\u00030+H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020/2\f\u00104\u001a\b\u0012\u0002\b\u0003\u0018\u00010+H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010-2\u0006\u0010>\u001a\u00020/H\u0016¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010-2\u0006\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020/H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020/H\u0016¢\u0006\u0004\bG\u0010HJ!\u0010K\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0010H\u0016¢\u0006\u0004\bM\u0010\u0003J\u0015\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00102\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\u00102\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bV\u0010UJ\r\u0010W\u001a\u00020\u0010¢\u0006\u0004\bW\u0010\u0003J\r\u0010X\u001a\u00020\u0010¢\u0006\u0004\bX\u0010\u0003J\r\u0010Y\u001a\u00020\u0010¢\u0006\u0004\bY\u0010\u0003R\u0016\u0010Z\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020R0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010b\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fRH\u0010i\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00060gj\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR0\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170gj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010jR$\u0010n\u001a\u0012\u0012\u0004\u0012\u00020\u00040lj\b\u0012\u0004\u0012\u00020\u0004`m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00070p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v¨\u0006w"}, d2 = {"Lcom/taobao/android/dressup/common/service/dresslist/DressUpHostService;", "Lcom/taobao/android/dressup/base/infoflow/IDressUpHostService;", "<init>", "()V", "Lcom/taobao/android/dressup/common/model/CardModel;", "cardModel", "Ltb/fwa;", "Landroid/view/View;", "ensureComponent", "(Lcom/taobao/android/dressup/common/model/CardModel;)Ltb/fwa;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "node", "", "targetUserId", "", "result", "Ltb/xhv;", "findNodesByUserIdRecursively", "(Lcom/taobao/android/dinamicx/widget/DXWidgetNode;Ljava/lang/String;Ljava/util/List;)V", "originalView", "Landroid/widget/ImageView;", "getMainPicImageView", "(Landroid/view/View;)Landroid/widget/ImageView;", "Lcom/taobao/informationflowdataservice/dataservice/core/datasource/model/card/SectionModel;", "hostCard", "addGenerateParamsInCard", "(Lcom/taobao/informationflowdataservice/dataservice/core/datasource/model/card/SectionModel;)V", "", "findAttachedComponents", "()Ljava/util/List;", "", "findAttachedViewPositionRange", "()[I", "Ltb/qpu;", "context", "init", "(Ltb/qpu;)V", "Ltb/cfc;", "onCreateService", "(Ltb/cfc;)V", "onDestroyService", "getInfoFlowContext", "()Ltb/cfc;", "Lcom/taobao/infoflow/protocol/model/datamodel/card/BaseSectionModel;", "getHostDataSet", "Landroid/view/ViewGroup;", a.MSG_SOURCE_PARENT, "", hpl.VIEW_TYPE, "createHostView", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "view", "sectionData", "bindData", "(Landroid/view/View;Lcom/taobao/infoflow/protocol/model/datamodel/card/BaseSectionModel;)V", "getViewType", "(Lcom/taobao/infoflow/protocol/model/datamodel/card/BaseSectionModel;)I", "", b.KEY_IS_PULL_REFRESH, "notifyDataSetChanged", "(Z)V", "p0", "newState", "onScrollStateChanged", "(Landroid/view/ViewGroup;I)V", "dx", "dy", "onScrolled", "(Landroid/view/ViewGroup;II)V", "position", "", "calculateCardExposeRatio", "(I)D", "Lcom/alibaba/fastjson/JSONObject;", fnm.KEY_TARGET_PARAMS, "onDressUpInfoFlowCardClicked", "(Lcom/alibaba/fastjson/JSONObject;Landroid/view/View;)V", "removeSkeletonImage", "Landroidx/recyclerview/widget/RecyclerView;", OrderConfigs.RECYCLERVIEW, "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Ltb/e1c;", DataReceiveMonitor.CB_LISTENER, "addDressListListener", "(Ltb/e1c;)V", "removeDressListListener", "onComponentsAppear", "onComponentsDisAppear", "onComponentsDestroy", "turboEngineContext", "Ltb/qpu;", "infoFlowContext", "Ltb/cfc;", "Ltb/plk;", "listeners", "Ltb/plk;", "Lcom/taobao/android/dressup/common/service/data/CommonDataService;", "dataService", "Lcom/taobao/android/dressup/common/service/data/CommonDataService;", "Ltb/amb;", "cardService", "Ltb/amb;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "componentMap", "Ljava/util/HashMap;", "sectionModelMap", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cardModelList", "Ljava/util/ArrayList;", "", "viewMap", "Ljava/util/Map;", "Landroidx/recyclerview/widget/RecyclerView;", "com/taobao/android/dressup/common/service/dresslist/DressUpHostService$viewCacheExtension$1", "viewCacheExtension", "Lcom/taobao/android/dressup/common/service/dresslist/DressUpHostService$viewCacheExtension$1;", "turboflow_dressup_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressUpHostService implements IDressUpHostService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private amb cardService;
    private CommonDataService dataService;
    private cfc infoFlowContext;
    private RecyclerView recyclerView;
    private qpu turboEngineContext;
    private final plk<e1c> listeners = new plk<>();
    private final HashMap<CardModel, fwa<CardModel, View>> componentMap = new HashMap<>();
    private final HashMap<CardModel, SectionModel> sectionModelMap = new HashMap<>();
    private final ArrayList<CardModel> cardModelList = new ArrayList<>();
    private final Map<Integer, View> viewMap = new LinkedHashMap();
    private final DressUpHostService$viewCacheExtension$1 viewCacheExtension = new RecyclerView.ViewCacheExtension() { // from class: com.taobao.android.dressup.common.service.dresslist.DressUpHostService$viewCacheExtension$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(DressUpHostService$viewCacheExtension$1 dressUpHostService$viewCacheExtension$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dresslist/DressUpHostService$viewCacheExtension$1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
        public View getViewForPositionAndType(RecyclerView.Recycler recycler, int i, int i2) {
            ViewParent viewParent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("32697179", new Object[]{this, recycler, new Integer(i), new Integer(i2)});
            }
            View view = (View) DressUpHostService.access$getViewMap$p(DressUpHostService.this).get(Integer.valueOf(i2));
            View view2 = null;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof View) {
                view2 = viewParent;
            }
            return view2;
        }
    };

    static {
        t2o.a(918552696);
        t2o.a(918552604);
    }

    public static final /* synthetic */ Map access$getViewMap$p(DressUpHostService dressUpHostService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c0ff2515", new Object[]{dressUpHostService});
        }
        return dressUpHostService.viewMap;
    }

    private final void addGenerateParamsInCard(SectionModel sectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec1e595", new Object[]{this, sectionModel});
            return;
        }
        int intValue = sectionModel.getIntValue("type");
        sectionModel.put((SectionModel) "sectionBizCode", lz7.DRESS_UP_BIZ_CODE + intValue);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "columnType", "one");
        sectionModel.put((SectionModel) "template", (String) jSONObject);
    }

    private final fwa<CardModel, View> ensureComponent(CardModel cardModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fwa) ipChange.ipc$dispatch("8b70ce03", new Object[]{this, cardModel});
        }
        fwa<CardModel, View> fwaVar = this.componentMap.get(cardModel);
        if (fwaVar != null) {
            return fwaVar;
        }
        amb ambVar = this.cardService;
        if (ambVar != null) {
            fwa<CardModel, View> b0 = ambVar.b0(cardModel);
            this.componentMap.put(cardModel, b0);
            return b0;
        }
        ckf.y("cardService");
        throw null;
    }

    private final List<fwa<CardModel, View>> findAttachedComponents() {
        int i;
        int min;
        BaseComponent.State state;
        fwa<CardModel, View> fwaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("938ac68d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        int[] findAttachedViewPositionRange = findAttachedViewPositionRange();
        if (findAttachedViewPositionRange != null && (i = findAttachedViewPositionRange[0]) <= (min = Math.min(findAttachedViewPositionRange[1], this.cardModelList.size() - 1))) {
            while (true) {
                CardModel cardModel = this.cardModelList.get(i);
                fwa<CardModel, View> fwaVar2 = this.componentMap.get(cardModel);
                if (fwaVar2 != null) {
                    state = fwaVar2.getState();
                } else {
                    state = null;
                }
                if (!(state == BaseComponent.State.NOT_CREATE || (fwaVar = this.componentMap.get(cardModel)) == null)) {
                    arrayList.add(fwaVar);
                }
                if (i == min) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    private final int[] findAttachedViewPositionRange() {
        RecyclerView.LayoutManager layoutManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a8bd6e8b", new Object[]{this});
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        int childCount = layoutManager.getChildCount();
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = layoutManager.getChildAt(i3);
            if (childAt != null) {
                RecyclerView recyclerView2 = this.recyclerView;
                ckf.d(recyclerView2);
                RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(childAt);
                ckf.f(childViewHolder, "holder");
                int adapterPosition = childViewHolder.getAdapterPosition();
                if (adapterPosition != -1) {
                    i = Math.min(i, adapterPosition);
                    i2 = Math.max(i2, adapterPosition);
                }
            }
        }
        if (i <= i2) {
            return new int[]{i, i2};
        }
        return null;
    }

    private final void findNodesByUserIdRecursively(DXWidgetNode dXWidgetNode, String str, List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e56b19", new Object[]{this, dXWidgetNode, str, list});
            return;
        }
        if (ckf.b(dXWidgetNode.getUserId(), str)) {
            list.add(dXWidgetNode);
        }
        List<DXWidgetNode> children = dXWidgetNode.getChildren();
        if (children != null) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                ckf.f(dXWidgetNode2, "child");
                findNodesByUserIdRecursively(dXWidgetNode2, str, list);
            }
        }
    }

    private final ImageView getMainPicImageView(View view) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("7a15bf0a", new Object[]{this, view});
        }
        if ((view instanceof DXRootView) && (expandWidgetNode = ((DXRootView) view).getExpandWidgetNode()) != null) {
            ArrayList<DXWidgetNode> arrayList = new ArrayList();
            findNodesByUserIdRecursively(expandWidgetNode, "imageTransfer", arrayList);
            for (DXWidgetNode dXWidgetNode : arrayList) {
                WeakReference<View> wRView = dXWidgetNode.getWRView();
                if (wRView != null) {
                    View view2 = wRView.get();
                    if (view2 instanceof ImageView) {
                        return (ImageView) view2;
                    }
                }
            }
        }
        return null;
    }

    public final void addDressListListener(e1c e1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a753e550", new Object[]{this, e1cVar});
            return;
        }
        ckf.g(e1cVar, DataReceiveMonitor.CB_LISTENER);
        this.listeners.a(e1cVar);
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void bindData(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424acc", new Object[]{this, view, baseSectionModel});
            return;
        }
        ckf.g(baseSectionModel, "sectionData");
        if (view != null) {
            Object obj = baseSectionModel.get("data");
            ViewGroup viewGroup = null;
            if (!(obj instanceof CardModel)) {
                obj = null;
            }
            CardModel cardModel = (CardModel) obj;
            if (cardModel != null) {
                fwa<CardModel, View> ensureComponent = ensureComponent(cardModel);
                if (ensureComponent.getState() == BaseComponent.State.NOT_CREATE) {
                    ensureComponent.onCreate(cardModel, IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
                    ensureComponent.createView().setTag(R.id.turbo_tag_dresslist_component, ensureComponent);
                } else {
                    ensureComponent.updateData(cardModel);
                }
                View view2 = ensureComponent.getView();
                if (!ckf.b(view2 != null ? view2.getParent() : null, view)) {
                    View view3 = ensureComponent.getView();
                    ViewParent parent = view3 != null ? view3.getParent() : null;
                    if (parent instanceof ViewGroup) {
                        viewGroup = parent;
                    }
                    ViewGroup viewGroup2 = viewGroup;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(ensureComponent.getView());
                    }
                    ((FrameLayout) view).addView(ensureComponent.getView());
                }
            }
        }
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public double calculateCardExposeRatio(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c705b0b9", new Object[]{this, new Integer(i)})).doubleValue();
        }
        cfc cfcVar = this.infoFlowContext;
        if (cfcVar != null) {
            IDressUpPresentService iDressUpPresentService = (IDressUpPresentService) cfcVar.a(IDressUpPresentService.class);
            if (iDressUpPresentService != null) {
                return iDressUpPresentService.calculateCardExposeRatio(i);
            }
            return -1.0d;
        }
        ckf.y("infoFlowContext");
        throw null;
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public View createHostView(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("aeb23a56", new Object[]{this, viewGroup, new Integer(i)});
        }
        ckf.g(viewGroup, a.MSG_SOURCE_PARENT);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.viewMap.put(Integer.valueOf(i), frameLayout);
        return frameLayout;
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public cfc getInfoFlowContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        cfc cfcVar = this.infoFlowContext;
        if (cfcVar != null) {
            return cfcVar;
        }
        ckf.y("infoFlowContext");
        throw null;
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public int getViewType(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9fbda37", new Object[]{this, baseSectionModel})).intValue();
        }
        Object obj = baseSectionModel != null ? baseSectionModel.get("type") : null;
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    public final void init(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc7f5ab", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.turboEngineContext = qpuVar;
        sod service = qpuVar.getService(byb.class);
        if (service != null) {
            this.dataService = (CommonDataService) service;
            this.cardService = (amb) qpuVar.getService(amb.class);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.service.data.CommonDataService");
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void notifyDataSetChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4bab68", new Object[]{this, new Boolean(z)});
            return;
        }
        cfc cfcVar = this.infoFlowContext;
        if (cfcVar != null) {
            IDressUpPresentService iDressUpPresentService = (IDressUpPresentService) cfcVar.a(IDressUpPresentService.class);
            if (iDressUpPresentService != null) {
                iDressUpPresentService.notifyDataSetChanged(z, true);
                return;
            }
            return;
        }
        ckf.y("infoFlowContext");
        throw null;
    }

    public final void onComponentsAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac017d1", new Object[]{this});
            return;
        }
        Iterator<T> it = findAttachedComponents().iterator();
        while (it.hasNext()) {
            fwa fwaVar = (fwa) it.next();
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
            fwaVar.onStart(iComponentLifecycle$TriggerType);
            fwaVar.onResume(iComponentLifecycle$TriggerType);
        }
    }

    public final void onComponentsDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221705ec", new Object[]{this});
            return;
        }
        Collection<fwa<CardModel, View>> values = this.componentMap.values();
        ckf.f(values, "componentMap.values");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            fwa fwaVar = (fwa) it.next();
            if (fwaVar.getState() != BaseComponent.State.NOT_CREATE) {
                fwaVar.onDestroy(IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
            }
        }
    }

    public final void onComponentsDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5098675", new Object[]{this});
            return;
        }
        Iterator<T> it = findAttachedComponents().iterator();
        while (it.hasNext()) {
            fwa fwaVar = (fwa) it.next();
            IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType = IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE;
            fwaVar.onPause(iComponentLifecycle$TriggerType);
            fwaVar.onStop(iComponentLifecycle$TriggerType);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        ckf.g(cfcVar, "context");
        this.infoFlowContext = cfcVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void onScrollStateChanged(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        Log.e("DressUpHostService", "onScrollStateChanged");
        this.listeners.d(new DressUpHostService$onScrollStateChanged$1(viewGroup, i));
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void onScrolled(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else {
            this.listeners.d(new DressUpHostService$onScrolled$1(viewGroup, i, i2));
        }
    }

    public final void removeDressListListener(e1c e1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ee2ccd", new Object[]{this, e1cVar});
            return;
        }
        ckf.g(e1cVar, DataReceiveMonitor.CB_LISTENER);
        this.listeners.c(e1cVar);
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void removeSkeletonImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf5a1671", new Object[]{this});
            return;
        }
        qpu qpuVar = this.turboEngineContext;
        if (qpuVar != null) {
            fwa I = ((vjc) qpuVar.getService(vjc.class)).I();
            if (I instanceof uun) {
                ((uun) I).I();
                return;
            }
            return;
        }
        ckf.y("turboEngineContext");
        throw null;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
            return;
        }
        ckf.g(recyclerView, OrderConfigs.RECYCLERVIEW);
        recyclerView.setViewCacheExtension(this.viewCacheExtension);
        this.recyclerView = recyclerView;
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public List<BaseSectionModel<?>> getHostDataSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21db3446", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        CommonDataService commonDataService = this.dataService;
        Iterable iterable = null;
        if (commonDataService != null) {
            Object s = commonDataService.s();
            if (s instanceof PageModel) {
                iterable = s;
            }
            iterable = commonDataService.M1((PageModel) iterable);
        }
        this.cardModelList.clear();
        if (iterable != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                if (!TextUtils.isEmpty(((CardModel) obj).getType())) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                CardModel cardModel = (CardModel) it.next();
                int identityHashCode = System.identityHashCode(cardModel);
                fwa<CardModel, View> ensureComponent = ensureComponent(cardModel);
                if (ensureComponent instanceof sg5 ? ((sg5) ensureComponent).w(cardModel) : true) {
                    SectionModel sectionModel = this.sectionModelMap.get(cardModel);
                    if (sectionModel == null || cardModel.getDataChanged()) {
                        sectionModel = new SectionModel();
                        this.sectionModelMap.put(cardModel, sectionModel);
                    }
                    cardModel.setDataChanged(false);
                    sectionModel.put((SectionModel) "data", (String) cardModel);
                    sectionModel.put((SectionModel) "type", (String) Integer.valueOf(identityHashCode));
                    addGenerateParamsInCard(sectionModel);
                    arrayList.add(sectionModel);
                    this.cardModelList.add(cardModel);
                }
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.dressup.base.infoflow.IDressUpHostService
    public void onDressUpInfoFlowCardClicked(JSONObject jSONObject, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1abfdf1", new Object[]{this, jSONObject, view});
            return;
        }
        ckf.g(view, "view");
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("mainPicNative") : null;
        String string = jSONObject != null ? jSONObject.getString("title") : null;
        if (jSONObject2 != null) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put((JSONObject) "customTitle", string);
                jSONObject3.put((JSONObject) "content", (String) jSONObject4);
                jSONObject3.put((JSONObject) "cache", (String) Boolean.TRUE);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put((JSONObject) xmo.SP_KEY_MAIN_PIC_URL, jSONObject2.getString("url"));
                jSONObject5.put((JSONObject) "type", "pic");
                r6o.a aVar = r6o.Companion;
                qpu qpuVar = this.turboEngineContext;
                if (qpuVar != null) {
                    jSONObject5.put((JSONObject) "width", (String) Integer.valueOf(aVar.h(qpuVar.getContext())));
                    String string2 = jSONObject2.getString("dimension");
                    ckf.f(string2, "it.getString(\"dimension\")");
                    List z0 = wsq.z0(string2, new String[]{":"}, false, 0, 6, null);
                    jSONObject5.put((JSONObject) "height", (String) Float.valueOf(jSONObject5.getIntValue("width") / ((Integer.parseInt((String) z0.get(0)) * 1.0f) / Integer.parseInt((String) z0.get(1)))));
                    ImageView mainPicImageView = getMainPicImageView(view);
                    jSONObject5.put((JSONObject) "cacheDrawable", (String) (mainPicImageView != null ? mainPicImageView.getDrawable() : null));
                    jSONArray.add(jSONObject5);
                    jSONObject4.put((JSONObject) tep.KEY_UNIFORM_RESULT, (String) jSONArray);
                    ud0.Companion.f().d("mem", cf7.DETAIL_CACHE_KEY, jSONObject3);
                    tpu.a aVar2 = tpu.Companion;
                    StringBuilder sb = new StringBuilder("onDressUpInfoFlowCardClicked, update cache, hasCacheDrawable ");
                    if ((mainPicImageView != null ? mainPicImageView.getDrawable() : null) == null) {
                        z = false;
                    }
                    sb.append(z);
                    tpu.a.b(aVar2, "DressUpHostService", sb.toString(), null, 4, null);
                } else {
                    ckf.y("turboEngineContext");
                    throw null;
                }
            } catch (Throwable th) {
                tpu.Companion.a("DressUpHostService", "onDressUpInfoFlowCardClicked", th);
            }
        }
        if (jSONObject2 == null) {
            tpu.a.b(tpu.Companion, "DressUpHostService", "onDressUpInfoFlowCardClicked, no pic", null, 4, null);
            ud0.Companion.f().d("mem", cf7.DETAIL_CACHE_KEY, null);
        }
    }
}
