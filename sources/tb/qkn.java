package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import java.util.HashMap;
import java.util.Map;
import tb.i5p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hk4<m4p> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void accept(m4p m4pVar) throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63d045bb", new Object[]{this, m4pVar});
            } else {
                c4p.m("NonItemClickTrace", "send clickTrace success");
            }
        }
    }

    static {
        t2o.a(815793456);
    }

    public static void b(String str, Map<String, String> map, Activity activity, int i, okn oknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0258436", new Object[]{str, map, activity, new Integer(i), oknVar});
        } else {
            c(str, map, activity, i, true, oknVar);
        }
    }

    public static void c(String str, Map<String, String> map, Activity activity, int i, boolean z, okn oknVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9f2f4c", new Object[]{str, map, activity, new Integer(i), new Boolean(z), oknVar});
        } else if (oknVar != null) {
            oknVar.s(map.get("itemId"));
            if (!o4p.b1()) {
                oknVar.d(str, map, activity, i);
            } else {
                oknVar.A(str, map, activity, i);
            }
            if (z) {
                oknVar.r(str, map, i);
            }
        }
    }

    public static void d(BaseTypedBean baseTypedBean, Map<String, String> map, Activity activity, int i, o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac3da8f", new Object[]{baseTypedBean, map, activity, new Integer(i), o02Var});
        } else if (baseTypedBean != null && !TextUtils.equals(baseTypedBean.cardType, "item") && !TextUtils.isEmpty(baseTypedBean.clickTrace)) {
            HashMap hashMap = new HashMap();
            a(hashMap, o02Var, baseTypedBean, i);
            if (map != null) {
                hashMap.putAll(map);
            }
            new i5p.c().c(eu3.g(baseTypedBean.clickTrace, map, i)).a().d().n(new a(), new u0p("NonItemClickTrace"));
        }
    }

    public static void a(Map<String, String> map, o02 o02Var, BaseTypedBean baseTypedBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611b1565", new Object[]{map, o02Var, baseTypedBean, new Integer(i)});
            return;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) o02Var.getTotalSearchResult();
        map.put("tab", o02Var.getTab());
        map.put(yj4.PARAM_SEARCH_KEYWORD_RN, baseTypedBean.rn);
        map.put(r4p.KEY_EDITION_CODE, k1p.c());
        map.put("elderHome", String.valueOf(cvr.INSTANCE.c()));
        map.put(r4p.KEY_GRAY_HAIR, String.valueOf(o02Var.getParamStr(r4p.KEY_SEARCH_ELDER_HOME_OPEN)));
        map.put("index", String.valueOf(i));
        if (baseTypedBean instanceof BaseCellBean) {
            map.put("page", String.valueOf(((BaseCellBean) baseTypedBean).pageNo));
        }
        if (baseSearchResult != null) {
            map.put("sessionid", baseSearchResult.getMainInfo().rn);
            map.put("jarvis_dynamic_card", String.valueOf(false));
            map.put("max_page", String.valueOf(o02Var.getCurrentPage()));
        }
    }
}
