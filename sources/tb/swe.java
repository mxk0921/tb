package tb;

import android.app.Application;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.utils.MegaTrace;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class swe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements ofc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.ofc
        public void init(Application application, HashMap<String, Object> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
                return;
            }
            yq.a();
            MegaTrace megaTrace = MegaTrace.INSTANCE;
            megaTrace.b("AKEngineWrapper#init");
            k4r.b();
            megaTrace.e();
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        if (application != null) {
            MegaUtils.E(application.getApplicationContext());
        }
        c2f.b(new a(), null, null);
        k4r.c();
    }
}
