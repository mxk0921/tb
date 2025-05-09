package com.alibaba.ability.localization;

import android.app.Application;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.c21;
import tb.fca;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class InitLocalization {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InitLocalization";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Localization.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.Localization.b
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                fca.g(str, language);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements IApmEventListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 2) {
                fca.g(Localization.j(), Localization.h());
            }
        }
    }

    static {
        t2o.a(322961409);
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        TLog.logd(Localization.LOG_MODULE, TAG, "start initialization");
        LocalizationManager.e(application);
        Localization.b(new a());
        fca.g(Localization.j(), Localization.h());
        c21.c(new b());
    }
}
