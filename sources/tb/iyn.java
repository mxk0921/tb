package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.service.SplitInstallServiceImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class iyn extends qv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int p = 15;
    private int b;
    private final SplitInstallServiceImpl.b c;
    private final SplitInstallServiceImpl.c d;
    private wnc e = (wnc) d62.b(wnc.class, "SplitInstallService");
    private jvc f = (jvc) d62.a(jvc.class, new Object[0]);
    private List<String> g = new ArrayList();
    private List<Bundle> h;
    private final String i;
    private final int j;
    private Context k;
    private SplitInstallResultCallback l;
    private int m;
    private boolean n;
    private boolean o;

    static {
        t2o.a(683671577);
    }

    public iyn(Context context, int i, String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback, SplitInstallServiceImpl.b bVar, boolean z, SplitInstallServiceImpl.c cVar) {
        this.h = new ArrayList();
        this.i = str;
        this.k = context;
        this.b = i;
        this.j = bundle.getInt("version_code", 0);
        this.o = bundle.getBoolean("silence", false);
        this.h = list;
        this.l = splitInstallResultCallback;
        this.c = bVar;
        this.n = z;
        this.d = cVar;
    }

    public static /* synthetic */ Object ipc$super(iyn iynVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/service/remote/tasks/RemoteInstallTask");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0040 -> B:46:0x006c). Please submit an issue!!! */
    private void j(InputStream inputStream, File file) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15028a0e", new Object[]{this, inputStream, file});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                inputStream.close();
                fileOutputStream.close();
            } catch (Exception unused) {
                fileOutputStream2 = fileOutputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55705e7d", new Object[]{this, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        try {
            this.l.onError(bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d4049", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putInt("error_code", 0);
            this.l.onStartInstall(this.b, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private String o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("781e2331", new Object[]{this, str});
        }
        return str.concat(jcq.APK_EXTENSION);
    }

    private int p(List<SplitFileInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb476c50", new Object[]{this, list})).intValue();
        }
        long j = 0;
        for (SplitFileInfo splitFileInfo : list) {
            j += splitFileInfo.fileSize;
        }
        return (int) j;
    }

    @Override // tb.qv
    public wnc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("531d6508", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.qv
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d27d49fa", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.qv
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c66fc11", new Object[]{this})).booleanValue();
        }
        return true;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941a92e4", new Object[]{this})).booleanValue();
        }
        if (!mcq.a().a().containsAll(this.g)) {
            return false;
        }
        String[] strArr = (String[]) this.g.toArray(new String[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", this.b);
        bundle.putInt("status", 5);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        for (String str : strArr) {
            arrayList.add(str);
            Intent intent = new Intent();
            intent.putExtra("split_id", str);
            arrayList2.add(intent);
        }
        bundle.putStringArrayList("module_names", arrayList);
        bundle.putParcelableArrayList("split_file_intents", arrayList2);
        dmi.b(this.k, this.i, bundle);
        this.c.a(SplitInstallServiceImpl.c.a(5, 0, 0, "", 0, 0, this.g));
        return true;
    }

    private void k(Map<String, Intent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4798af9", new Object[]{this, map});
            return;
        }
        l0c l0cVar = (l0c) d62.a(l0c.class, this.k);
        ArrayList arrayList = new ArrayList(this.g.size());
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.g) {
            SplitFileInfo a2 = new xtl().a(str);
            if (a2 == null || !map.keySet().contains(str)) {
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        Map<String, Intent> a3 = a(this.k, this.g, this.b, arrayList);
        if (!a3.keySet().containsAll(this.g)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SplitFileInfo splitFileInfo = (SplitFileInfo) it.next();
                if (o49.b().a(splitFileInfo.splitName) > 0 && ddq.a() != null && ddq.a().a(splitFileInfo.splitName, "baseline").equals("baseline")) {
                    arrayList2.add(splitFileInfo);
                    it.remove();
                } else if (o49.b().a(splitFileInfo.splitName) == -1) {
                    it.remove();
                } else if (mcq.a().a().contains(splitFileInfo.splitName) && ddq.a() != null && ddq.a().a(splitFileInfo.splitName, "baseline").equals("baseline")) {
                    arrayList2.add(splitFileInfo);
                    it.remove();
                } else if (a3.containsKey(splitFileInfo.splitName)) {
                    arrayList2.add(splitFileInfo);
                    it.remove();
                }
            }
            if (arrayList.size() == 0) {
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", this.b);
                bundle.putInt("status", 3);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    SplitFileInfo splitFileInfo2 = (SplitFileInfo) it2.next();
                    if (!a3.keySet().contains(splitFileInfo2.splitName)) {
                        arrayList3.add(splitFileInfo2.splitName);
                        Intent intent = new Intent();
                        intent.putExtra("split_id", splitFileInfo2.splitName);
                        arrayList4.add(intent);
                    }
                }
                for (Map.Entry<String, Intent> entry : map.entrySet()) {
                    arrayList3.add(entry.getKey());
                    arrayList4.add(entry.getValue());
                }
                for (Map.Entry<String, Intent> entry2 : a3.entrySet()) {
                    arrayList3.add(entry2.getKey());
                    arrayList4.add(entry2.getValue());
                }
                bundle.putStringArrayList("module_names", arrayList3);
                bundle.putParcelableArrayList("split_file_intents", arrayList4);
                dmi.b(this.k, this.i, bundle);
                this.c.a(SplitInstallServiceImpl.c.a(3, this.m, 0, "", p(arrayList), p(arrayList), this.g));
            } else if (l0cVar != null) {
                dyn a4 = dyn.q(this.k).d(l0cVar).h(this.o).g(this.g).c(arrayList2).b(this.c).f(map).e(a3).i(true).a();
                if (this.n) {
                    int i = this.d.b;
                    this.m = i;
                    a4.r(i);
                    return;
                }
                a4.p(arrayList, this.b, this.j);
            }
        }
    }

    public static List<String> l(List<Bundle> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5231a213", new Object[]{list});
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).getString("module_name");
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        List<Bundle> list = this.h;
        if (list == null || list.size() <= 0) {
            m(-3);
            return;
        }
        this.g = l(this.h);
        n();
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!i()) {
            hdq a2 = bcq.a();
            Context context = this.k;
            List<String> list2 = this.g;
            a2.g(context, true, (String[]) list2.toArray(new String[list2.size()]));
            if (i()) {
                return;
            }
            Map<String, Intent> hashMap = new HashMap<>();
            if (f()) {
                this.e.c("install from local:" + this.g, new Object[0]);
                hashMap = d(this.k, this.g, this.b);
                this.e.c("install from local done :" + hashMap.keySet(), new Object[0]);
            }
            if (!hashMap.keySet().containsAll(this.g)) {
                List<String> arrayList = new ArrayList<>();
                if (e()) {
                    arrayList = b(this.k, this.g);
                }
                if (mcq.a().a().containsAll(this.g)) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("session_id", this.b);
                    bundle.putInt("status", 5);
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    for (String str : this.g) {
                        arrayList2.add(str);
                        Intent intent = new Intent();
                        intent.putExtra("split_id", str);
                        arrayList3.add(intent);
                    }
                    bundle.putStringArrayList("module_names", arrayList2);
                    bundle.putParcelableArrayList("split_file_intents", arrayList3);
                    dmi.b(this.k, this.i, bundle);
                    if (arrayList.containsAll(this.g)) {
                        this.b += 10000;
                    }
                }
                if (n1r.j(this.k)) {
                    this.e.c("startInstall installing:" + Arrays.toString(this.g.toArray()), new Object[0]);
                    k(hashMap);
                }
            }
        }
    }
}
