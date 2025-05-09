package com.taobao.search.musie.list.horizontal;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.search.musie.SearchMuiseViewHolder;
import java.util.List;
import tb.a07;
import tb.acx;
import tb.ckf;
import tb.cnx;
import tb.fxh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HorizontalXslComponent extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_ITEMS_ARRAY = "itemsArray";
    public static final String ATTR_ITEM_SPACING = "itemSpacing";
    public static final String ATTR_ITEM_WIDTH = "itemWidth";
    public static final String ATTR_PAGE_INFO = "pageInfo";
    public static final a Companion = new a(null);
    private boolean needRefresh;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792735);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792734);
    }

    public HorizontalXslComponent(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(HorizontalXslComponent horizontalXslComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -370110026) {
            super.collectBatchTasks((List) objArr[0]);
            return null;
        } else if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/list/horizontal/HorizontalXslComponent");
        }
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        cnx cnxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        ckf.g(context, "context");
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        SearchMuiseViewHolder searchMuiseViewHolder = null;
        if (tag instanceof cnx) {
            cnxVar = (cnx) tag;
        } else {
            cnxVar = null;
        }
        if (cnxVar instanceof SearchMuiseViewHolder) {
            searchMuiseViewHolder = (SearchMuiseViewHolder) cnxVar;
        }
        if (searchMuiseViewHolder == null) {
            return new View(context);
        }
        MODEL l0 = searchMuiseViewHolder.l0();
        ckf.e(l0, "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.search.refactor.MSDataSource>");
        return new HorizontalXslLayout(context, (acx) l0);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        if (obj instanceof HorizontalXslLayout) {
            HorizontalXslLayout horizontalXslLayout = (HorizontalXslLayout) obj;
            horizontalXslLayout.updateItemSpacing((int) fxh.e((String) getAttribute(ATTR_ITEM_SPACING)));
            horizontalXslLayout.updateItemWidth((int) fxh.e((String) getAttribute(ATTR_ITEM_WIDTH)));
            horizontalXslLayout.updatePageInfo((JSONObject) getAttribute(ATTR_PAGE_INFO));
            JSONArray jSONArray = (JSONArray) getAttribute(ATTR_ITEMS_ARRAY);
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            horizontalXslLayout.mount(jSONArray);
        }
    }

    @MUSNodeProp(name = ATTR_ITEM_SPACING, refresh = true)
    public final void refreshItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9c0a6", new Object[]{this, str});
        } else {
            this.needRefresh = true;
        }
    }

    @MUSNodeProp(name = ATTR_ITEMS_ARRAY, refresh = true)
    public final void refreshItemsArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35200363", new Object[]{this, jSONArray});
            return;
        }
        ckf.g(jSONArray, ATTR_ITEMS_ARRAY);
        this.needRefresh = true;
    }

    @MUSNodeProp(name = ATTR_ITEM_SPACING)
    public final void setItemSpacing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7423ff", new Object[]{this, str});
        } else {
            setAttribute(ATTR_ITEM_SPACING, str);
        }
    }

    @MUSNodeProp(name = ATTR_ITEM_WIDTH)
    public final void setItemWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a77802", new Object[]{this, str});
            return;
        }
        ckf.g(str, "width");
        setAttribute(ATTR_ITEM_WIDTH, str);
    }

    @MUSNodeProp(name = ATTR_ITEMS_ARRAY)
    public final void setItemsArray(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b998aa", new Object[]{this, jSONArray});
            return;
        }
        ckf.g(jSONArray, ATTR_ITEMS_ARRAY);
        setAttribute(ATTR_ITEMS_ARRAY, jSONArray);
    }

    @MUSNodeProp(name = ATTR_PAGE_INFO)
    public final void setPageInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34e084a", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, ATTR_PAGE_INFO);
        setAttribute(ATTR_PAGE_INFO, jSONObject);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        HorizontalXslLayout horizontalXslLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        ckf.g(list, "runnableList");
        super.collectBatchTasks(list);
        if (this.needRefresh && (horizontalXslLayout = (HorizontalXslLayout) getMountContent()) != null) {
            onMount(getInstance(), horizontalXslLayout);
            this.needRefresh = false;
        }
    }

    @MUSNodeProp(name = ATTR_ITEM_WIDTH, refresh = true)
    public final void refreshItemWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("542a1269", new Object[]{this, str});
            return;
        }
        ckf.g(str, "width");
        this.needRefresh = true;
    }

    @MUSNodeProp(name = ATTR_PAGE_INFO, refresh = true)
    public final void refreshPageInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a82e271", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, ATTR_PAGE_INFO);
        this.needRefresh = true;
    }
}
