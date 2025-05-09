package com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView.HighlightContentListAdapter;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.List;
import tb.dxa;
import tb.fkx;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13077a;
    public final JSONArray b;
    public final ux9 c;
    public View d;
    public RecyclerView e;
    public HighlightContentListAdapter f;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0747a implements HighlightContentListAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dxa f13078a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshiftContent.listView.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C0748a implements b.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0748a() {
            }

            @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("de10db6e", new Object[]{this});
                }
            }

            @Override // com.taobao.taolive.movehighlight.bundle.timeshiftContent.b.a
            public void a(NetResponse netResponse) {
                JSONObject jSONObject;
                JSONArray jSONArray;
                HighlightContentListAdapter highlightContentListAdapter;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("28a16d86", new Object[]{this, netResponse});
                    return;
                }
                HighlightContentListAdapter highlightContentListAdapter2 = a.this.f;
                if (highlightContentListAdapter2 != null) {
                    highlightContentListAdapter2.e = false;
                }
                JSONObject jSONObject2 = (JSONObject) fkx.a(netResponse.getDataJsonObject().toString());
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("model")) != null && (jSONArray = jSONObject.getJSONArray("timeMovingList")) != null && jSONArray.size() > 0) {
                    C0747a.this.f13078a.l().f().e(jSONArray.size());
                    List<JSONObject> parseArray = JSON.parseArray(jSONArray.toJSONString(), JSONObject.class);
                    if (parseArray != null && (highlightContentListAdapter = a.this.f) != null) {
                        highlightContentListAdapter.O(parseArray);
                    }
                }
            }
        }

        public C0747a(dxa dxaVar) {
            this.f13078a = dxaVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9b1c610", new Object[]{this});
            } else if (this.f13078a.l() != null && this.f13078a.l().f() != null) {
                this.f13078a.l().f().c(new C0748a());
            }
        }
    }

    static {
        t2o.a(779092578);
    }

    public a(Context context, JSONArray jSONArray, ux9 ux9Var) {
        this.f13077a = context;
        this.b = jSONArray;
        this.c = ux9Var;
        b();
        a();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        List parseArray = JSON.parseArray(this.b.toJSONString(), JSONObject.class);
        dxa b = dxa.b(this.c);
        if (parseArray != null && parseArray.size() > 0) {
            HighlightContentListAdapter highlightContentListAdapter = new HighlightContentListAdapter(this.f13077a, parseArray, this.c);
            this.f = highlightContentListAdapter;
            this.e.setAdapter(highlightContentListAdapter);
            this.e.addItemDecoration(new SpacesItemDecoration());
            this.f.T(new C0747a(b), 3);
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(this.f13077a).inflate(R.layout.taolive_highligt_dx_content_list_layout, (ViewGroup) null);
        this.d = inflate;
        this.e = (RecyclerView) inflate.findViewById(R.id.taolive_higlight_dx_content_list);
        this.e.setLayoutManager(new LinearLayoutManager(this.f13077a, 0, false));
    }
}
