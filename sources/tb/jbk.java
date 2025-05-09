package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jbk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String E_TYPE = "etype";
    public static final String O2O_URL = "o2o";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile jbk f21892a = new jbk();

        static {
            t2o.a(1019215875);
        }
    }

    static {
        t2o.a(1019215874);
    }

    public static jbk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jbk) ipChange.ipc$dispatch("507f9584", new Object[0]);
        }
        return a.f21892a;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddca706e", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new uc0().a(str, str2);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0744cab", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (!parse.isHierarchical()) {
                return str;
            }
            String queryParameter = parse.getQueryParameter(O2O_URL);
            if (!TextUtils.isEmpty(parse.getQueryParameter("o2oclickid"))) {
                return str;
            }
            String queryParameter2 = parse.getQueryParameter("etype");
            if (!"1".equals(queryParameter2) && !"3".equals(queryParameter2)) {
                return str;
            }
            String b = new uc0().b(str, queryParameter, queryParameter2);
            if (b != null) {
                return b;
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5438d0b1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return Uri.parse(c(str)).getQueryParameter("o2oclickid");
    }
}
