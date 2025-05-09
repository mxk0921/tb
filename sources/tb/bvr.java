package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.core.TrackManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.android.revisionswitch.windvane.JsBridgeRevisionSwitch;
import com.taobao.android.revisionswitch.windvane.RevisionSwitchModule;
import com.taobao.tao.log.TLog;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.aak;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bvr extends TBRevisionSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context h;
    public wnq i;
    public TrackManager j;
    public volatile t0r k;

    public bvr() {
        new ConcurrentHashMap();
    }

    public static /* synthetic */ Object ipc$super(bvr bvrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/revisionswitch/TBRevisionSwitchManagerB");
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this});
        }
        return "";
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c36a30b3", new Object[]{this, str});
        }
        return q().g(str);
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public String f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d1a0a99", new Object[]{this, str, new Boolean(z)});
        }
        return q().h(str, z);
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean g(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48838558", new Object[]{this, context, map})).booleanValue();
        }
        this.h = context;
        return true;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88074526", new Object[]{this})).booleanValue();
        }
        synchronized (bvr.class) {
            try {
                if (this.i == null) {
                    this.i = new bmp(this.h);
                }
                if (this.j == null) {
                    this.j = new TrackManager(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.j.c();
        this.j.d(q());
        return true;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697bfe57", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc99bf", new Object[]{this, jSONObject});
        } else {
            aak.b.helper.f();
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public void l(Map<String, String> map, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33440eb6", new Object[]{this, map, new Boolean(z), new Integer(i)});
        } else {
            q().k(map, z, i);
        }
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9fbf7d1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93a2d071", new Object[]{this})).booleanValue();
        }
        if (LocationHelper.c(this.h) || s(this.h)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1875c81", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cce4ed82", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final t0r q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t0r) ipChange.ipc$dispatch("1936c1ef", new Object[]{this});
        }
        if (this.k == null) {
            synchronized (bvr.class) {
                try {
                    if (this.k == null) {
                        if (this.i == null) {
                            this.i = new bmp(this.h);
                        }
                        if (this.j == null) {
                            this.j = new TrackManager(this.i);
                        }
                        this.k = new t0r(this.h, this.i, this.j);
                        this.k.i();
                        r(null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.k;
    }

    public final void r(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656c9617", new Object[]{this, context, map});
            return;
        }
        try {
            fsw.h(JsBridgeRevisionSwitch.NAME, JsBridgeRevisionSwitch.class);
            WXSDKEngine.registerModule(RevisionSwitchModule.MODULE_NAME, RevisionSwitchModule.class);
        } catch (Exception e) {
            TLog.loge("TaoBaoVersionManagerB", "registerPlugin exception", e);
        }
    }

    public final boolean s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e242e25", new Object[]{this, context})).booleanValue();
        }
        return "1".equalsIgnoreCase(e("elderHome"));
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec21e879", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r6.equals(tb.bud.KEY_SUBSCRIBE_ENABLE) == false) goto L_0x0027;
     */
    @Override // com.taobao.android.revisionswitch.TBRevisionSwitchManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.bvr.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "61303a21"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            r1[r2] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -1875777107: goto L_0x0065;
                case 706363092: goto L_0x0059;
                case 744893843: goto L_0x004d;
                case 778421885: goto L_0x0041;
                case 1016654848: goto L_0x0035;
                case 1648521628: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            r0 = -1
            goto L_0x006f
        L_0x0029:
            java.lang.String r0 = "newContentEnable"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0033
            goto L_0x0027
        L_0x0033:
            r0 = 5
            goto L_0x006f
        L_0x0035:
            java.lang.String r0 = "newFaceEnable"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x003f
            goto L_0x0027
        L_0x003f:
            r0 = 4
            goto L_0x006f
        L_0x0041:
            java.lang.String r0 = "newFaceEnableIntl"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004b
            goto L_0x0027
        L_0x004b:
            r0 = 3
            goto L_0x006f
        L_0x004d:
            java.lang.String r0 = "newDiscoveryEnable"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0057
            goto L_0x0027
        L_0x0057:
            r0 = 2
            goto L_0x006f
        L_0x0059:
            java.lang.String r0 = "new2021UIEnable"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0063
            goto L_0x0027
        L_0x0063:
            r0 = 1
            goto L_0x006f
        L_0x0065:
            java.lang.String r1 = "newSubscribeEnable"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x006f
            goto L_0x0027
        L_0x006f:
            switch(r0) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008f;
                case 2: goto L_0x0088;
                case 3: goto L_0x0083;
                case 4: goto L_0x007e;
                case 5: goto L_0x0079;
                default: goto L_0x0072;
            }
        L_0x0072:
            android.content.Context r6 = r5.h
            boolean r6 = com.taobao.android.revisionswitch.utils.LocationHelper.c(r6)
            return r6
        L_0x0079:
            boolean r6 = r5.n()
            return r6
        L_0x007e:
            boolean r6 = r5.o()
            return r6
        L_0x0083:
            boolean r6 = r5.t()
            return r6
        L_0x0088:
            android.content.Context r6 = r5.h
            boolean r6 = com.taobao.android.revisionswitch.utils.LocationHelper.d(r6)
            return r6
        L_0x008f:
            return r2
        L_0x0090:
            boolean r6 = r5.p()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bvr.d(java.lang.String):boolean");
    }
}
