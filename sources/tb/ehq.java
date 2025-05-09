package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ehq extends su {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONVERTER_NAME = "standard";

    static {
        t2o.a(993001772);
    }

    public static /* synthetic */ Object ipc$super(ehq ehqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/converter/StandardConverter");
    }

    @Override // tb.su
    public <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337b45c", new Object[]{this, result, jSONObject, ykoVar});
            return;
        }
        e(result, jSONObject);
        ResultMainInfoBean.parseLayout(result.getMainInfo(), jSONObject);
        b(result, jSONObject, ykoVar);
        d(result, jSONObject);
        g(result, jSONObject);
        c(result, jSONObject);
        f(result, jSONObject, ykoVar);
    }

    public void b(BaseSearchResult baseSearchResult, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90edb98d", new Object[]{this, baseSearchResult, jSONObject, ykoVar});
        }
    }

    public <RESULT extends BaseSearchResult> void d(RESULT result, JSONObject jSONObject) {
        BaseTypedBean d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53884ec3", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mods");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            for (String str : jSONObject2.keySet()) {
                if (!"listItems".equals(str) && (d = result.c().n().d(jSONObject2.getJSONObject(str), result, jSONObject3)) != null) {
                    result.addMod(str, d);
                }
            }
        }
    }

    public <RESULT extends BaseSearchResult> void e(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ee304", new Object[]{this, result, jSONObject});
            return;
        }
        ResultMainInfoBean parse = ResultMainInfoBean.parse(jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO));
        if (parse == null) {
            parse = ResultMainInfoBean.createDefault();
        }
        result.setMainInfo(parse);
    }

    public <RESULT extends BaseSearchResult> void f(RESULT result, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76b6f5b", new Object[]{this, result, jSONObject, ykoVar});
            return;
        }
        ykoVar.f().h().getClass();
        ArrayList<TabBean> parseBean = TabBean.parseBean(jSONObject);
        if (parseBean == null || parseBean.size() == 0) {
            parseBean = TabBean.createDefaultTabs();
        }
        result.setTabs(parseBean);
    }

    public final <RESULT extends BaseSearchResult> void g(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a18ccc", new Object[]{this, result, jSONObject});
        } else {
            result.setTemplates(qit.b(jSONObject.getJSONArray("templates"), result.c()));
        }
    }

    public final <RESULT extends BaseSearchResult> void c(RESULT result, JSONObject jSONObject) {
        BaseCellBean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a7994c", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("mods");
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
            JSONArray jSONArray = jSONObject2.getJSONArray("listItems");
            if (jSONArray != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    if (!(jSONObject4 == null || (b = result.c().b().b(jSONObject4, result, jSONObject3)) == null)) {
                        result.addCell(b);
                        b.pagePos = i;
                        b.pageSize = size;
                        b.pageNo = result.getPageNo();
                    }
                }
            }
        }
    }
}
