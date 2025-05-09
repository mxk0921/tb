package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.a;
import com.taobao.orange.util.OLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ds1<T> extends d02<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;
    public final String e;

    static {
        t2o.a(613417096);
    }

    public ds1(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public static /* synthetic */ Object ipc$super(ds1 ds1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/sync/BaseCdnRequest");
    }

    public abstract T f(String str);

    public T g() {
        String str;
        int d;
        if (OLog.isPrintLog(1)) {
            OLog.d("CdnRequest", "syncRequest start", "cdn url", this.d);
        }
        try {
            tzc tzcVar = (tzc) a.f.newInstance();
            int i = tzcVar instanceof h9b ? a.q : 1;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    str = null;
                    break;
                }
                try {
                    tzcVar.f(this.d);
                    tzcVar.setMethod("GET");
                    tzcVar.c(ibl.b());
                    if (tzcVar instanceof tqr) {
                        tzcVar.addHeader("f-refer", "orange");
                    }
                    tzcVar.connect();
                    d = tzcVar.d();
                    this.f17483a = d;
                } finally {
                    try {
                        tzcVar.disconnect();
                        i2++;
                    } catch (Throwable th) {
                    }
                }
                if (d == 200) {
                    str = tzcVar.e();
                    tzcVar.disconnect();
                    break;
                }
                this.c = d;
                tzcVar.disconnect();
                i2++;
            }
            if (TextUtils.isEmpty(str)) {
                this.f17483a = -2;
                this.b = "content is empty";
                OLog.e("CdnRequest", "syncRequest fail", "code", -2, "msg", this.b);
                return null;
            }
            String md5 = tzcVar.getMd5();
            if (TextUtils.isEmpty(md5)) {
                md5 = doh.d(str);
            }
            if (TextUtils.isEmpty(this.e) || this.e.equals(md5)) {
                try {
                    return f(str);
                } catch (Throwable th2) {
                    this.f17483a = -4;
                    this.b = th2.getMessage();
                    OLog.e("CdnRequest", "syncRequest fail", th2, new Object[0]);
                    return null;
                }
            } else {
                this.f17483a = -3;
                this.b = "content is broken";
                OLog.e("CdnRequest", "syncRequest fail", "code", -3, "msg", this.b);
                return null;
            }
        } catch (Throwable th3) {
            OLog.e("CdnRequest", "syncRequest", th3, new Object[0]);
            this.b = th3.getMessage();
            return null;
        }
    }
}
