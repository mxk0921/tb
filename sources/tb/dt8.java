package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class dt8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements dvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.dvb
        public /* synthetic */ boolean a() {
            return false;
        }

        @Override // tb.dvb
        public boolean b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0472965", new Object[]{this, context})).booleanValue();
            }
            return oza.a(context);
        }

        @Override // tb.dvb
        public int c(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b7653c70", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            return i2;
        }

        @Override // tb.dvb
        public void disableForceDark(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecef35d2", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(729809612);
    }

    public static void a(DinamicXEngine dinamicXEngine, cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9675c505", new Object[]{dinamicXEngine, cfcVar});
            return;
        }
        iht.b(dinamicXEngine, cfcVar);
        dinamicXEngine.W0(h06.DX_EVENT_HWEBVIEWPREREQUEST, new h06());
        dinamicXEngine.O0(new a());
    }
}
