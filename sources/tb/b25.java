package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b25 extends wy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String k;
    public final Boolean l;
    public final Integer m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16134a = "";
        public float b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Boolean g;
        public String h;

        static {
            t2o.a(79691886);
        }

        public b25 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b25) ipChange.ipc$dispatch("23620499", new Object[]{this});
            }
            return new b25(this.f16134a, null, null, null, null, this.b, this.c, this.f, this.d, this.g, null, null, 0L, null, null, this.h, null, null, null, null, this.e, null);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("16f727a", new Object[]{this, str});
            }
            this.f16134a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aab59814", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("65b86253", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("14a5a007", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dfe7791d", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("accb0ca1", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b h(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dac570d7", new Object[]{this, new Float(f)});
            }
            this.b = f;
            return this;
        }

        public b i(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3fe16ed8", new Object[]{this, bool});
            }
            this.g = bool;
            return this;
        }
    }

    static {
        t2o.a(79691884);
    }

    public static /* synthetic */ Object ipc$super(b25 b25Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/jsTracker/CustomTrackerModel");
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f31006a) || TextUtils.isEmpty(this.f) || TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.g) || TextUtils.isEmpty(this.i)) {
            return false;
        }
        return true;
    }

    public b25(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, Boolean bool, Integer num, String str9, long j, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        super(str, str2, str3, str4, str5, BizTaskData.MANUAL_TIME, f, str6, str8, j, str17, str18);
        this.k = str7;
        this.l = bool;
        this.m = num;
        this.n = str9;
        this.o = str10;
        this.p = str11;
        this.q = str12;
        this.r = str13;
        this.s = str14;
        this.t = str15;
        this.u = str16;
    }
}
