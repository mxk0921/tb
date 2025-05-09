package tb;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.alipay.callservice.AlipayCallServiceActivity;
import com.taobao.tao.alipay.callservice.WVIdleFishApiBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ov2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIPAY_ACCOUNT_SITE = "accountSite";
    public static final String ALIPAY_BIZ_TYPE = "bizType";
    public static final String ALIPAY_SIGN_PARAMS = "sign_params";
    public static ov2 b;

    /* renamed from: a  reason: collision with root package name */
    public qpk f25670a;

    public static ov2 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ov2) ipChange.ipc$dispatch("a446475d", new Object[0]);
        }
        if (b == null) {
            b = new ov2();
        }
        return b;
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8a6229", new Object[]{this, intent});
        } else if (this.f25670a != null && intent != null && intent.getExtras() != null && intent.getStringExtra("errorCode") != null) {
            String stringExtra = intent.getStringExtra("errorCode");
            String obj = stringExtra != null ? stringExtra.toString() : null;
            if (e(obj, "0")) {
                ((WVIdleFishApiBridge.a) this.f25670a).c(obj, intent.getStringExtra("result"));
            } else {
                ((WVIdleFishApiBridge.a) this.f25670a).b(obj, intent.getStringExtra("result"));
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f25670a = null;
        }
    }

    public final boolean d(CharSequence charSequence) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1394f79", new Object[]{this, charSequence})).booleanValue();
        }
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd76449", new Object[]{this, str, str2})).booleanValue();
        }
        if (d(str2) || d(str)) {
            return false;
        }
        return str.equals(str2);
    }

    public void f(Context context, String str, String str2, String str3, qpk qpkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0e443e", new Object[]{this, context, str, str2, str3, qpkVar});
            return;
        }
        this.f25670a = qpkVar;
        Intent intent = new Intent(context, AlipayCallServiceActivity.class);
        intent.putExtra("bizType", str);
        intent.putExtra(ALIPAY_SIGN_PARAMS, str2);
        intent.putExtra(ALIPAY_ACCOUNT_SITE, str3);
        context.startActivity(intent);
    }
}
