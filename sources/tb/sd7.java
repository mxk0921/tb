package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopSetting;
import mtopsdk.mtop.intf.MtopUnitStrategy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile sd7 f;

    /* renamed from: a  reason: collision with root package name */
    public Application f27966a;
    public Context b;
    public String c;
    public String d;
    public int e = 0;

    public static sd7 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sd7) ipChange.ipc$dispatch("a98a195f", new Object[0]);
        }
        if (f == null) {
            synchronized (sd7.class) {
                try {
                    if (f == null) {
                        f = new sd7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public Application a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this});
        }
        return this.f27966a;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        ggh.d("mApplication: " + this.f27966a + ", mContext: " + this.b);
        Application application = this.f27966a;
        return application != null ? application : this.b.getApplicationContext();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4565d855", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff93a260", new Object[]{this});
        }
        return this.c;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        ggh.d("mTtid: " + this.d);
        return this.d;
    }

    public void g(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        this.f27966a = application;
        o8l.d(application);
    }

    public void h(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        ggh.d("init application " + application + ", params" + hashMap);
        this.f27966a = application;
        l(hashMap);
        i(hashMap);
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.b = context;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2c0d55", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void l(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ea9f7f", new Object[]{this, hashMap});
        } else {
            this.c = (String) hashMap.get("process");
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2801ee", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void i(HashMap<String, Object> hashMap) {
        int i;
        String str;
        Exception e;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9749b503", new Object[]{this, hashMap});
        } else if (o8l.e()) {
            String str2 = null;
            try {
                str2 = (String) hashMap.get("appVersion");
                try {
                    str = (String) hashMap.get("ttid");
                } catch (Exception e2) {
                    e = e2;
                    str = null;
                }
                try {
                    obj = hashMap.get(OConstant.LAUNCH_ENVINDEX);
                } catch (Exception e3) {
                    e = e3;
                    str2 = str2;
                    ggh.d("initQMtop: " + e.getMessage());
                    i = 0;
                    MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
                    MtopSetting.setAppVersion(Mtop.Id.INNER, str2);
                    MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
                    k(i);
                    m(str);
                }
            } catch (Exception e4) {
                e = e4;
                str = null;
            }
            if (obj != null) {
                i = ((Integer) obj).intValue();
                MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
                MtopSetting.setAppVersion(Mtop.Id.INNER, str2);
                MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
                k(i);
                m(str);
            }
            i = 0;
            MtopSetting.setAppKeyIndex(Mtop.Id.INNER, 0, 2);
            MtopSetting.setAppVersion(Mtop.Id.INNER, str2);
            MtopSetting.setMtopDomain(Mtop.Id.INNER, MtopUnitStrategy.GUIDE_ONLINE_DOMAIN, MtopUnitStrategy.GUIDE_PRE_DOMAIN, MtopUnitStrategy.GUIDE_DAILY_DOMAIN);
            k(i);
            m(str);
        }
    }
}
