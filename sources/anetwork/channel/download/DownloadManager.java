package anetwork.channel.download;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import anetwork.channel.Header;
import anetwork.channel.aidl.Connection;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.t2o;
import tb.wh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DownloadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNLOAD_FOLDER = "downloads";
    public static final int ERROR_DOWNLOAD_CANCELLED = -105;
    public static final int ERROR_EXCEPTION_HAPPEN = -104;
    public static final int ERROR_FILE_FOLDER_INVALID = -101;
    public static final int ERROR_FILE_RENAME_FAILED = -106;
    public static final int ERROR_IO_EXCEPTION = -103;
    public static final int ERROR_REQUEST_FAIL = -102;
    public static final int ERROR_URL_INVALID = -100;
    public static final String TAG = "anet.DownloadManager";
    public Context context;
    public ThreadPoolExecutor executor;
    public File mExternalCacheDir;
    public File mExternalFilesDir;
    public AtomicInteger taskIdGen;
    public SparseArray<DownloadTask> taskMap;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ClassHolder {
        public static DownloadManager instance = new DownloadManager();

        static {
            t2o.a(607126040);
        }

        private ClassHolder() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface DownloadListener {
        void onFail(int i, int i2, String str);

        void onProgress(int i, long j, long j2);

        void onSuccess(int i, String str);
    }

    static {
        t2o.a(607126038);
    }

    public static /* synthetic */ String access$100(DownloadManager downloadManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a62378b9", new Object[]{downloadManager, str});
        }
        return downloadManager.getDownloadFilePath(str);
    }

    public static /* synthetic */ File access$200(DownloadManager downloadManager, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("f4e64f5f", new Object[]{downloadManager, str, new Boolean(z)});
        }
        return downloadManager.getTempFile(str, z);
    }

    private String getDownloadFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("514c4570", new Object[]{this, str});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.mExternalFilesDir);
        sb.append("/downloads/");
        sb.append(str);
        return sb.toString();
    }

    public static DownloadManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DownloadManager) ipChange.ipc$dispatch("89961bb7", new Object[0]);
        }
        return ClassHolder.instance;
    }

    private File getTempFile(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("e5501970", new Object[]{this, str, new Boolean(z)});
        }
        String md5ToHex = StringUtils.md5ToHex(str);
        if (md5ToHex != null) {
            str = md5ToHex;
        }
        if (z) {
            return new File(this.mExternalCacheDir, str);
        }
        return new File(this.context.getCacheDir(), str);
    }

    private void prepareDownloadFolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30d8a04", new Object[]{this});
        } else if (this.context != null) {
            File file = new File(this.mExternalFilesDir, DOWNLOAD_FOLDER);
            if (!file.exists()) {
                file.mkdir();
            }
        }
    }

    private boolean prepareFolder(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("633a112a", new Object[]{this, str})).booleanValue();
        }
        if (this.context != null) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    return file.mkdir();
                }
                return true;
            } catch (Exception unused) {
                ALog.e(TAG, "create folder failed", null, "folder", str);
            }
        }
        return false;
    }

    public int enqueue(String str, String str2, DownloadListener downloadListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a221a131", new Object[]{this, str, str2, downloadListener})).intValue() : enqueue(str, null, str2, downloadListener);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class DownloadTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String filePath;
        private final CopyOnWriteArrayList<DownloadListener> listenerList;
        public final int taskId;
        public final URL url;
        private boolean useExternalCache;
        private final AtomicBoolean isCancelled = new AtomicBoolean(false);
        private final AtomicBoolean isFinish = new AtomicBoolean(false);
        private volatile Connection conn = null;

        static {
            t2o.a(607126042);
        }

        public DownloadTask(URL url, String str, String str2, DownloadListener downloadListener) {
            this.useExternalCache = true;
            this.taskId = DownloadManager.this.taskIdGen.getAndIncrement();
            this.url = url;
            str2 = TextUtils.isEmpty(str2) ? parseFileNameForURL(url) : str2;
            if (TextUtils.isEmpty(str)) {
                this.filePath = DownloadManager.access$100(DownloadManager.this, str2);
            } else {
                if (str.endsWith("/")) {
                    this.filePath = str + str2;
                } else {
                    this.filePath = str + wh6.DIR + str2;
                }
                if (str.startsWith("/data/user") || str.startsWith("/data/data")) {
                    this.useExternalCache = false;
                }
            }
            CopyOnWriteArrayList<DownloadListener> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.listenerList = copyOnWriteArrayList;
            copyOnWriteArrayList.add(downloadListener);
        }

        private void notifyFail(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4e21c3f", new Object[]{this, new Integer(i), str});
            } else if (this.isFinish.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.listenerList.iterator();
                while (it.hasNext()) {
                    it.next().onFail(this.taskId, i, str);
                }
            }
        }

        private void notifyProgress(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d4735d", new Object[]{this, new Long(j), new Long(j2)});
            } else if (!this.isFinish.get()) {
                Iterator<DownloadListener> it = this.listenerList.iterator();
                while (it.hasNext()) {
                    it.next().onProgress(this.taskId, j, j2);
                }
            }
        }

        private void notifySuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("16896f8b", new Object[]{this, str});
            } else if (this.isFinish.compareAndSet(false, true)) {
                Iterator<DownloadListener> it = this.listenerList.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(this.taskId, str);
                }
            }
        }

        private long parseContentLength(int i, Map<String, List<String>> map, long j) {
            long j2;
            int lastIndexOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c44cdde3", new Object[]{this, new Integer(i), map, new Long(j)})).longValue();
            }
            try {
                if (i == 200) {
                    return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length"));
                }
                if (i != 206) {
                    return 0L;
                }
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CONTENT_RANGE);
                if (singleHeaderFieldByKey == null || (lastIndexOf = singleHeaderFieldByKey.lastIndexOf(47)) == -1) {
                    j2 = 0;
                } else {
                    j2 = Long.parseLong(singleHeaderFieldByKey.substring(lastIndexOf + 1));
                }
                if (j2 == 0) {
                    try {
                        return Long.parseLong(HttpHelper.getSingleHeaderFieldByKey(map, "Content-Length")) + j;
                    } catch (Exception unused) {
                    }
                }
                return j2;
            } catch (Exception unused2) {
                return 0L;
            }
        }

        private String parseFileNameForURL(URL url) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("36c0d51a", new Object[]{this, url});
            }
            String path = url.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf != -1) {
                str = path.substring(lastIndexOf + 1, path.length());
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String md5ToHex = StringUtils.md5ToHex(url.toString());
            if (md5ToHex == null) {
                return url.getFile();
            }
            return md5ToHex;
        }

        private void removeRangeHeader(List<Header> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aeb2bf7e", new Object[]{this, list});
            } else if (list != null) {
                ListIterator<Header> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (HttpConstant.RANGE.equalsIgnoreCase(listIterator.next().getName())) {
                        listIterator.remove();
                        return;
                    }
                }
            }
        }

        public boolean attachListener(DownloadListener downloadListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("577869bf", new Object[]{this, downloadListener})).booleanValue();
            }
            if (this.isFinish.get()) {
                return false;
            }
            this.listenerList.add(downloadListener);
            return true;
        }

        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            this.isCancelled.set(true);
            notifyFail(-105, "download canceled.");
            if (this.conn != null) {
                try {
                    this.conn.cancel();
                } catch (RemoteException unused) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:193:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:201:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:203:0x029f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0297 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:223:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0275 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0289 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:239:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 685
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.download.DownloadManager.DownloadTask.run():void");
        }
    }

    private DownloadManager() {
        this.taskMap = new SparseArray<>(6);
        this.taskIdGen = new AtomicInteger(0);
        this.executor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Factory("AWCN Download"));
        this.context = null;
        this.mExternalFilesDir = null;
        this.mExternalCacheDir = null;
        Context context = NetworkSdkSetting.getContext();
        this.context = context;
        this.mExternalFilesDir = context.getExternalFilesDir(null);
        this.mExternalCacheDir = this.context.getExternalCacheDir();
        this.executor.allowCoreThreadTimeOut(true);
        prepareDownloadFolder();
    }

    public int enqueue(String str, String str2, String str3, DownloadListener downloadListener) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eb3ed3b", new Object[]{this, str, str2, str3, downloadListener})).intValue();
        }
        if (ALog.isPrintLog(2)) {
            ALog.i(TAG, "enqueue", null, "folder", str2, UploadConstants.FILE_NAME, str3, "url", str);
        }
        if (this.context == null) {
            ALog.e(TAG, "network sdk not initialized.", null, new Object[0]);
            return -1;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(str2) || prepareFolder(str2)) {
                synchronized (this.taskMap) {
                    try {
                        int size = this.taskMap.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            DownloadTask valueAt = this.taskMap.valueAt(i);
                            if (!url.equals(valueAt.url)) {
                                i++;
                            } else if (valueAt.attachListener(downloadListener)) {
                                return valueAt.taskId;
                            }
                        }
                        DownloadTask downloadTask = new DownloadTask(url, str2, str3, downloadListener);
                        this.taskMap.put(downloadTask.taskId, downloadTask);
                        this.executor.submit(downloadTask);
                        return downloadTask.taskId;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                ALog.e(TAG, "file folder invalid.", null, new Object[0]);
                if (downloadListener != null) {
                    downloadListener.onFail(-1, -101, "file folder path invalid");
                }
                return -1;
            }
        } catch (MalformedURLException e) {
            ALog.e(TAG, "url invalid.", null, e, new Object[0]);
            if (downloadListener != null) {
                downloadListener.onFail(-1, -100, "url invalid");
            }
            return -1;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Factory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;
        public AtomicInteger seq = new AtomicInteger(0);

        static {
            t2o.a(607126043);
        }

        public Factory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.name + this.seq.incrementAndGet());
            ALog.i(DownloadManager.TAG, "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    public void cancel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d4d22", new Object[]{this, new Integer(i)});
            return;
        }
        synchronized (this.taskMap) {
            try {
                DownloadTask downloadTask = this.taskMap.get(i);
                if (downloadTask != null) {
                    if (ALog.isPrintLog(2)) {
                        ALog.i(TAG, "try cancel task" + i + " url=" + downloadTask.url.toString(), null, new Object[0]);
                    }
                    this.taskMap.remove(i);
                    downloadTask.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
