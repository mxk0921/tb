package com.taobao.message.window;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IFloatWindow {
    void addListener(FloatWindowListener floatWindowListener);

    boolean create(FloatWindowVO floatWindowVO);

    void createWithRequestPermission(FloatWindowVO floatWindowVO);

    void destroy();

    String getNavUrl();

    int getStatus();

    void removeListener(FloatWindowListener floatWindowListener);

    void setIcon(String str);

    void setIconBackground(String str);

    void setNavUrl(String str);

    void setText(String str);

    void setTimeSecond(int i);

    void setVisible(boolean z);
}
