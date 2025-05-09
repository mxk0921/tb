package com.taobao.homepage.pop.protocol.event;

import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IPopViewEventListener {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopEventType {
    }

    void onEvent(int i, IPopData iPopData);
}
