package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final v9 f29863a = new v9();

        static {
            t2o.a(665845838);
        }

        public static /* synthetic */ v9 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (v9) ipChange.ipc$dispatch("87406fbb", new Object[0]);
            }
            return f29863a;
        }
    }

    static {
        t2o.a(665845836);
    }

    public static v9 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v9) ipChange.ipc$dispatch("dae37b95", new Object[0]);
        }
        return b.a();
    }

    public void a(Context context, ALCreatePassWordModel aLCreatePassWordModel, s9 s9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b0c5db5", new Object[]{this, context, aLCreatePassWordModel, s9Var});
            return;
        }
        try {
            btl.d().c(context, aLCreatePassWordModel, s9Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void c(Context context, y9 y9Var, x9 x9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16e6cde7", new Object[]{this, context, y9Var, x9Var});
        } else {
            gtl.f().d(context, y9Var, x9Var);
        }
    }

    public v9() {
    }
}
