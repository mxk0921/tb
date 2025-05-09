package com.taobao.android.preload.core.task;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.csm;
import tb.eov;
import tb.kcd;
import tb.pl4;
import tb.wsm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PreloadTaskEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "bizName";
    public static final String EXIST_CACHE_TYPE = "existCacheType";
    public static final String ITEMS = "items";
    public static final String PAGE_DETAIL = "page_detail";
    public static final String PAGE_INDEX = "pageIndex";
    public static final String PAGE_TOKEN = "pageToken";
    public static final String SOURCE_FROM = "sourceFrom";
    private static final String TAG = "PreloadTaskEntity";
    public String bizName;
    public ArrayList<a> items;
    public String key;
    public String pageIndex;
    public String pageToken;
    public String sourceFrom;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9177a;
        public String b;
        public Map<String, String> c;
        public String d;
        public String e;
        public String f;
        public String g;
        public JSONObject h;
        public boolean i;
        public String j;

        public static String a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c56dd8c6", new Object[]{map});
            }
            if (map == null) {
                return "";
            }
            String str = map.get("id");
            return TextUtils.isEmpty(str) ? map.get("itemId") : str;
        }

        public static a b(JSONObject jSONObject, kcd kcdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fda2346c", new Object[]{jSONObject, kcdVar});
            }
            a aVar = new a();
            String string = jSONObject.getString("url");
            JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
            String string2 = jSONObject.getString("itemIds");
            JSONObject jSONObject3 = jSONObject.getJSONObject(pl4.KEY_CACHE_DATA);
            String string3 = jSONObject.getString("disablePreRequest");
            String string4 = jSONObject.getString(PreloadTaskEntity.EXIST_CACHE_TYPE);
            if (!TextUtils.isEmpty(string)) {
                aVar.d = string;
                Map<String, String> a2 = eov.a(string);
                aVar.c = a2;
                if (kcdVar == null) {
                    aVar.e = a(a2);
                } else {
                    aVar.e = kcdVar.a(string);
                }
                aVar.h = jSONObject3;
                aVar.i = "true".equals(string3);
            } else if (jSONObject2 != null) {
                aVar.c = (Map) JSON.toJavaObject(jSONObject2, Map.class);
                aVar.e = jSONObject.getString("itemId");
            } else if (!TextUtils.isEmpty(string2)) {
                aVar.f = jSONObject.getString("itemIds");
            }
            aVar.j = string4;
            return aVar;
        }

        public boolean equals(Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str2 = this.f9177a;
            if (str2 == null || !str2.equals(aVar.f9177a) || (str = this.e) == null || !str.equals(aVar.e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            String str = this.f9177a;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i3 = (i + 31) * 31;
            String str2 = this.e;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Item{bizName='" + this.f9177a + "', sourceFrom='" + this.b + "', queryParams=" + this.c + ", queryUrl='" + this.d + "', itemId='" + this.e + "', itemIds='" + this.f + "'}";
        }
    }

    public static PreloadTaskEntity emptyEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("4a0ba510", new Object[0]);
        }
        return new PreloadTaskEntity();
    }

    public static PreloadTaskEntity parser(JSONObject jSONObject, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreloadTaskEntity) ipChange.ipc$dispatch("858916bb", new Object[]{jSONObject, kcdVar}) : parser(jSONObject, kcdVar, false);
    }

    private static void splitItemIds(a aVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb53d994", new Object[]{aVar, arrayList});
            return;
        }
        String[] split = aVar.f.split(",");
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i])) {
                a aVar2 = new a();
                aVar2.e = split[i];
                aVar2.f9177a = aVar.f9177a;
                aVar2.b = aVar.b;
                HashMap hashMap = new HashMap();
                hashMap.put("from", aVar2.b);
                hashMap.put("id", aVar2.e);
                aVar2.c = hashMap;
                arrayList.add(aVar2);
            }
        }
    }

    public String getItemsId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae010f54", new Object[]{this});
        }
        ArrayList<a> arrayList = this.items;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<a> it = this.items.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().e);
            stringBuffer.append(",");
        }
        return stringBuffer.toString();
    }

    public String getItemsSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c5adaae", new Object[]{this});
        }
        ArrayList<a> arrayList = this.items;
        if (arrayList == null || arrayList.isEmpty()) {
            return "0";
        }
        return String.valueOf(this.items.size());
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.bizName + "_" + this.sourceFrom;
    }

    public boolean isContainsItem(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d770a09", new Object[]{this, aVar})).booleanValue();
        }
        ArrayList<a> arrayList = this.items;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return this.items.contains(aVar);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreloadTaskEntity{bizName='" + this.bizName + "', sourceFrom='" + this.sourceFrom + "', items=" + this.items + ", key='" + this.key + "', pageIndex='" + this.pageIndex + "', pageToken='" + this.pageToken + "'}";
    }

    public static PreloadTaskEntity parser(JSONObject jSONObject, kcd kcdVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("38f93c7f", new Object[]{jSONObject, kcdVar, new Boolean(z)});
        }
        try {
            PreloadTaskEntity preloadTaskEntity = new PreloadTaskEntity();
            String string = jSONObject.getString("bizName");
            preloadTaskEntity.bizName = string;
            if (TextUtils.isEmpty(string)) {
                preloadTaskEntity.bizName = PAGE_DETAIL;
            }
            preloadTaskEntity.sourceFrom = jSONObject.getString(SOURCE_FROM);
            preloadTaskEntity.pageIndex = jSONObject.getString("pageIndex");
            preloadTaskEntity.pageToken = jSONObject.getString(PAGE_TOKEN);
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int size = jSONArray == null ? 0 : jSONArray.size();
            ArrayList arrayList = new ArrayList();
            ArrayList<a> arrayList2 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                a b = a.b(jSONArray.getJSONObject(i), kcdVar);
                b.f9177a = preloadTaskEntity.bizName;
                b.b = preloadTaskEntity.sourceFrom;
                b.g = preloadTaskEntity.pageToken;
                if (z) {
                    if (!arrayList.contains(b.e)) {
                        arrayList.add(b.e);
                    }
                }
                if (!TextUtils.isEmpty(b.f)) {
                    splitItemIds(b, arrayList2);
                } else if (!TextUtils.isEmpty(b.e)) {
                    arrayList2.add(b);
                }
            }
            preloadTaskEntity.items = arrayList2;
            return preloadTaskEntity;
        } catch (Exception e) {
            wsm.b(csm.a(TAG), "PreloadTaskEntity parser error", e);
            return emptyEntity();
        }
    }

    public static PreloadTaskEntity parser(String str, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadTaskEntity) ipChange.ipc$dispatch("f8c2b121", new Object[]{str, kcdVar});
        }
        try {
            return parser(JSON.parseObject(str), kcdVar);
        } catch (Exception e) {
            wsm.b(csm.a(TAG), "PreloadTaskEntity parser error", e);
            return emptyEntity();
        }
    }
}
