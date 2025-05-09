package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexAdvanced;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dar implements uec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgd f17690a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SoIndexData f17691a;
        public final /* synthetic */ SoIndexAdvanced b;

        public a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
            this.f17691a = soIndexData;
            this.b = soIndexAdvanced;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dar.c(dar.this, this.f17691a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements tpm<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(dar darVar) {
        }

        /* renamed from: a */
        public boolean test(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            return !str.equals("zstd");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements tpm<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(dar darVar) {
        }

        /* renamed from: a */
        public boolean test(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            return !str.startsWith("zstd|");
        }
    }

    public dar(cgd cgdVar) {
        this.f17690a = cgdVar;
    }

    public static /* synthetic */ void c(dar darVar, SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3964684a", new Object[]{darVar, soIndexData, soIndexAdvanced});
        } else {
            darVar.d(soIndexData, soIndexAdvanced);
        }
    }

    public static <T> void e(Map<String, T> map, tpm<String> tpmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74121cf", new Object[]{map, tpmVar});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (trq.c(key)) {
                RSoLog.g("TBChannelIndexHook, cleanupIndexData found empty key !!!");
            } else if (!tpmVar.test(key)) {
                hashMap.put(key, entry.getValue());
            }
        }
        map.clear();
        map.putAll(hashMap);
    }

    @Override // tb.uec
    public void b(List<SoIndexData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0d1a1", new Object[]{this, list});
        }
    }

    public final void d(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c277aa7", new Object[]{this, soIndexData, soIndexAdvanced});
            return;
        }
        e(soIndexData.getAssets(), new b(this));
        RSoLog.g("TBChannelIndexHook, after cleanup assets = " + soIndexData.getAssets());
        e(soIndexData.getEntries(), new c(this));
        RSoLog.g("TBChannelIndexHook, after cleanup entries = " + soIndexData.getEntries());
        e(soIndexAdvanced.getInfoMap(), new d(this));
        RSoLog.g("TBChannelIndexHook, after cleanup info2Map = " + soIndexAdvanced.getInfoMap());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements tpm<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(dar darVar) {
        }

        /* renamed from: a */
        public boolean test(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a78fe5a7", new Object[]{this, str})).booleanValue();
            }
            return str.startsWith("taopai/") || str.startsWith("dinamic/") || str.endsWith(".png") || str.endsWith(wh6.DX_MAIN_TEMPLATE_NAME) || str.contains(".msoac") || str.contains(".msoap") || str.startsWith("tixel/") || str.endsWith(".js");
        }
    }

    @Override // tb.uec
    public void a(SoIndexData soIndexData, SoIndexAdvanced soIndexAdvanced) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa69232", new Object[]{this, soIndexData, soIndexAdvanced});
        } else if (this.f17690a.a("key_index_channel_opt_enabled", true) && qts.c()) {
            RSoLog.d("TBChannelIndexHook,  cleanup  index data in channel process, start ...");
            rbn.i("cleanupIndexData.error", new a(soIndexData, soIndexAdvanced));
        }
    }
}
