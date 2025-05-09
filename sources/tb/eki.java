package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alibaba.android.patronus.Patrons;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eki {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18642a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f18643a;

        public a(Application application) {
            this.f18643a = application;
        }

        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
                return;
            }
            SharedPreferences.Editor edit = m7l.a(this.f18643a, "MemKeeper", 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    edit.putString(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    Log.e("MemKeeper", e.toString());
                }
            }
            edit.commit();
            eki.a(this.f18643a);
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("MemKeeper");
            if (configs != null && configs.size() > 0) {
                a(configs);
            }
        }
    }

    public static /* synthetic */ void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c1348", new Object[]{application});
        } else {
            d(application);
        }
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02e19a", new Object[]{application});
            return;
        }
        OrangeConfig.getInstance().getConfigs("MemKeeper");
        OrangeConfig.getInstance().registerListener(new String[]{"MemKeeper"}, new a(application), true);
    }

    public static boolean e() {
        boolean is64Bit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[0])).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 31) {
            return false;
        }
        is64Bit = Process.is64Bit();
        if (!is64Bit) {
            return true;
        }
        return false;
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (e()) {
            c(application);
            if (!"true".equals(m7l.a(application, "MemKeeper", 0).getString("runAfterOrange", "false"))) {
                d(application);
            }
        }
    }

    public static void d(Application application) {
        float f;
        int i;
        String str = "0.7";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fd437a3", new Object[]{application});
        } else if (!f18642a) {
            f18642a = true;
            SharedPreferences a2 = m7l.a(application, "MemKeeper", 0);
            try {
                String string = a2.getString("NEED_MEM_KEEP", "true");
                int i2 = 26;
                String string2 = a2.getString("MIN_SDK", String.valueOf(26));
                int i3 = 30;
                String string3 = a2.getString("MAX_SDK", String.valueOf(30));
                String string4 = a2.getString("periodOfShrink", str);
                boolean equals = "true".equals(string);
                if (string2 == null) {
                    string2 = AgooConstants.REPORT_DUPLICATE_FAIL;
                }
                try {
                    i2 = Integer.parseInt(string2);
                    if (string3 == null) {
                        string3 = "31";
                    }
                    i3 = Integer.parseInt(string3);
                    if (string4 != null) {
                        str = string4;
                    }
                    f = Float.parseFloat(str);
                } catch (Exception unused) {
                    Log.e("MemKeeper", "exception");
                    f = 0.7f;
                }
                if (equals && (i = Build.VERSION.SDK_INT) >= i2 && i <= i3) {
                    Patrons.a aVar = new Patrons.a();
                    if (f > 0.5f && f <= 1.0f) {
                        try {
                            aVar.b = f;
                        } catch (Exception unused2) {
                            Log.e("MemKeeper", "exception");
                        }
                    }
                    if (Patrons.init(application, aVar) == 0) {
                        int i4 = 524288;
                        String string5 = a2.getString("SHRINK_SIZE", String.valueOf(524288));
                        if (string5 != null) {
                            try {
                                int parseInt = Integer.parseInt(string5);
                                if (parseInt >= 524288) {
                                    i4 = parseInt;
                                }
                                Patrons.shrinkThreadSize(i4);
                            } catch (Exception unused3) {
                                Log.e("MemKeeper", "exception");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("MemKeeper", e.toString());
            }
        }
    }
}
