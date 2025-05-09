package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class v5s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29798a = "";

    static {
        t2o.a(815793521);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf5e423", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f29798a)) {
            return "";
        }
        return "[{" + this.f29798a + "}]";
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed056aa3", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            if (str2 == null || TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(this.f29798a)) {
                this.f29798a += ',';
            }
            this.f29798a += '\"' + str + "\":\"" + str2 + '\"';
        }
    }
}
