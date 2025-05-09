package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class h15 extends dy1<h15> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int branch = -1;
    private boolean branchEntry = false;
    private final String code;
    private Map<String, String> dimensions;
    private Map<String, String> indicators;
    private boolean success;
    private String tag;

    static {
        t2o.a(83886303);
    }

    public h15(String str, String str2, String str3, String str4) {
        super(str, str3, str4);
        this.code = str2;
    }

    public static h15 create(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h15) ipChange.ipc$dispatch("81e71395", new Object[]{str, str2}) : new h15(str, str2, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static /* synthetic */ Object ipc$super(h15 h15Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/tracker/model/CustomModel");
    }

    public h15 branch(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("15a4ff8", new Object[]{this, new Integer(i)});
        }
        this.branch = i;
        return this;
    }

    public h15 branchEntry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("9add42bb", new Object[]{this, new Boolean(z)});
        }
        this.branchEntry = z;
        return this;
    }

    public h15 dimension(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("6e672cff", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.dimensions == null) {
                this.dimensions = new HashMap();
            }
            this.dimensions.put(str, str2);
        }
        return this;
    }

    public int getBranch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3ed5c112", new Object[]{this})).intValue();
        }
        return this.branch;
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    public Map<String, String> getDimensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae114b7f", new Object[]{this});
        }
        return this.dimensions;
    }

    public Map<String, String> getIndicators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db918036", new Object[]{this});
        }
        return this.indicators;
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this});
        }
        return this.tag;
    }

    public h15 indicator(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("4a438e28", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.indicators == null) {
                this.indicators = new HashMap();
            }
            this.indicators.put(str, str2);
        }
        return this;
    }

    public boolean isBranchEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("496a5f1", new Object[]{this})).booleanValue();
        }
        return this.branchEntry;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public h15 success(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("41dce208", new Object[]{this, new Boolean(z)});
        }
        this.success = z;
        return this;
    }

    public h15 tag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("a0c4e529", new Object[]{this, str});
        }
        this.tag = str;
        return this;
    }

    public static h15 create(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h15) ipChange.ipc$dispatch("853ce729", new Object[]{str, str2, str3, str4}) : new h15(str, str2, str3, str4);
    }

    @Override // tb.dy1
    public h15 message(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("4e465956", new Object[]{this, str});
        }
        this.message = str;
        return this;
    }

    @Override // tb.dy1
    public h15 sampling(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h15) ipChange.ipc$dispatch("b3ae2190", new Object[]{this, new Float(f)});
        }
        this.sampling = f;
        return this;
    }
}
