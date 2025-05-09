package com.alibaba.security.wukong.bx.algo;

import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.keep.IKeep;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.Ra;
import com.alibaba.security.ccrc.service.build.Sa;
import com.alibaba.security.wukong.bx.workconf.BaseWorkConfHandler;
import com.alibaba.security.wukong.bx.workconf.WorkConfOperator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class BxData {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OP_CONF = "opConf";
    public static final String TAG = "BxData";
    public static final String WORK_CONF = "workConf";
    public String TT;
    public List<List<String>> data;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OpConfItemValue implements IKeep {
        public String input;
        public boolean isKey;
        public String name;
        public String op;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class OpResult implements IKeep {
        public boolean del;
        public String name;
        public Object value;

        public OpResult(String str, Object obj, boolean z) {
            this.name = str;
            this.value = obj;
            this.del = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final int f2921a = 0;
        public static final int b = -1;
        public static final int c = -2;
        public String d;
        public Map<String, Object> e;
        public String f;
        public int g;
        public boolean h;
        public String i;

        public a() {
        }

        public static a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f7bfc37", new Object[0]);
            }
            a aVar = new a();
            aVar.h = true;
            aVar.f = "success";
            return aVar;
        }

        public a(String str, Map<String, Object> map) {
            this.d = str;
            this.e = map;
        }

        public static a a(int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a9768d0", new Object[]{new Integer(i), str, str2});
            }
            a aVar = new a();
            aVar.h = false;
            aVar.g = i;
            aVar.f = str;
            aVar.i = str2;
            return aVar;
        }
    }

    public static a doParseSeqResult(String str, String str2, String str3, Map<String, Object> map) {
        BaseWorkConfHandler.WorkConfResult a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("603ad433", new Object[]{str, str2, str3, map});
        }
        if (!(str == null || (a2 = new WorkConfOperator().a(map, str)) == null || a2.finalResult.isEmpty())) {
            map.putAll(a2.finalResult);
            map.remove(a2.featureNeedDelete);
            map.remove(WORK_CONF);
        }
        if (str2 == null) {
            return returnOriginResult(str3, map, "opConf is null, ");
        }
        Map map2 = (Map) JsonUtils.parseObject(str2, (Class<Object>) Map.class);
        if (map2 == null || map2.isEmpty()) {
            return returnOriginResult(str3, map, "confValueMap is null, ");
        }
        return getSeqResultByOpConf(str3, map, map2);
    }

    public static a getSeqResultByOpConf(String str, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d1c76aac", new Object[]{str, map, map2});
        }
        a aVar = new a();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str2 : map.keySet()) {
            if (!map2.containsKey(str2)) {
                hashMap.put(str2, map.get(str2));
            } else {
                List parseArray = JSON.parseArray(JsonUtils.toJSONString(map2.get(str2)), OpConfItemValue.class);
                if (parseArray == null || parseArray.isEmpty()) {
                    hashMap.put(str2, map.get(str2));
                } else {
                    hashMap.put(str2, map.get(str2));
                    List<OpResult> handle = handle(parseArray, str2, map.get(str2));
                    if (handle != null) {
                        for (OpResult opResult : handle) {
                            if (!opResult.del) {
                                hashMap.put(opResult.name, opResult.value);
                            } else {
                                arrayList.add(str2);
                            }
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.remove((String) it.next());
        }
        aVar.e = hashMap;
        aVar.h = true;
        aVar.i = str;
        return aVar;
    }

    public static List<OpResult> handle(List<OpConfItemValue> list, String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e76ad4c1", new Object[]{list, str, obj});
        }
        if (!(obj instanceof String)) {
            str2 = JsonUtils.toJSONString(obj);
        } else {
            str2 = (String) obj;
        }
        Sa sa = new Sa(str, str2);
        for (OpConfItemValue opConfItemValue : list) {
            Ra a2 = Ra.c.a(opConfItemValue);
            if (a2 != null) {
                sa.a(a2);
            }
        }
        try {
            sa.b();
        } catch (Throwable unused) {
        }
        return sa.a();
    }

    public static a returnOriginResult(String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("eabf8174", new Object[]{str, map, str2});
        }
        a aVar = new a();
        aVar.e = map;
        aVar.f = str2;
        aVar.h = true;
        aVar.i = str;
        return aVar;
    }
}
