package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ntf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(995098663);
    }

    public static String[] a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("77f1b591", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (!TextUtils.isEmpty(str) && obj != null) {
                    arrayList.add(str + "=" + obj);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static Map<String, Object> b(BaseTypedBean baseTypedBean, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e593fddd", new Object[]{baseTypedBean, ykoVar});
        }
        if (baseTypedBean instanceof dhc) {
            return ((dhc) baseTypedBean).getCellBehavXData();
        }
        ehc e = ((etf) ykoVar.f().f()).e();
        JSONObject d = d(baseTypedBean);
        if (e == null || d == null) {
            return null;
        }
        return e.a(d);
    }

    public static String c(BaseTypedBean baseTypedBean, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b5a1b84", new Object[]{baseTypedBean, ykoVar});
        }
        if (baseTypedBean instanceof BaseCellBean) {
            return ((BaseCellBean) baseTypedBean).itemId;
        }
        return null;
    }

    public static JSONObject d(BaseTypedBean baseTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("887aee", new Object[]{baseTypedBean});
        }
        if (baseTypedBean instanceof WeexCellBean) {
            return ((WeexCellBean) baseTypedBean).mWeexBean.model;
        }
        if (baseTypedBean instanceof MuiseCellBean) {
            return ((MuiseCellBean) baseTypedBean).mMuiseBean.model;
        }
        return null;
    }

    public static chc e(String str, otf otfVar) {
        Class<? extends chc> a2;
        if (TextUtils.isEmpty(str) || (a2 = ((etf) otfVar.getCore().f().f()).h().a(str)) == null) {
            return null;
        }
        try {
            return (chc) a2.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }
}
