package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "endTimeMills")
    private long mEndTimeMills;
    @JSONField(name = "stageName")
    private String mStageName;
    @JSONField(name = "startTimeMills")
    private long mStartTimeMills;

    static {
        t2o.a(83886273);
    }

    public fr0(String str, long j, long j2) {
        this.mStageName = str;
        this.mStartTimeMills = j;
        this.mEndTimeMills = j2;
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.mArgs;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f24b4ee0", new Object[]{this})).longValue();
        }
        return this.mEndTimeMills;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f489c0e6", new Object[]{this});
        }
        return this.mStageName;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37534139", new Object[]{this})).longValue();
        }
        return this.mStartTimeMills;
    }

    public void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.mArgs = map;
        }
    }
}
