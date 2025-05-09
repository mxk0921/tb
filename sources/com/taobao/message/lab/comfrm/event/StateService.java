package com.taobao.message.lab.comfrm.event;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface StateService {
    <T> T getPrivateState(Class<T> cls);

    void setPrivateState(Object obj);
}
