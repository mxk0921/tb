package com.taobao.android.base;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import tb.cw6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Versions {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean isGrayVersion;

    static {
        t2o.a(775946287);
        String version = TaoPackageInfo.getVersion();
        boolean z = false;
        if (TextUtils.isEmpty(version)) {
            isGrayVersion = false;
            return;
        }
        try {
            String[] split = version.split("\\.");
            if (split != null) {
                if (split.length >= 3) {
                    z = true;
                }
                isGrayVersion = z;
                return;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            isGrayVersion = false;
            throw th;
        }
        isGrayVersion = false;
    }

    public static boolean isDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[0])).booleanValue();
        }
        return cw6.b();
    }

    public static boolean isGrayVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79d7b876", new Object[0])).booleanValue();
        }
        return isGrayVersion;
    }
}
