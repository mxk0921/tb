package com.alibaba.motu.tbrest;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.taobao.orange.OrangeConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.dao;
import tb.iao;
import tb.obk;
import tb.t2o;
import tb.zap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class OrangeRestLauncher implements Serializable {
    private static final String ALL_SAMPLE = "all";
    private static final String CLEAR_PRIVACY_DATA = "clearPrivacyData";
    private static final String DATA_SIZE = "dataSize";
    private static final int DEFAULT_DATA_SIZE = 40960;
    private static final int DEFAULT_MESSAGE_COUNT = 50;
    private static final float DEFAULT_SAMPLE = 1.0f;
    private static final String MESSAGE_COUNT = "messageCount";
    private static final String TB_BIZ_REST_ORANGE = "TBBizRestOrange";
    private static final String TB_REST_ORANGE = "TBRestOrange";
    private static final String USE_OLD_LOGIC = "useOldLogic";
    private static volatile boolean initOrange = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements obk {

        /* renamed from: a  reason: collision with root package name */
        public final dao f2488a;

        static {
            t2o.a(813694984);
            t2o.a(613416995);
        }

        public b() {
            this.f2488a = dao.b();
        }

        public final void a(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    this.f2488a.c(key, OrangeRestLauncher.getSafeFloat(entry.getValue(), 1.0f));
                }
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(OrangeRestLauncher.TB_BIZ_REST_ORANGE);
            if (configs != null && configs.size() > 0) {
                a(configs);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements obk {

        /* renamed from: a  reason: collision with root package name */
        public final iao f2489a;

        static {
            t2o.a(813694985);
            t2o.a(613416995);
        }

        public c() {
            this.f2489a = iao.d();
        }

        public final boolean a(String str, boolean z) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Boolean.valueOf(str).booleanValue();
                }
            } catch (Exception unused) {
            }
            return z;
        }

        public final int b(String str, int i) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Integer.valueOf(str).intValue();
                }
            } catch (Exception unused) {
            }
            return i;
        }

        public final boolean c(String str) {
            char charAt;
            if (str.length() <= 0 || (charAt = str.charAt(0)) < '0' || charAt > '9') {
                return false;
            }
            return true;
        }

        public final void d(Map<String, String> map) {
            float safeFloat = OrangeRestLauncher.getSafeFloat(map.get("all"), 1.0f);
            iao iaoVar = this.f2489a;
            iaoVar.f(safeFloat);
            iaoVar.g(b(map.get(OrangeRestLauncher.DATA_SIZE), OrangeRestLauncher.DEFAULT_DATA_SIZE));
            iaoVar.i(b(map.get(OrangeRestLauncher.MESSAGE_COUNT), 50));
            iaoVar.j(a(map.get(OrangeRestLauncher.USE_OLD_LOGIC), false));
            a(map.get(OrangeRestLauncher.CLEAR_PRIVACY_DATA), true);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && c(key)) {
                    iaoVar.h(key, OrangeRestLauncher.getSafeFloat(entry.getValue(), 1.0f));
                }
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(OrangeRestLauncher.TB_REST_ORANGE);
            if (configs != null && configs.size() > 0) {
                d(configs);
            }
        }
    }

    static {
        t2o.a(813694982);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getSafeFloat(String str, float f) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Float.valueOf(str).floatValue();
            }
        } catch (Exception unused) {
        }
        return f;
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        if (!initOrange) {
            initOrange = true;
            zap.b().h = UTABTest.getAppActivateTrackId();
            OrangeConfig.getInstance().getConfigs(TB_REST_ORANGE);
            OrangeConfig.getInstance().registerListener(new String[]{TB_REST_ORANGE}, new c(), true);
            OrangeConfig.getInstance().getConfigs(TB_BIZ_REST_ORANGE);
            OrangeConfig.getInstance().registerListener(new String[]{TB_BIZ_REST_ORANGE}, new b(), true);
        }
    }
}
