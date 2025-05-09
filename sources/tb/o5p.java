package tb;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SharedMemory;
import android.system.ErrnoException;
import com.huawei.nb.searchmanager.client.exception.SearchResult;
import com.huawei.nb.searchmanager.client.model.IndexData;
import com.huawei.nb.searchmanager.client.model.IndexForm;
import com.huawei.nb.searchmanager.utils.SharedMemoryHelper;
import com.huawei.nb.searchmanager.utils.logger.DSLog;
import com.huawei.searchabilitymanager.client.model.SearchableItemAttributeSet;
import com.huawei.searchservice.service.IHOSPSearchServiceCall;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.List;
import tb.ira;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o5p {
    public final Context b;
    public final azn c;
    public String g;
    public final wq h = new wq();
    public volatile hdp e = null;
    public volatile IHOSPSearchServiceCall d = null;

    /* renamed from: a  reason: collision with root package name */
    public final Object f25153a = new Object();
    public final IBinder f = new Binder();

    public o5p(Context context) {
        this.c = new azn(context, "com.huawei.searchservice", "com.huawei.searchservice.service.SearchService");
        this.b = context;
        DSLog.init("HwSearchService: Client", 1);
    }

    public boolean a(hdp hdpVar) {
        synchronized (this.f25153a) {
            try {
                this.e = hdpVar;
                if (this.d != null) {
                    f(true);
                    return true;
                }
                this.h.f(this.e);
                this.h.e(this.f);
                this.h.g(this.b);
                boolean b = this.c.b(this.h);
                if (!b) {
                    DSLog.et("SearchServiceAbility", "Failed to open search service connection.", new Object[0]);
                }
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<IndexData> b(int i, SharedMemory sharedMemory, List<IndexData> list) throws ErrnoException {
        if (i == SearchResult.SUCCESS.getRetCode()) {
            return Collections.emptyList();
        }
        if (i == SearchResult.FAIL.getRetCode()) {
            return SharedMemoryHelper.readIndexDataList(sharedMemory);
        }
        return list;
    }

    public int c(String str) {
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to getIndexFormVersion, error: searchService is null.", new Object[0]);
            return -1;
        }
        try {
            return this.d.getIndexFormVersion(str, this.b.getPackageName());
        } catch (RemoteException e) {
            DSLog.et("SearchServiceAbility", "Failed to getIndexFormVersion, errMsg: %s", new Object[]{e.getMessage()});
            return -1;
        }
    }

    public List<IndexForm> d(String str) {
        this.g = str;
        return SearchableItemAttributeSet.getCommonIndexForm();
    }

    public SearchableItemAttributeSet e(String str, String str2) {
        SearchableItemAttributeSet searchableItemAttributeSet = new SearchableItemAttributeSet(this.g);
        searchableItemAttributeSet.setUniqueIdentifier(str);
        searchableItemAttributeSet.setGroupId(str2);
        return searchableItemAttributeSet;
    }

    public final void f(boolean z) {
        if (z) {
            if (this.e != null) {
                ((ira.c) this.e).a();
            }
        } else if (this.e != null) {
            ((ira.c) this.e).b();
        }
    }

    public int g(String str, int i, List<IndexForm> list) {
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to setIndexForm, error: searchService is null.", new Object[0]);
            return 0;
        }
        try {
            return this.d.setIndexForm(str, i, list, this.b.getPackageName());
        } catch (RemoteException e) {
            DSLog.et("SearchServiceAbility", "Failed to setIndexForm, errMsg: %s", new Object[]{e.getMessage()});
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.os.SharedMemory] */
    public List<IndexData> h(String str, String str2, List<IndexData> list) {
        Throwable th;
        Object obj;
        ErrnoException e;
        Object obj2;
        BufferOverflowException e2;
        Object obj3;
        RemoteException e3;
        SharedMemory create;
        SharedMemory create2;
        SharedMemory sharedMemory = "large update ";
        this.d = this.h.a();
        if (this.d == null) {
            DSLog.et("SearchServiceAbility", "Failed to update index, error: searchService is null", new Object[0]);
            return list;
        } else if (list == null || list.isEmpty()) {
            DSLog.et("SearchServiceAbility", "Failed to update index, error: indexDataList is null", new Object[0]);
            return list;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            SharedMemory sharedMemory2 = null;
            try {
                try {
                    create = SharedMemory.create("SearchDataSharedMemory", 10485760);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (RemoteException e4) {
                e3 = e4;
                obj3 = null;
            } catch (ErrnoException e5) {
                e = e5;
                obj = null;
            } catch (BufferOverflowException e6) {
                e2 = e6;
                obj2 = null;
            } catch (Throwable th3) {
                th = th3;
                sharedMemory = 0;
            }
            try {
                if (SharedMemoryHelper.writeIndexDataList(list, create) > 153600) {
                    create2 = SharedMemory.create("SearchFailedIndexSharedMemory", 10485760);
                    if (this.d == null) {
                        DSLog.et("SearchServiceAbility", "Failed to update large index, error: searchService is null", new Object[0]);
                        SharedMemoryHelper.releaseMemory(create);
                        SharedMemoryHelper.releaseMemory(create2);
                        return list;
                    }
                    List<IndexData> b = b(this.d.updateLarge(str, str2, create, create2, this.b.getPackageName()), create2, list);
                    DSLog.it("SearchServiceAbility", ((String) sharedMemory) + list.size() + " index cost " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    SharedMemoryHelper.releaseMemory(create);
                    SharedMemoryHelper.releaseMemory(create2);
                    return b;
                } else if (this.d == null) {
                    DSLog.et("SearchServiceAbility", "Failed to update index originally, error: searchService is null", new Object[0]);
                    SharedMemoryHelper.releaseMemory(create);
                    SharedMemoryHelper.releaseMemory((SharedMemory) null);
                    return list;
                } else {
                    List<IndexData> update = this.d.update(str, str2, list, this.b.getPackageName());
                    DSLog.it("SearchServiceAbility", "update " + list.size() + " index cost " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                    SharedMemoryHelper.releaseMemory(create);
                    SharedMemoryHelper.releaseMemory((SharedMemory) null);
                    return update;
                }
            } catch (RemoteException e7) {
                e3 = e7;
                obj3 = null;
                sharedMemory2 = create;
                DSLog.et("SearchServiceAbility", "Failed to update index, remote error, errMsg: %s", new Object[]{e3.getMessage()});
                sharedMemory = obj3;
                SharedMemoryHelper.releaseMemory(sharedMemory2);
                SharedMemoryHelper.releaseMemory((SharedMemory) sharedMemory);
                return list;
            } catch (ErrnoException e8) {
                e = e8;
                obj = null;
                sharedMemory2 = create;
                DSLog.et("SearchServiceAbility", "Failed to update index, read reply memory error, errMsg: %s", new Object[]{e.getMessage()});
                sharedMemory = obj;
                SharedMemoryHelper.releaseMemory(sharedMemory2);
                SharedMemoryHelper.releaseMemory((SharedMemory) sharedMemory);
                return list;
            } catch (BufferOverflowException e9) {
                e2 = e9;
                obj2 = null;
                sharedMemory2 = create;
                DSLog.et("SearchServiceAbility", "Failed to update index, the data is out of memory, errMsg: %s", new Object[]{e2.getMessage()});
                sharedMemory = obj2;
                SharedMemoryHelper.releaseMemory(sharedMemory2);
                SharedMemoryHelper.releaseMemory((SharedMemory) sharedMemory);
                return list;
            } catch (Throwable th4) {
                th = th4;
                sharedMemory = 0;
                sharedMemory2 = create;
                SharedMemoryHelper.releaseMemory(sharedMemory2);
                SharedMemoryHelper.releaseMemory(sharedMemory);
                throw th;
            }
        }
    }
}
