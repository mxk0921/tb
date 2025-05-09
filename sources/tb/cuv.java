package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cuv extends g2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f17333a = a();

    static {
        t2o.a(1034944673);
    }

    public cuv() {
        stv.d();
    }

    public static /* synthetic */ Object ipc$super(cuv cuvVar, String str, Object... objArr) {
        if (str.hashCode() == 1666655856) {
            return super.onEventDispatch((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3], (String) objArr[4]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/internal/usertrack/UserTrackPlugin");
    }

    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("16b7f467", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        hashSet.add(oeh.SDKTYPE);
        hashSet.add("PAGE");
        hashSet.add(oeh.ARG1);
        hashSet.add(oeh.ARG2);
        hashSet.add(oeh.ARG3);
        hashSet.add(oeh.EVENTID);
        hashSet.add("_priority");
        return hashSet;
    }

    @Override // tb.g2v
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
        }
        return kzo.c().h();
    }

    @Override // tb.g2v
    public String getPluginName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
        }
        return ttf.CONFIG_GROUP_WALLE;
    }

    @Override // tb.g2v
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        return b(str, i, str2, str3, str4, map, null);
    }

    public Map<String, String> b(String str, int i, String str2, String str3, String str4, Map<String, String> map, DAICallback dAICallback) {
        HashMap<String, String> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b5afc413", new Object[]{this, str, new Integer(i), str2, str3, str4, map, dAICallback});
        }
        try {
        } catch (Throwable th) {
            kgh.d("UserTrackPlugin", th.getMessage(), th);
        }
        if (!kzo.c().m()) {
            return super.onEventDispatch(str, i, str2, str3, str4);
        }
        UserTrackDO userTrackDO = new UserTrackDO();
        userTrackDO.setPageName(str);
        userTrackDO.setEventId(i);
        userTrackDO.setArg1(str2);
        userTrackDO.setArg2(str3);
        userTrackDO.setArg3(str4);
        if (i == 2001) {
            userTrackDO.setPageStayTime(ewv.f(str4, 0L));
        }
        if (map != null) {
            HashMap hashMap = new HashMap();
            String str5 = map.get(oeh.ARGS);
            if (!TextUtils.isEmpty(str5) && (e = frq.e(str5, ",", "=", true)) != null) {
                userTrackDO.setAuctionId(ewv.f(e.get("item_id"), 0L));
                hashMap.putAll(e);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!this.f17333a.contains(entry.getKey())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            userTrackDO.setArgs(hashMap);
            if (userTrackDO.getAuctionId() <= 0) {
                userTrackDO.setAuctionId(ewv.f(map.get("item_id"), 0L));
            }
        }
        userTrackDO.setCreateTime(System.currentTimeMillis());
        if (ld0.c() != null) {
            userTrackDO.setOwnerId(ld0.c().getUserId());
        }
        stv.d().f(userTrackDO);
        return super.onEventDispatch(str, i, str2, str3, str4);
    }
}
