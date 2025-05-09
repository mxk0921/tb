package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.constants.ResultCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xao<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f31251a;
    public final ResultCode b;
    public final T c;

    static {
        t2o.a(396361770);
    }

    public xao(boolean z, ResultCode resultCode, T t) {
        this.f31251a = z;
        this.b = resultCode == null ? ResultCode.FAILURE_NULL_RESULT_CODE : resultCode;
        this.c = t;
    }

    public static <D> void a(ResultCode resultCode, rv2<D> rv2Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6138c094", new Object[]{resultCode, rv2Var});
            return;
        }
        if (resultCode != ResultCode.SUCCESS) {
            z = false;
        }
        b(z, resultCode, null, rv2Var);
    }

    public static <D> void b(boolean z, ResultCode resultCode, D d, rv2<D> rv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb3074e", new Object[]{new Boolean(z), resultCode, d, rv2Var});
        } else if (rv2Var != null) {
            try {
                rv2Var.callback(new xao<>(z, resultCode, d));
            } catch (Throwable th) {
                Log.e("Result", "failed to invoke the Callback..." + th);
            }
        }
    }

    public static <D> void c(boolean z, ResultCode resultCode, rv2<D> rv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7348772", new Object[]{new Boolean(z), resultCode, rv2Var});
        } else {
            b(z, resultCode, null, rv2Var);
        }
    }

    public static <D> void d(boolean z, rv2<D> rv2Var) {
        ResultCode resultCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca415749", new Object[]{new Boolean(z), rv2Var});
            return;
        }
        if (z) {
            resultCode = ResultCode.SUCCESS;
        } else {
            resultCode = null;
        }
        b(z, resultCode, null, rv2Var);
    }
}
