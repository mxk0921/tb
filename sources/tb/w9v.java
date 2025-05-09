package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class w9v extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ULTRONSEARCHTABCLICKV2 = "729864536986042405";
    public final gav b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final gav f30551a;

        static {
            t2o.a(614465657);
            t2o.a(336592930);
        }

        public a(gav gavVar) {
            this.f30551a = gavVar;
        }

        /* renamed from: a */
        public w9v build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (w9v) ipChange.ipc$dispatch("436c4e62", new Object[]{this, obj});
            }
            return new w9v(this.f30551a);
        }
    }

    static {
        t2o.a(614465656);
    }

    public w9v(gav gavVar) {
        this.b = gavVar;
    }

    public static /* synthetic */ Object ipc$super(w9v w9vVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/ability/UltronOrderRequestV2");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        JSONObject jSONObject;
        gav gavVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var == null) {
            jSONObject = null;
        } else {
            jSONObject = n8Var.h();
        }
        if (!(jSONObject == null || (gavVar = this.b) == null)) {
            gavVar.U(jSONObject);
        }
        return new f8();
    }
}
