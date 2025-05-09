package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uar implements nxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502267937);
        t2o.a(503316581);
    }

    @Override // tb.nxb
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8b94ae1", new Object[]{this, context})).booleanValue();
        }
        return war.b(context);
    }

    @Override // tb.nxb
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c673ea9f", new Object[]{this, context})).booleanValue();
        }
        return xar.a(context);
    }

    @Override // tb.nxb
    public boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2648f32", new Object[]{this, context})).booleanValue();
        }
        return true;
    }

    @Override // tb.nxb
    public void disableForceDark(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
        } else {
            war.a(view);
        }
    }

    @Override // tb.nxb
    public int transformColor(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9821d931", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return xar.c(i, i2);
    }
}
