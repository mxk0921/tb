package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qe2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DENY_SERVICE = 107;
    public static final int NGX_ADASH_DENY_SERVICE = 116;
    public static final int NGX_ADASH_DISABLE_RTLOG = 115;
    public static final int NGX_ADASH_DOWNGRADE_V1 = 109;
    public static final int NGX_ADASH_UNKNOWN_COMPRESS_TYPE = 105;
    public static final int NGX_ZSTD_DOWNGRADE_V1 = 120;
    public static final int NO_ERROR = 0;
    public static final int UNKNOWN_ERROR = -1;
    public String e;

    /* renamed from: a  reason: collision with root package name */
    public int f26695a = -1;
    public long b = 0;
    public long c = 0;
    public long d = 0;
    public boolean f = false;

    static {
        t2o.a(962592939);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        if (this.f26695a == 0) {
            return true;
        }
        return false;
    }
}
