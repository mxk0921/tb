package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class igq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String TAG = igq.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public static volatile igq f21303a;

    static {
        t2o.a(806356416);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7048ecb3", new Object[0])).booleanValue();
        }
        return zqq.c(v2s.o().p().b("tblive", "enableTrackInfoAutofill", "true"));
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85becf9d", new Object[0])).booleanValue();
        }
        blc p = v2s.o().p();
        return p != null && zqq.c(p.b("tblive", "enableXTrackClick", "true"));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78deeff1", new Object[0])).booleanValue();
        }
        blc p = v2s.o().p();
        return p != null && zqq.c(p.b("tblive", "enableXTrackTLog", "true"));
    }

    public static igq n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (igq) ipChange.ipc$dispatch("718a90", new Object[0]);
        }
        if (f21303a == null) {
            synchronized (igq.class) {
                try {
                    if (f21303a == null) {
                        f21303a = new igq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21303a;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbd27e5", new Object[]{this, str});
        } else {
            c(str, null, null, null);
        }
    }

    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f90e79", new Object[]{this, str, str2, str3});
        } else {
            c(str, null, str2, str3);
        }
    }

    public void c(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265eec03", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (zqq.a(str3)) {
            str3 = "UnknownError";
        }
        if (zqq.a(str4)) {
            str4 = "UnknownCode";
        }
        if (v2s.o().e() != null) {
            if (TextUtils.isEmpty(str2)) {
                v2s.o().e().commitFail("taolive", str, str3, str4);
            } else {
                v2s.o().e().commitFail("taolive", str, str2, str3, str4);
            }
        }
        p(str, "args:" + str2 + ",errorMsg:" + str3 + ",errorCode:" + str4);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("966f0c5d", new Object[]{this, str});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitSuccess("taolive", str);
        }
    }

    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{this, str, str2});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitSuccess("taolive", str, str2);
        }
    }

    public void f(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55165de", new Object[]{this, str, new Double(d)});
        } else if (v2s.o().e() != null) {
            v2s.o().e().a("taolive", str, d);
        }
    }

    public void g(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37574d54", new Object[]{this, str, str2, new Double(d)});
        } else if (v2s.o().e() != null) {
            v2s.o().e().c("taolive", str, str2, d);
        }
    }

    public String k(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b1eb746", new Object[]{this, th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            cause.printStackTrace(printWriter);
        }
        printWriter.close();
        return stringWriter.toString();
    }

    public Map<String, String> l(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6e03b60e", new Object[]{this, tLiveMsg});
        }
        Map<String, String> m = m();
        if (tLiveMsg != null) {
            m.put("messageId", tLiveMsg.messageId);
            m.put("msgType", String.valueOf(tLiveMsg.type));
            m.put("timestamp", String.valueOf(tLiveMsg.timestamp));
        }
        return m;
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("24d16441", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        return hashMap;
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f7d64e", new Object[]{this, str});
        } else {
            p("unknown", str);
        }
    }

    public void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9d4898", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> m = m();
        m.put("errorString", str2);
        if (v2s.o().A() != null && j()) {
            v2s.o().A().c(str, fkx.h(m));
        }
        if (v2s.o().E() != null && i()) {
            q(str, m);
        }
        String str3 = TAG;
        Log.e(str3, "error:" + str2);
    }

    public void q(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a9fbdb", new Object[]{this, str, map});
        } else if (v2s.o().E() != null) {
            if (h() && !str.startsWith("Page_TaobaoLiveWatch")) {
                str = "Page_TaobaoLiveWatch-Button-".concat(str);
            }
            v2s.o().E().trackCustom("Page_TaobaoLiveWatch", 19999, str, "", "", map);
        }
    }

    public void r(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4ea420", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> m = m();
        m.put("pointString", str2);
        if (v2s.o().A() != null && j()) {
            v2s.o().A().c(str, JSON.toJSONString(m));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(JSON.toJSONString(m));
    }

    public void s(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca27365", new Object[]{this, str, str2, map});
            return;
        }
        r(str + ":" + str2, JSON.toJSONString(map));
    }
}
