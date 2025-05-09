package tb;

import com.taobao.taopai2.material.business.specified.SpecifiedFilterResultBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface irc extends pjd {
    public static final int CODE_CLIENT_VERSION_NOT_MATCH = 6;
    public static final int CODE_DEVICE_MODEL_NOT_MATCH = 7;
    public static final int CODE_DEVICE_OS_NOT_MATCH = 2;
    public static final int CODE_DEVICE_OS_VERSION_NOT_MATCH = 3;
    public static final int CODE_NOT_FOUND = 100;
    public static final int CODE_OTHER = 500;
    public static final int CODE_PLATFORM_NOT_MATCH = 5;
    public static final int CODE_SCORE_NOT_MATCH = 1;
    public static final int CODE_UNKNOW_DEVICE_MODEL = 4;

    void f(SpecifiedFilterResultBean specifiedFilterResultBean);
}
