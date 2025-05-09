package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class jd8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(817889302);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539bf2e6", new Object[0])).booleanValue();
        }
        return uc1.a("ask_everyone", "answerPublish_enable", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb9f69c4", new Object[0])).booleanValue();
        }
        return uc1.a("ask_everyone", "answerPublish_checkAnswerd", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d6d8c7e", new Object[0])).booleanValue();
        }
        return uc1.a("ask_everyone", "questionPublish_enable", true);
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d90fa91f", new Object[0]);
        }
        return uc1.d("ask_everyone", "weex_answer_publisher_url", "https://fe.m.taobao.com/app/UGC-Vision/qa-publisher/answer?wh_weex=true&weex_mode=dom&wx_statusbar_hidden=true&wx_navbar_hidden=true&wx_navbar_transparent=true&tradeHybrid=true");
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e9e7387", new Object[0]);
        }
        return uc1.d("ask_everyone", "weex_question_publisher_url", "https://fe.m.taobao.com/app/UGC-Vision/qa-publisher/ask?wh_weex=true&weex_mode=dom&wx_statusbar_hidden=true&wx_navbar_hidden=true&wx_navbar_transparent=true&tradeHybrid=true");
    }

    public static boolean a(String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90707c74", new Object[]{str, str2})).booleanValue();
        }
        if ("answer".equals(str) || "question".equals(str)) {
            if ("answer".equals(str)) {
                z = b();
            } else {
                z = d();
            }
            if (!z) {
                return false;
            }
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            String d = uc1.d("ask_everyone", str + "_publisher_" + str2 + "_enable", "0");
            d.hashCode();
            if (d.equals("1")) {
                return true;
            }
            if (d.equals("2")) {
                return "true".equals(rc1.a("android_ask_everyone", str + "_publisher", str2 + "_enable", "false"));
            }
        }
        return false;
    }
}
