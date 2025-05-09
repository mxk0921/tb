package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class prw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile prw f26267a = null;
    public orw config = new orw();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(989856337);
            t2o.a(989856388);
        }

        public b() {
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            if (i == 1002) {
                try {
                    double d = prw.getInstance().config.perfCheckSampleRate;
                    String str = prw.getInstance().config.perfCheckURL;
                    if (TextUtils.isEmpty("scriptUrl") || d <= Math.random()) {
                        return null;
                    }
                    iqwVar.f21515a.evaluateJavascript("(function(d){var s = d.createElement('script');s.src='" + str + "';d.head.appendChild(s);})(document)");
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
    }

    static {
        t2o.a(989856335);
    }

    public static prw getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (prw) ipChange.ipc$dispatch("42b52dea", new Object[0]);
        }
        if (f26267a == null) {
            synchronized (prw.class) {
                try {
                    if (f26267a == null) {
                        f26267a = new prw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f26267a;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            lqw.d().b(new b());
        }
    }
}
