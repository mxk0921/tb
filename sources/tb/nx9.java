package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.base.Versions;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.TBMainLog;
import com.taobao.tao.util.TargetTabHelper;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ID_TBMAIN_FRAGMENT = "TBMainFragmentOpen";
    public static final String FRAGMENT_MODEL_SP_NAME = "fragment_model_downgrade_switch";
    public static final String KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC = "fragment_enter_animation_async";
    public static final String KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC_GRAY = "fragment_enter_animation_async_gray";
    public static final String KEY_ORANGE_FRAGMENT_JUMP_ABILITY = "fragment_jump_ability";
    public static final String KEY_ORANGE_FRAGMENT_REMOVE_TRANSLATE_VIEW = "fragment_remove_translate_view";
    public static final String KEY_ORANGE_RANDOM_THRESHOLD = "randomThreshold";
    public static final String ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY = "isDowngrade";
    public static final String ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_NAME_SPACE = "fragment_model_downgrade_switch";
    public static final String ORANGE_NAV_THRESHOLD_NAME_SPACE = "NavThreshold";

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f25015a;
    public static Boolean e;
    public static final AtomicBoolean sIsInit = new AtomicBoolean(false);
    public static boolean b = false;
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final boolean f = new File("/data/local/tmp/.fragment_enter_animation_async").exists();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            if ("fragment_model_downgrade_switch".equals(str)) {
                TBMainLog.tlog("FragmentSwitch", "get fragment_model_downgrade_switch");
                SharedPreferences.Editor edit = nx9.a().edit();
                nx9.b(edit, nx9.ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY);
                nx9.b(edit, nx9.KEY_ORANGE_FRAGMENT_JUMP_ABILITY);
                nx9.b(edit, nx9.KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC);
                nx9.b(edit, nx9.KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC_GRAY);
                nx9.b(edit, nx9.KEY_ORANGE_FRAGMENT_REMOVE_TRANSLATE_VIEW);
                nx9.b(edit, "lifecycle_operation_mytaobao");
                nx9.b(edit, "lifecycle_operation_no_anim_mytaobao");
                nx9.b(edit, "pop_at_main_thread");
                nx9.b(edit, "oppo_anr_opt");
                nx9.b(edit, "actionbar_refactor");
                edit.apply();
            }
            if (nx9.ORANGE_NAV_THRESHOLD_NAME_SPACE.equals(str)) {
                TBMainLog.tlog("FragmentSwitch", "get NavThreshold");
                SharedPreferences.Editor edit2 = nx9.a().edit();
                nx9.c(edit2, nx9.ORANGE_NAV_THRESHOLD_NAME_SPACE, nx9.KEY_ORANGE_RANDOM_THRESHOLD);
                nx9.c(edit2, nx9.ORANGE_NAV_THRESHOLD_NAME_SPACE, "processor_error_threshold");
                edit2.apply();
                TargetTabHelper.setUseNewTargetTab(Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(str, "use_new_target_tab_help", "true")));
            }
        }
    }

    static {
        t2o.a(775946363);
    }

    public static /* synthetic */ SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f071a8b", new Object[0]);
        }
        return f25015a;
    }

    public static /* synthetic */ void b(SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1afda9d", new Object[]{editor, str});
        } else {
            y(editor, str);
        }
    }

    public static /* synthetic */ void c(SharedPreferences.Editor editor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75ce4a8", new Object[]{editor, str, str2});
        } else {
            z(editor, str, str2);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4661e58d", new Object[0]);
            return;
        }
        TBMainLog.tlog("FragmentSwitch", "set close fragment model by homepage.");
        boolean compareAndSet = d.compareAndSet(false, true);
        TBMainLog.tlog("FragmentSwitch", "sCloseFragmentModel.compareAndSet(false, true), and ret is " + compareAndSet);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100a22ca", new Object[0]);
            return;
        }
        TBMainLog.tlog("FragmentNavDelegate", "set close fragment model by user.");
        boolean compareAndSet = c.compareAndSet(false, true);
        TBMainLog.tlog("FragmentNavDelegate", "sCloseFragmentModel.compareAndSet(false, true), and ret is " + compareAndSet);
    }

    public static boolean f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9407a40e", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        SharedPreferences sharedPreferences = f25015a;
        if (sharedPreferences == null) {
            return z;
        }
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return z;
        }
        return Boolean.parseBoolean(string);
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4acc5a78", new Object[0])).intValue();
        }
        return i(KEY_ORANGE_RANDOM_THRESHOLD, 1000000);
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67e6139", new Object[0])).intValue();
        }
        return i("processor_error_threshold", 100000);
    }

    public static int i(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9e79930", new Object[]{str, new Integer(i)})).intValue();
        }
        SharedPreferences sharedPreferences = f25015a;
        if (sharedPreferences == null) {
            return i;
        }
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(string);
        } catch (Throwable th) {
            TBMainLog.tlog("FragmentSwitch", "getNavThreshold error, error is: " + th + " navThresholdStr: " + string + ". Use default value " + i);
            return i;
        }
    }

    public static void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83c9ecd", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            f25015a = applicationContext.getSharedPreferences("fragment_model_downgrade_switch", 0);
            OrangeConfig.getInstance().registerListener(new String[]{"fragment_model_downgrade_switch", ORANGE_NAV_THRESHOLD_NAME_SPACE}, new a(), true);
            jx9.a(context);
        }
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ce84653", new Object[0])).booleanValue();
        }
        return f("actionbar_refactor", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fce8037", new Object[0])).booleanValue();
        }
        return f;
    }

    public static boolean m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e9edc97", new Object[0])).booleanValue();
        }
        if (Versions.isGrayVersion() && !f(KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC_GRAY, true)) {
            TBMainLog.tlog("FragmentSwitch", "isFragmentAsyncAnimationOpen: isGray but orange gray switch off. ");
            return false;
        } else if (!f(KEY_ORANGE_FRAGMENT_ENTER_ANIMATION_ASYNC, f)) {
            TBMainLog.tlog("FragmentSwitch", "isFragmentAsyncAnimationOpen: false. ");
            return false;
        } else {
            eyl c2 = p7o.c(2, 201, 101);
            if (c2 != null) {
                str = c2.c;
            } else {
                str = null;
            }
            boolean equals = TextUtils.equals(str, "critical");
            TLog.loge("FragmentSwitch", "isFragmentAsyncAnimationOpen: isOffByMemory: " + equals);
            return !equals;
        }
    }

    public static boolean n(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b09234c", new Object[]{context, str})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, str);
        TBMainLog.tlog("FragmentSwitch", "get " + str + " ; value is " + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf87b17", new Object[0])).booleanValue();
        }
        return f(KEY_ORANGE_FRAGMENT_JUMP_ABILITY, true);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3600b99", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f25015a;
        if (sharedPreferences != null) {
            b = Boolean.parseBoolean(sharedPreferences.getString(ORANGE_HOT_DOWNGRADE_FRAGMENT_MODEL_KEY, "false"));
        }
        return b;
    }

    public static synchronized boolean r(Context context) {
        synchronized (nx9.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("76be2ae7", new Object[]{context})).booleanValue();
            } else if (d.get()) {
                TBMainLog.tlog("FragmentSwitch", "close FragmentModelOpenByHomePage TBMainFragmentOpen by user.");
                return false;
            } else {
                return jx9.b(context);
            }
        }
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fae8c416", new Object[0])).booleanValue();
        }
        return f("lifecycle_operation_mytaobao", true);
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b7be668", new Object[0])).booleanValue();
        }
        return f("lifecycle_operation_no_anim_mytaobao", false);
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[0])).booleanValue();
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2514a28", new Object[0])).booleanValue();
        }
        return f("pop_at_main_thread", true);
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7798770", new Object[0])).booleanValue();
        }
        return f(KEY_ORANGE_FRAGMENT_REMOVE_TRANSLATE_VIEW, true);
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4af914c0", new Object[]{context})).booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, "TBMainFragmentThreeFloorsOpen");
        TBMainLog.tlog("FragmentSwitch", "isThreeFloorsOpen:" + isFeatureOpened);
        return isFeatureOpened;
    }

    public static void y(SharedPreferences.Editor editor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203ba332", new Object[]{editor, str});
        } else {
            z(editor, "fragment_model_downgrade_switch", str);
        }
    }

    public static void z(SharedPreferences.Editor editor, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1c5247c", new Object[]{editor, str, str2});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config != null) {
            editor.putString(str2, config);
        }
        TBMainLog.tlog("FragmentSwitch", "save string to sp. namespace is " + str + ", key is " + str2 + ", configValue is " + config);
    }

    public static boolean q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c62d32c", new Object[]{context})).booleanValue();
        }
        if (e == null) {
            e = Boolean.valueOf(TBDeviceUtils.p(context));
        }
        if (e.booleanValue()) {
            TBMainLog.tlog("FragmentSwitch", "this is fold device , close fragment model");
            return false;
        } else if (p()) {
            TBMainLog.tlog("FragmentSwitch", "close fragment model by orange");
            return false;
        } else if (!c.get()) {
            return true;
        } else {
            TBMainLog.tlog("FragmentSwitch", "close TBMainFragmentOpen by user.");
            return false;
        }
    }
}
