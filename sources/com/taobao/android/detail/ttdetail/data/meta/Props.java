package com.taobao.android.detail.ttdetail.data.meta;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
@MappingKey(key = "props")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Props extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<a> bundleProps;
    private JSONObject data;
    private ArrayList<Pair<String, String>> propList;

    static {
        t2o.a(912261681);
    }

    public Props(JSONObject jSONObject) {
        super(jSONObject);
        this.data = jSONObject;
        JSONArray jSONArray = jSONObject.getJSONArray("propsList");
        if (jSONArray != null) {
            this.bundleProps = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                this.bundleProps.add(new a(jSONArray.getJSONObject(i)));
            }
            return;
        }
        this.propList = initPropList();
    }

    private ArrayList<Pair<String, String>> initPropList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("82f9d3b2", new Object[]{this});
        }
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        JSONObject jSONObject = this.data;
        if (jSONObject == null) {
            return arrayList;
        }
        try {
            Iterator<Object> it = jSONObject.getJSONArray("groupProps").iterator();
            while (it.hasNext()) {
                Iterator<Object> it2 = ((JSONObject) it.next()).values().iterator();
                while (it2.hasNext()) {
                    Iterator<Object> it3 = ((JSONArray) it2.next()).iterator();
                    while (it3.hasNext()) {
                        JSONObject jSONObject2 = (JSONObject) it3.next();
                        for (String str : jSONObject2.keySet()) {
                            String string = jSONObject2.getString(str);
                            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(string)) {
                                arrayList.add(new Pair<>(str, string));
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static /* synthetic */ Object ipc$super(Props props, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/meta/Props");
    }

    public List<a> getBundleProps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fde2bf08", new Object[]{this});
        }
        return this.bundleProps;
    }

    public ArrayList<Pair<String, String>> getPropList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("109f65f8", new Object[]{this});
        }
        return this.propList;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<Pair<String, String>> f6755a;
        public final String b;

        static {
            t2o.a(912261682);
        }

        public a(JSONObject jSONObject) {
            this.f6755a = c(jSONObject);
            jSONObject.getString("itemId");
            this.b = jSONObject.getString("itemPic");
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f977f458", new Object[]{this});
            }
            return this.b;
        }

        public List<Pair<String, String>> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6e33f569", new Object[]{this});
            }
            return this.f6755a;
        }

        public final List<Pair<String, String>> c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6ae7952f", new Object[]{this, jSONObject});
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("baseProps");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    arrayList.add(new Pair(jSONObject2.getString("key"), jSONObject2.getString("value")));
                }
            }
            return arrayList;
        }
    }
}
