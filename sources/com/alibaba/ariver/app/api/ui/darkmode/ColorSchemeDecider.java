package com.alibaba.ariver.app.api.ui.darkmode;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface ColorSchemeDecider {
    public static final String TAG = "AriverApp:ColorSchemeDecider";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class DefaultDecider implements ColorSchemeDecider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONArray f2424a;

        public DefaultDecider(JSONArray jSONArray) {
            this.f2424a = jSONArray;
            RVLogger.d(ColorSchemeDecider.TAG, "initialize ColorDecider by supportColorScheme: " + jSONArray);
        }

        @Override // com.alibaba.ariver.app.api.ui.darkmode.ColorSchemeDecider
        public ColorSchemeType getCurrentColorScheme() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ColorSchemeType) ipChange.ipc$dispatch("f0159d78", new Object[]{this});
            }
            JSONArray jSONArray = this.f2424a;
            if (jSONArray == null || jSONArray.size() == 0) {
                return ColorSchemeType.DEFAULT;
            }
            if (ThemeUtils.isDarkMode(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()) && this.f2424a.contains(ThemeUtils.COLOR_SCHEME_DARK)) {
                return ColorSchemeType.DARK;
            }
            if (this.f2424a.contains("light")) {
                return ColorSchemeType.LIGHT;
            }
            return ColorSchemeType.DEFAULT;
        }
    }

    ColorSchemeType getCurrentColorScheme();
}
