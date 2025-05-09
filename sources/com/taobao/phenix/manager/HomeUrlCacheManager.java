package com.taobao.phenix.manager;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.LimitedConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.b05;
import tb.s0m;
import tb.t2o;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HomeUrlCacheManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FILE_NAME = "phenix_home_url_cache";
    private static volatile boolean sInited = false;
    private static final long serialVersionUID = 1325468790;
    private LimitedConcurrentHashMap<String, String> data;
    private AtomicBoolean needSave;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HomeUrlCacheManager.this.saveToDisk();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final HomeUrlCacheManager f11476a = new HomeUrlCacheManager(null);

        static {
            t2o.a(620757133);
        }

        public static /* synthetic */ HomeUrlCacheManager a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HomeUrlCacheManager) ipChange.ipc$dispatch("cd03421c", new Object[0]);
            }
            return f11476a;
        }
    }

    static {
        t2o.a(620757131);
    }

    public /* synthetic */ HomeUrlCacheManager(a aVar) {
        this();
    }

    public static HomeUrlCacheManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HomeUrlCacheManager) ipChange.ipc$dispatch("2f6a4af6", new Object[0]);
        }
        return b.a();
    }

    public String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        }
        return this.data.get(str);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!sInited) {
            try {
                loadFromDisk(context);
                sInited = true;
            } catch (Throwable unused) {
            }
        }
    }

    private HomeUrlCacheManager() {
        this.data = new LimitedConcurrentHashMap<>(100);
        this.needSave = new AtomicBoolean(false);
    }

    private synchronized void loadFromDisk(Context context) {
        Throwable th;
        ObjectInputStream objectInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4338d4", new Object[]{this, context});
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(context.getFilesDir(), FILE_NAME);
                if (!file.exists()) {
                    file.createNewFile();
                }
                file.setReadable(true);
                file.setWritable(true);
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStream2);
                    try {
                        this.data = (LimitedConcurrentHashMap) objectInputStream.readObject();
                        xv8.b(6, "HomeUrlCacheManager", "loadFromDisk size:" + this.data.size());
                        try {
                            objectInputStream.close();
                        } catch (Throwable unused) {
                        }
                        fileInputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        xv8.b(6, "HomeUrlCacheManager", "loadFromDisk error" + th.getMessage());
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    objectInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                objectInputStream = null;
            }
        } catch (Throwable unused3) {
        }
    }

    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
            return;
        }
        this.data.put(str, str2);
        if (!this.needSave.get()) {
            xv8.b(6, "HomeUrlCacheManager", "saveToDisk start: " + this.data.size());
            this.needSave.set(true);
            b05.a(new a(), 3L, TimeUnit.SECONDS);
        }
    }

    public synchronized void saveToDisk() {
        ObjectOutputStream objectOutputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69de89c", new Object[]{this});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(s0m.B().b().getFilesDir(), FILE_NAME);
                file.setReadable(true);
                file.setWritable(true);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                    try {
                        objectOutputStream.writeObject(this.data);
                        this.needSave.set(false);
                        xv8.b(6, "HomeUrlCacheManager", "saveToDisk success " + this.data.size());
                        try {
                            objectOutputStream.close();
                        } catch (Throwable unused) {
                        }
                        fileOutputStream2.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        xv8.b(6, "HomeUrlCacheManager", "saveToDisk error" + th.getMessage());
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectOutputStream = null;
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
    }
}
