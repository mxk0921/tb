package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENCODE_PREFIX = "@encode.";
    public static final String STR_PREFIX = "@str.";
    public static final Map<String, b> c = new HashMap();
    public static final Map<String, a> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final xp8 f30836a;
    public final ExprParserParams b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        JSONObject a(Context context, Intent intent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        String a(Context context, Intent intent);
    }

    static {
        t2o.a(329252913);
    }

    public wp8(ExprParserParams exprParserParams, xp8 xp8Var) {
        this.b = exprParserParams;
        this.f30836a = xp8Var;
    }

    public static Object c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9bfa7bf6", new Object[]{str});
        }
        Object a2 = tls.a(str);
        if (a2 == null) {
            a2 = als.a(str, new Object[0]);
        }
        if (a2 == null) {
            return str;
        }
        return a2;
    }

    public static boolean n(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd194f78", new Object[]{str, bVar})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || bVar == null) {
            return false;
        }
        ((HashMap) c).put(str, bVar);
        return true;
    }

    public List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("40820cf9", new Object[]{this});
        }
        return this.b.blacklist;
    }

    public EditionInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditionInfo) ipChange.ipc$dispatch("fc6e9e9c", new Object[]{this});
        }
        return this.f30836a.a();
    }

    public a d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a77cf10b", new Object[]{this, str});
        }
        return (a) ((HashMap) d).get(str);
    }

    public b e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8cbe8921", new Object[]{this, str});
        }
        return (b) ((HashMap) c).get(str);
    }

    public Intent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
        }
        return this.b.intent;
    }

    public LocationInfo g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationInfo) ipChange.ipc$dispatch("9ff8a3b7", new Object[]{this});
        }
        return this.f30836a.getLocation();
    }

    public LoginInfo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginInfo) ipChange.ipc$dispatch("e9a57aad", new Object[]{this});
        }
        return this.f30836a.getLoginInfo();
    }

    public List<TimeContent> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eaa5676a", new Object[]{this});
        }
        return this.b.timeContent;
    }

    public Uri j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d7589ef4", new Object[]{this});
        }
        ExprParserParams exprParserParams = this.b;
        if (exprParserParams.uri == null) {
            try {
                exprParserParams.uri = Uri.parse(exprParserParams.targetUrl);
            } catch (Throwable th) {
                zdh.b("TS.ExprParser", "parse url error, url=" + this.b.targetUrl, th);
            }
        }
        return this.b.uri;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b.targetUrl;
    }

    public Object l(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("904e22dc", new Object[]{this, obj});
        }
        if (obj instanceof tls) {
            return ((tls) obj).c(this);
        }
        if (obj instanceof als) {
            return ((als) obj).b(this);
        }
        return obj;
    }

    public Object m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fe642ae", new Object[]{this, str});
        }
        return l(c(str));
    }
}
