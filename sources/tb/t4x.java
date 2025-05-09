package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.xob;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltb/t4x;", "Ltb/xob;", "Lcom/alibaba/fastjson/JSONObject;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "tbi_uniContainer_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class t4x implements xob<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28493a;

    static {
        t2o.a(804257838);
        t2o.a(803209232);
    }

    public t4x(Context context) {
        ckf.g(context, "context");
        this.f28493a = context;
    }

    /* renamed from: b */
    public s4x a(cc4 cc4Var, mb4<JSONObject> mb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s4x) ipChange.ipc$dispatch("e367f3be", new Object[]{this, cc4Var, mb4Var});
        }
        ckf.g(cc4Var, "info");
        ckf.g(mb4Var, "data");
        s4x s4xVar = new s4x(this.f28493a);
        s4xVar.e(mb4Var);
        s4xVar.f(cc4Var);
        return s4xVar;
    }

    @Override // tb.xob
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            xob.a.a(this);
        }
    }
}
