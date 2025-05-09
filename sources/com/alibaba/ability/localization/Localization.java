package com.alibaba.ability.localization;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.ability.localization.constants.Location;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.dno;
import tb.njg;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class Localization {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_MODULE = "Localization";
    public static volatile Language e;
    public static volatile String f;
    public static final Localization INSTANCE = new Localization();

    /* renamed from: a  reason: collision with root package name */
    public static final Object f2071a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final njg d = kotlin.a.b(Localization$mainHandler$2.INSTANCE);
    public static final njg g = kotlin.a.b(Localization$localeChangeListeners$2.INSTANCE);
    public static final njg h = kotlin.a.b(Localization$syncLocaleChangeListeners$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void onChange(Language language, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface b {
        void onChange(Language language, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f2072a;
        public final /* synthetic */ Language b;
        public final /* synthetic */ String c;

        public c(a aVar, Language language, String str) {
            this.f2072a = aVar;
            this.b = language;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f2072a.onChange(this.b, this.c);
            } catch (Throwable th) {
                TLog.loge(Localization.LOG_MODULE, Localization.LOG_MODULE, "dispatch locale change event, " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(82837507);
    }

    @JvmStatic
    public static final void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("304b43bc", new Object[]{aVar});
        } else if (aVar != null) {
            Localization localization = INSTANCE;
            if (!localization.i().contains(aVar)) {
                localization.i().add(aVar);
            }
        }
    }

    @JvmStatic
    public static final void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("571aabdc", new Object[]{bVar});
        } else if (bVar != null) {
            Localization localization = INSTANCE;
            if (!localization.l().contains(bVar)) {
                localization.l().add(bVar);
            }
        }
    }

    @JvmStatic
    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4130056", new Object[]{str});
        } else if (str != null) {
            t(h(), str);
        }
    }

    @JvmStatic
    public static final Language h() {
        Language language;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("aa13e5be", new Object[0]);
        }
        Language language2 = e;
        if (language2 != null) {
            return language2;
        }
        Context b2 = LocalizationManager.INSTANCE.b();
        if (b2 != null) {
            synchronized (b) {
                Language language3 = e;
                if (language3 != null) {
                    language = language3;
                } else {
                    language = Language.Companion.a(dno.INSTANCE.a(b2));
                    if (language == null) {
                        language = Language.SIMPLIFIED_CHINESE;
                    }
                    e = language;
                }
            }
            if (language != null) {
                return language;
            }
        }
        TLog.loge(LOG_MODULE, LOG_MODULE, "context is null, return default language: SIMPLIFIED_CHINESE");
        return Language.SIMPLIFIED_CHINESE;
    }

    @JvmStatic
    public static final String j() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d853caae", new Object[0]);
        }
        String str2 = f;
        if (str2 != null) {
            return str2;
        }
        Context b2 = LocalizationManager.INSTANCE.b();
        if (b2 != null) {
            synchronized (c) {
                try {
                    String str3 = f;
                    if (str3 != null) {
                        str = str3;
                    } else {
                        dno dnoVar = dno.INSTANCE;
                        String b3 = dnoVar.b(b2);
                        if (b3 != null) {
                            if (b3.length() <= 0) {
                                b3 = null;
                            }
                            if (b3 != null) {
                                f = b3;
                                str = b3;
                            }
                        }
                        b3 = dnoVar.c(b2);
                        dnoVar.e(b2, b3);
                        TLog.loge(LOG_MODULE, LOG_MODULE, "migrate edition switcher location data, edition code: " + b3);
                        f = b3;
                        str = b3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str != null) {
                return str;
            }
        }
        TLog.loge(LOG_MODULE, LOG_MODULE, "context is null, return default location: CN");
        return Location.CN.getCode();
    }

    @JvmStatic
    public static final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db403aa7", new Object[0])).booleanValue();
        }
        return INSTANCE.m(j());
    }

    @JvmStatic
    public static final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6a02bc1", new Object[0])).booleanValue();
        }
        if (p() || INSTANCE.m(j())) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eef4a576", new Object[0])).booleanValue();
        }
        if (h() == Language.SIMPLIFIED_CHINESE) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final String q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f754730", new Object[]{new Integer(i)});
        }
        String str = null;
        try {
            LocalizationManager localizationManager = LocalizationManager.INSTANCE;
            Context b2 = localizationManager.b();
            if (b2 != null) {
                localizationManager.i(b2, h());
                Resources resources = b2.getResources();
                if (resources != null) {
                    str = resources.getString(i);
                }
            }
        } catch (Exception e2) {
            TLog.loge(LOG_MODULE, LOG_MODULE, String.valueOf(e2.getMessage()));
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    @JvmStatic
    public static final String r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c25c8543", new Object[]{str});
        }
        ckf.g(str, "name");
        LocalizationManager localizationManager = LocalizationManager.INSTANCE;
        Context b2 = localizationManager.b();
        if (b2 != null) {
            localizationManager.i(b2, h());
            Resources resources = b2.getResources();
            String str2 = null;
            if (resources != null) {
                try {
                    int identifier = resources.getIdentifier(str, "string", b2.getPackageName());
                    if (identifier != 0) {
                        str2 = resources.getString(identifier);
                    }
                } catch (Exception e2) {
                    TLog.loge(LOG_MODULE, LOG_MODULE, String.valueOf(e2.getMessage()));
                }
            }
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    @JvmStatic
    public static final void s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb491f", new Object[]{aVar});
        } else if (aVar != null) {
            INSTANCE.i().remove(aVar);
        }
    }

    @JvmStatic
    public static final void t(Language language, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1496fe40", new Object[]{language, str});
        } else if (language == null || str == null || str.length() == 0) {
            TLog.loge(LOG_MODULE, LOG_MODULE, "setLocale fail, language is null or location is null");
        } else {
            synchronized (f2071a) {
                try {
                    Language h2 = h();
                    String j = j();
                    Localization localization = INSTANCE;
                    Language f2 = localization.f(language, str);
                    if (h2 == f2) {
                        if (!ckf.b(j, str)) {
                        }
                        xhv xhvVar = xhv.INSTANCE;
                    }
                    localization.c(f2);
                    localization.e(str);
                    localization.g(f2, str);
                    xhv xhvVar2 = xhv.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(Language language) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1c3daa", new Object[]{this, language});
        } else if (h() != language) {
            TLog.loge(LOG_MODULE, LOG_MODULE, "change language from: " + h() + " to " + language);
            e = language;
            dno dnoVar = dno.INSTANCE;
            LocalizationManager localizationManager = LocalizationManager.INSTANCE;
            dnoVar.d(localizationManager.b(), language.getTag());
            localizationManager.a(localizationManager.b(), language);
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d579a2", new Object[]{this, str});
        } else if (!ckf.b(j(), str)) {
            TLog.loge(LOG_MODULE, LOG_MODULE, "change location from: " + j() + " to " + str);
            f = str;
            dno.INSTANCE.e(LocalizationManager.INSTANCE.b(), str);
        }
    }

    public final Language f(Language language, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Language) ipChange.ipc$dispatch("ca1df285", new Object[]{this, language, str});
        }
        if (m(str)) {
            return Language.SIMPLIFIED_CHINESE;
        }
        return language;
    }

    public final void g(Language language, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e93fea6", new Object[]{this, language, str});
            return;
        }
        Iterator<b> it = l().iterator();
        while (it.hasNext()) {
            try {
                it.next().onChange(language, str);
            } catch (Throwable th) {
                TLog.loge(LOG_MODULE, LOG_MODULE, "dispatch sync locale change event, " + th.getMessage());
            }
        }
        Iterator<a> it2 = i().iterator();
        while (it2.hasNext()) {
            k().post(new c(it2.next(), language, str));
        }
    }

    public final ConcurrentLinkedQueue<a> i() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("72c985d6", new Object[]{this});
        } else {
            value = g.getValue();
        }
        return (ConcurrentLinkedQueue) value;
    }

    public final Handler k() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        } else {
            value = d.getValue();
        }
        return (Handler) value;
    }

    public final ConcurrentLinkedQueue<b> l() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("e97cc11", new Object[]{this});
        } else {
            value = h.getValue();
        }
        return (ConcurrentLinkedQueue) value;
    }

    public final boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50f28466", new Object[]{this, str})).booleanValue();
        }
        return ckf.b(str, Location.CN.getCode());
    }
}
