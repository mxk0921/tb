package com.taobao.message.lab.comfrm.inner2.resource;

import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangePublisher;", "", "Ltb/xhv;", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "()V", "Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;", "observer", "subscribeResourceChange", "(Lcom/taobao/message/lab/comfrm/inner2/resource/IResourceChangeObserver;)V", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IResourceChangePublisher {
    void dispose();

    void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver);
}
