package com.taobao.infoflow.core.subservice.biz.experiencecheck.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import tb.cfc;
import tb.get;
import tb.jrv;
import tb.oga;
import tb.t2o;
import tb.uve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UserExperienceCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public jrv f10648a = null;
    public b b = null;
    public final cfc c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum ExperienceError {
        ABNORMAL_TEXT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ExperienceError experienceError, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/biz/experiencecheck/impl/UserExperienceCheck$ExperienceError");
        }

        public static ExperienceError valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExperienceError) ipChange.ipc$dispatch("9fb9fb7", new Object[]{str});
            }
            return (ExperienceError) Enum.valueOf(ExperienceError.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$infoflow$protocol$subservice$biz$IUserExperienceCheckService$CheckOccasion;

        static {
            int[] iArr = new int[IUserExperienceCheckService.CheckOccasion.values().length];
            $SwitchMap$com$taobao$infoflow$protocol$subservice$biz$IUserExperienceCheckService$CheckOccasion = iArr;
            try {
                iArr[IUserExperienceCheckService.CheckOccasion.EXPOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$infoflow$protocol$subservice$biz$IUserExperienceCheckService$CheckOccasion[IUserExperienceCheckService.CheckOccasion.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private BaseSectionModel<?> f10649a;
        private IUserExperienceCheckService.CheckOccasion b;

        static {
            t2o.a(486539525);
        }

        private b() {
        }

        public void a(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7ca74d9", new Object[]{this, baseSectionModel, checkOccasion});
                return;
            }
            this.f10649a = baseSectionModel;
            this.b = checkOccasion;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (UserExperienceCheck.a(UserExperienceCheck.this) != null) {
                String c = UserExperienceCheck.a(UserExperienceCheck.this).c();
                int i = a.$SwitchMap$com$taobao$infoflow$protocol$subservice$biz$IUserExperienceCheckService$CheckOccasion[this.b.ordinal()];
                if (i != 1) {
                    if (i == 2 && c != null && c.contains("click")) {
                        UserExperienceCheck.b(UserExperienceCheck.this, this.f10649a);
                        UserExperienceCheck.c(UserExperienceCheck.this);
                    }
                } else if (c != null && c.contains("expose")) {
                    UserExperienceCheck.b(UserExperienceCheck.this, this.f10649a);
                    UserExperienceCheck.c(UserExperienceCheck.this);
                }
            }
        }

        public /* synthetic */ b(UserExperienceCheck userExperienceCheck, a aVar) {
            this();
        }
    }

    static {
        t2o.a(486539522);
    }

    public UserExperienceCheck(cfc cfcVar) {
        this.c = cfcVar;
    }

    public static /* synthetic */ jrv a(UserExperienceCheck userExperienceCheck) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrv) ipChange.ipc$dispatch("ab88b8ae", new Object[]{userExperienceCheck});
        }
        return userExperienceCheck.f10648a;
    }

    public static /* synthetic */ void b(UserExperienceCheck userExperienceCheck, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956c2435", new Object[]{userExperienceCheck, baseSectionModel});
        } else {
            userExperienceCheck.e(baseSectionModel);
        }
    }

    public static /* synthetic */ void c(UserExperienceCheck userExperienceCheck) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b45a6e", new Object[]{userExperienceCheck});
        } else {
            userExperienceCheck.d();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e12c92e2", new Object[]{this});
        }
    }

    public final void e(BaseSectionModel<?> baseSectionModel) {
        jrv jrvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28f6e9", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel != null && (jrvVar = this.f10648a) != null && jrvVar.b() != null) {
            String b2 = this.f10648a.b();
            String string = baseSectionModel.getExt().getString(oga.KEY_MAIN_TITLE);
            if (string != null && string.contains(b2)) {
                g(baseSectionModel, ExperienceError.ABNORMAL_TEXT, string);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            get.a().j(this.b);
        }
    }

    public final void g(BaseSectionModel<?> baseSectionModel, ExperienceError experienceError, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3e6a82", new Object[]{this, baseSectionModel, experienceError, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", (Object) experienceError.toString());
        jSONObject.put("originText", (Object) str);
        JSONObject args = baseSectionModel.getArgs();
        if (args != null) {
            jSONObject.put("recIndex", (Object) args.getString("recIndex"));
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            jSONObject.put("cardFeatureId", (Object) ext.getString("cardFeatureId"));
        }
        uve.a("Page_Home", 19997, "client_experience_check", "", "", jSONObject.toString());
    }

    public void h(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f2e776", new Object[]{this, baseSectionModel});
        } else {
            oga.b(baseSectionModel);
        }
    }

    public void i(jrv jrvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83878d27", new Object[]{this, jrvVar});
        } else {
            this.f10648a = jrvVar;
        }
    }

    public void j(BaseSectionModel<?> baseSectionModel, IUserExperienceCheckService.CheckOccasion checkOccasion) {
        jrv jrvVar;
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99037f", new Object[]{this, baseSectionModel, checkOccasion});
        } else if (baseSectionModel != null && (jrvVar = this.f10648a) != null && jrvVar.a() && (ext = baseSectionModel.getExt()) != null && !TextUtils.equals("true", ext.getString("isCardChecked"))) {
            ext.put("isCardChecked", (Object) "true");
            if (this.b == null) {
                this.b = new b(this, null);
            }
            this.b.a(baseSectionModel, checkOccasion);
            get.a().e(this.b);
        }
    }
}
