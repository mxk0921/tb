package com.taobao.themis.kernel.manager;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.q9s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSActivityKeepAliveManager$keepAliveWhiteList$2 extends Lambda implements d1a<JSONArray> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSActivityKeepAliveManager$keepAliveWhiteList$2 INSTANCE = new TMSActivityKeepAliveManager$keepAliveWhiteList$2();

    public TMSActivityKeepAliveManager$keepAliveWhiteList$2() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(TMSActivityKeepAliveManager$keepAliveWhiteList$2 tMSActivityKeepAliveManager$keepAliveWhiteList$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/manager/TMSActivityKeepAliveManager$keepAliveWhiteList$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final JSONArray invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("da146d5f", new Object[]{this});
        }
        try {
            return JSON.parseArray(q9s.l4());
        } catch (Exception e) {
            TMSLogger.c("TMSActivityKeepAliveManager", "canKeepAlive whiteList check fail", e);
            return new JSONArray();
        }
    }
}
