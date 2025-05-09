package com.taobao.kmp.live.liveBizComponent.service.base;

import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/service/base/ITaoLiveKtLifeCycle;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/xhv;", "viewWillAppear", "()V", "viewDidAppear", "viewWillDisappear", "viewDidDisappear", "onAppWillEnterForeground", "onAppDidEnterBackground", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtLifeCycle extends Serializable {
    void onAppDidEnterBackground();

    void onAppWillEnterForeground();

    void viewDidAppear();

    void viewDidDisappear();

    void viewWillAppear();

    void viewWillDisappear();
}
