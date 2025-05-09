package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.ultron.module.ReallyPayFiles;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.login4android.api.Login;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.tao.alipay.export.Cashdesk;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class uvl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_KEY_SIGN_STR = "signStr";
    public static final String TAG = uvl.class.getSimpleName();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29638a;
        public final /* synthetic */ ReallyPayFiles b;
        public final /* synthetic */ String c;

        public a(Activity activity, ReallyPayFiles reallyPayFiles, String str) {
            this.f29638a = activity;
            this.b = reallyPayFiles;
            this.c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            uvl.a(this.f29638a, this.b, this.c);
            dialogInterface.dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static b f29639a;

        static {
            t2o.a(713031802);
        }

        public static b a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("477788c2", new Object[]{context});
            }
            if (f29639a == null) {
                f29639a = new b();
            }
            return f29639a;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/PayHelper$BindAliPayHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            if (message.what == 911109) {
                lor.c(uvl.TAG, "BindAliPayHandler", "bindAliPaySuccess");
            }
            f29639a = null;
        }
    }

    static {
        t2o.a(713031800);
    }

    public static /* synthetic */ void a(Activity activity, ReallyPayFiles reallyPayFiles, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f6bc67", new Object[]{activity, reallyPayFiles, str});
        } else {
            d(activity, reallyPayFiles, str);
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27176b9", new Object[]{context, str});
        } else if (str != null) {
            try {
                Login.bindAlipay("order", str, b.a(context));
            } catch (Throwable th) {
                new HashMap().put(AlipayAuthConstant.SIGN_DATA, str);
                lor.c(TAG, "doBindAliPay", th.toString());
            }
        }
    }

    public static boolean c(Activity activity, ReallyPayFiles reallyPayFiles, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("948ef50e", new Object[]{activity, reallyPayFiles, str})).booleanValue();
        }
        if (activity == null || reallyPayFiles == null) {
            return false;
        }
        String str2 = TAG;
        lor.c(str2, "goToSimplePay", "dataObj = " + reallyPayFiles.toString());
        if (!TextUtils.isEmpty(reallyPayFiles.reason)) {
            f(activity, reallyPayFiles, reallyPayFiles.reason, str);
        } else {
            d(activity, reallyPayFiles, str);
        }
        return true;
    }

    public static void f(Activity activity, ReallyPayFiles reallyPayFiles, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa157d2c", new Object[]{activity, reallyPayFiles, str, str2});
        } else if (!activity.isFinishing()) {
            il7.a(null, str, Localization.q(R.string.order_biz_cancel), activity).setPositiveButton(Localization.q(R.string.order_biz_confirm), new a(activity, reallyPayFiles, str2)).create().show();
        }
    }

    public static void d(Activity activity, ReallyPayFiles reallyPayFiles, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23c8c1f", new Object[]{activity, reallyPayFiles, str});
        } else if (!reallyPayFiles.canPay || (TextUtils.isEmpty(reallyPayFiles.alipayUrl) && TextUtils.isEmpty(reallyPayFiles.signStr))) {
            String q = Localization.q(R.string.order_biz_app_not_support_go_pc);
            z4v.a(activity, q);
            String str3 = TAG;
            lor.c(str3, "pay", q);
            e(str, false, 6, str3 + "pay:" + q);
        } else {
            boolean z = reallyPayFiles.simplePay;
            String b2 = jql.b(reallyPayFiles.orderIds);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("orderids", b2);
                hashMap.put("signStr", reallyPayFiles.signStr);
                if (!TextUtils.isEmpty(reallyPayFiles.unSuccessUrl)) {
                    hashMap.put("unSuccessUrl", reallyPayFiles.unSuccessUrl);
                }
                hashMap.put("simplepay", String.valueOf(z));
                hashMap.put("backURL", reallyPayFiles.backUrl);
                hashMap.put("alipayURL", reallyPayFiles.alipayUrl);
                hashMap.put(CashdeskConstants.KEY_SINGLE_TOP, "true");
                if (TextUtils.isEmpty(str)) {
                    str2 = "order";
                } else {
                    str2 = "order_" + str;
                }
                hashMap.put("from", str2);
                JSONObject jSONObject = reallyPayFiles.cashierParam;
                if (jSONObject != null) {
                    hashMap.put("cashierParam", jSONObject.toJSONString());
                }
                hashMap.put("cashierType", reallyPayFiles.cashierType);
                Cashdesk.invokeAlipay(activity, hashMap);
            } catch (Throwable th) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errorInfo", th.toString());
                hashMap2.put("initData", reallyPayFiles.toString());
                e(str, false, 6, TAG + "params:" + hashMap2.toString());
            }
        }
    }

    public static void e(String str, boolean z, int i, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618d6f7b", new Object[]{str, new Boolean(z), new Integer(i), str2});
        } else if (!TextUtils.isEmpty(str) && uel.l("enableConfirmGoodReport", true)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = "default";
            }
            if (str.contains("batch")) {
                str3 = "batchConfirmGoodEndToEndTracker";
            } else if (str.contains(PromotionFilterBean.SINGLE)) {
                str3 = "confirmGoodEndToEndTracker";
            } else {
                str3 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                hav.g(TAG, "report2JSTracker:", "not from confirmGood");
                return;
            }
            h15 success = idl.a.a(OrderBizCode.orderList, str3).message(str2).success(true);
            if (z) {
                i = 1;
            }
            idl.c(success.branch(i).branchEntry(false).sampling(cw6.b() ? 1.0f : uel.e("confirmGoodReportSampling", 0.3f)));
        }
    }
}
