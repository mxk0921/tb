package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.n;
import com.taobao.falco.t;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ez8 extends t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final uqq ENV_FALCO_ID = new uqq("envFalcoId");
    public static final uqq AFC_ID = new uqq("afcId");
    public static final uqq AFC_ROUTER_URL = new uqq("afcRouterURL");
    public static final uqq PARENT_AFC_ID = new uqq("parentAfcId");
    public static final uqq SYSTEM_RECOVERY = new uqq("systemRecovery");
    public static final uqq INSTALLATION = new uqq("installation");
    public static final uqq LAUNCH_TYPE = new uqq("launchType");
    public static final bef LAUNCH_STATUS = new bef("launchStatus");
    public static final uqq LAUNCH_URL = new uqq("launchURL");
    public static final bef LOW_POWER_MODE = new bef("lowPowerMode");
    public static final bef TEMPERATURE = new bef("temperature");
    public static final uqq LEAVE_TYPE = new uqq("leaveType");
    public static final uqq BF_TYPE = new uqq("BFType");
    public static final uqq FROM_PAGE_NAME = new uqq("fromPageName");
    public static final uqq FROM_PAGE_URL = new uqq("fromPageURL");
    public static final bef START_CONTEXT_FIXED = new bef("startContextFixed");
    public static final ckh PROCESS_START = new ckh("processStart");
    public static final ckh LAUNCH_START = new ckh("launchStart");
    public static final ckh AFC_ROUTER_START = new ckh("afcRouterStart");
    public static final ckh AFC_ROUTER_END = new ckh("afcRouterEnd");
    public static final ckh LEAVE_TIME = new ckh("leaveTime");

    public ez8(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list);
    }

    public static /* synthetic */ Object ipc$super(ez8 ez8Var, String str, Object... objArr) {
        if (str.hashCode() == 972027726) {
            super.V0(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLifecycleActionSpanImpl");
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ef0f67", new Object[]{this, str});
        } else {
            i2(FROM_PAGE_URL, str);
        }
    }

    public void O1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a9146a", new Object[]{this, str});
        } else {
            i2(AFC_ID, str);
        }
    }

    public void P1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf535609", new Object[]{this, new Long(j)});
        } else {
            h2(AFC_ROUTER_END, j);
        }
    }

    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6aea315", new Object[]{this, str});
        } else {
            i2(FROM_PAGE_NAME, str);
        }
    }

    public void Q1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631e1922", new Object[]{this, new Long(j)});
        } else {
            h2(AFC_ROUTER_START, j);
        }
    }

    public void R1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a595f2b9", new Object[]{this, str});
        } else {
            i2(AFC_ROUTER_URL, str);
        }
    }

    public void S1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcde53f", new Object[]{this, str});
        } else {
            i2(BF_TYPE, str);
        }
    }

    public void T1(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ae163d", new Object[]{this, nVar});
            return;
        }
        Map<String, ?> j0 = nVar.j0();
        if (!j0.isEmpty()) {
            U1(j0, n.TECH_STACK);
            U1(j0, n.FROM_PAGE_NAME);
            U1(j0, n.FROM_PAGE_URL);
            U1(j0, n.PAGE_NAME);
            U1(j0, n.PAGE_URL);
            U1(j0, n.TRANSITION_TYPE);
            U1(j0, n.TOPIC);
            U1(j0, n.IS_FIRST_LOAD);
            U1(j0, n.IS_HIT_CACHE);
            U1(j0, n.ERROR_CODE);
            U1(j0, n.LEAVE_TYPE);
            U1(j0, n.CONTAINER_COLD_LAUNCH);
            U1(j0, n.RENDER_TYPE);
            U1(j0, n.HIT_SNAPSHOT);
            U1(j0, n.KERNEL_TYPE);
            U1(j0, n.CONTAINER_APP_ID);
            U1(j0, n.PAGE_TYPE);
            U1(j0, n.PAGE_LEVEL);
            this.d = nVar.z();
            V1(j0, n.BIZ_USER_ACTION_TIME);
            V1(j0, n.OPEN_PAGE);
            V1(j0, n.ROUTE_START);
            V1(j0, n.ROUTE_END);
            V1(j0, n.PAGE_CREATE_START);
            V1(j0, n.PAGE_CREATE_END);
            V1(j0, n.CONTAINER_INIT_START);
            V1(j0, n.ENGINE_INIT_START);
            V1(j0, n.ENGINE_INIT_END);
            V1(j0, n.CONTAINER_INIT_END);
            V1(j0, n.MAIN_DOC_REQUEST_START);
            V1(j0, n.MAIN_DOC_REQUEST_END);
            V1(j0, n.PAGE_READY_VISIBLE_START);
            V1(j0, n.PAGE_READY_VISIBLE_END);
            V1(j0, n.PAGE_READY_FIRST_FRAME_START);
            V1(j0, n.PAGE_READY_FIRST_FRAME_END);
            V1(j0, n.PAGE_FIRST_FRAME_RENDER_START);
            V1(j0, n.PAGE_FIRST_FRAME_RENDER_END);
            V1(j0, n.PAGE_BIZ_DISPLAY_TIME);
            V1(j0, n.PAGE_DISPLAY_TIME);
            V1(j0, n.PAGE_FCP_TIME);
            V1(j0, n.PAGE_FMP_TIME);
            V1(j0, n.PAGE_FSP_TIME);
            V1(j0, n.PAGE_INTERACTIVE_TIME);
            V1(j0, n.TAP_RESPONSE);
            V1(j0, n.BIZ_FIRST_SCREEN);
            V1(j0, n.FIRST_SCREEN);
            V1(j0, n.INTERACTIVE);
            V1(j0, n.LEAVE_TIME);
            if (nVar.J1()) {
                k2("1");
            }
        }
    }

    public final void U1(Map<String, ?> map, uqq uqqVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9131661", new Object[]{this, map, uqqVar});
            return;
        }
        Object obj = map.get(uqqVar.getKey());
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            L0(uqqVar.getKey(), str);
        }
    }

    @Override // com.taobao.falco.t, tb.pz8
    public void V0(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39eff74e", new Object[]{this, new Long(j), str});
            return;
        }
        super.V0(j, str);
        START_CONTEXT_FIXED.a(this, Integer.valueOf(fxp.l(fxp.j()) ? 1 : 0));
    }

    public final void V1(Map<String, ?> map, ckh ckhVar) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30335087", new Object[]{this, map, ckhVar});
            return;
        }
        Object obj = map.get(ckhVar.getKey());
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else {
            j = -1;
        }
        if (j > 0) {
            L0(ckhVar.getKey(), Long.valueOf(j));
        }
    }

    public void W1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768f0fdc", new Object[]{this, str});
        } else {
            i2(ENV_FALCO_ID, str);
        }
    }

    public void X1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60ad14b", new Object[]{this, str});
        } else {
            i2(INSTALLATION, str);
        }
    }

    public void Y1(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792a680e", new Object[]{this, new Long(j)});
        } else {
            h2(LAUNCH_START, j);
        }
    }

    public void Z1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cf1cf7", new Object[]{this, new Integer(i)});
        } else {
            j2(LAUNCH_STATUS, i);
        }
    }

    public void a2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd0f85e", new Object[]{this, str});
        } else {
            i2(LAUNCH_TYPE, str);
        }
    }

    public void b2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1c6e4d", new Object[]{this, str});
        } else {
            i2(LAUNCH_URL, str);
        }
    }

    public void c2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c25779", new Object[]{this, new Long(j)});
        } else {
            h2(LEAVE_TIME, j);
        }
    }

    public void d2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2da662", new Object[]{this, str});
        } else {
            i2(LEAVE_TYPE, str);
        }
    }

    public void e2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a4cc88", new Object[]{this, new Integer(i)});
        } else {
            j2(LOW_POWER_MODE, i);
        }
    }

    public void f2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3305d960", new Object[]{this, str});
        } else {
            i2(PARENT_AFC_ID, str);
        }
    }

    public void g2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93a127ca", new Object[]{this, new Long(j)});
        } else {
            h2(PROCESS_START, j);
        }
    }

    public final void h2(ckh ckhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8d8561", new Object[]{this, ckhVar, new Long(j)});
        } else if (j > 0) {
            L0(ckhVar.getKey(), Long.valueOf(j));
        }
    }

    public final void i2(uqq uqqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a91a863", new Object[]{this, uqqVar, str});
        } else if (!TextUtils.isEmpty(str)) {
            L0(uqqVar.getKey(), str);
        }
    }

    public final void j2(bef befVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce2d9ec", new Object[]{this, befVar, new Integer(i)});
        } else if (i >= 0) {
            L0(befVar.getKey(), Integer.valueOf(i));
        }
    }

    public void k2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930eee75", new Object[]{this, str});
        } else {
            i2(SYSTEM_RECOVERY, str);
        }
    }

    public void l2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb940268", new Object[]{this, new Integer(i)});
        } else {
            j2(TEMPERATURE, i);
        }
    }
}
