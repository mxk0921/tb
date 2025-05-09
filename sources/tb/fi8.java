package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fi8 extends wy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public float b;

        /* renamed from: a  reason: collision with root package name */
        public String f19309a = "";
        public String c = "";
        public String d = "";

        static {
            t2o.a(79691889);
        }

        public fi8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fi8) ipChange.ipc$dispatch("44ce9162", new Object[]{this});
            }
            return new fi8(this.f19309a, null, null, null, null, this.b, this.c, this.d, null, null, null, null, null, null);
        }

        public b b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fb17b93", new Object[]{this, str});
            }
            this.f19309a = str;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e9c9490", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cf6808c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b e(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d4a3bd96", new Object[]{this, new Float(f)});
            }
            this.b = f;
            return this;
        }
    }

    static {
        t2o.a(79691887);
    }

    public static /* synthetic */ Object ipc$super(fi8 fi8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/jsTracker/ErrorTrackerModel");
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

    public fi8(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(str, str2, str3, str4, str5, "error", f, str6, str7, 0L, str12, str13);
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
    }
}
