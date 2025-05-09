package dt;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import dt.DTExperience;
import java.util.HashMap;
import java.util.Map;
import tb.gr6;
import tb.l65;
import tb.t2o;
import tv.danmaku.ijk.media.player.CommonMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class a extends CommonMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DTOnlyMonitor";
    public String liveSource = "";
    public long tScreenCut;

    static {
        t2o.a(774897998);
    }

    private void commonData(gr6 gr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2182d751", new Object[]{this, gr6Var});
        } else {
            String str = this.mConfigClone.B;
            throw null;
        }
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in dt/DTOnlyMonitor");
    }

    public String appendExperienceParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0bcb825", new Object[]{this, str});
        }
        DTExperience.a a2 = DTExperience.a();
        if (a2 == null) {
            return str;
        }
        String str2 = (str + ",dt_user_swipe_first_frame_time=" + a2.b(this.mConfigClone, this.mRenderTimeFromInnerStart, this.tScreenCut, this.mExtInfo)) + ",host=" + a2.d(this.mPlayUrl);
        HashMap<String, String> a3 = a2.a();
        if (a3 == null || a3.size() <= 0) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str2);
        for (Map.Entry<String, String> entry : a3.entrySet()) {
            sb.append(",");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public long fetchMaxPipeSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ef752178", new Object[]{this, new Long(j)})).longValue();
        }
        DTExperience.a a2 = DTExperience.a();
        if (a2 == null || !a2.c("DynamicDataPacket", "true")) {
            return j;
        }
        return j * 2;
    }

    public String[] filter(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d71fbe8f", new Object[]{this, strArr});
        }
        int i = l65.f23129a;
        return strArr;
    }

    public void noticeDataNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf837a1", new Object[]{this});
        } else {
            int i = l65.f23129a;
        }
    }

    public String filter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9ccbb7", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = l65.f23129a;
        return str;
    }
}
