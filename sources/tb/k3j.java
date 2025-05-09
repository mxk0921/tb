package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class k3j implements dvb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538083);
        t2o.a(444596610);
    }

    @Override // tb.dvb
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4c8ae5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.dvb
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0472965", new Object[]{this, context})).booleanValue();
        }
        return var.c(context);
    }

    @Override // tb.dvb
    public int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == 0) {
            return war.c(0, i2);
        }
        if (i != 1) {
            return war.c(3, i2);
        }
        return war.c(2, i2);
    }

    @Override // tb.dvb
    public void disableForceDark(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
        } else {
            war.a(view);
        }
    }
}
