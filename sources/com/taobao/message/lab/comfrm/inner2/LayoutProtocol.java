package com.taobao.message.lab.comfrm.inner2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.UserTrackInfo;
import com.taobao.message.lab.comfrm.inner2.config.UserTrackItemInfo;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.SlotInstance;
import com.taobao.message.lab.comfrm.render.ViewDynamicInfo;
import com.taobao.message.lab.comfrm.support.ut.UserTrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LayoutProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean isEnableNoTreeSnapshot = false;

    static {
        t2o.a(537919629);
    }

    public static <T> T bindData(String str, Object obj, Object obj2, int[] iArr, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd8a77d", new Object[]{str, obj, obj2, iArr, cls, new Boolean(z)});
        }
        if (str.startsWith("@bindData{")) {
            return (T) bindData(str.replace("@bindData{", "${"), obj2, iArr, cls, z);
        }
        return (T) bindData(str, obj, iArr, cls, z);
    }

    public static UserTrack bindUserTrack(ViewObject viewObject, Event event, Object obj, LayoutInfo layoutInfo, boolean z) {
        RenderTemplate renderTemplate;
        Map<String, Object> map;
        UserTrackInfo userTrackInfo;
        Map<String, UserTrackItemInfo> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTrack) ipChange.ipc$dispatch("5110ce9e", new Object[]{viewObject, event, obj, layoutInfo, new Boolean(z)});
        }
        UserTrackInfo userTrackInfo2 = viewObject.info.userTrack;
        UserTrack userTrack = null;
        UserTrackItemInfo userTrackItemInfo = (userTrackInfo2 == null || (map2 = userTrackInfo2.actions) == null) ? null : map2.get(event.getName());
        if (userTrackItemInfo == null && (renderTemplate = viewObject.info.renderTemplate) != null && "widget.message.common.itemwrapper".equals(renderTemplate.name) && (map = viewObject.children) != null) {
            Object obj2 = map.get("content");
            if (!(!(obj2 instanceof ViewObject) || (userTrackInfo = viewObject.info.userTrack) == null || userTrackInfo.actions == null)) {
                userTrackItemInfo = ((ViewObject) obj2).info.userTrack.actions.get(event.getName());
            }
        }
        if (userTrackItemInfo != null) {
            userTrack = new UserTrack();
            UserTrackInfo userTrackInfo3 = layoutInfo.userTrack;
            if (userTrackInfo3 != null) {
                userTrack.pageName = (String) bindData(userTrackInfo3.pageName, obj, viewObject.bindData, viewObject.indexs, String.class, z);
                userTrack.spmB = (String) bindData(layoutInfo.userTrack.spmB, obj, viewObject.bindData, viewObject.indexs, String.class, z);
            }
            userTrack.name = userTrackItemInfo.name;
            userTrack.spmC = userTrackItemInfo.spmC;
            userTrack.spmD = userTrackItemInfo.spmD;
            userTrack.eventId = userTrackItemInfo.eventId;
            if (TextUtils.isEmpty(userTrackItemInfo.actionName)) {
                userTrack.actionName = event.getName();
            } else {
                userTrack.actionName = userTrackItemInfo.actionName;
            }
            Map<String, String> map3 = userTrackItemInfo.args;
            if (map3 != null && !map3.isEmpty()) {
                HashMap hashMap = new HashMap(userTrackItemInfo.args.size());
                for (Map.Entry<String, String> entry : userTrackItemInfo.args.entrySet()) {
                    Object bindData = bindData(entry.getValue(), obj, viewObject.bindData, viewObject.indexs, Object.class, z);
                    if (bindData != null) {
                        hashMap.put(entry.getKey(), bindData);
                    }
                }
                userTrack.args = hashMap;
            }
            userTrack.indexs = viewObject.indexs;
        }
        return userTrack;
    }

    public static Action buildEventAction(EventHandlerItem eventHandlerItem, Object obj, int[] iArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("f8268fef", new Object[]{eventHandlerItem, obj, iArr, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object bindData = bindData(entry.getValue(), obj, iArr, Object.class, false);
            if (bindData != null) {
                hashMap.put(entry.getKey(), bindData);
            }
        }
        return new Action.Build(eventHandlerItem.type).data(hashMap).context(map).build();
    }

    public static EventHandleRuntime buildEventRuntime(EventHandlerItem eventHandlerItem, Object obj, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventHandleRuntime) ipChange.ipc$dispatch("60a8b222", new Object[]{eventHandlerItem, obj, iArr}) : buildEventRuntime(eventHandlerItem, obj, iArr, null);
    }

    public static EventHandleRuntime buildEventRuntimeWithExpressionMap(EventHandlerItem eventHandlerItem, Map<String, Object> map, int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventHandleRuntime) ipChange.ipc$dispatch("1f65653f", new Object[]{eventHandlerItem, map, iArr}) : buildEventRuntimeWithExpressionMap(eventHandlerItem, map, iArr, false);
    }

    public static Map<String, Object> buildWithExpressionMap(ViewObject viewObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a24902b9", new Object[]{viewObject, obj});
        }
        HashMap hashMap = new HashMap();
        Map<String, List<EventHandlerItem>> map = viewObject.info.eventHandler;
        if (map == null) {
            return hashMap;
        }
        for (List<EventHandlerItem> list : map.values()) {
            for (EventHandlerItem eventHandlerItem : list) {
                Map<String, String> map2 = eventHandlerItem.data;
                if (!(map2 == null || map2.size() == 0)) {
                    for (Map.Entry<String, Object> entry : buildEventRuntime(eventHandlerItem, obj, viewObject.indexs, viewObject.bindData).data.entrySet()) {
                        String replaceIndex = replaceIndex(eventHandlerItem.data.get(entry.getKey()), viewObject.indexs);
                        hashMap.put(replaceIndex, entry.getValue());
                        if (replaceIndex != null && replaceIndex.startsWith("@bindData")) {
                            eventHandlerItem.data.put(entry.getKey(), entry.getValue().toString());
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    private static <T> Object parseConcatWithExpression(String str, Object obj, int[] iArr, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("22448f9b", new Object[]{str, obj, iArr, cls, new Boolean(z)});
        }
        String[] split = str.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            Object bindData = bindData(str2, obj, iArr, cls, z);
            if (bindData instanceof String) {
                sb.append((String) bindData);
            }
        }
        return sb.toString();
    }

    public static void processLayout(LayoutInfo layoutInfo) {
        Map<String, LayoutInfo> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfb2bcb", new Object[]{layoutInfo});
            return;
        }
        Map<String, SlotInstance> map2 = layoutInfo.children;
        if (map2 != null) {
            for (SlotInstance slotInstance : map2.values()) {
                if (slotInstance.type.equals("layout")) {
                    LayoutInfo layoutInfo2 = (LayoutInfo) JSON.parseObject(slotInstance.data, LayoutInfo.class);
                    slotInstance.dataObject = layoutInfo2;
                    if (layoutInfo2 != null) {
                        processLayout(layoutInfo2);
                    }
                } else if (slotInstance.type.equals("layoutList")) {
                    List<LayoutInfo> parseArray = JSON.parseArray(slotInstance.data, LayoutInfo.class);
                    slotInstance.dataObject = parseArray;
                    if (parseArray != null) {
                        for (LayoutInfo layoutInfo3 : parseArray) {
                            processLayout(layoutInfo3);
                        }
                    }
                } else if (slotInstance.type.equals("dynamic")) {
                    ViewDynamicInfo viewDynamicInfo = (ViewDynamicInfo) JSON.parseObject(slotInstance.data, ViewDynamicInfo.class);
                    slotInstance.dataObject = viewDynamicInfo;
                    if (!(viewDynamicInfo == null || (map = viewDynamicInfo.pool) == null)) {
                        for (LayoutInfo layoutInfo4 : map.values()) {
                            processLayout(layoutInfo4);
                        }
                    }
                }
            }
        }
    }

    private static String replaceIndex(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32c6463", new Object[]{str, iArr});
        }
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                if (!isEnableNoTreeSnapshot) {
                    str = str.replace("#" + i, String.valueOf(iArr[i]));
                } else if (str.contains("#") && str.contains("]")) {
                    str = str.replace("#" + i, String.valueOf(iArr[i]));
                }
            }
        }
        return str;
    }

    public static EventHandleRuntime buildEventRuntime(EventHandlerItem eventHandlerItem, Object obj, int[] iArr, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandleRuntime) ipChange.ipc$dispatch("ce4363be", new Object[]{eventHandlerItem, obj, iArr, obj2});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object bindData = bindData(entry.getValue(), obj, obj2, iArr, Object.class, false);
            if (bindData != null) {
                hashMap.put(entry.getKey(), bindData);
            }
        }
        EventHandleRuntime eventHandleRuntime = new EventHandleRuntime();
        eventHandleRuntime.type = eventHandlerItem.type;
        eventHandleRuntime.runtimeType = eventHandlerItem.runtimeType;
        eventHandleRuntime.enable = eventHandlerItem.enable;
        eventHandleRuntime.data = hashMap;
        Map<String, List<EventHandlerItem>> map = eventHandlerItem.next;
        if (map != null && !map.isEmpty()) {
            eventHandleRuntime.next = new HashMap(eventHandlerItem.next.size());
            for (Map.Entry<String, List<EventHandlerItem>> entry2 : eventHandlerItem.next.entrySet()) {
                ArrayList arrayList = new ArrayList(entry2.getValue().size());
                eventHandleRuntime.next.put(entry2.getKey(), arrayList);
                for (EventHandlerItem eventHandlerItem2 : entry2.getValue()) {
                    arrayList.add(buildEventRuntime(eventHandlerItem2, obj, iArr, obj2));
                }
            }
        }
        return eventHandleRuntime;
    }

    public static EventHandleRuntime buildEventRuntimeWithExpressionMap(EventHandlerItem eventHandlerItem, Map<String, Object> map, int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandleRuntime) ipChange.ipc$dispatch("e5123e1f", new Object[]{eventHandlerItem, map, iArr, new Boolean(z)});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object obj = map.get(replaceIndex(entry.getValue(), iArr));
            if (obj == null && z) {
                obj = entry.getValue();
            }
            if (obj != null) {
                hashMap.put(entry.getKey(), obj);
            }
        }
        EventHandleRuntime eventHandleRuntime = new EventHandleRuntime();
        eventHandleRuntime.type = eventHandlerItem.type;
        eventHandleRuntime.runtimeType = eventHandlerItem.runtimeType;
        eventHandleRuntime.enable = eventHandlerItem.enable;
        eventHandleRuntime.data = hashMap;
        Map<String, List<EventHandlerItem>> map2 = eventHandlerItem.next;
        if (map2 != null && !map2.isEmpty()) {
            eventHandleRuntime.next = new HashMap(eventHandlerItem.next.size());
            for (Map.Entry<String, List<EventHandlerItem>> entry2 : eventHandlerItem.next.entrySet()) {
                ArrayList arrayList = new ArrayList(entry2.getValue().size());
                eventHandleRuntime.next.put(entry2.getKey(), arrayList);
                for (EventHandlerItem eventHandlerItem2 : entry2.getValue()) {
                    arrayList.add(buildEventRuntimeWithExpressionMap(eventHandlerItem2, map, iArr, z));
                }
            }
        }
        return eventHandleRuntime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T bindData(java.lang.String r11, java.lang.Object r12, int[] r13, java.lang.Class<T> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.LayoutProtocol.bindData(java.lang.String, java.lang.Object, int[], java.lang.Class, boolean):java.lang.Object");
    }

    public static Action buildEventAction(EventHandlerItem eventHandlerItem, Map<String, Object> map, int[] iArr, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("d16833d8", new Object[]{eventHandlerItem, map, iArr, map2});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object obj = map.get(entry.getKey());
            if (obj != null) {
                hashMap.put(entry.getKey(), obj);
            }
        }
        return new Action.Build(eventHandlerItem.type).data(hashMap).context(map2).build();
    }

    public static ViewObject buildViewObject(LayoutInfo layoutInfo, Object obj, int[] iArr, boolean z) {
        ViewDynamicInfo viewDynamicInfo;
        ArrayList arrayList;
        int[] iArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("c0b236f5", new Object[]{layoutInfo, obj, iArr, new Boolean(z)});
        }
        ViewObject viewObject = new ViewObject();
        viewObject.indexs = iArr;
        viewObject.info = layoutInfo;
        if (obj instanceof SharedState) {
            viewObject.diff = ((SharedState) obj).getDiff();
        }
        if (!TextUtils.isEmpty(layoutInfo.bindData)) {
            viewObject.bindData = bindData(layoutInfo.bindData, obj, iArr, Object.class, z);
        }
        String str = layoutInfo.uniqueId;
        if (str != null) {
            Object bindData = bindData(str, obj, viewObject.bindData, iArr, Object.class, z);
            if (bindData instanceof String) {
                viewObject.uniqueId = (String) bindData;
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : layoutInfo.data.entrySet()) {
            Object bindData2 = bindData(entry.getValue(), obj, viewObject.bindData, iArr, Object.class, z);
            if (bindData2 != null) {
                jSONObject.put(entry.getKey(), bindData2);
            }
        }
        viewObject.data = jSONObject;
        Map<String, SlotInstance> map = layoutInfo.children;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, SlotInstance> entry2 : layoutInfo.children.entrySet()) {
                if (entry2.getValue().type.equals("layout")) {
                    LayoutInfo layoutInfo2 = (LayoutInfo) entry2.getValue().dataObject;
                    if (layoutInfo2 != null) {
                        viewObject.children.put(entry2.getKey(), buildViewObject(layoutInfo2, obj, iArr, z));
                    }
                } else if (entry2.getValue().type.equals("layoutList")) {
                    List<LayoutInfo> list = (List) entry2.getValue().dataObject;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (LayoutInfo layoutInfo3 : list) {
                            arrayList2.add(buildViewObject(layoutInfo3, obj, iArr, z));
                        }
                        viewObject.children.put(entry2.getKey(), arrayList2);
                    }
                } else if (entry2.getValue().type.equals("dynamic") && (viewDynamicInfo = (ViewDynamicInfo) entry2.getValue().dataObject) != null) {
                    List list2 = (List) bindData(viewDynamicInfo.dynamicData, obj, iArr, List.class, z);
                    if (list2 != null) {
                        arrayList = new ArrayList(list2.size());
                        for (int i = 0; i < list2.size(); i++) {
                            if (iArr == null) {
                                iArr2 = new int[]{i};
                            } else {
                                iArr2 = Arrays.copyOf(iArr, iArr.length + 1);
                                iArr2[iArr.length] = i;
                            }
                            String str2 = (String) bindData(viewDynamicInfo.dynamicType, obj, iArr2, String.class, z);
                            if (str2 != null) {
                                arrayList.add(buildViewObject(viewDynamicInfo.pool.get(str2), obj, iArr2, z));
                            } else {
                                arrayList.add(new ViewObject());
                            }
                        }
                    } else {
                        arrayList = new ArrayList(0);
                    }
                    viewObject.children.put(entry2.getKey(), arrayList);
                }
            }
        }
        return viewObject;
    }
}
