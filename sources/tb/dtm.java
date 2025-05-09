package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dtm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> f18058a = new ConcurrentHashMap<>();

    public void a(String str, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fdc493", new Object[]{this, str, kcdVar});
            return;
        }
        wsm.c(csm.a("PreloadTaskDataSource"), "清理数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str, kcdVar);
        if (TextUtils.isEmpty(parser.sourceFrom)) {
            wsm.a(csm.a("PreloadTaskDataSource"), "sourceFrom is null");
        } else if (TextUtils.isEmpty(parser.pageToken)) {
            wsm.a(csm.a("PreloadTaskDataSource"), "pageToken  is null");
        } else {
            b(c(parser));
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ac087b", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>>> entry : this.f18058a.entrySet()) {
            String key = entry.getKey();
            if (key.contains(str)) {
                ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> value = entry.getValue();
                this.f18058a.remove(key);
                if (value != null) {
                    value.clear();
                }
            }
        }
    }

    public String c(PreloadTaskEntity preloadTaskEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("57d43de4", new Object[]{this, preloadTaskEntity});
        }
        return preloadTaskEntity.sourceFrom + preloadTaskEntity.pageToken;
    }

    public CopyOnWriteArrayList<PreloadTaskEntity.a> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("e9bc6417", new Object[]{this, str});
        }
        CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f18058a.get(str);
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            for (Map.Entry<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> entry : concurrentHashMap.entrySet()) {
                CopyOnWriteArrayList<PreloadTaskEntity.a> value = entry.getValue();
                if (value != null) {
                    copyOnWriteArrayList.addAll(value);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public void e(String str, kcd kcdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b045a97", new Object[]{this, str, kcdVar});
            return;
        }
        wsm.c(csm.a("PreloadTaskDataSource"), "更新数据源列表");
        PreloadTaskEntity parser = PreloadTaskEntity.parser(str, kcdVar);
        if (TextUtils.isEmpty(parser.sourceFrom)) {
            wsm.a(csm.a("PreloadTaskDataSource"), "sourceFrom is null");
            return;
        }
        ArrayList<PreloadTaskEntity.a> arrayList = parser.items;
        if (arrayList == null || arrayList.isEmpty()) {
            wsm.a(csm.a("PreloadTaskDataSource"), "preloadTaskEntity items is null");
            return;
        }
        String str2 = parser.pageIndex;
        if (TextUtils.isEmpty(str2)) {
            wsm.a(csm.a("PreloadTaskDataSource"), "preloadTaskEntity pageIndex is null");
            return;
        }
        String c = c(parser);
        ConcurrentHashMap<String, CopyOnWriteArrayList<PreloadTaskEntity.a>> concurrentHashMap = this.f18058a.get(c);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        CopyOnWriteArrayList<PreloadTaskEntity.a> copyOnWriteArrayList = concurrentHashMap.get(str2);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.addAll(arrayList);
        concurrentHashMap.put(str2, copyOnWriteArrayList);
        this.f18058a.put(c, concurrentHashMap);
    }
}
