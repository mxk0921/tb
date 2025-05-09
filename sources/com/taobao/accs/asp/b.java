package com.taobao.accs.asp;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.a;
import com.taobao.accs.asp.d;
import com.taobao.accs.utl.ALog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class b extends com.taobao.accs.asp.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SharedPreferences.Editor k;

    static {
        t2o.a(343932975);
    }

    public b(Context context, String str, SharedPreferences sharedPreferences) {
        super(context, str, sharedPreferences, 0);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/asp/CoreSharedPreferences");
    }

    public static /* synthetic */ SharedPreferences.Editor j(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("1a3777c0", new Object[]{bVar});
        }
        return bVar.k;
    }

    public static /* synthetic */ SharedPreferences.Editor k(b bVar, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("34bf2c07", new Object[]{bVar, editor});
        }
        bVar.k = editor;
        return editor;
    }

    @Override // com.taobao.accs.asp.a
    public a.d e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("d64372c8", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.accs.asp.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5d8214", new Object[]{this});
        } else if (!this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry<String, ?> entry : this.f.getAll().entrySet()) {
                ((HashMap) this.g).put(entry.getKey(), new a.f(this, entry.getValue()));
            }
            this.h = true;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            ALog.i("CoreSharedPreferences", "loadFromSP", "cost", Long.valueOf(currentTimeMillis2));
            d.b bVar = new d.b(this.d, 1);
            bVar.c = currentTimeMillis2;
            bVar.d = 1;
            bVar.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public final class a extends a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343932976);
        }

        public a() {
            super();
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/asp/CoreSharedPreferences$CoreEditor");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v10, types: [java.nio.channels.FileLock] */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v5, types: [com.taobao.accs.asp.d$b] */
        @Override // com.taobao.accs.asp.a.d
        public void d(a.e eVar) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4502d593", new Object[]{this, eVar});
                return;
            }
            ModifiedRecord modifiedRecord = eVar.d;
            if (modifiedRecord != null) {
                PrefsIPCChannel.getInstance().dataUpdateEvent(modifiedRecord);
                long currentTimeMillis = System.currentTimeMillis();
                if (b.j(b.this) == null) {
                    b bVar = b.this;
                    b.k(bVar, bVar.f.edit());
                }
                if (modifiedRecord.isClear) {
                    b.j(b.this).clear();
                }
                for (String str : modifiedRecord.modified.keySet()) {
                    Object obj = modifiedRecord.modified.get(str);
                    if (obj == null) {
                        b.j(b.this).remove(str);
                    } else if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (str2.length() >= d.c.ALARM_SIZE) {
                            d.c cVar = new d.c(b.this.d);
                            cVar.b = str;
                            cVar.d = str.length();
                            cVar.c = str2;
                            cVar.e = str2.length();
                            cVar.b();
                        }
                        b.j(b.this).putString(str, str2);
                    } else if (obj instanceof Integer) {
                        b.j(b.this).putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        b.j(b.this).putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        b.j(b.this).putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof ArrayList) {
                        b.j(b.this).putStringSet(str, new HashSet((ArrayList) obj));
                    } else if (obj instanceof Float) {
                        b.j(b.this).putFloat(str, ((Float) obj).floatValue());
                    }
                }
                FileLock fileLock = 0;
                fileLock = 0;
                try {
                    try {
                        fileLock = new RandomAccessFile(b.this.e, "rw").getChannel().lock();
                        z = b.j(b.this).commit();
                        if (fileLock != 0) {
                            try {
                                fileLock.release();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Throwable th) {
                        if (fileLock != 0) {
                            try {
                                fileLock.release();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    ALog.e("CoreSharedPreferences", "[commitToDisk]error.", e3, new Object[0]);
                    if (fileLock != 0) {
                        try {
                            fileLock.release();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    z = false;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                ALog.i("CoreSharedPreferences", "commitToDisk", "cost", Long.valueOf(currentTimeMillis2));
                fileLock = new d.b(b.this.d, 2);
                fileLock.c = currentTimeMillis2;
                int i = z ? 1 : 0;
                int i2 = z ? 1 : 0;
                fileLock.d = i;
                fileLock.b();
            }
        }
    }
}
