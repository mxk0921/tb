package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class c09 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CUSTOM_ORANGE_NAME = "TBSocialSDK";
    public static final String KEY_SHOULD_GET_FAMILY_WHEN_COLD_START = "getFamilyWhenColdStart";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (str.equals(c09.CUSTOM_ORANGE_NAME) && !z) {
                "onConfigUpdate:".concat(str);
                "onConfigUpdate:".concat(str);
                c09.b();
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        b();
        OrangeConfig.getInstance().registerListener(new String[]{CUSTOM_ORANGE_NAME}, new a());
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843356c8", new Object[0]);
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(CUSTOM_ORANGE_NAME, KEY_SHOULD_GET_FAMILY_WHEN_COLD_START, "true");
            b09 b09Var = b09.c;
            b09Var.f16111a = Boolean.valueOf(config).booleanValue();
            b09Var.b = "true".equals(OrangeConfig.getInstance().getConfig(CUSTOM_ORANGE_NAME, "fixSharePanelConflictIssue", "true"));
        } catch (Exception e) {
            y7t.a("FamilyOrangeConfig", "parse orange error, " + e.toString());
        }
    }
}
