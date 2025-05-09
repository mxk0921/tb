package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaobaoApplication;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jcq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APK_EXTENSION = ".apk";
    public static final String SO_EXTENSION = ".so";

    /* renamed from: a  reason: collision with root package name */
    public final File f21918a;
    public final boolean b;
    public boolean c;
    public final String d;
    public final String e;
    public final SharedPreferences f;
    public final kcq g;
    public final Context h;
    public final int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(jcq jcqVar) {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            return new x87().a(file2.getName(), file.getName());
        }
    }

    static {
        t2o.a(676331631);
    }

    public jcq(Context context) throws PackageManager.NameNotFoundException {
        this(context, true);
    }

    public static File A(File file) throws IOException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3c4b5b4b", new Object[]{file});
        }
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.length() != 0) {
                str = "Unable to create directory: ".concat(absolutePath);
            } else {
                str = new String("Unable to create directory: ");
            }
            throw new IOException(str);
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    public static String F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3a01b42", new Object[]{str});
        }
        return str.concat(APK_EXTENSION);
    }

    public static String G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46dcfdca", new Object[]{str});
        }
        if (str.endsWith(APK_EXTENSION)) {
            return str.substring(0, str.length() - 4);
        }
        if (str.endsWith(SO_EXTENSION)) {
            return str.substring(3, str.length() - 3);
        }
        return str;
    }

    public static void e(File file) throws IOException {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258726a9", new Object[]{file});
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                e(file2);
            }
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public File B() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("c24f33e4", new Object[]{this});
        }
        return A(new File(P(), "native-libraries"));
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8462adb1", new Object[]{this, str});
        } else {
            this.f.edit().putString("flexaLastInstalledVersionName", str).commit();
        }
    }

    public File D(String str, String str2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("50367da", new Object[]{this, str, str2});
        }
        return new File(d(str), str2);
    }

    public final File E(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("8a3fe41e", new Object[]{this, str});
        }
        return new File(O(), F(str));
    }

    public final File H(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e09bed3b", new Object[]{this, str});
        }
        return A(new File(J(), str));
    }

    public final File I() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e48d3c35", new Object[]{this});
        }
        return A(new File(this.f21918a, "splitcompat"));
    }

    public File J() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("8958320b", new Object[]{this});
        }
        return A(new File(P(), "status"));
    }

    public final File K(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("64cf09c7", new Object[]{this, str});
        }
        return new File(L(), F(str));
    }

    public final File L() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("3ae077e", new Object[]{this});
        }
        return A(new File(P(), "unverified-splits"));
    }

    public Set<ocq> M() throws IOException {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("af30141d", new Object[]{this});
        }
        File O = O();
        HashSet hashSet = new HashSet();
        File[] listFiles = O.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(APK_EXTENSION)) {
                    hashSet.add(new pcq(file, file.getName().substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public Set<ocq> N(List<String> list) throws IOException {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("885e8b4e", new Object[]{this, list});
        }
        File O = O();
        HashSet hashSet = new HashSet();
        File[] listFiles = O.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(APK_EXTENSION)) {
                    String substring = file.getName().substring(0, name.length() - 4);
                    if (list.contains(substring)) {
                        hashSet.add(new pcq(file, substring));
                    }
                }
            }
        }
        return hashSet;
    }

    public File O() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("54bdba77", new Object[]{this});
        }
        return A(new File(P(), "verified-splits"));
    }

    public final File P() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f44e0ff1", new Object[]{this});
        }
        return A(new File(I(), this.d));
    }

    public final synchronized void a() throws IOException {
        String n;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
                return;
            }
            try {
                n = bcq.a().e().n();
                if (!n.equals(this.d)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            File I = I();
            File[] listFiles = I.listFiles();
            if (listFiles != null) {
                Arrays.sort(listFiles, new a(this));
                for (File file : listFiles) {
                    String name = file.getName();
                    if (!name.equals(this.d) && !t(name) && !u(name) && !p(name)) {
                        File file2 = new File(I, name);
                        String valueOf = String.valueOf(file2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118);
                        sb.append("FileStorage: removing directory for different version name (directory = ");
                        sb.append(valueOf);
                        sb.append(", current version Name = ");
                        sb.append(this.d);
                        sb.append(f7l.BRACKET_END_STR);
                        Log.e(wnc.MODULE, sb.toString());
                        e(file2);
                    }
                }
            }
            if (!n.equals(k())) {
                this.c = true;
                C(n);
            }
        }
    }

    public void b(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4198294", new Object[]{this, str});
        } else {
            e(d(str));
        }
    }

    public File c(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("930ae7b3", new Object[]{this, str});
        }
        return A(new File(A(new File(P(), "dex")), str));
    }

    public File d(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("4062dae6", new Object[]{this, str});
        }
        if (Build.VERSION.SDK_INT < 23) {
            return A(new File(B(), AgooConstants.REPORT_DUPLICATE_FAIL));
        }
        return A(new File(B(), str));
    }

    public final void f(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807b73c5", new Object[]{this, file});
        } else {
            e(file);
        }
    }

    public final void g(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efe905a", new Object[]{this, str});
        } else {
            e(E(str));
        }
    }

    public final File h() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("91fa644e", new Object[]{this});
        }
        return A(new File(P(), "downloaded-assets"));
    }

    public final File i() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("1d533678", new Object[]{this});
        }
        return A(new File(P(), "downloaded-splits"));
    }

    public Context j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.h;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dde3465", new Object[]{this});
        }
        return this.e;
    }

    public kcq l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kcq) ipChange.ipc$dispatch("9c01c1c9", new Object[]{this});
        }
        return this.g;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a446ea9", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f011eacc", new Object[]{this});
        }
        return this.d;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfb879fa", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean p(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ee0b12f", new Object[]{this, str})).booleanValue();
        }
        if (!str.contains("-") || (split = str.split("-")) == null || !split[0].equals(n())) {
            return false;
        }
        return true;
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64956088", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bb9fd70", new Object[]{this, str})).booleanValue();
        }
        try {
            return new File(H(str), "emulated").exists();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("280cb51a", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c62878f", new Object[]{this, str})).booleanValue();
        }
        if (this.g.d(str) && this.g.c(str)) {
            return true;
        }
        return false;
    }

    public final boolean u(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1499ea9", new Object[]{this, str})).booleanValue();
        }
        if (!str.contains("-") || (split = str.split("-")) == null || !split[1].equals(n())) {
            return false;
        }
        return true;
    }

    public List v() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("477dae7e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = B().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    public Set<File> w(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("c67354e2", new Object[]{this, str});
        }
        HashSet hashSet = new HashSet();
        File[] listFiles = d(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    public final File x() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ddde497f", new Object[]{this});
        }
        return new File(P(), "lock.tmp");
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f36ab7cf", new Object[]{this, str});
            return;
        }
        try {
            File file = new File(H(str), "emulated");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final File z() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f2e0c11d", new Object[]{this});
        }
        return new File(P(), l2o.COL_MARK);
    }

    public jcq(Context context, boolean z) throws PackageManager.NameNotFoundException {
        this(context, z, TaobaoApplication.getAppVersion());
    }

    public jcq(Context context, boolean z, String str) throws PackageManager.NameNotFoundException {
        this.c = false;
        if (z) {
            this.f21918a = context.getFilesDir();
        } else {
            this.f21918a = context.getExternalFilesDir(null);
        }
        this.d = str;
        this.i = 111;
        try {
            this.f = PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            this.f = PreferenceManager.getDefaultSharedPreferences(context);
        }
        this.e = this.f.getString("flexaLastInstalledVersionName", "");
        this.h = context;
        this.g = new kcq(this);
        this.b = true;
    }

    public jcq(Context context, boolean z, String str, boolean z2) throws PackageManager.NameNotFoundException {
        this.c = false;
        if (z) {
            this.f21918a = context.getFilesDir();
        } else {
            this.f21918a = context.getExternalFilesDir(null);
        }
        this.d = str;
        this.i = 111;
        try {
            this.f = PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            this.f = PreferenceManager.getDefaultSharedPreferences(context);
        }
        this.e = this.f.getString("flexaLastInstalledVersionName", "");
        this.h = context;
        this.g = new kcq(this);
        this.b = z2;
    }
}
