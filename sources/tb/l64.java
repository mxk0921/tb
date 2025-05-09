package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l64 extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IS_CHECKED = "isChecked";
    public static final String TAG = "CommonPopSelectSubscriber";

    static {
        t2o.a(157286514);
    }

    public static /* synthetic */ Object ipc$super(l64 l64Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/CommonPopSelectSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        IDMComponent d = b8vVar.d();
        if (d != null && (fields = d.getFields()) != null) {
            String string = fields.getString("isChecked");
            Boolean bool = Boolean.TRUE;
            if (!bool.toString().equals(string)) {
                fields.put("isChecked", (Object) bool.toString());
                d.writeBackFields(fields, true);
            }
            b8vVar.n().f();
        }
    }
}
