package com.taobao.android.editionswitcher.boarding;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.api.EditionApi;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.nav.Nav;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.schedule.ViewProxy;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.StringUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.rah;
import tb.t2o;
import tb.tza;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.editionswitcher.boarding.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class RunnableC0407a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f7623a;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.editionswitcher.boarding.a$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class View$OnClickListenerC0408a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f7624a;

            public View$OnClickListenerC0408a(AlertDialog alertDialog) {
                this.f7624a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "i18nBlackIPPopShow");
                Localization.t(Language.SIMPLIFIED_CHINESE, Localization.j());
                this.f7624a.dismiss();
                Nav.from(RunnableC0407a.this.f7623a).withFlags(32768).toUri("https://m.taobao.com");
            }
        }

        public RunnableC0407a(Activity activity) {
            this.f7623a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AlertDialog create = new AlertDialog.Builder(this.f7623a, R.style.OvsBlacklistDialog).create();
            View inflate = LayoutInflater.from(this.f7623a).inflate(R.layout.ovs_ip_blacklist_dialog, (ViewGroup) null);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.ovs_refresh_btn), new View$OnClickListenerC0408a(create));
            create.setCancelable(false);
            create.setView(inflate);
            create.show();
            TBS.Ext.commitEvent("Page_LocalBoarding", 2201, "i18nBlackIPPopShow");
            AppMonitor.Alarm.commitSuccess("Page_LocalBoarding", "i18nBlackIPPopShow");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7625a;

        public b(int i) {
            this.f7625a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/I18nDialogUtils$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f7625a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7626a;

        public c(int i) {
            this.f7626a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/I18nDialogUtils$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, -this.f7626a, view.getWidth(), view.getHeight(), this.f7626a);
            outline.offset(0, this.f7626a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7627a;

        public d(int i) {
            this.f7627a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/I18nDialogUtils$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.f7627a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f7627a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7628a;

        public e(int i) {
            this.f7628a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/I18nDialogUtils$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(-this.f7628a, 0, view.getWidth(), view.getHeight(), this.f7628a);
            outline.offset(this.f7628a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7629a;

        public f(int i) {
            this.f7629a = i;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/I18nDialogUtils$6");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth() + this.f7629a, view.getHeight(), this.f7629a);
            outline.offset(-this.f7629a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7630a;
        public final /* synthetic */ Activity b;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.editionswitcher.boarding.a$g$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class View$OnClickListenerC0409a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f7631a;
            public final /* synthetic */ LocaleModel.HomePopData c;

            public View$OnClickListenerC0409a(LocaleModel.HomePopData homePopData, AlertDialog alertDialog) {
                this.c = homePopData;
                this.f7631a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop", "", "", "site=" + g.this.f7630a + ",lang=en_US");
                if (StringUtil.isEmpty(this.c.clientLang)) {
                    str = "en";
                } else {
                    str = this.c.clientLang;
                }
                Localization.t(rah.b(str), g.this.f7630a);
                this.f7631a.dismiss();
                Nav.from(g.this.b).withFlags(32768).toUri("https://m.taobao.com");
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f7632a;

            public b(AlertDialog alertDialog) {
                this.f7632a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop", "", "", "site=" + g.this.f7630a + ",lang=zh_CN");
                Localization.t(Language.SIMPLIFIED_CHINESE, g.this.f7630a);
                this.f7632a.dismiss();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AlertDialog f7633a;

            public c(g gVar, AlertDialog alertDialog) {
                this.f7633a = alertDialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                TBS.Ext.commitEvent("Page_Home", 2101, "htao_button-multiLangPop-close");
                this.f7633a.dismiss();
            }
        }

        public g(String str, Activity activity) {
            this.f7630a = str;
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LocaleModel.HomePopData homePopData = com.taobao.android.editionswitcher.boarding.d.h.homePops.get(this.f7630a);
            if (homePopData == null) {
                TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "showPopNoAllow", this.f7630a);
                return;
            }
            try {
                AlertDialog create = new AlertDialog.Builder(this.b, R.style.OvsBlacklistDialog).create();
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.b).inflate(R.layout.ovs_i18n_guild_dialog, (ViewGroup) null);
                a.b(relativeLayout, a.a(this.b, 16), a.a(this.b, 16), 0.0f, 0.0f);
                ((TUrlImageView) relativeLayout.findViewById(R.id.header_img)).setImageUrl(homePopData.headerImg);
                ((TextView) relativeLayout.findViewById(R.id.title)).setText(homePopData.title);
                ((TextView) relativeLayout.findViewById(R.id.tx_choose_en)).setText(homePopData.foreignButtonTitle);
                ((TextView) relativeLayout.findViewById(R.id.tx_choose_zh)).setText(homePopData.chineseButtonTitle);
                ViewProxy.setOnClickListener(relativeLayout.findViewById(R.id.btn_choose_en), new View$OnClickListenerC0409a(homePopData, create));
                ViewProxy.setOnClickListener(relativeLayout.findViewById(R.id.btn_choose_zh), new b(create));
                ViewProxy.setOnClickListener(relativeLayout.findViewById(R.id.close_btn), new c(this, create));
                create.setCancelable(false);
                create.setView(relativeLayout);
                create.show();
                tza.f(EditionApi.f7610a, "0");
                TLog.loge("EditionSwitcher", "i18nboarding show i18n guid pop ");
                TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "ShowI18nPop");
                AppMonitor.Alarm.commitSuccess("Page_Home", "htao_show-multiLangPop");
            } catch (Exception e) {
                TLog.loge("EditionSwitcher", "showI18nGuildDialog exception : " + e);
                AppMonitor.Alarm.commitSuccess("Page_Home", "htao_show-multiLangPop");
            }
        }
    }

    static {
        t2o.a(456130617);
    }

    public static float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a48f720", new Object[]{context, new Integer(i)})).floatValue();
        }
        return (context.getResources().getDisplayMetrics().density * i) + 0.5f;
    }

    public static void b(ViewGroup viewGroup, float f2, float f3, float f4, float f5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5edc5a", new Object[]{viewGroup, new Float(f2), new Float(f3), new Float(f4), new Float(f5)});
        } else if (Build.VERSION.SDK_INT >= 22) {
            int i = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
            if (i == 0 && f2 == f4 && f4 == f5) {
                viewGroup.setOutlineProvider(new b((int) f2));
                viewGroup.setClipToOutline(true);
            } else if (i == 0 && f4 == 0.0f && f5 == 0.0f) {
                viewGroup.setOutlineProvider(new c((int) f2));
                viewGroup.setClipToOutline(true);
            } else if (f4 == f5 && f2 == 0.0f && f3 == 0.0f) {
                viewGroup.setOutlineProvider(new d((int) f4));
                viewGroup.setClipToOutline(true);
            } else if (f2 == f4 && f3 == 0.0f && f5 == 0.0f) {
                viewGroup.setOutlineProvider(new e((int) f2));
                viewGroup.setClipToOutline(true);
            } else if (f3 == f5 && f2 == 0.0f && f4 == 0.0f) {
                viewGroup.setOutlineProvider(new f((int) f3));
                viewGroup.setClipToOutline(true);
            }
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e05db0d8", new Object[]{str})).booleanValue();
        }
        LocaleModel localeModel = com.taobao.android.editionswitcher.boarding.d.h;
        if (localeModel == null || localeModel.homePops == null || com.taobao.android.editionswitcher.boarding.d.i) {
            return false;
        }
        return com.taobao.android.editionswitcher.boarding.d.h.homePops.containsKey(str);
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("990b2c8f", new Object[0]);
            return;
        }
        Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new RunnableC0407a(currentActivity));
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e5a47f1", new Object[]{str});
        } else if (!com.taobao.android.editionswitcher.boarding.d.i) {
            Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
            if (currentActivity == null) {
                TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "ShowPopNoActivity");
            } else {
                currentActivity.runOnUiThread(new g(str, currentActivity));
            }
        }
    }
}
