package com.huawei.hms.push;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f5442a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(Message message);
    }

    public f(a aVar) {
        this.f5442a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = this.f5442a.get();
        if (aVar != null) {
            aVar.a(message);
        }
    }
}
