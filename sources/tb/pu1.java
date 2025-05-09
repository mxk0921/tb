package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.Logger;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMMetaInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zoloz.hummer.common.ClientConfig;
import com.ap.zoloz.hummer.common.TaskConfig;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseFacade";
    public static boolean c;

    /* renamed from: a  reason: collision with root package name */
    public f9b f26303a;
    public g9b b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends Logger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ap/zoloz/hummer/api/BaseFacade$1");
        }

        public int debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public String getStackTraceString(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d582e916", new Object[]{this, th});
            }
            return "";
        }

        public int info(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }

        public int warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue();
            }
            return 0;
        }
    }

    static {
        t2o.a(245366807);
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("292f47a8", new Object[]{context});
        }
        BioLog.setLogger(new a());
        ApSecurityService localService = BioServiceManager.getLocalService(context, ApSecurityService.class);
        if (localService != null) {
            localService.setContext(context);
        }
        try {
            ZIMMetaInfo zimMetaInfo = ZIMFacade.getZimMetaInfo(context, (Map) null);
            zimMetaInfo.setBioMetaInfo(new StringBuilder(zimMetaInfo.getBioMetaInfo()).replace(0, 6, "3.78.0").toString());
            return JSON.toJSONString(zimMetaInfo);
        } catch (Throwable th) {
            BioLog.e(th);
            return "";
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6896bb61", new Object[]{this});
            return;
        }
        BioLog.i("BaseFacade forceQuit");
        g9b g9bVar = this.b;
        if (g9bVar != null) {
            g9bVar.o();
        }
        f9b f9bVar = this.f26303a;
        if (f9bVar != null) {
            f9bVar.c();
        }
        jqn.a().d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        c = false;
        vk0.e().f();
        jho.d().g();
        jqn.a().d();
        nzw.c().g();
        g9b g9bVar = this.b;
        if (g9bVar != null) {
            g9bVar.s();
            this.b = null;
        }
        f9b f9bVar = this.f26303a;
        if (f9bVar != null) {
            f9bVar.q();
            this.f26303a = null;
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        f9b f9bVar = this.f26303a;
        if (f9bVar != null) {
            f9bVar.b = context;
            vk0.e().g(context);
            return;
        }
        BioLog.e("hummer context is null");
    }

    public boolean c(String str) {
        ArrayList<TaskConfig> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50b77715", new Object[]{this, str})).booleanValue();
        }
        if (!(this.b == null || this.f26303a == null)) {
            try {
                ClientConfig clientConfig = (ClientConfig) JSON.parseObject(str, ClientConfig.class);
                if (clientConfig == null) {
                    return false;
                }
                this.f26303a.r(clientConfig);
                Map<String, Object> map = clientConfig.factorContext;
                if (map == null || map.size() == 0 || (arrayList = clientConfig.tasks) == null || arrayList.size() == 0 || clientConfig.clientStartIndex <= 0) {
                    return false;
                }
                this.f26303a.m(clientConfig.zStack);
                for (Map.Entry<String, Object> entry : clientConfig.factorContext.entrySet()) {
                    this.f26303a.a(entry.getKey(), "serverConfig", entry.getValue());
                }
                f9b f9bVar = this.f26303a;
                f9bVar.a("metaInfo", "context", b(f9bVar.b.getApplicationContext()));
                return true;
            } catch (Exception e) {
                BioLog.e(e.toString());
            }
        }
        return false;
    }
}
