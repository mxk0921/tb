package com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.view;

import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder.PanelItemViewHolder;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder.PanelTitleViewHolder;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.hpl;
import tb.i2b;
import tb.nmb;
import tb.o7d;
import tb.r5a;
import tb.t2o;
import tb.vaj;
import tb.xf3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PanelCategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements nmb, o7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12478a;
    public boolean b;
    public List<JSONObject> c;
    public PanelStyleModel d;
    public final o7d e;
    public boolean h;
    public final Map<String, List<JSONObject>> g = new LinkedHashMap();
    public final xf3 f = new xf3();

    static {
        t2o.a(729809562);
        t2o.a(729809558);
        t2o.a(729809552);
    }

    public PanelCategoryAdapter(o7d o7dVar) {
        this.e = o7dVar;
    }

    public static /* synthetic */ Object ipc$super(PanelCategoryAdapter panelCategoryAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/viewprovider/tablayout/panel/view/PanelCategoryAdapter");
    }

    @Override // tb.o7d
    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f9887f3", new Object[]{this})).booleanValue();
        }
        return this.f12478a;
    }

    @Override // tb.nmb
    public void F(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b784a3", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void N(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a246b04", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(vaj.KEY_TAB_ID, (Object) str2);
        jSONObject.put("from", (Object) Integer.valueOf(i));
        jSONObject.put("to", (Object) Integer.valueOf(i2));
        r5a.j("Page_Home", 2101, str, "", "", jSONObject);
    }

    public final void O(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263d272a", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String str = this.d.panelExposureArg1;
            if (!TextUtils.isEmpty(str) && (jSONObject2 = jSONObject.getJSONObject(i2b.TRACK_EXPOSURE_PARAM)) != null) {
                jSONObject2.put("arg1", (Object) str);
                jSONObject.put("isTracked", (Object) Boolean.FALSE);
                r5a.l(jSONObject);
            }
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0521620", new Object[]{this})).booleanValue();
        }
        this.e.m();
        if (!this.f12478a || !this.b) {
            return false;
        }
        return true;
    }

    public final Map<String, List<JSONObject>> V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c3847098", new Object[]{this});
        }
        Set<Map.Entry> entrySet = ((LinkedHashMap) this.g).entrySet();
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject = this.c.get(i);
            String g = hpl.g(this.c.get(i));
            for (Map.Entry entry : entrySet) {
                if (TextUtils.equals(g, (CharSequence) entry.getKey())) {
                    ((List) entry.getValue()).add(jSONObject);
                }
            }
        }
        return this.g;
    }

    public final int X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3905f66", new Object[]{this})).intValue();
        }
        Pair<Integer, Integer> Y = Y(hpl.MY_CHANNEL);
        return (((Integer) Y.second).intValue() - ((Integer) Y.first).intValue()) + 1;
    }

    public final Pair<Integer, Integer> Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6972f57f", new Object[]{this, str});
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (TextUtils.equals(hpl.g(this.c.get(i3)), str)) {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3;
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public boolean a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12be64fe", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void d0(int i, int i2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a302e900", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.m();
        List<JSONObject> list = this.c;
        if (list != null) {
            JSONObject jSONObject3 = list.get(i);
            JSONObject jSONObject4 = this.c.get(i2);
            if (jSONObject3 != null && jSONObject4 != null && (jSONObject = jSONObject3.getJSONObject("content")) != null && jSONObject.getBooleanValue(hpl.IS_EDITABLE) && (jSONObject2 = jSONObject4.getJSONObject("content")) != null && jSONObject2.getBooleanValue(hpl.IS_EDITABLE)) {
                String string = jSONObject.getString(hpl.CURRENT_MENU_CODE);
                String string2 = jSONObject2.getString(hpl.CURRENT_MENU_CODE);
                if (TextUtils.equals(string, hpl.MY_CHANNEL) && TextUtils.equals(string2, hpl.MY_CHANNEL)) {
                    this.c.remove(i);
                    this.c.add(i2, jSONObject3);
                    notifyItemMoved(i, i2);
                    N("Page_Home_Button-categoryTab-adjust", jSONObject.getString(vaj.KEY_TAB_ID), i, i2);
                }
            }
        }
    }

    public void e0(List<JSONObject> list, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fae42e", new Object[]{this, list, panelStyleModel});
            return;
        }
        this.c = list;
        this.d = panelStyleModel;
        this.h = false;
        P(list);
    }

    @Override // tb.o7d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85541df", new Object[]{this});
        } else {
            f0(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // tb.o7d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fcc21e", new Object[]{this});
        }
    }

    @Override // tb.nmb
    public void n(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac16df3", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            jSONObject2.put(hpl.IS_CLICK, (Object) Boolean.TRUE);
            this.e.onClose();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (viewHolder instanceof PanelTitleViewHolder) {
            PanelTitleViewHolder panelTitleViewHolder = (PanelTitleViewHolder) viewHolder;
            ((StaggeredGridLayoutManager.LayoutParams) panelTitleViewHolder.itemView.getLayoutParams()).setFullSpan(true);
            panelTitleViewHolder.d0(this.c.get(i));
        }
        if (viewHolder instanceof PanelItemViewHolder) {
            ((PanelItemViewHolder) viewHolder).f0(this.c.get(i), this.d);
            O(this.c.get(i));
        }
    }

    @Override // tb.o7d
    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
            return;
        }
        f0(false);
        this.h = hpl.c(V());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return this.f.a(viewGroup, i, this, this);
    }

    @Override // tb.nmb
    public void u(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a069853", new Object[]{this, jSONObject});
            return;
        }
        this.e.m();
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            String string = jSONObject2.getString(hpl.CURRENT_MENU_CODE);
            if (S(jSONObject, string)) {
                int indexOf = this.c.indexOf(jSONObject);
                this.c.remove(indexOf);
                notifyItemRemoved(indexOf);
                b0(jSONObject, string);
                M(jSONObject2.getString(hpl.MENU_CODE), indexOf);
            }
        }
    }

    @Override // tb.o7d
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("901b9a6e", new Object[]{this});
        } else {
            f0(false);
        }
    }

    public final JSONObject U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e69b7d5a", new Object[]{this, str});
        }
        JSONObject jSONObject = null;
        for (JSONObject jSONObject2 : this.c) {
            if (jSONObject2.getIntValue(hpl.VIEW_TYPE) == 1 && TextUtils.equals(jSONObject2.getString(hpl.MENU_CODE), str)) {
                jSONObject = jSONObject2;
            }
        }
        return jSONObject;
    }

    public final int Z(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a99f695", new Object[]{this, str, new Integer(i)})).intValue();
        }
        JSONObject U = U(str);
        if (U == null) {
            return -1;
        }
        String string = U.getString(hpl.ALL_ADDED_TEXT);
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            string = "已全部添加到“我的频道”";
        }
        jSONObject.put(hpl.ALL_ADDED_TEXT, (Object) string);
        jSONObject.put(hpl.VIEW_TYPE, (Object) 3);
        jSONObject.put(hpl.ALL_ADDED_TEXT_COLOR, (Object) Integer.valueOf(hpl.e(U.getString(hpl.ALL_ADDED_TEXT_COLOR), "#999999")));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(hpl.CURRENT_MENU_CODE, (Object) str);
        jSONObject.put("content", (Object) jSONObject2);
        if (!Q(i)) {
            return -1;
        }
        this.c.add(i, jSONObject);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<JSONObject> list = this.c;
        if (list == null || (jSONObject = list.get(i)) == null) {
            return 0;
        }
        return jSONObject.getIntValue(hpl.VIEW_TYPE);
    }

    public final void M(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da797fb8", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.equals(str, hpl.MY_CHANNEL) && !TextUtils.isEmpty(str)) {
            Pair<Integer, Integer> Y = Y(str);
            if (((Integer) Y.first).intValue() == -1 && ((Integer) Y.second).intValue() == -1) {
                int i2 = i + 1;
                if (Z(str, i2) != -1) {
                    notifyItemInserted(i2);
                    return;
                }
                return;
            }
            for (int intValue = ((Integer) Y.first).intValue(); intValue <= ((Integer) Y.second).intValue(); intValue++) {
                JSONObject jSONObject = this.c.get(intValue);
                if (jSONObject != null && jSONObject.getIntValue(hpl.VIEW_TYPE) == 3) {
                    this.c.remove(intValue);
                    notifyItemRemoved(intValue);
                    return;
                }
            }
        }
    }

    public final void P(List<JSONObject> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55987ae5", new Object[]{this, list});
            return;
        }
        ((LinkedHashMap) this.g).clear();
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (JSONObject jSONObject2 : list) {
            int intValue = jSONObject2.getIntValue(hpl.VIEW_TYPE);
            if (intValue == 1) {
                this.g.put(jSONObject2.getString(hpl.MENU_CODE), new ArrayList());
                hashMap.put(jSONObject2.getString(hpl.MENU_CODE), jSONObject2);
            }
            if (intValue == 2 && (jSONObject = jSONObject2.getJSONObject("content")) != null) {
                String string = jSONObject.getString(hpl.CURRENT_MENU_CODE);
                if (hashMap.containsKey(string)) {
                    Integer num = (Integer) linkedHashMap.get(string);
                    linkedHashMap.put(string, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                }
            }
        }
        for (String str : hashMap.keySet()) {
            Integer num2 = (Integer) linkedHashMap.get(str);
            if (num2 == null || num2.intValue() == 0) {
                Z(str, this.c.indexOf(hashMap.get(str)) + 1);
            }
        }
    }

    public final boolean Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45878ac4", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Pair<Integer, Integer> Y = Y(hpl.MY_CHANNEL);
        if (i >= ((Integer) Y.first).intValue() - 1 && i <= ((Integer) Y.second).intValue()) {
            return false;
        }
        boolean z = false;
        for (int i2 = i - 1; i2 < i + 1; i2++) {
            if (i2 <= this.c.size() - 1) {
                JSONObject jSONObject = this.c.get(i2);
                if (jSONObject == null || jSONObject.getIntValue(hpl.VIEW_TYPE) == 3) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean S(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9deb0105", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (!TextUtils.equals(str, hpl.MY_CHANNEL)) {
            return true;
        }
        JSONObject U = U(str);
        int i = 7;
        String str2 = "频道不能再少了哦~";
        if (U != null) {
            if (!TextUtils.isEmpty(U.getString(hpl.MIN_NUMS_WARNING))) {
                str2 = U.getString(hpl.MIN_NUMS_WARNING);
            }
            if (U.getIntValue(hpl.MY_CHANNEL_MIN_NUMS) != 0) {
                i = U.getIntValue(hpl.MY_CHANNEL_MIN_NUMS);
            }
        }
        if (X() > i) {
            return true;
        }
        TBToast.makeText(Globals.getApplication(), str2, 0L).show();
        return false;
    }

    public int W(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cbce345b", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject2 = this.c.get(i);
            if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("content")) == null || !TextUtils.equals(str, jSONObject.getString(vaj.KEY_TAB_ID)))) {
                return i;
            }
        }
        return -1;
    }

    public final void b0(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        String str2;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973f28a8", new Object[]{this, jSONObject, str});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("content")) != null) {
            String string = jSONObject2.getString(hpl.MENU_CODE);
            if (!TextUtils.isEmpty(string)) {
                boolean equals = TextUtils.equals(hpl.MY_CHANNEL, str);
                if (!equals) {
                    string = hpl.MY_CHANNEL;
                }
                jSONObject2.put(hpl.CURRENT_MENU_CODE, (Object) string);
                if (equals) {
                    str2 = "Page_Home_Button-categoryTab-delete";
                } else {
                    str2 = "Page_Home_Button-categoryTab-add";
                }
                N(str2, jSONObject2.getString(vaj.KEY_TAB_ID), 0, 0);
                Pair<Integer, Integer> Y = Y(string);
                if (((Integer) Y.second).intValue() == -1) {
                    while (true) {
                        if (i2 >= this.c.size()) {
                            i = -1;
                            break;
                        } else if (TextUtils.equals(string, this.c.get(i2).getString(hpl.MENU_CODE))) {
                            i = i2 + 1;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    i = ((Integer) Y.second).intValue() + 1;
                }
                if (i != -1) {
                    this.c.add(i, jSONObject);
                    notifyItemInserted(i);
                }
            }
        }
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a9cad2", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject = this.c.get(i);
            if (jSONObject != null && jSONObject.getIntValue(hpl.VIEW_TYPE) == 1) {
                notifyItemChanged(i);
            }
        }
    }

    public final void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec64640f", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f12478a = z;
        Pair<Integer, Integer> Y = Y(hpl.MY_CHANNEL);
        if (((Integer) Y.first).intValue() != -1) {
            notifyItemRangeChanged(((Integer) Y.first).intValue(), ((Integer) Y.second).intValue());
            for (int i = 0; i < this.c.size(); i++) {
                JSONObject jSONObject = this.c.get(i);
                if (jSONObject != null && jSONObject.getIntValue(hpl.VIEW_TYPE) == 0) {
                    notifyItemChanged(i);
                }
            }
            c0();
            if (z) {
                this.e.f();
            } else {
                this.e.v();
            }
        }
    }
}
