package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class enx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INDEX_KEY = "_index";

    static {
        t2o.a(993002202);
    }

    public static int a(JSONObject jSONObject, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e8e60bf", new Object[]{jSONObject, str, new Integer(i)})).intValue();
        }
        if (jSONObject == null) {
            return i;
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return jSONObject.getInteger(str).intValue();
        } catch (Exception unused) {
            return i;
        }
    }

    public static void b(o02<?, ?> o02Var, JSONObject jSONObject) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aac3617", new Object[]{o02Var, jSONObject});
            return;
        }
        yko core = o02Var.getCore();
        if (jSONObject == null) {
            core.l().d("WeexStorageUtil", "updateStorage: params is null");
            return;
        }
        int a2 = a(jSONObject, INDEX_KEY, -1);
        if (a2 < 0) {
            core.l().d("WeexStorageUtil", "updateStorage: index is illegal");
            return;
        }
        jSONObject.remove(INDEX_KEY);
        BaseSearchResult baseSearchResult = (BaseSearchResult) o02Var.getTotalSearchResult();
        if (baseSearchResult == null) {
            core.l().d("WeexStorageUtil", "updateStorage: totalResult is null");
            return;
        }
        BaseCellBean cell = baseSearchResult.getCell(a2);
        if (cell instanceof WeexCellBean) {
            map = ((WeexCellBean) cell).mStorage;
        } else if (cell instanceof MuiseCellBean) {
            map = ((MuiseCellBean) cell).mStorage;
        } else {
            core.l().d("WeexStorageUtil", "updateStorage: target cell is not a dynamic cell");
            return;
        }
        if (map == null) {
            core.l().d("WeexStorageUtil", "updateStorage: storage is null");
        } else {
            map.putAll(jSONObject.getInnerMap());
        }
    }

    public static void c(o02<?, ?> o02Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2664f76", new Object[]{o02Var, jSONObject});
            return;
        }
        yko core = o02Var.getCore();
        if (jSONObject == null) {
            core.l().d("WeexStorageUtil", "updateStorage: params is null");
            return;
        }
        int a2 = a(jSONObject, INDEX_KEY, -1);
        if (a2 < 0) {
            core.l().d("WeexStorageUtil", "updateStorage: index is illegal");
            return;
        }
        jSONObject.remove(INDEX_KEY);
        MuiseCellBean findById = MuiseCellBean.findById(a2);
        if (findById == null) {
            core.l().d("WeexStorageUtil", "updateStorage: muise of id not found");
            return;
        }
        findById.mStorage.putAll(jSONObject.getInnerMap());
        findById.mStorageUpdated = true;
    }
}
