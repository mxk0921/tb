package com.taobao.themis.mix.weex_render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.jpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWeexAPIBridge$call$1 extends Lambda implements d1a<Pair<? extends String, ? extends String>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSWeexAPIBridge$call$1 INSTANCE = new TMSWeexAPIBridge$call$1();

    public TMSWeexAPIBridge$call$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TMSWeexAPIBridge$call$1 tMSWeexAPIBridge$call$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/weex_render/TMSWeexAPIBridge$call$1");
    }

    @Override // tb.d1a
    public final Pair<? extends String, ? extends String> invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c1956768", new Object[]{this});
        }
        jpu.a("error", "-1");
        return jpu.a("errorMessage", "当前环境不支持openApi");
    }
}
