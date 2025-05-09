package com.taobao.kmp.live.liveBizComponent.component;

import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer;
import com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle;
import kotlin.Metadata;
import tb.es6;
import tb.exs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/component/ITaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtDataServer;", "Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtLifeCycle;", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "Ltb/xhv;", "install", "(Ltb/exs;)V", "unInstall", "()V", "", "getName", "()Ljava/lang/String;", "getBizContext", "()Ltb/exs;", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtComponent extends ITaoLiveKtDataServer, ITaoLiveKtLifeCycle {
    exs getBizContext();

    String getName();

    void install(exs exsVar);

    void unInstall();
}
