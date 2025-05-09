package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v9f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m55 f29868a;
    public final zzp b;
    public URL c;
    public File d;
    public File e;
    public File[] f;

    public v9f(zzp zzpVar) {
        this.b = zzpVar;
        this.f29868a = new m55(zzpVar);
    }

    public Pair<Boolean, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("42879776", new Object[]{this});
        }
        onf onfVar = this.b.e;
        if (0 != onfVar.b || !TextUtils.isEmpty(onfVar.c)) {
            if (this.d.exists()) {
                long j = this.b.e.b;
                if (0 == j || j == this.d.length()) {
                    if (TextUtils.isEmpty(this.b.e.c)) {
                        return new Pair<>(Boolean.TRUE, "");
                    }
                    if (TextUtils.isEmpty(this.d.getAbsolutePath())) {
                        return new Pair<>(Boolean.FALSE, "");
                    }
                    String b = bbi.b(this.d.getAbsolutePath());
                    boolean equals = this.b.e.c.toLowerCase().equals(b);
                    fs7.e("Downloader.InputContext", "checkPartFileValid taskMd5 =  " + this.b.e.c + ", fileMd5 = " + b + ", md5Same = " + equals, new Object[0]);
                    return new Pair<>(Boolean.valueOf(equals), b);
                }
            }
            return new Pair<>(Boolean.FALSE, "");
        } else if (!this.b.f.h) {
            return new Pair<>(Boolean.TRUE, "");
        } else {
            return new Pair<>(Boolean.FALSE, "");
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c769ad3d", new Object[]{this})).intValue();
        }
        long j = this.b.e.b;
        if (0 != j && j != this.d.length()) {
            return -18;
        }
        if (!bbi.d(this.b.e.c, this.d.getAbsolutePath())) {
            return -15;
        }
        return -14;
    }

    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2123aaa5", new Object[]{this})).longValue();
        }
        if (!this.d.exists()) {
            return 0L;
        }
        long length = this.d.length();
        long j = this.b.e.b;
        if (0 == j || length < j) {
            return length;
        }
        this.d.delete();
        return 0L;
    }

    public long d(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e1a1950", new Object[]{this, file, new Long(j)})).longValue();
        }
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= j) {
                return length;
            }
            file.delete();
        }
        return 0L;
    }

    public RandomAccessFile e() throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("60e1baa6", new Object[]{this});
        }
        return f(this.d);
    }

    public RandomAccessFile f(File file) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RandomAccessFile) ipChange.ipc$dispatch("d51bcd0f", new Object[]{this, file});
        }
        return new RandomAccessFile(file, "rw");
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be467c1e", new Object[]{this})).booleanValue();
        }
        if (!this.e.exists()) {
            return false;
        }
        long j = this.b.e.b;
        if ((0 == j || j == this.e.length()) && bbi.d(this.b.e.c, this.e.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aa66ee9", new Object[]{this})).booleanValue();
        }
        onf onfVar = this.b.e;
        if ((0 == onfVar.b && TextUtils.isEmpty(onfVar.c)) || !this.d.exists()) {
            return false;
        }
        long j = this.b.e.b;
        if ((0 == j || j == this.d.length()) && bbi.d(this.b.e.c, this.d.getAbsolutePath())) {
            return true;
        }
        return false;
    }

    public boolean i(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fccafaf7", new Object[]{this, new Long(j), new Integer(i)})).booleanValue();
        }
        if (200 != i && 206 != i) {
            return false;
        }
        if (j > 0) {
            if (206 == i) {
                j += this.d.length();
            } else if (200 != i) {
                j = 0;
            }
            if (j != 0) {
                long j2 = this.b.e.b;
                if (!(j2 == 0 || j == j2)) {
                    return false;
                }
            }
            onf onfVar = this.b.e;
            if (0 == onfVar.b) {
                onfVar.b = j;
            }
        }
        return true;
    }

    public void j() throws MalformedURLException {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc3d7b6", new Object[]{this});
        } else if (this.c == null) {
            this.c = new URL(this.b.e.f25507a);
            if (TextUtils.isEmpty(this.b.e.d)) {
                str = new File(this.c.getFile()).getName();
            } else {
                str = this.b.e.d;
            }
            this.e = new File(this.b.g, str);
            zzp zzpVar = this.b;
            File file = new File(zzpVar.g, bbi.c(zzpVar.e.f25507a));
            this.d = file;
            if (!file.getParentFile().exists()) {
                this.d.getParentFile().mkdirs();
            }
            if (!this.d.getParentFile().canWrite()) {
                this.d.getParentFile().setWritable(true);
            }
            zzp zzpVar2 = this.b;
            if (!zzpVar2.f.k && TextUtils.isEmpty(zzpVar2.e.c)) {
                this.e.delete();
                this.d.delete();
            }
        }
    }

    public File k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b150c26", new Object[]{this, str});
        }
        String str2 = this.b.g;
        File file = new File(str2, bbi.c(this.b.e.f25507a + str));
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.getParentFile().canWrite()) {
            file.getParentFile().setWritable(true);
        }
        return file;
    }
}
