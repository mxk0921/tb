package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface a {
    void addProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback);

    void deleteAllProfileId(IPushRequestCallback<Integer> iPushRequestCallback);

    void deleteProfileId(String str, IPushRequestCallback<Integer> iPushRequestCallback);

    void queryProfileIds(IPushRequestCallback<List<String>> iPushRequestCallback);
}
