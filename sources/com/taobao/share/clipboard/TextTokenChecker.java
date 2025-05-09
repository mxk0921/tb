package com.taobao.share.clipboard;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import tb.fwr;
import tb.gtl;
import tb.itl;
import tb.jtl;
import tb.n8t;
import tb.qjp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TextTokenChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = TextTokenChecker.class.getSimpleName();
    public final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final ShareReflowBizConfig f11735a = (ShareReflowBizConfig) JSON.parseObject(qjp.a("android_share", "newsharecheck"), ShareReflowBizConfig.class);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ShareReflowBizConfig implements Serializable {
        @JSONField(name = "regexList")
        public List<String> list;
        @JSONField(name = "path")
        public String path;

        static {
            t2o.a(665845768);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum VerifyMode {
        judgeTP,
        regex,
        passed;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(VerifyMode verifyMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/clipboard/TextTokenChecker$VerifyMode");
        }

        public static VerifyMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VerifyMode) ipChange.ipc$dispatch("89bae651", new Object[]{str});
            }
            return (VerifyMode) Enum.valueOf(VerifyMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends AsyncTask<String, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11736a;
        public final /* synthetic */ VerifyMode b;
        public final /* synthetic */ e c;

        public a(String str, VerifyMode verifyMode, e eVar) {
            this.f11736a = str;
            this.b = verifyMode;
            this.c = eVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/clipboard/TextTokenChecker$1");
        }

        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("523c617", new Object[]{this, strArr});
            }
            TextTokenChecker.a(TextTokenChecker.this, this.f11736a, this.b, this.c);
            return Boolean.TRUE;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements jtl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11737a;
        public final /* synthetic */ e b;

        public b(String str, e eVar) {
            this.f11737a = str;
            this.b = eVar;
        }

        @Override // tb.jtl
        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fada2", new Object[]{this, new Boolean(z)});
                return;
            }
            AppMonitor.Alarm.commitSuccess("share", "judgepassword", this.f11737a);
            TextTokenChecker.b(TextTokenChecker.this, z, this.b);
        }

        @Override // tb.jtl
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5ef93f0", new Object[]{this, str, str2});
                return;
            }
            AppMonitor.Alarm.commitFail("share", "judgepassword", str, str2, this.f11737a);
            TextTokenChecker.b(TextTokenChecker.this, false, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11738a;
        public final /* synthetic */ e b;

        public c(boolean z, e eVar) {
            this.f11738a = z;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String c = TextTokenChecker.c();
            TLog.logd(c, "isPassword : " + this.f11738a);
            ((gtl.b) this.b).a(Boolean.valueOf(this.f11738a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$share$clipboard$TextTokenChecker$VerifyMode;

        static {
            int[] iArr = new int[VerifyMode.values().length];
            $SwitchMap$com$taobao$share$clipboard$TextTokenChecker$VerifyMode = iArr;
            try {
                iArr[VerifyMode.judgeTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$share$clipboard$TextTokenChecker$VerifyMode[VerifyMode.passed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$share$clipboard$TextTokenChecker$VerifyMode[VerifyMode.regex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
    }

    static {
        t2o.a(665845763);
    }

    public static /* synthetic */ void a(TextTokenChecker textTokenChecker, String str, VerifyMode verifyMode, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de04be6", new Object[]{textTokenChecker, str, verifyMode, eVar});
        } else {
            textTokenChecker.g(str, verifyMode, eVar);
        }
    }

    public static /* synthetic */ void b(TextTokenChecker textTokenChecker, boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9674bcf3", new Object[]{textTokenChecker, new Boolean(z), eVar});
        } else {
            textTokenChecker.e(z, eVar);
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return c;
    }

    public final boolean d(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f395ad3e", new Object[]{this, str, eVar})).booleanValue();
        }
        TLog.logd(c, "judgeTaoPassword");
        itl.a().b(ShareBizAdapter.getInstance().getAppEnv().getApplication(), str, new b(str, eVar));
        return false;
    }

    public final void e(boolean z, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82bc1f2", new Object[]{this, new Boolean(z), eVar});
        } else if (eVar != null) {
            this.b.post(new c(z, eVar));
        }
    }

    public void h(String str, e eVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41144b28", new Object[]{this, str, eVar});
        } else if (!TextUtils.isEmpty(str) && eVar != null) {
            ShareReflowBizConfig shareReflowBizConfig = this.f11735a;
            if (shareReflowBizConfig != null) {
                str2 = shareReflowBizConfig.path;
            } else {
                str2 = "0";
            }
            VerifyMode verifyMode = VerifyMode.judgeTP;
            if (!"0".equals(str2)) {
                if ("2".equals(str2)) {
                    verifyMode = VerifyMode.regex;
                } else if ("3".equals(str2)) {
                    verifyMode = VerifyMode.passed;
                }
            }
            new a(str, verifyMode, eVar).execute(str);
        }
    }

    public final boolean f(String str) {
        List<String> list;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f0d2cd6", new Object[]{this, str})).booleanValue();
        }
        TLog.logd(c, "regexCheck");
        ShareReflowBizConfig shareReflowBizConfig = this.f11735a;
        if (!(shareReflowBizConfig == null || (list = shareReflowBizConfig.list) == null)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext() && !(z = n8t.c(it.next(), str))) {
            }
        }
        return z;
    }

    public final void g(String str, VerifyMode verifyMode, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe298941", new Object[]{this, str, verifyMode, eVar});
            return;
        }
        String str2 = c;
        fwr.a(str2, "verify mode : " + verifyMode.name());
        int i = d.$SwitchMap$com$taobao$share$clipboard$TextTokenChecker$VerifyMode[verifyMode.ordinal()];
        if (i == 1) {
            d(str, eVar);
        } else if (i == 2) {
            e(true, eVar);
        } else if (i != 3) {
            e(false, eVar);
        } else {
            e(f(str), eVar);
        }
    }
}
