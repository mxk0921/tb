package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jns extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_META = "meta";
    public static final String KEY_MODEL = "model";
    public final ze7 k;

    static {
        t2o.a(912261547);
    }

    public jns(JSONObject jSONObject, ze7 ze7Var) {
        super(jSONObject);
        u(jSONObject);
        this.k = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(jns jnsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/TTDetailDataModel");
    }

    public <L extends yns> L s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (L) ((yns) ipChange.ipc$dispatch("73ebfc16", new Object[]{this}));
        }
        d1i d1iVar = (d1i) this.k.e().e(hzh.PARSER_ID);
        if (d1iVar != null) {
            return (L) d1iVar.t();
        }
        return null;
    }

    public <M extends Merged> M t(Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Merged) ipChange.ipc$dispatch("35e27e68", new Object[]{this, cls}));
        }
        return (M) this.k.e().f(cls);
    }

    public final void u(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f242af", new Object[]{this, jSONObject});
        } else {
            DynamicMergeUtils.h(jSONObject);
        }
    }
}
