package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.framework.UpdateRuntime;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class suu implements ruu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean sClickbg2Exit;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28287a;
    public hvd b;
    public Application.ActivityLifecycleCallbacks c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements hvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;
        public final /* synthetic */ String val$message;

        public a(String str, npv npvVar) {
            this.val$message = str;
            this.val$action = npvVar;
        }

        @Override // tb.hvd
        public void onTabChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
                return;
            }
            com.taobao.tao.navigation.b q = com.taobao.tao.navigation.a.q(i);
            if (q != null && !df4.blackDialogFragment.contains(q.e())) {
                Log.e("UIConfirmImpl", "show install dialog for current tab:" + q.e());
                com.taobao.tao.navigation.a.K(this);
                if (suu.access$000(suu.this) != null) {
                    UpdateRuntime.getContext().unregisterActivityLifecycleCallbacks(suu.access$000(suu.this));
                }
                Activity activity = com.taobao.tao.navigation.a.o().getCurrentFragment().getActivity();
                if (activity == null) {
                    activity = c21.i();
                }
                if (activity != null) {
                    suu.access$100(suu.this, activity, this.val$message, this.val$action);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;
        public final /* synthetic */ String val$message;

        public b(String str, npv npvVar) {
            this.val$message = str;
            this.val$action = npvVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            Log.e("UIConfirmImpl", "alertForConfirm " + activity.getComponentName().getClassName() + "onresume!");
            if (df4.blackDialogActivity.contains(activity.getClass().getName())) {
                Log.e("UIConfirmImpl", "donot show install dialog, current Activity in blackActivityList:".concat(activity.getClass().getName()));
            } else if (!suu.access$200(suu.this, activity) || ((!"com.taobao.tao.welcome.Welcome".equalsIgnoreCase(activity.getClass().getName()) && !obq.BIZ_NAME.equalsIgnoreCase(activity.getClass().getName())) || !df4.blackDialogFragment.contains(suu.access$300(suu.this)))) {
                UpdateRuntime.getContext().unregisterActivityLifecycleCallbacks(this);
                com.taobao.tao.navigation.a.K(suu.access$400(suu.this));
                suu.access$100(suu.this, activity, this.val$message, this.val$action);
            } else {
                Log.e("UIConfirmImpl", "donot show install dialog, current tab in blackDialogFragment:" + suu.access$300(suu.this));
                com.taobao.tao.navigation.a.h(suu.access$400(suu.this));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;

        public c(npv npvVar) {
            this.val$action = npvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.val$action.onConfirm();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;

        public d(npv npvVar) {
            this.val$action = npvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.val$action.onCancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;

        public e(npv npvVar) {
            this.val$action = npvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.val$action.onConfirm();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ npv val$action;

        public f(npv npvVar) {
            this.val$action = npvVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.val$action.onCancel();
            }
        }
    }

    static {
        t2o.a(947912716);
        t2o.a(946864134);
    }

    public suu() {
        this.f28287a = sClickbg2Exit;
    }

    public static /* synthetic */ Application.ActivityLifecycleCallbacks access$000(suu suuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("e7e3227a", new Object[]{suuVar});
        }
        return suuVar.c;
    }

    public static /* synthetic */ void access$100(suu suuVar, Activity activity, String str, npv npvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8922c06e", new Object[]{suuVar, activity, str, npvVar});
        } else {
            suuVar.g(activity, str, npvVar);
        }
    }

    public static /* synthetic */ boolean access$200(suu suuVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fe90434", new Object[]{suuVar, context})).booleanValue();
        }
        return suuVar.f(context);
    }

    public static /* synthetic */ String access$300(suu suuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96e7b5a7", new Object[]{suuVar});
        }
        return suuVar.a();
    }

    public static /* synthetic */ hvd access$400(suu suuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hvd) ipChange.ipc$dispatch("a1c58a2d", new Object[]{suuVar});
        }
        return suuVar.b;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5f5b72", new Object[]{this});
        }
        if (com.taobao.tao.navigation.a.o() == null || com.taobao.tao.navigation.a.o().getCurrentFragment() == null) {
            return "unknown";
        }
        String tag = com.taobao.tao.navigation.a.o().getCurrentFragment().getTag();
        return TextUtils.isEmpty(tag) ? "unknown" : tag;
    }

    @Override // tb.ruu
    public void alertForConfirm(String str, npv npvVar) {
        String str2;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e843af7f", new Object[]{this, str, npvVar});
            return;
        }
        npvVar.getConfirmText().equals("立即安装");
        Log.e("UIConfirmImpl", "alertForConfirm" + UpdateRuntime.getContext());
        Activity peekTopActivity = kc0.getInstance().peekTopActivity();
        this.b = new a(str, npvVar);
        this.c = new b(str, npvVar);
        if (peekTopActivity == null || peekTopActivity.isFinishing() || peekTopActivity.getClass().getName().contains("GuideActivity") || peekTopActivity.getClass().getName().toLowerCase().contains("welcome") || ((list = df4.blackDialogActivity) != null && list.contains(peekTopActivity.getClass().getName()))) {
            if (peekTopActivity == null) {
                str2 = "null";
            } else {
                str2 = peekTopActivity.getClass().getName();
            }
            Log.e("UIConfirmImpl", str2);
            UpdateRuntime.getContext().registerActivityLifecycleCallbacks(this.c);
        } else if (!f(peekTopActivity) || ((!"com.taobao.tao.welcome.Welcome".equalsIgnoreCase(peekTopActivity.getClass().getName()) && !obq.BIZ_NAME.equalsIgnoreCase(peekTopActivity.getClass().getName())) || !df4.blackDialogFragment.contains(a()))) {
            g(peekTopActivity, str, npvVar);
        } else {
            Log.e("UIConfirmImpl", "donot show install dialog, current tab in blackDialogFragment:" + a());
            com.taobao.tao.navigation.a.h(this.b);
            UpdateRuntime.getContext().registerActivityLifecycleCallbacks(this.c);
        }
    }

    public final String b(npv npvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b83f7b2c", new Object[]{this, npvVar});
        }
        if (e(npvVar)) {
            return null;
        }
        return "拒绝";
    }

    public final String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaf277a2", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    public final boolean d(npv npvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("661815bf", new Object[]{this, npvVar})).booleanValue();
        }
        if (bak.UA_NOTIFY_TYPE.equals(npvVar.getType()) || bak.UA_NOTIFY_FORCE_TYPE.equals(npvVar.getType()) || m11.UA_INSTALL_TYPE.equals(npvVar.getType()) || m11.UA_INSTALL_FORCE_TYPE.equals(npvVar.getType())) {
            return true;
        }
        return false;
    }

    public final boolean e(npv npvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("feb24b3d", new Object[]{this, npvVar})).booleanValue();
        }
        if (bak.UA_NOTIFY_TYPE.equals(npvVar.getType()) || bak.UA_NOTIFY_FORCE_TYPE.equals(npvVar.getType())) {
            return true;
        }
        return false;
    }

    public final boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41cc70d8", new Object[]{this, context})).booleanValue();
        }
        return context.getSharedPreferences(gjv.UPDATE_CONFIG_GROUP, 0).getBoolean(gjv.TAB_NOTIFY_ENABLED, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Activity activity, String str, npv npvVar) {
        dl7 dl7Var;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8c3b43", new Object[]{this, activity, str, npvVar});
            return;
        }
        try {
            if (!tg4.getInstance().enableDialogUiV2() || !d(npvVar)) {
                dl7 dl7Var2 = new dl7(activity, c(npvVar.getTitleText(), wmc.TIPS), str, this.f28287a);
                dl7Var2.addAcceptButton(c(npvVar.getConfirmText(), "同意"), new e(npvVar));
                dl7Var2.addCancelButton(c(npvVar.getCancelText(), "拒绝"), new f(npvVar));
                dl7Var = dl7Var2;
            } else {
                njv njvVar = new njv(activity, c(npvVar.getTitleText(), wmc.TIPS), str, this.f28287a);
                if (e(npvVar)) {
                    i = R.drawable.update_notify;
                } else {
                    i = R.drawable.update_confirm;
                }
                njvVar.setHeaderImg(i);
                njvVar.addAcceptButton(c(npvVar.getConfirmText(), "同意"), new c(npvVar));
                njvVar.addCancelButton(c(npvVar.getCancelText(), b(npvVar)), new d(npvVar));
                dl7Var = njvVar;
            }
            dl7Var.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public suu(boolean z) {
        this.f28287a = z;
    }
}
