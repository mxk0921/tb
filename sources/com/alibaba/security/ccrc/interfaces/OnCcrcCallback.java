package com.alibaba.security.ccrc.interfaces;

import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.model.InitResult;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface OnCcrcCallback {
    void onInit(InitState initState, InitResult initResult);
}
