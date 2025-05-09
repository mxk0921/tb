package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.opencart.weex.DismissPopWeexModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class shv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliLogInterface f28062a = jq0.c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.shv.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c263aadc", new Object[]{this, str});
            } else {
                shv.b().loge(shv.a(), str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(String str);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return DismissPopWeexModule.MODULE_NAME;
    }

    public static /* synthetic */ AliLogInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("7e7ccf0d", new Object[0]);
        }
        return f28062a;
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (f28062a != null) {
            e(d(str, strArr), new a());
        }
    }

    public static String d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6453e00", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    sb.append(".");
                }
                sb.append(strArr[i]);
                if (strArr.length > 1) {
                    sb.append(" |");
                }
            } else {
                sb.append(" ");
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }

    public static void e(String str, b bVar) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("548f6b7d", new Object[]{str, bVar});
        } else if (str != null) {
            while (i < str.length()) {
                int i2 = i + 25600;
                if (str.length() <= i2) {
                    str2 = str.substring(i);
                } else {
                    str2 = str.substring(i, i2);
                }
                if (i != 0) {
                    str2 = "----- log split -----\n" + str2;
                }
                bVar.a(str2);
                i = i2;
            }
        }
    }
}
