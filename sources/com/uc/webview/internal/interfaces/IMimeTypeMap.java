package com.uc.webview.internal.interfaces;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IMimeTypeMap {
    String getExtensionFromMimeType(String str);

    String getFileExtensionFromUrlEx(String str);

    String getMimeTypeFromExtension(String str);

    boolean hasExtension(String str);

    boolean hasMimeType(String str);
}
