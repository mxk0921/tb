package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class yji extends m8<k8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final hdb b;
    public final String c;
    public final String d;
    public final t3i e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u8 b;

        public a(u8 u8Var) {
            this.b = u8Var;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            c8 c8Var;
            ExecuteResult a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            t3i i = yji.i(yji.this);
            if (!(i == null || (a2 = i.a(executeResult)) == null)) {
                executeResult = a2;
            }
            JSONObject jSONObject = null;
            if (executeResult instanceof FinishResult) {
                Map<String, Object> data = executeResult.getData();
                if (data != null) {
                    jSONObject = new JSONObject(data);
                }
                c8Var = new f8(jSONObject);
            } else if (executeResult instanceof ErrorResult) {
                ErrorResult errorResult = (ErrorResult) executeResult;
                String code = errorResult.getCode();
                String msg = errorResult.getMsg();
                JSONObject jSONObject2 = new JSONObject(2);
                jSONObject2.put("code", (Object) code);
                jSONObject2.put("msg", (Object) msg);
                c8Var = new e8(jSONObject2);
            } else {
                Map<String, Object> data2 = executeResult.getData();
                if (data2 != null) {
                    jSONObject = new JSONObject(data2);
                }
                c8Var = new d8(jSONObject);
            }
            this.b.callback(executeResult.getType(), c8Var);
        }
    }

    static {
        t2o.a(336593072);
    }

    public /* synthetic */ yji(hdb hdbVar, String str, String str2, t3i t3iVar, int i, a07 a07Var) {
        this(hdbVar, str, str2, (i & 8) != 0 ? null : t3iVar);
    }

    public static final /* synthetic */ t3i i(yji yjiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t3i) ipChange.ipc$dispatch("99fcae48", new Object[]{yjiVar});
        }
        return yjiVar.e;
    }

    public static /* synthetic */ Object ipc$super(yji yjiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/mega/MegaWrapper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r12 != null) goto L_0x00f5;
     */
    @Override // tb.m8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.c8<?> f(tb.n8 r12, tb.k8 r13, tb.u8 r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yji.f(tb.n8, tb.k8, tb.u8):tb.c8");
    }

    public yji(hdb hdbVar, String str, String str2, t3i t3iVar) {
        ckf.g(str2, "megaApi");
        this.b = hdbVar;
        this.c = str;
        this.d = str2;
        this.e = t3iVar;
    }
}
