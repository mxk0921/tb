package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class obn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f25284a;
    public final kgd b;

    public obn(Application application, kgd kgdVar) {
        this.f25284a = application;
        this.b = kgdVar;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9fb90b4", new Object[]{this, str});
        }
        if (!trq.c(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d());
            String str2 = File.separator;
            sb.append(str2);
            sb.append(this.b.d());
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        throw RSoException.error(7001, "libStorageKey is empty");
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568a569", new Object[]{this, str, str2});
        }
        String a2 = a(str2);
        return a2 + File.separator + str;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a95b428", new Object[]{this});
        }
        return this.f25284a.getFilesDir().getPath() + File.separator + "swallows";
    }

    public String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bbc330e", new Object[]{this, str, str2});
        }
        if (trq.c(str)) {
            rbn.e("getAvailableLibPath", "localFileName = " + str + ", libStorageKey = " + str2);
            return null;
        }
        try {
            File file = new File(b(str, str2));
            if (!file.exists()) {
                RSoLog.d("storage -> " + str + "  " + str2 + " not found");
                return null;
            } else if (!file.isFile()) {
                rbn.e("storage,getLibPath,file.isFile=false", "storage -> target so file is not a file" + file.getPath());
                return null;
            } else if (file.length() >= 1) {
                return file.getPath();
            } else {
                rbn.e("storage,getLibPath,file.length() < 1", "storage -> target so file is not a file" + file.getPath());
                return null;
            }
        } catch (Throwable th) {
            rbn.g("storage ->  error ", th);
            return null;
        }
    }

    public List<File> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af111cf", new Object[]{this});
        }
        try {
            ArrayList arrayList = new ArrayList();
            jg9.l(new File(d()), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jg9.l((File) it.next(), arrayList2);
            }
            return arrayList2;
        } catch (Throwable th) {
            rbn.g("StorageManager->listLibDirPath", th);
            return Collections.emptyList();
        }
    }

    public File c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("16cbdb1", new Object[]{this});
        }
        return this.f25284a.getDir("swallows", 0);
    }
}
