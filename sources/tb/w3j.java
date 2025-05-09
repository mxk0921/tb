package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class w3j extends o5l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String k = "MtbOpenUrlSsb";

    static {
        t2o.a(745538129);
    }

    public static /* synthetic */ Object ipc$super(w3j w3jVar, String str, Object... objArr) {
        if (str.hashCode() == -2105903856) {
            super.t((b8v) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/event/MtbOpenUrlSubscriber");
    }

    @Override // tb.o5l, tb.l6v
    public void t(b8v b8vVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        super.t(b8vVar);
        gsb j = j();
        String string = (j == null || (fields = j.getFields()) == null) ? null : fields.getString("url");
        MtbGlobalEnv.i = string;
        String str = this.k;
        TLog.loge(str, "我淘点击，url=" + string);
    }
}
