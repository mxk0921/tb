package com.taobao.message.lab.comfrm.support.list;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.ISnapshotCustom;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.Serializable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ClipSectionFunction implements ISnapshotCustom {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(537919821);
        t2o.a(537919617);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ISnapshotCustom
    public ViewObject snapshot(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("3b05803", new Object[]{this, viewObject});
        }
        return sectionOptimizeClip(viewObject, new int[]{12});
    }

    private ViewObject markSnapshotInHeaderTop(ViewObject viewObject) {
        JSONObject parseObject;
        JSONObject jSONObject;
        JSONArray jSONArray;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("4409c415", new Object[]{this, viewObject});
        }
        if ("1".equals(ValueUtil.getValue("degradeMarkSnapshotInHeaderTop", "0"))) {
            return viewObject;
        }
        if (viewObject == null) {
            return null;
        }
        Serializable serializable = viewObject.data;
        if (!(serializable instanceof JSONObject) || (jSONObject = (parseObject = JSON.parseObject(JSON.toJSONString(serializable))).getJSONObject("operationArea")) == null || (jSONArray = jSONObject.getJSONArray("subContainerList")) == null || jSONArray.size() < 1) {
            return viewObject;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            if (jSONArray.get(0) instanceof JSONObject) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.get(BaseWVApiPlugin.RESOURCE_LIST_KEY) != null && (jSONObject2.get(BaseWVApiPlugin.RESOURCE_LIST_KEY) instanceof JSONArray)) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray(BaseWVApiPlugin.RESOURCE_LIST_KEY);
                    if (jSONArray2.size() >= 1) {
                        for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                            if (jSONArray2.get(i2) instanceof JSONObject) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                if (jSONObject3.get("resData") != null && (jSONObject3.get("resData") instanceof JSONObject)) {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("resData");
                                    if (ApplicationUtil.isDebug() && jSONObject4.containsKey("isSnapshot") && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
                                        defaultUncaughtExceptionHandler.uncaughtException(VExecutors.currentThread(), new IllegalArgumentException("投放key冲突，isSnapshot"));
                                    }
                                    jSONObject4.put("isSnapshot", (Object) "1");
                                }
                            }
                        }
                    }
                }
            }
        }
        ViewObject viewObject2 = new ViewObject(viewObject);
        viewObject2.data = parseObject;
        return viewObject2;
    }

    private ViewObject sectionOptimizeClip(ViewObject viewObject, int[] iArr) {
        ViewObject sectionOptimizeClip;
        RenderTemplate renderTemplate;
        RenderTemplate renderTemplate2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("38f9d43", new Object[]{this, viewObject, iArr});
        }
        if (viewObject == null) {
            return null;
        }
        LayoutInfo layoutInfo = viewObject.info;
        if (layoutInfo == null || (renderTemplate2 = layoutInfo.renderTemplate) == null || !"native".equals(renderTemplate2.renderType) || !"section".equals(viewObject.info.renderTemplate.name)) {
            LayoutInfo layoutInfo2 = viewObject.info;
            if (layoutInfo2 == null || (renderTemplate = layoutInfo2.renderTemplate) == null || !"native".equals(renderTemplate.renderType) || !"widget.message.common.operationArea".equals(viewObject.info.renderTemplate.name)) {
                HashMap hashMap = new HashMap();
                Map<String, Object> map = viewObject.children;
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof List) {
                            ArrayList arrayList = new ArrayList();
                            boolean z = false;
                            for (Object obj : (List) value) {
                                if (obj instanceof ViewObject) {
                                    ViewObject sectionOptimizeClip2 = sectionOptimizeClip((ViewObject) obj, iArr);
                                    if (sectionOptimizeClip2 != obj) {
                                        z = true;
                                    }
                                    arrayList.add(sectionOptimizeClip2);
                                } else {
                                    arrayList.add(obj);
                                }
                            }
                            if (z) {
                                hashMap.put(key, arrayList);
                            }
                        } else if ((value instanceof ViewObject) && (sectionOptimizeClip = sectionOptimizeClip((ViewObject) value, iArr)) != value) {
                            hashMap.put(key, sectionOptimizeClip);
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return viewObject;
                }
                ViewObject viewObject2 = new ViewObject(viewObject);
                HashMap hashMap2 = new HashMap();
                viewObject2.children = hashMap2;
                Map<String, Object> map2 = viewObject.children;
                if (map2 != null) {
                    hashMap2.putAll(map2);
                    viewObject2.children.putAll(hashMap);
                }
                return viewObject2;
            }
            try {
                return markSnapshotInHeaderTop(viewObject);
            } catch (Exception unused) {
                return viewObject;
            }
        } else {
            ViewObject viewObject3 = new ViewObject(viewObject);
            HashMap hashMap3 = new HashMap();
            viewObject3.children = hashMap3;
            Map<String, Object> map3 = viewObject.children;
            if (map3 != null) {
                hashMap3.putAll(map3);
                List list = (List) viewObject.children.get("content");
                if (iArr[0] <= 0) {
                    viewObject3.children.put("content", new ArrayList());
                } else {
                    int size = list.size();
                    int i = iArr[0];
                    if (size > i) {
                        viewObject3.children.put("content", list.subList(0, i));
                        iArr[0] = 0;
                    } else {
                        iArr[0] = i - list.size();
                    }
                }
            }
            return viewObject3;
        }
    }
}
