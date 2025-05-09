package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.ext.event.util.AlipayUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.internal.PayRequest;
import com.taobao.taobao.internal.PayResultInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class us0 implements z7d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a8d f29582a;
    public final Activity b;
    public PayRequest c;

    public us0(Activity activity) {
        this.b = activity;
    }

    public static /* synthetic */ Activity b(us0 us0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f236ab39", new Object[]{us0Var});
        }
        return us0Var.b;
    }

    public static /* synthetic */ boolean c(us0 us0Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b07dc3f9", new Object[]{us0Var, map})).booleanValue();
        }
        return us0Var.h(map);
    }

    public static /* synthetic */ void d(us0 us0Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e2d4e5", new Object[]{us0Var, str, str2});
        } else {
            us0Var.j(str, str2);
        }
    }

    public static /* synthetic */ PayRequest e(us0 us0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayRequest) ipChange.ipc$dispatch("b3f92118", new Object[]{us0Var});
        }
        return us0Var.c;
    }

    public static /* synthetic */ void l(us0 us0Var, PayResultInfo payResultInfo, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8514772", new Object[]{us0Var, payResultInfo, map});
        } else {
            us0Var.g(payResultInfo, map);
        }
    }

    @Override // tb.z7d
    public void a(PayRequest payRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef63387", new Object[]{this, payRequest});
            return;
        }
        this.c = payRequest;
        payRequest.setPayMethod("alipay");
    }

    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e70e4ab", new Object[]{this, map});
            return;
        }
        if (i(map)) {
            this.b.setResult(-1);
        }
        this.b.finish();
    }

    public final void g(PayResultInfo payResultInfo, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71de44f", new Object[]{this, payResultInfo, map});
            return;
        }
        payResultInfo.from = map.get("from");
        map.get("orderids");
        String str = map.get("backURL");
        map.get("unSuccessUrl");
        String str2 = map.get(AlipayUtil.KEY_ALIPAY_BLOCK);
        String str3 = payResultInfo.resultStatus;
        str3.hashCode();
        if (!str3.equals("6001")) {
            if (str3.equals("9000")) {
                JSONObject parseObject = JSON.parseObject(payResultInfo.resultString);
                if (parseObject.containsKey("isJumpUrl") && !((Boolean) parseObject.get("isJumpUrl")).booleanValue()) {
                    return;
                }
                if (payResultInfo.isShareMsmType()) {
                    Uri parse = Uri.parse(str);
                    Uri.Builder buildUpon = parse.buildUpon();
                    String path = parse.getPath();
                    if (path == null || path.length() == 0) {
                        buildUpon.appendPath("");
                    }
                    buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_PAYURL, Uri.encode(payResultInfo.sharePayData.payurl));
                    if (!TextUtils.isEmpty(payResultInfo.sharePayData.amount)) {
                        buildUpon.appendQueryParameter(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, Uri.encode(payResultInfo.sharePayData.amount));
                    }
                    buildUpon.appendQueryParameter("daifuUserId", payResultInfo.extendInfo.payerUserId + "");
                    buildUpon.toString();
                }
            } else if (!"6001".equals(payResultInfo.resultStatus)) {
                map.get("signStr");
            }
        }
        TextUtils.isEmpty(str2);
    }

    public final void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2468cb59", new Object[]{this, str, str2});
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.b);
        Intent intent = new Intent(CashdeskConstants.CASHDESK_BROADCAST_RESULT_ACTION);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("result", str2);
        }
        instance.sendBroadcast(intent);
    }

    public z7d k(a8d a8dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7d) ipChange.ipc$dispatch("fd55855", new Object[]{this, a8dVar});
        }
        this.f29582a = a8dVar;
        return this;
    }

    public final boolean h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d7983eb", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("broadcast");
        return "1".equals(str) || "true".equals(str);
    }

    public final boolean i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c628eedb", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("result");
        return "1".equals(str) || "true".equals(str);
    }
}
