package com.loc;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5559a = x.c("SU2hhcmVkUHJlZmVyZW5jZUFkaXU");
    private static ai f;
    private List<String> b;
    private String c;
    private final Context d;
    private final Handler e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<ai> f5561a;

        public a(Looper looper, ai aiVar) {
            super(looper);
            this.f5561a = new WeakReference<>(aiVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj;
            ai aiVar = this.f5561a.get();
            if (aiVar != null && message != null && (obj = message.obj) != null) {
                aiVar.a((String) obj, message.what);
            }
        }

        public a(ai aiVar) {
            this.f5561a = new WeakReference<>(aiVar);
        }
    }

    private ai(Context context) {
        a aVar;
        this.d = context.getApplicationContext();
        if (Looper.myLooper() == null) {
            aVar = new a(Looper.getMainLooper(), this);
        } else {
            aVar = new a(this);
        }
        this.e = aVar;
    }

    public static ai a(Context context) {
        if (f == null) {
            synchronized (ai.class) {
                try {
                    if (f == null) {
                        f = new ai(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void b(String str) {
        List<String> list = this.b;
        if (list != null) {
            list.clear();
            this.b.add(str);
        }
        a(str, Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
    }

    public final void a(String str) {
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(final String str, final int i) {
        ContentResolver contentResolver;
        String str2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Thread() { // from class: com.loc.ai.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    ContentResolver contentResolver2;
                    String str3;
                    boolean canWrite;
                    String b = ao.b(str);
                    if (!TextUtils.isEmpty(b)) {
                        if ((i & 1) > 0) {
                            try {
                                if (Build.VERSION.SDK_INT >= 23) {
                                    canWrite = Settings.System.canWrite(ai.this.d);
                                    if (canWrite) {
                                        contentResolver2 = ai.this.d.getContentResolver();
                                        str3 = ai.this.c;
                                    }
                                } else {
                                    contentResolver2 = ai.this.d.getContentResolver();
                                    str3 = ai.this.c;
                                }
                                Settings.System.putString(contentResolver2, str3, b);
                            } catch (Exception unused) {
                            }
                        }
                        if ((i & 16) > 0) {
                            ak.a(ai.this.d, ai.this.c, b);
                        }
                        if ((i & 256) > 0) {
                            SharedPreferences.Editor edit = ai.this.d.getSharedPreferences(ai.f5559a, 0).edit();
                            edit.putString(ai.this.c, b);
                            edit.apply();
                        }
                    }
                }
            }.start();
            return;
        }
        String b = ao.b(str);
        if (!TextUtils.isEmpty(b)) {
            if ((i & 1) > 0) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        contentResolver = this.d.getContentResolver();
                        str2 = this.c;
                    } else {
                        contentResolver = this.d.getContentResolver();
                        str2 = this.c;
                    }
                    Settings.System.putString(contentResolver, str2, b);
                } catch (Exception unused) {
                }
            }
            if ((i & 16) > 0) {
                ak.a(this.d, this.c, b);
            }
            if ((i & 256) > 0) {
                SharedPreferences.Editor edit = this.d.getSharedPreferences(f5559a, 0).edit();
                edit.putString(this.c, b);
                edit.apply();
            }
        }
    }
}
