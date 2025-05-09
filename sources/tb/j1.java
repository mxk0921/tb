package tb;

import android.content.Context;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j1 extends g1<l1, k1> {
    public j1(Context context, rtn rtnVar, String str, String str2) {
        super(new k1(context, str, str2), rtnVar);
    }

    public List<l1> k(int i) {
        return ((k1) this.f19670a).o(i, 0, "urgency DESC");
    }
}
