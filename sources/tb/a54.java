package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.search.mmd.datasource.bean.SearchBarBean;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a54 extends su {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONVERTER_NAME = "commonApi";

    static {
        t2o.a(815793399);
    }

    public static /* synthetic */ Object ipc$super(a54 a54Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/datasource/converter/CommonApiConverter");
    }

    @Override // tb.su
    public <RESULT extends BaseSearchResult> void a(RESULT result, JSONObject jSONObject, yko ykoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337b45c", new Object[]{this, result, jSONObject, ykoVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("nxData");
        g(result, jSONObject2);
        if (result instanceof CommonSearchResult) {
            t64.INSTANCE.b((CommonSearchResult) result, jSONObject);
        }
        e(result, jSONObject2);
        i(result, jSONObject);
        d(result, jSONObject2);
        f(result, jSONObject2);
        h(result, jSONObject2);
        c(result, jSONObject2);
    }

    public final <RESULT extends BaseSearchResult> void b(RESULT result, List<String> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5baeb21e", new Object[]{this, result, list, jSONArray});
        } else if (jSONArray == null) {
            c4p.m("CommonApiConverter", "fillLayoutArray:layoutArray is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                BaseTypedBean d = result.c().n().d(jSONArray.getJSONObject(i), result, null);
                if (d == null) {
                    c4p.n("CommonApiConverter", "fillLayoutArray: no parser");
                } else {
                    list.add(d.type);
                    result.addMod(d.type, d);
                }
            }
        }
    }

    public final <RESULT extends BaseSearchResult> void c(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e615a33e", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extMods");
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String string = jSONObject2.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        result.addExtMod(str, string);
                    }
                }
            }
        }
    }

    public final <RESULT extends BaseSearchResult> void d(RESULT result, JSONObject jSONObject) {
        BaseCellBean b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a7994c", new Object[]{this, result, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("listItems");
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (!(jSONObject2 == null || (b = result.c().b().b(jSONObject2, result, null)) == null)) {
                    result.addCell(b);
                }
            }
        }
    }

    public final <RESULT extends BaseSearchResult> void e(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bff490a", new Object[]{this, result, jSONObject});
            return;
        }
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        b(result, resultLayoutInfoBean.foldHeaders, jSONObject.getJSONArray("foldHeader"));
        b(result, resultLayoutInfoBean.halfStickyHeaders, jSONObject.getJSONArray("halfStickyHeader"));
        b(result, resultLayoutInfoBean.stickyHeaders, jSONObject.getJSONArray("stickyHeader"));
        b(result, resultLayoutInfoBean.listHeaders, jSONObject.getJSONArray("listHeader"));
        result.getMainInfo().layoutInfo = resultLayoutInfoBean;
    }

    public final <RESULT extends BaseSearchResult> void f(RESULT result, JSONObject jSONObject) {
        SearchBarBean searchBarBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31de6a97", new Object[]{this, result, jSONObject});
        } else if (result instanceof CommonSearchResult) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(u3b.UI_MODULE_SEARCH_BAR);
            if (jSONObject2 == null) {
                searchBarBean = SearchBarBean.createDefault();
            } else {
                SearchBarBean searchBarBean2 = new SearchBarBean();
                searchBarBean2.type = jSONObject2.getString("searchType");
                searchBarBean2.text = jSONObject2.getString("text");
                searchBarBean = searchBarBean2;
            }
            ((CommonSearchResult) result).setSearchBarInfo(searchBarBean);
        }
    }

    public final <RESULT extends BaseSearchResult> void g(RESULT result, JSONObject jSONObject) {
        ResultMainInfoBean resultMainInfoBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ee304", new Object[]{this, result, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(HorizontalXslComponent.ATTR_PAGE_INFO);
        if (jSONObject2 == null) {
            resultMainInfoBean = ResultMainInfoBean.createDefault();
        } else {
            ResultMainInfoBean resultMainInfoBean2 = new ResultMainInfoBean();
            ResultMainInfoBean.parseBaseInfo(resultMainInfoBean2, jSONObject2);
            resultMainInfoBean = resultMainInfoBean2;
        }
        result.setMainInfo(resultMainInfoBean);
    }

    public final <RESULT extends BaseSearchResult> void h(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd6d050", new Object[]{this, result, jSONObject});
            return;
        }
        ArrayList<TabBean> parseBean = TabBean.parseBean(jSONObject);
        if (parseBean == null || parseBean.size() == 0) {
            parseBean = TabBean.createDefaultTabs();
        }
        result.setTabs(parseBean);
    }

    public final <RESULT extends BaseSearchResult> void i(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2a18ccc", new Object[]{this, result, jSONObject});
        } else {
            result.setTemplates(qit.b(jSONObject.getJSONArray("templates"), result.c()));
        }
    }
}
