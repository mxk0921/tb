package com.taobao.search.musie.list.horizontal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import java.util.List;
import tb.acx;
import tb.bsi;
import tb.ckf;
import tb.jrh;
import tb.t2o;
import tb.ude;
import tb.xpo;
import tb.yko;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class HorizontalXslLayout extends FrameLayout implements ude {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ItemSpacingDecoration itemDecoration;
    private final SimpleListAdapter listAdapter;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final acx<jrh> model;
    private JSONObject pageInfo;
    private RecyclerView recyclerView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/list/horizontal/HorizontalXslLayout$mount$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                HorizontalXslLayout.access$getListAdapter$p(HorizontalXslLayout.this).notifyDataSetChanged();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b extends xpo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/list/horizontal/HorizontalXslLayout$updateItemSpacing$1");
        }

        @Override // tb.xpo
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                HorizontalXslLayout.access$getRecyclerView$p(HorizontalXslLayout.this).invalidateItemDecorations();
            }
        }
    }

    static {
        t2o.a(815792736);
        t2o.a(993002008);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalXslLayout(Context context, acx<jrh> acxVar) {
        super(context);
        ckf.g(context, "context");
        ckf.g(acxVar, "model");
        this.model = acxVar;
        List i = yz3.i();
        bsi c = acxVar.c();
        ckf.f(c, "getMetaConfig(...)");
        SimpleListAdapter simpleListAdapter = new SimpleListAdapter((Activity) context, this, acxVar, i, c);
        this.listAdapter = simpleListAdapter;
        ItemSpacingDecoration itemSpacingDecoration = new ItemSpacingDecoration(0);
        this.itemDecoration = itemSpacingDecoration;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(simpleListAdapter);
        recyclerView.addItemDecoration(itemSpacingDecoration);
        this.recyclerView = recyclerView;
        addView(recyclerView, -1, -1);
    }

    public static final /* synthetic */ SimpleListAdapter access$getListAdapter$p(HorizontalXslLayout horizontalXslLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleListAdapter) ipChange.ipc$dispatch("808ef9a", new Object[]{horizontalXslLayout});
        }
        return horizontalXslLayout.listAdapter;
    }

    public static final /* synthetic */ RecyclerView access$getRecyclerView$p(HorizontalXslLayout horizontalXslLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a8772a5a", new Object[]{horizontalXslLayout});
        }
        return horizontalXslLayout.recyclerView;
    }

    public static /* synthetic */ Object ipc$super(HorizontalXslLayout horizontalXslLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/list/horizontal/HorizontalXslLayout");
    }

    public View findView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("86c73ae0", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ude
    public yko getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yko) ipChange.ipc$dispatch("ce8ff685", new Object[]{this});
        }
        yko c = this.model.e().c();
        ckf.f(c, "c(...)");
        return c;
    }

    public final void mount(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78316548", new Object[]{this, jSONArray});
            return;
        }
        ckf.g(jSONArray, HorizontalXslComponent.ATTR_ITEMS_ARRAY);
        BaseSearchResult baseSearchResult = new BaseSearchResult(getCore(), true);
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            baseSearchResult.addCell(getCore().b().b(jSONArray.getJSONObject(i), baseSearchResult, this.pageInfo));
        }
        this.listAdapter.setItems(baseSearchResult.getCells());
        this.mainHandler.post(new a());
    }

    public final void updateItemSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d76295", new Object[]{this, new Integer(i)});
        } else if (this.itemDecoration.a() != i) {
            this.itemDecoration.b(i);
            this.mainHandler.post(new b());
        }
    }

    public final void updateItemWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fb49f2", new Object[]{this, new Integer(i)});
        } else {
            this.listAdapter.o0(i);
        }
    }

    public final void updatePageInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c30743", new Object[]{this, jSONObject});
        } else {
            this.pageInfo = jSONObject;
        }
    }
}
