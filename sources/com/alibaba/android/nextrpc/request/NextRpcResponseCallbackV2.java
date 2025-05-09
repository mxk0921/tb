package com.alibaba.android.nextrpc.request;

import java.util.List;
import tb.hkd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface NextRpcResponseCallbackV2 extends hkd {
    public static final int RESPONSE_ATTACHED = 2;
    public static final int RESPONSE_CACHED = 0;
    public static final int RESPONSE_FAILURE = -1;
    public static final int RESPONSE_MAIN = 1;
    public static final int RESPONSE_TIMEOUT = -2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ResponseType {
    }

    void d(int i, AbsResponse absResponse, List<AttachedResponse> list, boolean z);
}
