package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.linkmanager.launcher.TbFcLinkInit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rnx implements x0e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.linkmanager.afc.xbs.a f27490a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg0 f27491a;
        public final /* synthetic */ AfcXbsData b;

        public a(qg0 qg0Var, AfcXbsData afcXbsData) {
            this.f27491a = qg0Var;
            this.b = afcXbsData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                rnx.a(rnx.this).e(this.f27491a, this.b);
            }
        }
    }

    static {
        t2o.a(744488978);
        t2o.a(467664928);
    }

    public static /* synthetic */ com.taobao.linkmanager.afc.xbs.a a(rnx rnxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.linkmanager.afc.xbs.a) ipChange.ipc$dispatch("b91ae7b1", new Object[]{rnxVar});
        }
        return rnxVar.f27490a;
    }

    public static Intent b(qg0 qg0Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("793e9057", new Object[]{qg0Var});
        }
        String str2 = "";
        if (qg0Var == null) {
            str = str2;
        } else {
            str = qg0Var.g;
        }
        if (qg0Var != null) {
            str2 = qg0.D;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(TFCCommonUtils.d(str, hq9.FL_OUT_ID, hq9.XBS_VISA));
        Intent intent = new Intent();
        intent.setData(parse);
        intent.setFlags(268435456);
        intent.setFlags(131072);
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        return intent;
    }

    public void d(Context context, qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66bf3e5", new Object[]{this, context, qg0Var});
        } else if (c(qg0Var)) {
            vr0.c(context, qg0Var);
        } else {
            Intent b = b(qg0Var);
            if (b != null) {
                try {
                    b.putExtra(hq9.VISA, hq9.XBS_VISA);
                    jq9.q(context, b);
                } catch (Throwable th) {
                    vp9.b("linkx", "AlibcPluginUtils === jumpBack  异常：" + th.toString());
                }
            }
        }
    }

    public void e(qg0 qg0Var, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a5de69", new Object[]{this, qg0Var, afcXbsData});
            return;
        }
        if (this.f27490a == null) {
            this.f27490a = new com.taobao.linkmanager.afc.xbs.a();
        }
        if (TbFcLinkInit.instance().linkAhead) {
            new Handler(Looper.getMainLooper()).post(new a(qg0Var, afcXbsData));
        } else {
            this.f27490a.e(qg0Var, afcXbsData);
        }
    }

    public static boolean c(qg0 qg0Var) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe6785", new Object[]{qg0Var})).booleanValue();
        }
        return (qg0Var == null || qg0.D == null || (str = qg0Var.k) == null || !str.equals("linkPartner")) ? false : true;
    }
}
