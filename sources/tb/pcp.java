package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.fallback.ErrorType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pcp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ErrorType f26015a;
    public final String b;
    public final String c;

    static {
        t2o.a(850395140);
    }

    public pcp(ErrorType errorType, String str, String str2) {
        ckf.g(errorType, "errorType");
        this.f26015a = errorType;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.b;
    }

    public final ErrorType b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorType) ipChange.ipc$dispatch("772dae27", new Object[]{this});
        }
        return this.f26015a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21db4132", new Object[]{this});
        }
        return this.c;
    }
}
