package com.alibaba.ariver.engine.api.resources;

import java.io.InputStream;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface Resource {
    void addHeader(String str, String str2);

    byte[] getBytes();

    String getEncoding();

    Map<String, String> getHeaders();

    String getMimeType();

    ResourceSourceType getSourceType();

    InputStream getStream();

    String getUrl();

    boolean isLocal();

    void setBytes(byte[] bArr);

    void setSourceType(ResourceSourceType resourceSourceType);
}
