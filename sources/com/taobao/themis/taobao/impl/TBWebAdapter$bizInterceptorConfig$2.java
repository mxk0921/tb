package com.taobao.themis.taobao.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.q9s;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TBWebAdapter$bizInterceptorConfig$2 extends Lambda implements d1a<Map<String, ? extends String[]>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TBWebAdapter$bizInterceptorConfig$2 INSTANCE = new TBWebAdapter$bizInterceptorConfig$2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a extends TypeReference<Map<String, ? extends String[]>> {
    }

    public TBWebAdapter$bizInterceptorConfig$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TBWebAdapter$bizInterceptorConfig$2 tBWebAdapter$bizInterceptorConfig$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/taobao/impl/TBWebAdapter$bizInterceptorConfig$2");
    }

    @Override // tb.d1a
    public final Map<String, ? extends String[]> invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d4cb4f4", new Object[]{this});
        }
        try {
            Map<String, ? extends String[]> map = (Map) JSON.parseObject(q9s.e3(), new a(), new Feature[0]);
            ckf.f(map, "config");
            return map;
        } catch (Exception e) {
            TMSLogger.c("TBWebAdapter", e.getMessage(), e);
            return kotlin.collections.a.h();
        }
    }
}
