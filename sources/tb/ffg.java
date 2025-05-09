package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import tb.w0o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ffg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699240);
    }

    public static HashMap<String, String> a(String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6dd6fc38", new Object[]{str, str2, str3, str4});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("pageCode", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("pageNode", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("errorCode", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("errorMsg", str4);
        }
        if (UltronInstanceViewModel.k) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        hashMap.put("gl_first_in_live", str5);
        hashMap.put("gl_track_version", "2");
        return hashMap;
    }

    public static void c(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207ee2b6", new Object[]{str, new Integer(i), str2});
        } else if (wda.i() && !TextUtils.isEmpty(str)) {
            HashMap<String, String> a2 = a(str, null, null, null);
            a2.put("source", Integer.toString(i));
            a2.put("gl_type", "configHit");
            a2.put("reason", str2);
            nha.l(a2);
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b83d3817", new Object[]{str, str2, str3});
        } else if (wda.i() && !TextUtils.isEmpty(str)) {
            HashMap<String, String> a2 = a(str, null, str2, str3);
            a2.put("gl_type", "createView");
            nha.n(a2);
        }
    }

    public static void b(w0o w0oVar, boolean z, long j) {
        b2e o;
        String str;
        long j2;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dedc2017", new Object[]{w0oVar, new Boolean(z), new Long(j)});
        } else if (wda.i() && w0oVar != null && !TextUtils.isEmpty(w0oVar.b) && !TextUtils.isEmpty(w0oVar.c) && (o = kkr.i().o()) != null) {
            int nextInt = new Random().nextInt();
            StringBuilder sb = new StringBuilder("renderP | pageCode=");
            sb.append(w0oVar.b);
            sb.append(" node=");
            sb.append(w0oVar.c);
            sb.append(" isRefresh=");
            sb.append(w0oVar.d);
            sb.append(" duration=");
            sb.append(w0oVar.h);
            sb.append("   expressionTime=");
            sb.append(w0oVar.i);
            sb.append(" dimensionCalculateTime=");
            sb.append(w0oVar.j);
            sb.append(" track=");
            int i2 = nextInt % 20;
            sb.append(i2 == 0);
            hha.d("LVTrack", sb.toString());
            if (i2 == 0) {
                HashMap<String, String> a2 = a(w0oVar.b, w0oVar.c, null, null);
                if (w0oVar.d) {
                    str = "refresh";
                } else {
                    str = "render";
                }
                a2.put("renderType", str);
                a2.put("renderTime", Long.toString(w0oVar.h));
                a2.put("expressionTime", Long.toString(w0oVar.i));
                List<w0o.a> list = w0oVar.e;
                long j3 = 0;
                if (list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        w0o.a aVar = (w0o.a) it.next();
                        a2.put(aVar.f30386a, Long.toString(aVar.d));
                        j3 += aVar.d;
                        i++;
                    }
                }
                if (z) {
                    j2 = j - w0oVar.f30385a;
                } else {
                    j2 = w0oVar.h;
                }
                a2.put("totalTime", Long.toString(j2));
                a2.put("templateNum", Integer.toString(i));
                a2.put("templateTime", Long.toString(j3));
                if (z) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                a2.put("pipeline", str2);
                o.c("taolive_gl_p", a2);
            }
        }
    }

    public static void e(w0o w0oVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("234b1d2b", new Object[]{w0oVar});
        } else if (wda.i() && w0oVar != null && !TextUtils.isEmpty(w0oVar.b) && w0oVar.b()) {
            hha.b("LVTrack", "trackRenderResult | has Error. code=" + w0oVar.g + "   page=" + w0oVar.b + "   node=" + w0oVar.c);
            HashMap<String, String> a2 = a(w0oVar.b, w0oVar.c, w0oVar.g, null);
            List<w0o.a> list = w0oVar.f;
            if (list != null) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    w0o.a aVar = (w0o.a) it.next();
                    if (aVar != null && !TextUtils.isEmpty(aVar.f30386a)) {
                        String str = aVar.f30386a;
                        a2.put(str, aVar.b + "_" + aVar.c + "_" + aVar.e);
                        i++;
                    }
                }
            }
            a2.put("errorDXSize", Integer.toString(i));
            a2.put("gl_type", "renderView");
            nha.n(a2);
        }
    }
}
