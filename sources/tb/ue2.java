package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.b;
import java.util.ArrayList;
import tb.xe2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ue2 implements xe2.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.xe2.b
    public String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1f37d7", new Object[]{this, new Integer(i)});
        }
        b q = a.q(i);
        if (q != null) {
            return q.e();
        }
        return null;
    }

    @Override // tb.xe2.b
    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1eb64d7", new Object[]{this, str})).intValue();
        }
        ArrayList<b> t = a.t();
        for (int i = 0; i < t.size(); i++) {
            b bVar = t.get(i);
            if (bVar != null && TextUtils.equals(bVar.e(), str)) {
                return i;
            }
        }
        return -1;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            xe2.c(this);
        }
    }
}
