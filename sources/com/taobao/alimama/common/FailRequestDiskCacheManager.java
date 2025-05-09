package com.taobao.alimama.common;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.click.cpc.CpcClickBuilder;
import com.taobao.alimama.click.cpm.CpmClickBuilder;
import com.taobao.alimama.cpm.ifs.IfsBuilder;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.threads.AdThreadExecutor;
import com.taobao.alimama.utils.UserTrackLogs;
import com.taobao.muniontaobaosdk.util.TaoLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.utils.Global;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import tb.gsj;
import tb.i4g;
import tb.obk;
import tb.ow;
import tb.t2o;
import tb.tbl;
import tb.vzo;
import tb.xu6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FailRequestDiskCacheManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_IFS_RETRY_DISK_REQUEST_SWITCH = "ifs_retry_disk_request_switch";

    /* renamed from: a  reason: collision with root package name */
    public final List<FailRequest> f6181a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum SOURCE {
        RETRY("retry"),
        REQUESTING("requesting");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String value;

        SOURCE(String str) {
            this.value = str;
        }

        public static /* synthetic */ Object ipc$super(SOURCE source, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/common/FailRequestDiskCacheManager$SOURCE");
        }

        public static SOURCE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SOURCE) ipChange.ipc$dispatch("411d0a5e", new Object[]{str});
            }
            return (SOURCE) Enum.valueOf(SOURCE.class, str);
        }

        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FailRequestDiskCacheManager.this.j("mama_ad_fail_request_urls");
            SharedPreferencesUtils.removeKey("mama_ad_fail_request_urls");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(FailRequestDiskCacheManager failRequestDiskCacheManager) {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                SharedPreferencesUtils.putString(FailRequestDiskCacheManager.KEY_IFS_RETRY_DISK_REQUEST_SWITCH, tbl.c(FailRequestDiskCacheManager.KEY_IFS_RETRY_DISK_REQUEST_SWITCH, "false"));
            } catch (Exception e) {
                TaoLog.Loge("FailRequestDiskCache", "registerOrangeConfig, onConfigUpdate fail, and error: " + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static volatile FailRequestDiskCacheManager f6183a = new FailRequestDiskCacheManager(null);

        static {
            t2o.a(1017118776);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements gsj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1017118777);
            t2o.a(1018167318);
        }

        public d() {
        }

        @Override // tb.gsj.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("641a3d34", new Object[]{this});
            } else {
                FailRequestDiskCacheManager.this.c();
            }
        }

        @Override // tb.gsj.b
        public void b(Set<ow> set, Set<ow> set2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45f34c0", new Object[]{this, set, set2});
            } else if (!vzo.k(set) || !vzo.k(set2)) {
                Set a2 = FailRequestDiskCacheManager.a(FailRequestDiskCacheManager.this, set, SOURCE.RETRY.getValue());
                a2.addAll(FailRequestDiskCacheManager.a(FailRequestDiskCacheManager.this, set2, SOURCE.REQUESTING.getValue()));
                FailRequestDiskCacheManager.b(FailRequestDiskCacheManager.this, a2);
            } else {
                TaoLog.Logi("FailRequestDiskCache", "tasks is null, dont need to saveIfsUrl to disk, and need to clear key");
                SharedPreferencesUtils.removeKey("mama_ad_fail_request_urls");
            }
        }

        public /* synthetic */ d(FailRequestDiskCacheManager failRequestDiskCacheManager, a aVar) {
            this();
        }
    }

    static {
        t2o.a(1017118773);
    }

    public /* synthetic */ FailRequestDiskCacheManager(a aVar) {
        this();
    }

    public static /* synthetic */ Set a(FailRequestDiskCacheManager failRequestDiskCacheManager, Set set, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("59cc2ca1", new Object[]{failRequestDiskCacheManager, set, str});
        }
        return failRequestDiskCacheManager.e(set, str);
    }

    public static /* synthetic */ void b(FailRequestDiskCacheManager failRequestDiskCacheManager, Set set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed62ee9", new Object[]{failRequestDiskCacheManager, set});
        } else {
            failRequestDiskCacheManager.m(set);
        }
    }

    public static FailRequestDiskCacheManager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FailRequestDiskCacheManager) ipChange.ipc$dispatch("17c3699c", new Object[0]);
        }
        return c.f6183a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7951c1f", new Object[]{this});
            return;
        }
        TaoLog.Loge("FailRequestDiskCache", "enter in commitFailRequestList---- ");
        if (vzo.j(this.f6181a) || !this.b) {
            TaoLog.Loge("FailRequestDiskCache", "commitFailRequestList fail, and failRequestList is empty or ifs_retry_disk_request_switch is false ");
            return;
        }
        Iterator it = ((ArrayList) this.f6181a).iterator();
        while (it.hasNext()) {
            d((FailRequest) it.next());
        }
        ((ArrayList) this.f6181a).clear();
    }

    public final void d(FailRequest failRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1855df9", new Object[]{this, failRequest});
            return;
        }
        String type = failRequest.getType();
        TaoLog.Logi("FailRequestDiskCache", "commitRequest, type: " + type);
        if (TrackType.IFS.getValue().equals(type)) {
            new IfsBuilder(Global.getApplication(), failRequest.getUrl()).withArgs(failRequest.getArgs()).isFromDisk(true).commit();
        } else if (TrackType.CPC.getValue().equals(type)) {
            new CpcClickBuilder(failRequest.getUrl()).withArgs(failRequest.getArgs()).isFromDisk(true).commit();
        } else if (TrackType.CPM.getValue().equals(type)) {
            new CpmClickBuilder(failRequest.getUrl()).withArgs(failRequest.getArgs()).isFromDisk(true).commit();
        } else {
            TaoLog.Logi("FailRequestDiskCache", "commitRequest fail, and do not have valid type, type:" + type);
        }
    }

    public final Set<String> e(Set<ow> set, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("837a36c3", new Object[]{this, set, str});
        }
        TaoLog.Logd("FailRequestDiskCache", "enter in saveRequestString---");
        HashSet hashSet = new HashSet();
        if (vzo.k(set)) {
            TaoLog.Logi("FailRequestDiskCache", "tasks is null, dont need to saveIfsUrl to disk, and need to clear key");
            return hashSet;
        }
        ArrayList arrayList = new ArrayList();
        for (ow owVar : set) {
            if (!(owVar == null || owVar.g() == null || !h(owVar.d()))) {
                arrayList.add(owVar);
            }
        }
        if (arrayList.size() == 0) {
            TaoLog.Logi("FailRequestDiskCache", "validTasks is null, dont need to saveIfsUrl to disk, and need to clear key");
            return hashSet;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ow owVar2 = (ow) it.next();
                String jSONString = JSON.toJSONString(new FailRequest(xu6.a(), str, owVar2.g(), owVar2.d(), owVar2.a()));
                TaoLog.Logd("FailRequestDiskCache", "covertFailRequestSet, and failRequest: " + jSONString);
                hashSet.add(jSONString);
            }
            return hashSet;
        } catch (Exception e) {
            TaoLog.Loge("FailRequestDiskCache", "covertFailRequestSet fail ,and error: " + e.getMessage());
            return hashSet;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        TaoLog.Logd("FailRequestDiskCache", "enter in init---");
        k();
        n();
        AdThreadExecutor.execute(new a());
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c9fcec", new Object[]{this, str})).booleanValue();
        }
        if (Objects.equals(str, TrackType.IFS.getValue()) || Objects.equals(str, TrackType.CPC.getValue()) || Objects.equals(str, TrackType.CPM.getValue())) {
            return true;
        }
        return false;
    }

    public final String i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc89ed70", new Object[]{this, str, str2});
        }
        return str + "=" + str2;
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0f2fca", new Object[]{this, str});
            return;
        }
        TaoLog.Logd("FailRequestDiskCache", "enter in parseLastRequestAndCommitNewOne: ");
        Set<String> stringSet = SharedPreferencesUtils.getStringSet(str);
        if (vzo.k(stringSet)) {
            TaoLog.Loge("FailRequestDiskCache", "parseLastRequestAndCommitNewOne fail, and jsonStr is null");
            return;
        }
        for (String str2 : stringSet) {
            try {
                ((ArrayList) this.f6181a).add((FailRequest) JSON.parseObject(str2, FailRequest.class));
            } catch (Exception e) {
                TaoLog.Loge("FailRequestDiskCache", "parseLastRequestAndCommitNewOne parse object fail, and error:" + e.getMessage() + " ,and json: " + str2);
            }
        }
        if (vzo.m(this.f6181a)) {
            Iterator it = ((ArrayList) this.f6181a).iterator();
            while (it.hasNext()) {
                FailRequest failRequest = (FailRequest) it.next();
                if (failRequest != null) {
                    l(failRequest);
                }
            }
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e41e8ee", new Object[]{this});
        } else {
            gsj.a().b(new d(this, null));
        }
    }

    public final void l(FailRequest failRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b22265", new Object[]{this, failRequest});
            return;
        }
        TaoLog.Logi("FailRequestDiskCache", "ready to report request_fail_cache_disk");
        UserTrackLogs.trackAdLog("request_fail_cache_disk", i("url", vzo.o(failRequest.getUrl())), i("date", failRequest.getDate()), i("source", failRequest.getSource()), i("type", failRequest.getType()));
        i4g.a("request_fail_cache_disk", i("url", vzo.o(failRequest.getUrl())), i("date", failRequest.getDate()), i("source", failRequest.getSource()), i("type", failRequest.getType()));
    }

    public final void m(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3760aa", new Object[]{this, set});
        } else if (vzo.k(set)) {
            TaoLog.Loge("FailRequestDiskCache", "saveFailRequestSet fail, and failRequestSet is empty");
        } else {
            try {
                SharedPreferencesUtils.putStringSet("mama_ad_fail_request_urls", set);
            } catch (Exception e) {
                TaoLog.Loge("FailRequestDiskCache", "saveFailRequestSet fail, and error: " + e.getMessage());
            }
        }
    }

    public FailRequestDiskCacheManager() {
        this.f6181a = new ArrayList();
        this.b = false;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c020280", new Object[]{this});
            return;
        }
        this.b = TextUtils.equals("true", SharedPreferencesUtils.getString(KEY_IFS_RETRY_DISK_REQUEST_SWITCH, "false"));
        OrangeConfig.getInstance().registerListener(new String[]{"alimama_ad"}, new b(this), false);
    }
}
