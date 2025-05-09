package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.vrp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class loa extends vrp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WVCallBackContext c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f23467a;

        public a(Object obj) {
            this.f23467a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                loa.c(loa.this).success(JSON.toJSONString(this.f23467a));
            }
        }
    }

    static {
        t2o.a(468714325);
    }

    public loa(WVCallBackContext wVCallBackContext) {
        this.c = wVCallBackContext;
    }

    public static /* synthetic */ WVCallBackContext c(loa loaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("a4e8f3ca", new Object[]{loaVar});
        }
        return loaVar.c;
    }

    public static /* synthetic */ Object ipc$super(loa loaVar, String str, Object... objArr) {
        if (str.hashCode() == 965972421) {
            return new Boolean(super.b((lr9) objArr[0], objArr[1]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/deprecated/message/callback/H5Callback");
    }

    @Override // tb.vrp.a
    public boolean b(lr9 lr9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
        }
        boolean b = super.b(lr9Var, obj);
        if (b && this.c != null) {
            if (obj == null) {
                ir9.b("H5Callback", "result 不能为null");
                obj = new HashMap();
            }
            az9.p(new a(obj), "H5Callback");
        }
        return b;
    }
}
