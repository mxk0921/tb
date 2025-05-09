package com.uc.webview.internal.setup;

import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.base.c;
import com.uc.webview.base.task.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14466a = new AtomicBoolean(false);
    public final AtomicInteger b = new AtomicInteger(0);
    private final c c;
    private final StringBuffer d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14470a = new a((byte) 0);
    }

    public h() {
        c cVar = new c();
        this.c = cVar;
        this.d = new StringBuffer(String.valueOf(cVar.f14263a));
    }

    public final boolean a(int i, String str, boolean z) {
        String str2 = "**reachStatus(" + i + "):" + str + ", total:" + this.c.a();
        if (!a(i)) {
            Log.i("Setup.st", str2);
            AtomicInteger atomicInteger = this.b;
            atomicInteger.set(atomicInteger.get() | i);
            a(i, str);
            return true;
        } else if (z) {
            return false;
        } else {
            Log.w("Setup.st", str2 + ", repeat", new Throwable());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<ValueCallback<Integer>> f14467a;

        private a() {
            this.f14467a = new ArrayList<>();
        }

        public final void a(final int i) {
            d.b("Setup.st", new Runnable() { // from class: com.uc.webview.internal.setup.h.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i2 = i;
                    synchronized (aVar.f14467a) {
                        try {
                            if (!aVar.f14467a.isEmpty()) {
                                Integer valueOf = Integer.valueOf(i2);
                                Iterator<ValueCallback<Integer>> it = aVar.f14467a.iterator();
                                while (it.hasNext()) {
                                    it.next().onReceiveValue(valueOf);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private void a(int i, String str) {
        StringBuffer stringBuffer = this.d;
        stringBuffer.append(", " + str + ":" + this.c.a());
        com.uc.webview.base.b.a("ucbsInitStatus", this.d.toString());
        if (this.f14466a.get()) {
            b.f14470a.a(i);
        }
    }

    public final boolean a(int i) {
        return (i & this.b.get()) != 0;
    }
}
