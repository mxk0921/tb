package com.ali.user.open.core.service;

import com.ali.user.open.core.callback.MemberCallback;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface OneKeyLoginService {
    void getLoginMaskPhone(MemberCallback<String> memberCallback);

    void oneKeyLogin(Map<String, String> map, MemberCallback<String> memberCallback);
}
