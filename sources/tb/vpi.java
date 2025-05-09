package tb;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class vpi implements csl {
    static {
        t2o.a(612368414);
        t2o.a(612368415);
    }

    public static List<BaseMode> b(Context context, Intent intent) {
        int i;
        BaseMode a2;
        if (intent == null) {
            return null;
        }
        try {
            i = Integer.parseInt(ty4.e(intent.getStringExtra("type")));
        } catch (Exception e) {
            dgh.b("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
            i = 4096;
        }
        dgh.a("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b6n.s().x()).iterator();
        while (it.hasNext()) {
            csl cslVar = (csl) it.next();
            if (!(cslVar == null || (a2 = cslVar.a(context, i, intent)) == null)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
