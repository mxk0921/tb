package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ms0 implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f24268a;

    static {
        t2o.a(779092680);
        t2o.a(806355016);
    }

    public ms0(ux9 ux9Var) {
        this.f24268a = ux9Var;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a8dce3", new Object[]{this});
        }
        String U = up6.U(this.f24268a);
        String L = up6.L(this.f24268a);
        return "appKey=" + b() + "#livesource=" + L + "#spm=" + U;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        if (v2s.o().f() != null) {
            return v2s.o().f().getAppKey();
        }
        return "21646297";
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "AlimamaQZTManager";
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26183fac", new Object[]{this, str});
        }
        Matcher matcher = Pattern.compile("feedid=(\\d+)").matcher(Uri.decode(str));
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            sjr.g().a(this);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            sjr.g().b(this);
        }
    }

    public final void g() {
        VideoInfo.AlimamaEnjoyFirst alimamaEnjoyFirst;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.f24268a);
        if (c0 != null && (alimamaEnjoyFirst = c0.alimamaEnjoyFirst) != null && (str = alimamaEnjoyFirst.ifs) != null) {
            String replaceAll = str.replaceAll("__APPINFO__", b() + "_0");
            if (gq0.c() != null) {
                gq0.c().c(replaceAll, a(), "TargetQzt");
            }
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.enter", "com.taobao.taolive.room.good_click"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.f24268a;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.good_click".equals(str) && (obj instanceof String[])) {
            f((String[]) obj);
        } else if ("com.taobao.taolive.room.enter".equals(str)) {
            g();
        }
    }

    public final void f(String[] strArr) {
        VideoInfo.AlimamaEnjoyFirst alimamaEnjoyFirst;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c957ec0c", new Object[]{this, strArr});
            return;
        }
        VideoInfo c0 = up6.c0(this.f24268a);
        if (c0 != null && (alimamaEnjoyFirst = c0.alimamaEnjoyFirst) != null && (str = alimamaEnjoyFirst.eurl) != null) {
            String str3 = strArr[0];
            String str4 = strArr[1];
            String c = c(str);
            String replaceAll = c0.alimamaEnjoyFirst.eurl.replaceAll("__INTERACT_TYPE__", to8.GOTO_DETAIL).replaceAll(bps.ITEM_ID_PLACE_HOLDER, str4).replaceAll("__TIMESTAMP__", String.valueOf(System.currentTimeMillis() / 1000));
            String replaceAll2 = replaceAll.replaceAll("__APPINFO__", b() + "_0");
            if (gq0.c() != null) {
                gq0.c().a(replaceAll2, a());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("liveId", str3);
            hashMap.put("itemId", str4);
            hashMap.put("alimamaLiveId", c);
            if (TextUtils.equals(str3, c)) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            hashMap.put("isSame", str2);
            if (v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "alimamaTcpReportCheck", hashMap);
            }
        }
    }
}
