package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nk7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIAGNOSE_CONFIG = "diagnose_config";

    static {
        t2o.a(615514157);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{DIAGNOSE_CONFIG}, new a(context));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24787a;

        public a(Context context) {
            this.f24787a = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0276  */
        @Override // tb.y8l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onConfigUpdate(java.lang.String r36) {
            /*
                Method dump skipped, instructions count: 782
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.nk7.a.onConfigUpdate(java.lang.String):void");
        }
    }
}
