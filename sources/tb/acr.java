package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class acr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
            } else if (map != null && map.size() > 0) {
                c(map.get("ex_thread_pool"));
                b(map);
                ybr.a(map);
            }
        }

        public final void b(Map<String, String> map) {
            Throwable th;
            Exception e;
            FileWriter fileWriter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc0e9d1", new Object[]{this, map});
                return;
            }
            FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new FileWriter(new File(u9a.a().getFilesDir(), ".orange_fake.txt"));
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    fileWriter.write(entry.getKey());
                    fileWriter.write("=");
                    fileWriter.write(entry.getValue());
                    fileWriter.write("\n");
                }
                nw3.a(fileWriter);
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                yhh.a(e);
                nw3.a(fileWriter2);
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                nw3.a(fileWriter2);
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v14 */
        public final void c(String str) {
            Throwable th;
            Exception e;
            FileWriter fileWriter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ba811d3", new Object[]{this, str});
                return;
            }
            File file = new File(u9a.a().getFilesDir(), "ex_thread_pool.txt");
            if (TextUtils.isEmpty(str)) {
                file.delete();
                return;
            }
            FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new FileWriter(file);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                String[] split = str.split(";");
                int length = split.length;
                for (String str2 : split) {
                    fileWriter.write(str2);
                    fileWriter.write("\n");
                }
                nw3.a(fileWriter);
                fileWriter2 = length;
            } catch (Exception e3) {
                e = e3;
                fileWriter2 = fileWriter;
                yhh.a(e);
                nw3.a(fileWriter2);
                fileWriter2 = fileWriter2;
            } catch (Throwable th3) {
                th = th3;
                fileWriter2 = fileWriter;
                nw3.a(fileWriter2);
                throw th;
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("TBExecutor");
            if (configs != null && configs.size() > 0) {
                a(configs);
            }
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        if (u9a.a() == null) {
            u9a.b(application);
        }
        OrangeConfig.getInstance().getConfigs("TBExecutor");
        OrangeConfig.getInstance().registerListener(new String[]{"TBExecutor"}, new b(), true);
    }
}
