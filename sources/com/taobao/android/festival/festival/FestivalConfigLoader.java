package com.taobao.android.festival.festival;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.festival.GloblaNavUIConfig;
import com.taobao.android.festival.business.data.FestivalInfoData;
import com.taobao.android.festival.business.data.FestivalResponse;
import com.taobao.android.festival.business.data.FestivalResponseData;
import com.taobao.android.festival.business.data.FestivalValueData;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbelder.TBElder;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;
import tb.b1q;
import tb.bud;
import tb.n1q;
import tb.p69;
import tb.s0m;
import tb.t2o;
import tb.w69;
import tb.wl2;
import tb.z8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FestivalConfigLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static long j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Map<String, FestivalValueData[]>> f7665a;
    public Map<String, Map<String, FestivalValueData[]>> b;
    public String c;
    public long d;
    public long e;
    public List<Long> f;
    public List<Long> g;
    public final Map<Long, Set<String>> h;
    public final Map<Long, Set<String>> i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FestivalConfigLoader festivalConfigLoader) {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (!z) {
                FestivalConfigLoader.m().y(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends TypeReference<Map<String, Map<String, FestivalValueData[]>>> {
            public a(b bVar) {
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                byte[] j = b1q.j("festival_config");
                if (j != null && j.length > 0) {
                    Map<String, Map<String, FestivalValueData[]>> map = (Map) JSON.parseObject(new String(j, Charset.forName("UTF-8")), new a(this), Feature.AllowComment);
                    String g = b1q.g("festival_config_version");
                    if (map != null && !TextUtils.isEmpty(g)) {
                        if (FestivalConfigLoader.this.p(map)) {
                            b1q.c("festival_config");
                            b1q.k("festival_config_version", "");
                            return;
                        }
                        FestivalConfigLoader festivalConfigLoader = FestivalConfigLoader.this;
                        festivalConfigLoader.c = g;
                        FestivalConfigLoader.a(festivalConfigLoader, map);
                        if (FestivalConfigLoader.this.A()) {
                            FestivalConfigLoader.b(FestivalConfigLoader.this);
                            FestivalConfigLoader.this.v();
                        }
                    }
                }
            } catch (Exception e) {
                TLog.loge("festival.Loader", "load config error" + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7667a;

        public c(boolean z) {
            this.f7667a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f7667a || FestivalConfigLoader.c(FestivalConfigLoader.this)) {
                FestivalConfigLoader.d(SDKUtils.getCorrectionTime());
                try {
                    FestivalInfoData e = FestivalConfigLoader.e(FestivalConfigLoader.this);
                    if (e != null && !FestivalConfigLoader.this.p(e.content) && !TextUtils.equals(e.version, FestivalConfigLoader.this.c)) {
                        FestivalConfigLoader festivalConfigLoader = FestivalConfigLoader.this;
                        festivalConfigLoader.c = e.version;
                        FestivalConfigLoader.a(festivalConfigLoader, e.content);
                        if (FestivalConfigLoader.this.A()) {
                            FestivalConfigLoader.f(FestivalConfigLoader.this);
                        }
                        FestivalConfigLoader.this.v();
                        FestivalConfigLoader.b(FestivalConfigLoader.this);
                        b1q.m("festival_config", JSON.toJSONBytes(e.content, new SerializerFeature[0]));
                        b1q.k("festival_config_version", FestivalConfigLoader.this.c);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends TypeReference<Map<String, Map<String, FestivalValueData[]>>> {
        public e(FestivalConfigLoader festivalConfigLoader) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f {
        public static final FestivalConfigLoader instance = new FestivalConfigLoader(null);

        static {
            t2o.a(464519223);
        }
    }

    static {
        t2o.a(464519211);
    }

    public /* synthetic */ FestivalConfigLoader(a aVar) {
        this();
    }

    public static /* synthetic */ Map a(FestivalConfigLoader festivalConfigLoader, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160d3ff3", new Object[]{festivalConfigLoader, map});
        }
        festivalConfigLoader.f7665a = map;
        return map;
    }

    public static /* synthetic */ void b(FestivalConfigLoader festivalConfigLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5eeec8", new Object[]{festivalConfigLoader});
        } else {
            festivalConfigLoader.z();
        }
    }

    public static /* synthetic */ boolean c(FestivalConfigLoader festivalConfigLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("198e76eb", new Object[]{festivalConfigLoader})).booleanValue();
        }
        return festivalConfigLoader.t();
    }

    public static /* synthetic */ long d(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80d9c2db", new Object[]{new Long(j2)})).longValue();
        }
        j = j2;
        return j2;
    }

    public static /* synthetic */ FestivalInfoData e(FestivalConfigLoader festivalConfigLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalInfoData) ipChange.ipc$dispatch("208c9a56", new Object[]{festivalConfigLoader});
        }
        return festivalConfigLoader.k();
    }

    public static /* synthetic */ void f(FestivalConfigLoader festivalConfigLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("581d0f44", new Object[]{festivalConfigLoader});
        } else {
            festivalConfigLoader.w();
        }
    }

    public static /* synthetic */ boolean g(FestivalConfigLoader festivalConfigLoader, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59cd31c6", new Object[]{festivalConfigLoader, map})).booleanValue();
        }
        return festivalConfigLoader.u(map);
    }

    public static /* synthetic */ Map h(FestivalConfigLoader festivalConfigLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4c77e637", new Object[]{festivalConfigLoader});
        }
        return festivalConfigLoader.b;
    }

    public static /* synthetic */ Map i(FestivalConfigLoader festivalConfigLoader, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2ff901ba", new Object[]{festivalConfigLoader, map});
        }
        festivalConfigLoader.b = map;
        return map;
    }

    public static FestivalConfigLoader m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalConfigLoader) ipChange.ipc$dispatch("407db123", new Object[0]);
        }
        return f.instance;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95548c2", new Object[0])).booleanValue();
        }
        return !TBRevisionSwitchManager.c().p() && TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE);
    }

    public synchronized boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a184fc7", new Object[]{this})).booleanValue();
        } else if (this.b == null) {
            return false;
        } else {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                if (s((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public synchronized String l(String str, String str2) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6204afec", new Object[]{this, str, str2});
            }
            Map<String, Map<String, FestivalValueData[]>> map = this.b;
            if (map == null) {
                return null;
            }
            Map<String, FestivalValueData[]> map2 = map.get(str);
            if (map2 != null && !map2.isEmpty()) {
                FestivalValueData[] festivalValueDataArr = map2.get(str2);
                if (!(festivalValueDataArr == null || festivalValueDataArr.length == 0)) {
                    for (FestivalValueData festivalValueData : festivalValueDataArr) {
                        if (r(festivalValueData)) {
                            return festivalValueData.content;
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            Coordinator.postTaskToHandler(new b());
        }
    }

    public boolean p(Map<String, Map<String, FestivalValueData[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84f8b7a1", new Object[]{this, map})).booleanValue();
        }
        if (map == null || map.isEmpty()) {
            return true;
        }
        Iterator it = new HashSet(map.keySet()).iterator();
        long j2 = -1;
        while (it.hasNext()) {
            Map<String, FestivalValueData[]> map2 = map.get((String) it.next());
            if (map2 != null) {
                for (FestivalValueData[] festivalValueDataArr : map2.values()) {
                    if (festivalValueDataArr != null) {
                        for (FestivalValueData festivalValueData : festivalValueDataArr) {
                            long j3 = festivalValueData.gmt_end;
                            if (j3 > j2) {
                                j2 = j3;
                            }
                        }
                    }
                }
            }
        }
        long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
        if (j2 == -1 || j2 >= correctionTimeMillis) {
            return false;
        }
        return true;
    }

    public final boolean r(FestivalValueData festivalValueData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ccd4bf2", new Object[]{this, festivalValueData})).booleanValue();
        }
        if (festivalValueData == null || festivalValueData.gmt_start == -1 || festivalValueData.gmt_end == -1) {
            return false;
        }
        long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
        if (correctionTimeMillis < festivalValueData.gmt_start || correctionTimeMillis >= festivalValueData.gmt_end) {
            return false;
        }
        return true;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30a1d5e2", new Object[]{this})).booleanValue();
        }
        long e2 = w69.e();
        if (e2 <= 0 || j + e2 < SDKUtils.getCorrectionTime()) {
            return true;
        }
        return false;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f935d2f8", new Object[]{this});
        } else {
            wl2.c(Globals.getApplication(), FestivalMgr.FESTIVAL_CHANGE_REASON_CONFIG_CHANGE);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ff8de7", new Object[]{this});
        } else {
            Coordinator.execute(new d());
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d99d28", new Object[]{this, new Boolean(z)});
        } else {
            Coordinator.postTaskToHandler(new c(z));
        }
    }

    public final synchronized void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb051ae0", new Object[]{this});
        } else if (this.b != null) {
            ((ConcurrentHashMap) this.h).clear();
            ((ConcurrentHashMap) this.i).clear();
            for (String str : this.b.keySet()) {
                Map<String, FestivalValueData[]> map = this.b.get(str);
                if (map != null && !map.isEmpty()) {
                    for (FestivalValueData[] festivalValueDataArr : map.values()) {
                        if (!(festivalValueDataArr == null || festivalValueDataArr.length == 0)) {
                            for (FestivalValueData festivalValueData : festivalValueDataArr) {
                                if (festivalValueData.gmt_end >= festivalValueData.gmt_start) {
                                    long correctionTimeMillis = SDKUtils.getCorrectionTimeMillis();
                                    long j2 = festivalValueData.gmt_start;
                                    long j3 = j2 - correctionTimeMillis;
                                    if (j2 != -1 && j3 > 0) {
                                        Set set = (Set) ((ConcurrentHashMap) this.h).get(Long.valueOf(j2));
                                        if (set == null) {
                                            set = new HashSet();
                                            ((ConcurrentHashMap) this.h).put(Long.valueOf(festivalValueData.gmt_start), set);
                                        }
                                        if (set.size() < 100) {
                                            set.add(str);
                                        }
                                    }
                                    long j4 = festivalValueData.gmt_end;
                                    long j5 = j4 - correctionTimeMillis;
                                    if (j4 != -1 && j5 > 0) {
                                        Set set2 = (Set) ((ConcurrentHashMap) this.i).get(Long.valueOf(j4));
                                        if (set2 == null) {
                                            set2 = new HashSet();
                                            ((ConcurrentHashMap) this.i).put(Long.valueOf(festivalValueData.gmt_end), set2);
                                        }
                                        if (set2.size() < 100) {
                                            set2.add(str);
                                        }
                                    }
                                    long j6 = this.e;
                                    long j7 = festivalValueData.gmt_end;
                                    if (j6 < j7) {
                                        this.e = j7;
                                    }
                                    long j8 = this.d;
                                    long j9 = festivalValueData.gmt_start;
                                    if (j8 > j9) {
                                        this.d = j9;
                                    }
                                } else {
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
            this.f = new ArrayList(((ConcurrentHashMap) this.h).keySet());
            this.g = new ArrayList(((ConcurrentHashMap) this.i).keySet());
            Collections.sort(this.f);
            Collections.sort(this.g);
            B();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Log.e("festival.Loader", "开始尝试加载预览氛围...");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7670a;

            public b(int i) {
                this.f7670a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e("festival.Loader", "正在获取预览氛围，请等待 " + this.f7670a);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Log.e("festival.Loader", "未能获取预览氛围，可能是服务端预览白名单响应超时。请重新扫码。");
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.festival.festival.FestivalConfigLoader$d$d  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0411d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0411d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e("festival.Loader", "氛围 version = " + FestivalConfigLoader.this.c);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FestivalResponse b2 = p69.b(Globals.getApplication(), "0");
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new a());
            int i = -1;
            while (i < 10) {
                i++;
                if (b2 != null && b2.getData() != null && (b2.getData() == null || (b2.getData().data != null && b2.getData().data.size() != 0))) {
                    if (!(b2.getData() == null || b2.getData().data == null || b2.getData().data.size() <= 0)) {
                        break;
                    }
                } else {
                    try {
                        handler.post(new b(i));
                        Thread.sleep(3000L);
                    } catch (Exception unused) {
                    }
                    b2 = p69.b(Globals.getApplication(), "0");
                }
            }
            if (!(b2 == null || b2.getData() == null || (b2.getData().data != null && b2.getData().data.size() != 0))) {
                handler.post(new c());
            }
            if (b2 != null && b2.getData() != null) {
                String str = b2.getData().modified;
                if (!TextUtils.isEmpty(str) && str.equals("y")) {
                    FestivalResponseData data = b2.getData();
                    FestivalConfigLoader.a(FestivalConfigLoader.this, data.data);
                    FestivalConfigLoader festivalConfigLoader = FestivalConfigLoader.this;
                    String str2 = data.version;
                    if (str2 == null) {
                        str2 = "";
                    }
                    festivalConfigLoader.c = str2;
                    if (FestivalConfigLoader.g(festivalConfigLoader, data.data)) {
                        FestivalConfigLoader.i(FestivalConfigLoader.this, data.data);
                        FestivalConfigLoader.d(SDKUtils.getCorrectionTime());
                        if (FestivalConfigLoader.h(FestivalConfigLoader.this) != null && !FestivalConfigLoader.h(FestivalConfigLoader.this).isEmpty()) {
                            FestivalConfigLoader.f(FestivalConfigLoader.this);
                        }
                        try {
                            FestivalConfigLoader.this.v();
                            FestivalConfigLoader.b(FestivalConfigLoader.this);
                            b1q.m("festival_config", JSON.toJSONBytes(data, new SerializerFeature[0]));
                            b1q.k("festival_config_version", FestivalConfigLoader.this.c);
                            handler.post(new RunnableC0411d());
                        } catch (Exception unused2) {
                            Log.e("festival.Loader", "parse config  error");
                        }
                    }
                }
            }
        }
    }

    public FestivalConfigLoader() {
        this.c = "";
        this.d = Long.MAX_VALUE;
        this.e = -1L;
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        OrangeConfig.getInstance().registerListener(new String[]{"festival_data"}, new a(this));
        LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(new BroadcastReceiver(this) { // from class: com.taobao.android.festival.festival.FestivalConfigLoader.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/festival/FestivalConfigLoader$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                try {
                    GloblaNavUIConfig.c();
                } catch (Throwable unused) {
                }
            }
        }, new IntentFilter(FestivalMgr.ACTION_FESTIVAL_CHANGE));
    }

    public final FestivalInfoData k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FestivalInfoData) ipChange.ipc$dispatch("27686f18", new Object[]{this});
        }
        if ("true".equals(w69.b(w69.SP_KEY_ENABLE_MTOP, "true"))) {
            FestivalInfoData a2 = p69.a();
            if (a2 == null || a2.content == null || TextUtils.isEmpty(a2.version)) {
                return null;
            }
            if (a2.enable) {
                return a2;
            }
        }
        OrangeConfig instance = OrangeConfig.getInstance();
        FestivalInfoData festivalInfoData = new FestivalInfoData();
        String config = instance.getConfig("festival_data", "content", "");
        String config2 = instance.getConfig("festival_data", "version", "");
        if (TextUtils.isEmpty(config) || TextUtils.isEmpty(config2)) {
            return null;
        }
        festivalInfoData.content = (Map) JSON.parseObject(config, new e(this), new Feature[0]);
        festivalInfoData.version = config2;
        return festivalInfoData;
    }

    public synchronized boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eec0fd5b", new Object[]{this})).booleanValue();
        } else if (u(this.f7665a)) {
            this.b = this.f7665a;
            return true;
        } else {
            this.b = null;
            return false;
        }
    }

    public synchronized void B() {
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af51a83", new Object[]{this});
            return;
        }
        while (true) {
            if (this.f.isEmpty()) {
                j2 = 0;
                break;
            }
            j2 = this.f.get(0).longValue();
            if (j2 - SDKUtils.getCorrectionTimeMillis() > 0) {
                break;
            }
            this.f.remove(0);
        }
        while (true) {
            if (this.g.isEmpty()) {
                j3 = 0;
                break;
            }
            j3 = this.g.get(0).longValue();
            if (j3 - SDKUtils.getCorrectionTimeMillis() > 0 || this.g.size() == 1) {
                break;
            }
            this.g.remove(0);
        }
        if (j2 > 0 && j2 < j3) {
            this.f.remove(0);
            wl2.b(j2 - SDKUtils.getCorrectionTimeMillis());
        } else if (j3 > 0) {
            this.g.remove(0);
            wl2.b(j3 - SDKUtils.getCorrectionTimeMillis());
        }
    }

    public synchronized Map<String, String> n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc22d04a", new Object[]{this, str});
        }
        Map<String, Map<String, FestivalValueData[]>> map = this.b;
        if (map == null) {
            return null;
        }
        Map<String, FestivalValueData[]> map2 = map.get(str);
        if (map2 != null && !map2.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (String str2 : map2.keySet()) {
                FestivalValueData[] festivalValueDataArr = map2.get(str2);
                if (festivalValueDataArr != null && festivalValueDataArr.length != 0) {
                    int length = festivalValueDataArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            FestivalValueData festivalValueData = festivalValueDataArr[i];
                            if (r(festivalValueData)) {
                                hashMap.put(str2, festivalValueData.content);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return hashMap;
        }
        return null;
    }

    public synchronized boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f24a39f8", new Object[]{this, str})).booleanValue();
        }
        Map<String, Map<String, FestivalValueData[]>> map = this.b;
        if (map == null) {
            return false;
        }
        Map<String, FestivalValueData[]> map2 = map.get(str);
        if (map2 != null && !map2.isEmpty()) {
            for (FestivalValueData[] festivalValueDataArr : map2.values()) {
                if (!(festivalValueDataArr == null || festivalValueDataArr.length == 0)) {
                    for (FestivalValueData festivalValueData : festivalValueDataArr) {
                        if (r(festivalValueData)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean u(Map<String, Map<String, FestivalValueData[]>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10151f58", new Object[]{this, map})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        boolean b2 = TBElder.b();
        Map<String, FestivalValueData[]> map2 = map.get("global");
        if (map2 == null) {
            return true;
        }
        FestivalValueData[] festivalValueDataArr = map2.get("ignoreElder");
        if (festivalValueDataArr != null) {
            for (FestivalValueData festivalValueData : festivalValueDataArr) {
                if (Boolean.parseBoolean(festivalValueData.content) && b2) {
                    return false;
                }
            }
        }
        boolean q = q();
        FestivalValueData[] festivalValueDataArr2 = map2.get("ignoreForeign");
        if (festivalValueDataArr2 != null) {
            for (FestivalValueData festivalValueData2 : festivalValueDataArr2) {
                if (Boolean.parseBoolean(festivalValueData2.content) && !q) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb47459", new Object[]{this});
            return;
        }
        try {
            Map<String, Map<String, FestivalValueData[]>> map = this.b;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Map<String, FestivalValueData[]> map2 : this.b.values()) {
                    if (map2 != null && !map2.isEmpty()) {
                        for (FestivalValueData[] festivalValueDataArr : map2.values()) {
                            if (!(festivalValueDataArr == null || festivalValueDataArr.length == 0)) {
                                for (FestivalValueData festivalValueData : festivalValueDataArr) {
                                    if (festivalValueData != null && !TextUtils.isEmpty(festivalValueData.content) && n1q.b(festivalValueData.content)) {
                                        arrayList.add(festivalValueData.content);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    s0m.B().e0("common", arrayList).b();
                }
            }
        } catch (Throwable th) {
            TLog.loge("festival.Loader", "load image error" + th.getMessage());
        }
    }
}
