package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.querypassword.check.mtop.Checkistaopassword$Request;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import java.util.regex.Pattern;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xhs implements zwd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845928);
        t2o.a(665845927);
    }

    @Override // tb.zwd
    public vq3 a(Context context, k8t k8tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq3) ipChange.ipc$dispatch("b718ca48", new Object[]{this, context, k8tVar});
        }
        if (!TextUtils.isEmpty(k8tVar.b)) {
            return null;
        }
        if (blo.n() && !j(k8tVar.f22479a)) {
            return null;
        }
        vq3 b = b(k8tVar.f22479a);
        if (b.f30170a) {
            g(context, b.b);
        }
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r3.equals("B") == false) goto L_0x0027;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.vq3 b(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.xhs.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "ad2e73"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            tb.vq3 r7 = (tb.vq3) r7
            return r7
        L_0x0018:
            java.lang.String r3 = tb.yhs.f()
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 65: goto L_0x003d;
                case 66: goto L_0x0034;
                case 67: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r0 = -1
            goto L_0x0047
        L_0x0029:
            java.lang.String r0 = "C"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            r0 = 2
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "B"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0027
        L_0x003d:
            java.lang.String r0 = "A"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0046
            goto L_0x0027
        L_0x0046:
            r0 = 0
        L_0x0047:
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0054;
                case 2: goto L_0x004f;
                default: goto L_0x004a;
            }
        L_0x004a:
            tb.vq3 r7 = r6.c(r7)
            return r7
        L_0x004f:
            tb.vq3 r7 = r6.e(r7)
            return r7
        L_0x0054:
            tb.vq3 r7 = r6.d(r7)
            return r7
        L_0x0059:
            tb.vq3 r7 = r6.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xhs.b(java.lang.String):tb.vq3");
    }

    public final vq3 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq3) ipChange.ipc$dispatch("fdffab7", new Object[]{this, str});
        }
        vq3 vq3Var = new vq3();
        String d = n8t.d(yhs.c(), str);
        if (TextUtils.isEmpty(d)) {
            vq3Var.f30170a = false;
            return vq3Var;
        }
        vq3Var.f30170a = true;
        vq3Var.b = d;
        f(str);
        return vq3Var;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("185060e4", new Object[]{this, str});
        }
        if (i(str)) {
            return kis.MIAO;
        }
        return kis.TAO;
    }

    public final boolean g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("698ec43e", new Object[]{this, context, str})).booleanValue();
        }
        return n8t.b(context, str);
    }

    public final boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c46324b9", new Object[]{this, str})).booleanValue();
        }
        try {
            return Pattern.compile(yhs.b()).matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7570c9a", new Object[]{this, str})).booleanValue();
        }
        if (n8t.c(yhs.e(), str)) {
            return true;
        }
        return false;
    }

    public final vq3 e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq3) ipChange.ipc$dispatch("9fdeb775", new Object[]{this, str});
        }
        vq3 c = c(str);
        if (c.f30170a) {
            return c;
        }
        c.b = str;
        if (TextUtils.equals(f(str), kis.TAO)) {
            c.f30170a = h(str);
        } else {
            c.f30170a = true;
        }
        return c;
    }

    public final vq3 d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq3) ipChange.ipc$dispatch("57df5916", new Object[]{this, str});
        }
        vq3 c = c(str);
        if (c.f30170a) {
            fwr.d("plan A");
            return c;
        } else if (!n8t.c(yhs.d(), str)) {
            fwr.d("plan b");
            c.f30170a = false;
            return c;
        } else {
            fwr.d("plan b");
            c.f30170a = true;
            c.b = str;
            if (TextUtils.equals(f(str), kis.TAO)) {
                c.f30170a = h(str);
            }
            return c;
        }
    }

    public final boolean h(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6dd9e8", new Object[]{this, str})).booleanValue();
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREBACKISTAOPASSWORDMTOPSTART);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Checkistaopassword$Request checkistaopassword$Request = new Checkistaopassword$Request();
        if (msl.c().e()) {
            List<String> a2 = msl.c().a(str);
            if (a2 == null || a2.size() <= 0) {
                return false;
            }
            boolean f = msl.c().f();
            checkistaopassword$Request.passwordContent = JSON.toJSONString(a2);
            checkistaopassword$Request.passwordKeyList = JSON.toJSONString(a2);
            checkistaopassword$Request.openHash = f;
        } else {
            checkistaopassword$Request.passwordContent = str;
        }
        MtopResponse syncRequest = RemoteBusiness.build((IMTOPDataObject) checkistaopassword$Request, j8t.a()).syncRequest();
        if (syncRequest != null) {
            if (syncRequest.isApiSuccess()) {
                JSONObject jSONObject = new JSONObject(new String(syncRequest.getBytedata()));
                jSONObject.toString();
                String string = jSONObject.getJSONObject("data").getString("isTaoPassword");
                if (!"1".equals(string) && !"true".equals(string)) {
                    z = false;
                }
                fwr.d("mtop.taobao.sharepassword.checkistaopassword 结果: " + z);
                e.a(kkp.KEY_SHAREBACKISTAOPASSWORDMTOPEND);
                return z;
            }
        }
        fwr.d("mtop.taobao.sharepassword.checkistaopassword 结果: true");
        return true;
    }
}
