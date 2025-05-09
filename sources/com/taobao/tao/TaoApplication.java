package com.taobao.tao;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TaoApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean sInit;
    public static String sPackageName;
    public static String sProcessName;
    private String TAG = "TaoApplication";

    public static String getPackageName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b1a51a", new Object[]{context});
        }
        if (!TextUtils.isEmpty(sPackageName)) {
            return sPackageName;
        }
        return TaobaoApplication.getPackageName(context);
    }

    public static String getProcessName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7512d303", new Object[]{context});
        }
        if (!TextUtils.isEmpty(sProcessName)) {
            return sProcessName;
        }
        return TaobaoApplication.getProcessName(context);
    }

    public static String getTTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        return TaobaoApplication.getTTID();
    }

    public static final String getTTIDNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c591c44", new Object[0]);
        }
        return TaoPackageInfo.getTTIDNum();
    }

    public static String getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return TaoPackageInfo.getVersion();
    }

    public static /* synthetic */ Object ipc$super(TaoApplication taoApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/TaoApplication");
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (!sInit) {
            super.onCreate();
            sProcessName = getProcessName(Globals.getApplication());
            sPackageName = getPackageName(Globals.getApplication());
            sInit = true;
        }
    }

    public void onCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{this, context});
        } else {
            onCreate();
        }
    }
}
