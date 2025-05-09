package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hd8 implements tij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.tij
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ccbd16", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.tij
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6756fb47", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.tij
    public long getExperimentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.tij
    public long getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5069a3f", new Object[]{this})).longValue();
        }
        return -1L;
    }

    @Override // tb.tij
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "";
    }

    @Override // tb.r2w
    public Iterator<p2w> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return Collections.emptyList().iterator();
    }
}
