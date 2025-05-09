package anet.channel.util;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import tb.p2w;
import tb.ru1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ABSwitchUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.ABSwitchUtils";
    private static volatile boolean isValid = true;

    static {
        t2o.a(607125924);
    }

    public static String getABGlobalFeatureValue(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cc0690a", new Object[]{context, str});
        }
        try {
            for (p2w p2wVar : ABGlobal.a(context)) {
                if (str.equals(p2wVar.getName())) {
                    return p2wVar.getValue();
                }
            }
        } catch (Throwable unused) {
            ALog.e(TAG, "ABGlobal get FeatureValue error", null, new Object[0]);
        }
        return null;
    }

    public static Boolean isABGlobalFeatureOpened(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("55281037", new Object[]{context, str});
        }
        if (!isValid) {
            return null;
        }
        try {
            boolean isFeatureOpened = ABGlobal.isFeatureOpened(context, str);
            ALog.e(TAG, "[isABGlobalFeatureOpened]", null, ru1.FEATURE_NAME, str, "status", Boolean.valueOf(isFeatureOpened));
            return Boolean.valueOf(isFeatureOpened);
        } catch (Throwable unused) {
            ALog.e(TAG, "ABGlobal get error", null, new Object[0]);
            isValid = false;
            return null;
        }
    }
}
