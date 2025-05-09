package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.PrefsIPCChannel;
import com.taobao.accs.asp.a;
import com.taobao.accs.asp.d;
import com.taobao.accs.utl.ALog;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
import tb.kf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class c extends com.taobao.accs.asp.a implements OnDataUpdateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

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
                return;
            }
            c cVar = c.this;
            PrefsIPCChannel.b.c(cVar.d, cVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class b extends a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343932979);
        }

        public b(c cVar) {
            super();
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/asp/EdgeSharedPreferences$EdgeEditor");
        }

        @Override // com.taobao.accs.asp.a.d
        public void d(a.e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4502d593", new Object[]{this, eVar});
                return;
            }
            ModifiedRecord modifiedRecord = eVar.d;
            if (modifiedRecord != null) {
                long currentTimeMillis = System.currentTimeMillis();
                PrefsIPCChannel.b.a(modifiedRecord);
                ALog.i("EdgeSharedPreferences", "commitToDisk", "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }
    }

    static {
        t2o.a(343932977);
        t2o.a(343932983);
    }

    public c(Context context, String str, SharedPreferences sharedPreferences) {
        super(context, str, sharedPreferences, 1);
        j();
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/asp/EdgeSharedPreferences");
    }

    @Override // com.taobao.accs.asp.a
    public a.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("d64372c8", new Object[]{this});
        }
        return new b(this);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682d8c3b", new Object[]{this});
        } else {
            kf.g(new a());
        }
    }

    @Override // com.taobao.accs.asp.OnDataUpdateListener
    public void onDataUpdate(ModifiedRecord modifiedRecord) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42abd893", new Object[]{this, modifiedRecord});
        } else {
            i(modifiedRecord);
        }
    }

    @Override // com.taobao.accs.asp.a
    public void g() {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5d8214", new Object[]{this});
        } else if (!this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            FileLock fileLock = null;
            try {
                randomAccessFile = new RandomAccessFile(this.e, "rw");
                int i = 0;
                while (fileLock == null && i < 10) {
                    try {
                        fileLock = randomAccessFile.getChannel().tryLock();
                        if (fileLock == null) {
                            Thread.sleep(20L);
                            i++;
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                randomAccessFile = null;
            }
            for (Map.Entry<String, ?> entry : this.f.getAll().entrySet()) {
                ((HashMap) this.g).put(entry.getKey(), new a.f(this, entry.getValue()));
            }
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    ALog.e("EdgeSharedPreferences", "randomAccessFile close err", th2, new Object[0]);
                }
            }
            this.h = true;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            ALog.i("EdgeSharedPreferences", "loadFromSP", "cost", Long.valueOf(currentTimeMillis2));
            d.b bVar = new d.b(this.d, 1);
            bVar.c = currentTimeMillis2;
            bVar.d = 1;
            bVar.b();
        }
    }
}
