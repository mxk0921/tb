package com.ut.share.business;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ShareBusinessListener {
    void onFinished(Map<String, String> map);

    void onShare(ShareContent shareContent, ShareTargetType shareTargetType);
}
