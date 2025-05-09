package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iws implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVEHOMEMIX = "liveHomeMix";
    public static final String PARAM_LIVEHOME_SPM = "livehomeSpm";
    public static String f;
    public static String g;
    public static String h;
    public static int i;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f21620a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final String d = pvs.L2();
    public DXRootView e;

    static {
        t2o.a(779092885);
        t2o.a(806355016);
    }

    public iws(Activity activity, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f21620a = activity;
        this.b = frameLayout;
        this.c = frameLayout2;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36b15fa0", new Object[0])).booleanValue();
        }
        return "true".equals(f) && pvs.v0();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef552e6", new Object[0])).booleanValue();
        }
        return "true".equals(v2s.o().p().b("tblive", "enableLiveAndHomeMixSPMOrange", "true")) && b() && !TextUtils.isEmpty(e());
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39f3aad6", new Object[0])).intValue();
        }
        int a2 = hw0.a(pvs.M2());
        i = a2;
        return a2;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d05f31ca", new Object[0]);
        }
        String str = g;
        if (TextUtils.isEmpty(str)) {
            str = h;
        }
        if (TextUtils.isEmpty(str)) {
            return "a2141.8001249";
        }
        return str;
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533e3654", new Object[]{str});
            return;
        }
        g = str;
        if (!TextUtils.isEmpty(str)) {
            h = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        f = "";
        g = "";
        h = "";
        if (v2s.o().d() != null && v2s.o().d().a() != null && v2s.o().d().a().get("changeLandscapeBtn") != null) {
            v2s.o().d().a().remove("changeLandscapeBtn");
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaoLiveHomePageTab";
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.hometab.click"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (vx9.d() != null) {
            return vx9.d().C();
        }
        return null;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.d) && this.b != null && this.c != null && b()) {
            this.b.setBackgroundResource(0);
            DXRootView a2 = w36.k().a(this.f21620a, this.d);
            this.e = a2;
            if (a2 != null) {
                w36.k().h(this.e, new JSONObject());
                this.c.addView(this.e);
                ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-1, -2);
                }
                layoutParams.width = -1;
                layoutParams.height = i;
                this.c.setLayoutParams(layoutParams);
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.b52810609.topbar.hometab");
                rbu.T("Show-Hometab", hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm", "a2141.b52810609.topbar.followtab");
                rbu.T("Show-Followtab", hashMap2);
            }
            if (!(v2s.o().d() == null || v2s.o().d().a() == null)) {
                v2s.o().d().a().put("changeLandscapeBtn", Boolean.FALSE);
            }
            sjr.g().a(this);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.hometab.click".equals(str) && (obj instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            if (!"btnClick".equals(objArr[0])) {
                return;
            }
            if ("backBtn".equals(objArr[1])) {
                this.f21620a.finish();
            } else if ("followBtn".equals(objArr[1])) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm", "a2141.b52810609.topbar.followtab");
                rbu.I("Followtab", hashMap);
                voj.a(this.f21620a, "http://h5.m.taobao.com/taolive/main.html?channelType=jingxuan,followTab");
                this.f21620a.finish();
                this.f21620a.overridePendingTransition(0, 0);
            } else if ("jingxuanBtn".equals(objArr[1])) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("spm", "a2141.b52810609.topbar.hometab");
                rbu.I("Hometab", hashMap2);
                voj.a(this.f21620a, "http://h5.m.taobao.com/taolive/main.html?channelType=jingxuan,jingxuan");
                this.f21620a.finish();
                this.f21620a.overridePendingTransition(0, 0);
            }
        }
    }
}
