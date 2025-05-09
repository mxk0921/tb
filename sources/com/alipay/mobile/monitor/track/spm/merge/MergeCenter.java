package com.alipay.mobile.monitor.track.spm.merge;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmLogCator;
import com.alipay.mobile.monitor.track.spm.monitor.TrackerExecutor;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.MergeTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum MergeCenter {
    INSTANCE;
    
    private static final Object c = new Object();
    private final PriorityBlockingQueue<Runnable> b;
    private ThreadPoolExecutor h;

    /* renamed from: a  reason: collision with root package name */
    private final String f4272a = MergeCenter.class.getSimpleName();
    private TrackerExecutor g = new TrackerExecutor();
    private Map<String, MergeTask> d = new HashMap();
    private List<String> e = new ArrayList();
    private List<String> f = new ArrayList();

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MergeDispatcher implements Comparable, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private MergeTracker f4273a;

        public MergeDispatcher(MergeTracker mergeTracker) {
            this.f4273a = mergeTracker;
        }

        private String a(Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d29d041", new Object[]{this, behavor});
            }
            if (behavor == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(behavor.getPageId());
            sb.append("__");
            sb.append(behavor.getSeedID());
            Map<String, String> d = d(behavor.getExtParams());
            if (d != null) {
                for (String str : d.keySet()) {
                    if (!"timeThreshold".equals(str) && !"areaThreshold".equals(str)) {
                        sb.append(str);
                        sb.append(d.get(str));
                    }
                }
            }
            return sb.toString();
        }

        private static String b(String str, Behavor behavor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e751c937", new Object[]{str, behavor});
            }
            if (behavor == null) {
                return null;
            }
            return behavor.getPageId() + "__" + behavor.getSeedID() + "__" + str;
        }

        private Map<String, String> d(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
            }
            if (map == null) {
                return null;
            }
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.alipay.mobile.monitor.track.spm.merge.MergeCenter.MergeDispatcher.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public int compare(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
                }
            });
            treeMap.putAll(map);
            return treeMap;
        }

        private void e(MergeTracker mergeTracker) {
            MergeTask mergeTask;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5fe3a69d", new Object[]{this, mergeTracker});
            } else if (mergeTracker != null && mergeTracker.getBehavorBuilder() != null) {
                Behavor build = mergeTracker.getBehavorBuilder().build();
                if (TextUtils.isEmpty(build.getSeedID()) || TextUtils.isEmpty(build.getPageId())) {
                    MergeCenter.this.g.commitTracker(mergeTracker);
                    SpmLogCator.debug(MergeCenter.this.f4272a, "execute behavorKey is null. ");
                    return;
                }
                String a2 = a(build);
                if (MergeCenter.this.e.contains(a2)) {
                    SpmLogCator.debug(MergeCenter.this.f4272a, "execute behavorIdentifier has been merged, need not to merge again.behavorIdentifier:".concat(String.valueOf(a2)));
                    return;
                }
                String b = b(mergeTracker.getBehavorId(), build);
                MergeTask mergeTask2 = (MergeTask) MergeCenter.this.d.get(b);
                if (mergeTask2 == null) {
                    mergeTask = new MergeTask(mergeTracker);
                } else {
                    mergeTask = mergeTask2.merge(mergeTracker);
                }
                synchronized (MergeCenter.this) {
                    try {
                        MergeCenter.this.e.add(a2);
                        if (f(mergeTask)) {
                            MergeCenter.this.g.commitTracker(new MergeTracker(mergeTask.getBehavorId(), mergeTask.getBehavorBuider()));
                            MergeCenter.this.d.remove(b);
                        } else {
                            MergeCenter.this.d.put(b, mergeTask);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private boolean f(MergeTask mergeTask) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("92f3f465", new Object[]{this, mergeTask})).booleanValue();
            }
            if (mergeTask.needCommit()) {
                SpmLogCator.debug(MergeCenter.this.f4272a, "checkIfCommit mergeTask needCommit");
                return true;
            }
            Behavor.Builder behavorBuider = mergeTask.getBehavorBuider();
            if (behavorBuider != null) {
                String pageId = behavorBuider.build().getPageId();
                SpmLogCator.debug(MergeCenter.this.f4272a, "checkIfCommit pageId: ".concat(String.valueOf(pageId)));
                synchronized (MergeCenter.c) {
                    try {
                        boolean contains = MergeCenter.this.f.contains(pageId);
                        if (contains) {
                            boolean g = g(pageId);
                            SpmLogCator.debug(MergeCenter.this.f4272a, "checkIfCommit isClosedPage: ".concat(String.valueOf(contains)));
                            SpmLogCator.debug(MergeCenter.this.f4272a, "checkIfCommit isPageEmpty: ".concat(String.valueOf(g)));
                            if (g) {
                                MergeCenter.this.f.remove(pageId);
                            }
                            return g;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        }

        private boolean g(String str) {
            MergeTracker mergeTracker;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            Iterator it = MergeCenter.this.b.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if ((runnable instanceof MergeDispatcher) && (mergeTracker = ((MergeDispatcher) runnable).f4273a) != null && mergeTracker.getBehavorBuilder() != null && str.equals(mergeTracker.getBehavorBuilder().build().getPageId())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, obj})).intValue();
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MergeTracker mergeTracker = this.f4273a;
                if (mergeTracker != null) {
                    e(mergeTracker);
                }
            } catch (Exception e) {
                SpmLogCator.error(MergeCenter.this.f4272a, e);
            }
        }
    }

    MergeCenter(String str) {
        PriorityBlockingQueue<Runnable> priorityBlockingQueue = new PriorityBlockingQueue<>();
        this.b = priorityBlockingQueue;
        this.h = new ThreadPoolExecutor(1, 1, 3L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.h.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.h.allowCoreThreadTimeOut(true);
    }

    public final void commitImmediately(final String str) {
        SpmLogCator.debug(this.f4272a, "commitImmediately pageId: ".concat(String.valueOf(str)));
        synchronized (c) {
            try {
                if (!this.f.contains(str)) {
                    this.f.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.e.isEmpty() || !this.d.isEmpty()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.alipay.mobile.monitor.track.spm.merge.MergeCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (MergeCenter.this) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : MergeCenter.this.e) {
                                if (str2.startsWith(str + "__")) {
                                    arrayList.add(str2);
                                }
                            }
                            MergeCenter.this.e.removeAll(arrayList);
                            String str3 = MergeCenter.this.f4272a;
                            SpmLogCator.debug(str3, "commitImmediately mMergedKeys.isEmpty: " + MergeCenter.this.e.isEmpty());
                            Iterator it = MergeCenter.this.d.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                if (((String) entry.getKey()).startsWith(str + "__") && entry.getValue() != null) {
                                    MergeCenter.this.g.commitTracker(new MergeTracker(((MergeTask) entry.getValue()).getBehavorId(), ((MergeTask) entry.getValue()).getBehavorBuider()));
                                    it.remove();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    String str4 = MergeCenter.this.f4272a;
                    SpmLogCator.debug(str4, "commitImmediately mMergeTasks.isEmpty: " + MergeCenter.this.d.isEmpty());
                }
            });
        }
    }

    public final TrackerExecutor getTrackerExcutor() {
        return this.g;
    }

    public final void merge(MergeTracker mergeTracker) {
        if (mergeTracker != null && mergeTracker.getBehavorBuilder() != null) {
            if (this.f.contains(mergeTracker.getBehavorBuilder().build().getPageId())) {
                SpmLogCator.debug(this.f4272a, "merge page has been closed. ");
            } else {
                this.h.execute(new MergeDispatcher(mergeTracker));
            }
        }
    }
}
