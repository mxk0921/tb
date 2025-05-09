package com.taobao.mass;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MassService implements IMassService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG = MassService.class.getSimpleName();
    private static volatile MassService instance;
    private HashMap<String, Set<String>> topicMap = new HashMap<>();

    static {
        t2o.a(343933314);
        t2o.a(343933308);
    }

    private MassService() {
    }

    public static MassService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MassService) ipChange.ipc$dispatch("b6fa29ca", new Object[0]);
        }
        if (instance == null) {
            synchronized (MassClient.class) {
                try {
                    if (instance == null) {
                        instance = new MassService();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // com.taobao.mass.IMassService
    public List<String> getTopicsByService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b740deb2", new Object[]{this, str});
        }
        Set<String> set = this.topicMap.get(str);
        if (set == null) {
            return Collections.emptyList();
        }
        return new ArrayList(set);
    }

    @Override // com.taobao.mass.IMassService
    public void registerTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba126267", new Object[]{this, str, str2});
            return;
        }
        ALog.i(TAG, "registerTopic", "topic", str2);
        Set<String> set = this.topicMap.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.topicMap.put(str, set);
        }
        if (!set.contains(str2)) {
            set.add(str2);
        }
    }

    @Override // com.taobao.mass.IMassService
    public void unregisterTopic(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56dc16e", new Object[]{this, str, str2});
            return;
        }
        ALog.i(TAG, "unregisterTopic", "topic", str2);
        Set<String> set = this.topicMap.get(str);
        if (set != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().equals(str2)) {
                    ALog.i(TAG, "unregisterTopic remove success", "topic", str2);
                    it.remove();
                }
            }
        }
    }
}
