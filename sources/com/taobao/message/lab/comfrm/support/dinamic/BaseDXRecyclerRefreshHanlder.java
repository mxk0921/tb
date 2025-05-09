package com.taobao.message.lab.comfrm.support.dinamic;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.message.datasdk.facade.model.ResultChange;
import com.taobao.message.datasdk.facade.model.ResultData;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.Diff;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class BaseDXRecyclerRefreshHanlder implements DXWidgetInstance.DXPartRefreshHanlder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919772);
        t2o.a(537919793);
    }

    public abstract DeltaItem getDeltaItem(Map<String, Object> map, Diff diff, Map<String, Object> map2);

    public Object getItem(ResultData<Object> resultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e37508fb", new Object[]{this, resultData});
        }
        return resultData.getMainData();
    }

    public boolean processLinkData(Map<String, Object> map, Diff diff, Map<String, Object> map2, List<ResultChange<Object, Integer>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3ad56a", new Object[]{this, map, diff, map2, list})).booleanValue();
        }
        return true;
    }

    private void printInfo(String str, int i, DXRecyclerLayout dXRecyclerLayout) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f95a515", new Object[]{this, str, new Integer(i), dXRecyclerLayout});
        } else if (ApplicationUtil.isDebug()) {
            int size = dXRecyclerLayout.x() != null ? dXRecyclerLayout.x().size() : 0;
            if (dXRecyclerLayout.getListData() != null) {
                i2 = dXRecyclerLayout.getListData().size();
            }
            Logger.e("Message", str + "|" + i + "|dataSource|" + size + "|listData|" + i2);
        }
    }

    @Override // com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance.DXPartRefreshHanlder
    public boolean partRefresh(DinamicXEngine dinamicXEngine, DXRootView dXRootView, DXWidgetNode dXWidgetNode, Map<String, Object> map, Map<String, Object> map2, Diff diff) {
        List<ResultChange<Object, Integer>> list;
        int i = 3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4bf811", new Object[]{this, dinamicXEngine, dXRootView, dXWidgetNode, map, map2, diff})).booleanValue();
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) dXWidgetNode;
        DeltaItem deltaItem = getDeltaItem(map2, diff, map);
        if (deltaItem == null) {
            list = null;
        } else if (deltaItem.getDataType() == 0) {
            return false;
        } else {
            List<ResultChange<Object, Integer>> list2 = (List) deltaItem.getDataChange();
            Iterator<ResultChange<Object, Integer>> it = list2.iterator();
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                ResultChange<Object, Integer> next = it.next();
                if (next.getType() == i) {
                    return z;
                }
                if (next.getType() == 1) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                    jSONObject.put(x96.REFRESH_TYPE, "part");
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put("data", (Object) jSONArray);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONArray.add(jSONObject2);
                    jSONObject2.put("isRelative", (Object) "false");
                    jSONObject2.put("offset", (Object) next.getIndex());
                    jSONObject2.put("item_data", getItem(next.getResultData()));
                    dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS, jSONObject));
                    printInfo("update", next.getIndex().intValue(), dXRecyclerLayout);
                } else {
                    if (next.getType() == 0) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                        jSONObject3.put(x96.REFRESH_TYPE, "part");
                        JSONArray jSONArray2 = new JSONArray();
                        jSONObject3.put("data", (Object) jSONArray2);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONArray2.add(jSONObject4);
                        jSONObject4.put("isRelative", (Object) "false");
                        jSONObject4.put("offset", (Object) String.valueOf(next.getIndex()));
                        jSONObject4.put("data", getItem(next.getResultData()));
                        dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_INSERT_ITEMS, jSONObject3));
                        printInfo("insert", next.getIndex().intValue(), dXRecyclerLayout);
                        z3 = true;
                    } else if (next.getType() == 2) {
                        if (next.getIndex().intValue() == 0) {
                            z2 = true;
                        }
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("recyclerNodeId", dXRecyclerLayout.getUserId());
                        jSONObject5.put(x96.REFRESH_TYPE, "part");
                        JSONArray jSONArray3 = new JSONArray();
                        jSONObject5.put("data", (Object) jSONArray3);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONArray3.add(jSONObject6);
                        jSONObject6.put("isRelative", (Object) "false");
                        jSONObject6.put("offset", (Object) next.getIndex());
                        dXRecyclerLayout.postEvent(DXWidgetInstance.buildMsg(DXRecyclerLayout.MSG_METHOD_DELETE_ITEMS, jSONObject5));
                        printInfo("remove", next.getIndex().intValue(), dXRecyclerLayout);
                    } else if (next.getType() == 4) {
                        return false;
                    }
                    list2 = list2;
                    it = it;
                    i = 3;
                    z = false;
                }
                list2 = list2;
                it = it;
                i = 3;
                z = false;
            }
            if (z2 && z3 && dXRecyclerLayout.j0() != null && dXRecyclerLayout.j0().getAdapter() != null && (dXRecyclerLayout.j0().getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                Logger.e("DXRecyclerRefresh", "notifyDataSetChanged()");
                dXRecyclerLayout.j0().getAdapter().notifyDataSetChanged();
            }
            list = list2;
        }
        return processLinkData(map2, diff, map, list);
    }
}
