package com.alipay.mobile.verifyidentity.uitl;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PlatformUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class EnvModeConfig {
        public static int ENVIRONMENT_DAILY = 1;
        public static int ENVIRONMENT_ONLINE = 0;
        public static int ENVIRONMENT_PRE = 2;
        public static int ENVIRONMENT_SIT = 3;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TrivialInvocationHandler implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public TrivialInvocationHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            String access$100 = PlatformUtils.access$100();
            VerifyLogCat.i(access$100, "callback method: " + method.getName());
            return "";
        }
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return "PlatformUtils";
    }

    public static String getApdidToken(Context context) {
        Object invokeMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("684513e", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod == null || (invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getApdidToken")) == null) {
            return "";
        }
        return (String) invokeMethod;
    }

    public static String getUmidToken(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("718eef", new Object[]{context});
        }
        Object tokenResult = getTokenResult(context);
        if (tokenResult == null) {
            return "";
        }
        return (String) ReflectUtils.getFieldValue(tokenResult, "umidToken");
    }

    public static boolean isDebug(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16deea7c", new Object[]{context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            VerifyLogCat.w("PlatformUtils", "get isDebug exception: ", th);
        }
        if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 16384).flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static String getApdid(Context context) {
        Object invokeMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81fa0459", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod == null || (invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getTokenResult")) == null) {
            return "";
        }
        return (String) ReflectUtils.getFieldValue(invokeMethod, "apdid");
    }

    public static Object getTokenResult(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8d0e2671", new Object[]{context});
        }
        initSecuritySdk(context);
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod == null) {
            return null;
        }
        return ReflectUtils.invokeMethod(invokeStaticMethod, "getTokenResult");
    }

    public static boolean isAlipay(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbc4e991", new Object[]{context})).booleanValue();
        }
        String packageName = context.getPackageName();
        VerifyLogCat.i("PlatformUtils", "当前客户端的包名：" + packageName);
        return "com.eg.android.AlipayGphone".equalsIgnoreCase(packageName) || "com.eg.android.AlipayGphoneRC".equalsIgnoreCase(packageName);
    }

    public static void initSecuritySdk(Context context) {
        Class<?>[] declaredClasses;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c177b7", new Object[]{context});
            return;
        }
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.apmobilesecuritysdk.face.APSecuritySdk", "getInstance", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod != null) {
            try {
                Object obj = null;
                for (Class<?> cls : APSecuritySdk.class.getDeclaredClasses()) {
                    if (cls.isInterface()) {
                        if ("com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener".equalsIgnoreCase(cls.getName())) {
                            obj = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new TrivialInvocationHandler());
                        }
                        VerifyLogCat.i("PlatformUtils", "get an [inner interface] : " + cls.getName());
                    } else {
                        VerifyLogCat.i("PlatformUtils", "get a [inner class] : " + cls.getName());
                    }
                }
                if (obj != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tid", "");
                    hashMap.put("utdid", "");
                    hashMap.put("userId", "");
                    VerifyLogCat.i("PlatformUtils", "It's ready to init SecuritySDK now!");
                    Class[] clsArr = {Integer.TYPE, Map.class, obj.getClass()};
                    if (isDebug(context)) {
                        i = EnvModeConfig.ENVIRONMENT_DAILY;
                    } else {
                        i = EnvModeConfig.ENVIRONMENT_ONLINE;
                    }
                    ReflectUtils.invokeMethod(invokeStaticMethod, "initToken", clsArr, new Object[]{Integer.valueOf(i), hashMap, obj});
                }
            } catch (Throwable th) {
                VerifyLogCat.e("PlatformUtils", th);
            }
        }
    }
}
