package com.taobao.taolive.room.universal.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager;
import java.util.HashMap;
import java.util.Map;
import tb.rbu;
import tb.t2o;
import tb.vx9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LiveKtUtAdapterImpl implements ITaoLiveKtUtManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093329);
        t2o.a(1003487334);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager
    public void clicked(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ddad003", new Object[]{this, str, str2, map});
        } else {
            rbu.K(vx9.d(), str.replace("Button-", ""), new HashMap(map));
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtUtManager
    public void exposed(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de416ea", new Object[]{this, str, str2, map});
        } else {
            rbu.c0(vx9.d(), str, new HashMap(map));
        }
    }
}
