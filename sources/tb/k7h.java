package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k7h implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static k7h c = null;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Map<String, String>> f22446a = new ConcurrentHashMap<>();
    public String b;

    static {
        t2o.a(374341768);
        t2o.a(613416995);
    }

    public static k7h d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k7h) ipChange.ipc$dispatch("2e68fbcf", new Object[0]);
        }
        if (c == null) {
            synchronized (k7h.class) {
                try {
                    if (c == null) {
                        c = new k7h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final boolean a(String str, Map<String, String> map) {
        Throwable th;
        FileWriter fileWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be4e331e", new Object[]{this, str, map})).booleanValue();
        }
        File file = new File(e(str));
        if (file.exists()) {
            file.delete();
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String jSONString = JSON.toJSONString(map);
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(new File(e(str)));
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileWriter.write(jSONString);
            fileWriter.flush();
            try {
                fileWriter.close();
            } catch (IOException unused2) {
            }
            return true;
        } catch (Exception unused3) {
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileWriter2 = fileWriter;
            if (fileWriter2 != null) {
                try {
                    fileWriter2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{this, str, str2});
        }
        if (!this.f22446a.containsKey(str)) {
            Map<String, String> c2 = c(str);
            this.f22446a.put(str, c2);
            f(str);
            OrangeConfig.getInstance().getConfig(str, str2, "");
            return c2.get(str2);
        }
        Map<String, String> map = this.f22446a.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    public final Map<String, String> c(String str) {
        Throwable th;
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66c6b527", new Object[]{this, str});
        }
        File file = new File(e(str));
        if (!file.exists()) {
            return new HashMap();
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        HashMap hashMap = new HashMap();
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return hashMap;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                Map<String, String> map = (Map) JSON.parse(sb.toString());
                if (map != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                    return map;
                }
                try {
                    bufferedReader.close();
                } catch (IOException unused5) {
                }
                return new HashMap();
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (Exception unused6) {
        }
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e9f18f7", new Object[]{this, str});
        }
        return this.b + "/cached_config_0_" + str;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5874bb56", new Object[]{this, str});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{str}, this, false);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af63ca8e", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        try {
            a(str, OrangeConfig.getInstance().getConfigs(str));
        } catch (Throwable unused) {
        }
    }
}
