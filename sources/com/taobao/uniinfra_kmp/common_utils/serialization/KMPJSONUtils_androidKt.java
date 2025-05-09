package com.taobao.uniinfra_kmp.common_utils.serialization;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.io.Serializable;
import kotlin.Metadata;
import tb.ckf;
import tb.gyf;
import tb.t2o;
import tb.wyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\b\u001a\u0004\u0018\u00010\u0007\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u000e\u001a\u0004\u0018\u00010\r\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "T", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/a$a;", "value", "Ltb/wyf;", "clazz", "", "encodeToString", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/a$a;Ljava/io/Serializable;Ltb/wyf;)Ljava/lang/String;", "string", "decodeFromString", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/a$a;Ljava/lang/String;Ltb/wyf;)Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "encodeToJsonObject", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/a$a;Ljava/io/Serializable;Ltb/wyf;)Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "jsonObject", "decodeFromJsonObject", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/a$a;Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;Ltb/wyf;)Ljava/io/Serializable;", "common_utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class KMPJSONUtils_androidKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1029701702);
    }

    public static final Object a(a.C0797a aVar, String str) {
        Object parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2468c4e8", new Object[]{aVar, str});
        }
        ckf.g(aVar, "<this>");
        ckf.g(str, "str");
        try {
            parse = JSON.parse(str);
        } catch (Exception unused) {
        }
        if (parse instanceof JSONObject) {
            return new KMPJsonObject(parse);
        }
        if (parse instanceof JSONArray) {
            return new KMPJsonArray((JSONArray) parse);
        }
        return null;
    }

    public static final <T extends Serializable> T decodeFromJsonObject(a.C0797a aVar, KMPJsonObject kMPJsonObject, wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("f6068728", new Object[]{aVar, kMPJsonObject, wyfVar}));
        }
        ckf.g(aVar, "<this>");
        ckf.g(wyfVar, "clazz");
        if (kMPJsonObject == null) {
            return null;
        }
        try {
            return (T) ((Serializable) JSON.parseObject(kMPJsonObject.toJsonString(), gyf.b(wyfVar)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final <T extends Serializable> T decodeFromString(a.C0797a aVar, String str, wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("708e98ea", new Object[]{aVar, str, wyfVar}));
        }
        ckf.g(aVar, "<this>");
        ckf.g(wyfVar, "clazz");
        if (str == null) {
            return null;
        }
        return (T) ((Serializable) JSON.parseObject(str, gyf.b(wyfVar)));
    }

    public static final <T extends Serializable> KMPJsonObject encodeToJsonObject(a.C0797a aVar, T t, wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("a7de318f", new Object[]{aVar, t, wyfVar});
        }
        ckf.g(aVar, "<this>");
        ckf.g(wyfVar, "clazz");
        if (t == null) {
            return null;
        }
        return new KMPJsonObject(JSON.parseObject(JSON.toJSONString(t)));
    }

    public static final <T extends Serializable> String encodeToString(a.C0797a aVar, T t, wyf<T> wyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ed92fd1", new Object[]{aVar, t, wyfVar});
        }
        ckf.g(aVar, "<this>");
        ckf.g(wyfVar, "clazz");
        if (t == null) {
            return null;
        }
        return JSON.toJSONString(t);
    }
}
