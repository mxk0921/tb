package com.taobao.search.searchdoor.sf.widgets.activate.cells;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import java.util.HashMap;
import java.util.Map;
import tb.ay4;
import tb.c2p;
import tb.c2v;
import tb.cvr;
import tb.ej4;
import tb.h3p;
import tb.k1p;
import tb.ka0;
import tb.p1p;
import tb.r4p;
import tb.rg3;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeexActivateCellViewHolder extends AbsWeexViewHolder<WeexActivateCellBean, c2p> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int w = p1p.a(128.0f);
    public static final int x = p1p.a(172.0f);
    public static final ay4<rg3.c, AbsWeexViewHolder> CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<rg3.c, AbsWeexViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public AbsWeexViewHolder<WeexActivateCellBean, c2p> a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbsWeexViewHolder) ipChange.ipc$dispatch("b43207c5", new Object[]{this, cVar});
            }
            return new WeexActivateCellViewHolder(cVar.f27354a, cVar.b, cVar.d, cVar.c, cVar.e, (c2p) cVar.f);
        }
    }

    static {
        t2o.a(815793182);
    }

    public WeexActivateCellViewHolder(Activity activity, ude udeVar, ListStyle listStyle, ViewGroup viewGroup, int i, c2p c2pVar) {
        super(activity, udeVar, listStyle, viewGroup, i, c2pVar);
        j1();
    }

    public static /* synthetic */ Object ipc$super(WeexActivateCellViewHolder weexActivateCellViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/WeexActivateCellViewHolder");
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int I0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64038bb6", new Object[]{this, weexBean})).intValue();
        }
        return w;
    }

    @Override // com.taobao.android.xsearchplugin.weex.list.AbsWeexViewHolder
    public int K0(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fef46e7", new Object[]{this, weexBean})).intValue();
        }
        return x;
    }

    public final String h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f927f6fc", new Object[]{this});
        }
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (currentPageName == null || currentPageName.startsWith("Page_")) {
            return currentPageName;
        }
        return "Page_".concat(currentPageName);
    }

    public void j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec3138", new Object[]{this});
        } else {
            Y0(new ka0(getActivity(), getCore(), l0().b(), this, this));
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "WeexActivateCellWidget";
    }

    /* renamed from: k1 */
    public WeexBean R0(WeexActivateCellBean weexActivateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBean) ipChange.ipc$dispatch("f2992ce7", new Object[]{this, weexActivateCellBean});
        }
        return weexActivateCellBean.weexBean;
    }

    /* renamed from: i1 */
    public Map<String, Object> Q0(WeexActivateCellBean weexActivateCellBean, int i, boolean z, ListStyle listStyle) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("368b2591", new Object[]{this, weexActivateCellBean, new Integer(i), new Boolean(z), listStyle});
        }
        if (z) {
            f = ej4.f18611a;
        } else {
            f = (ej4.f18611a - (this.e * 2)) / 2.0f;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("width", Float.valueOf(p1p.c(f)));
        hashMap.put("layoutStyle", Integer.valueOf(ListStyle.toNum(listStyle)));
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("suggestRN", weexActivateCellBean.suggestRn);
        hashMap.put("tab", weexActivateCellBean.tab);
        hashMap.put("pageName", h1());
        hashMap.put(r4p.KEY_EDITION_CODE, k1p.c());
        hashMap.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        boolean equals = "true".equals(l0().a().q(r4p.KEY_SEARCH_ELDER_HOME_OPEN));
        hashMap.put("fontSizeLevel", Integer.valueOf(h3p.a(equals)));
        hashMap.put(r4p.KEY_GRAY_HAIR, String.valueOf(equals));
        WeexBean weexBean = weexActivateCellBean.weexBean;
        HashMap hashMap2 = new HashMap();
        if (weexBean != null) {
            hashMap2.put("__nxType__", weexBean.type);
            hashMap2.put("model", weexBean.model);
            hashMap2.put("status", hashMap);
        }
        return hashMap2;
    }
}
