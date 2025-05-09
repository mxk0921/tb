package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.keychain.impl.OnResultListener;
import com.heytap.mspsdk.keychain.impl.a;
import com.opos.process.bridge.provider.BridgeException;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class i7l {
    static {
        t2o.a(253755422);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, OnResultListener onResultListener) {
        int i;
        MspSdkException mspSdkException;
        a aVar = new a(onResultListener);
        try {
            swx.d(context).a(swx.a(context, null), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            c3j.c("KeyChainImpl", e);
            i = e.getCode();
            mspSdkException = e;
            swx.e(i, mspSdkException.getMessage(), aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            c3j.c("KeyChainImpl", e2);
            i = e2.getCode();
            mspSdkException = e2;
            swx.e(i, mspSdkException.getMessage(), aVar);
        }
    }

    public static void b(Context context) {
        d3j.b(context);
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.htms", "com.heytap.msp.keychain.KeyChainService"));
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Context context, HashMap<String, String> hashMap, OnResultListener onResultListener) {
        int i;
        MspSdkException mspSdkException;
        if (hashMap == null || hashMap.isEmpty() || TextUtils.isEmpty("key")) {
            throw new IllegalArgumentException("value of argument 'key' should not be empty");
        }
        a aVar = new a(onResultListener);
        try {
            swx.d(context).b(swx.a(context, hashMap), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            c3j.c("KeyChainImpl", e);
            i = e.getCode();
            mspSdkException = e;
            swx.e(i, mspSdkException.getMessage(), aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            c3j.c("KeyChainImpl", e2);
            i = e2.getCode();
            mspSdkException = e2;
            swx.e(i, mspSdkException.getMessage(), aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(Context context, HashMap<String, String> hashMap, OnResultListener onResultListener) {
        int i;
        MspSdkException mspSdkException;
        if (hashMap == null || hashMap.isEmpty() || TextUtils.isEmpty("key") || TextUtils.isEmpty("data")) {
            throw new IllegalArgumentException("value of argument 'key' or 'data' should not be empty");
        }
        a aVar = new a(onResultListener);
        try {
            swx.d(context).c(swx.a(context, hashMap), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            c3j.c("KeyChainImpl", e);
            i = e.getCode();
            mspSdkException = e;
            swx.e(i, mspSdkException.getMessage(), aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            c3j.c("KeyChainImpl", e2);
            i = e2.getCode();
            mspSdkException = e2;
            swx.e(i, mspSdkException.getMessage(), aVar);
        }
    }
}
