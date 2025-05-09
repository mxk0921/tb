package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c0a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FULL_LINK_SPLIT = ":";
    public static final String SOURCE_CDN = "cdn";
    public static final int SOURCE_INDEX_CDN = 1;
    public static final int SOURCE_INDEX_MTOP = 3;
    public static final int SOURCE_INDEX_PM = 2;
    public static final int SOURCE_INDEX_PROVIDER = 100;
    public static final String SOURCE_MTOP = "MTOP";
    public static final String SOURCE_PM = "pm";
    public final Map<Integer, Integer> b;
    public HashSet<String> c = new HashSet<>();
    public boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f16751a = new HashMap();

    public c0a(Map<Integer, Integer> map) {
        this.b = map;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59769c75", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = z;
        k6s.a("FullLinkManager", "SetStopReport stopSaveReport: " + this.d);
    }

    public synchronized HashSet<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("63ffbf4a", new Object[]{this});
        }
        HashSet<String> hashSet = this.c;
        this.c = new HashSet<>();
        k6s.a("FullLinkManager", "getTrackFullLinkJson: " + hashSet);
        return hashSet;
    }

    public boolean c(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e420a643", new Object[]{this, str, str2, new Integer(i)})).booleanValue();
        }
        Integer num = (Integer) ((HashMap) this.f16751a).get(Integer.valueOf(i));
        if (num == null) {
            num = this.b.get(Integer.valueOf(i));
        }
        if (num != null && !TextUtils.isEmpty(str)) {
            if (Math.abs((str2 + str).hashCode()) % 100000 < num.intValue()) {
                return true;
            }
        }
        return false;
    }

    public void d(Map<Integer, Integer> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aa69c5", new Object[]{this, map});
        } else {
            ((HashMap) this.f16751a).putAll(map);
        }
    }

    public void e(int i, String str, TLiveMsg tLiveMsg, c1h c1hVar) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf860f5", new Object[]{this, new Integer(i), str, tLiveMsg, c1hVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msgStep", String.valueOf(i));
        hashMap.put("msgSource", str);
        hashMap.put(RemoteMessageConst.MSGID, tLiveMsg.messageId);
        hashMap.put("msgSubtype", String.valueOf(tLiveMsg.type));
        String valueOf = String.valueOf(v2s.o().C().getServerTime());
        hashMap.put("timestamp", valueOf);
        hashMap.put("bizCode", String.valueOf(c1hVar.d));
        hashMap.put("topic", c1hVar.e);
        hashMap.put("channel", c1hVar.f);
        hashMap.put("from", c1hVar.g);
        hashMap.put("deviceId", c1hVar.c);
        if (tLiveMsg.sendFullTags) {
            if (c1hVar.b.r && v2s.o().E() != null) {
                v2s.o().E().track4Click("Page_TaobaoLiveWatch", "LiveMessageSDK_fullLink", hashMap);
            }
            f(i, tLiveMsg.messageId, tLiveMsg.type, valueOf);
        }
        try {
            str2 = JSON.toJSONString(hashMap);
        } catch (Exception unused) {
            str2 = null;
        }
        k6s.a("FullLinkManager", "subType: " + tLiveMsg.type + " colorRate: " + ((HashMap) this.f16751a).get(Integer.valueOf(tLiveMsg.type)) + " msg.sendFullTags: " + tLiveMsg.sendFullTags + " trackFullLink: " + str2);
    }

    public final synchronized void f(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce83bfc3", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
            return;
        }
        k6s.a("FullLinkManager", "trackFullLinkJson stopSaveReport: " + this.d);
        if (!this.d) {
            HashSet<String> hashSet = this.c;
            hashSet.add(i + ":" + str + ":" + i2 + ":" + str2);
        }
    }
}
