package com.alibaba.security.wukong.interfaces;

import android.content.Context;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.model.CCRCRiskSample;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface IContentRiskPlatform {
    void addAlgoHeartBeat(String str);

    String getCcrcCode();

    Context getContext();

    void inputInferData(Map<String, Object> map, CCRCRiskSample cCRCRiskSample);

    void trackLog(TrackLog trackLog, boolean z);
}
