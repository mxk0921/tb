package com.alibaba.poplayer.config.fetch;

import com.alibaba.poplayer.trigger.BaseConfigItem;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IConfigFetcher extends Serializable {
    BaseConfigItem getConfigItemById(String str, String str2);

    boolean isUpdatingConfig();

    void startFetch(boolean z);

    void startLoadConfigs(boolean z, String str);
}
