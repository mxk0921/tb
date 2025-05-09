package com.taobao.update.dynamicfeature.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Constants {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, String> f14088a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ErrorCode {
        public static final int DOWNLOAD_ERROR = -3;
        public static final int ENV_ERROR = -1;
        public static final int EXTRAT_ERROR = -5;
        public static final int INSTALL_ERROR = -6;
        public static final int NOT_ENOUGH_SPACE_ERROR = -2;
        public static final int VERIFY_ERROR = -4;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface ErrorDesc {
        public static final String downloadError = "download error";
        public static final String envError = "network mismatch or no network";
        public static final String extractError = "feature extract error";
        public static final String installError = "install error";
        public static final String spaceError = "no enough space";
        public static final String verifyError = "feature signature verify error";
    }

    public static String getMsg(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c57d6cf", new Object[]{new Integer(i)});
        }
        return (String) ((HashMap) f14088a).get(Integer.valueOf(i));
    }

    static {
        t2o.a(951058458);
        HashMap hashMap = new HashMap();
        f14088a = hashMap;
        hashMap.put(-1, ErrorDesc.envError);
        hashMap.put(-2, ErrorDesc.spaceError);
        hashMap.put(-3, ErrorDesc.downloadError);
        hashMap.put(-4, ErrorDesc.verifyError);
        hashMap.put(-6, ErrorDesc.installError);
        hashMap.put(-5, ErrorDesc.extractError);
    }
}
