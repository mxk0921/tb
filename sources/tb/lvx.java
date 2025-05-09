package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class lvx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23600a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public lvx(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f23600a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final String toString() {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime()));
        stringBuffer.append("," + this.f23600a);
        stringBuffer.append("," + this.b);
        stringBuffer.append("," + this.c);
        stringBuffer.append("," + this.d);
        if (vux.c(this.e) || this.e.length() < 20) {
            sb = new StringBuilder(",");
            str = this.e;
        } else {
            sb = new StringBuilder(",");
            str = this.e.substring(0, 20);
        }
        sb.append(str);
        stringBuffer.append(sb.toString());
        if (vux.c(this.f) || this.f.length() < 20) {
            sb2 = new StringBuilder(",");
            str2 = this.f;
        } else {
            sb2 = new StringBuilder(",");
            str2 = this.f.substring(0, 20);
        }
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        if (vux.c(this.g) || this.g.length() < 20) {
            str3 = "," + this.g;
        } else {
            str3 = "," + this.g.substring(0, 20);
        }
        stringBuffer.append(str3);
        return stringBuffer.toString();
    }
}
