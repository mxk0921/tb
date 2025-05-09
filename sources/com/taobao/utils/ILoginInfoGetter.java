package com.taobao.utils;

import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ILoginInfoGetter extends Serializable {
    LoginInfo getLastLoginUserInfo();

    LoginInfo getLoginUserInfo();
}
