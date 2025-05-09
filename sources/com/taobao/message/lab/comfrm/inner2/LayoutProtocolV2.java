package com.taobao.message.lab.comfrm.inner2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.render.SlotInstance;
import com.taobao.message.lab.comfrm.render.ViewDynamicInfo;
import com.taobao.message.lab.comfrm.util.BeanUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LayoutProtocolV2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean isOpenLayoutProtocolOpt = ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgOpenLayoutProtocolOpt");

    public static ViewObject buildViewObject(LayoutInfo layoutInfo, Object obj, int[] iArr, boolean z) {
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
        String str = layoutInfo.uniqueId;
        if (str != null) {
            Object bindData = bindData(str, obj, iArr, Object.class, z);
            if (bindData instanceof String) {
                viewObject.uniqueId = (String) bindData;
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : layoutInfo.data.entrySet()) {
            Object bindData2 = bindData(entry.getValue(), obj, iArr, Object.class, z);
            if (bindData2 != null) {
                jSONObject.put(entry.getKey(), bindData2);
            }
        }
        viewObject.data = jSONObject;
        processChildren(layoutInfo, obj, iArr, z, viewObject);
        return viewObject;
    }

    private static void handleDynamicViews(Map.Entry<String, SlotInstance> entry, Object obj, int[] iArr, boolean z, ViewObject viewObject) {
        ArrayList arrayList;
        int[] iArr2;
        ViewObject viewObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4baf2e", new Object[]{entry, obj, iArr, new Boolean(z), viewObject});
            return;
        }
        ViewDynamicInfo viewDynamicInfo = (ViewDynamicInfo) entry.getValue().dataObject;
        if (viewDynamicInfo != null) {
            List list = (List) bindData(viewDynamicInfo.dynamicData, obj, iArr, List.class, z);
            if (list != null) {
                arrayList = new ArrayList(list.size());
            } else {
                arrayList = new ArrayList(0);
            }
            for (int i = 0; list != null && i < list.size(); i++) {
                if (iArr != null) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length + 1);
                } else {
                    iArr2 = new int[1];
                }
                iArr2[iArr2.length - 1] = i;
                String str = (String) bindData(viewDynamicInfo.dynamicType, obj, iArr2, String.class, z);
                if (str != null) {
                    viewObject2 = buildViewObject(viewDynamicInfo.pool.get(str), obj, iArr2, z);
                } else {
                    viewObject2 = new ViewObject();
                }
                arrayList.add(viewObject2);
            }
            viewObject.children.put(entry.getKey(), arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T handleJsonExpression(java.lang.String r4, java.lang.Object r5, int[] r6, java.lang.Class<T> r7, boolean r8) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.message.lab.comfrm.inner2.LayoutProtocolV2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0024
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r2 = 0
            r8[r2] = r4
            r4 = 1
            r8[r4] = r5
            r4 = 2
            r8[r4] = r6
            r4 = 3
            r8[r4] = r7
            r4 = 4
            r8[r4] = r1
            java.lang.String r4 = "6346da18"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r8)
            return r4
        L_0x0024:
            com.alibaba.fastjson.JSONObject r4 = com.alibaba.fastjson.JSON.parseObject(r4)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0035:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r4.getString(r1)
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            java.lang.Object r2 = bindData(r2, r5, r6, r3, r8)
            r7.put(r1, r2)
            goto L_0x0035
        L_0x004f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.LayoutProtocolV2.handleJsonExpression(java.lang.String, java.lang.Object, int[], java.lang.Class, boolean):java.lang.Object");
    }

    private static <T> T handleQueryExpression(String str, Object obj, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dd9df456", new Object[]{str, obj, cls, new Boolean(z)});
        }
        String[] split = str.substring(7, str.length() - 1).split(",");
        if (split.length <= 0) {
            return null;
        }
        T t = (T) bindData(split[0], obj, null, Object.class, z);
        for (int i = 1; i < split.length; i++) {
            t = (T) BeanUtil.getRaw(t, String.valueOf(bindData(split[i], obj, null, Object.class, z)));
            if (t == null) {
                return null;
            }
        }
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    private static void processChildren(LayoutInfo layoutInfo, Object obj, int[] iArr, boolean z, ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479f86b5", new Object[]{layoutInfo, obj, iArr, new Boolean(z), viewObject});
            return;
        }
        Map<String, SlotInstance> map = layoutInfo.children;
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, SlotInstance> entry : layoutInfo.children.entrySet()) {
                String str = entry.getValue().type;
                Object obj2 = entry.getValue().dataObject;
                if ("layout".equals(str)) {
                    if (obj2 instanceof LayoutInfo) {
                        viewObject.children.put(entry.getKey(), buildViewObject((LayoutInfo) obj2, obj, iArr, z));
                    }
                } else if ("layoutList".equals(str)) {
                    if (obj2 instanceof List) {
                        List<LayoutInfo> list = (List) obj2;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (LayoutInfo layoutInfo2 : list) {
                            arrayList.add(buildViewObject(layoutInfo2, obj, iArr, z));
                        }
                        viewObject.children.put(entry.getKey(), arrayList);
                    }
                } else if ("dynamic".equals(str)) {
                    handleDynamicViews(entry, obj, iArr, z, viewObject);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T bindData(String str, Object obj, int[] iArr, Class<T> cls, boolean z) {
        boolean isDebug;
        RuntimeException runtimeException;
        IpChange ipChange = $ipChange;
        String str2 = str;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fcef8d9", new Object[]{str, obj, iArr, cls, new Boolean(z)});
        }
        if (iArr != null) {
            try {
                if (iArr.length > 9 && ApplicationUtil.isDebug()) {
                    throw new RuntimeException("not support");
                }
                StringBuilder sb = new StringBuilder(str);
                for (int i = 0; i < iArr.length; i++) {
                    String str3 = "#" + i;
                    int indexOf = sb.indexOf(str3);
                    while (indexOf != -1) {
                        sb.replace(indexOf, str3.length() + indexOf, String.valueOf(iArr[i]));
                        indexOf = sb.indexOf(str3, indexOf + String.valueOf(iArr[i]).length());
                    }
                }
                str2 = (T) sb.toString();
            } finally {
                if (!isDebug) {
                }
            }
        }
        if (str2.startsWith("${")) {
            return (T) handleExpressionTemplate(str2, obj, cls, z);
        }
        if (str2.startsWith("@query{")) {
            return (T) handleQueryExpression(str2, obj, cls, z);
        }
        if (str2.startsWith("@parseJSON{")) {
            return (T) handleParseJsonExpression(str2, obj, cls, z);
        }
        if (str2.startsWith("{")) {
            return (T) handleJsonExpression(str2, obj, iArr, cls, z);
        }
        if (cls.isInstance(str2)) {
            return (T) str2;
        }
        return null;
    }

    private static <T> T handleExpressionTemplate(String str, Object obj, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d046cdd4", new Object[]{str, obj, cls, new Boolean(z)});
        }
        String substring = str.substring(2, str.length() - 1);
        if (z && substring.startsWith("jsRuntimeData.")) {
            substring = substring.replaceFirst("jsRuntimeData.", "runtimeData.");
        }
        T t = (T) BeanUtil.get(obj, substring);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    private static <T> T handleParseJsonExpression(String str, Object obj, Class<T> cls, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("f20c4cc3", new Object[]{str, obj, cls, new Boolean(z)});
        }
        String[] split = str.substring(11, str.length() - 1).split(",");
        if (split.length <= 0) {
            return null;
        }
        Object bindData = bindData(split[0], obj, null, Object.class, z);
        if (bindData instanceof String) {
            String str3 = (String) bindData;
            if (str3.startsWith("{")) {
                bindData = JSON.parseObject(str3);
            } else {
                bindData = JSON.parseArray(str3);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            if (i > 1) {
                str2 = ".";
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(bindData(split[i], obj, null, Object.class, z));
        }
        T t = (T) BeanUtil.get(bindData, sb.toString());
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    static {
        t2o.a(537919630);
    }
}
