package com.alibaba.android.umf.datamodel.protocol.ultron;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface ProtocolType {
    public static final String COMPLETE = "COMPLETE";
    public static final String DELTA = "DELTA";
    public static final String OTHER = "OTHER";
    public static final String STREAM = "STREAM";
}
