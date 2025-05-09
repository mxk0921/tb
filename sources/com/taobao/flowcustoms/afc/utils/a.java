package com.taobao.flowcustoms.afc.utils;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.ah0;
import tb.fpk;
import tb.n3v;
import tb.p3v;
import tb.pg0;
import tb.sg0;
import tb.t2o;
import tb.vp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b extends n3v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/utils/AfcIdUpdate$2");
        }

        @Override // tb.n3v
        public void sessionTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            } else if (AfcCustomSdk.h) {
                HashMap hashMap = new HashMap();
                hashMap.put("currentPackageName", "com.taobao.taobao");
                hashMap.put("generateType", "sessionTimeout");
                String r = AfcUtils.r(AfcUtils.FlowType.LAUNCH, "", hashMap);
                vp9.b("linkx", "AfcIdUpdate === registerSessionUpdate === session发生变化，更新后的afc_id：" + r);
            }
        }

        @Override // tb.n3v
        public String trackerListenerName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
            }
            return "AfcSessionUpdateListener";
        }
    }

    static {
        t2o.a(467664972);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d6c185", new Object[]{context});
            return;
        }
        pg0.i().e.onEvent(new C0559a());
        p3v.getInstance().registerListener(new b());
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.flowcustoms.afc.utils.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class C0559a implements fpk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fpk
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2247aab2", new Object[]{this});
            }
        }

        @Override // tb.fpk
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cbde6f6", new Object[]{this});
                return;
            }
            AfcCustomSdk.h = true;
            if (AfcCustomSdk.i.compareAndSet(false, true)) {
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                HashMap hashMap = new HashMap();
                hashMap.put("flowLeave", String.valueOf(System.currentTimeMillis()));
                String e = pg0.i().e();
                String g = pg0.i().g();
                if (!TextUtils.isEmpty(e)) {
                    if (!TextUtils.isEmpty(g)) {
                        e = e + "_" + g;
                    }
                    hashMap.put("pageName", e);
                }
                String f = pg0.i().f();
                if (!TextUtils.isEmpty(f)) {
                    hashMap.put("pageUrl", f);
                }
                ah0.c(1013, ah0.AFC_FLOW_LEAVE, globalProperty, "", hashMap);
                sg0.c(null);
            }
        }
    }
}
