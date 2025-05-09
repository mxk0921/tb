package tb;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class he1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20576a;
    public final jvc b;
    public final ddf c;
    public final Handler.Callback d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            cdf cdfVar = (cdf) message.obj;
            if (cdfVar.h == null) {
                if (he1.b(he1.this) != null && !TextUtils.isEmpty(cdfVar.g) && !TextUtils.isEmpty(cdfVar.b)) {
                    he1.b(he1.this).b(cdfVar.b, false, cdfVar.g, 0L, -1, "create failed", 0L);
                }
                cdfVar.f.a("create failed");
            } else {
                if (he1.b(he1.this) != null && !TextUtils.isEmpty(cdfVar.g) && !TextUtils.isEmpty(cdfVar.b)) {
                    he1.b(he1.this).b(cdfVar.b, true, cdfVar.g, 0L, 0, "", 0L);
                }
                cdfVar.e.a(cdfVar.h);
            }
            ddf.b().d(cdfVar);
            return true;
        }
    }

    static {
        t2o.a(676331607);
    }

    public he1() {
        this.f20576a = null;
        this.b = null;
        this.c = null;
        this.f20576a = new Handler(new a());
        this.c = ddf.b();
        this.b = (jvc) d62.b(jvc.class, new Object[0]);
    }

    public static /* synthetic */ jvc b(he1 he1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvc) ipChange.ipc$dispatch("fc08d658", new Object[]{he1Var});
        }
        return he1Var.b;
    }
}
