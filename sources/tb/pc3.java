package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pc3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199394);
    }

    public static /* synthetic */ Object ipc$super(pc3 pc3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartPopExpandClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        gsb g = g();
        if (!(this.e == null || g == null)) {
            boolean b = eav.b(((u55) this.d).u());
            JSONObject fields = this.e.getFields();
            boolean booleanValue = fields.getBooleanValue("isExpanded");
            fields.put("isExpanded", (Object) Boolean.valueOf(true ^ booleanValue));
            String string = g.getFields().getString("calculatePopGroupName");
            for (DMComponent dMComponent : ((u55) this.j.b()).p().values()) {
                if (b) {
                    if (TextUtils.equals(dMComponent.getFields().getString("calculatePopGroupName"), string)) {
                        if (!booleanValue) {
                            cb4.c0(dMComponent);
                        } else {
                            cb4.K(dMComponent);
                        }
                    }
                } else if (TextUtils.equals(dMComponent.getFields().getString("calculatePopGroupName"), string)) {
                    cb4.L(dMComponent);
                }
            }
            this.j.e().G();
        }
    }
}
