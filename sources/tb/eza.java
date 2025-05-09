package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.NewRangerOptions;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import tb.ynl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eza extends g2v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RANGER_BUCKETS_KEY = "ranger_buckets_native";
    public static final String TRACK_KEY = "ranger_track";
    public static final String UTPARAM_KEY = "utparam-cnt";
    public static eza d;
    public static final int[] e = {2001, 2101, 2201};

    /* renamed from: a  reason: collision with root package name */
    public final Object f18903a = new Object();
    public final ynl b = new ynl();
    public WeakReference<Object> c = null;

    static {
        t2o.a(729809138);
    }

    public static eza b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eza) ipChange.ipc$dispatch("31c16e93", new Object[0]);
        }
        if (d == null) {
            d = new eza();
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(eza ezaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/utils/HomeBucketsUTPlugin");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63553ad9", new Object[]{this});
        } else if (c()) {
            HashMap hashMap = new HashMap();
            hashMap.put(tm2.HOME_BUCKETS, "404");
            bqa.d(RPCDataItems.SWITCH_TAG_LOG, "符合条件，过滤替换 home_buckets");
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
        }
    }

    public final boolean c() {
        Object obj;
        Map<String, String> pageProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b55f031", new Object[]{this})).booleanValue();
        }
        WeakReference<Object> weakReference = this.c;
        if (weakReference == null) {
            obj = null;
        } else {
            obj = weakReference.get();
        }
        if (obj == null || (pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj)) == null || !pageProperties.containsKey("clearNdHomeBuckets")) {
            return false;
        }
        return true;
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd381fd0", new Object[]{this, obj});
        } else {
            this.c = new WeakReference<>(obj);
        }
    }

    @Override // tb.g2v
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
        }
        return e;
    }

    @Override // tb.g2v
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        WeakReference<Object> weakReference;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        try {
            if (!(!TextUtils.equals(str, r5a.f27121a) || (weakReference = this.c) == null || weakReference.get() == null)) {
                if (!TextUtils.isEmpty(map.get(RANGER_BUCKETS_KEY))) {
                    return e(this.c.get(), map.get(RANGER_BUCKETS_KEY), null);
                }
                ynl ynlVar = this.b;
                if (!(ynlVar == null || (map2 = ynlVar.f32218a) == null || ((HashMap) map2).isEmpty())) {
                    a();
                    return ynlVar.f32218a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public Map<String, String> e(Object obj, String str, NewRangerOptions newRangerOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("89b8cc8c", new Object[]{this, obj, str, newRangerOptions});
        }
        synchronized (this.f18903a) {
            if (obj != null) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        if (newRangerOptions == null) {
                            newRangerOptions = new NewRangerOptions();
                        }
                        ynl ynlVar = this.b;
                        if (!TextUtils.isEmpty(newRangerOptions.trackGroup)) {
                            ynl.a aVar = (ynl.a) ((HashMap) ynlVar.b).get(newRangerOptions.trackGroup);
                            if (aVar == null) {
                                Map<String, ynl.a> map = ynlVar.b;
                                String str2 = newRangerOptions.trackGroup;
                                ynl.a aVar2 = new ynl.a();
                                ((HashMap) map).put(str2, aVar2);
                                aVar = aVar2;
                            }
                            String[] split = str.split("[|_,\\s]+");
                            aVar.f32219a = split;
                            Collections.addAll(aVar.b, split);
                        } else {
                            Collections.addAll(ynlVar.c, str.split("[|_,\\s]+"));
                        }
                        if (!TextUtils.isEmpty(newRangerOptions.rangerBucketsAlias)) {
                            Collections.addAll(ynlVar.d, newRangerOptions.rangerBucketsAlias.split("[,|\\s]+"));
                        }
                        HashSet hashSet = new HashSet(ynlVar.c);
                        Map<String, String> pageProperties = c2v.getInstance().getPageProperties(obj);
                        if (pageProperties != null && !TextUtils.isEmpty(pageProperties.get(RANGER_BUCKETS_KEY))) {
                            Collections.addAll(hashSet, pageProperties.get(RANGER_BUCKETS_KEY).split("[|_,\\s]+"));
                        }
                        for (ynl.a aVar3 : ((HashMap) ynlVar.b).values()) {
                            if (aVar3 != null) {
                                hashSet.removeAll(aVar3.b);
                                Collections.addAll(hashSet, aVar3.f32219a);
                            }
                        }
                        String join = TextUtils.join("_", hashSet);
                        HashMap hashMap = new HashMap();
                        if (!f4b.b("enableDeleteRangerBucketsNative", true)) {
                            hashMap.put(RANGER_BUCKETS_KEY, join);
                        }
                        Iterator<String> it = ynlVar.d.iterator();
                        while (it.hasNext()) {
                            hashMap.put(it.next(), join);
                        }
                        JSONObject jSONObject = newRangerOptions.commParams;
                        if (jSONObject != null) {
                            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                                if (entry.getValue() instanceof String) {
                                    hashMap.put(entry.getKey(), (String) entry.getValue());
                                }
                            }
                        }
                        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, hashMap);
                        UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, JSON.toJSONString(hashMap));
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap));
                        a();
                        ynlVar.f32218a = hashMap;
                        return hashMap;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }
}
