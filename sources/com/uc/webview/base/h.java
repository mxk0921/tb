package com.uc.webview.base;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14267a = "h";
    private static volatile SharedPreferences b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        a a(String str, int i);

        a a(String str, long j);

        a a(String str, String str2);

        a a(String str, boolean z);

        void a();
    }

    public static a a() {
        if (d() == null) {
            return null;
        }
        return new a() { // from class: com.uc.webview.base.h.1

            /* renamed from: a  reason: collision with root package name */
            private final Map<String, Object> f14268a = new HashMap();

            @Override // com.uc.webview.base.h.a
            public final a a(String str, boolean z) {
                if (!TextUtils.isEmpty(str)) {
                    this.f14268a.put(str, Boolean.valueOf(z));
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final a a(String str, int i) {
                if (!TextUtils.isEmpty(str)) {
                    this.f14268a.put(str, Integer.valueOf(i));
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final a a(String str, long j) {
                if (!TextUtils.isEmpty(str)) {
                    this.f14268a.put(str, Long.valueOf(j));
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final a a(String str, String str2) {
                if (!TextUtils.isEmpty(str) && str2 != null) {
                    this.f14268a.put(str, str2);
                }
                return this;
            }

            @Override // com.uc.webview.base.h.a
            public final void a() {
                try {
                    SharedPreferences.Editor edit = h.d().edit();
                    for (Map.Entry<String, Object> entry : this.f14268a.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof Boolean) {
                            edit.putBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            edit.putInt(key, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            edit.putLong(key, ((Long) value).longValue());
                        } else {
                            edit.putString(key, (String) value);
                        }
                    }
                    edit.commit();
                    this.f14268a.clear();
                } catch (Throwable th) {
                    Log.w(h.f14267a, "commitSp failed", th);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SharedPreferences d() {
        Context context;
        if (b == null) {
            synchronized (h.class) {
                try {
                    if (b == null && (context = EnvInfo.getContext()) != null) {
                        b = context.getSharedPreferences("u4sdk_sp", 4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static long e(String str) {
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.getLong(str, -1L);
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static boolean f(String str) {
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.getBoolean(str, false);
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static long b(String str) {
        return e(str);
    }

    public static String c(String str) {
        return a(str, "");
    }

    public static boolean a(String str) {
        return f(str);
    }

    public static String b(String str, String str2) {
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.getString(str, str2);
            }
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static void c(String str, String str2) {
        a a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, str2).a();
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(String str, String str2) {
        SharedPreferences d = d();
        return d != null ? d.getString(str, str2) : str2;
    }

    public static void a(String str, int i) {
        a a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, i).a();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, long j) {
        a a2 = a();
        if (a2 != null) {
            try {
                a2.a(str, j).a();
            } catch (Throwable unused) {
            }
        }
    }

    public static int d(String str) {
        try {
            SharedPreferences d = d();
            if (d != null) {
                return d.getInt(str, 0);
            }
        } catch (Throwable unused) {
        }
        return 0;
    }
}
