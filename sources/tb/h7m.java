package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20456a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        t2o.a(806356455);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("693bfbfe", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.f20456a) || TextUtils.isEmpty(this.b)) {
            return false;
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return true;
        }
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && h7m.class == obj.getClass()) {
            h7m h7mVar = (h7m) obj;
            if (a()) {
                String str3 = this.b;
                if (str3 != null && (str2 = h7mVar.b) != null && str3.equals(str2)) {
                    return true;
                }
            } else {
                String str4 = this.d;
                if (str4 != null && (str = h7mVar.d) != null && str4.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
