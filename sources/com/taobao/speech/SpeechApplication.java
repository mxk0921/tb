package com.taobao.speech;

import android.app.Application;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.bean.EnvType;
import com.taobao.tao.Globals;
import tb.ftf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SpeechApplication extends Application {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "SpeechApplication";

    public static /* synthetic */ Object ipc$super(SpeechApplication speechApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/speech/SpeechApplication");
    }

    @Override // android.app.Application
    public void onCreate() {
        EnvType envType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        int i = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        if (i == 1) {
            envType = EnvType.PRE;
        } else if (i != 2) {
            envType = EnvType.ONLINE;
        } else {
            envType = EnvType.DAILY;
        }
        ftf.a(envType);
    }
}
