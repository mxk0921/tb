package com.taobao.android.cash.activity;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.weex.common.OnWXScrollListener;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile AtomicInteger f6516a = new AtomicInteger();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.cash.activity.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0342a implements OnWXScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f6517a = 0;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public final String e;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.cash.activity.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC0343a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f6518a;

            public RunnableC0343a(int i) {
                this.f6518a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int i = this.f6518a;
                if (i == 1) {
                    C0342a.this.c = i;
                }
                if (i == 0 && C0342a.this.c == 1) {
                    try {
                        if (a.a() != null) {
                            C0342a aVar = C0342a.this;
                            int i2 = aVar.d;
                            int i3 = aVar.f6517a;
                            int i4 = aVar.b + i2;
                            C0342a.a(aVar, a.a(), C0342a.this.e, i3, i4, 0, i2);
                            C0342a aVar2 = C0342a.this;
                            aVar2.d = i4;
                            aVar2.f6517a = 0;
                            aVar2.b = 0;
                            aVar2.c = this.f6518a;
                        }
                    } catch (Exception unused) {
                        WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]onScrollStateChanged error");
                    }
                }
                a.c().getAndDecrement();
            }
        }

        static {
            t2o.a(416284701);
            t2o.a(985661563);
        }

        public C0342a(String str, Context context) {
            this.e = str;
        }

        public static /* synthetic */ void a(C0342a aVar, Object obj, String str, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("124f0a06", new Object[]{aVar, obj, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else {
                aVar.b(obj, str, i, i2, i3, i4);
            }
        }

        public final void b(Object obj, String str, int i, int i2, int i3, int i4) {
            Class b = a.b();
            if (b != null) {
                try {
                    Class<?> cls = Integer.TYPE;
                    Method method = b.getMethod("addScrollEvent", String.class, cls, cls, cls, cls);
                    if (method != null) {
                        method.invoke(obj, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                    }
                } catch (Exception unused) {
                    WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]addScrollEventReflection error");
                }
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrollStateChanged(View view, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b177cda7", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3)});
            } else if (a.c().get() <= 200) {
                Coordinator.execute(new RunnableC0343a(i3));
                a.c().getAndIncrement();
            }
        }

        @Override // com.taobao.weex.common.OnWXScrollListener
        public void onScrolled(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f253d1c0", new Object[]{this, view, new Integer(i), new Integer(i2)});
                return;
            }
            this.f6517a += i;
            this.b += i2;
        }
    }

    static {
        t2o.a(416284699);
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d600c9b", new Object[0]);
        }
        return null;
    }

    public static /* synthetic */ Class b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("7d6365", new Object[0]);
        }
        return d();
    }

    public static /* synthetic */ AtomicInteger c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("647af9a3", new Object[0]);
        }
        return f6516a;
    }

    public static Class d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("b5a94e06", new Object[0]);
        }
        try {
            return Class.forName("com.alibaba.wireless.security.open.securitybodysdk.ISecurityBodyPageTrack");
        } catch (Exception unused) {
            WXLogUtils.e("WXSecurityGuardPageTrack", "[PageTrackLog]getPageTrackClass error");
            return null;
        }
    }
}
