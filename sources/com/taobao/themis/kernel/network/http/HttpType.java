package com.taobao.themis.kernel.network.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class HttpType extends Enum<HttpType> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HttpType json = new HttpType("json", 0);
    public static final HttpType text = new HttpType("text", 1);
    public static final HttpType jsonp = new HttpType("jsonp", 2);
    public static final HttpType base64 = new HttpType("base64", 3);
    public static final HttpType arraybuffer = new HttpType("arraybuffer", 4);
    private static final /* synthetic */ HttpType[] $VALUES = $values();

    private static final /* synthetic */ HttpType[] $values() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpType[]) ipChange.ipc$dispatch("eb394275", new Object[0]) : new HttpType[]{json, text, jsonp, base64, arraybuffer};
    }

    private HttpType(String str, int i) {
    }

    public static /* synthetic */ Object ipc$super(HttpType httpType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/network/http/HttpType");
    }

    public static HttpType valueOf(String str) {
        Object valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            valueOf = ipChange.ipc$dispatch("5b25d4e0", new Object[]{str});
        } else {
            valueOf = Enum.valueOf(HttpType.class, str);
        }
        return (HttpType) valueOf;
    }

    public static HttpType[] values() {
        Object clone;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            clone = ipChange.ipc$dispatch("91a87751", new Object[0]);
        } else {
            clone = $VALUES.clone();
        }
        return (HttpType[]) clone;
    }
}
