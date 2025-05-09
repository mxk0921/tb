package com.alibaba.wireless.aliprivacyext.track.model;

import com.alibaba.wireless.aliprivacyext.http.annotations.Api;
import java.io.Serializable;
import java.util.List;

/* compiled from: Taobao */
@Api(name = "mtop.dsm.compliance.external.privacy.log.put")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class b implements Serializable {
    public a clientInfo;
    public List<TrackLog> wirelessLogs;
}
