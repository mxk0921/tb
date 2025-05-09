package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cyl extends wy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17438a = "";
        public String b;
        public String c;

        static {
            t2o.a(79691895);
        }

        public cyl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cyl) ipChange.ipc$dispatch("40ee543a", new Object[]{this});
            }
            return new cyl(this.f17438a, null, null, null, null, this.b, this.c);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("adb4686b", new Object[]{this, str});
            }
            this.f17438a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e6edaafe", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6d760fa8", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(79691893);
    }

    public static /* synthetic */ Object ipc$super(cyl cylVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/jsTracker/PerformanceTrackerModel");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f31006a) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.i)) {
            return false;
        }
        return true;
    }

    public cyl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str, str2, str3, str4, str5, "api_perf", 1.0f, null, str6, 0L, str7, null);
    }
}
