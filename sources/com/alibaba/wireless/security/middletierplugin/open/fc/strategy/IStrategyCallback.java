package com.alibaba.wireless.security.middletierplugin.open.fc.strategy;

import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0129;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface IStrategyCallback {
    void onPreStrategy(long j, boolean z);

    void onStrategy(long j, C0129.EnumC0130 r3, long j2, HashMap hashMap);
}
