package com.taobao.tbpoplayer.nativerender.info;

import com.taobao.tbpoplayer.nativerender.dsl.PreFetchModel;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreFetchContext implements Serializable {
    public String errorInfo;
    public PreFetchModel preFetchModel;
    public String resData;
    public String traceId;
    public boolean success = false;
    public boolean conditionSuccess = false;

    static {
        t2o.a(790626468);
    }
}
