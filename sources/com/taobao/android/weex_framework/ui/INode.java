package com.taobao.android.weex_framework.ui;

import android.graphics.Rect;
import android.view.View;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import tb.cwh;
import tb.jpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface INode {
    void bindNodeHolder(jpc jpcVar);

    View getAttachedView();

    int getBottom();

    Rect getGlobalVisibleRect();

    MUSDKInstance getInstance();

    cwh getInvoker(MUSValue mUSValue);

    int getLeft();

    float getOpacity();

    int getRight();

    int getTop();

    void setInstance(MUSDKInstance mUSDKInstance);

    void setOpacity(float f);

    void updateAttrs(MUSProps mUSProps);

    void updateStyles(MUSProps mUSProps);
}
