package com.taobao.android.live.plugin.atype.flexalocal.recommendpop;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.recommendpop.ListItemPopView;
import tb.amr;
import tb.fkx;
import tb.jw1;
import tb.ll6;
import tb.t2o;
import tb.ub5;
import tb.uv5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a extends jw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DXRootView n;
    public ItemInfo o;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.recommendpop.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class View$OnClickListenerC0449a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnClickListenerC0449a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            a.this.b.I(true, true);
            a aVar = a.this;
            aVar.b.W(aVar.m(), a.E(a.this));
        }
    }

    static {
        t2o.a(295699680);
    }

    public a(Context context, amr amrVar, String str) {
        super(context, amrVar, str);
    }

    public static /* synthetic */ ItemInfo E(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("4bab5b1b", new Object[]{aVar});
        }
        return aVar.o;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.j();
            return null;
        } else if (hashCode == -828692062) {
            return new Boolean(super.s());
        } else {
            if (hashCode == 166514888) {
                return new Boolean(super.v());
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/SingleItemPopView");
        }
    }

    @Override // tb.jw1
    public void D(boolean z) {
        JSONObject jSONObject;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f583c0", new Object[]{this, new Boolean(z)});
        } else if (this.n != null && (jSONObject = this.d) != null) {
            if (this.b.u() == null) {
                z2 = false;
            }
            jSONObject.put("isSupport0yg", (Object) Boolean.valueOf(z2));
            ll6.d(this.b.v(), this.n, new JSONObject(this.d), this.b.F());
        }
    }

    @Override // tb.jw1
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.j();
        this.n = null;
        this.o = null;
    }

    @Override // tb.jw1
    public ItemInfo n(uv5 uv5Var) {
        Object[] objArr;
        ItemInfo itemInfo;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemInfo) ipChange.ipc$dispatch("45ddda38", new Object[]{this, uv5Var});
        }
        if (!(uv5Var == null || (objArr = uv5Var.f29630a) == null || objArr.length < 5 || (itemInfo = this.o) == null || (jSONArray = itemInfo.cardInfoList) == null || jSONArray.size() <= 0)) {
            String str = (String) uv5Var.f29630a[4];
            if (!TextUtils.isEmpty(str)) {
                for (int i = 0; i < this.o.cardInfoList.size(); i++) {
                    ListItemPopView.ListItemInfo listItemInfo = (ListItemPopView.ListItemInfo) fkx.j(this.o.cardInfoList.getJSONObject(i), ListItemPopView.ListItemInfo.class);
                    JSONObject jSONObject = listItemInfo.item;
                    if (jSONObject != null && str.equals(jSONObject.getString("id"))) {
                        return listItemInfo;
                    }
                }
            }
        }
        return this.o;
    }

    @Override // tb.jw1
    public View p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.jw1
    public void y(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e111022", new Object[]{this, str, obj});
        } else {
            this.d.put(str, obj);
        }
    }

    @Override // tb.jw1
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9b29a2", new Object[]{this})).booleanValue();
        }
        if ("taolive_speedbump_panel".equals(this.g)) {
            return true;
        }
        return super.s();
    }

    @Override // tb.jw1
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ecd0c8", new Object[]{this})).booleanValue();
        }
        if ("taolive_speedbump_panel".equals(this.g)) {
            return true;
        }
        return super.v();
    }

    @Override // tb.jw1
    public void h() {
        String str;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e322dc8", new Object[]{this});
            return;
        }
        this.o = (ItemInfo) fkx.j(this.d, ItemInfo.class);
        ub5 v = this.b.v();
        Context context = this.f22251a;
        if (TextUtils.isEmpty(this.g)) {
            str = "taolive_newuser_panel";
        } else {
            str = this.g;
        }
        DXRootView a2 = ll6.a(v, context, str);
        this.n = a2;
        if (a2 != null) {
            FrameLayout frameLayout = new FrameLayout(this.f22251a);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(this.n, layoutParams);
            this.c.addView(frameLayout);
            frameLayout.setOnClickListener(new View$OnClickListenerC0449a());
            D(true);
            this.b.Z(r(), this.o);
            ItemInfo itemInfo = this.o;
            if (!(itemInfo == null || (jSONArray = itemInfo.cardInfoList) == null || jSONArray.size() <= 0)) {
                for (int i = 0; i < this.o.cardInfoList.size(); i++) {
                    this.b.Z("Newfans_exposure_item", (ListItemPopView.ListItemInfo) fkx.j(this.o.cardInfoList.getJSONObject(i), ListItemPopView.ListItemInfo.class));
                }
            }
        }
    }
}
