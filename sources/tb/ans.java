package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.CustomizeScheduleTask;
import com.taobao.android.tschedule.task.HttpScheduleTask;
import com.taobao.android.tschedule.task.MtopScheduleTask;
import com.taobao.android.tschedule.task.PhenixScheduleTask;
import com.taobao.android.tschedule.task.RenderScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.CustomTaskContext;
import com.taobao.android.tschedule.taskcontext.HttpTaskContext;
import com.taobao.android.tschedule.taskcontext.MtopTaskContext;
import com.taobao.android.tschedule.taskcontext.PhenixTaskContext;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ans {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252883);
    }

    public static ScheduleTask a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask) ipChange.ipc$dispatch("6caf7852", new Object[]{str, jSONObject});
        }
        return b(str, jSONObject, null);
    }

    public static ScheduleTask b(String str, JSONObject jSONObject, ScheduleProtocolCallback scheduleProtocolCallback) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask) ipChange.ipc$dispatch("dd79280c", new Object[]{str, jSONObject, scheduleProtocolCallback});
        }
        try {
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case -2098191020:
                    if (string.equals("dx2Render")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1866720743:
                    if (string.equals(z1x.PRE_RENDER)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1210687339:
                    if (string.equals("dx3Render")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -989338224:
                    if (string.equals("phenix")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -361093191:
                    if (string.equals("dx3Template")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3213448:
                    if (string.equals("http")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3362248:
                    if (string.equals("mtop")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1446361272:
                    if (string.equals("dx2Template")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1611566147:
                    if (string.equals("customize")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2010544511:
                    if (string.equals("preCreate")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                switch (c) {
                    case 5:
                        PhenixTaskContext phenixTaskContext = (PhenixTaskContext) JSON.toJavaObject(jSONObject, PhenixTaskContext.class);
                        if (phenixTaskContext != null) {
                            return new PhenixScheduleTask(str, phenixTaskContext, scheduleProtocolCallback);
                        }
                        return null;
                    case 6:
                    case 7:
                        RenderTaskContext renderTaskContext = (RenderTaskContext) JSON.toJavaObject(jSONObject, RenderTaskContext.class);
                        if (renderTaskContext == null) {
                            return null;
                        }
                        RenderTaskContext.RenderParams renderParams = renderTaskContext.params;
                        yms.c(str, renderParams.url, renderParams.timeContent);
                        return new RenderScheduleTask(str, renderTaskContext, scheduleProtocolCallback);
                    case '\b':
                        CustomTaskContext customTaskContext = (CustomTaskContext) JSON.toJavaObject(jSONObject, CustomTaskContext.class);
                        if (customTaskContext != null) {
                            return new CustomizeScheduleTask(str, customTaskContext, scheduleProtocolCallback);
                        }
                        return null;
                    case '\t':
                        HttpTaskContext httpTaskContext = (HttpTaskContext) JSON.toJavaObject(jSONObject, HttpTaskContext.class);
                        if (httpTaskContext != null) {
                            return new HttpScheduleTask(str, httpTaskContext, scheduleProtocolCallback);
                        }
                        return null;
                    default:
                        return null;
                }
            } else {
                MtopTaskContext mtopTaskContext = (MtopTaskContext) JSON.toJavaObject(jSONObject, MtopTaskContext.class);
                if (mtopTaskContext != null) {
                    return new MtopScheduleTask(str, mtopTaskContext, scheduleProtocolCallback);
                }
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
