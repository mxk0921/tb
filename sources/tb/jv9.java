package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class jv9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jv9 INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f22237a;
    public static final Pattern b;
    public static final ConcurrentHashMap<String, LinkedHashMap<String, Long>> c;
    public static final ConcurrentHashMap<String, LinkedHashMap<String, Long>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a extends TypeReference<LinkedHashMap<String, Long>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements t11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f22238a;

            public a(Intent intent) {
                this.f22238a = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isDebug;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Uri data = this.f22238a.getData();
                    if (data == null) {
                        String stringExtra = this.f22238a.getStringExtra(mop.KEY_FIRST_IN_SHOP_URL);
                        if (!(stringExtra == null || stringExtra.length() == 0)) {
                            TLog.loge("FootprintRecorder", "尝试获取店铺url: ".concat(stringExtra));
                            data = Uri.parse(stringExtra);
                        }
                        return;
                    }
                    if (data == null) {
                        TLog.loge("FootprintRecorder", "获取不到url，不进行足迹记录");
                    } else {
                        jv9.b(jv9.INSTANCE, data);
                    }
                } finally {
                    if (!isDebug) {
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            ckf.h(activity, "activity");
            if (jv9.a(jv9.INSTANCE) && Login.checkSessionValid() && (intent = activity.getIntent()) != null) {
                p3j.g(new a(intent));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                ckf.h(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.h(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.h(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.h(activity, "activity");
            ckf.h(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.h(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.h(activity, "activity");
            }
        }
    }

    static {
        Pattern pattern;
        t2o.a(745537709);
        jv9 jv9Var = new jv9();
        INSTANCE = jv9Var;
        Pattern pattern2 = null;
        try {
            pattern = Pattern.compile(jv9Var.g());
        } catch (Exception unused) {
            pattern = null;
        }
        f22237a = pattern;
        try {
            pattern2 = Pattern.compile(jv9Var.j());
        } catch (Exception unused2) {
        }
        b = pattern2;
        c = new ConcurrentHashMap<>();
        d = new ConcurrentHashMap<>();
    }

    public static final /* synthetic */ boolean a(jv9 jv9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de302a1f", new Object[]{jv9Var})).booleanValue();
        }
        return jv9Var.c();
    }

    public static final /* synthetic */ void b(jv9 jv9Var, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ae4786", new Object[]{jv9Var, uri});
        } else {
            jv9Var.o(uri);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1dbf9a3f", new Object[]{this})).booleanValue();
        }
        return ih4.a("footprint_record_enable", true);
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d6cd252", new Object[]{this, str, str2});
        }
        return "footprintRecord_" + str2 + '_' + str;
    }

    public final LinkedHashMap<String, Long> e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("ef76e9ea", new Object[]{this, str, str2});
        }
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        LinkedHashMap<String, Long> m = m(str, str2);
        if (m != null) {
            linkedHashMap.putAll(m);
        }
        return linkedHashMap;
    }

    public final LinkedHashMap<String, Long> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("cb53938b", new Object[]{this, str});
        }
        ConcurrentHashMap<String, LinkedHashMap<String, Long>> concurrentHashMap = c;
        LinkedHashMap<String, Long> linkedHashMap = concurrentHashMap.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap<String, Long> e = e("goods", str);
        concurrentHashMap.put(str, e);
        return e;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4bd12d2", new Object[]{this});
        }
        String f = ih4.f("footprint_detail_url_pattern", "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$");
        if (f == null) {
            return "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$";
        }
        if (f.length() <= 0) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        return "^(https?:)?//(h5\\.m\\.taobao\\.com/awp/core/detail(\\.html|/inside\\.htm)|item\\.taobao\\.com/item\\.htm|item\\.tmall\\.com/item\\.htm|detail\\.m\\.tmall\\.com/item\\.htm|detail\\.tmall\\.com/item\\.htm|a\\.m\\.taobao\\.com|a\\.m\\.tmall\\.com|main\\.m\\.taobao\\.com/detail/index\\.html|internal\\.tt\\.detail\\.taobao\\.com/item\\.htm|new\\.m\\.taobao\\.com/detail\\.htm)(\\?.*)$";
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b34aa", new Object[]{this})).intValue();
        }
        Integer valueOf = Integer.valueOf(ih4.d("footprint_max_record_count", 50));
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 50;
    }

    public final LinkedHashMap<String, Long> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("acc0e57", new Object[]{this, str});
        }
        ConcurrentHashMap<String, LinkedHashMap<String, Long>> concurrentHashMap = d;
        LinkedHashMap<String, Long> linkedHashMap = concurrentHashMap.get(str);
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        LinkedHashMap<String, Long> e = e("shop", str);
        concurrentHashMap.put(str, e);
        return e;
    }

    public final String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83b2319e", new Object[]{this});
        }
        String f = ih4.f("footprint_shop_url_pattern", "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$");
        if (f == null) {
            return "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$";
        }
        if (f.length() <= 0) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        return "^(https?:)?//(m\\.duanqu\\.com.*[?&]isShop=1(&.*)?|shop.m.taobao.com/shop/shop_index.htm(\\?.*))$";
    }

    public final synchronized LinkedHashMap<String, Long> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("49108554", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (userId != null) {
            if (userId.length() <= 0) {
                userId = null;
            }
            if (userId != null) {
                return new LinkedHashMap<>(f(userId));
            }
        }
        return new LinkedHashMap<>();
    }

    public final synchronized LinkedHashMap<String, Long> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("350912e4", new Object[]{this});
        }
        String userId = Login.getUserId();
        if (userId != null) {
            if (userId.length() <= 0) {
                userId = null;
            }
            if (userId != null) {
                return new LinkedHashMap<>(i(userId));
            }
        }
        return new LinkedHashMap<>();
    }

    public final LinkedHashMap<String, Long> m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedHashMap) ipChange.ipc$dispatch("4d5c92c3", new Object[]{this, str, str2});
        }
        Object b2 = lgj.b(d(str, str2));
        if (!(b2 instanceof String)) {
            return null;
        }
        try {
            return (LinkedHashMap) JSON.parseObject((String) b2, new a(), new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void p(String str, String str2, LinkedHashMap<String, Long> linkedHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a46c18cc", new Object[]{this, str, str2, linkedHashMap});
        } else {
            lgj.e(d(str, str2), JSON.toJSONString(linkedHashMap));
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb6058", new Object[]{this});
        } else if (c()) {
            c21.a(new b(), false);
            TLog.loge("FootprintRecorder", "start record footprint");
        }
    }

    public final synchronized void o(Uri uri) {
        Matcher matcher;
        Matcher matcher2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5f06232", new Object[]{this, uri});
            return;
        }
        Pattern pattern = f22237a;
        String str = null;
        if (pattern == null || (matcher2 = pattern.matcher(uri.toString())) == null || !matcher2.find()) {
            Pattern pattern2 = b;
            if (pattern2 != null && (matcher = pattern2.matcher(uri.toString())) != null && matcher.find()) {
                TLog.loge("FootprintRecorder", "uri: " + uri);
                String queryParameter = uri.getQueryParameter("sellerId");
                if (queryParameter == null || queryParameter.length() == 0) {
                    queryParameter = uri.getQueryParameter("user_id");
                    TLog.loge("FootprintRecorder", "获取不到sellerId，尝试获取user_id: " + queryParameter);
                }
                if (!(queryParameter == null || queryParameter.length() == 0)) {
                    String userId = Login.getUserId();
                    if (userId != null) {
                        if (userId.length() > 0) {
                            str = userId;
                        }
                        if (str != null) {
                            LinkedHashMap<String, Long> i = i(str);
                            i.put(queryParameter, Long.valueOf(System.currentTimeMillis() / 1000));
                            if (i.size() > h()) {
                                Set<String> keySet = i.keySet();
                                ckf.c(keySet, "shopList.keys");
                                i.remove(i04.Z(keySet));
                            }
                            p("shop", str, i);
                            TLog.loge("FootprintRecorder", "footprint shopId: " + queryParameter + " shop ids size: " + i.size());
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        TLog.loge("FootprintRecorder", "uri: " + uri);
        String queryParameter2 = uri.getQueryParameter("id");
        if (!(queryParameter2 == null || queryParameter2.length() == 0)) {
            String userId2 = Login.getUserId();
            if (userId2 != null) {
                if (userId2.length() > 0) {
                    str = userId2;
                }
                if (str != null) {
                    LinkedHashMap<String, Long> f = f(str);
                    f.put(queryParameter2, Long.valueOf(System.currentTimeMillis() / 1000));
                    if (f.size() > h()) {
                        Set<String> keySet2 = f.keySet();
                        ckf.c(keySet2, "goodsList.keys");
                        f.remove(i04.Z(keySet2));
                    }
                    p("goods", str, f);
                    TLog.loge("FootprintRecorder", "footprint itemId: " + queryParameter2 + " goods ids size: " + f.size());
                }
            }
        }
    }
}
