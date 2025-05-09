package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.common.O2OClickSendRequest;
import com.o2o.ad.click.common.O2OClickSendResponse;
import com.o2o.ad.click.common.O2OClickSendResponseData;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29284a;
    public String b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f29285a;
        public final String b;

        static {
            t2o.a(1019215881);
            t2o.a(1018167315);
        }

        public a(uc0 uc0Var, String str, String str2) {
            this.f29285a = str;
            this.b = str2;
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
            }
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            ztv.b("o2o_click_commit_fail", "error_code=" + str, "error_msg=" + str2);
            j4g.a("o2o_click_commit_fail", "error_code=" + str, "error_msg=" + str2);
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            O2OClickSendResponseData data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            if (!TextUtils.isEmpty(((O2OClickSendResponse) obj).getData().o2otrackid)) {
                String[] strArr = {"o2otrackid=" + data.o2otrackid, "o2oclickid=" + this.f29285a, "epid=" + this.b};
                ztv.b("o2o_click_commit_success", strArr);
                j4g.a("o2o_click_after", strArr);
            }
        }
    }

    static {
        t2o.a(1019215880);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c302f1d3", new Object[]{str});
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public String a(String str, String str2) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5c61a2", new Object[]{this, str, str2});
        }
        try {
            this.c = URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.b) && (parse = Uri.parse(str)) != null && parse.isHierarchical()) {
            this.b = parse.getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
        }
        return c(str, str2);
    }

    public String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffbe3a6", new Object[]{this, str, str2, str3});
        }
        try {
            this.f29284a = URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
        }
        Uri parse = Uri.parse(str2);
        if (parse != null && parse.isHierarchical()) {
            this.b = parse.getQueryParameter("epid");
        }
        return apv.a(str, "o2oclickid", a(str2, str3));
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("355b6065", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            TaoLog.Loge("O2OAdSdk", "广告请求参数或者点击URL为空");
            return "";
        }
        String e = e(str2);
        O2OClickSendRequest o2OClickSendRequest = new O2OClickSendRequest();
        Map b = apv.b(str);
        if (b == null) {
            b = new HashMap();
        }
        b.put("o2oclickid", e);
        o6j o6jVar = new o6j(str, jsj.DEFAULT_NO_RETRY, o2OClickSendRequest, b, O2OClickSendResponse.class);
        o6jVar.k(new a(this, e, this.b));
        gsj.a().c(o6jVar);
        String[] strArr = {"epid=" + d(this.b), "targeturl=" + d(this.f29284a), "o2o=" + d(this.c), "o2oclickid=" + e};
        ztv.b("o2o_click_commit", strArr);
        j4g.a("o2o_cpm_click_before", strArr);
        return e;
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d786b9c", new Object[]{this, str});
        }
        if ("1".equals(str)) {
            return "O2O_A1_" + vzo.d();
        } else if ("3".equals(str)) {
            return "O2O_A17_" + vzo.d();
        } else {
            return "O2O_A1_" + vzo.d();
        }
    }
}
