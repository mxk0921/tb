package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ff2 extends BaseMnnRunUnit<df2, ef2> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_EXTRA_INFO = "extraInfo";
    public static final String KEY_RESULT_CODE = "result_code";
    public static final String TASK_NAME = "plt_query_quality_check";
    public static final String VALUE_NORMAL_RESULT = "A00099";
    public static volatile ff2 p = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wuc f19246a;

        public a(ff2 ff2Var, wuc wucVar) {
            this.f19246a = wucVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            } else if (mRTRuntimeException != null) {
                this.f19246a.onError(mRTRuntimeException);
            } else {
                Object obj = map.get("result_code");
                Object obj2 = map.get("extraInfo");
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    this.f19246a.onError(new RuntimeException(JSON.toJSONString(map)));
                } else {
                    this.f19246a.onResult(new ef2((String) obj, (String) obj2));
                }
            }
        }
    }

    static {
        t2o.a(481297039);
    }

    public ff2() {
        super(TASK_NAME);
    }

    public static ff2 L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ff2) ipChange.ipc$dispatch("a841c52e", new Object[0]);
        }
        if (p == null) {
            synchronized (ff2.class) {
                try {
                    if (p == null) {
                        p = new ff2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    public static /* synthetic */ Object ipc$super(ff2 ff2Var, String str, Object... objArr) {
        if (str.hashCode() == 9172574) {
            super.b(objArr[0], objArr[1], (wuc) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/blackframe/BlackFrameDetectUnit");
    }

    /* renamed from: M */
    public void b(df2 df2Var, Object obj, wuc<ef2> wucVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29166f6", new Object[]{this, df2Var, obj, wucVar});
            return;
        }
        super.b(df2Var, obj, wucVar);
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(df2Var.a());
        if (g == null) {
            wucVar.onError(new RuntimeException("params illegal"));
            return;
        }
        g.put("_check_type", Integer.valueOf(df2Var.b()));
        mzu.n("Page_PhotoSearchResult", "startQualityCheck", 19999, new String[0]);
        E(g, false, new a(this, wucVar));
    }
}
