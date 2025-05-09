package com.alibaba.android.aura;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IAURAInputField<DATA> extends Serializable {
    DATA getData();

    String getErrorMessage();

    String getFieldName();

    Class getTargetClass();

    boolean isRequired();
}
