package com.taobao.orange.candidate;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class IntCompare extends DefCandidateCompare {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile Integer mClientInt = null;

    static {
        t2o.a(613417060);
    }

    private int getClientInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90d85972", new Object[]{this, str})).intValue();
        }
        if (!this.innerOptimized) {
            return Integer.parseInt(str);
        }
        if (this.mClientInt == null) {
            synchronized (this) {
                try {
                    if (this.mClientInt == null) {
                        this.mClientInt = Integer.valueOf(Integer.parseInt(str));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.mClientInt.intValue();
    }

    public static /* synthetic */ Object ipc$super(IntCompare intCompare, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/orange/candidate/IntCompare");
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) == Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean equalsNot(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ecd44b3", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) != Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean greater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4d1ac19", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) > Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean greaterEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6920a978", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) >= Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean less(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd7e96b8", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) < Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.orange.candidate.DefCandidateCompare, tb.jlb
    public boolean lessEquals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8df4e0d7", new Object[]{this, str, str2})).booleanValue();
        }
        if (getClientInt(str) <= Integer.parseInt(str2)) {
            return true;
        }
        return false;
    }
}
