package com.taobao.kmp.live.liveBizComponent.helper;

import com.taobao.weex.common.Constants;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0005J'\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimer;", "Ljava/io/Serializable;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ltb/xhv;", "startTimer", "()V", "destroy", "Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;", "handler", "", "tag", "", Constants.Name.INTERVAL, "delayEvent", "(Lcom/taobao/kmp/live/liveBizComponent/helper/ITaoLiveKtGlobalTimerHandler;Ljava/lang/String;J)V", "loopEvent", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ITaoLiveKtGlobalTimer extends Serializable {
    void delayEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str, long j);

    void destroy();

    void loopEvent(ITaoLiveKtGlobalTimerHandler iTaoLiveKtGlobalTimerHandler, String str, long j);

    void startTimer();
}
