package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import tb.fdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE = "MyTaobao";
    public static final String MONITOR_MODULE = "MyTaoBao";
    public static final String ORDER_NUM = "orderNum";

    /* renamed from: a  reason: collision with root package name */
    public static fdb f23323a;
    public static final fdb.g b = new a();
    public static final fdb.i c = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements fdb.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fdb.g
        public void onObjectRemoveCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbe537fc", new Object[]{this, str, new Boolean(z)});
                return;
            }
            TLog.logd("MyTaobaoCache", "onObjectRemoveCallback, key=" + str + ", success=" + z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements fdb.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.fdb.i
        public void onObjectSetCallback(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c2b525a", new Object[]{this, str, new Boolean(z)});
                return;
            }
            TLog.logd("MyTaobaoCache", "onObjectSetCallback, key=" + str + ", success=" + z);
            if (z) {
                f3j.e(lgj.MONITOR_MODULE, "LocalStorage", "write");
            } else {
                f3j.b(lgj.MONITOR_MODULE, "LocalStorage", "write", str, "Callback");
            }
        }
    }

    static {
        t2o.a(745537726);
    }

    public static fdb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdb) ipChange.ipc$dispatch("6d39df3", new Object[0]);
        }
        fdb fdbVar = f23323a;
        if (fdbVar != null) {
            return fdbVar;
        }
        fdb w = AVFSCacheManager.getInstance().cacheForModule("MyTaobao").Z(lgj.class.getClassLoader()).L(new op()).w();
        f23323a = w;
        return w;
    }

    public static Object b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1d83b0c0", new Object[]{str});
        }
        String userId = Login.getUserId();
        if (TextUtils.isEmpty(userId)) {
            return null;
        }
        try {
            fdb a2 = a();
            Object d0 = a2.d0(str + userId);
            f3j.e(MONITOR_MODULE, "LocalStorage", "read");
            return d0;
        } catch (Exception e) {
            TLog.loge("MyTaobaoCache", "getCacheObjectForKey", e);
            f3j.b(MONITOR_MODULE, "LocalStorage", "read", str, Log.getStackTraceString(e));
            return null;
        }
    }

    public static String c(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2b0292", new Object[]{str});
        }
        Object b2 = b(str);
        if (TextUtils.equals(BasementFeedDataProvider.DB_KEY_FEED_DATA, str)) {
            StringBuilder sb = new StringBuilder("getCacheString, value=");
            if (b2 == null) {
                str2 = "null";
            } else {
                str2 = b2.toString();
            }
            sb.append(str2);
            Log.e("BasementFeedData", sb.toString());
        }
        if (b2 != null) {
            return b2.toString();
        }
        return null;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e53a5fc8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(BasementFeedDataProvider.DB_KEY_FEED_DATA, str)) {
            Log.e("BasementFeedData", "removeCacheObjectForKey");
        }
        if (!Login.checkSessionValid()) {
            return false;
        }
        try {
            fdb a2 = a();
            a2.D(str + Login.getUserId(), b);
            f3j.e(MONITOR_MODULE, "LocalStorage", "remove");
            return true;
        } catch (Exception e) {
            TLog.loge("MyTaobaoCache", "removeCacheObjectForKey", e);
            f3j.b(MONITOR_MODULE, "LocalStorage", "remove", str, Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean e(String str, Serializable serializable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665fd5be", new Object[]{str, serializable})).booleanValue();
        }
        if (TextUtils.equals(BasementFeedDataProvider.DB_KEY_FEED_DATA, str)) {
            Log.e("BasementFeedData", "setCacheObjectForKey, value=" + serializable.toString());
        }
        if (serializable != null && Login.checkSessionValid()) {
            try {
                fdb a2 = a();
                a2.m0(str + Login.getUserId(), serializable, c);
                f3j.e(MONITOR_MODULE, "LocalStorage", "write");
                return true;
            } catch (Exception e) {
                TLog.loge("MyTaobaoCache", "setCacheObjectForKey", e);
                f3j.b(MONITOR_MODULE, "LocalStorage", "write", str, Log.getStackTraceString(e));
            }
        }
        return false;
    }
}
