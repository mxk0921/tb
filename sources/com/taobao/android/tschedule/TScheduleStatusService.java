package com.taobao.android.tschedule;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.aidl.ITScheduleStatus;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.cns;
import tb.t2o;
import tb.xls;
import tb.zdh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TScheduleStatusService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TS.StatusService";
    public static final Map<String, String> b = new ConcurrentHashMap();
    public static final Set<String> c = new HashSet();
    public static final HashMap<String, String> d = new HashMap<>();
    public static final HashMap<String, String> e = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final TScheduleStatusBinder f9706a = new TScheduleStatusBinder();

    static {
        t2o.a(329252881);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d589fca7", new Object[0]);
        }
        return c;
    }

    public static /* synthetic */ HashMap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c31871c", new Object[0]);
        }
        return d;
    }

    public static void d(String str, String str2, List<TimeContent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e517c38", new Object[]{str, str2, list});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = cns.i(str2, list).content;
            if (str2.startsWith(xls.PREFIX)) {
                String substring = str2.substring(9);
                HashMap<String, String> hashMap = d;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = cns.c(str3);
                }
                hashMap.put(substring, str2);
                return;
            }
            d.put(str, cns.c(str3));
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87c7273", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            e.put(str, str2);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24802ce", new Object[0]);
            return;
        }
        HashMap<String, String> hashMap = e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2107aac5", new Object[]{str});
        }
        String str2 = (String) ((ConcurrentHashMap) b).get(str);
        if (!TextUtils.isEmpty(str2)) {
            String e2 = cns.e(UTABTest.COMPONENT_URI, str2, "bucket");
            if (!TextUtils.isEmpty(e2) && !TextUtils.equals(e2, str2)) {
                zdh.a(TAG, "fetch url from utabtest, new url = " + e2 + ", originUrl=" + str2);
                return e2;
            }
        }
        return str2;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e186b8c", new Object[]{str});
        }
        return e.get(str);
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb356d69", new Object[0]);
        }
        return JSON.toJSONString(e);
    }

    public static /* synthetic */ Object ipc$super(TScheduleStatusService tScheduleStatusService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/TScheduleStatusService");
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44196b44", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return e.values().contains(str);
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e0de04", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            e.remove(str);
        }
    }

    public static String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aaa0ca", new Object[]{str});
        }
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<String> it = e.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (TextUtils.equals(str, e.get(next))) {
                str2 = next;
                break;
            }
        }
        if (str2 != null) {
            e.remove(str2);
        }
        return str2;
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else {
            d.clear();
        }
    }

    public static void n(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd32672", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            String str4 = (String) ((ConcurrentHashMap) b).get(str);
            if (!TextUtils.equals(str4, str2)) {
                Iterator<String> it = e.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = null;
                        break;
                    }
                    str3 = it.next();
                    if (TextUtils.equals(str4, e.get(str3))) {
                        break;
                    }
                }
                if (str3 != null) {
                    ((HashSet) c).add(str3);
                    TScheduleInitialize.e().f();
                }
            }
            ((ConcurrentHashMap) b).put(str, str2);
            HashMap<String, String> hashMap = d;
            if (hashMap.containsKey(str)) {
                hashMap.put(str, cns.c(str2));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return this.f9706a;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class TScheduleStatusBinder extends ITScheduleStatus.Stub {
        static {
            t2o.a(329252882);
        }

        public TScheduleStatusBinder() {
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void addConfigUrl(String str, String str2) {
            TScheduleStatusService.d(str, str2, null);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void addRenderUrl(String str, String str2) {
            TScheduleStatusService.e(str, str2);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void finishChange(String str) {
            TScheduleStatusService.b().remove(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getChangeFlags() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(TScheduleStatusService.b());
            return JSON.toJSONString(hashSet);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getPageKeys() {
            return JSON.toJSONString(TScheduleStatusService.a().keySet());
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getPageUrl(String str) {
            return TScheduleStatusService.g(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getRenderUrl(String str) {
            return TScheduleStatusService.h(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String getRenderUrls() {
            return TScheduleStatusService.i();
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public boolean isConfigrUrl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return TScheduleStatusService.c().values().contains(cns.c(str));
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public boolean isRenderUrl(String str) {
            return TScheduleStatusService.j(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void removeRenderUrlByKey(String str) {
            TScheduleStatusService.k(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public String removeRenderUrlByValue(String str) {
            return TScheduleStatusService.l(str);
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void reset() {
            TScheduleStatusService.m();
        }

        @Override // com.taobao.android.tschedule.aidl.ITScheduleStatus
        public void updatePageUrl(String str, String str2) {
            TScheduleStatusService.n(str, str2);
        }

        public void basicTypes(int i, long j, boolean z, float f, double d, String str) throws RemoteException {
        }
    }
}
