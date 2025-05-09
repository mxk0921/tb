package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zaf extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189312);
    }

    public static /* synthetic */ Object ipc$super(zaf zafVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/InputSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        CharSequence charSequence = (CharSequence) h(0);
        CharSequence charSequence2 = (CharSequence) h(1);
        if (!TextUtils.isEmpty(charSequence) && charSequence2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("value", charSequence2.toString());
            lcuVar.p(new c57(this.e, this.c));
            l(hashMap);
            m(hashMap);
            if ("dialog".equalsIgnoreCase(charSequence.toString()) && i()) {
                this.c.d().h(this.e, lcuVar);
            }
        }
    }
}
