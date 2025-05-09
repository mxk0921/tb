package com.taobao.uikit.toolbar.api;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IToolBarStyleSelector {
    public static final int STYLE_DESIGN_TOKEN = 2;
    public static final int STYLE_NORMAL = 1;

    /* compiled from: Taobao */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ToolBarStyle {
    }

    int getToolBarStyle();
}
