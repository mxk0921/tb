package com.taobao.message.notification.system.base;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IOldAgooNotification {
    int getMergeType();

    String getMessageId();

    void performNotify();

    void setContent(String str);

    void setTitle(String str);

    void setUrl(String str);
}
