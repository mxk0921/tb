package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class dwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FOREGROUND_KEY = "isTbForeground";

    /* renamed from: a  reason: collision with root package name */
    public static Intent f18114a;
    public static final a Instance = new a(null);
    public static int b = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297374);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a965304e", new Object[]{this})).intValue();
            }
            return dwo.a();
        }

        public final Intent b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("270ace09", new Object[]{this});
            }
            return dwo.b();
        }

        public final void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba17e77c", new Object[]{this, new Integer(i)});
            } else {
                dwo.c(i);
            }
        }

        public final void d(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9800c693", new Object[]{this, intent});
            } else {
                dwo.d(intent);
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(481297373);
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe79277", new Object[0])).intValue();
        }
        return b;
    }

    public static final /* synthetic */ Intent b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("240f04be", new Object[0]);
        }
        return f18114a;
    }

    public static final /* synthetic */ void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436b30b", new Object[]{new Integer(i)});
        } else {
            b = i;
        }
    }

    public static final /* synthetic */ void d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0cd8e6", new Object[]{intent});
        } else {
            f18114a = intent;
        }
    }
}
