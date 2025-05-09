package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import tb.je4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c6g implements tb9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements je4.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f16890a;
        public final /* synthetic */ Map b;

        public a(c6g c6gVar, File file, Map map) {
            this.f16890a = file;
            this.b = map;
        }

        @Override // tb.je4.b
        public void run() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.f16890a));
            try {
                h6g.b(this.b, bufferedOutputStream);
                bufferedOutputStream.close();
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }

    static {
        t2o.a(407896074);
        t2o.a(407896073);
    }

    @Override // tb.tb9
    public void a(Map<String, ?> map, File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1341f3b6", new Object[]{this, map, file, file2});
            return;
        }
        new a(this, file2, map).run();
        uhh.c("KvStoreFileAction", "write to", file2.getAbsolutePath());
    }

    @Override // tb.tb9
    public Map<String, ?> b(File file, File file2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e400676", new Object[]{this, file, file2});
        }
        if (file2.exists()) {
            uhh.c("KvStoreFileAction", "read from", file2.getAbsolutePath());
            return h6g.a(file2);
        } else if (!file.exists()) {
            return new HashMap();
        } else {
            uhh.c("KvStoreFileAction", "read from", file.getAbsolutePath());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                HashMap<String, ?> a2 = unx.a(bufferedInputStream);
                bufferedInputStream.close();
                return a2;
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        }
    }
}
