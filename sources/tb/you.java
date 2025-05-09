package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class you implements dbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(654311469);
        t2o.a(654311468);
    }

    @Override // tb.dbh
    public String a(String str, bsa bsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f15b0f", new Object[]{this, str, bsaVar});
        }
        if (str.indexOf("$TTID") > -1) {
            str = str.replace("$TTID", b(d.d));
        }
        return bsaVar.a(str);
    }

    public final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90a487d0", new Object[]{this, context});
        }
        int identifier = context.getResources().getIdentifier("ttid", "string", context.getPackageName());
        if (identifier <= 0) {
            return "";
        }
        return context.getString(identifier);
    }
}
