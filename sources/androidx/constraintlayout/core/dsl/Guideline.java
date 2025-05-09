package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.xxl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class Guideline extends Helper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mStart = Integer.MIN_VALUE;
    private int mEnd = Integer.MIN_VALUE;
    private float mPercent = Float.NaN;

    public Guideline(String str) {
        super(str, new Helper.HelperType(""));
    }

    public static /* synthetic */ Object ipc$super(Guideline guideline, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/constraintlayout/core/dsl/Guideline");
    }

    public int getEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddee639f", new Object[]{this})).intValue();
        }
        return this.mEnd;
    }

    public float getPercent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("326e8506", new Object[]{this})).floatValue();
        }
        return this.mPercent;
    }

    public int getStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b926", new Object[]{this})).intValue();
        }
        return this.mStart;
    }

    public void setEnd(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da96e5e3", new Object[]{this, new Integer(i)});
            return;
        }
        this.mEnd = i;
        this.configMap.put("end", String.valueOf(i));
    }

    public void setPercent(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51ab8076", new Object[]{this, new Float(f)});
            return;
        }
        this.mPercent = f;
        this.configMap.put(xxl.PERCENT, String.valueOf(f));
    }

    public void setStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb2e3c", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStart = i;
        this.configMap.put("start", String.valueOf(i));
    }
}
