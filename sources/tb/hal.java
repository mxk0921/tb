package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.popupcenter.strategy.PopStrategyGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hal implements mad {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PAGE = "default";
    public static final String HOME_PAGE = "com.taobao.tao.homepage.HomePageFragment";
    public static final String TAG = "popcenter.Orange";
    public static final PopStrategyGroup b;
    public static a d;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, PopStrategyGroup> f20502a = new ConcurrentHashMap();
    public static final List<String> c = new ArrayList(Arrays.asList("com.taobao.tao.homepage.overlay.OverlayActivity"));

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (TextUtils.equals("android_pop_center", str) && !z) {
                hal.b();
            }
        }
    }

    static {
        PopStrategyGroup popStrategyGroup = new PopStrategyGroup();
        b = popStrategyGroup;
        popStrategyGroup.page = "default";
        popStrategyGroup.setStrategies(new PopStrategy[]{new PopStrategy("high", 0, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_SPLASH, 0, false, false, 0L, true), new PopStrategy("update", 20, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_TAO_PASSWORD, 40, false, false, 0L, false), new PopStrategy("float", 60, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_POPLAYER, 80, false, false, 0L, false), new PopStrategy(PopStrategy.IDENTIFIER_GUESS, 100, false, false, 0L, false), new PopStrategy("normal", krg.LOG_LEVEL_DEBUG, false, false, 0L, false), new PopStrategy("low", Integer.MAX_VALUE, false, false, 0L, false)});
        d();
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            d();
        }
    }

    public static synchronized void d() {
        synchronized (hal.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("635cd185", new Object[0]);
                return;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f20502a;
            concurrentHashMap.clear();
            PopStrategyGroup popStrategyGroup = b;
            concurrentHashMap.put("default", popStrategyGroup);
            concurrentHashMap.put(HOME_PAGE, popStrategyGroup);
            String config = OrangeConfigLocal.getInstance().getConfig("android_pop_center", "popOperationMainKey", "");
            if (!TextUtils.isEmpty(config)) {
                JSONObject parseObject = JSON.parseObject(config);
                List<PopStrategyGroup> parseArray = JSON.parseArray(parseObject.getString("mainPagesStrategy"), PopStrategyGroup.class);
                if (parseArray != null && !parseArray.isEmpty()) {
                    for (PopStrategyGroup popStrategyGroup2 : parseArray) {
                        ((ConcurrentHashMap) f20502a).put(popStrategyGroup2.page, popStrategyGroup2);
                    }
                }
                List<String> parseArray2 = JSON.parseArray(parseObject.getString("otherPagesStrategy"), String.class);
                if (parseArray2 != null && !parseArray2.isEmpty()) {
                    for (String str : parseArray2) {
                        ((ConcurrentHashMap) f20502a).put(str, PopStrategyGroup.EMPTY_GROUP);
                    }
                }
            }
            if (d == null) {
                d = new a();
                OrangeConfigLocal.getInstance().registerListener(new String[]{"android_pop_center"}, d);
            }
        }
    }

    public static PopStrategyGroup e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStrategyGroup) ipChange.ipc$dispatch("81368c1d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        OrangeConfigLocal instance = OrangeConfigLocal.getInstance();
        String config = instance.getConfig("android_pop_center", str + "popOperationOtherKey_", "");
        new StringBuilder("load other config=").append(config);
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return (PopStrategyGroup) JSON.parseObject(config, PopStrategyGroup.class);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void f(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766473a8", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                b.getStrategyByIdentifier(str).showDirect = z;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.mad
    public PopStrategyGroup a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStrategyGroup) ipChange.ipc$dispatch("d7fde942", new Object[]{this, str});
        }
        if (c(str) || TextUtils.equals(OrangeConfigLocal.getInstance().getConfig("android_pop_center", "popOperationDegradeSwitch", "false"), "true")) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f20502a;
        PopStrategyGroup popStrategyGroup = (PopStrategyGroup) concurrentHashMap.get(str);
        if (popStrategyGroup == null) {
            return (PopStrategyGroup) concurrentHashMap.get("default");
        }
        if (popStrategyGroup != PopStrategyGroup.EMPTY_GROUP) {
            return popStrategyGroup;
        }
        PopStrategyGroup e = e("popOperationOtherKey_" + str);
        if (e == null) {
            return (PopStrategyGroup) concurrentHashMap.get("default");
        }
        concurrentHashMap.put(str, e);
        return e;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1905936e", new Object[]{this, str})).booleanValue();
        }
        return ((ArrayList) c).contains(str);
    }
}
