package android.taobao.windvane.extra.performance;

import android.taobao.windvane.extra.performance.action.AddPropertyIfAbsentVisitor;
import android.taobao.windvane.extra.performance.action.AddPropertyVisitor;
import android.taobao.windvane.extra.performance.action.AddStageIfAbsentVisitor;
import android.taobao.windvane.extra.performance.action.AddStageVisitor;
import android.taobao.windvane.extra.performance.action.IPerformanceVisitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cce;
import tb.t2o;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVWebViewPageModel implements cce {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<cce> mWebViewPageModelList = new CopyOnWriteArrayList();
    private final ConcurrentHashMap<String, Long> stageMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> propertyMap = new ConcurrentHashMap<>();
    private final List<IPerformanceVisitor> mPerformanceVisitorList = new CopyOnWriteArrayList();

    static {
        t2o.a(989855997);
        t2o.a(989855920);
    }

    public void addWebViewPageModel(cce cceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ed38db", new Object[]{this, cceVar});
        } else if (cceVar != null) {
            if (vpw.commonConfig.r2) {
                try {
                    for (IPerformanceVisitor iPerformanceVisitor : this.mPerformanceVisitorList) {
                        if (iPerformanceVisitor != null) {
                            iPerformanceVisitor.accept(cceVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.mWebViewPageModelList.add(cceVar);
        }
    }

    public ConcurrentHashMap<String, Object> getPropertyMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("6aad66ce", new Object[]{this});
        }
        return this.propertyMap;
    }

    public ConcurrentHashMap<String, Long> getStageMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("9666c20b", new Object[]{this});
        }
        return this.stageMap;
    }

    @Override // tb.cce
    public void onProperty(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1991a501", new Object[]{this, str, obj});
            return;
        }
        this.propertyMap.put(str, obj);
        this.mPerformanceVisitorList.add(new AddPropertyVisitor(str, obj));
        for (cce cceVar : this.mWebViewPageModelList) {
            cceVar.onProperty(str, obj);
        }
    }

    @Override // tb.cce
    public void onPropertyIfAbsent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eb9d7", new Object[]{this, str, obj});
            return;
        }
        if (!this.propertyMap.containsKey(str)) {
            this.propertyMap.put(str, obj);
        }
        this.mPerformanceVisitorList.add(new AddPropertyIfAbsentVisitor(str, obj));
        for (cce cceVar : this.mWebViewPageModelList) {
            cceVar.onPropertyIfAbsent(str, obj);
        }
    }

    @Override // tb.cce
    public void onStage(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
            return;
        }
        this.stageMap.put(str, Long.valueOf(j));
        this.mPerformanceVisitorList.add(new AddStageVisitor(str, j));
        for (cce cceVar : this.mWebViewPageModelList) {
            cceVar.onStage(str, j);
        }
    }

    @Override // tb.cce
    public void onStageIfAbsent(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da2a227e", new Object[]{this, str, new Long(j)});
            return;
        }
        if (!this.stageMap.containsKey(str)) {
            this.stageMap.put(str, Long.valueOf(j));
        }
        this.mPerformanceVisitorList.add(new AddStageIfAbsentVisitor(str, j));
        for (cce cceVar : this.mWebViewPageModelList) {
            cceVar.onStageIfAbsent(str, j);
        }
    }
}
