package com.taobao.message.lab.comfrm.inner2;

import com.taobao.message.lab.comfrm.util.Observer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ExecuteService {
    String execute(String str, Observer<Object> observer);

    void switchContext(Map<String, Object> map);
}
