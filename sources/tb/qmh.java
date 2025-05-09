package tb;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.lpm_android.LpmProxy;
import com.taobao.taolive.lpm_android.event.EventType;
import com.taobao.taolive.lpm_android.event.LpmEventType;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String i = qmh.class.getSimpleName();
    public static qmh j;

    /* renamed from: a  reason: collision with root package name */
    public final qpv f26825a = new qpv();
    public final ff4 b = new ff4();
    public final btj c = new btj();
    public final e d = new e();
    public final cmi e = new cmi();
    public final smh f = new smh();
    public final tmh g = new tmh();
    public Context h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType;

        static {
            int[] iArr = new int[LpmEventType.values().length];
            $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType = iArr;
            try {
                iArr[LpmEventType.USERACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.MTOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.ORANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.AB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.VPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[LpmEventType.TAOLIVE_GOODS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        t2o.a(806355565);
    }

    public static qmh f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qmh) ipChange.ipc$dispatch("f2b2688a", new Object[0]);
        }
        if (j == null) {
            j = new qmh();
        }
        return j;
    }

    public void a(LpmEventType lpmEventType, String str, JSONObject jSONObject, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b311ddc", new Object[]{this, lpmEventType, str, jSONObject, str2, str3});
        } else {
            b(lpmEventType, str, jSONObject, str2, str3);
        }
    }

    public final void b(LpmEventType lpmEventType, String str, JSONObject jSONObject, String str2, String str3) {
        EventType eventType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ddba3d", new Object[]{this, lpmEventType, str, jSONObject, str2, str3});
            return;
        }
        try {
            if (h() && lpmEventType != null) {
                switch (a.$SwitchMap$com$taobao$taolive$lpm_android$event$LpmEventType[lpmEventType.ordinal()]) {
                    case 1:
                        eventType = EventType.USERACTION;
                        break;
                    case 2:
                        eventType = EventType.MESSAGE;
                        break;
                    case 3:
                        eventType = EventType.MTOP;
                        break;
                    case 4:
                        eventType = EventType.ORANGE;
                        break;
                    case 5:
                        eventType = EventType.AB;
                        break;
                    case 6:
                        eventType = EventType.VPM;
                        break;
                    case 7:
                        eventType = EventType.SYSTEM;
                        break;
                    case 8:
                        eventType = EventType.TAOLIVE_GOODS;
                        break;
                    default:
                        eventType = null;
                        break;
                }
                LpmProxy.getInstance().addTrace(eventType, str, jSONObject, str2, str3);
            }
        } catch (Exception e) {
            String str4 = i;
            TLog.loge("TBLive", str4, "LpmProxy exception = " + e.getMessage());
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ada33e37", new Object[]{this})).booleanValue();
        }
        return bl9.g().b();
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        TLog.loge("TBLive", i, "initialize");
        if (context != null) {
            this.h = context.getApplicationContext();
        }
        if (c()) {
            e();
        } else {
            FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, context);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c874f8e0", new Object[]{this});
            return;
        }
        try {
            if (!h()) {
                TLog.loge("TBLive", i, "initializeWhenReady isRemoteInstalled false");
                return;
            }
            TLog.loge("TBLive", i, "initializeWhenReady");
            if (g(this.h)) {
                Toast.makeText(this.h, "lpm 安装成功", 1).show();
            }
            LpmProxy.getInstance().initialize(this.h);
            if (this.g.a() != null) {
                LpmProxy.getInstance().updateAppInfo(this.g.a().a(), this.g.a().b());
            }
        } catch (Exception e) {
            String str = i;
            TLog.loge("TBLive", str, "LpmProxy exception = " + e.getMessage());
        }
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3169ab69", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ac48ed5", new Object[]{this})).booleanValue();
        }
        return bl9.g().b();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("187004", new Object[]{this});
            return;
        }
        TLog.loge("TBLive", i, "refreshConfig");
        j();
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcf2b93", new Object[]{this});
            return;
        }
        try {
            if (!h()) {
                TLog.loge("TBLive", i, "refreshConfig isRemoteInstalled false");
                return;
            }
            TLog.loge("TBLive", i, "refreshConfigWhenReady");
            LpmProxy.getInstance().refreshConfig();
        } catch (Exception e) {
            String str = i;
            TLog.loge("TBLive", str, "LpmProxy exception = " + e.getMessage());
        }
    }

    public void k(e51 e51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6fbbb7", new Object[]{this, e51Var});
            return;
        }
        TLog.loge("TBLive", i, "updateAppInfo");
        this.g.b(e51Var);
        l(e51Var);
    }

    public final void l(e51 e51Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7abb7e94", new Object[]{this, e51Var});
            return;
        }
        try {
            if (!h()) {
                TLog.loge("TBLive", i, "updateAppInfoWhenReady isRemoteInstalled false");
                return;
            }
            TLog.loge("TBLive", i, "updateAppInfoWhenReady");
            LpmProxy.getInstance().updateAppInfo(e51Var.a(), e51Var.b());
        } catch (Exception e) {
            String str = i;
            TLog.loge("TBLive", str, "LpmProxy exception = " + e.getMessage());
        }
    }
}
