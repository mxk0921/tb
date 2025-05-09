package com.taobao.android.revisionswitch.core;

import android.provider.Settings;
import android.taobao.windvane.extra.uc.WVHeaderManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.bud;
import tb.cud;
import tb.obk;
import tb.wnq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TrackManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "guangguangGreyHosts";
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final List<String> d = new ArrayList<String>() { // from class: com.taobao.android.revisionswitch.core.TrackManager.1
        {
            add("tesi.m.taobao.com");
            add("tesi.wapa.taobao.com");
            add("tesi-assets.m.taobao.com");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public WVHeaderManager.CustomRequestHeader f9294a = null;
    public final wnq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cud f9295a;

        public a(TrackManager trackManager, cud cudVar) {
            this.f9295a = cudVar;
        }

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            try {
                if (this.f9295a.c()) {
                    str = this.f9295a.e().b();
                } else {
                    str = "";
                }
                hashMap.put("dosa_revision_ab", str);
                hashMap.put("alwaysFinishActivities", Integer.valueOf(Settings.Global.getInt(this.f9295a.getContext().getContentResolver(), "always_finish_activities", 0)));
            } catch (Exception unused) {
            }
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            String customConfig;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                if (TrackManager.ORANGE_GROUP_NAME.equals(str) && (customConfig = OrangeConfig.getInstance().getCustomConfig(str, null)) != null) {
                    TrackManager.a(TrackManager.this).h(customConfig);
                }
            } catch (Throwable th) {
                TLog.loge("TrackManager", "orange update Exception: " + th.getMessage());
            }
        }
    }

    public TrackManager(wnq wnqVar) {
        this.b = wnqVar;
    }

    public static /* synthetic */ wnq a(TrackManager trackManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnq) ipChange.ipc$dispatch("b07ed79c", new Object[]{trackManager});
        }
        return trackManager.b;
    }

    public final WVHeaderManager.CustomRequestHeader b(wnq wnqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVHeaderManager.CustomRequestHeader) ipChange.ipc$dispatch("144cc831", new Object[]{this, wnqVar});
        }
        if (this.f9294a == null) {
            List<String> e = wnqVar.e();
            if (e == null || e.size() == 0) {
                e = d;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("x-gg-hit-grey", "true");
            this.f9294a = new WVHeaderManager.CustomRequestHeader(e, hashMap);
        }
        return this.f9294a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f58d10e5", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME}, new b(), true);
        }
    }

    public void d(cud cudVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11766a3c", new Object[]{this, cudVar});
        } else if (cudVar != null) {
            try {
                String d2 = cudVar.d("elderHome");
                if (d2 != null) {
                    MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "elderHome", d2);
                }
                MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-social-attr", cudVar.a());
                if (!TBRevisionSwitchManager.e) {
                    if (cudVar.c()) {
                        UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty("dosaab", cudVar.e().b());
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().removeGlobalProperty("dosaab");
                    }
                }
                if (!TBRevisionSwitchManager.e && (!cudVar.e().c().c().b(bud.KEY_NEW_CONTENT_ENABLE) || !cudVar.b().b().c().c(bud.KEY_NEW_CONTENT_ENABLE, true))) {
                    WVHeaderManager.getInstance().unregisterCustomRequestHeader(b(this.b));
                    if (!TBRevisionSwitchManager.e && c.compareAndSet(false, true)) {
                        TCrashSDK.instance().addJvmUncaughtCrashListener(new a(this, cudVar));
                        return;
                    }
                }
                WVHeaderManager.getInstance().registerCustomRequestHeader(b(this.b));
                if (!TBRevisionSwitchManager.e) {
                }
            } catch (Throwable th) {
                TLog.loge("TrackManager", "track error: " + th.getMessage());
            }
        }
    }
}
