package com.taobao.android.revisionswitch;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.core.TrackManager;
import com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch;
import com.taobao.android.revisionswitch.windvane.RevisionSwitchModule;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.json.JSONObject;
import tb.bmp;
import tb.bud;
import tb.bvr;
import tb.fsw;
import tb.s0r;
import tb.wnq;
import tb.xs7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBRevisionSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_REVISION_SWITCH_CHANGE = "taobao.action.ACTION_REVISION_SWITCH_CHANGE";
    public static final int DO_NOT_NOTIFY = 0;
    public static final int NOTIFY_BACKGROUND = 2;
    public static final int NOTIFY_IMMEDIATELY = 1;
    public static boolean e = true;
    public static TBRevisionSwitchManager f;
    public static bvr g;

    /* renamed from: a  reason: collision with root package name */
    public s0r f9293a;
    public wnq b;
    public Context c;
    public TrackManager d;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface NotifyType {
    }

    public static TBRevisionSwitchManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBRevisionSwitchManager) ipChange.ipc$dispatch("7127c260", new Object[0]);
        }
        if (e) {
            if (g == null) {
                synchronized (TBRevisionSwitchManager.class) {
                    try {
                        if (g == null) {
                            g = new bvr();
                            TLog.loge("RevisionSwitch", "TaoBaoVersionManager", "use Opt TBRevisionSwitchManagerB ");
                        }
                    } finally {
                    }
                }
            }
            return g;
        }
        if (f == null) {
            synchronized (TBRevisionSwitchManager.class) {
                try {
                    if (f == null) {
                        f = new TBRevisionSwitchManager();
                        TLog.loge("RevisionSwitch", "TaoBaoVersionManager", "use TBRevisionSwitchManager");
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdaa2c3", new Object[]{this})).booleanValue();
        }
        s0r s0rVar = this.f9293a;
        if (s0rVar == null || s0rVar.e() == null) {
            return false;
        }
        return true;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        if (a()) {
            return this.f9293a.e().b();
        }
        return "";
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61303a21", new Object[]{this, str})).booleanValue();
        }
        s0r s0rVar = this.f9293a;
        if (s0rVar == null) {
            return false;
        }
        return s0rVar.h(str);
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c36a30b3", new Object[]{this, str});
        }
        return f(str, false);
    }

    public String f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d1a0a99", new Object[]{this, str, new Boolean(z)});
        }
        if (!a()) {
            return null;
        }
        if (z) {
            String f2 = this.f9293a.f(str);
            TLog.loge("TaoBaoVersionManager", "getSwitch inDisk: key: " + str + "; value: " + f2);
            return f2;
        }
        String d = this.f9293a.d(str);
        TLog.loge("TaoBaoVersionManager", "getSwitch not inDisk: key: " + str + "; value: " + d);
        return d;
    }

    public final void h(Map<String, Object> map) {
        String str;
        String n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c246e435", new Object[]{this, map});
            return;
        }
        if (map != null) {
            Object obj = map.get("appVersion");
            if (obj instanceof String) {
                str = (String) obj;
                n = ((bmp) this.b).n("appVersion", null);
                xs7 c = ((bmp) this.b).c();
                if ((n != null || !n.equals(str)) && c == null) {
                    ((bmp) this.b).o("appVersion", str);
                    j("{\"switch\":{\"newFaceEnable\":\"true\",\"newContentEnable\":\"true\"}}");
                }
                return;
            }
        }
        str = null;
        n = ((bmp) this.b).n("appVersion", null);
        xs7 c2 = ((bmp) this.b).c();
        if (n != null) {
        }
        ((bmp) this.b).o("appVersion", str);
        j("{\"switch\":{\"newFaceEnable\":\"true\",\"newContentEnable\":\"true\"}}");
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88074526", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            this.b = new bmp(this.c);
        }
        if (this.d == null) {
            this.d = new TrackManager(this.b);
        }
        this.d.c();
        this.d.d(this.f9293a);
        return true;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697bfe57", new Object[]{this, str});
        } else if (a()) {
            TLog.loge("TaoBaoVersionManager", "insertDosaSwitch : " + str);
            this.f9293a.e().g(str);
        }
    }

    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc99bf", new Object[]{this, jSONObject});
        } else if (a() && jSONObject != null) {
            TLog.loge("TaoBaoVersionManager", "insertDosaSwitchImmediately : " + jSONObject.toString());
            this.f9293a.e().h(jSONObject.toString());
        }
    }

    public void l(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33440eb6", new Object[]{this, map, new Boolean(z), new Integer(i)});
        } else if (a()) {
            TLog.loge("TaoBaoVersionManager", "insertSimpleSwitch: key: " + map);
            this.f9293a.l(map, z, i);
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9fbf7d1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean g(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48838558", new Object[]{this, context, map})).booleanValue();
        }
        this.c = context;
        this.b = new bmp(context);
        wnq wnqVar = this.b;
        TrackManager trackManager = new TrackManager(wnqVar);
        this.d = trackManager;
        this.f9293a = new s0r(context, wnqVar, trackManager);
        h(map);
        this.f9293a.i();
        try {
            fsw.h(JsBridgeRevisionSwitch.NAME, JsBridgeRevisionSwitch.class);
            WXSDKEngine.registerModule(RevisionSwitchModule.MODULE_NAME, RevisionSwitchModule.class);
        } catch (Exception e2) {
            TLog.loge("TaoBaoVersionManager", "registerPlugin exception", e2);
        }
        return true;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93a2d071", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return this.f9293a.h(bud.KEY_NEW_CONTENT_ENABLE);
        }
        return false;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1875c81", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return this.f9293a.h(bud.KEY_NEW_FACE_ENABLE);
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cce4ed82", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return this.f9293a.h(bud.KEY_SUBSCRIBE_ENABLE);
        }
        return false;
    }
}
