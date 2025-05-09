package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ela extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(156237838);
    }

    public static /* synthetic */ Object ipc$super(ela elaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/GroupSelectSubscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        String str = (String) i(1);
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            if (this.e.getFields() == null || !this.e.getFields().containsKey("selectedId") || !str.equals(this.e.getFields().getString("selectedId"))) {
                hashMap.put("selectedId", str);
            } else {
                hashMap.put("selectedId", "-1");
            }
            u(this.e, hashMap);
            if (b8vVar.n() instanceof a) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(b8vVar.d());
                b8vVar.n().e(arrayList);
            }
        }
    }
}
