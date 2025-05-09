package com.uc.webview.internal.android;

import android.webkit.MimeTypeMap;
import com.uc.webview.internal.interfaces.IMimeTypeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f implements IMimeTypeMap {

    /* renamed from: a  reason: collision with root package name */
    private MimeTypeMap f14348a = MimeTypeMap.getSingleton();

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getExtensionFromMimeType(String str) {
        return this.f14348a.getExtensionFromMimeType(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getFileExtensionFromUrlEx(String str) {
        return MimeTypeMap.getFileExtensionFromUrl(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final String getMimeTypeFromExtension(String str) {
        return this.f14348a.getMimeTypeFromExtension(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final boolean hasExtension(String str) {
        return this.f14348a.hasExtension(str);
    }

    @Override // com.uc.webview.internal.interfaces.IMimeTypeMap
    public final boolean hasMimeType(String str) {
        return this.f14348a.hasMimeType(str);
    }
}
