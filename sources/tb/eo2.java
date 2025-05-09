package tb;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class eo2 extends zmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138845);
    }

    public static /* synthetic */ Object ipc$super(eo2 eo2Var, String str, Object... objArr) {
        if (str.hashCode() == 1625382340) {
            eo2Var.j((TextView) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/ButtonRender");
    }

    @Override // tb.zmt, tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        Button button;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof Button) && (button = (Button) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                p(button, hashMap, cjdVar);
            }
        }
    }

    public void p(Button button, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a31704", new Object[]{this, button, hashMap, cjdVar});
        } else if (button != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(button);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        if (cdw.a(valueOf) == 10302) {
                            button.setClickable(Boolean.parseBoolean(value.toString()));
                        }
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                } else {
                    return;
                }
            }
            j(button, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(button);
            }
        }
    }
}
