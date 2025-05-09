package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class do0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = "durationMills")
    private long mDurationMills;
    @JSONField(name = "endTimeMills")
    private long mEndTimeMills;
    @JSONField(name = "stageName")
    private final String mStageName;
    @JSONField(name = "startTimeMills")
    private long mStartTimeMills;

    static {
        t2o.a(301990000);
    }

    public do0(String str, long j) {
        this(str, j, 0L);
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8bb380e8", new Object[]{this})).longValue();
        }
        return this.mDurationMills;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f489c0e6", new Object[]{this});
        }
        return this.mStageName;
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3e39f", new Object[]{this, new Long(j)});
            return;
        }
        this.mEndTimeMills = j;
        this.mDurationMills = j - this.mStartTimeMills;
    }

    public do0(String str, long j, long j2) {
        this.mStageName = str;
        this.mStartTimeMills = j;
        this.mEndTimeMills = j2;
        this.mDurationMills = j2 - j;
    }
}
