package com.uc.webview.internal;

import android.view.MotionEvent;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.Log;
import com.uc.webview.base.h;
import com.uc.webview.base.task.d;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.interfaces.ICore2Sdk;
import com.uc.webview.internal.setup.o;
import com.uc.webview.internal.stats.i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a implements ICore2Sdk {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f14339a = true;
    private static String b = "a";
    private final AtomicInteger c = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0838a {

        /* renamed from: a  reason: collision with root package name */
        static final a f14340a = new a();
    }

    public static a a() {
        return C0838a.f14340a;
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onActivityStatus(int i) {
        Log.i(b, "onActivityStatus: ".concat(String.valueOf(i)));
        int andSet = this.c.getAndSet(i);
        boolean z = (andSet == i || andSet == 0) ? false : true;
        if (i != 1) {
            if (i == 2) {
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    return;
                }
                if (i != 5) {
                    Log.w(b, "onActivityStatus invliad: ".concat(String.valueOf(i)));
                } else if (z) {
                    i.a().a(false);
                }
            } else if (z) {
                i.a().a(true);
            }
        } else if (z) {
            i.a().a(false);
        }
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onInitStatus(int i, boolean z) {
        o.b().a(i, z);
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void onPageView(int i, String str) {
        i.a().a(i, str, false);
    }

    @Override // com.uc.webview.internal.interfaces.ICore2Sdk
    public void postTask(String str, Runnable runnable) {
        if (str == null) {
            str = runnable.toString();
        }
        d.a(str, runnable);
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        try {
            if (i != 1) {
                int i2 = 3;
                if (i == 2) {
                    boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                    if (!booleanValue) {
                        i2 = 2;
                    }
                    if (e.a() != i2) {
                        e.a(i2, booleanValue ? 7 : 8);
                    }
                    return null;
                } else if (i == 3) {
                    String str = (String) objArr[0];
                    Runnable runnable = (Runnable) objArr[1];
                    long longValue = ((Long) objArr[2]).longValue();
                    if (str == null) {
                        str = runnable.toString();
                    }
                    d.a(str, runnable, longValue);
                    return null;
                } else if (i == 4) {
                    return h.c((String) objArr[0]);
                } else {
                    if (i != 5) {
                        switch (i) {
                            case ICore2Sdk.ExtenderID.WEBVIEW_CORE_ON_INTERCEPT_TOUCH_EVENT /* -206059113 */:
                                if (objArr != null && objArr.length >= 2) {
                                    return Boolean.valueOf(((WebView) objArr[0]).coreOnInterceptTouchEvent((MotionEvent) objArr[1]));
                                }
                                break;
                            case ICore2Sdk.ExtenderID.GET_UUID /* 6051140 */:
                                return EnvInfo.m();
                            case ICore2Sdk.ExtenderID.GET_UTDID /* 51208322 */:
                                return EnvInfo.n();
                            case ICore2Sdk.ExtenderID.WEBVIEW_CORE_ON_OVER_SCROLLED /* 645920145 */:
                                if (objArr != null && objArr.length >= 5) {
                                    ((WebView) objArr[0]).coreOnOverScrolled(((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), ((Boolean) objArr[4]).booleanValue());
                                    return Boolean.TRUE;
                                }
                                break;
                            case ICore2Sdk.ExtenderID.WEBVIEW_CORE_ON_TOUCH_EVENT /* 1066264116 */:
                                if (objArr != null && objArr.length >= 2) {
                                    return Boolean.valueOf(((WebView) objArr[0]).coreOnTouchEvent((MotionEvent) objArr[1]));
                                }
                                break;
                        }
                        String str2 = b;
                        Log.d(str2, "unsupport id: " + i + ", params: " + Arrays.toString(objArr));
                        return null;
                    }
                    String[] strArr = (String[]) objArr[0];
                    Object[] objArr2 = (Object[]) objArr[1];
                    if (!f14339a && (strArr == null || objArr2 == null || strArr.length != objArr2.length)) {
                        throw new AssertionError();
                    }
                    h.a a2 = h.a();
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        String str3 = strArr[i3];
                        Object obj = objArr2[i3];
                        if (obj instanceof Boolean) {
                            a2.a(str3, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Long) {
                            a2.a(str3, ((Long) obj).longValue());
                        } else if (obj instanceof String) {
                            a2.a(str3, (String) obj);
                        } else {
                            a2.a(str3, obj.toString());
                        }
                    }
                    a2.a();
                    return null;
                }
            } else {
                o.d().a((String) objArr[0]);
                return null;
            }
        } catch (Throwable th) {
            Log.e(b, "invoke failed", th);
            return null;
        }
    }
}
