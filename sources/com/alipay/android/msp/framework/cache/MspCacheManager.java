package com.alipay.android.msp.framework.cache;

import android.text.TextUtils;
import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.cache.DiskLruCache;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.FileUtils;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MspCacheManager f;

    /* renamed from: a  reason: collision with root package name */
    public Strategy f3591a;
    public boolean d;
    public final Runnable e;
    public volatile DiskLruCache c = null;
    public final MspMemoryCache b = new MspMemoryCache();

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.cache.MspCacheManager$4  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy;

        static {
            int[] iArr = new int[Strategy.values().length];
            $SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy = iArr;
            try {
                iArr[Strategy.MEMORY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[Strategy.MEMORY_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[Strategy.DISK_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Strategy {
        MEMORY_ONLY(0),
        MEMORY_FIRST(1),
        DISK_ONLY(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int id;

        Strategy(int i) {
            this.id = i;
        }

        public static /* synthetic */ Object ipc$super(Strategy strategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/cache/MspCacheManager$Strategy");
        }

        public static Strategy valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Strategy) ipChange.ipc$dispatch("96016eae", new Object[]{str});
            }
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }
    }

    public MspCacheManager(Strategy strategy) {
        this.f3591a = Strategy.MEMORY_ONLY;
        Runnable runnable = new Runnable() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    MspCacheManager.access$002(MspCacheManager.this, DiskLruCache.open(GlobalHelper.getInstance().getContext().getDir("alipay_msp_disk_cache", 0), 1, 1, FileAbility.MAX_FILE_SIZE));
                } catch (Throwable th) {
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "", th);
                }
            }
        };
        this.f3591a = strategy;
        TaskHelper.execute(runnable);
    }

    public static /* synthetic */ DiskLruCache access$002(MspCacheManager mspCacheManager, DiskLruCache diskLruCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DiskLruCache) ipChange.ipc$dispatch("e9012d51", new Object[]{mspCacheManager, diskLruCache});
        }
        mspCacheManager.c = diskLruCache;
        return diskLruCache;
    }

    public static /* synthetic */ Strategy access$100(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Strategy) ipChange.ipc$dispatch("5ae48c21", new Object[]{mspCacheManager});
        }
        return mspCacheManager.f3591a;
    }

    public static /* synthetic */ boolean access$200(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4ca971", new Object[]{mspCacheManager})).booleanValue();
        }
        return mspCacheManager.d;
    }

    public static /* synthetic */ MspMemoryCache access$300(MspCacheManager mspCacheManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspMemoryCache) ipChange.ipc$dispatch("947fe78e", new Object[]{mspCacheManager});
        }
        return mspCacheManager.b;
    }

    public static /* synthetic */ String access$500(MspCacheManager mspCacheManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("844bf3e6", new Object[]{mspCacheManager, str});
        }
        return mspCacheManager.a(str, "msp");
    }

    public static MspCacheManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspCacheManager) ipChange.ipc$dispatch("581ef038", new Object[0]) : getInstance(Strategy.MEMORY_ONLY);
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a6195e", new Object[]{this, str, str2});
        }
        String string = PrefUtils.getString(str, str2, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return b(str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return string;
        }
    }

    public final String b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2f0517d", new Object[]{this, str});
        }
        if (this.c == null) {
            return null;
        }
        try {
            str = FileUtils.md5(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        DiskLruCache.Snapshot snapshot = this.c.get(str);
        if (snapshot != null) {
            return snapshot.getString(0);
        }
        return null;
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else if (AnonymousClass4.$SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[this.f3591a.ordinal()] == 1) {
            this.b.clear();
        }
    }

    public String getCurStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a6d127c", new Object[]{this});
        }
        return this.f3591a.name();
    }

    public String readCache(final String str, final String[] strArr, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9fcd79fe", new Object[]{this, str, strArr, new Boolean(z), new Boolean(z2)});
        }
        try {
            return (String) TaskHelper.submitTask(new Callable<String>() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.Callable
                public String call() throws Exception {
                    String str2;
                    String[] strArr2;
                    String[] strArr3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("5fe77b5b", new Object[]{this});
                    }
                    if (AnonymousClass4.$SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[MspCacheManager.access$100(MspCacheManager.this).ordinal()] != 1) {
                        str2 = null;
                    } else if (MspCacheManager.access$200(MspCacheManager.this)) {
                        str2 = MspCacheManager.access$300(MspCacheManager.this).getTwoLevel(str, strArr);
                    } else {
                        str2 = MspCacheManager.access$300(MspCacheManager.this).get(str);
                    }
                    if (!TextUtils.isEmpty(str2) || !z) {
                        return str2;
                    }
                    try {
                        if (z2) {
                            str2 = MspCacheManager.access$400(MspCacheManager.this, str);
                        } else {
                            str2 = MspCacheManager.access$500(MspCacheManager.this, str);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            MspCacheManager.access$300(MspCacheManager.this).put(str, str2);
                        }
                        if (TextUtils.isEmpty(str2) || (strArr2 = strArr) == null || strArr2.length <= 0) {
                            return str2;
                        }
                        JSONObject parseObject = JSON.parseObject(str2);
                        JSONObject jSONObject = new JSONObject();
                        for (String str3 : strArr) {
                            jSONObject.put(str3, (Object) parseObject.getString(str3));
                        }
                        return jSONObject.toJSONString();
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                        return str2;
                    }
                }
            }).get();
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public void setStrategy(Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("208a8509", new Object[]{this, strategy});
            return;
        }
        this.f3591a = strategy;
        if (AnonymousClass4.$SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[strategy.ordinal()] == 1 && this.b.hasEvictedListener()) {
            this.b.setEvictedListener(null);
        }
    }

    public void setTwoLevelCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132acba5", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void writeCache(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2e9496", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            writeCache(str, str2, z, false);
        }
    }

    public static /* synthetic */ String access$400(MspCacheManager mspCacheManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd1ca7c7", new Object[]{mspCacheManager, str});
        }
        return PhoneCashierMspEngine.getMspBase().readSecStorage(str, "msp", false);
    }

    public static /* synthetic */ void access$600(MspCacheManager mspCacheManager, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ad4b05", new Object[]{mspCacheManager, str, str2});
        } else {
            PhoneCashierMspEngine.getMspBase().setSecStorage(str, "msp", str2, false);
        }
    }

    public static /* synthetic */ void access$700(MspCacheManager mspCacheManager, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76782c6", new Object[]{mspCacheManager, str, str2});
            return;
        }
        try {
            str3 = FileUtils.md5(str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            str3 = str;
        }
        try {
            if (mspCacheManager.c != null) {
                DiskLruCache.Editor edit = mspCacheManager.c.edit(str3);
                edit.set(0, str2);
                edit.commit();
                mspCacheManager.c.flush();
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        PrefUtils.putString(str, "msp", str2);
    }

    public static MspCacheManager getInstance(Strategy strategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspCacheManager) ipChange.ipc$dispatch("8ae10577", new Object[]{strategy});
        }
        if (f == null) {
            synchronized (MspCacheManager.class) {
                try {
                    if (f == null) {
                        f = new MspCacheManager(strategy);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            f.setStrategy(strategy);
        }
        return f;
    }

    public void writeCache(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a4b0fe", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)});
        } else {
            writeCache(str, str2, z, z2, false);
        }
    }

    public void writeCache(final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af22196", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.cache.MspCacheManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (z && TextUtils.isEmpty(MspCacheManager.access$300(MspCacheManager.this).get(str))) {
                        try {
                            if (z2) {
                                str3 = MspCacheManager.access$400(MspCacheManager.this, str);
                            } else {
                                str3 = MspCacheManager.access$500(MspCacheManager.this, str);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                MspCacheManager.access$300(MspCacheManager.this).put(str, str3);
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                        }
                    }
                    String str4 = str2;
                    if (AnonymousClass4.$SwitchMap$com$alipay$android$msp$framework$cache$MspCacheManager$Strategy[MspCacheManager.access$100(MspCacheManager.this).ordinal()] == 1) {
                        if (!MspCacheManager.access$200(MspCacheManager.this) || z3) {
                            MspCacheManager.access$300(MspCacheManager.this).put(str, str2);
                        } else {
                            str4 = MspCacheManager.access$300(MspCacheManager.this).putTwoLevel(str, str2);
                        }
                    }
                    if (!z) {
                        return;
                    }
                    if (z2) {
                        MspCacheManager.access$600(MspCacheManager.this, str, str4);
                    } else {
                        MspCacheManager.access$700(MspCacheManager.this, str, str4);
                    }
                }
            });
        }
    }

    public String readCache(String str, String[] strArr, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9488c0ae", new Object[]{this, str, strArr, new Boolean(z)}) : readCache(str, strArr, z, false);
    }
}
