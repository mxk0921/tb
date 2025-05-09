package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.MappingKey;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262791);
    }

    public static <M extends Merged> M a(JSONObject jSONObject, Class<M> cls) {
        JSONObject h;
        JSONObject jSONObject2;
        if (jSONObject == null || cls == null) {
            return null;
        }
        MappingKey mappingKey = (MappingKey) cls.getAnnotation(MappingKey.class);
        if (mappingKey == null) {
            tgh.b("GlobalDataUtils", "getMergedData failed for not MappingKey annotation, in class: " + cls);
            return null;
        }
        String key = mappingKey.key();
        if (TextUtils.isEmpty(key)) {
            tgh.b("GlobalDataUtils", "getMergedData failed with an empty MappingKey key(), in class: " + cls);
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(key);
        if (!(jSONObject3 != null || (h = DynamicMergeUtils.h(jSONObject)) == null || (jSONObject2 = h.getJSONObject("meta")) == null)) {
            jSONObject3 = jSONObject2.getJSONObject(key);
        }
        if (jSONObject3 == null) {
            tgh.b("GlobalDataUtils", "getMergedData failed with an empty mergedValue for key: '" + key + "', in class: " + cls);
            return null;
        }
        try {
            return cls.getConstructor(JSONObject.class).newInstance(jSONObject3);
        } catch (Throwable th) {
            tgh.c("GlobalDataUtils", "getMergedData failed for not M(JSONObject) constructor", th);
            return null;
        }
    }
}
