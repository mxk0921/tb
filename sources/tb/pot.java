package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pot implements dsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26217a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f26217a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f26217a) && !TextUtils.isEmpty(this.b)) {
                lq6.a().c(this.f26217a, this.b);
                vp9.a("linkx", "TfcStageDataImp === onDataHub === key:" + this.f26217a + " value:" + this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26218a;
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ qg0 c;

        public b(String str, HashMap hashMap, qg0 qg0Var) {
            this.f26218a = str;
            this.b = hashMap;
            this.c = qg0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap hashMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f26218a) && (hashMap = this.b) != null) {
                hashMap.put("afc_apm_time", SystemClock.uptimeMillis() + "");
                HashMap hashMap2 = this.b;
                hashMap2.put("afc_push_alive", ypg.e().e + "");
                HashMap hashMap3 = this.b;
                hashMap3.put("afc_launch_type", TbFcLinkInit.launchType + "");
                if (this.c != null) {
                    if (this.f26218a.equals(ah0.AFC_LINK_NAV_START)) {
                        this.b.put("autoLoginParam", this.c.B.getString("autoLoginParam"));
                        this.b.put("autoLoginExecuteStatus", this.c.B.getString("autoLoginExecuteStatus"));
                        this.b.put("startLoginStatus", this.c.B.getString("startLoginStatus"));
                        this.b.put("autoLoginAbBucketId", this.c.B.getString("autoLoginAbBucketId"));
                        this.b.put("beforeNavlLoginStatus", TFCCommonUtils.j());
                    }
                    int intValue = this.c.B.getIntValue("asyncReqBucketId");
                    if (intValue > 0) {
                        this.b.put("asyncReqBucketId", String.valueOf(intValue));
                    }
                    this.b.put("routerStrategy", this.c.B.getString("routerStrategy"));
                    if (this.c.B.containsKey("useLoginTokenOptimize")) {
                        this.b.put("useLoginTokenOptimize", this.c.B.getString("useLoginTokenOptimize"));
                    }
                    if (this.c.B.containsKey("loginTokenOptimizeBucketId")) {
                        this.b.put("loginTokenOptimizeBucketId", this.c.B.getString("loginTokenOptimizeBucketId"));
                    }
                }
                lq6.a().e(this.f26218a, this.b);
                vp9.a("linkx", "TfcStageDataImp === onStage === stage:" + this.f26218a + " params:" + this.b);
            }
        }
    }

    static {
        t2o.a(744488975);
        t2o.a(467664926);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a665c27", new Object[]{this, str, str2});
        } else {
            zsa.b.a(new a(str, str2));
        }
    }

    public void b(qg0 qg0Var, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e4463e", new Object[]{this, qg0Var, str, hashMap});
            return;
        }
        hashMap.put("afc_apm_time_new", String.valueOf(SystemClock.uptimeMillis()));
        zsa.b.a(new b(str, hashMap, qg0Var));
    }
}
