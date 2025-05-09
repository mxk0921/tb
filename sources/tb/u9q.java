package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import tb.yve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u9q<T extends yve> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PriorityQueue<T> f29243a;
    public final int b;

    static {
        t2o.a(737149037);
    }

    public u9q() {
        int maxFilesSize = hg4.j().i().getMaxFilesSize();
        this.b = maxFilesSize;
        this.f29243a = new PriorityQueue<>(maxFilesSize, Collections.reverseOrder());
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6642dde", new Object[]{this, t});
            return;
        }
        try {
            if (this.f29243a.size() < this.b) {
                this.f29243a.add(t);
            } else if (this.f29243a.peek() != null && t.getSize() > this.f29243a.peek().getSize()) {
                this.f29243a.poll();
                this.f29243a.add(t);
            }
        } catch (Exception e) {
            TLog.loge(yr2.MODULE, "SortFileList", "add Error ->" + e);
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        return this.f29243a.size();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        try {
            return JSON.toJSONString(new ArrayList(this.f29243a));
        } catch (Exception e) {
            TLog.loge(yr2.MODULE, "SortFileList", "toJsonString Error ->" + e);
            return "";
        }
    }

    public Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("11d78b78", new Object[]{this});
        }
        HashMap hashMap = new HashMap(4);
        PriorityQueue<T> priorityQueue = this.f29243a;
        if (!(priorityQueue == null || priorityQueue.size() == 0)) {
            Iterator<T> it = this.f29243a.iterator();
            while (it.hasNext()) {
                T next = it.next();
                if (next.getName() != null) {
                    hashMap.put(next.getName(), next.path());
                }
            }
        }
        return hashMap;
    }
}
