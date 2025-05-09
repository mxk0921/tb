package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class qv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<qcc> f26945a = new ArrayList();

    static {
        t2o.a(683671569);
    }

    public List<String> b(Context context, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("972c33af", new Object[]{this, context, list});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!n49.d(context).c(str)) {
                synchronized (this.f26945a) {
                    try {
                        for (qcc qccVar : this.f26945a) {
                            qccVar.b(str);
                        }
                    } finally {
                    }
                }
            } else if (n49.d(context).c(str) && !mcq.a().a().contains(str)) {
                if (n49.d(context).b(context, str, n49.d(context).a(str))) {
                    synchronized (this.f26945a) {
                        try {
                            for (qcc qccVar2 : this.f26945a) {
                                qccVar2.a(str, n49.d(context).a(str));
                            }
                        } finally {
                        }
                    }
                    arrayList.add(str);
                } else {
                    synchronized (this.f26945a) {
                        try {
                            for (qcc qccVar3 : this.f26945a) {
                                qccVar3.b(str);
                            }
                        } finally {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public abstract wnc c();

    public abstract boolean e();

    public abstract boolean f();

    public void g(qcc qccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43824ad2", new Object[]{this, qccVar});
            return;
        }
        synchronized (this.f26945a) {
            this.f26945a.add(qccVar);
        }
    }

    public void h(qcc qccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fba1eb", new Object[]{this, qccVar});
            return;
        }
        synchronized (this.f26945a) {
            this.f26945a.remove(qccVar);
        }
    }

    public Map<String, Intent> d(Context context, List<String> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6638789", new Object[]{this, context, list, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (!p9h.e(context, list.get(i2)) || !p9h.f(context, list.get(i2))) {
                    arrayList.add(list.get(i2));
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("split_id", list.get(i2));
                    try {
                        File d = p9h.d(context, list.get(i2));
                        if (d != null && d.exists()) {
                            intent.setData(Uri.fromFile(d));
                            hashMap.put(list.get(i2), intent);
                            arrayList2.add(intent);
                            o49.b().c().b(list.get(i2), 1);
                        }
                    } catch (Exception e) {
                        arrayList.add(list.get(i2));
                        e.printStackTrace();
                    }
                }
            }
        }
        if (hashMap.keySet().containsAll(list)) {
            bundle.putInt("session_id", i);
            bundle.putInt("status", 3);
            bundle.putInt("error_code", 0);
            bundle.putLong("bytes_downloaded", 0L);
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putStringArrayList("module_names", new ArrayList<>(hashMap.keySet()));
            bundle.putParcelableArrayList("split_file_intents", arrayList2);
            dmi.b(context, context.getPackageName(), bundle);
        }
        return hashMap;
    }

    public Map<String, Intent> a(Context context, List<String> list, int i, List<SplitFileInfo> list2) {
        File b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("883419b8", new Object[]{this, context, list, new Integer(i), list2});
        }
        new ArrayList();
        Bundle bundle = new Bundle();
        HashMap hashMap = new HashMap();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        if (list2 != null && list2.size() > 0) {
            for (int i2 = 0; i2 < list2.size(); i2++) {
                SplitFileInfo splitFileInfo = list2.get(i2);
                if (splitFileInfo instanceof PatchSplitFileInfo) {
                    PatchSplitFileInfo patchSplitFileInfo = (PatchSplitFileInfo) splitFileInfo;
                    if (patchSplitFileInfo.sameFile && (b = u48.c().b(patchSplitFileInfo)) != null && b.exists()) {
                        Intent intent = new Intent();
                        intent.putExtra("split_id", splitFileInfo.splitName);
                        intent.setData(Uri.fromFile(b));
                        hashMap.put(splitFileInfo.splitName, intent);
                        o49.b().c().b(splitFileInfo.splitName, 1);
                        arrayList.add(intent);
                    }
                }
            }
        }
        if (hashMap.keySet().containsAll(list)) {
            bundle.putInt("session_id", i);
            bundle.putInt("status", 3);
            bundle.putInt("error_code", 0);
            bundle.putLong("bytes_downloaded", 0L);
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putStringArrayList("module_names", new ArrayList<>(hashMap.keySet()));
            bundle.putParcelableArrayList("split_file_intents", arrayList);
            dmi.b(context, context.getPackageName(), bundle);
        }
        return hashMap;
    }
}
