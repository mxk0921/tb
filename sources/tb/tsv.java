package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tsv extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "userTapRecorder";
    public final vsv j;

    static {
        t2o.a(745538136);
    }

    public tsv(vsv vsvVar) {
        this.j = vsvVar;
    }

    public static /* synthetic */ Object ipc$super(tsv tsvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/UserTapRecorderSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject f = f();
        if (f == null) {
            tj8.a(tsv.class.getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "error: eventFields is null");
            return;
        }
        String string = f.getString("identifier");
        if (!TextUtils.isEmpty(string)) {
            this.j.c(string);
        }
    }
}
