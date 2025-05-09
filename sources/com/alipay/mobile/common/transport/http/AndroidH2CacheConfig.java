package com.alipay.mobile.common.transport.http;

import com.alibaba.ability.impl.file.FileAbility;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AndroidH2CacheConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AndroidH2CacheConfig f4067a;
    public static boolean b;

    public static AndroidH2CacheConfig getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2CacheConfig) ipChange.ipc$dispatch("c26aa55", new Object[0]);
        }
        AndroidH2CacheConfig androidH2CacheConfig = f4067a;
        if (androidH2CacheConfig != null) {
            return androidH2CacheConfig;
        }
        synchronized (AndroidH2CacheConfig.class) {
            try {
                if (f4067a == null) {
                    f4067a = new AndroidH2CacheConfig();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4067a;
    }

    public void setupCacheDir() {
        if (!b) {
            synchronized (AndroidH2CacheConfig.class) {
                if (!b) {
                    Class.forName("android.net.http.HttpResponseCache").getMethod("install", File.class, Long.TYPE).invoke(null, new File(TransportEnvUtil.getContext().getCacheDir(), "http"), Long.valueOf((long) FileAbility.MAX_FILE_SIZE));
                    b = true;
                    LogCatUtil.info("AndroidH2CacheConfig", "[setupCacheDir] http cache create OK");
                }
            }
        }
    }
}
