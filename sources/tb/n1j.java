package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.xsearchplugin.debugger.ace.AceLifecycleListener;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n1j extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793486);
    }

    public static /* synthetic */ Object ipc$super(n1j n1jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/util/MoveCellMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        Activity activity = (Activity) AceLifecycleListener.sCurrentActivity.get();
        if (activity == null) {
            throw new IllegalStateException("获取不到当前栈顶的Activity");
        } else if (activity instanceof BaseResultActivity) {
            JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
            int intValue = jSONObject.getIntValue("from");
            int intValue2 = jSONObject.getIntValue("to");
            CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) ((BaseResultActivity) activity).g.e();
            int size = ((CommonSearchResult) commonBaseDatasource.getTotalSearchResult()).getCells().size();
            if (intValue < 0 || intValue2 < 0 || intValue >= size || intValue2 >= size) {
                throw new IllegalArgumentException("参数不合法，当前cell个数" + size + ",from:" + intValue + ",to:" + intValue2);
            }
            commonBaseDatasource.moveCell(intValue, intValue2);
            return null;
        } else {
            throw new IllegalStateException("当前栈顶页面非XSearch容器，请确保当前处于搜索结果页");
        }
    }
}
