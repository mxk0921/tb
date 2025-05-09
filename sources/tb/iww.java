package tb;

import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.IJsApiSucceedCallBack;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class iww implements IJsApiSucceedCallBack, IJsApiFailedCallBack, r4c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f4x f21623a;
    public final boolean b;
    public final f4x c;

    static {
        t2o.a(980418685);
        t2o.a(989856203);
        t2o.a(989856202);
        t2o.a(989856201);
    }

    public iww(f4x f4xVar, boolean z, f4x f4xVar2) {
        this.c = f4xVar;
        this.b = z;
        this.f21623a = f4xVar2;
    }

    @Override // tb.r4c
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSON.parse(str);
                f4x f4xVar = this.c;
                if (f4xVar != null) {
                    f4xVar.a(parse);
                }
            } catch (Exception unused) {
            }
        } else {
            f4x f4xVar2 = this.c;
            if (f4xVar2 != null) {
                f4xVar2.a(str);
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
    public void fail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSON.parse(str);
                f4x f4xVar = this.c;
                if (f4xVar != null) {
                    f4xVar.b(parse);
                }
                f4x f4xVar2 = this.f21623a;
                if (f4xVar2 != null) {
                    f4xVar2.release();
                }
            } catch (Exception unused) {
            }
        } else {
            f4x f4xVar3 = this.c;
            if (f4xVar3 != null) {
                f4xVar3.b(str);
            }
            f4x f4xVar4 = this.f21623a;
            if (f4xVar4 != null) {
                f4xVar4.release();
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
    public void succeed(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
        } else if (this.b) {
            try {
                Object parse = JSON.parse(str);
                f4x f4xVar = this.c;
                if (f4xVar != null) {
                    f4xVar.b(parse);
                }
                f4x f4xVar2 = this.f21623a;
                if (f4xVar2 != null) {
                    f4xVar2.release();
                }
            } catch (Exception unused) {
            }
        } else {
            f4x f4xVar3 = this.c;
            if (f4xVar3 != null) {
                f4xVar3.b(str);
            }
            f4x f4xVar4 = this.f21623a;
            if (f4xVar4 != null) {
                f4xVar4.release();
            }
        }
    }
}
