package com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView.a;
import java.util.ArrayList;
import java.util.List;
import tb.axa;
import tb.dxa;
import tb.sbu;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class HighlightContentListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13074a;
    public final List<JSONObject> b;
    public final ux9 c;
    public int d = 0;
    public boolean e = false;
    public int f = 0;
    public b g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class TypeDX extends RecyclerView.ViewHolder {
        static {
            t2o.a(779092577);
        }

        public TypeDX(HighlightContentListAdapter highlightContentListAdapter, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13076a;
        public final /* synthetic */ int b;

        public a(JSONObject jSONObject, int i) {
            this.f13076a = jSONObject;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            dxa.b(HighlightContentListAdapter.M(HighlightContentListAdapter.this)).l().e(this.f13076a);
            TimeShiftContentFrame.selectedPosition = this.b;
            HighlightContentListAdapter.this.notifyDataSetChanged();
            sbu.e(HighlightContentListAdapter.M(HighlightContentListAdapter.this), "timeshiftlayer-tocontent", null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(779092573);
    }

    public HighlightContentListAdapter(Context context, List<JSONObject> list, ux9 ux9Var) {
        this.f13074a = context;
        this.c = ux9Var;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        O(list);
    }

    public static /* synthetic */ ux9 M(HighlightContentListAdapter highlightContentListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("d7ff7512", new Object[]{highlightContentListAdapter});
        }
        return highlightContentListAdapter.c;
    }

    public static /* synthetic */ int N(HighlightContentListAdapter highlightContentListAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b23f420d", new Object[]{highlightContentListAdapter, new Integer(i)})).intValue();
        }
        highlightContentListAdapter.d = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(HighlightContentListAdapter highlightContentListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 2130396206) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshiftContent/listView/HighlightContentListAdapter");
    }

    public void O(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c0b782", new Object[]{this, list});
        } else if (this.b != null && list != null) {
            for (JSONObject jSONObject : list) {
                if (!P(jSONObject)) {
                    ((ArrayList) this.b).add(jSONObject);
                }
            }
            notifyDataSetChanged();
        }
    }

    public final void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85f5c1b", new Object[]{this, new Integer(i)});
        } else if (this.g != null && i == Math.max((getItemCount() - 1) - this.f, 0) && this.d != 0 && !this.e) {
            this.e = true;
            ((a.C0747a) this.g).a();
        }
    }

    public final TypeDX S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeDX) ipChange.ipc$dispatch("1b52531c", new Object[]{this, str});
        }
        DXRootView a2 = axa.f().a(this.f13074a, str);
        if (a2 == null) {
            return new TypeDX(this, new View(this.f13074a));
        }
        return new TypeDX(this, a2);
    }

    public void T(b bVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ad5cd1", new Object[]{this, bVar, new Integer(i)});
            return;
        }
        this.g = bVar;
        this.f = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.b).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView.HighlightContentListAdapter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                if (str.hashCode() == 1361287682) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshiftContent/listView/HighlightContentListAdapter$2");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                HighlightContentListAdapter.N(HighlightContentListAdapter.this, i);
                super.onScrollStateChanged(recyclerView2, i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i < ((ArrayList) this.b).size()) {
            Q(i);
            JSONObject jSONObject = (JSONObject) ((ArrayList) this.b).get(i);
            if (jSONObject != null) {
                if (i == TimeShiftContentFrame.selectedPosition) {
                    jSONObject.put("isSelected", (Object) Boolean.TRUE);
                } else {
                    jSONObject.put("isSelected", (Object) Boolean.FALSE);
                }
                axa.f().h((DXRootView) viewHolder.itemView, (JSONObject) jSONObject.clone(), this.c);
                ViewProxy.setOnClickListener(viewHolder.itemView, new a(jSONObject, i));
                sbu.k(this.c, "Show-timeshift-contentlist", null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<JSONObject> list = this.b;
        if (list == null || ((ArrayList) list).size() != 1) {
            return S("highlight_content_list_item");
        }
        return S("highlight_content_single");
    }

    public final boolean P(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9626de8f", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            for (JSONObject jSONObject2 : this.b) {
                if (!(jSONObject2 == null || jSONObject2.getString("timeMovingId") == null || jSONObject.getString("timeMovingId") == null || !jSONObject2.getString("timeMovingId").equals(jSONObject.getString("timeMovingId")))) {
                    return true;
                }
            }
        }
        return false;
    }
}
