package com.taobao.search.sf.util;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MultiValueParamArrayMap extends ArrayMap<String, String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayMap<String, String> f11704a;

    public static /* synthetic */ Object ipc$super(MultiValueParamArrayMap multiValueParamArrayMap, String str, Object... objArr) {
        if (str.hashCode() == -605927644) {
            return super.put(objArr[0], objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/util/MultiValueParamArrayMap");
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f6fd3b6", new Object[]{this, str, str2});
        }
        String str3 = f11704a.get(str);
        if (TextUtils.isEmpty(str3)) {
            return (String) super.put(str, str2);
        }
        String str4 = get(str);
        if (TextUtils.isEmpty(str4)) {
            return (String) super.put(str, str2);
        }
        return (String) super.put(str, str4 + str3 + str2);
    }

    static {
        t2o.a(815793487);
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        f11704a = arrayMap;
        arrayMap.put(r4p.KEY_PROPERTY, ";");
        arrayMap.put("service", ",");
        arrayMap.put(r4p.KEY_ON_FILTER, ";");
    }
}
