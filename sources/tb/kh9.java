package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements Comparator<File> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(774897911);
        }

        public b() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a0238d", new Object[]{this, file, file2})).intValue();
            }
            return b(file.lastModified(), file2.lastModified());
        }

        public final int b(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa124f7b", new Object[]{this, new Long(j), new Long(j2)})).intValue();
            }
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    static {
        t2o.a(774897909);
    }

    public static List<File> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3931b8c9", new Object[]{file});
        }
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new b());
        return asList;
    }

    public static void b(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678fdbbd", new Object[]{file});
        } else if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " is not directory!");
            }
        } else if (!file.mkdirs()) {
            String absolutePath = file.getAbsolutePath();
            throw new IOException("Directory " + absolutePath + " can't be created");
        }
    }

    public static void c(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3113f8", new Object[]{file});
            return;
        }
        long length = file.length();
        if (length == 0) {
            d(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j = length - 1;
        try {
            randomAccessFile.seek(j);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j);
            randomAccessFile.write(readByte);
        } finally {
            randomAccessFile.close();
        }
    }

    public static void d(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d25f32", new Object[]{file});
        } else if (!file.delete() || !file.createNewFile()) {
            throw new IOException("Error recreate zero-size file " + file);
        }
    }

    public static void e(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b9d9093", new Object[]{file});
        } else if (file.exists() && !file.setLastModified(System.currentTimeMillis())) {
            c(file);
        }
    }
}
