package tb;

import android.text.TextUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class auv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CATEGORY_CONFIG_CHECK_START = "ConfigCheckStart";
    public static final String EVENT_CATEGORY_FULL_UP = "fullUp";
    public static final String EVENT_CATEGORY_JUMP_LOSE = "JumpLose";
    public static final String EVENT_CATEGORY_ONE_POP = "OnePop";
    public static final String EVENT_CATEGORY_OTHER = "other";
    public static final String EVENT_CATEGORY_PAGE_LIFE_CYCLE = "pageLifeCycle";
    public static final String EVENT_CATEGORY_POP_ERROR = "PopError";
    public static final String EVENT_CATEGORY_POP_PROCESS = "PopProcess";

    /* renamed from: a  reason: collision with root package name */
    public x7e f16017a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final auv f16018a = new auv();

        static {
            t2o.a(625999990);
        }

        public static /* synthetic */ auv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (auv) ipChange.ipc$dispatch("bd06460a", new Object[0]);
            }
            return f16018a;
        }
    }

    static {
        t2o.a(625999988);
    }

    public static auv a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (auv) ipChange.ipc$dispatch("e87483ee", new Object[0]);
        }
        return b.a();
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("345dbe4e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (!str.equals("ConfigCheckStart") && !str.equals("OnePop") && !str.equals("PopProcess") && !str.equals("PopError") && !str.equals("JumpLose"))) {
            return false;
        }
        return true;
    }

    public void d(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731af16b", new Object[]{this, str, str2, baseConfigItem, map});
        } else {
            e(str, str2, baseConfigItem, map, false);
        }
    }

    public void e(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f043eec9", new Object[]{this, str, str2, baseConfigItem, map, new Boolean(z)});
            return;
        }
        try {
            x7e x7eVar = this.f16017a;
            if (x7eVar != null) {
                ((w9u) x7eVar).a(str, str2, baseConfigItem, map, z);
            }
        } catch (Throwable th) {
            wdm.h("trackAction error.", th);
        }
    }

    public void f(int i, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1808521d", new Object[]{this, new Integer(i), str, str2, str3, str4, map});
            return;
        }
        try {
            x7e x7eVar = this.f16017a;
            if (x7eVar != null) {
                ((w9u) x7eVar).b(i, str, str2, str3, str4, map);
            }
        } catch (Throwable th) {
            wdm.h("trackCustom error.", th);
        }
    }

    public auv() {
    }

    public void c(x7e x7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0381a2", new Object[]{this, x7eVar});
            return;
        }
        this.f16017a = x7eVar;
        wdm.d("registerUserTrackAdapter.", new Object[0]);
    }
}
