package com.alibaba.security.realidentity.service.track;

import com.alibaba.security.realidentity.biz.entity.ClientInfo;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPTrackHttpModel implements Serializable {
    public ClientInfo clientInfo;
    public String verifyToken;
    public List<TrackLog> wirelessLogs;
}
