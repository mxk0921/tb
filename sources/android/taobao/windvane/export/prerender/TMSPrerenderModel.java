package android.taobao.windvane.export.prerender;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.Metadata;
import tb.ckf;
import tb.lcn;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroid/taobao/windvane/export/prerender/TMSPrerenderModel;", "Ljava/io/Serializable;", "()V", "autoStart", "", "getAutoStart", "()Z", "setAutoStart", "(Z)V", "enable", "getEnable", "setEnable", "shuffleTime", "", "getShuffleTime", "()I", "setShuffleTime", "(I)V", "tasks", "", "Landroid/taobao/windvane/export/prerender/TMSPrerenderTaskModel;", "getTasks", "()Ljava/util/List;", "setTasks", "(Ljava/util/List;)V", "isMatchCondition", "taskModel", "parseDate", "", "date", "", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TMSPrerenderModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean autoStart;
    private boolean enable;
    private int shuffleTime = Constants.MAX_VALID_TIME_FOR_REGISTRATION_REQUEST;
    private List<TMSPrerenderTaskModel> tasks = new ArrayList();

    static {
        t2o.a(989855908);
    }

    private final long parseDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78e300c6", new Object[]{this, str})).longValue();
        }
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(str);
        if (parse != null) {
            return parse.getTime();
        }
        return 0L;
    }

    public final boolean getAutoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd243b48", new Object[]{this})).booleanValue();
        }
        return this.autoStart;
    }

    public final boolean getEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f06e884", new Object[]{this})).booleanValue();
        }
        return this.enable;
    }

    public final int getShuffleTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fc71caa", new Object[]{this})).intValue();
        }
        return this.shuffleTime;
    }

    public final List<TMSPrerenderTaskModel> getTasks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("db64ee08", new Object[]{this});
        }
        return this.tasks;
    }

    public final void setAutoStart(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5a481c", new Object[]{this, new Boolean(z)});
        } else {
            this.autoStart = z;
        }
    }

    public final void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public final void setShuffleTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d198238", new Object[]{this, new Integer(i)});
        } else {
            this.shuffleTime = i;
        }
    }

    public final void setTasks(List<TMSPrerenderTaskModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5bf41c4", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.tasks = list;
    }

    public final boolean isMatchCondition(TMSPrerenderTaskModel tMSPrerenderTaskModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbde78c2", new Object[]{this, tMSPrerenderTaskModel})).booleanValue();
        }
        ckf.g(tMSPrerenderTaskModel, "taskModel");
        if (!(tMSPrerenderTaskModel.getStartTime() == null || tMSPrerenderTaskModel.getEndTime() == null || tMSPrerenderTaskModel.getUrl() == null || tMSPrerenderTaskModel.getSpmBVerifyValue() == null || tMSPrerenderTaskModel.getDelayNextTime() == null)) {
            try {
                String startTime = tMSPrerenderTaskModel.getStartTime();
                ckf.d(startTime);
                long parseDate = parseDate(startTime);
                String endTime = tMSPrerenderTaskModel.getEndTime();
                ckf.d(endTime);
                long parseDate2 = parseDate(endTime);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis < parseDate || currentTimeMillis > parseDate2) {
                    lcn.a(RVLLevel.Error, "Themis/Performance/Prerender").j("timeNotMatch").a("url", tMSPrerenderTaskModel.getUrl()).f();
                    return false;
                }
                int i = this.shuffleTime;
                if (i < 0) {
                    return false;
                }
                long j = currentTimeMillis - parseDate;
                if (j >= i || new Random().nextInt(this.shuffleTime + 1) <= j) {
                    List<String> spmBVerifyValue = tMSPrerenderTaskModel.getSpmBVerifyValue();
                    ckf.d(spmBVerifyValue);
                    return !spmBVerifyValue.isEmpty();
                }
                lcn.a(RVLLevel.Error, "Themis/Performance/Prerender").j("由于打散逻辑，导致本次未创建成功").a("url", tMSPrerenderTaskModel.getUrl()).f();
                return false;
            } catch (Exception e) {
                lcn.a(RVLLevel.Error, "Themis/Performance/Prerender").j("executionFailed").a("msg", e.getMessage()).f();
            }
        }
        return false;
    }
}
