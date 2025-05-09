package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.nav.Nav;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.TScheduleWVPlugin;
import com.taobao.android.tschedule.parser.expr.edition.EditionInfo;
import com.taobao.android.tschedule.parser.expr.location.LocationInfo;
import com.taobao.android.tschedule.parser.expr.login.LoginInfo;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rms {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements xks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f27477a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(String str, String str2, String str3) {
            this.f27477a = str;
            this.b = str2;
            this.c = str3;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
            }
            return this.c;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ea7dbb5a", new Object[]{this});
            }
            return "com.taobao.taobao";
        }

        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c37e8ec2", new Object[]{this});
            }
            return "taobao_schedule";
        }

        public xp8 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xp8) ipChange.ipc$dispatch("c2208b06", new Object[]{this});
            }
            return rms.a(rms.this);
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
            }
            return this.f27477a;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements xp8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public LoginInfo f27478a;
        public LocationInfo b;
        public EditionInfo c;

        public b(rms rmsVar) {
        }

        @Override // tb.xp8
        public EditionInfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (EditionInfo) ipChange.ipc$dispatch("fc6e9e9c", new Object[]{this});
            }
            if (this.c == null) {
                try {
                    PositionInfo i = o78.i(TScheduleInitialize.b());
                    this.c = new EditionInfo(i.countryName, i.countryCode, i.countryNumCode, i.languageCode, i.actualLanguageCode, i.currencyCode, i.hngCookie, i.cityName, i.cityId, i.area, i.editionCode, i.isVillageUser);
                } catch (Throwable th) {
                    zdh.b("TS.ExprDataProvider", "get cahce location error", th);
                }
            }
            return this.c;
        }

        @Override // tb.xp8
        public LocationInfo getLocation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocationInfo) ipChange.ipc$dispatch("9ff8a3b7", new Object[]{this});
            }
            if (this.b == null) {
                try {
                    TBLocationDTO d = TBLocationClient.d();
                    this.b = new LocationInfo(d.provinceCode, d.provinceName, d.cityCode, d.cityName, d.areaCode, d.areaName, d.longitude, d.latitude, String.valueOf(d.altitude), d.address, String.valueOf(d.timeStamp), String.valueOf(d.accuracy), d.countryCode, d.countryName, null);
                } catch (Throwable th) {
                    zdh.b("TS.ExprDataProvider", "get cahce location error", th);
                }
            }
            return this.b;
        }

        @Override // tb.xp8
        public LoginInfo getLoginInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("e9a57aad", new Object[]{this});
            }
            if (this.f27478a == null) {
                try {
                    this.f27478a = new LoginInfo(Login.getUserId(), Login.getOldUserId(), Login.getUserName(), Login.getNick(), Login.getOldNick());
                } catch (Throwable th) {
                    zdh.b("TS.ExprDataProvider", "prepare LoginInfo error", th);
                }
            }
            return this.f27478a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Nav.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(rms rmsVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Nav.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(rms rmsVar) {
        }
    }

    static {
        t2o.a(329252905);
    }

    public static /* synthetic */ xp8 a(rms rmsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xp8) ipChange.ipc$dispatch("aa77a0a6", new Object[]{rmsVar});
        }
        return rmsVar.b();
    }

    public final xp8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xp8) ipChange.ipc$dispatch("acc10c91", new Object[]{this});
        }
        return new b(this);
    }

    public void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ums.c("TScheduleLauncher init");
        fsw.i("TScheduleWVPlugin", TScheduleWVPlugin.class, false);
        String valueOf = String.valueOf(hashMap.get("deviceId"));
        if (TScheduleInitialize.k(application, new a(String.valueOf(hashMap.get("ttid")), valueOf, valueOf))) {
            d();
            ums.b("TScheduleLauncher init", new String[0]);
            return;
        }
        ums.b("TScheduleLauncher init", "shutdown");
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cef4e4c", new Object[]{this});
            return;
        }
        try {
            ums.c("registerNavTrigger");
            if (zms.b(wms.SWITCH_KEY_ENABLE_NAV, false)) {
                Nav.registerPriorHooker(new c(this), 2);
                Nav.registerLastPreprocessor(new d(this));
            }
            ums.b("registerNavTrigger", new String[0]);
        } catch (Throwable th) {
            zdh.b("TS.Launcher", "registerNavTrigger error", th);
        }
    }
}
