package com.tmall.android.dai.trigger.protocol;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.protocol.cep.pattern.CepNative;
import com.tmall.android.dai.trigger.protocol.cep.pattern.a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.cqq;
import tb.d0q;
import tb.hh3;
import tb.o6n;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Cep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944729);
    }

    public static hh3 createFromConfigAndSink(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hh3) ipChange.ipc$dispatch("26ac472d", new Object[]{str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (str3 == null) {
            str3 = parseObject.getString("id");
        }
        StringBuilder sb = new StringBuilder("cep_id#");
        sb.append(str2 == null ? "empty_model" : str2);
        sb.append("#");
        sb.append(str3 == null ? UUID.randomUUID().toString() : str3);
        CepNative cepNative = new CepNative(sb.toString(), str);
        if (!cepNative.isFailed()) {
            d0q<List<Map<String, String>>> createSink = createSink(str3, parseObject.getJSONObject("sink"), str2);
            if (createSink != null) {
                return new hh3(str3, new a(cepNative), createSink, str);
            }
            throw new Exception("cannot fink sink ");
        }
        throw new Exception("Create Native Cep Failed: " + cepNative.failedReason);
    }

    public static cqq createStreamProtocolFromConfigAndSink(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cqq) ipChange.ipc$dispatch("6acc4084", new Object[]{str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (str3 == null) {
            str3 = parseObject.getString("id");
        }
        StringBuilder sb = new StringBuilder("cep_id#");
        sb.append(str2 == null ? "empty_model" : str2);
        sb.append("#");
        sb.append(str3 == null ? UUID.randomUUID().toString() : str3);
        CepNative cepNative = new CepNative(sb.toString(), str);
        if (!cepNative.isFailed()) {
            d0q<List<Map<String, String>>> createSink = createSink(str3, parseObject.getJSONObject("sink"), str2);
            if (createSink != null) {
                return new cqq(str3, new a(cepNative), createSink, str);
            }
            throw new Exception("cannot fink sink ");
        }
        throw new Exception("Create Native Cep Failed: " + cepNative.failedReason);
    }

    private static d0q<List<Map<String, String>>> createSink(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d0q) ipChange.ipc$dispatch("feda983a", new Object[]{str, jSONObject, str2});
        }
        if (jSONObject != null) {
            String string = jSONObject.getString("type");
            JSONObject jSONObject2 = jSONObject.getJSONObject("config");
            if (!TextUtils.equals("python", string)) {
                return null;
            }
            if (jSONObject2 != null) {
                boolean equals = Boolean.TRUE.equals(jSONObject2.getBoolean("acceptSeq"));
                if (str2 == null) {
                    str2 = jSONObject2.getString(r4p.KEY_MODEL_NAME);
                }
                return new o6n(str, str2, equals);
            } else if (str2 == null) {
                return null;
            } else {
                return new o6n(str, str2, false);
            }
        } else if (str2 == null) {
            return null;
        } else {
            return new o6n(str, str2, false);
        }
    }
}
