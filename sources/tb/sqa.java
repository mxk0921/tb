package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sqa extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long HOMEPAGETOAST = 3106862338272018014L;
    public tqa b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(491782471);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public sqa build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sqa) ipChange.ipc$dispatch("8e272522", new Object[]{this, obj});
            }
            return new sqa();
        }
    }

    static {
        t2o.a(491782470);
    }

    public static /* synthetic */ Object ipc$super(sqa sqaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/impl/feedback/dxview/ability/HToastAbility");
    }

    public final tqa i(Context context, n8 n8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tqa) ipChange.ipc$dispatch("9419d690", new Object[]{this, context, n8Var});
        }
        if (this.b == null) {
            this.b = new tqa(context, n8Var);
        }
        return this.b;
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (TextUtils.isEmpty(n8Var.i("content"))) {
            fve.e("HomepageToastAbility", "tip is null");
            return new f8();
        }
        Context d = k8Var.d();
        if (d == null) {
            Toast.makeText(d, n8Var.i("content"), 1).show();
            return new f8();
        }
        i(d, n8Var).l();
        return new f8();
    }
}
