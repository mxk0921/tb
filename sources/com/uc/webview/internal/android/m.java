package com.uc.webview.internal.android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.uc.webview.export.WebStorage;
import com.uc.webview.internal.interfaces.IWebStorage;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class m implements IWebStorage {

    /* renamed from: a  reason: collision with root package name */
    private WebStorage f14361a = WebStorage.getInstance();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ValueCallback<Map> {
        private ValueCallback<Map> b;

        public a(ValueCallback<Map> valueCallback) {
            this.b = valueCallback;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Map map) {
            Map map2 = map;
            ValueCallback<Map> valueCallback = this.b;
            if (valueCallback != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    WebStorage.Origin origin = (WebStorage.Origin) entry.getValue();
                    hashMap.put(entry.getKey(), new WebStorage.Origin(origin.getOrigin(), origin.getQuota(), origin.getUsage()));
                }
                valueCallback.onReceiveValue(hashMap);
            }
        }
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    public final void deleteAllData() {
        this.f14361a.deleteAllData();
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    public final void deleteOrigin(String str) {
        this.f14361a.deleteOrigin(str);
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    public final void getOrigins(ValueCallback<Map> valueCallback) {
        this.f14361a.getOrigins(new a(valueCallback));
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    public final void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        this.f14361a.getQuotaForOrigin(str, valueCallback);
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    public final void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        this.f14361a.getUsageForOrigin(str, valueCallback);
    }

    @Override // com.uc.webview.internal.interfaces.IWebStorage
    @Deprecated
    public final void setQuotaForOrigin(String str, long j) {
        this.f14361a.setQuotaForOrigin(str, j);
    }
}
