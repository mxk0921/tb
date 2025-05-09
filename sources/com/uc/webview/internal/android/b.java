package com.uc.webview.internal.android;

import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import com.uc.webview.internal.interfaces.IGeolocationPermissions;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements IGeolocationPermissions {

    /* renamed from: a  reason: collision with root package name */
    private GeolocationPermissions f14345a = GeolocationPermissions.getInstance();

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void allow(String str) {
        this.f14345a.allow(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void clear(String str) {
        this.f14345a.clear(str);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void clearAll() {
        this.f14345a.clearAll();
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        this.f14345a.getAllowed(str, valueCallback);
    }

    @Override // com.uc.webview.internal.interfaces.IGeolocationPermissions
    public final void getOrigins(ValueCallback<Set<String>> valueCallback) {
        this.f14345a.getOrigins(valueCallback);
    }
}
